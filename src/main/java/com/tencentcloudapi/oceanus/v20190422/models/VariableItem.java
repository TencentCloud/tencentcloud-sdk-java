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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VariableItem extends AbstractModel {

    /**
    * <p>变量id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
    * <p>凭据所在地域</p>
    */
    @SerializedName("SecretRegion")
    @Expose
    private String SecretRegion;

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>凭据版本</p>
    */
    @SerializedName("SecretVersionId")
    @Expose
    private String SecretVersionId;

    /**
    * <p>变量值是否隐藏</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>变量描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>变量创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>变量创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
     * Get <p>变量id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId <p>变量id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>变量id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId <p>变量id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul> 
     * @return ValueType <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
     * @param ValueType <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>凭据所在地域</p> 
     * @return SecretRegion <p>凭据所在地域</p>
     */
    public String getSecretRegion() {
        return this.SecretRegion;
    }

    /**
     * Set <p>凭据所在地域</p>
     * @param SecretRegion <p>凭据所在地域</p>
     */
    public void setSecretRegion(String SecretRegion) {
        this.SecretRegion = SecretRegion;
    }

    /**
     * Get <p>凭据名称</p> 
     * @return SecretName <p>凭据名称</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称</p>
     * @param SecretName <p>凭据名称</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>凭据版本</p> 
     * @return SecretVersionId <p>凭据版本</p>
     */
    public String getSecretVersionId() {
        return this.SecretVersionId;
    }

    /**
     * Set <p>凭据版本</p>
     * @param SecretVersionId <p>凭据版本</p>
     */
    public void setSecretVersionId(String SecretVersionId) {
        this.SecretVersionId = SecretVersionId;
    }

    /**
     * Get <p>变量值是否隐藏</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>变量值是否隐藏</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>变量值是否隐藏</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>变量值是否隐藏</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>变量描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>变量描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>变量描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>变量描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>变量创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>变量创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>变量创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>变量创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>变量创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>变量创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>变量创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>变量创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    public VariableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VariableItem(VariableItem source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
        if (source.SecretRegion != null) {
            this.SecretRegion = new String(source.SecretRegion);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.SecretVersionId != null) {
            this.SecretVersionId = new String(source.SecretVersionId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "SecretRegion", this.SecretRegion);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "SecretVersionId", this.SecretVersionId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);

    }
}

