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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeInfo extends AbstractModel {

    /**
    * 缓存卷ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
    * 名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 挂载路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
     * Get 缓存卷ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeId 缓存卷ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set 缓存卷ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeId 缓存卷ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    /**
     * Get 名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 挂载路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountPath 挂载路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 挂载路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountPath 挂载路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    public VolumeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeInfo(VolumeInfo source) {
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);

    }
}

