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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLifecyclePolicyDownloadTaskRequest extends AbstractModel {

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 下载文件的类型，包含 FileSuccessList，FileTotalList，FileFailedList
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 下载文件的类型，包含 FileSuccessList，FileTotalList，FileFailedList 
     * @return Type 下载文件的类型，包含 FileSuccessList，FileTotalList，FileFailedList
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 下载文件的类型，包含 FileSuccessList，FileTotalList，FileFailedList
     * @param Type 下载文件的类型，包含 FileSuccessList，FileTotalList，FileFailedList
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateLifecyclePolicyDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecyclePolicyDownloadTaskRequest(CreateLifecyclePolicyDownloadTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

