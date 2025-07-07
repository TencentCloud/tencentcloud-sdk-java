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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryCOSRules extends AbstractModel {

    /**
    * 规则状态；0 不启用, 1 启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * regex规则内容
    */
    @SerializedName("RegexRule")
    @Expose
    private DspaDiscoveryCOSDataRule RegexRule;

    /**
    * 关键词规则内容组，最大支持5个关键词。
    */
    @SerializedName("KeywordRule")
    @Expose
    private DspaDiscoveryCOSDataRule KeywordRule;

    /**
    * 忽略词规则内容组，最大支持5个忽略词。
    */
    @SerializedName("IgnoreStringRule")
    @Expose
    private DspaDiscoveryCOSDataRule IgnoreStringRule;

    /**
    * 最大匹配距离，默认值为100。上限为500.
    */
    @SerializedName("MaxMatch")
    @Expose
    private Long MaxMatch;

    /**
     * Get 规则状态；0 不启用, 1 启用 
     * @return Status 规则状态；0 不启用, 1 启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态；0 不启用, 1 启用
     * @param Status 规则状态；0 不启用, 1 启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get regex规则内容 
     * @return RegexRule regex规则内容
     */
    public DspaDiscoveryCOSDataRule getRegexRule() {
        return this.RegexRule;
    }

    /**
     * Set regex规则内容
     * @param RegexRule regex规则内容
     */
    public void setRegexRule(DspaDiscoveryCOSDataRule RegexRule) {
        this.RegexRule = RegexRule;
    }

    /**
     * Get 关键词规则内容组，最大支持5个关键词。 
     * @return KeywordRule 关键词规则内容组，最大支持5个关键词。
     */
    public DspaDiscoveryCOSDataRule getKeywordRule() {
        return this.KeywordRule;
    }

    /**
     * Set 关键词规则内容组，最大支持5个关键词。
     * @param KeywordRule 关键词规则内容组，最大支持5个关键词。
     */
    public void setKeywordRule(DspaDiscoveryCOSDataRule KeywordRule) {
        this.KeywordRule = KeywordRule;
    }

    /**
     * Get 忽略词规则内容组，最大支持5个忽略词。 
     * @return IgnoreStringRule 忽略词规则内容组，最大支持5个忽略词。
     */
    public DspaDiscoveryCOSDataRule getIgnoreStringRule() {
        return this.IgnoreStringRule;
    }

    /**
     * Set 忽略词规则内容组，最大支持5个忽略词。
     * @param IgnoreStringRule 忽略词规则内容组，最大支持5个忽略词。
     */
    public void setIgnoreStringRule(DspaDiscoveryCOSDataRule IgnoreStringRule) {
        this.IgnoreStringRule = IgnoreStringRule;
    }

    /**
     * Get 最大匹配距离，默认值为100。上限为500. 
     * @return MaxMatch 最大匹配距离，默认值为100。上限为500.
     */
    public Long getMaxMatch() {
        return this.MaxMatch;
    }

    /**
     * Set 最大匹配距离，默认值为100。上限为500.
     * @param MaxMatch 最大匹配距离，默认值为100。上限为500.
     */
    public void setMaxMatch(Long MaxMatch) {
        this.MaxMatch = MaxMatch;
    }

    public DspaDiscoveryCOSRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryCOSRules(DspaDiscoveryCOSRules source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RegexRule != null) {
            this.RegexRule = new DspaDiscoveryCOSDataRule(source.RegexRule);
        }
        if (source.KeywordRule != null) {
            this.KeywordRule = new DspaDiscoveryCOSDataRule(source.KeywordRule);
        }
        if (source.IgnoreStringRule != null) {
            this.IgnoreStringRule = new DspaDiscoveryCOSDataRule(source.IgnoreStringRule);
        }
        if (source.MaxMatch != null) {
            this.MaxMatch = new Long(source.MaxMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "RegexRule.", this.RegexRule);
        this.setParamObj(map, prefix + "KeywordRule.", this.KeywordRule);
        this.setParamObj(map, prefix + "IgnoreStringRule.", this.IgnoreStringRule);
        this.setParamSimple(map, prefix + "MaxMatch", this.MaxMatch);

    }
}

