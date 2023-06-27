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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceObject extends AbstractModel{

    /**
    * 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectDataTypeName")
    @Expose
    private String ObjectDataTypeName;

    /**
    * 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectValue")
    @Expose
    private String ObjectValue;

    /**
    * 对象类型 1.常量  2.离线表级   3.离线字段级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectType")
    @Expose
    private Long ObjectType;

    /**
     * Get 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectDataTypeName 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectDataTypeName 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get 源字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceObjectValue 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceObjectValue 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectDataTypeName 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectDataTypeName() {
        return this.ObjectDataTypeName;
    }

    /**
     * Set 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectDataTypeName 源字段详细类型，int、string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectDataTypeName(String ObjectDataTypeName) {
        this.ObjectDataTypeName = ObjectDataTypeName;
    }

    /**
     * Get 源字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectValue 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectValue() {
        return this.ObjectValue;
    }

    /**
     * Set 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectValue 源字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectValue(String ObjectValue) {
        this.ObjectValue = ObjectValue;
    }

    /**
     * Get 对象类型 1.常量  2.离线表级   3.离线字段级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectType 对象类型 1.常量  2.离线表级   3.离线字段级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 对象类型 1.常量  2.离线表级   3.离线字段级
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectType 对象类型 1.常量  2.离线表级   3.离线字段级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectType(Long ObjectType) {
        this.ObjectType = ObjectType;
    }

    public SourceObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceObject(SourceObject source) {
        if (source.SourceObjectDataTypeName != null) {
            this.SourceObjectDataTypeName = new String(source.SourceObjectDataTypeName);
        }
        if (source.SourceObjectValue != null) {
            this.SourceObjectValue = new String(source.SourceObjectValue);
        }
        if (source.ObjectDataTypeName != null) {
            this.ObjectDataTypeName = new String(source.ObjectDataTypeName);
        }
        if (source.ObjectValue != null) {
            this.ObjectValue = new String(source.ObjectValue);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new Long(source.ObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ObjectDataTypeName", this.ObjectDataTypeName);
        this.setParamSimple(map, prefix + "ObjectValue", this.ObjectValue);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);

    }
}

