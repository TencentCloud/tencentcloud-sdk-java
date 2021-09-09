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

public class CodeSource extends AbstractModel{

    /**
    * 类型, 可能的枚举: "coding","package","package_url","github","gitlab","gitee","rawcode"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * code包名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodingPackageName")
    @Expose
    private String CodingPackageName;

    /**
    * coding版本名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodingPackageVersion")
    @Expose
    private String CodingPackageVersion;

    /**
    * 源码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawCode")
    @Expose
    private String RawCode;

    /**
    * 代码分支
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * coding项目ID，type为coding时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * coding项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 类型, 可能的枚举: "coding","package","package_url","github","gitlab","gitee","rawcode"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型, 可能的枚举: "coding","package","package_url","github","gitlab","gitee","rawcode"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型, 可能的枚举: "coding","package","package_url","github","gitlab","gitee","rawcode"
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型, 可能的枚举: "coding","package","package_url","github","gitlab","gitee","rawcode"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

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
     * Get 工作目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkDir 工作目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set 工作目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkDir 工作目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    /**
     * Get code包名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodingPackageName code包名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodingPackageName() {
        return this.CodingPackageName;
    }

    /**
     * Set code包名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodingPackageName code包名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodingPackageName(String CodingPackageName) {
        this.CodingPackageName = CodingPackageName;
    }

    /**
     * Get coding版本名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodingPackageVersion coding版本名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodingPackageVersion() {
        return this.CodingPackageVersion;
    }

    /**
     * Set coding版本名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodingPackageVersion coding版本名, type为coding的时候需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodingPackageVersion(String CodingPackageVersion) {
        this.CodingPackageVersion = CodingPackageVersion;
    }

    /**
     * Get 源码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawCode 源码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRawCode() {
        return this.RawCode;
    }

    /**
     * Set 源码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawCode 源码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawCode(String RawCode) {
        this.RawCode = RawCode;
    }

    /**
     * Get 代码分支
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branch 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branch 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get coding项目ID，type为coding时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId coding项目ID，type为coding时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set coding项目ID，type为coding时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId coding项目ID，type为coding时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get coding项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName coding项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set coding项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName coding项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public CodeSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeSource(CodeSource source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.CodingPackageName != null) {
            this.CodingPackageName = new String(source.CodingPackageName);
        }
        if (source.CodingPackageVersion != null) {
            this.CodingPackageVersion = new String(source.CodingPackageVersion);
        }
        if (source.RawCode != null) {
            this.RawCode = new String(source.RawCode);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamSimple(map, prefix + "CodingPackageName", this.CodingPackageName);
        this.setParamSimple(map, prefix + "CodingPackageVersion", this.CodingPackageVersion);
        this.setParamSimple(map, prefix + "RawCode", this.RawCode);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

