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

public class ModifyTraceDataRequest extends AbstractModel{

    /**
    * 溯源ID
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 生产溯源任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 溯源信息
    */
    @SerializedName("TraceItems")
    @Expose
    private TraceItem [] TraceItems;

    /**
    * 溯源阶段名称
    */
    @SerializedName("PhaseName")
    @Expose
    private String PhaseName;

    /**
    * [无效] 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * [无效] 溯源码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * [无效] 排序
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * [无效] 溯源阶段 0:商品 1:通用 2:物流
    */
    @SerializedName("Phase")
    @Expose
    private Long Phase;

    /**
    * [无效] 溯源时间
    */
    @SerializedName("TraceTime")
    @Expose
    private String TraceTime;

    /**
    * [无效] 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * [无效] 上链状态
    */
    @SerializedName("ChainStatus")
    @Expose
    private Long ChainStatus;

    /**
    * [无效] 上链时间
    */
    @SerializedName("ChainTime")
    @Expose
    private String ChainTime;

    /**
    * [无效] 上链数据
    */
    @SerializedName("ChainData")
    @Expose
    private ChainData ChainData;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * [无效] 溯源状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 生产溯源任务ID 
     * @return TaskId 生产溯源任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 生产溯源任务ID
     * @param TaskId 生产溯源任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 溯源信息 
     * @return TraceItems 溯源信息
     */
    public TraceItem [] getTraceItems() {
        return this.TraceItems;
    }

    /**
     * Set 溯源信息
     * @param TraceItems 溯源信息
     */
    public void setTraceItems(TraceItem [] TraceItems) {
        this.TraceItems = TraceItems;
    }

    /**
     * Get 溯源阶段名称 
     * @return PhaseName 溯源阶段名称
     */
    public String getPhaseName() {
        return this.PhaseName;
    }

    /**
     * Set 溯源阶段名称
     * @param PhaseName 溯源阶段名称
     */
    public void setPhaseName(String PhaseName) {
        this.PhaseName = PhaseName;
    }

    /**
     * Get [无效] 类型 
     * @return Type [无效] 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set [无效] 类型
     * @param Type [无效] 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get [无效] 溯源码 
     * @return Code [无效] 溯源码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set [无效] 溯源码
     * @param Code [无效] 溯源码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get [无效] 排序 
     * @return Rank [无效] 排序
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set [无效] 排序
     * @param Rank [无效] 排序
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get [无效] 溯源阶段 0:商品 1:通用 2:物流 
     * @return Phase [无效] 溯源阶段 0:商品 1:通用 2:物流
     */
    public Long getPhase() {
        return this.Phase;
    }

    /**
     * Set [无效] 溯源阶段 0:商品 1:通用 2:物流
     * @param Phase [无效] 溯源阶段 0:商品 1:通用 2:物流
     */
    public void setPhase(Long Phase) {
        this.Phase = Phase;
    }

    /**
     * Get [无效] 溯源时间 
     * @return TraceTime [无效] 溯源时间
     */
    public String getTraceTime() {
        return this.TraceTime;
    }

    /**
     * Set [无效] 溯源时间
     * @param TraceTime [无效] 溯源时间
     */
    public void setTraceTime(String TraceTime) {
        this.TraceTime = TraceTime;
    }

    /**
     * Get [无效] 创建时间 
     * @return CreateTime [无效] 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set [无效] 创建时间
     * @param CreateTime [无效] 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get [无效] 上链状态 
     * @return ChainStatus [无效] 上链状态
     */
    public Long getChainStatus() {
        return this.ChainStatus;
    }

    /**
     * Set [无效] 上链状态
     * @param ChainStatus [无效] 上链状态
     */
    public void setChainStatus(Long ChainStatus) {
        this.ChainStatus = ChainStatus;
    }

    /**
     * Get [无效] 上链时间 
     * @return ChainTime [无效] 上链时间
     */
    public String getChainTime() {
        return this.ChainTime;
    }

    /**
     * Set [无效] 上链时间
     * @param ChainTime [无效] 上链时间
     */
    public void setChainTime(String ChainTime) {
        this.ChainTime = ChainTime;
    }

    /**
     * Get [无效] 上链数据 
     * @return ChainData [无效] 上链数据
     */
    public ChainData getChainData() {
        return this.ChainData;
    }

    /**
     * Set [无效] 上链数据
     * @param ChainData [无效] 上链数据
     */
    public void setChainData(ChainData ChainData) {
        this.ChainData = ChainData;
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
     * Get [无效] 溯源状态 
     * @return Status [无效] 溯源状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set [无效] 溯源状态
     * @param Status [无效] 溯源状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyTraceDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTraceDataRequest(ModifyTraceDataRequest source) {
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TraceItems != null) {
            this.TraceItems = new TraceItem[source.TraceItems.length];
            for (int i = 0; i < source.TraceItems.length; i++) {
                this.TraceItems[i] = new TraceItem(source.TraceItems[i]);
            }
        }
        if (source.PhaseName != null) {
            this.PhaseName = new String(source.PhaseName);
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
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "TraceItems.", this.TraceItems);
        this.setParamSimple(map, prefix + "PhaseName", this.PhaseName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "TraceTime", this.TraceTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChainStatus", this.ChainStatus);
        this.setParamSimple(map, prefix + "ChainTime", this.ChainTime);
        this.setParamObj(map, prefix + "ChainData.", this.ChainData);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

