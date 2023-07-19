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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitSqlTaskRequest extends AbstractModel{

    /**
    * 数据库类型
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 数据源Id
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 资源组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 脚本文件id
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 执行引擎实例ID
    */
    @SerializedName("EngineId")
    @Expose
    private String EngineId;

    /**
    * 脚本内容
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 资源队列
    */
    @SerializedName("ResourceQueue")
    @Expose
    private String ResourceQueue;

    /**
    * 数据库类型
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
    * 计算资源名称
    */
    @SerializedName("ComputeResource")
    @Expose
    private String ComputeResource;

    /**
    * 高级运行参数
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * 高级设置
    */
    @SerializedName("ConfParams")
    @Expose
    private String ConfParams;

    /**
     * Get 数据库类型 
     * @return DatabaseType 数据库类型
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 数据库类型
     * @param DatabaseType 数据库类型
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 数据源Id 
     * @return DatasourceId 数据源Id
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
     * @param DatasourceId 数据源Id
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 资源组Id 
     * @return GroupId 资源组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 资源组Id
     * @param GroupId 资源组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 脚本文件id 
     * @return ScriptId 脚本文件id
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本文件id
     * @param ScriptId 脚本文件id
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 执行引擎实例ID 
     * @return EngineId 执行引擎实例ID
     */
    public String getEngineId() {
        return this.EngineId;
    }

    /**
     * Set 执行引擎实例ID
     * @param EngineId 执行引擎实例ID
     */
    public void setEngineId(String EngineId) {
        this.EngineId = EngineId;
    }

    /**
     * Get 脚本内容 
     * @return ScriptContent 脚本内容
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
     * @param ScriptContent 脚本内容
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 资源队列 
     * @return ResourceQueue 资源队列
     */
    public String getResourceQueue() {
        return this.ResourceQueue;
    }

    /**
     * Set 资源队列
     * @param ResourceQueue 资源队列
     */
    public void setResourceQueue(String ResourceQueue) {
        this.ResourceQueue = ResourceQueue;
    }

    /**
     * Get 数据库类型 
     * @return DatasourceType 数据库类型
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据库类型
     * @param DatasourceType 数据库类型
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get 计算资源名称 
     * @return ComputeResource 计算资源名称
     */
    public String getComputeResource() {
        return this.ComputeResource;
    }

    /**
     * Set 计算资源名称
     * @param ComputeResource 计算资源名称
     */
    public void setComputeResource(String ComputeResource) {
        this.ComputeResource = ComputeResource;
    }

    /**
     * Get 高级运行参数 
     * @return RunParams 高级运行参数
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set 高级运行参数
     * @param RunParams 高级运行参数
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get 高级设置 
     * @return ConfParams 高级设置
     */
    public String getConfParams() {
        return this.ConfParams;
    }

    /**
     * Set 高级设置
     * @param ConfParams 高级设置
     */
    public void setConfParams(String ConfParams) {
        this.ConfParams = ConfParams;
    }

    public SubmitSqlTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitSqlTaskRequest(SubmitSqlTaskRequest source) {
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.EngineId != null) {
            this.EngineId = new String(source.EngineId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.ResourceQueue != null) {
            this.ResourceQueue = new String(source.ResourceQueue);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
        if (source.ComputeResource != null) {
            this.ComputeResource = new String(source.ComputeResource);
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.ConfParams != null) {
            this.ConfParams = new String(source.ConfParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "EngineId", this.EngineId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "ResourceQueue", this.ResourceQueue);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "ComputeResource", this.ComputeResource);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "ConfParams", this.ConfParams);

    }
}

