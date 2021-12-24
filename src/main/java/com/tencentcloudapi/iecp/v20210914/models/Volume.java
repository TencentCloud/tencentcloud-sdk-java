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

public class Volume extends AbstractModel{

    /**
    * 来源(emptyDir|hostPath|configMap|secret|nfs)
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Host挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostPath")
    @Expose
    private VolumeHostPath HostPath;

    /**
    * ConfigMap挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigMap")
    @Expose
    private VolumeConfigMap ConfigMap;

    /**
    * Secret挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Secret")
    @Expose
    private VolumeConfigMap Secret;

    /**
    * NFS挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFS")
    @Expose
    private VolumeNFS NFS;

    /**
     * Get 来源(emptyDir|hostPath|configMap|secret|nfs) 
     * @return Source 来源(emptyDir|hostPath|configMap|secret|nfs)
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源(emptyDir|hostPath|configMap|secret|nfs)
     * @param Source 来源(emptyDir|hostPath|configMap|secret|nfs)
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

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
     * Get Host挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostPath Host挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeHostPath getHostPath() {
        return this.HostPath;
    }

    /**
     * Set Host挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostPath Host挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostPath(VolumeHostPath HostPath) {
        this.HostPath = HostPath;
    }

    /**
     * Get ConfigMap挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigMap ConfigMap挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeConfigMap getConfigMap() {
        return this.ConfigMap;
    }

    /**
     * Set ConfigMap挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigMap ConfigMap挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigMap(VolumeConfigMap ConfigMap) {
        this.ConfigMap = ConfigMap;
    }

    /**
     * Get Secret挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Secret Secret挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeConfigMap getSecret() {
        return this.Secret;
    }

    /**
     * Set Secret挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Secret Secret挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecret(VolumeConfigMap Secret) {
        this.Secret = Secret;
    }

    /**
     * Get NFS挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFS NFS挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeNFS getNFS() {
        return this.NFS;
    }

    /**
     * Set NFS挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFS NFS挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFS(VolumeNFS NFS) {
        this.NFS = NFS;
    }

    public Volume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Volume(Volume source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.HostPath != null) {
            this.HostPath = new VolumeHostPath(source.HostPath);
        }
        if (source.ConfigMap != null) {
            this.ConfigMap = new VolumeConfigMap(source.ConfigMap);
        }
        if (source.Secret != null) {
            this.Secret = new VolumeConfigMap(source.Secret);
        }
        if (source.NFS != null) {
            this.NFS = new VolumeNFS(source.NFS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "HostPath.", this.HostPath);
        this.setParamObj(map, prefix + "ConfigMap.", this.ConfigMap);
        this.setParamObj(map, prefix + "Secret.", this.Secret);
        this.setParamObj(map, prefix + "NFS.", this.NFS);

    }
}

