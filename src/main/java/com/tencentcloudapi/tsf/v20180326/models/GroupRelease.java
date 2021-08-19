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

public class GroupRelease extends AbstractModel{

    /**
    * 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 程序包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 镜像名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 已发布的全局配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicConfigReleaseList")
    @Expose
    private ConfigRelease [] PublicConfigReleaseList;

    /**
    * 已发布的应用配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigReleaseList")
    @Expose
    private ConfigRelease [] ConfigReleaseList;

    /**
    * 已发布的文件配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileConfigReleaseList")
    @Expose
    private FileConfigRelease [] FileConfigReleaseList;

    /**
     * Get 程序包ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 程序包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 程序包版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 镜像名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 镜像版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 已发布的全局配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicConfigReleaseList 已发布的全局配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConfigRelease [] getPublicConfigReleaseList() {
        return this.PublicConfigReleaseList;
    }

    /**
     * Set 已发布的全局配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicConfigReleaseList 已发布的全局配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicConfigReleaseList(ConfigRelease [] PublicConfigReleaseList) {
        this.PublicConfigReleaseList = PublicConfigReleaseList;
    }

    /**
     * Get 已发布的应用配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigReleaseList 已发布的应用配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConfigRelease [] getConfigReleaseList() {
        return this.ConfigReleaseList;
    }

    /**
     * Set 已发布的应用配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigReleaseList 已发布的应用配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigReleaseList(ConfigRelease [] ConfigReleaseList) {
        this.ConfigReleaseList = ConfigReleaseList;
    }

    /**
     * Get 已发布的文件配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileConfigReleaseList 已发布的文件配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileConfigRelease [] getFileConfigReleaseList() {
        return this.FileConfigReleaseList;
    }

    /**
     * Set 已发布的文件配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileConfigReleaseList 已发布的文件配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileConfigReleaseList(FileConfigRelease [] FileConfigReleaseList) {
        this.FileConfigReleaseList = FileConfigReleaseList;
    }

    public GroupRelease() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupRelease(GroupRelease source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.PublicConfigReleaseList != null) {
            this.PublicConfigReleaseList = new ConfigRelease[source.PublicConfigReleaseList.length];
            for (int i = 0; i < source.PublicConfigReleaseList.length; i++) {
                this.PublicConfigReleaseList[i] = new ConfigRelease(source.PublicConfigReleaseList[i]);
            }
        }
        if (source.ConfigReleaseList != null) {
            this.ConfigReleaseList = new ConfigRelease[source.ConfigReleaseList.length];
            for (int i = 0; i < source.ConfigReleaseList.length; i++) {
                this.ConfigReleaseList[i] = new ConfigRelease(source.ConfigReleaseList[i]);
            }
        }
        if (source.FileConfigReleaseList != null) {
            this.FileConfigReleaseList = new FileConfigRelease[source.FileConfigReleaseList.length];
            for (int i = 0; i < source.FileConfigReleaseList.length; i++) {
                this.FileConfigReleaseList[i] = new FileConfigRelease(source.FileConfigReleaseList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamArrayObj(map, prefix + "PublicConfigReleaseList.", this.PublicConfigReleaseList);
        this.setParamArrayObj(map, prefix + "ConfigReleaseList.", this.ConfigReleaseList);
        this.setParamArrayObj(map, prefix + "FileConfigReleaseList.", this.FileConfigReleaseList);

    }
}

