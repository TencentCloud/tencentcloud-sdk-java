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

public class CfwStatusMonitorFilter extends AbstractModel {

    /**
    * 过滤字段名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤值列表，最多 10 个。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 操作符类型，可选；仅支持后端允许的类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
     * Get 过滤字段名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 过滤字段名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 过滤字段名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤值列表，最多 10 个。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 过滤值列表，最多 10 个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤值列表，最多 10 个。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 过滤值列表，最多 10 个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 操作符类型，可选；仅支持后端允许的类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorType 操作符类型，可选；仅支持后端允许的类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set 操作符类型，可选；仅支持后端允许的类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorType 操作符类型，可选；仅支持后端允许的类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    public CfwStatusMonitorFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CfwStatusMonitorFilter(CfwStatusMonitorFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);

    }
}

