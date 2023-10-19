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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskCOSRules extends AbstractModel {

    /**
    * regex规则内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegexRule")
    @Expose
    private COSDataRule RegexRule;

    /**
    * 规则状态；0 不启用, 1 启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关键词规则内容组，最大支持5个关键词。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeywordRule")
    @Expose
    private COSDataRule KeywordRule;

    /**
    * 忽略词规则内容组，最大支持5个忽略词。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreStringRule")
    @Expose
    private COSDataRule IgnoreStringRule;

    /**
    * 最大匹配距离，默认值为100。上限为500.
    */
    @SerializedName("MaxMatch")
    @Expose
    private Long MaxMatch;

    /**
     * Get regex规则内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegexRule regex规则内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public COSDataRule getRegexRule() {
        return this.RegexRule;
    }

    /**
     * Set regex规则内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegexRule regex规则内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegexRule(COSDataRule RegexRule) {
        this.RegexRule = RegexRule;
    }

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
     * Get 关键词规则内容组，最大支持5个关键词。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeywordRule 关键词规则内容组，最大支持5个关键词。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public COSDataRule getKeywordRule() {
        return this.KeywordRule;
    }

    /**
     * Set 关键词规则内容组，最大支持5个关键词。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeywordRule 关键词规则内容组，最大支持5个关键词。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywordRule(COSDataRule KeywordRule) {
        this.KeywordRule = KeywordRule;
    }

    /**
     * Get 忽略词规则内容组，最大支持5个忽略词。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreStringRule 忽略词规则内容组，最大支持5个忽略词。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public COSDataRule getIgnoreStringRule() {
        return this.IgnoreStringRule;
    }

    /**
     * Set 忽略词规则内容组，最大支持5个忽略词。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreStringRule 忽略词规则内容组，最大支持5个忽略词。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreStringRule(COSDataRule IgnoreStringRule) {
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

    public ScanTaskCOSRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskCOSRules(ScanTaskCOSRules source) {
        if (source.RegexRule != null) {
            this.RegexRule = new COSDataRule(source.RegexRule);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.KeywordRule != null) {
            this.KeywordRule = new COSDataRule(source.KeywordRule);
        }
        if (source.IgnoreStringRule != null) {
            this.IgnoreStringRule = new COSDataRule(source.IgnoreStringRule);
        }
        if (source.MaxMatch != null) {
            this.MaxMatch = new Long(source.MaxMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RegexRule.", this.RegexRule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "KeywordRule.", this.KeywordRule);
        this.setParamObj(map, prefix + "IgnoreStringRule.", this.IgnoreStringRule);
        this.setParamSimple(map, prefix + "MaxMatch", this.MaxMatch);

    }
}

