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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutonomyUserProfileInfo extends AbstractModel {

    /**
    * 是否开启自治。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 用户Uin。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 内存上限。
    */
    @SerializedName("MemoryUpperLimit")
    @Expose
    private Long MemoryUpperLimit;

    /**
    * 指标阈值规则。
    */
    @SerializedName("ThresholdRule")
    @Expose
    private MetricThreshold ThresholdRule;

    /**
    * 自治功能类型。
    */
    @SerializedName("EnabledItems")
    @Expose
    private String [] EnabledItems;

    /**
     * Get 是否开启自治。 
     * @return Enabled 是否开启自治。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启自治。
     * @param Enabled 是否开启自治。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 用户Uin。 
     * @return Uin 用户Uin。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin。
     * @param Uin 用户Uin。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 内存上限。 
     * @return MemoryUpperLimit 内存上限。
     */
    public Long getMemoryUpperLimit() {
        return this.MemoryUpperLimit;
    }

    /**
     * Set 内存上限。
     * @param MemoryUpperLimit 内存上限。
     */
    public void setMemoryUpperLimit(Long MemoryUpperLimit) {
        this.MemoryUpperLimit = MemoryUpperLimit;
    }

    /**
     * Get 指标阈值规则。 
     * @return ThresholdRule 指标阈值规则。
     */
    public MetricThreshold getThresholdRule() {
        return this.ThresholdRule;
    }

    /**
     * Set 指标阈值规则。
     * @param ThresholdRule 指标阈值规则。
     */
    public void setThresholdRule(MetricThreshold ThresholdRule) {
        this.ThresholdRule = ThresholdRule;
    }

    /**
     * Get 自治功能类型。 
     * @return EnabledItems 自治功能类型。
     */
    public String [] getEnabledItems() {
        return this.EnabledItems;
    }

    /**
     * Set 自治功能类型。
     * @param EnabledItems 自治功能类型。
     */
    public void setEnabledItems(String [] EnabledItems) {
        this.EnabledItems = EnabledItems;
    }

    public AutonomyUserProfileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutonomyUserProfileInfo(AutonomyUserProfileInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.MemoryUpperLimit != null) {
            this.MemoryUpperLimit = new Long(source.MemoryUpperLimit);
        }
        if (source.ThresholdRule != null) {
            this.ThresholdRule = new MetricThreshold(source.ThresholdRule);
        }
        if (source.EnabledItems != null) {
            this.EnabledItems = new String[source.EnabledItems.length];
            for (int i = 0; i < source.EnabledItems.length; i++) {
                this.EnabledItems[i] = new String(source.EnabledItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "MemoryUpperLimit", this.MemoryUpperLimit);
        this.setParamObj(map, prefix + "ThresholdRule.", this.ThresholdRule);
        this.setParamArraySimple(map, prefix + "EnabledItems.", this.EnabledItems);

    }
}

