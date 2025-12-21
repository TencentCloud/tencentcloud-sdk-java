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

public class DescribeAgentSelfPayDealsV2Request extends AbstractModel {

    /**
    * <p>下单人账号ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制数目 最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>下单时间范围起始点(不传时会默认查最近15天内订单，传值时需要传最近15天内的起始时间)</p>
    */
    @SerializedName("CreatTimeRangeStart")
    @Expose
    private String CreatTimeRangeStart;

    /**
    * <p>下单时间范围终止点</p>
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
    * <p>订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get <p>下单人账号ID</p> 
     * @return OwnerUin <p>下单人账号ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>下单人账号ID</p>
     * @param OwnerUin <p>下单人账号ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

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
     * Get <p>限制数目 最大100</p> 
     * @return Limit <p>限制数目 最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目 最大100</p>
     * @param Limit <p>限制数目 最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>下单时间范围起始点(不传时会默认查最近15天内订单，传值时需要传最近15天内的起始时间)</p> 
     * @return CreatTimeRangeStart <p>下单时间范围起始点(不传时会默认查最近15天内订单，传值时需要传最近15天内的起始时间)</p>
     */
    public String getCreatTimeRangeStart() {
        return this.CreatTimeRangeStart;
    }

    /**
     * Set <p>下单时间范围起始点(不传时会默认查最近15天内订单，传值时需要传最近15天内的起始时间)</p>
     * @param CreatTimeRangeStart <p>下单时间范围起始点(不传时会默认查最近15天内订单，传值时需要传最近15天内的起始时间)</p>
     */
    public void setCreatTimeRangeStart(String CreatTimeRangeStart) {
        this.CreatTimeRangeStart = CreatTimeRangeStart;
    }

    /**
     * Get <p>下单时间范围终止点</p> 
     * @return CreatTimeRangeEnd <p>下单时间范围终止点</p>
     */
    public String getCreatTimeRangeEnd() {
        return this.CreatTimeRangeEnd;
    }

    /**
     * Set <p>下单时间范围终止点</p>
     * @param CreatTimeRangeEnd <p>下单时间范围终止点</p>
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
     * Get <p>订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)</p> 
     * @return Status <p>订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)</p>
     * @param Status <p>订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeAgentSelfPayDealsV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentSelfPayDealsV2Request(DescribeAgentSelfPayDealsV2Request source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreatTimeRangeStart", this.CreatTimeRangeStart);
        this.setParamSimple(map, prefix + "CreatTimeRangeEnd", this.CreatTimeRangeEnd);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);

    }
}

