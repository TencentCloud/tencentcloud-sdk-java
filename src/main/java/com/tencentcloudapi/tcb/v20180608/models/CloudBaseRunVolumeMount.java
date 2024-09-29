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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunVolumeMount extends AbstractModel {

    /**
    * 资源名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 挂载路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 是否只读
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * Nfs挂载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NfsVolumes")
    @Expose
    private CloudBaseRunNfsVolumeSource [] NfsVolumes;

    /**
    * 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountPropagation")
    @Expose
    private String MountPropagation;

    /**
     * Get 资源名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 资源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 资源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 挂载路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountPath 挂载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 挂载路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountPath 挂载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
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

    /**
     * Get Nfs挂载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NfsVolumes Nfs挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseRunNfsVolumeSource [] getNfsVolumes() {
        return this.NfsVolumes;
    }

    /**
     * Set Nfs挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NfsVolumes Nfs挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNfsVolumes(CloudBaseRunNfsVolumeSource [] NfsVolumes) {
        this.NfsVolumes = NfsVolumes;
    }

    /**
     * Get 挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountPropagation 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountPropagation() {
        return this.MountPropagation;
    }

    /**
     * Set 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountPropagation 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountPropagation(String MountPropagation) {
        this.MountPropagation = MountPropagation;
    }

    public CloudBaseRunVolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunVolumeMount(CloudBaseRunVolumeMount source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.NfsVolumes != null) {
            this.NfsVolumes = new CloudBaseRunNfsVolumeSource[source.NfsVolumes.length];
            for (int i = 0; i < source.NfsVolumes.length; i++) {
                this.NfsVolumes[i] = new CloudBaseRunNfsVolumeSource(source.NfsVolumes[i]);
            }
        }
        if (source.MountPropagation != null) {
            this.MountPropagation = new String(source.MountPropagation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamArrayObj(map, prefix + "NfsVolumes.", this.NfsVolumes);
        this.setParamSimple(map, prefix + "MountPropagation", this.MountPropagation);

    }
}

