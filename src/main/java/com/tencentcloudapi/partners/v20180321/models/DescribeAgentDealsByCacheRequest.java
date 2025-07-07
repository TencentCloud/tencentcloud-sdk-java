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
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目 最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】
    */
    @SerializedName("CreatTimeRangeStart")
    @Expose
    private String CreatTimeRangeStart;

    /**
    * 下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】
    */
    @SerializedName("CreatTimeRangeEnd")
    @Expose
    private String CreatTimeRangeEnd;

    /**
    * 0:下单时间降序；其他：下单时间升序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)

控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 下单人账号ID列表
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * 子订单号列表
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 大订单号列表
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * 支付方式，0：自付；1：代付
    */
    @SerializedName("PayerMode")
    @Expose
    private Long PayerMode;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 最大200 
     * @return Limit 限制数目 最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目 最大200
     * @param Limit 限制数目 最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】 
     * @return CreatTimeRangeStart 下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】
     */
    public String getCreatTimeRangeStart() {
        return this.CreatTimeRangeStart;
    }

    /**
     * Set 下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】
     * @param CreatTimeRangeStart 下单时间范围起始点【*请必传并控制时间范围最大90天，避免出现超时】
     */
    public void setCreatTimeRangeStart(String CreatTimeRangeStart) {
        this.CreatTimeRangeStart = CreatTimeRangeStart;
    }

    /**
     * Get 下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】 
     * @return CreatTimeRangeEnd 下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】
     */
    public String getCreatTimeRangeEnd() {
        return this.CreatTimeRangeEnd;
    }

    /**
     * Set 下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】
     * @param CreatTimeRangeEnd 下单时间范围终止点【*请必传并控制时间范围最大90天，避免出现超时】
     */
    public void setCreatTimeRangeEnd(String CreatTimeRangeEnd) {
        this.CreatTimeRangeEnd = CreatTimeRangeEnd;
    }

    /**
     * Get 0:下单时间降序；其他：下单时间升序 
     * @return Order 0:下单时间降序；其他：下单时间升序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 0:下单时间降序；其他：下单时间升序
     * @param Order 0:下单时间降序；其他：下单时间升序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)

控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9) 
     * @return Status 子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)

控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)

控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)
     * @param Status 子订单状态(1-待支付,2-已支付,3-发货中,4-已发货,5-发货失败,6-已退款,7-已取消,8-已过期,9-已失效,12-支付中,13-退款中,30-处理中)

控制台订单状态为以上状态的组合：未支付(1) 处理中(2,3,5,12,13,30) 已取消(7) 交易成功(4) 已过期(8) 已退款(6) 订单错误(9)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 下单人账号ID列表 
     * @return OwnerUins 下单人账号ID列表
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set 下单人账号ID列表
     * @param OwnerUins 下单人账号ID列表
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get 子订单号列表 
     * @return DealNames 子订单号列表
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 子订单号列表
     * @param DealNames 子订单号列表
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get 大订单号列表 
     * @return BigDealIds 大订单号列表
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set 大订单号列表
     * @param BigDealIds 大订单号列表
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    /**
     * Get 支付方式，0：自付；1：代付 
     * @return PayerMode 支付方式，0：自付；1：代付
     */
    public Long getPayerMode() {
        return this.PayerMode;
    }

    /**
     * Set 支付方式，0：自付；1：代付
     * @param PayerMode 支付方式，0：自付；1：代付
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

