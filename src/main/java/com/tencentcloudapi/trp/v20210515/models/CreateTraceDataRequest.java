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

public class CreateTraceDataRequest extends AbstractModel{

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
    */
    @SerializedName("Phase")
    @Expose
    private Long Phase;

    /**
    * 溯源阶段名称
    */
    @SerializedName("PhaseName")
    @Expose
    private String PhaseName;

    /**
    * [无效] 上链状态
    */
    @SerializedName("ChainStatus")
    @Expose
    private Long ChainStatus;

    /**
    * [无效] 码类型 0: 批次, 1: 码, 2: 生产任务, 3: 物流信息
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * [无效] 溯源ID
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 溯源信息
    */
    @SerializedName("TraceItems")
    @Expose
    private TraceItem [] TraceItems;

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
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源 
     * @return Phase 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
     */
    public Long getPhase() {
        return this.Phase;
    }

    /**
     * Set 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
     * @param Phase 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
     */
    public void setPhase(Long Phase) {
        this.Phase = Phase;
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
     * Get [无效] 码类型 0: 批次, 1: 码, 2: 生产任务, 3: 物流信息 
     * @return Type [无效] 码类型 0: 批次, 1: 码, 2: 生产任务, 3: 物流信息
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set [无效] 码类型 0: 批次, 1: 码, 2: 生产任务, 3: 物流信息
     * @param Type [无效] 码类型 0: 批次, 1: 码, 2: 生产任务, 3: 物流信息
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get [无效] 溯源ID 
     * @return TraceId [无效] 溯源ID
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set [无效] 溯源ID
     * @param TraceId [无效] 溯源ID
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
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

    public CreateTraceDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTraceDataRequest(CreateTraceDataRequest source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Phase != null) {
            this.Phase = new Long(source.Phase);
        }
        if (source.PhaseName != null) {
            this.PhaseName = new String(source.PhaseName);
        }
        if (source.ChainStatus != null) {
            this.ChainStatus = new Long(source.ChainStatus);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
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
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "PhaseName", this.PhaseName);
        this.setParamSimple(map, prefix + "ChainStatus", this.ChainStatus);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArrayObj(map, prefix + "TraceItems.", this.TraceItems);

    }
}

