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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceData extends AbstractModel {

    /**
    * 溯源ID
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 码类型 0: 批次, 1: 码, 2: 生产任务
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 码值，跟码类型一一对应
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 排序，在Phase相同情况下，值越小排名靠前
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * 溯源阶段 0:商品 1:通用 2:生产溯源 3:销售溯源
    */
    @SerializedName("Phase")
    @Expose
    private Long Phase;

    /**
    * 溯源环节名称
    */
    @SerializedName("PhaseName")
    @Expose
    private String PhaseName;

    /**
    * 溯源时间
    */
    @SerializedName("TraceTime")
    @Expose
    private String TraceTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
    */
    @SerializedName("ChainStatus")
    @Expose
    private Long ChainStatus;

    /**
    * 上链时间
    */
    @SerializedName("ChainTime")
    @Expose
    private String ChainTime;

    /**
    * 上链数据
    */
    @SerializedName("ChainData")
    @Expose
    private ChainData ChainData;

    /**
    * 溯源阶段配置
    */
    @SerializedName("PhaseData")
    @Expose
    private PhaseData PhaseData;

    /**
    * 溯源阶段状态 0: 无效, 1: 有效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 无
    */
    @SerializedName("TraceItems")
    @Expose
    private TraceItem [] TraceItems;

    /**
     * Get 溯源ID 
     * @return TraceId 溯源ID
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set 溯源ID
     * @param TraceId 溯源ID
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

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
     * Get 码类型 0: 批次, 1: 码, 2: 生产任务 
     * @return Type 码类型 0: 批次, 1: 码, 2: 生产任务
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 码类型 0: 批次, 1: 码, 2: 生产任务
     * @param Type 码类型 0: 批次, 1: 码, 2: 生产任务
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 码值，跟码类型一一对应 
     * @return Code 码值，跟码类型一一对应
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 码值，跟码类型一一对应
     * @param Code 码值，跟码类型一一对应
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 排序，在Phase相同情况下，值越小排名靠前 
     * @return Rank 排序，在Phase相同情况下，值越小排名靠前
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 排序，在Phase相同情况下，值越小排名靠前
     * @param Rank 排序，在Phase相同情况下，值越小排名靠前
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get 溯源阶段 0:商品 1:通用 2:生产溯源 3:销售溯源 
     * @return Phase 溯源阶段 0:商品 1:通用 2:生产溯源 3:销售溯源
     */
    public Long getPhase() {
        return this.Phase;
    }

    /**
     * Set 溯源阶段 0:商品 1:通用 2:生产溯源 3:销售溯源
     * @param Phase 溯源阶段 0:商品 1:通用 2:生产溯源 3:销售溯源
     */
    public void setPhase(Long Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 溯源环节名称 
     * @return PhaseName 溯源环节名称
     */
    public String getPhaseName() {
        return this.PhaseName;
    }

    /**
     * Set 溯源环节名称
     * @param PhaseName 溯源环节名称
     */
    public void setPhaseName(String PhaseName) {
        this.PhaseName = PhaseName;
    }

    /**
     * Get 溯源时间 
     * @return TraceTime 溯源时间
     */
    public String getTraceTime() {
        return this.TraceTime;
    }

    /**
     * Set 溯源时间
     * @param TraceTime 溯源时间
     */
    public void setTraceTime(String TraceTime) {
        this.TraceTime = TraceTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常 
     * @return ChainStatus 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
     */
    public Long getChainStatus() {
        return this.ChainStatus;
    }

    /**
     * Set 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
     * @param ChainStatus 上链状态 0: 未上链 1: 上链中 2: 已上链 -1: 异常
     */
    public void setChainStatus(Long ChainStatus) {
        this.ChainStatus = ChainStatus;
    }

    /**
     * Get 上链时间 
     * @return ChainTime 上链时间
     */
    public String getChainTime() {
        return this.ChainTime;
    }

    /**
     * Set 上链时间
     * @param ChainTime 上链时间
     */
    public void setChainTime(String ChainTime) {
        this.ChainTime = ChainTime;
    }

    /**
     * Get 上链数据 
     * @return ChainData 上链数据
     */
    public ChainData getChainData() {
        return this.ChainData;
    }

    /**
     * Set 上链数据
     * @param ChainData 上链数据
     */
    public void setChainData(ChainData ChainData) {
        this.ChainData = ChainData;
    }

    /**
     * Get 溯源阶段配置 
     * @return PhaseData 溯源阶段配置
     */
    public PhaseData getPhaseData() {
        return this.PhaseData;
    }

    /**
     * Set 溯源阶段配置
     * @param PhaseData 溯源阶段配置
     */
    public void setPhaseData(PhaseData PhaseData) {
        this.PhaseData = PhaseData;
    }

    /**
     * Get 溯源阶段状态 0: 无效, 1: 有效 
     * @return Status 溯源阶段状态 0: 无效, 1: 有效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 溯源阶段状态 0: 无效, 1: 有效
     * @param Status 溯源阶段状态 0: 无效, 1: 有效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 无 
     * @return TraceItems 无
     */
    public TraceItem [] getTraceItems() {
        return this.TraceItems;
    }

    /**
     * Set 无
     * @param TraceItems 无
     */
    public void setTraceItems(TraceItem [] TraceItems) {
        this.TraceItems = TraceItems;
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
        if (source.PhaseData != null) {
            this.PhaseData = new PhaseData(source.PhaseData);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TraceItems != null) {
            this.TraceItems = new TraceItem[source.TraceItems.length];
            for (int i = 0; i < source.TraceItems.length; i++) {
                this.TraceItems[i] = new TraceItem(source.TraceItems[i]);
            }
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChainStatus", this.ChainStatus);
        this.setParamSimple(map, prefix + "ChainTime", this.ChainTime);
        this.setParamObj(map, prefix + "ChainData.", this.ChainData);
        this.setParamObj(map, prefix + "PhaseData.", this.PhaseData);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TraceItems.", this.TraceItems);

    }
}

