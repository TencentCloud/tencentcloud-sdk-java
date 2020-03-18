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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderPathRule extends AbstractModel{

    /**
    * http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
请求头部暂不支持set。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * http头部名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * http头部值。del时可不填写该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * 生效的url路径规则类型，支持all，file，directory或path，分别表示全部路径，文件后缀类型，目录或绝对路径生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * url路径或文件类型列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
请求头部暂不支持set。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderMode http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
请求头部暂不支持set。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
请求头部暂不支持set。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderMode http头部设置方式，支持add，set或del，分别表示新增，设置或删除头部。
请求头部暂不支持set。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get http头部名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderName http头部名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set http头部名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderName http头部名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get http头部值。del时可不填写该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderValue http头部值。del时可不填写该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set http头部值。del时可不填写该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderValue http头部值。del时可不填写该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get 生效的url路径规则类型，支持all，file，directory或path，分别表示全部路径，文件后缀类型，目录或绝对路径生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 生效的url路径规则类型，支持all，file，directory或path，分别表示全部路径，文件后缀类型，目录或绝对路径生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 生效的url路径规则类型，支持all，file，directory或path，分别表示全部路径，文件后缀类型，目录或绝对路径生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 生效的url路径规则类型，支持all，file，directory或path，分别表示全部路径，文件后缀类型，目录或绝对路径生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get url路径或文件类型列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePaths url路径或文件类型列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set url路径或文件类型列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePaths url路径或文件类型列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderMode", this.HeaderMode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

