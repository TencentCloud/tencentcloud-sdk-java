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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdsWhiteRule extends AbstractModel {

    /**
    * 策略备注，最多 200 个字符；可省略或传空字符串。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 策略截止时间，北京时间（UTC+8）YYYY-MM-DD HH:MM:SS，必须晚于当前时间；永久有效传 3000-01-01 00:00:00。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 使用 JSON integer 表示生效范围位图，取值 1–31；各项按位相加：1 互联网旁路、2 NAT、4 VPC、8 互联网串行、16 NDR。
例如：12 表示 VPC+互联网串行，31 表示全部范围。
匹配条件支持的范围：
- 源/目的 IP、域名、IPS 规则：支持 1、2、4、8、16 及其组合。
- 威胁情报：固定为 1。
- 资产：使用 4、16 或 20。
- UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5：固定为 16；RuleType=9 同样固定为 16。
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
    * 匹配条件。按 RuleType 填写对应字段，无值字段省略。除 UserAgent 外，同字段多值用逗号分隔；UserAgent 多值用 <#cfw-splite#>。
    */
    @SerializedName("Info")
    @Expose
    private WhiteRuleInfo Info;

    /**
    * 策略名称，填写 1–50 个字符。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get 策略备注，最多 200 个字符；可省略或传空字符串。 
     * @return Comment 策略备注，最多 200 个字符；可省略或传空字符串。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 策略备注，最多 200 个字符；可省略或传空字符串。
     * @param Comment 策略备注，最多 200 个字符；可省略或传空字符串。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 策略截止时间，北京时间（UTC+8）YYYY-MM-DD HH:MM:SS，必须晚于当前时间；永久有效传 3000-01-01 00:00:00。 
     * @return EndTime 策略截止时间，北京时间（UTC+8）YYYY-MM-DD HH:MM:SS，必须晚于当前时间；永久有效传 3000-01-01 00:00:00。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 策略截止时间，北京时间（UTC+8）YYYY-MM-DD HH:MM:SS，必须晚于当前时间；永久有效传 3000-01-01 00:00:00。
     * @param EndTime 策略截止时间，北京时间（UTC+8）YYYY-MM-DD HH:MM:SS，必须晚于当前时间；永久有效传 3000-01-01 00:00:00。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 使用 JSON integer 表示生效范围位图，取值 1–31；各项按位相加：1 互联网旁路、2 NAT、4 VPC、8 互联网串行、16 NDR。
例如：12 表示 VPC+互联网串行，31 表示全部范围。
匹配条件支持的范围：
- 源/目的 IP、域名、IPS 规则：支持 1、2、4、8、16 及其组合。
- 威胁情报：固定为 1。
- 资产：使用 4、16 或 20。
- UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5：固定为 16；RuleType=9 同样固定为 16。 
     * @return FwType 使用 JSON integer 表示生效范围位图，取值 1–31；各项按位相加：1 互联网旁路、2 NAT、4 VPC、8 互联网串行、16 NDR。
例如：12 表示 VPC+互联网串行，31 表示全部范围。
匹配条件支持的范围：
- 源/目的 IP、域名、IPS 规则：支持 1、2、4、8、16 及其组合。
- 威胁情报：固定为 1。
- 资产：使用 4、16 或 20。
- UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5：固定为 16；RuleType=9 同样固定为 16。
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set 使用 JSON integer 表示生效范围位图，取值 1–31；各项按位相加：1 互联网旁路、2 NAT、4 VPC、8 互联网串行、16 NDR。
例如：12 表示 VPC+互联网串行，31 表示全部范围。
匹配条件支持的范围：
- 源/目的 IP、域名、IPS 规则：支持 1、2、4、8、16 及其组合。
- 威胁情报：固定为 1。
- 资产：使用 4、16 或 20。
- UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5：固定为 16；RuleType=9 同样固定为 16。
     * @param FwType 使用 JSON integer 表示生效范围位图，取值 1–31；各项按位相加：1 互联网旁路、2 NAT、4 VPC、8 互联网串行、16 NDR。
例如：12 表示 VPC+互联网串行，31 表示全部范围。
匹配条件支持的范围：
- 源/目的 IP、域名、IPS 规则：支持 1、2、4、8、16 及其组合。
- 威胁情报：固定为 1。
- 资产：使用 4、16 或 20。
- UserAgent、Url、XForwardedFor、HostName、FileName、FileMd5：固定为 16；RuleType=9 同样固定为 16。
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 匹配条件。按 RuleType 填写对应字段，无值字段省略。除 UserAgent 外，同字段多值用逗号分隔；UserAgent 多值用 <#cfw-splite#>。 
     * @return Info 匹配条件。按 RuleType 填写对应字段，无值字段省略。除 UserAgent 外，同字段多值用逗号分隔；UserAgent 多值用 <#cfw-splite#>。
     */
    public WhiteRuleInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 匹配条件。按 RuleType 填写对应字段，无值字段省略。除 UserAgent 外，同字段多值用逗号分隔；UserAgent 多值用 <#cfw-splite#>。
     * @param Info 匹配条件。按 RuleType 填写对应字段，无值字段省略。除 UserAgent 外，同字段多值用逗号分隔；UserAgent 多值用 <#cfw-splite#>。
     */
    public void setInfo(WhiteRuleInfo Info) {
        this.Info = Info;
    }

    /**
     * Get 策略名称，填写 1–50 个字符。 
     * @return RuleName 策略名称，填写 1–50 个字符。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 策略名称，填写 1–50 个字符。
     * @param RuleName 策略名称，填写 1–50 个字符。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public IdsWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdsWhiteRule(IdsWhiteRule source) {
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
        if (source.Info != null) {
            this.Info = new WhiteRuleInfo(source.Info);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

