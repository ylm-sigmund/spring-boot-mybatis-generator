package com.diy.sigmund.mybatisoracle.util;

import java.util.List;

/**
 * 批处理程序，解决数据库批量操作，参考java.util.function.Consumer
 * 
 * @author ylm-sigmund
 * @since 2020/10/11 20:27
 */
@FunctionalInterface
public interface IBatchProgram<E> {
    int accept(List<E> t);
}
