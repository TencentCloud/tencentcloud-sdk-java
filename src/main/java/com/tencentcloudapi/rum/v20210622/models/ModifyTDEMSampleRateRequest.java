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

public class ModifyTDEMSampleRateRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>采集采样率 0-100（必填）</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * <p>会话回放采样率 0-100（可选）</p>
    */
    @SerializedName("ReplaySampleRate")
    @Expose
    private Float ReplaySampleRate;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>采集采样率 0-100（必填）</p> 
     * @return SampleRate <p>采集采样率 0-100（必填）</p>
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>采集采样率 0-100（必填）</p>
     * @param SampleRate <p>采集采样率 0-100（必填）</p>
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>会话回放采样率 0-100（可选）</p> 
     * @return ReplaySampleRate <p>会话回放采样率 0-100（可选）</p>
     */
    public Float getReplaySampleRate() {
        return this.ReplaySampleRate;
    }

    /**
     * Set <p>会话回放采样率 0-100（可选）</p>
     * @param ReplaySampleRate <p>会话回放采样率 0-100（可选）</p>
     */
    public void setReplaySampleRate(Float ReplaySampleRate) {
        this.ReplaySampleRate = ReplaySampleRate;
    }

    public ModifyTDEMSampleRateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTDEMSampleRateRequest(ModifyTDEMSampleRateRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ReplaySampleRate", this.ReplaySampleRate);

    }
}

