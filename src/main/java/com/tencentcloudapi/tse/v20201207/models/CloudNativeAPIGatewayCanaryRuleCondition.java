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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayCanaryRuleCondition extends AbstractModel{

    /**
    * 条件类型，支持 path, method, query, header, cookie, body 和 system。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 操作符，支持 "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in",  "prefix" ,"exact", "regex" 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 目标参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 分隔符，当 Operator 为 in 或者 not in 时生效。支持值为英文逗号，英文分号，空格，换行符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * 全局配置 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalConfigId")
    @Expose
    private String GlobalConfigId;

    /**
    * 全局配置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalConfigName")
    @Expose
    private String GlobalConfigName;

    /**
     * Get 条件类型，支持 path, method, query, header, cookie, body 和 system。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 条件类型，支持 path, method, query, header, cookie, body 和 system。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 条件类型，支持 path, method, query, header, cookie, body 和 system。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 条件类型，支持 path, method, query, header, cookie, body 和 system。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 操作符，支持 "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in",  "prefix" ,"exact", "regex" 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作符，支持 "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in",  "prefix" ,"exact", "regex" 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符，支持 "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in",  "prefix" ,"exact", "regex" 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作符，支持 "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in",  "prefix" ,"exact", "regex" 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 目标参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 目标参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 目标参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 目标参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 分隔符，当 Operator 为 in 或者 not in 时生效。支持值为英文逗号，英文分号，空格，换行符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delimiter 分隔符，当 Operator 为 in 或者 not in 时生效。支持值为英文逗号，英文分号，空格，换行符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 分隔符，当 Operator 为 in 或者 not in 时生效。支持值为英文逗号，英文分号，空格，换行符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delimiter 分隔符，当 Operator 为 in 或者 not in 时生效。支持值为英文逗号，英文分号，空格，换行符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get 全局配置 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalConfigId 全局配置 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalConfigId() {
        return this.GlobalConfigId;
    }

    /**
     * Set 全局配置 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalConfigId 全局配置 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalConfigId(String GlobalConfigId) {
        this.GlobalConfigId = GlobalConfigId;
    }

    /**
     * Get 全局配置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalConfigName 全局配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalConfigName() {
        return this.GlobalConfigName;
    }

    /**
     * Set 全局配置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalConfigName 全局配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalConfigName(String GlobalConfigName) {
        this.GlobalConfigName = GlobalConfigName;
    }

    public CloudNativeAPIGatewayCanaryRuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayCanaryRuleCondition(CloudNativeAPIGatewayCanaryRuleCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.GlobalConfigId != null) {
            this.GlobalConfigId = new String(source.GlobalConfigId);
        }
        if (source.GlobalConfigName != null) {
            this.GlobalConfigName = new String(source.GlobalConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "GlobalConfigId", this.GlobalConfigId);
        this.setParamSimple(map, prefix + "GlobalConfigName", this.GlobalConfigName);

    }
}

