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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentDealsByCacheRequest extends AbstractModel {

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制数目 最大200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】</p>
    */
    @SerializedName("CreatTimeRangeStart")
    @Expose
    private String CreatTimeRangeStart;

    /**
    * <p>下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】</p>
    */
    @SerializedName("CreatTimeRangeEnd")
    @Expose
    private String CreatTimeRangeEnd;

    /**
    * <p>0:下单时间降序；其他：下单时间升序</p>
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * <p>子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)</p><p>控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>下单人账号ID列表</p>
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * <p>子订单号列表</p>
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * <p>大订单号列表</p>
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * <p>支付方式，0：自付；1：代付</p>
    */
    @SerializedName("PayerMode")
    @Expose
    private Long PayerMode;

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制数目 最大200</p> 
     * @return Limit <p>限制数目 最大200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目 最大200</p>
     * @param Limit <p>限制数目 最大200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】</p> 
     * @return CreatTimeRangeStart <p>下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】</p>
     */
    public String getCreatTimeRangeStart() {
        return this.CreatTimeRangeStart;
    }

    /**
     * Set <p>下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】</p>
     * @param CreatTimeRangeStart <p>下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】</p>
     */
    public void setCreatTimeRangeStart(String CreatTimeRangeStart) {
        this.CreatTimeRangeStart = CreatTimeRangeStart;
    }

    /**
     * Get <p>下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】</p> 
     * @return CreatTimeRangeEnd <p>下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】</p>
     */
    public String getCreatTimeRangeEnd() {
        return this.CreatTimeRangeEnd;
    }

    /**
     * Set <p>下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】</p>
     * @param CreatTimeRangeEnd <p>下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】</p>
     */
    public void setCreatTimeRangeEnd(String CreatTimeRangeEnd) {
        this.CreatTimeRangeEnd = CreatTimeRangeEnd;
    }

    /**
     * Get <p>0:下单时间降序；其他：下单时间升序</p> 
     * @return Order <p>0:下单时间降序；其他：下单时间升序</p>
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>0:下单时间降序；其他：下单时间升序</p>
     * @param Order <p>0:下单时间降序；其他：下单时间升序</p>
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get <p>子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)</p><p>控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)</p> 
     * @return Status <p>子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)</p><p>控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)</p><p>控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)</p>
     * @param Status <p>子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)</p><p>控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>下单人账号ID列表</p> 
     * @return OwnerUins <p>下单人账号ID列表</p>
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set <p>下单人账号ID列表</p>
     * @param OwnerUins <p>下单人账号ID列表</p>
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get <p>子订单号列表</p> 
     * @return DealNames <p>子订单号列表</p>
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set <p>子订单号列表</p>
     * @param DealNames <p>子订单号列表</p>
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get <p>大订单号列表</p> 
     * @return BigDealIds <p>大订单号列表</p>
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set <p>大订单号列表</p>
     * @param BigDealIds <p>大订单号列表</p>
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    /**
     * Get <p>支付方式，0：自付；1：代付</p> 
     * @return PayerMode <p>支付方式，0：自付；1：代付</p>
     */
    public Long getPayerMode() {
        return this.PayerMode;
    }

    /**
     * Set <p>支付方式，0：自付；1：代付</p>
     * @param PayerMode <p>支付方式，0：自付；1：代付</p>
     */
    public void setPayerMode(Long PayerMode) {
        this.PayerMode = PayerMode;
    }

    public DescribeAgentDealsByCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentDealsByCacheRequest(DescribeAgentDealsByCacheRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreatTimeRangeStart != null) {
            this.CreatTimeRangeStart = new String(source.CreatTimeRangeStart);
        }
        if (source.CreatTimeRangeEnd != null) {
            this.CreatTimeRangeEnd = new String(source.CreatTimeRangeEnd);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
            }
        }
        if (source.PayerMode != null) {
            this.PayerMode = new Long(source.PayerMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreatTimeRangeStart", this.CreatTimeRangeStart);
        this.setParamSimple(map, prefix + "CreatTimeRangeEnd", this.CreatTimeRangeEnd);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamSimple(map, prefix + "PayerMode", this.PayerMode);

    }
}

