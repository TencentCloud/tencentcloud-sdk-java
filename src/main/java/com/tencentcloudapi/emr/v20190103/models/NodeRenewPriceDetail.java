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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRenewPriceDetail extends AbstractModel {

    /**
    * 计费类型，包月为1、包销为3
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * emr资源id
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点内网ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 当前到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 原价
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 折扣价
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
    * 节点子项续费询价明细列表
    */
    @SerializedName("RenewPriceDetails")
    @Expose
    private RenewPriceDetail [] RenewPriceDetails;

    /**
     * Get 计费类型，包月为1、包销为3 
     * @return ChargeType 计费类型，包月为1、包销为3
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型，包月为1、包销为3
     * @param ChargeType 计费类型，包月为1、包销为3
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get emr资源id 
     * @return EmrResourceId emr资源id
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set emr资源id
     * @param EmrResourceId emr资源id
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点内网ip 
     * @return Ip 节点内网ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 节点内网ip
     * @param Ip 节点内网ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 当前到期时间 
     * @return ExpireTime 当前到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 当前到期时间
     * @param ExpireTime 当前到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 原价 
     * @return OriginalCost 原价
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 原价
     * @param OriginalCost 原价
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价 
     * @return DiscountCost 折扣价
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价
     * @param DiscountCost 折扣价
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get 节点子项续费询价明细列表 
     * @return RenewPriceDetails 节点子项续费询价明细列表
     */
    public RenewPriceDetail [] getRenewPriceDetails() {
        return this.RenewPriceDetails;
    }

    /**
     * Set 节点子项续费询价明细列表
     * @param RenewPriceDetails 节点子项续费询价明细列表
     */
    public void setRenewPriceDetails(RenewPriceDetail [] RenewPriceDetails) {
        this.RenewPriceDetails = RenewPriceDetails;
    }

    public NodeRenewPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRenewPriceDetail(NodeRenewPriceDetail source) {
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.EmrResourceId != null) {
            this.EmrResourceId = new String(source.EmrResourceId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
        if (source.RenewPriceDetails != null) {
            this.RenewPriceDetails = new RenewPriceDetail[source.RenewPriceDetails.length];
            for (int i = 0; i < source.RenewPriceDetails.length; i++) {
                this.RenewPriceDetails[i] = new RenewPriceDetail(source.RenewPriceDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EmrResourceId", this.EmrResourceId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamArrayObj(map, prefix + "RenewPriceDetails.", this.RenewPriceDetails);

    }
}

