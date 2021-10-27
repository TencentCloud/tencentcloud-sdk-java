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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrRepoInfo extends AbstractModel{

    /**
    * 地域（填数字）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 实例名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 仓库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
     * Get 地域（填数字）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域（填数字）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域（填数字）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域（填数字）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 实例名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryName 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set 实例名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryName 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 仓库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 仓库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 仓库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    public TcrRepoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrRepoInfo(TcrRepoInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);

    }
}

