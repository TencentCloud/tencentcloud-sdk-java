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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarmupSetting extends AbstractModel{

    /**
    * 是否开启预热
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 预热时间
    */
    @SerializedName("WarmupTime")
    @Expose
    private Long WarmupTime;

    /**
    * 预热曲率，取值 1~5
    */
    @SerializedName("Curvature")
    @Expose
    private Long Curvature;

    /**
    * 是否开启预热保护，在开启保护的情况下，超过 50% 的节点处于预热中，则会中止预热
    */
    @SerializedName("EnabledProtection")
    @Expose
    private Boolean EnabledProtection;

    /**
     * Get 是否开启预热 
     * @return Enabled 是否开启预热
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启预热
     * @param Enabled 是否开启预热
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 预热时间 
     * @return WarmupTime 预热时间
     */
    public Long getWarmupTime() {
        return this.WarmupTime;
    }

    /**
     * Set 预热时间
     * @param WarmupTime 预热时间
     */
    public void setWarmupTime(Long WarmupTime) {
        this.WarmupTime = WarmupTime;
    }

    /**
     * Get 预热曲率，取值 1~5 
     * @return Curvature 预热曲率，取值 1~5
     */
    public Long getCurvature() {
        return this.Curvature;
    }

    /**
     * Set 预热曲率，取值 1~5
     * @param Curvature 预热曲率，取值 1~5
     */
    public void setCurvature(Long Curvature) {
        this.Curvature = Curvature;
    }

    /**
     * Get 是否开启预热保护，在开启保护的情况下，超过 50% 的节点处于预热中，则会中止预热 
     * @return EnabledProtection 是否开启预热保护，在开启保护的情况下，超过 50% 的节点处于预热中，则会中止预热
     */
    public Boolean getEnabledProtection() {
        return this.EnabledProtection;
    }

    /**
     * Set 是否开启预热保护，在开启保护的情况下，超过 50% 的节点处于预热中，则会中止预热
     * @param EnabledProtection 是否开启预热保护，在开启保护的情况下，超过 50% 的节点处于预热中，则会中止预热
     */
    public void setEnabledProtection(Boolean EnabledProtection) {
        this.EnabledProtection = EnabledProtection;
    }

    public WarmupSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarmupSetting(WarmupSetting source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.WarmupTime != null) {
            this.WarmupTime = new Long(source.WarmupTime);
        }
        if (source.Curvature != null) {
            this.Curvature = new Long(source.Curvature);
        }
        if (source.EnabledProtection != null) {
            this.EnabledProtection = new Boolean(source.EnabledProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "WarmupTime", this.WarmupTime);
        this.setParamSimple(map, prefix + "Curvature", this.Curvature);
        this.setParamSimple(map, prefix + "EnabledProtection", this.EnabledProtection);

    }
}

