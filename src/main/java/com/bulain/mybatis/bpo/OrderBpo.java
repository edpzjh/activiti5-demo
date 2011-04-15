package com.bulain.mybatis.bpo;

import java.util.Map;

import com.bulain.mybatis.model.Order;

public interface OrderBpo {
    Order claim(String taskId, String userId);
    void complete(Order order, String taskId, Map<String, Object> variables);
}
