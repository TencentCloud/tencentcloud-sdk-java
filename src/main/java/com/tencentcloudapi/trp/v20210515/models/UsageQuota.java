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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageQuota extends AbstractModel {

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户配额
    */
    @SerializedName("FactoryCnt")
    @Expose
    private Long FactoryCnt;

    /**
    * 商品数量
    */
    @SerializedName("ItemCnt")
    @Expose
    private Long ItemCnt;

    /**
    * 溯源码量
    */
    @SerializedName("TrackCnt")
    @Expose
    private Long TrackCnt;

    /**
    * 营销码额度
    */
    @SerializedName("SaleCnt")
    @Expose
    private Long SaleCnt;

    /**
    * 区块链上链次数
    */
    @SerializedName("ChainCnt")
    @Expose
    private Long ChainCnt;

    /**
    * 风险检测次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * 时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户配额 
     * @return FactoryCnt 商户配额
     */
    public Long getFactoryCnt() {
        return this.FactoryCnt;
    }

    /**
     * Set 商户配额
     * @param FactoryCnt 商户配额
     */
    public void setFactoryCnt(Long FactoryCnt) {
        this.FactoryCnt = FactoryCnt;
    }

    /**
     * Get 商品数量 
     * @return ItemCnt 商品数量
     */
    public Long getItemCnt() {
        return this.ItemCnt;
    }

    /**
     * Set 商品数量
     * @param ItemCnt 商品数量
     */
    public void setItemCnt(Long ItemCnt) {
        this.ItemCnt = ItemCnt;
    }

    /**
     * Get 溯源码量 
     * @return TrackCnt 溯源码量
     */
    public Long getTrackCnt() {
        return this.TrackCnt;
    }

    /**
     * Set 溯源码量
     * @param TrackCnt 溯源码量
     */
    public void setTrackCnt(Long TrackCnt) {
        this.TrackCnt = TrackCnt;
    }

    /**
     * Get 营销码额度 
     * @return SaleCnt 营销码额度
     */
    public Long getSaleCnt() {
        return this.SaleCnt;
    }

    /**
     * Set 营销码额度
     * @param SaleCnt 营销码额度
     */
    public void setSaleCnt(Long SaleCnt) {
        this.SaleCnt = SaleCnt;
    }

    /**
     * Get 区块链上链次数 
     * @return ChainCnt 区块链上链次数
     */
    public Long getChainCnt() {
        return this.ChainCnt;
    }

    /**
     * Set 区块链上链次数
     * @param ChainCnt 区块链上链次数
     */
    public void setChainCnt(Long ChainCnt) {
        this.ChainCnt = ChainCnt;
    }

    /**
     * Get 风险检测次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCnt 风险检测次数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 风险检测次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCnt 风险检测次数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get 时间 
     * @return UpdateTime 时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 时间
     * @param UpdateTime 时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public UsageQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageQuota(UsageQuota source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.FactoryCnt != null) {
            this.FactoryCnt = new Long(source.FactoryCnt);
        }
        if (source.ItemCnt != null) {
            this.ItemCnt = new Long(source.ItemCnt);
        }
        if (source.TrackCnt != null) {
            this.TrackCnt = new Long(source.TrackCnt);
        }
        if (source.SaleCnt != null) {
            this.SaleCnt = new Long(source.SaleCnt);
        }
        if (source.ChainCnt != null) {
            this.ChainCnt = new Long(source.ChainCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "FactoryCnt", this.FactoryCnt);
        this.setParamSimple(map, prefix + "ItemCnt", this.ItemCnt);
        this.setParamSimple(map, prefix + "TrackCnt", this.TrackCnt);
        this.setParamSimple(map, prefix + "SaleCnt", this.SaleCnt);
        this.setParamSimple(map, prefix + "ChainCnt", this.ChainCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

