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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskLastExecuteStatus extends AbstractModel {

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 运行状态，RUNNING/SUCCESS/FAIL/HALF/TERMINATED
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 批次历史ID
    */
    @SerializedName("BatchLogId")
    @Expose
    private String BatchLogId;

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
     * Get 运行状态，RUNNING/SUCCESS/FAIL/HALF/TERMINATED 
     * @return State 运行状态，RUNNING/SUCCESS/FAIL/HALF/TERMINATED
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 运行状态，RUNNING/SUCCESS/FAIL/HALF/TERMINATED
     * @param State 运行状态，RUNNING/SUCCESS/FAIL/HALF/TERMINATED
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 批次历史ID 
     * @return BatchLogId 批次历史ID
     */
    public String getBatchLogId() {
        return this.BatchLogId;
    }

    /**
     * Set 批次历史ID
     * @param BatchLogId 批次历史ID
     */
    public void setBatchLogId(String BatchLogId) {
        this.BatchLogId = BatchLogId;
    }

    public TaskLastExecuteStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLastExecuteStatus(TaskLastExecuteStatus source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.BatchLogId != null) {
            this.BatchLogId = new String(source.BatchLogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "BatchLogId", this.BatchLogId);

    }
}

