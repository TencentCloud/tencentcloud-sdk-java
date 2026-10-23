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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentRuntimeSessionConfig extends AbstractModel {

    /**
    * 单实例并发数最大值。取值范围 [1,100]
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * session 来源，三选一：'HEADER', 'COOKIE', 'QUERY_STRING'
    */
    @SerializedName("SessionSource")
    @Expose
    private String SessionSource;

    /**
    * session 名称，以字母开头，非首字母可包含数字、字母、下划线、中划线，长度5-40个字符
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * 最大并发会话数
    */
    @SerializedName("MaximumConcurrencySessionPerInstance")
    @Expose
    private Long MaximumConcurrencySessionPerInstance;

    /**
    * 生命周期
    */
    @SerializedName("MaximumTTLInSeconds")
    @Expose
    private Long MaximumTTLInSeconds;

    /**
    * 空闲时长
    */
    @SerializedName("MaximumIdleTimeInSeconds")
    @Expose
    private Long MaximumIdleTimeInSeconds;

    /**
     * Get 单实例并发数最大值。取值范围 [1,100] 
     * @return MaxConcurrency 单实例并发数最大值。取值范围 [1,100]
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 单实例并发数最大值。取值范围 [1,100]
     * @param MaxConcurrency 单实例并发数最大值。取值范围 [1,100]
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get session 来源，三选一：'HEADER', 'COOKIE', 'QUERY_STRING' 
     * @return SessionSource session 来源，三选一：'HEADER', 'COOKIE', 'QUERY_STRING'
     */
    public String getSessionSource() {
        return this.SessionSource;
    }

    /**
     * Set session 来源，三选一：'HEADER', 'COOKIE', 'QUERY_STRING'
     * @param SessionSource session 来源，三选一：'HEADER', 'COOKIE', 'QUERY_STRING'
     */
    public void setSessionSource(String SessionSource) {
        this.SessionSource = SessionSource;
    }

    /**
     * Get session 名称，以字母开头，非首字母可包含数字、字母、下划线、中划线，长度5-40个字符 
     * @return SessionName session 名称，以字母开头，非首字母可包含数字、字母、下划线、中划线，长度5-40个字符
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set session 名称，以字母开头，非首字母可包含数字、字母、下划线、中划线，长度5-40个字符
     * @param SessionName session 名称，以字母开头，非首字母可包含数字、字母、下划线、中划线，长度5-40个字符
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get 最大并发会话数 
     * @return MaximumConcurrencySessionPerInstance 最大并发会话数
     */
    public Long getMaximumConcurrencySessionPerInstance() {
        return this.MaximumConcurrencySessionPerInstance;
    }

    /**
     * Set 最大并发会话数
     * @param MaximumConcurrencySessionPerInstance 最大并发会话数
     */
    public void setMaximumConcurrencySessionPerInstance(Long MaximumConcurrencySessionPerInstance) {
        this.MaximumConcurrencySessionPerInstance = MaximumConcurrencySessionPerInstance;
    }

    /**
     * Get 生命周期 
     * @return MaximumTTLInSeconds 生命周期
     */
    public Long getMaximumTTLInSeconds() {
        return this.MaximumTTLInSeconds;
    }

    /**
     * Set 生命周期
     * @param MaximumTTLInSeconds 生命周期
     */
    public void setMaximumTTLInSeconds(Long MaximumTTLInSeconds) {
        this.MaximumTTLInSeconds = MaximumTTLInSeconds;
    }

    /**
     * Get 空闲时长 
     * @return MaximumIdleTimeInSeconds 空闲时长
     */
    public Long getMaximumIdleTimeInSeconds() {
        return this.MaximumIdleTimeInSeconds;
    }

    /**
     * Set 空闲时长
     * @param MaximumIdleTimeInSeconds 空闲时长
     */
    public void setMaximumIdleTimeInSeconds(Long MaximumIdleTimeInSeconds) {
        this.MaximumIdleTimeInSeconds = MaximumIdleTimeInSeconds;
    }

    public AgentRuntimeSessionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRuntimeSessionConfig(AgentRuntimeSessionConfig source) {
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.SessionSource != null) {
            this.SessionSource = new String(source.SessionSource);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.MaximumConcurrencySessionPerInstance != null) {
            this.MaximumConcurrencySessionPerInstance = new Long(source.MaximumConcurrencySessionPerInstance);
        }
        if (source.MaximumTTLInSeconds != null) {
            this.MaximumTTLInSeconds = new Long(source.MaximumTTLInSeconds);
        }
        if (source.MaximumIdleTimeInSeconds != null) {
            this.MaximumIdleTimeInSeconds = new Long(source.MaximumIdleTimeInSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "SessionSource", this.SessionSource);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "MaximumConcurrencySessionPerInstance", this.MaximumConcurrencySessionPerInstance);
        this.setParamSimple(map, prefix + "MaximumTTLInSeconds", this.MaximumTTLInSeconds);
        this.setParamSimple(map, prefix + "MaximumIdleTimeInSeconds", this.MaximumIdleTimeInSeconds);

    }
}

