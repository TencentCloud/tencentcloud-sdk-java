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

public class FrequentScanningProtection extends AbstractModel {

    /**
    * 高频扫描防护规则是否开启。取值有：<li>on：开启，高频扫描防护规则生效；</li><li>off：关闭，高频扫描防护规则不生效。</li>	
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 高频扫描防护的处置动作。 当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>JSChallenge：JavaScript 挑战，响应 JavaScript 挑战页面。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * 请求统计的匹配方式，当 Enabled 为 on 时，此字段必填。取值有：<li>http.request.xff_header_ip：客户端 IP（优先匹配 XFF 头部）；</li><li>http.request.ip：客户端 IP。</li> 
    */
    @SerializedName("CountBy")
    @Expose
    private String CountBy;

    /**
    * 此参数指定高频扫描防护的阈值，即在 CountingPeriod 所设置时间范围内命中「配置为拦截」的托管规则时的累计拦截次数，取值范围 1 ~ 4294967294，例如 100，当超过此统计值时，后续请求将触发 Action 所设置的处置动作。当 Enabled 为 on 时，此字段必填。
    */
    @SerializedName("BlockThreshold")
    @Expose
    private Long BlockThreshold;

    /**
    * 此参数指定高频扫描防护所统计的时间窗口，即命中「配置为拦截」的托管规则的请求的统计时间窗口，取值 5 ~ 1800，单位仅支持秒（s），例如 5s。 当 Enabled 为 on 时，此字段必填。
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * 此参数指定高频扫描防护 Action 参数所设置处置动作的持续时长，取值范围 60 ~ 86400，单位仅支持秒（s），例如 60s。当 Enabled 为 on 时，此字段必填。
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
     * Get 高频扫描防护规则是否开启。取值有：<li>on：开启，高频扫描防护规则生效；</li><li>off：关闭，高频扫描防护规则不生效。</li>	 
     * @return Enabled 高频扫描防护规则是否开启。取值有：<li>on：开启，高频扫描防护规则生效；</li><li>off：关闭，高频扫描防护规则不生效。</li>	
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 高频扫描防护规则是否开启。取值有：<li>on：开启，高频扫描防护规则生效；</li><li>off：关闭，高频扫描防护规则不生效。</li>	
     * @param Enabled 高频扫描防护规则是否开启。取值有：<li>on：开启，高频扫描防护规则生效；</li><li>off：关闭，高频扫描防护规则不生效。</li>	
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 高频扫描防护的处置动作。 当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>JSChallenge：JavaScript 挑战，响应 JavaScript 挑战页面。</li> 
     * @return Action 高频扫描防护的处置动作。 当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>JSChallenge：JavaScript 挑战，响应 JavaScript 挑战页面。</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 高频扫描防护的处置动作。 当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>JSChallenge：JavaScript 挑战，响应 JavaScript 挑战页面。</li>
     * @param Action 高频扫描防护的处置动作。 当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>JSChallenge：JavaScript 挑战，响应 JavaScript 挑战页面。</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get 请求统计的匹配方式，当 Enabled 为 on 时，此字段必填。取值有：<li>http.request.xff_header_ip：客户端 IP（优先匹配 XFF 头部）；</li><li>http.request.ip：客户端 IP。</li>  
     * @return CountBy 请求统计的匹配方式，当 Enabled 为 on 时，此字段必填。取值有：<li>http.request.xff_header_ip：客户端 IP（优先匹配 XFF 头部）；</li><li>http.request.ip：客户端 IP。</li> 
     */
    public String getCountBy() {
        return this.CountBy;
    }

