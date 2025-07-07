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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueInfo extends AbstractModel {

    /**
    * 值ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 值类型：0:未知或者空, 1:string, 2:int, 3:float, 4:bool, 5:array(字符串数组), 6: object_array(结构体数组), 7: object(结构体)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
    * string
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueStr")
    @Expose
    private String ValueStr;

    /**
    * int（避免精度丢失使用字符串返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueInt")
    @Expose
    private String ValueInt;

    /**
    * float
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueFloat")
    @Expose
    private Float ValueFloat;

    /**
    * bool
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueBool")
    @Expose
    private Boolean ValueBool;

    /**
    * array
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueStrArray")
    @Expose
    private String [] ValueStrArray;

    /**
     * Get 值ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 值ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 值ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 值ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 值类型：0:未知或者空, 1:string, 2:int, 3:float, 4:bool, 5:array(字符串数组), 6: object_array(结构体数组), 7: object(结构体)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueType 值类型：0:未知或者空, 1:string, 2:int, 3:float, 4:bool, 5:array(字符串数组), 6: object_array(结构体数组), 7: object(结构体)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set 值类型：0:未知或者空, 1:string, 2:int, 3:float, 4:bool, 5:array(字符串数组), 6: object_array(结构体数组), 7: object(结构体)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueType 值类型：0:未知或者空, 1:string, 2:int, 3:float, 4:bool, 5:array(字符串数组), 6: object_array(结构体数组), 7: object(结构体)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get string
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueStr string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueStr() {
        return this.ValueStr;
    }

    /**
     * Set string
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueStr string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueStr(String ValueStr) {
        this.ValueStr = ValueStr;
    }

    /**
     * Get int（避免精度丢失使用字符串返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueInt int（避免精度丢失使用字符串返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueInt() {
        return this.ValueInt;
    }

    /**
     * Set int（避免精度丢失使用字符串返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueInt int（避免精度丢失使用字符串返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueInt(String ValueInt) {
        this.ValueInt = ValueInt;
    }

    /**
     * Get float
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueFloat float
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValueFloat() {
        return this.ValueFloat;
    }

    /**
     * Set float
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueFloat float
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueFloat(Float ValueFloat) {
        this.ValueFloat = ValueFloat;
    }

    /**
     * Get bool
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueBool bool
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getValueBool() {
        return this.ValueBool;
    }

    /**
     * Set bool
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueBool bool
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueBool(Boolean ValueBool) {
        this.ValueBool = ValueBool;
    }

    /**
     * Get array
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueStrArray array
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValueStrArray() {
        return this.ValueStrArray;
    }

    /**
     * Set array
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueStrArray array
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueStrArray(String [] ValueStrArray) {
        this.ValueStrArray = ValueStrArray;
    }

    public ValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueInfo(ValueInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
        if (source.ValueStr != null) {
            this.ValueStr = new String(source.ValueStr);
        }
        if (source.ValueInt != null) {
            this.ValueInt = new String(source.ValueInt);
        }
        if (source.ValueFloat != null) {
            this.ValueFloat = new Float(source.ValueFloat);
        }
        if (source.ValueBool != null) {
            this.ValueBool = new Boolean(source.ValueBool);
        }
        if (source.ValueStrArray != null) {
            this.ValueStrArray = new String[source.ValueStrArray.length];
            for (int i = 0; i < source.ValueStrArray.length; i++) {
                this.ValueStrArray[i] = new String(source.ValueStrArray[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "ValueStr", this.ValueStr);
        this.setParamSimple(map, prefix + "ValueInt", this.ValueInt);
        this.setParamSimple(map, prefix + "ValueFloat", this.ValueFloat);
        this.setParamSimple(map, prefix + "ValueBool", this.ValueBool);
        this.setParamArraySimple(map, prefix + "ValueStrArray.", this.ValueStrArray);

    }
}

