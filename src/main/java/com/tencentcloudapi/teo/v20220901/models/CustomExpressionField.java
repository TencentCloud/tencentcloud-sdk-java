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

public class CustomExpressionField extends AbstractModel {

    /**
    * <p>自定义日志字段名称。可输入1-100个字符，允许的字符为字母、数字、_，仅能以字母开头，该名称不能重复。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义日志字段的取值表达式，表达式长度上限 4KB，语法说明详见 <a href=""> 自定义日志字段表达式</a>。</p>
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
    * <p>是否投递该字段，不填表示不投递此字段。</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>自定义日志字段名称。可输入1-100个字符，允许的字符为字母、数字、_，仅能以字母开头，该名称不能重复。</p> 
     * @return Name <p>自定义日志字段名称。可输入1-100个字符，允许的字符为字母、数字、_，仅能以字母开头，该名称不能重复。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义日志字段名称。可输入1-100个字符，允许的字符为字母、数字、_，仅能以字母开头，该名称不能重复。</p>
     * @param Name <p>自定义日志字段名称。可输入1-100个字符，允许的字符为字母、数字、_，仅能以字母开头，该名称不能重复。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义日志字段的取值表达式，表达式长度上限 4KB，语法说明详见 <a href=""> 自定义日志字段表达式</a>。</p> 
     * @return Expression <p>自定义日志字段的取值表达式，表达式长度上限 4KB，语法说明详见 <a href=""> 自定义日志字段表达式</a>。</p>
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set <p>自定义日志字段的取值表达式，表达式长度上限 4KB，语法说明详见 <a href=""> 自定义日志字段表达式</a>。</p>
     * @param Expression <p>自定义日志字段的取值表达式，表达式长度上限 4KB，语法说明详见 <a href=""> 自定义日志字段表达式</a>。</p>
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Get <p>是否投递该字段，不填表示不投递此字段。</p> 
     * @return Enabled <p>是否投递该字段，不填表示不投递此字段。</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否投递该字段，不填表示不投递此字段。</p>
     * @param Enabled <p>是否投递该字段，不填表示不投递此字段。</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CustomExpressionField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomExpressionField(CustomExpressionField source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

