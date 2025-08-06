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

public class ManagedRules extends AbstractModel {

    /**
    * 托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li>
    */
    @SerializedName("DetectionOnly")
    @Expose
    private String DetectionOnly;

    /**
    * 托管规则语义分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行语义分析后进行处理；</li><li>off：关闭，对请求不进行语义分析，直接进行处理。</li> <br/>默认为 off。
    */
    @SerializedName("SemanticAnalysis")
    @Expose
    private String SemanticAnalysis;

    /**
    * 托管规则自动更新选项。
    */
    @SerializedName("AutoUpdate")
    @Expose
    private ManagedRuleAutoUpdate AutoUpdate;

    /**
    * 托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。
    */
    @SerializedName("ManagedRuleGroups")
    @Expose
    private ManagedRuleGroup [] ManagedRuleGroups;

    /**
    * 高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。
    */
    @SerializedName("FrequentScanningProtection")
    @Expose
    private FrequentScanningProtection FrequentScanningProtection;

    /**
     * Get 托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li> 
     * @return Enabled 托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li>
     * @param Enabled 托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li> 
     * @return DetectionOnly 评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li>
     */
    public String getDetectionOnly() {
        return this.DetectionOnly;
    }

    /**
     * Set 评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li>
     * @param DetectionOnly 评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li>
     */
    public void setDetectionOnly(String DetectionOnly) {
        this.DetectionOnly = DetectionOnly;
    }

    /**
     * Get 托管规则语义分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行语义分析后进行处理；</li><li>off：关闭，对请求不进行语义分析，直接进行处理。</li> <br/>默认为 off。 
     * @return SemanticAnalysis 托管规则语义分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行语义分析后进行处理；</li><li>off：关闭，对请求不进行语义分析，直接进行处理。</li> <br/>默认为 off。
     */
    public String getSemanticAnalysis() {
        return this.SemanticAnalysis;
    }

    /**
     * Set 托管规则语义分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行语义分析后进行处理；</li><li>off：关闭，对请求不进行语义分析，直接进行处理。</li> <br/>默认为 off。
     * @param SemanticAnalysis 托管规则语义分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行语义分析后进行处理；</li><li>off：关闭，对请求不进行语义分析，直接进行处理。</li> <br/>默认为 off。
     */
    public void setSemanticAnalysis(String SemanticAnalysis) {
        this.SemanticAnalysis = SemanticAnalysis;
    }

    /**
     * Get 托管规则自动更新选项。 
     * @return AutoUpdate 托管规则自动更新选项。
     */
    public ManagedRuleAutoUpdate getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set 托管规则自动更新选项。
     * @param AutoUpdate 托管规则自动更新选项。
     */
    public void setAutoUpdate(ManagedRuleAutoUpdate AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get 托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。 
     * @return ManagedRuleGroups 托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。
     */
    public ManagedRuleGroup [] getManagedRuleGroups() {
        return this.ManagedRuleGroups;
    }

    /**
     * Set 托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。
     * @param ManagedRuleGroups 托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。
     */
    public void setManagedRuleGroups(ManagedRuleGroup [] ManagedRuleGroups) {
        this.ManagedRuleGroups = ManagedRuleGroups;
    }

    /**
     * Get 高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。 
     * @return FrequentScanningProtection 高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。
     */
    public FrequentScanningProtection getFrequentScanningProtection() {
        return this.FrequentScanningProtection;
    }

    /**
     * Set 高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。
     * @param FrequentScanningProtection 高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。
     */
    public void setFrequentScanningProtection(FrequentScanningProtection FrequentScanningProtection) {
        this.FrequentScanningProtection = FrequentScanningProtection;
    }

    public ManagedRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRules(ManagedRules source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.DetectionOnly != null) {
            this.DetectionOnly = new String(source.DetectionOnly);
        }
        if (source.SemanticAnalysis != null) {
            this.SemanticAnalysis = new String(source.SemanticAnalysis);
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new ManagedRuleAutoUpdate(source.AutoUpdate);
        }
        if (source.ManagedRuleGroups != null) {
            this.ManagedRuleGroups = new ManagedRuleGroup[source.ManagedRuleGroups.length];
            for (int i = 0; i < source.ManagedRuleGroups.length; i++) {
                this.ManagedRuleGroups[i] = new ManagedRuleGroup(source.ManagedRuleGroups[i]);
            }
        }
        if (source.FrequentScanningProtection != null) {
            this.FrequentScanningProtection = new FrequentScanningProtection(source.FrequentScanningProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DetectionOnly", this.DetectionOnly);
        this.setParamSimple(map, prefix + "SemanticAnalysis", this.SemanticAnalysis);
        this.setParamObj(map, prefix + "AutoUpdate.", this.AutoUpdate);
        this.setParamArrayObj(map, prefix + "ManagedRuleGroups.", this.ManagedRuleGroups);
        this.setParamObj(map, prefix + "FrequentScanningProtection.", this.FrequentScanningProtection);

    }
}

