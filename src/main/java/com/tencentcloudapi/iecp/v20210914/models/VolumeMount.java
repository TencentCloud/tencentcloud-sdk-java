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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeMount extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 挂载路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 子路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * 是否只读
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 挂载路径 
     * @return MountPath 挂载路径
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 挂载路径
     * @param MountPath 挂载路径
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get 子路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubPath 子路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set 子路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubPath 子路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get 是否只读
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnly 是否只读
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否只读
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnly 是否只读
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    public VolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeMount(VolumeMount source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

