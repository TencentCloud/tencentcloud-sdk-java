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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySampleRateRequest extends AbstractModel {

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>会话采样率</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * <p>录制采样率</p>
    */
    @SerializedName("ReplaySampleRate")
    @Expose
    private Float ReplaySampleRate;

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>会话采样率</p> 
     * @return SampleRate <p>会话采样率</p>
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>会话采样率</p>
     * @param SampleRate <p>会话采样率</p>
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>录制采样率</p> 
     * @return ReplaySampleRate <p>录制采样率</p>
     */
    public Float getReplaySampleRate() {
        return this.ReplaySampleRate;
    }

    /**
     * Set <p>录制采样率</p>
     * @param ReplaySampleRate <p>录制采样率</p>
     */
    public void setReplaySampleRate(Float ReplaySampleRate) {
        this.ReplaySampleRate = ReplaySampleRate;
    }

    public ModifySampleRateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySampleRateRequest(ModifySampleRateRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Float(source.SampleRate);
        }
        if (source.ReplaySampleRate != null) {
            this.ReplaySampleRate = new Float(source.ReplaySampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ReplaySampleRate", this.ReplaySampleRate);

    }
}

