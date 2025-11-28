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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionConfig extends AbstractModel {

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
    * session 对应的路径信息
    */
    @SerializedName("SessionPath")
    @Expose
    private String SessionPath;

    /**
    * 自动销毁 FATAL、自动暂停PAUSE， 只有启动安全隔离的时候才会有
    */
    @SerializedName("IdleTimeoutStrategy")
    @Expose
    private String IdleTimeoutStrategy;

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

    /**
     * Get session 对应的路径信息 
     * @return SessionPath session 对应的路径信息
     */
    public String getSessionPath() {
        return this.SessionPath;
    }

    /**
     * Set session 对应的路径信息
     * @param SessionPath session 对应的路径信息
     */
    public void setSessionPath(String SessionPath) {
        this.SessionPath = SessionPath;
    }

    /**
     * Get 自动销毁 FATAL、自动暂停PAUSE， 只有启动安全隔离的时候才会有 
     * @return IdleTimeoutStrategy 自动销毁 FATAL、自动暂停PAUSE， 只有启动安全隔离的时候才会有
     */
    public String getIdleTimeoutStrategy() {
        return this.IdleTimeoutStrategy;
    }

    /**
     * Set 自动销毁 FATAL、自动暂停PAUSE， 只有启动安全隔离的时候才会有
     * @param IdleTimeoutStrategy 自动销毁 FATAL、自动暂停PAUSE， 只有启动安全隔离的时候才会有
     */
    public void setIdleTimeoutStrategy(String IdleTimeoutStrategy) {
        this.IdleTimeoutStrategy = IdleTimeoutStrategy;
    }

    public SessionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionConfig(SessionConfig source) {
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
        if (source.SessionPath != null) {
            this.SessionPath = new String(source.SessionPath);
        }
        if (source.IdleTimeoutStrategy != null) {
            this.IdleTimeoutStrategy = new String(source.IdleTimeoutStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionSource", this.SessionSource);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "MaximumConcurrencySessionPerInstance", this.MaximumConcurrencySessionPerInstance);
        this.setParamSimple(map, prefix + "MaximumTTLInSeconds", this.MaximumTTLInSeconds);
        this.setParamSimple(map, prefix + "MaximumIdleTimeInSeconds", this.MaximumIdleTimeInSeconds);
        this.setParamSimple(map, prefix + "SessionPath", this.SessionPath);
        this.setParamSimple(map, prefix + "IdleTimeoutStrategy", this.IdleTimeoutStrategy);

    }
}

