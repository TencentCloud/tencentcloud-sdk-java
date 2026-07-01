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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeFile extends AbstractModel {

    /**
    * <p>脚本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileId")
    @Expose
    private String CodeFileId;

    /**
    * <p>脚本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileName")
    @Expose
    private String CodeFileName;

    /**
    * <p>脚本所有者 uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>脚本配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileConfig")
    @Expose
    private CodeFileConfig CodeFileConfig;

    /**
    * <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileContent")
    @Expose
    private String CodeFileContent;

    /**
    * <p>最近一次操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>权限范围：SHARED, PRIVATE</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
    * <p>节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>父文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * <p>返回保存后的versionId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get <p>脚本ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileId <p>脚本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeFileId() {
        return this.CodeFileId;
    }

    /**
     * Set <p>脚本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileId <p>脚本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileId(String CodeFileId) {
        this.CodeFileId = CodeFileId;
    }

    /**
     * Get <p>脚本名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileName <p>脚本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeFileName() {
        return this.CodeFileName;
    }

    /**
     * Set <p>脚本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileName <p>脚本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileName(String CodeFileName) {
        this.CodeFileName = CodeFileName;
    }

    /**
     * Get <p>脚本所有者 uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>脚本所有者 uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>脚本所有者 uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>脚本所有者 uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>脚本配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileConfig <p>脚本配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodeFileConfig getCodeFileConfig() {
        return this.CodeFileConfig;
    }

    /**
     * Set <p>脚本配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileConfig <p>脚本配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileConfig(CodeFileConfig CodeFileConfig) {
        this.CodeFileConfig = CodeFileConfig;
    }

    /**
     * Get <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileContent <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeFileContent() {
        return this.CodeFileContent;
    }

    /**
     * Set <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileContent <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileContent(String CodeFileContent) {
        this.CodeFileContent = CodeFileContent;
    }

    /**
     * Get <p>最近一次操作人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserUin <p>最近一次操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set <p>最近一次操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserUin <p>最近一次操作人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间 yyyy-MM-dd hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>权限范围：SHARED, PRIVATE</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessScope <p>权限范围：SHARED, PRIVATE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set <p>权限范围：SHARED, PRIVATE</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessScope <p>权限范围：SHARED, PRIVATE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get <p>节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>父文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentFolderPath <p>父文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set <p>父文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentFolderPath <p>父文件夹路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get <p>返回保存后的versionId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>返回保存后的versionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>返回保存后的versionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>返回保存后的versionId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public CodeFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeFile(CodeFile source) {
        if (source.CodeFileId != null) {
            this.CodeFileId = new String(source.CodeFileId);
        }
        if (source.CodeFileName != null) {
            this.CodeFileName = new String(source.CodeFileName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CodeFileConfig != null) {
            this.CodeFileConfig = new CodeFileConfig(source.CodeFileConfig);
        }
        if (source.CodeFileContent != null) {
            this.CodeFileContent = new String(source.CodeFileContent);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeFileId", this.CodeFileId);
        this.setParamSimple(map, prefix + "CodeFileName", this.CodeFileName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamObj(map, prefix + "CodeFileConfig.", this.CodeFileConfig);
        this.setParamSimple(map, prefix + "CodeFileContent", this.CodeFileContent);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

