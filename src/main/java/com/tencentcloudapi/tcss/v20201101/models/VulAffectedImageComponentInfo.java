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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedImageComponentInfo extends AbstractModel{

    /**
    * 组件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 组件修复版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixedVersion")
    @Expose
    private String FixedVersion;

    /**
    * 组件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 组件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 组件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 组件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 组件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 组件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 组件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 组件修复版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixedVersion 组件修复版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFixedVersion() {
        return this.FixedVersion;
    }

    /**
     * Set 组件修复版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixedVersion 组件修复版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixedVersion(String FixedVersion) {
        this.FixedVersion = FixedVersion;
    }

    /**
     * Get 组件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 组件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 组件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 组件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public VulAffectedImageComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedImageComponentInfo(VulAffectedImageComponentInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FixedVersion != null) {
            this.FixedVersion = new String(source.FixedVersion);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FixedVersion", this.FixedVersion);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

