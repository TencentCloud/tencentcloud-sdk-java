/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDealsByCondRequest  extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 一页多少条数据，默认是20条，最大不超过1000
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 第多少页，从0开始，默认是0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 订单状态,默认为4（成功的订单）
订单的状态
1：未支付
2：已支付3：发货中
4：已发货
5：发货失败
6：已退款
7：已关单
8：订单过期
9：订单已失效
10：产品已失效
11：代付拒绝
12：支付中
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * 获取开始时间
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取一页多少条数据，默认是20条，最大不超过1000
     * @return Limit 一页多少条数据，默认是20条，最大不超过1000
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置一页多少条数据，默认是20条，最大不超过1000
     * @param Limit 一页多少条数据，默认是20条，最大不超过1000
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取第多少页，从0开始，默认是0
     * @return Offset 第多少页，从0开始，默认是0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置第多少页，从0开始，默认是0
     * @param Offset 第多少页，从0开始，默认是0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取订单状态,默认为4（成功的订单）
订单的状态
1：未支付
2：已支付3：发货中
4：已发货
5：发货失败
6：已退款
7：已关单
8：订单过期
9：订单已失效
10：产品已失效
11：代付拒绝
12：支付中
     * @return Status 订单状态,默认为4（成功的订单）
订单的状态
1：未支付
2：已支付3：发货中
4：已发货
5：发货失败
6：已退款
7：已关单
8：订单过期
9：订单已失效
10：产品已失效
11：代付拒绝
12：支付中
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置订单状态,默认为4（成功的订单）
订单的状态
1：未支付
2：已支付3：发货中
4：已发货
5：发货失败
6：已退款
7：已关单
8：订单过期
9：订单已失效
10：产品已失效
11：代付拒绝
12：支付中
     * @param Status 订单状态,默认为4（成功的订单）
订单的状态
1：未支付
2：已支付3：发货中
4：已发货
5：发货失败
6：已退款
7：已关单
8：订单过期
9：订单已失效
10：产品已失效
11：代付拒绝
12：支付中
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取订单号
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

