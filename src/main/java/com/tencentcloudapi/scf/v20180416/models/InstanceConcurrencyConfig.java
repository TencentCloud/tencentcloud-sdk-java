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

public class InstanceConcurrencyConfig extends AbstractModel {

    /**
    * 是否开启智能动态并发。'FALSE'时是静态并发。''时取消多并发配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DynamicEnabled")
    @Expose
    private String DynamicEnabled;

    /**
    * 单实例并发数最大值。取值范围 [1,100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 安全隔离开关
    */
    @SerializedName("InstanceIsolationEnabled")
    @Expose
    private String InstanceIsolationEnabled;

    /**
    * 基于会话：Session-Based ， 或者基于请求：Request-Based，二选一
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 动态并发参数
    */
    @SerializedName("MixNodeConfig")
    @Expose
    private MixNodeConfig [] MixNodeConfig;

    /**
    * 会话配置参数
    */
    @SerializedName("SessionConfig")
    @Expose
    private SessionConfig SessionConfig;

    /**
     * Get 是否开启智能动态并发。'FALSE'时是静态并发。''时取消多并发配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DynamicEnabled 是否开启智能动态并发。'FALSE'时是静态并发。''时取消多并发配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDynamicEnabled() {
        return this.DynamicEnabled;
    }

    /**
     * Set 是否开启智能动态并发。'FALSE'时是静态并发。''时取消多并发配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DynamicEnabled 是否开启智能动态并发。'FALSE'时是静态并发。''时取消多并发配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamicEnabled(String DynamicEnabled) {
        this.DynamicEnabled = DynamicEnabled;
    }

    /**
     * Get 单实例并发数最大值。取值范围 [1,100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConcurrency 单实例并发数最大值。取值范围 [1,100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 单实例并发数最大值。取值范围 [1,100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConcurrency 单实例并发数最大值。取值范围 [1,100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 安全隔离开关 
     * @return InstanceIsolationEnabled 安全隔离开关
     */
    public String getInstanceIsolationEnabled() {
        return this.InstanceIsolationEnabled;
    }

    /**
     * Set 安全隔离开关
     * @param InstanceIsolationEnabled 安全隔离开关
     */
    public void setInstanceIsolationEnabled(String InstanceIsolationEnabled) {
        this.InstanceIsolationEnabled = InstanceIsolationEnabled;
    }

    /**
     * Get 基于会话：Session-Based ， 或者基于请求：Request-Based，二选一 
     * @return Type 基于会话：Session-Based ， 或者基于请求：Request-Based，二选一
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 基于会话：Session-Based ， 或者基于请求：Request-Based，二选一
     * @param Type 基于会话：Session-Based ， 或者基于请求：Request-Based，二选一
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 动态并发参数 
     * @return MixNodeConfig 动态并发参数
     */
    public MixNodeConfig [] getMixNodeConfig() {
        return this.MixNodeConfig;
    }

    /**
     * Set 动态并发参数
     * @param MixNodeConfig 动态并发参数
     */
    public void setMixNodeConfig(MixNodeConfig [] MixNodeConfig) {
        this.MixNodeConfig = MixNodeConfig;
    }

    /**
     * Get 会话配置参数 
     * @return SessionConfig 会话配置参数
     */
    public SessionConfig getSessionConfig() {
        return this.SessionConfig;
    }

    /**
     * Set 会话配置参数
     * @param SessionConfig 会话配置参数
     */
    public void setSessionConfig(SessionConfig SessionConfig) {
        this.SessionConfig = SessionConfig;
    }

    public InstanceConcurrencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConcurrencyConfig(InstanceConcurrencyConfig source) {
        if (source.DynamicEnabled != null) {
            this.DynamicEnabled = new String(source.DynamicEnabled);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.InstanceIsolationEnabled != null) {
            this.InstanceIsolationEnabled = new String(source.InstanceIsolationEnabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MixNodeConfig != null) {
            this.MixNodeConfig = new MixNodeConfig[source.MixNodeConfig.length];
            for (int i = 0; i < source.MixNodeConfig.length; i++) {
                this.MixNodeConfig[i] = new MixNodeConfig(source.MixNodeConfig[i]);
            }
        }
        if (source.SessionConfig != null) {
            this.SessionConfig = new SessionConfig(source.SessionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DynamicEnabled", this.DynamicEnabled);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "InstanceIsolationEnabled", this.InstanceIsolationEnabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "MixNodeConfig.", this.MixNodeConfig);
        this.setParamObj(map, prefix + "SessionConfig.", this.SessionConfig);

    }
}

