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
    * <p>托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li></p>
    */
    @SerializedName("DetectionOnly")
    @Expose
    private String DetectionOnly;

    /**
    * <p>托管规则深度分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行深度分析后进行处理；</li><li>off：关闭，对请求不进行深度分析，直接进行处理。</li> <br>此参数待废弃，深度分析规则开关迁移至 SemanticAnalysisRules.Enabled 参数。</p>
    */
    @SerializedName("SemanticAnalysis")
    @Expose
    private String SemanticAnalysis;

    /**
    * <p>深度分析配置选项，识别请求中的恶意行为（如：SQL 注入，XSS 攻击等），对恶意请求进行日志记录和拦截。</p>
    */
    @SerializedName("SemanticAnalysisRules")
    @Expose
    private SemanticAnalysisRules SemanticAnalysisRules;

    /**
    * <p>托管规则自动更新选项。</p>
    */
    @SerializedName("AutoUpdate")
    @Expose
    private ManagedRuleAutoUpdate AutoUpdate;

    /**
    * <p>托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。</p>
    */
    @SerializedName("ManagedRuleGroups")
    @Expose
    private ManagedRuleGroup [] ManagedRuleGroups;

    /**
    * <p>高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。</p>
    */
    @SerializedName("FrequentScanningProtection")
    @Expose
    private FrequentScanningProtection FrequentScanningProtection;

    /**
     * Get <p>托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li></p> 
     * @return Enabled <p>托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li></p>
     * @param Enabled <p>托管规则是否开启。取值有：<li>on：开启，所有托管规则按配置生效；</li><li>off：关闭，所有托管规则不生效。</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li></p> 
     * @return DetectionOnly <p>评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li></p>
     */
    public String getDetectionOnly() {
        return this.DetectionOnly;
    }

    /**
     * Set <p>评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li></p>
     * @param DetectionOnly <p>评估模式是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，表示所有托管规则以观察模式生效；</li><li>off：关闭，表示所有托管规则以实际配置生效。</li></p>
     */
    public void setDetectionOnly(String DetectionOnly) {
        this.DetectionOnly = DetectionOnly;
    }

    /**
     * Get <p>托管规则深度分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行深度分析后进行处理；</li><li>off：关闭，对请求不进行深度分析，直接进行处理。</li> <br>此参数待废弃，深度分析规则开关迁移至 SemanticAnalysisRules.Enabled 参数。</p> 
     * @return SemanticAnalysis <p>托管规则深度分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行深度分析后进行处理；</li><li>off：关闭，对请求不进行深度分析，直接进行处理。</li> <br>此参数待废弃，深度分析规则开关迁移至 SemanticAnalysisRules.Enabled 参数。</p>
     */
    public String getSemanticAnalysis() {
        return this.SemanticAnalysis;
    }

    /**
     * Set <p>托管规则深度分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行深度分析后进行处理；</li><li>off：关闭，对请求不进行深度分析，直接进行处理。</li> <br>此参数待废弃，深度分析规则开关迁移至 SemanticAnalysisRules.Enabled 参数。</p>
     * @param SemanticAnalysis <p>托管规则深度分析选项是否开启，仅在 Enabled 参数为 on 时有效。取值有：<li>on：开启，对请求进行深度分析后进行处理；</li><li>off：关闭，对请求不进行深度分析，直接进行处理。</li> <br>此参数待废弃，深度分析规则开关迁移至 SemanticAnalysisRules.Enabled 参数。</p>
     */
    public void setSemanticAnalysis(String SemanticAnalysis) {
        this.SemanticAnalysis = SemanticAnalysis;
    }

    /**
     * Get <p>深度分析配置选项，识别请求中的恶意行为（如：SQL 注入，XSS 攻击等），对恶意请求进行日志记录和拦截。</p> 
     * @return SemanticAnalysisRules <p>深度分析配置选项，识别请求中的恶意行为（如：SQL 注入，XSS 攻击等），对恶意请求进行日志记录和拦截。</p>
     */
    public SemanticAnalysisRules getSemanticAnalysisRules() {
        return this.SemanticAnalysisRules;
    }

    /**
     * Set <p>深度分析配置选项，识别请求中的恶意行为（如：SQL 注入，XSS 攻击等），对恶意请求进行日志记录和拦截。</p>
     * @param SemanticAnalysisRules <p>深度分析配置选项，识别请求中的恶意行为（如：SQL 注入，XSS 攻击等），对恶意请求进行日志记录和拦截。</p>
     */
    public void setSemanticAnalysisRules(SemanticAnalysisRules SemanticAnalysisRules) {
        this.SemanticAnalysisRules = SemanticAnalysisRules;
    }

    /**
     * Get <p>托管规则自动更新选项。</p> 
     * @return AutoUpdate <p>托管规则自动更新选项。</p>
     */
    public ManagedRuleAutoUpdate getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set <p>托管规则自动更新选项。</p>
     * @param AutoUpdate <p>托管规则自动更新选项。</p>
     */
    public void setAutoUpdate(ManagedRuleAutoUpdate AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get <p>托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。</p> 
     * @return ManagedRuleGroups <p>托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。</p>
     */
    public ManagedRuleGroup [] getManagedRuleGroups() {
        return this.ManagedRuleGroups;
    }

    /**
     * Set <p>托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。</p>
     * @param ManagedRuleGroups <p>托管规则组的配置。如果此结构传空数组或 GroupId 未包含在列表内将按照默认方式处理。</p>
     */
    public void setManagedRuleGroups(ManagedRuleGroup [] ManagedRuleGroups) {
        this.ManagedRuleGroups = ManagedRuleGroups;
    }

    /**
     * Get <p>高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。</p> 
     * @return FrequentScanningProtection <p>高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。</p>
     */
    public FrequentScanningProtection getFrequentScanningProtection() {
        return this.FrequentScanningProtection;
    }

    /**
     * Set <p>高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。</p>
     * @param FrequentScanningProtection <p>高频扫描防护配置选项，当某一访客的请求频繁命中「配置为拦截」的托管规则时，在一段时间内封禁该访客所有请求。</p>
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
        if (source.SemanticAnalysisRules != null) {
            this.SemanticAnalysisRules = new SemanticAnalysisRules(source.SemanticAnalysisRules);
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
        this.setParamObj(map, prefix + "SemanticAnalysisRules.", this.SemanticAnalysisRules);
        this.setParamObj(map, prefix + "AutoUpdate.", this.AutoUpdate);
        this.setParamArrayObj(map, prefix + "ManagedRuleGroups.", this.ManagedRuleGroups);
        this.setParamObj(map, prefix + "FrequentScanningProtection.", this.FrequentScanningProtection);

    }
}

