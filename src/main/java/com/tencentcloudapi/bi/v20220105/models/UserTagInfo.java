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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserTagInfo extends AbstractModel {

    /**
    * 标签ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 标签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExternalManage")
    @Expose
    private Boolean IsExternalManage;

    /**
    * 标签托管平台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
    * 导入类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
     * Get 标签ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 标签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 标签值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 标签值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 是否被托管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExternalManage 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExternalManage() {
        return this.IsExternalManage;
    }

    /**
     * Set 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExternalManage 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExternalManage(Boolean IsExternalManage) {
        this.IsExternalManage = IsExternalManage;
    }

    /**
     * Get 标签托管平台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagePlatform 标签托管平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set 标签托管平台
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagePlatform 标签托管平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    /**
     * Get 导入类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportType 导入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set 导入类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportType 导入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    public UserTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserTagInfo(UserTagInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.IsExternalManage != null) {
            this.IsExternalManage = new Boolean(source.IsExternalManage);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "IsExternalManage", this.IsExternalManage);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);

    }
}

