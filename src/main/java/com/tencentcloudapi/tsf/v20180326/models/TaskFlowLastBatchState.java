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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowLastBatchState extends AbstractModel {

    /**
    * 批次ID
    */
    @SerializedName("FlowBatchId")
    @Expose
    private String FlowBatchId;

    /**
    * 批次历史ID
    */
    @SerializedName("FlowBatchLogId")
    @Expose
    private String FlowBatchLogId;

    /**
    * 状态,WAITING/SUCCESS/FAILED/RUNNING/TERMINATING
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get 批次ID 
     * @return FlowBatchId 批次ID
     */
    public String getFlowBatchId() {
        return this.FlowBatchId;
    }

    /**
     * Set 批次ID
     * @param FlowBatchId 批次ID
     */
    public void setFlowBatchId(String FlowBatchId) {
        this.FlowBatchId = FlowBatchId;
    }

    /**
     * Get 批次历史ID 
     * @return FlowBatchLogId 批次历史ID
     */
    public String getFlowBatchLogId() {
        return this.FlowBatchLogId;
    }

    /**
     * Set 批次历史ID
     * @param FlowBatchLogId 批次历史ID
     */
    public void setFlowBatchLogId(String FlowBatchLogId) {
        this.FlowBatchLogId = FlowBatchLogId;
    }

    /**
     * Get 状态,WAITING/SUCCESS/FAILED/RUNNING/TERMINATING 
     * @return State 状态,WAITING/SUCCESS/FAILED/RUNNING/TERMINATING
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态,WAITING/SUCCESS/FAILED/RUNNING/TERMINATING
     * @param State 状态,WAITING/SUCCESS/FAILED/RUNNING/TERMINATING
     */
    public void setState(String State) {
        this.State = State;
    }

    public TaskFlowLastBatchState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowLastBatchState(TaskFlowLastBatchState source) {
        if (source.FlowBatchId != null) {
            this.FlowBatchId = new String(source.FlowBatchId);
        }
        if (source.FlowBatchLogId != null) {
            this.FlowBatchLogId = new String(source.FlowBatchLogId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowBatchId", this.FlowBatchId);
        this.setParamSimple(map, prefix + "FlowBatchLogId", this.FlowBatchLogId);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

