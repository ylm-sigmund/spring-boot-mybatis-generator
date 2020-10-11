package com.diy.sigmund.mybatisoracle.util;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.util.CollectionUtils;

/**
 * @author ylm-sigmund
 * @since 2020/10/11 20:31
 */
public class BatchProgram {
    public static final int FIFTY = 50;
    public static final int HUNDRED = 100;

    /**
     * 自定义函数式接口IBatchProgram
     */
    public static <E> int process(List<E> list, IBatchProgram<E> batchProgram, int batchSize) {
        if (CollectionUtils.isEmpty(list)) {
            return 0;
        }
        batchSize = batchSize <= 0 ? 1 : batchSize;
        final int listSize = list.size();
        final int batchNum = listSize % batchSize == 0 ? listSize / batchSize : listSize / batchSize + 1;
        final int finalBatchNum = batchNum - 1;
        int processNum = 0;
        int resultNum = 0;
        do {
            final List<E> subList = list.subList(processNum * batchSize,
                processNum == finalBatchNum ? listSize : (processNum + 1) * batchSize);
            resultNum += batchProgram.accept(subList);
            processNum++;
        } while (processNum <= finalBatchNum);
        return resultNum;
    }

    /**
     * 不需要声明接口，直接使用Consumer
     * 
     */
    public static <T> void accept(List<T> list, Consumer<List<T>> function, int batchSize) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        batchSize = batchSize <= 0 ? 1 : batchSize;
        final int listSize = list.size();
        final int batchNum = listSize % batchSize == 0 ? listSize / batchSize : listSize / batchSize + 1;
        final int finalBatchNum = batchNum - 1;
        int processNum = 0;
        do {
            final List<T> subList = list.subList(processNum * batchSize,
                processNum == finalBatchNum ? listSize : (processNum + 1) * batchSize);
            function.accept(subList);
            processNum++;
        } while (processNum <= finalBatchNum);
    }

    /**
     * 不需要声明接口，直接使用Function
     *
     */
    public static <T> int apply(List<T> list, Function<List<T>, Integer> function, int batchSize) {
        if (CollectionUtils.isEmpty(list)) {
            return 0;
        }
        batchSize = batchSize <= 0 ? 1 : batchSize;
        final int listSize = list.size();
        final int batchNum = listSize % batchSize == 0 ? listSize / batchSize : listSize / batchSize + 1;
        final int finalBatchNum = batchNum - 1;
        int processNum = 0;
        int resultNum = 0;
        do {
            final List<T> subList = list.subList(processNum * batchSize,
                processNum == finalBatchNum ? listSize : (processNum + 1) * batchSize);
            resultNum += function.apply(subList);
            processNum++;
        } while (processNum <= finalBatchNum);
        return resultNum;
    }
}