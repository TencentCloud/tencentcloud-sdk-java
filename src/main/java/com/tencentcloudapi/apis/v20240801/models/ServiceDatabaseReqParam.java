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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDatabaseReqParam extends AbstractModel {

    /**
    * <p>表字段名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>操作符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>参数名/常量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Val")
    @Expose
    private String Val;

    /**
    * <p>参数类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValType")
    @Expose
    private String ValType;

    /**
    * <p>内部字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalField")
    @Expose
    private Boolean InternalField;

    /**
     * Get <p>表字段名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldName <p>表字段名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>表字段名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldName <p>表字段名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>操作符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator <p>操作符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator <p>操作符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>参数名/常量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Val <p>参数名/常量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVal() {
        return this.Val;
    }

    /**
     * Set <p>参数名/常量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Val <p>参数名/常量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVal(String Val) {
        this.Val = Val;
    }

    /**
     * Get <p>参数类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValType <p>参数类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValType() {
        return this.ValType;
    }

    /**
     * Set <p>参数类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValType <p>参数类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValType(String ValType) {
        this.ValType = ValType;
    }

    /**
     * Get <p>内部字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalField <p>内部字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInternalField() {
        return this.InternalField;
    }

    /**
     * Set <p>内部字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalField <p>内部字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalField(Boolean InternalField) {
        this.InternalField = InternalField;
    }

    public ServiceDatabaseReqParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDatabaseReqParam(ServiceDatabaseReqParam source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Val != null) {
            this.Val = new String(source.Val);
        }
        if (source.ValType != null) {
            this.ValType = new String(source.ValType);
        }
        if (source.InternalField != null) {
            this.InternalField = new Boolean(source.InternalField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Val", this.Val);
        this.setParamSimple(map, prefix + "ValType", this.ValType);
        this.setParamSimple(map, prefix + "InternalField", this.InternalField);

    }
}

