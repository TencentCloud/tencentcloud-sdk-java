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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudRunServiceVolume extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * NFS的挂载方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFS")
    @Expose
    private CloudBaseRunNfsVolumeSource NFS;

    /**
    * secret名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 是否开启临时目录逐步废弃，请使用 EmptyDir
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableEmptyDirVolume")
    @Expose
    private Boolean EnableEmptyDirVolume;

    /**
    * emptydir数据卷详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmptyDir")
    @Expose
    private CloudBaseRunEmptyDirVolumeSource EmptyDir;

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
     * Get NFS的挂载方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFS NFS的挂载方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseRunNfsVolumeSource getNFS() {
        return this.NFS;
    }

    /**
     * Set NFS的挂载方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFS NFS的挂载方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFS(CloudBaseRunNfsVolumeSource NFS) {
        this.NFS = NFS;
    }

    /**
     * Get secret名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretName secret名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretName secret名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 是否开启临时目录逐步废弃，请使用 EmptyDir
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableEmptyDirVolume 是否开启临时目录逐步废弃，请使用 EmptyDir
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableEmptyDirVolume() {
        return this.EnableEmptyDirVolume;
    }

    /**
     * Set 是否开启临时目录逐步废弃，请使用 EmptyDir
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableEmptyDirVolume 是否开启临时目录逐步废弃，请使用 EmptyDir
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableEmptyDirVolume(Boolean EnableEmptyDirVolume) {
        this.EnableEmptyDirVolume = EnableEmptyDirVolume;
    }

    /**
     * Get emptydir数据卷详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmptyDir emptydir数据卷详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseRunEmptyDirVolumeSource getEmptyDir() {
        return this.EmptyDir;
    }

    /**
     * Set emptydir数据卷详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmptyDir emptydir数据卷详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmptyDir(CloudBaseRunEmptyDirVolumeSource EmptyDir) {
        this.EmptyDir = EmptyDir;
    }

    public CloudRunServiceVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudRunServiceVolume(CloudRunServiceVolume source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NFS != null) {
            this.NFS = new CloudBaseRunNfsVolumeSource(source.NFS);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.EnableEmptyDirVolume != null) {
            this.EnableEmptyDirVolume = new Boolean(source.EnableEmptyDirVolume);
        }
        if (source.EmptyDir != null) {
            this.EmptyDir = new CloudBaseRunEmptyDirVolumeSource(source.EmptyDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "NFS.", this.NFS);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "EnableEmptyDirVolume", this.EnableEmptyDirVolume);
        this.setParamObj(map, prefix + "EmptyDir.", this.EmptyDir);

    }
}

