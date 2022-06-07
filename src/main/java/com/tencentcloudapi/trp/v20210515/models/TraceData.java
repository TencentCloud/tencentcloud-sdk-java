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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceData extends AbstractModel{

    /**
    * 溯源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 企业ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * 溯源阶段 0:商品 1:通用 2:物流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phase")
    @Expose
    private Long Phase;

    /**
    * 环节名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhaseName")
    @Expose
    private String PhaseName;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceTime")
    @Expose
    private String TraceTime;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceItems")
    @Expose
    private TraceItem [] TraceItems;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChainStatus")
    @Expose
    private Long ChainStatus;

    /**
    * 上链时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChainTime")
    @Expose
    private String ChainTime;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChainData")
    @Expose
    private ChainData ChainData;

    /**
     * Get 溯源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceId 溯源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set 溯源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceId 溯源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get 企业ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId 企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rank 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rank 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get 溯源阶段 0:商品 1:通用 2:物流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phase 溯源阶段 0:商品 1:通用 2:物流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhase() {
        return this.Phase;
    }

    /**
     * Set 溯源阶段 0:商品 1:通用 2:物流
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phase 溯源阶段 0:商品 1:通用 2:物流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhase(Long Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 环节名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhaseName 环节名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhaseName() {
        return this.PhaseName;
    }

    /**
     * Set 环节名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhaseName 环节名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhaseName(String PhaseName) {
        this.PhaseName = PhaseName;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTraceTime() {
        return this.TraceTime;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceTime(String TraceTime) {
        this.TraceTime = TraceTime;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceItems 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TraceItem [] getTraceItems() {
        return this.TraceItems;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceItems 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceItems(TraceItem [] TraceItems) {
        this.TraceItems = TraceItems;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChainStatus 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChainStatus() {
        return this.ChainStatus;
    }

    /**
     * Set 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChainStatus 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChainStatus(Long ChainStatus) {
        this.ChainStatus = ChainStatus;
    }

    /**
     * Get 上链时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChainTime 上链时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChainTime() {
        return this.ChainTime;
    }

    /**
     * Set 上链时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChainTime 上链时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChainTime(String ChainTime) {
        this.ChainTime = ChainTime;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChainData 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChainData getChainData() {
        return this.ChainData;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChainData 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChainData(ChainData ChainData) {
        this.ChainData = ChainData;
    }

    public TraceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceData(TraceData source) {
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
        if (source.Phase != null) {
            this.Phase = new Long(source.Phase);
        }
        if (source.PhaseName != null) {
            this.PhaseName = new String(source.PhaseName);
        }
        if (source.TraceTime != null) {
            this.TraceTime = new String(source.TraceTime);
        }
        if (source.TraceItems != null) {
            this.TraceItems = new TraceItem[source.TraceItems.length];
            for (int i = 0; i < source.TraceItems.length; i++) {
                this.TraceItems[i] = new TraceItem(source.TraceItems[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ChainStatus != null) {
            this.ChainStatus = new Long(source.ChainStatus);
        }
        if (source.ChainTime != null) {
            this.ChainTime = new String(source.ChainTime);
        }
        if (source.ChainData != null) {
            this.ChainData = new ChainData(source.ChainData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "PhaseName", this.PhaseName);
        this.setParamSimple(map, prefix + "TraceTime", this.TraceTime);
        this.setParamArrayObj(map, prefix + "TraceItems.", this.TraceItems);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChainStatus", this.ChainStatus);
        this.setParamSimple(map, prefix + "ChainTime", this.ChainTime);
        this.setParamObj(map, prefix + "ChainData.", this.ChainData);

    }
}

