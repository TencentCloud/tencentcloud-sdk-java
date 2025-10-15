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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkIdleDetectionConfigInfo extends AbstractModel {

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 用户沉默多少秒后触发空闲回调
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Float TimeoutSeconds;

    /**
    * 最大重试次数（1-3）
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
    * 空闲响应
    */
    @SerializedName("IdleResponses")
    @Expose
    private IdleResponseInfo [] IdleResponses;

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 用户沉默多少秒后触发空闲回调 
     * @return TimeoutSeconds 用户沉默多少秒后触发空闲回调
     */
    public Float getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set 用户沉默多少秒后触发空闲回调
     * @param TimeoutSeconds 用户沉默多少秒后触发空闲回调
     */
    public void setTimeoutSeconds(Float TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get 最大重试次数（1-3） 
     * @return MaxRetries 最大重试次数（1-3）
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set 最大重试次数（1-3）
     * @param MaxRetries 最大重试次数（1-3）
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    /**
     * Get 空闲响应 
     * @return IdleResponses 空闲响应
     */
    public IdleResponseInfo [] getIdleResponses() {
        return this.IdleResponses;
    }

    /**
     * Set 空闲响应
     * @param IdleResponses 空闲响应
     */
    public void setIdleResponses(IdleResponseInfo [] IdleResponses) {
        this.IdleResponses = IdleResponses;
    }

    public TalkIdleDetectionConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkIdleDetectionConfigInfo(TalkIdleDetectionConfigInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Float(source.TimeoutSeconds);
        }
        if (source.MaxRetries != null) {
            this.MaxRetries = new Long(source.MaxRetries);
        }
        if (source.IdleResponses != null) {
            this.IdleResponses = new IdleResponseInfo[source.IdleResponses.length];
            for (int i = 0; i < source.IdleResponses.length; i++) {
                this.IdleResponses[i] = new IdleResponseInfo(source.IdleResponses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "MaxRetries", this.MaxRetries);
        this.setParamArrayObj(map, prefix + "IdleResponses.", this.IdleResponses);

    }
}

