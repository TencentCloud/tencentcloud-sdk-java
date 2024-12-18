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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVRSVoiceTypeInfoRequest extends AbstractModel {

    /**
    * 音色id。
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 0 - 除快速声音复刻外其他复刻类型（默认）； 5 - 快速声音复刻。 默认为0。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 快速复刻音色id。
    */
    @SerializedName("FastVoiceType")
    @Expose
    private String FastVoiceType;

    /**
     * Get 音色id。 
     * @return VoiceType 音色id。
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色id。
     * @param VoiceType 音色id。
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 0 - 除快速声音复刻外其他复刻类型（默认）； 5 - 快速声音复刻。 默认为0。 
     * @return TaskType 0 - 除快速声音复刻外其他复刻类型（默认）； 5 - 快速声音复刻。 默认为0。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 0 - 除快速声音复刻外其他复刻类型（默认）； 5 - 快速声音复刻。 默认为0。
     * @param TaskType 0 - 除快速声音复刻外其他复刻类型（默认）； 5 - 快速声音复刻。 默认为0。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 快速复刻音色id。 
     * @return FastVoiceType 快速复刻音色id。
     */
    public String getFastVoiceType() {
        return this.FastVoiceType;
    }

    /**
     * Set 快速复刻音色id。
     * @param FastVoiceType 快速复刻音色id。
     */
    public void setFastVoiceType(String FastVoiceType) {
        this.FastVoiceType = FastVoiceType;
    }

    public GetVRSVoiceTypeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVRSVoiceTypeInfoRequest(GetVRSVoiceTypeInfoRequest source) {
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.FastVoiceType != null) {
            this.FastVoiceType = new String(source.FastVoiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "FastVoiceType", this.FastVoiceType);

    }
}

