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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlRule extends AbstractModel {

    /**
    * <p>规则类型：<br>requestHeader ：对请求头部进行访问控制<br>url ： 对访问url进行访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>封禁内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * <p>on ：正则匹配<br>off ：字面匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * <p>RuleType为requestHeader时必填，否则不需要填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleHeader")
    @Expose
    private String RuleHeader;

    /**
     * Get <p>规则类型：<br>requestHeader ：对请求头部进行访问控制<br>url ： 对访问url进行访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType <p>规则类型：<br>requestHeader ：对请求头部进行访问控制<br>url ： 对访问url进行访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型：<br>requestHeader ：对请求头部进行访问控制<br>url ： 对访问url进行访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType <p>规则类型：<br>requestHeader ：对请求头部进行访问控制<br>url ： 对访问url进行访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>封禁内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleContent <p>封禁内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set <p>封禁内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleContent <p>封禁内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get <p>on ：正则匹配<br>off ：字面匹配</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regex <p>on ：正则匹配<br>off ：字面匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set <p>on ：正则匹配<br>off ：字面匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regex <p>on ：正则匹配<br>off ：字面匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get <p>RuleType为requestHeader时必填，否则不需要填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleHeader <p>RuleType为requestHeader时必填，否则不需要填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleHeader() {
        return this.RuleHeader;
    }

    /**
     * Set <p>RuleType为requestHeader时必填，否则不需要填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleHeader <p>RuleType为requestHeader时必填，否则不需要填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleHeader(String RuleHeader) {
        this.RuleHeader = RuleHeader;
    }

    public AccessControlRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlRule(AccessControlRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.RuleHeader != null) {
            this.RuleHeader = new String(source.RuleHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "RuleHeader", this.RuleHeader);

    }
}

