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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceAffinityConfig extends AbstractModel {

    /**
    * <p>推理服务亲和总开关。</p><p>枚举值：</p><ul><li>On： 开启推理服务亲和；</li><li>Off： 关闭推理服务亲和。</li></ul>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>推理服务亲和方式。</p><p>枚举值：</p><ul><li>SessionId： 根据会话 ID 实现亲和。</li></ul><p>默认值：SessionId。</p>
    */
    @SerializedName("AffinityMode")
    @Expose
    private String AffinityMode;

    /**
    * <p>推理服务亲和性配置。当 AffinityMode 为 SessionId 时必填。</p>
    */
    @SerializedName("SessionIdAffinityConfig")
    @Expose
    private SessionIdAffinityConfig SessionIdAffinityConfig;

    /**
     * Get <p>推理服务亲和总开关。</p><p>枚举值：</p><ul><li>On： 开启推理服务亲和；</li><li>Off： 关闭推理服务亲和。</li></ul> 
     * @return Switch <p>推理服务亲和总开关。</p><p>枚举值：</p><ul><li>On： 开启推理服务亲和；</li><li>Off： 关闭推理服务亲和。</li></ul>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>推理服务亲和总开关。</p><p>枚举值：</p><ul><li>On： 开启推理服务亲和；</li><li>Off： 关闭推理服务亲和。</li></ul>
     * @param Switch <p>推理服务亲和总开关。</p><p>枚举值：</p><ul><li>On： 开启推理服务亲和；</li><li>Off： 关闭推理服务亲和。</li></ul>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>推理服务亲和方式。</p><p>枚举值：</p><ul><li>SessionId： 根据会话 ID 实现亲和。</li></ul><p>默认值：SessionId。</p> 
     * @return AffinityMode <p>推理服务亲和方式。</p><p>枚举值：</p><ul><li>SessionId： 根据会话 ID 实现亲和。</li></ul><p>默认值：SessionId。</p>
     */
    public String getAffinityMode() {
        return this.AffinityMode;
    }

    /**
     * Set <p>推理服务亲和方式。</p><p>枚举值：</p><ul><li>SessionId： 根据会话 ID 实现亲和。</li></ul><p>默认值：SessionId。</p>
     * @param AffinityMode <p>推理服务亲和方式。</p><p>枚举值：</p><ul><li>SessionId： 根据会话 ID 实现亲和。</li></ul><p>默认值：SessionId。</p>
     */
    public void setAffinityMode(String AffinityMode) {
        this.AffinityMode = AffinityMode;
    }

    /**
     * Get <p>推理服务亲和性配置。当 AffinityMode 为 SessionId 时必填。</p> 
     * @return SessionIdAffinityConfig <p>推理服务亲和性配置。当 AffinityMode 为 SessionId 时必填。</p>
     */
    public SessionIdAffinityConfig getSessionIdAffinityConfig() {
        return this.SessionIdAffinityConfig;
    }

    /**
     * Set <p>推理服务亲和性配置。当 AffinityMode 为 SessionId 时必填。</p>
     * @param SessionIdAffinityConfig <p>推理服务亲和性配置。当 AffinityMode 为 SessionId 时必填。</p>
     */
    public void setSessionIdAffinityConfig(SessionIdAffinityConfig SessionIdAffinityConfig) {
        this.SessionIdAffinityConfig = SessionIdAffinityConfig;
    }

    public InferenceAffinityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceAffinityConfig(InferenceAffinityConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AffinityMode != null) {
            this.AffinityMode = new String(source.AffinityMode);
        }
        if (source.SessionIdAffinityConfig != null) {
            this.SessionIdAffinityConfig = new SessionIdAffinityConfig(source.SessionIdAffinityConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AffinityMode", this.AffinityMode);
        this.setParamObj(map, prefix + "SessionIdAffinityConfig.", this.SessionIdAffinityConfig);

    }
}

