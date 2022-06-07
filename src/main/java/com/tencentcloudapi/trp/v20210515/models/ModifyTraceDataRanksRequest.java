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

public class ModifyTraceDataRanksRequest extends AbstractModel{

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
    * 生产任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 溯源ID
    */
    @SerializedName("TraceIds")
    @Expose
    private String [] TraceIds;

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
     * Get 生产任务ID 
     * @return TaskId 生产任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 生产任务ID
     * @param TaskId 生产任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 溯源ID 
     * @return TraceIds 溯源ID
     */
    public String [] getTraceIds() {
        return this.TraceIds;
    }

    /**
     * Set 溯源ID
     * @param TraceIds 溯源ID
     */
    public void setTraceIds(String [] TraceIds) {
        this.TraceIds = TraceIds;
    }

    public ModifyTraceDataRanksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTraceDataRanksRequest(ModifyTraceDataRanksRequest source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TraceIds != null) {
            this.TraceIds = new String[source.TraceIds.length];
            for (int i = 0; i < source.TraceIds.length; i++) {
                this.TraceIds[i] = new String(source.TraceIds[i]);
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
        this.setParamArraySimple(map, prefix + "TraceIds.", this.TraceIds);

    }
}

