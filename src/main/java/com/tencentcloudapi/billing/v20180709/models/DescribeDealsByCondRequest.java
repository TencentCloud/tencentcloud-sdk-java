/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDealsByCondRequest extends AbstractModel {

    /**
    * <p>开始时间 2016-01-01 00:00:00</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间 2016-02-01 00:00:00 建议跨度不超过3个月</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>一页多少条数据，默认是20条，最大不超过1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>第多少页，从0开始，默认是0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>订单状态</p><p>枚举值：</p><ul><li>1：  待支付</li><li>2：  已支付</li><li>3：  发货中</li><li>4：  已发货</li><li>5：  发货失败</li><li>6：  已退款</li><li>7：  已取消</li><li>8：  订单过期</li><li>9 ：  订单已失效</li><li>10：  产品已失效</li><li>11：  代付拒绝</li><li>12：  支付中</li><li>13：  退款中</li><li>30：  服务市场订单待用户确认完成</li></ul><p>默认值：4（已发货，成功的订单）</p><p>其中，状态2、3、5、12、13、30 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>统一显示“处理中”；<br>状态4 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中显示交易成功；<br>状态9、10 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中无对应状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>子订单号</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>大订单号</p>
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>订单状态</p>
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
     * Get <p>开始时间 2016-01-01 00:00:00</p> 
     * @return StartTime <p>开始时间 2016-01-01 00:00:00</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 2016-01-01 00:00:00</p>
     * @param StartTime <p>开始时间 2016-01-01 00:00:00</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 2016-02-01 00:00:00 建议跨度不超过3个月</p> 
     * @return EndTime <p>结束时间 2016-02-01 00:00:00 建议跨度不超过3个月</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 2016-02-01 00:00:00 建议跨度不超过3个月</p>
     * @param EndTime <p>结束时间 2016-02-01 00:00:00 建议跨度不超过3个月</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>一页多少条数据，默认是20条，最大不超过1000</p> 
     * @return Limit <p>一页多少条数据，默认是20条，最大不超过1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>一页多少条数据，默认是20条，最大不超过1000</p>
     * @param Limit <p>一页多少条数据，默认是20条，最大不超过1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>第多少页，从0开始，默认是0</p> 
     * @return Offset <p>第多少页，从0开始，默认是0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>第多少页，从0开始，默认是0</p>
     * @param Offset <p>第多少页，从0开始，默认是0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>订单状态</p><p>枚举值：</p><ul><li>1：  待支付</li><li>2：  已支付</li><li>3：  发货中</li><li>4：  已发货</li><li>5：  发货失败</li><li>6：  已退款</li><li>7：  已取消</li><li>8：  订单过期</li><li>9 ：  订单已失效</li><li>10：  产品已失效</li><li>11：  代付拒绝</li><li>12：  支付中</li><li>13：  退款中</li><li>30：  服务市场订单待用户确认完成</li></ul><p>默认值：4（已发货，成功的订单）</p><p>其中，状态2、3、5、12、13、30 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>统一显示“处理中”；<br>状态4 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中显示交易成功；<br>状态9、10 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中无对应状态</p> 
     * @return Status <p>订单状态</p><p>枚举值：</p><ul><li>1：  待支付</li><li>2：  已支付</li><li>3：  发货中</li><li>4：  已发货</li><li>5：  发货失败</li><li>6：  已退款</li><li>7：  已取消</li><li>8：  订单过期</li><li>9 ：  订单已失效</li><li>10：  产品已失效</li><li>11：  代付拒绝</li><li>12：  支付中</li><li>13：  退款中</li><li>30：  服务市场订单待用户确认完成</li></ul><p>默认值：4（已发货，成功的订单）</p><p>其中，状态2、3、5、12、13、30 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>统一显示“处理中”；<br>状态4 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中显示交易成功；<br>状态9、10 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中无对应状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订单状态</p><p>枚举值：</p><ul><li>1：  待支付</li><li>2：  已支付</li><li>3：  发货中</li><li>4：  已发货</li><li>5：  发货失败</li><li>6：  已退款</li><li>7：  已取消</li><li>8：  订单过期</li><li>9 ：  订单已失效</li><li>10：  产品已失效</li><li>11：  代付拒绝</li><li>12：  支付中</li><li>13：  退款中</li><li>30：  服务市场订单待用户确认完成</li></ul><p>默认值：4（已发货，成功的订单）</p><p>其中，状态2、3、5、12、13、30 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>统一显示“处理中”；<br>状态4 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中显示交易成功；<br>状态9、10 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中无对应状态</p>
     * @param Status <p>订单状态</p><p>枚举值：</p><ul><li>1：  待支付</li><li>2：  已支付</li><li>3：  发货中</li><li>4：  已发货</li><li>5：  发货失败</li><li>6：  已退款</li><li>7：  已取消</li><li>8：  订单过期</li><li>9 ：  订单已失效</li><li>10：  产品已失效</li><li>11：  代付拒绝</li><li>12：  支付中</li><li>13：  退款中</li><li>30：  服务市场订单待用户确认完成</li></ul><p>默认值：4（已发货，成功的订单）</p><p>其中，状态2、3、5、12、13、30 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>统一显示“处理中”；<br>状态4 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中显示交易成功；<br>状态9、10 在<a href="https://console.cloud.tencent.com/expense/deal">控制台</a>中无对应状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>子订单号</p> 
     * @return OrderId <p>子订单号</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>子订单号</p>
     * @param OrderId <p>子订单号</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>大订单号</p> 
     * @return BigDealId <p>大订单号</p>
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set <p>大订单号</p>
     * @param BigDealId <p>大订单号</p>
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>订单状态</p> 
     * @return StatusSet <p>订单状态</p>
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set <p>订单状态</p>
     * @param StatusSet <p>订单状态</p>
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    public DescribeDealsByCondRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDealsByCondRequest(DescribeDealsByCondRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.StatusSet != null) {
            this.StatusSet = new Long[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new Long(source.StatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);

    }
}

