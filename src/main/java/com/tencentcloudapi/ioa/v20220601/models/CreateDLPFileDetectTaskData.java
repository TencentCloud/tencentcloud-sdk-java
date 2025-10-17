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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDLPFileDetectTaskData extends AbstractModel {

    /**
    * 任务请求唯一Id
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String [] TaskRequestId;

    /**
     * Get 任务请求唯一Id 
     * @return TaskRequestId 任务请求唯一Id
     */
    public String [] getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set 任务请求唯一Id
     * @param TaskRequestId 任务请求唯一Id
     */
    public void setTaskRequestId(String [] TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    public CreateDLPFileDetectTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDLPFileDetectTaskData(CreateDLPFileDetectTaskData source) {
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String[source.TaskRequestId.length];
            for (int i = 0; i < source.TaskRequestId.length; i++) {
                this.TaskRequestId[i] = new String(source.TaskRequestId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskRequestId.", this.TaskRequestId);

    }
}

