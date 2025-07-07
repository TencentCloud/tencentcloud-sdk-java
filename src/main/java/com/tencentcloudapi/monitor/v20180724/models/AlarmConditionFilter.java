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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmConditionFilter extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
    * 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expression 表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set 表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expression 表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Get 过滤条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions 过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    public AlarmConditionFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmConditionFilter(AlarmConditionFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);

    }
}

