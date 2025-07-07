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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshSettings extends AbstractModel {

    /**
    * 滚动更新设置参数。RefreshMode 为滚动更新该参数必须填写。
    */
    @SerializedName("RollingUpdateSettings")
    @Expose
    private RollingUpdateSettings RollingUpdateSettings;

    /**
    * 实例后端服务健康状态检查，默认为 FALSE。仅针对绑定应用型负载均衡器的伸缩组生效，开启该检查后，如刷新后实例未通过检查，负载均衡器端口权重始终为 0，且标记为刷新失败。取值范围如下：<li>TRUE：开启检查</li><li>FALSE：不开启检查</li>
    */
    @SerializedName("CheckInstanceTargetHealth")
    @Expose
    private Boolean CheckInstanceTargetHealth;

    /**
     * Get 滚动更新设置参数。RefreshMode 为滚动更新该参数必须填写。 
     * @return RollingUpdateSettings 滚动更新设置参数。RefreshMode 为滚动更新该参数必须填写。
     */
    public RollingUpdateSettings getRollingUpdateSettings() {
        return this.RollingUpdateSettings;
    }

    /**
     * Set 滚动更新设置参数。RefreshMode 为滚动更新该参数必须填写。
     * @param RollingUpdateSettings 滚动更新设置参数。RefreshMode 为滚动更新该参数必须填写。
     */
    public void setRollingUpdateSettings(RollingUpdateSettings RollingUpdateSettings) {
        this.RollingUpdateSettings = RollingUpdateSettings;
    }

    /**
     * Get 实例后端服务健康状态检查，默认为 FALSE。仅针对绑定应用型负载均衡器的伸缩组生效，开启该检查后，如刷新后实例未通过检查，负载均衡器端口权重始终为 0，且标记为刷新失败。取值范围如下：<li>TRUE：开启检查</li><li>FALSE：不开启检查</li> 
     * @return CheckInstanceTargetHealth 实例后端服务健康状态检查，默认为 FALSE。仅针对绑定应用型负载均衡器的伸缩组生效，开启该检查后，如刷新后实例未通过检查，负载均衡器端口权重始终为 0，且标记为刷新失败。取值范围如下：<li>TRUE：开启检查</li><li>FALSE：不开启检查</li>
     */
    public Boolean getCheckInstanceTargetHealth() {
        return this.CheckInstanceTargetHealth;
    }

    /**
     * Set 实例后端服务健康状态检查，默认为 FALSE。仅针对绑定应用型负载均衡器的伸缩组生效，开启该检查后，如刷新后实例未通过检查，负载均衡器端口权重始终为 0，且标记为刷新失败。取值范围如下：<li>TRUE：开启检查</li><li>FALSE：不开启检查</li>
     * @param CheckInstanceTargetHealth 实例后端服务健康状态检查，默认为 FALSE。仅针对绑定应用型负载均衡器的伸缩组生效，开启该检查后，如刷新后实例未通过检查，负载均衡器端口权重始终为 0，且标记为刷新失败。取值范围如下：<li>TRUE：开启检查</li><li>FALSE：不开启检查</li>
     */
    public void setCheckInstanceTargetHealth(Boolean CheckInstanceTargetHealth) {
        this.CheckInstanceTargetHealth = CheckInstanceTargetHealth;
    }

    public RefreshSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshSettings(RefreshSettings source) {
        if (source.RollingUpdateSettings != null) {
            this.RollingUpdateSettings = new RollingUpdateSettings(source.RollingUpdateSettings);
        }
        if (source.CheckInstanceTargetHealth != null) {
            this.CheckInstanceTargetHealth = new Boolean(source.CheckInstanceTargetHealth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RollingUpdateSettings.", this.RollingUpdateSettings);
        this.setParamSimple(map, prefix + "CheckInstanceTargetHealth", this.CheckInstanceTargetHealth);

    }
}