    /**
     * Set 请求统计的匹配方式，当 Enabled 为 on 时，此字段必填。取值有：<li>http.request.xff_header_ip：客户端 IP（优先匹配 XFF 头部）；</li><li>http.request.ip：客户端 IP。</li> 
     * @param CountBy 请求统计的匹配方式，当 Enabled 为 on 时，此字段必填。取值有：<li>http.request.xff_header_ip：客户端 IP（优先匹配 XFF 头部）；</li><li>http.request.ip：客户端 IP。</li> 
     */
    public void setCountBy(String CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get 此参数指定高频扫描防护的阈值，即在 CountingPeriod 所设置时间范围内命中「配置为拦截」的托管规则时的累计拦截次数，取值范围 1 ~ 4294967294，例如 100，当超过此统计值时，后续请求将触发 Action 所设置的处置动作。当 Enabled 为 on 时，此字段必填。 
     * @return BlockThreshold 此参数指定高频扫描防护的阈值，即在 CountingPeriod 所设置时间范围内命中「配置为拦截」的托管规则时的累计拦截次数，取值范围 1 ~ 4294967294，例如 100，当超过此统计值时，后续请求将触发 Action 所设置的处置动作。当 Enabled 为 on 时，此字段必填。
     */
    public Long getBlockThreshold() {
        return this.BlockThreshold;
    }

    /**
     * Set 此参数指定高频扫描防护的阈值，即在 CountingPeriod 所设置时间范围内命中「配置为拦截」的托管规则时的累计拦截次数，取值范围 1 ~ 4294967294，例如 100，当超过此统计值时，后续请求将触发 Action 所设置的处置动作。当 Enabled 为 on 时，此字段必填。
     * @param BlockThreshold 此参数指定高频扫描防护的阈值，即在 CountingPeriod 所设置时间范围内命中「配置为拦截」的托管规则时的累计拦截次数，取值范围 1 ~ 4294967294，例如 100，当超过此统计值时，后续请求将触发 Action 所设置的处置动作。当 Enabled 为 on 时，此字段必填。
     */
    public void setBlockThreshold(Long BlockThreshold) {
        this.BlockThreshold = BlockThreshold;
    }

    /**
     * Get 此参数指定高频扫描防护所统计的时间窗口，即命中「配置为拦截」的托管规则的请求的统计时间窗口，取值 5 ~ 1800，单位仅支持秒（s），例如 5s。 当 Enabled 为 on 时，此字段必填。 
     * @return CountingPeriod 此参数指定高频扫描防护所统计的时间窗口，即命中「配置为拦截」的托管规则的请求的统计时间窗口，取值 5 ~ 1800，单位仅支持秒（s），例如 5s。 当 Enabled 为 on 时，此字段必填。
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set 此参数指定高频扫描防护所统计的时间窗口，即命中「配置为拦截」的托管规则的请求的统计时间窗口，取值 5 ~ 1800，单位仅支持秒（s），例如 5s。 当 Enabled 为 on 时，此字段必填。
     * @param CountingPeriod 此参数指定高频扫描防护所统计的时间窗口，即命中「配置为拦截」的托管规则的请求的统计时间窗口，取值 5 ~ 1800，单位仅支持秒（s），例如 5s。 当 Enabled 为 on 时，此字段必填。
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get 此参数指定高频扫描防护 Action 参数所设置处置动作的持续时长，取值范围 60 ~ 86400，单位仅支持秒（s），例如 60s。当 Enabled 为 on 时，此字段必填。 
     * @return ActionDuration 此参数指定高频扫描防护 Action 参数所设置处置动作的持续时长，取值范围 60 ~ 86400，单位仅支持秒（s），例如 60s。当 Enabled 为 on 时，此字段必填。
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set 此参数指定高频扫描防护 Action 参数所设置处置动作的持续时长，取值范围 60 ~ 86400，单位仅支持秒（s），例如 60s。当 Enabled 为 on 时，此字段必填。
     * @param ActionDuration 此参数指定高频扫描防护 Action 参数所设置处置动作的持续时长，取值范围 60 ~ 86400，单位仅支持秒（s），例如 60s。当 Enabled 为 on 时，此字段必填。
     */
    public void setActionDuration(String ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    public FrequentScanningProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrequentScanningProtection(FrequentScanningProtection source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.CountBy != null) {
            this.CountBy = new String(source.CountBy);
        }
        if (source.BlockThreshold != null) {
            this.BlockThreshold = new Long(source.BlockThreshold);
        }
        if (source.CountingPeriod != null) {
            this.CountingPeriod = new String(source.CountingPeriod);
        }
        if (source.ActionDuration != null) {
            this.ActionDuration = new String(source.ActionDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "CountBy", this.CountBy);
        this.setParamSimple(map, prefix + "BlockThreshold", this.BlockThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);

    }
}

