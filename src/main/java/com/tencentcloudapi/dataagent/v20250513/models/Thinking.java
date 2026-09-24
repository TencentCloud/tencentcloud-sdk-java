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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Thinking extends AbstractModel {

    /**
    * <p>模式</p><p>枚举值：</p><ul><li>toggle： 可开关</li><li>always_on： 固定开启</li><li>always_off： 固定关闭</li><li>unconfigured： 未配置</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>默认是否开启思考</p>
    */
    @SerializedName("DefaultEnabled")
    @Expose
    private Boolean DefaultEnabled;

    /**
    * <p>思考强度可选项，如 [&quot;high&quot;,&quot;max&quot;]</p>
    */
    @SerializedName("EffortOptions")
    @Expose
    private String [] EffortOptions;

    /**
    * <p>默认思考强度</p>
    */
    @SerializedName("DefaultEffort")
    @Expose
    private String DefaultEffort;

    /**
     * Get <p>模式</p><p>枚举值：</p><ul><li>toggle： 可开关</li><li>always_on： 固定开启</li><li>always_off： 固定关闭</li><li>unconfigured： 未配置</li></ul> 
     * @return Mode <p>模式</p><p>枚举值：</p><ul><li>toggle： 可开关</li><li>always_on： 固定开启</li><li>always_off： 固定关闭</li><li>unconfigured： 未配置</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>模式</p><p>枚举值：</p><ul><li>toggle： 可开关</li><li>always_on： 固定开启</li><li>always_off： 固定关闭</li><li>unconfigured： 未配置</li></ul>
     * @param Mode <p>模式</p><p>枚举值：</p><ul><li>toggle： 可开关</li><li>always_on： 固定开启</li><li>always_off： 固定关闭</li><li>unconfigured： 未配置</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>默认是否开启思考</p> 
     * @return DefaultEnabled <p>默认是否开启思考</p>
     */
    public Boolean getDefaultEnabled() {
        return this.DefaultEnabled;
    }

    /**
     * Set <p>默认是否开启思考</p>
     * @param DefaultEnabled <p>默认是否开启思考</p>
     */
    public void setDefaultEnabled(Boolean DefaultEnabled) {
        this.DefaultEnabled = DefaultEnabled;
    }

    /**
     * Get <p>思考强度可选项，如 [&quot;high&quot;,&quot;max&quot;]</p> 
     * @return EffortOptions <p>思考强度可选项，如 [&quot;high&quot;,&quot;max&quot;]</p>
     */
    public String [] getEffortOptions() {
        return this.EffortOptions;
    }

    /**
     * Set <p>思考强度可选项，如 [&quot;high&quot;,&quot;max&quot;]</p>
     * @param EffortOptions <p>思考强度可选项，如 [&quot;high&quot;,&quot;max&quot;]</p>
     */
    public void setEffortOptions(String [] EffortOptions) {
        this.EffortOptions = EffortOptions;
    }

    /**
     * Get <p>默认思考强度</p> 
     * @return DefaultEffort <p>默认思考强度</p>
     */
    public String getDefaultEffort() {
        return this.DefaultEffort;
    }

    /**
     * Set <p>默认思考强度</p>
     * @param DefaultEffort <p>默认思考强度</p>
     */
    public void setDefaultEffort(String DefaultEffort) {
        this.DefaultEffort = DefaultEffort;
    }

    public Thinking() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Thinking(Thinking source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.DefaultEnabled != null) {
            this.DefaultEnabled = new Boolean(source.DefaultEnabled);
        }
        if (source.EffortOptions != null) {
            this.EffortOptions = new String[source.EffortOptions.length];
            for (int i = 0; i < source.EffortOptions.length; i++) {
                this.EffortOptions[i] = new String(source.EffortOptions[i]);
            }
        }
        if (source.DefaultEffort != null) {
            this.DefaultEffort = new String(source.DefaultEffort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "DefaultEnabled", this.DefaultEnabled);
        this.setParamArraySimple(map, prefix + "EffortOptions.", this.EffortOptions);
        this.setParamSimple(map, prefix + "DefaultEffort", this.DefaultEffort);

    }
}

