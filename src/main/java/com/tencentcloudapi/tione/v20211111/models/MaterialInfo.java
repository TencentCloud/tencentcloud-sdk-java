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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialInfo extends AbstractModel {

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Cos存储信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPathInfo")
    @Expose
    private CosPathInfo CosPathInfo;

    /**
    * 物料名，支持Code、Model
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialName")
    @Expose
    private String MaterialName;

    /**
    * 物料类型，支持PreSet(预置)、 Custom(自定义)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialType")
    @Expose
    private String MaterialType;

    /**
    * 训练任务挂载路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
     * Get 存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Cos存储信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPathInfo Cos存储信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getCosPathInfo() {
        return this.CosPathInfo;
    }

    /**
     * Set Cos存储信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPathInfo Cos存储信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPathInfo(CosPathInfo CosPathInfo) {
        this.CosPathInfo = CosPathInfo;
    }

    /**
     * Get 物料名，支持Code、Model
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialName 物料名，支持Code、Model
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaterialName() {
        return this.MaterialName;
    }

    /**
     * Set 物料名，支持Code、Model
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialName 物料名，支持Code、Model
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    /**
     * Get 物料类型，支持PreSet(预置)、 Custom(自定义)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialType 物料类型，支持PreSet(预置)、 Custom(自定义)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaterialType() {
        return this.MaterialType;
    }

    /**
     * Set 物料类型，支持PreSet(预置)、 Custom(自定义)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialType 物料类型，支持PreSet(预置)、 Custom(自定义)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialType(String MaterialType) {
        this.MaterialType = MaterialType;
    }

    /**
     * Get 训练任务挂载路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountPath 训练任务挂载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 训练任务挂载路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountPath 训练任务挂载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    public MaterialInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialInfo(MaterialInfo source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.CosPathInfo != null) {
            this.CosPathInfo = new CosPathInfo(source.CosPathInfo);
        }
        if (source.MaterialName != null) {
            this.MaterialName = new String(source.MaterialName);
        }
        if (source.MaterialType != null) {
            this.MaterialType = new String(source.MaterialType);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "CosPathInfo.", this.CosPathInfo);
        this.setParamSimple(map, prefix + "MaterialName", this.MaterialName);
        this.setParamSimple(map, prefix + "MaterialType", this.MaterialType);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);

    }
}

