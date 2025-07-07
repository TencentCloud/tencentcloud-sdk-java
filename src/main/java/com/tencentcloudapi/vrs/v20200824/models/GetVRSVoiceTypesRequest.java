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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVRSVoiceTypesRequest extends AbstractModel {

    /**
    * 复刻类型。
0 - 除快速声音复刻外其他复刻类型（默认）；
5 - 一句话声音复刻。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 复刻类型。
0 - 除快速声音复刻外其他复刻类型（默认）；
5 - 一句话声音复刻。 
     * @return TaskType 复刻类型。
0 - 除快速声音复刻外其他复刻类型（默认）；
5 - 一句话声音复刻。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 复刻类型。
0 - 除快速声音复刻外其他复刻类型（默认）；
5 - 一句话声音复刻。
     * @param TaskType 复刻类型。
0 - 除快速声音复刻外其他复刻类型（默认）；
5 - 一句话声音复刻。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public GetVRSVoiceTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVRSVoiceTypesRequest(GetVRSVoiceTypesRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

