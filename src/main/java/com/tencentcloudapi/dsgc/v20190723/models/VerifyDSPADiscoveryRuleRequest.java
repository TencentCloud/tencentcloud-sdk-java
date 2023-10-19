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

public class VerifyDSPADiscoveryRuleRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
    */
    @SerializedName("MatchOperator")
    @Expose
    private String MatchOperator;

    /**
    * 字段名包含规则，最大支持选择9项
    */
    @SerializedName("MetaRule")
    @Expose
    private DataRules MetaRule;

    /**
    * 内容包含规则，最大支持选择9项
    */
    @SerializedName("ContentRule")
    @Expose
    private DataRules ContentRule;

    /**
    * 验证规则字段名，最大长度为1024个字符
    */
    @SerializedName("VerifyMeta")
    @Expose
    private String VerifyMeta;

    /**
    * 验证规则数据内容，最大长度为1024个字符
    */
    @SerializedName("VerifyContent")
    @Expose
    private String VerifyContent;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一 
     * @return MatchOperator 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
     */
    public String getMatchOperator() {
        return this.MatchOperator;
    }

    /**
     * Set 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
     * @param MatchOperator 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一
     */
    public void setMatchOperator(String MatchOperator) {
        this.MatchOperator = MatchOperator;
    }

    /**
     * Get 字段名包含规则，最大支持选择9项 
     * @return MetaRule 字段名包含规则，最大支持选择9项
     */
    public DataRules getMetaRule() {
        return this.MetaRule;
    }

    /**
     * Set 字段名包含规则，最大支持选择9项
     * @param MetaRule 字段名包含规则，最大支持选择9项
     */
    public void setMetaRule(DataRules MetaRule) {
        this.MetaRule = MetaRule;
    }

    /**
     * Get 内容包含规则，最大支持选择9项 
     * @return ContentRule 内容包含规则，最大支持选择9项
     */
    public DataRules getContentRule() {
        return this.ContentRule;
    }

    /**
     * Set 内容包含规则，最大支持选择9项
     * @param ContentRule 内容包含规则，最大支持选择9项
     */
    public void setContentRule(DataRules ContentRule) {
        this.ContentRule = ContentRule;
    }

    /**
     * Get 验证规则字段名，最大长度为1024个字符 
     * @return VerifyMeta 验证规则字段名，最大长度为1024个字符
     */
    public String getVerifyMeta() {
        return this.VerifyMeta;
    }

    /**
     * Set 验证规则字段名，最大长度为1024个字符
     * @param VerifyMeta 验证规则字段名，最大长度为1024个字符
     */
    public void setVerifyMeta(String VerifyMeta) {
        this.VerifyMeta = VerifyMeta;
    }

    /**
     * Get 验证规则数据内容，最大长度为1024个字符 
     * @return VerifyContent 验证规则数据内容，最大长度为1024个字符
     */
    public String getVerifyContent() {
        return this.VerifyContent;
    }

    /**
     * Set 验证规则数据内容，最大长度为1024个字符
     * @param VerifyContent 验证规则数据内容，最大长度为1024个字符
     */
    public void setVerifyContent(String VerifyContent) {
        this.VerifyContent = VerifyContent;
    }

    public VerifyDSPADiscoveryRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDSPADiscoveryRuleRequest(VerifyDSPADiscoveryRuleRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.MatchOperator != null) {
            this.MatchOperator = new String(source.MatchOperator);
        }
        if (source.MetaRule != null) {
            this.MetaRule = new DataRules(source.MetaRule);
        }
        if (source.ContentRule != null) {
            this.ContentRule = new DataRules(source.ContentRule);
        }
        if (source.VerifyMeta != null) {
            this.VerifyMeta = new String(source.VerifyMeta);
        }
        if (source.VerifyContent != null) {
            this.VerifyContent = new String(source.VerifyContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "MatchOperator", this.MatchOperator);
        this.setParamObj(map, prefix + "MetaRule.", this.MetaRule);
        this.setParamObj(map, prefix + "ContentRule.", this.ContentRule);
        this.setParamSimple(map, prefix + "VerifyMeta", this.VerifyMeta);
        this.setParamSimple(map, prefix + "VerifyContent", this.VerifyContent);

    }
}

