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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceTag extends AbstractModel {

    /**
    * 属性名称
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 属性值的类型，1 int，2 string
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 属性的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 属性描述名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 属性名称 
     * @return Tag 属性名称
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 属性名称
     * @param Tag 属性名称
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 属性值的类型，1 int，2 string 
     * @return Type 属性值的类型，1 int，2 string
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 属性值的类型，1 int，2 string
     * @param Type 属性值的类型，1 int，2 string
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 属性的值 
     * @return Value 属性的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 属性的值
     * @param Value 属性的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 属性描述名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 属性描述名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 属性描述名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 属性描述名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeviceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceTag(DeviceTag source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

