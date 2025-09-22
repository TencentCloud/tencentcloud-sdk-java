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

public class SQLScript extends AbstractModel {

    /**
    * 脚本id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * 脚本所有者 uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 脚本配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 最近一次操作人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 更新时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 权限范围：SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
    * 节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 脚本id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptId 脚本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptId 脚本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 脚本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptName 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptName 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
    }

    /**
     * Get 脚本所有者 uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 脚本所有者 uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 脚本所有者 uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 脚本所有者 uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentFolderPath 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentFolderPath 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get 脚本配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptConfig 脚本配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SQLScriptConfig getScriptConfig() {
        return this.ScriptConfig;
    }

    /**
     * Set 脚本配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptConfig 脚本配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptConfig(SQLScriptConfig ScriptConfig) {
        this.ScriptConfig = ScriptConfig;
    }

    /**
     * Get 脚本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 最近一次操作人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserUin 最近一次操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set 最近一次操作人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserUin 最近一次操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 更新时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间 yyyy-MM-dd hh:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 权限范围：SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessScope 权限范围：SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 权限范围：SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessScope 权限范围：SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get 节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 节点全路径，/aaa/bbb/ccc.ipynb，由各个节点的名称组成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public SQLScript() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLScript(SQLScript source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

