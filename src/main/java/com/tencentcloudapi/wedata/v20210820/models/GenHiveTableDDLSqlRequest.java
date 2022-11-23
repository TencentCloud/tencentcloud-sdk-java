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

public class GenHiveTableDDLSqlRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 目标数据库
    */
    @SerializedName("SinkDatabase")
    @Expose
    private String SinkDatabase;

    /**
    * 节点id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 元数据类型(MYSQL、ORACLE)
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 来源库
    */
    @SerializedName("SourceDatabase")
    @Expose
    private String SourceDatabase;

    /**
    * 来源表
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 目标表元数据类型(HIVE、GBASE)
    */
    @SerializedName("SinkType")
    @Expose
    private String SinkType;

    /**
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 上游节点的字段信息
    */
    @SerializedName("SourceFieldInfoList")
    @Expose
    private SourceFieldInfo [] SourceFieldInfoList;

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
     * Get 目标数据库 
     * @return SinkDatabase 目标数据库
     */
    public String getSinkDatabase() {
        return this.SinkDatabase;
    }

    /**
     * Set 目标数据库
     * @param SinkDatabase 目标数据库
     */
    public void setSinkDatabase(String SinkDatabase) {
        this.SinkDatabase = SinkDatabase;
    }

    /**
     * Get 节点id 
     * @return Id 节点id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 节点id
     * @param Id 节点id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 元数据类型(MYSQL、ORACLE) 
     * @return MsType 元数据类型(MYSQL、ORACLE)
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 元数据类型(MYSQL、ORACLE)
     * @param MsType 元数据类型(MYSQL、ORACLE)
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 来源库 
     * @return SourceDatabase 来源库
     */
    public String getSourceDatabase() {
        return this.SourceDatabase;
    }

    /**
     * Set 来源库
     * @param SourceDatabase 来源库
     */
    public void setSourceDatabase(String SourceDatabase) {
        this.SourceDatabase = SourceDatabase;
    }

    /**
     * Get 来源表 
     * @return TableName 来源表
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 来源表
     * @param TableName 来源表
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 目标表元数据类型(HIVE、GBASE) 
     * @return SinkType 目标表元数据类型(HIVE、GBASE)
     */
    public String getSinkType() {
        return this.SinkType;
    }

    /**
     * Set 目标表元数据类型(HIVE、GBASE)
     * @param SinkType 目标表元数据类型(HIVE、GBASE)
     */
    public void setSinkType(String SinkType) {
        this.SinkType = SinkType;
    }

    /**
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 上游节点的字段信息 
     * @return SourceFieldInfoList 上游节点的字段信息
     */
    public SourceFieldInfo [] getSourceFieldInfoList() {
        return this.SourceFieldInfoList;
    }

    /**
     * Set 上游节点的字段信息
     * @param SourceFieldInfoList 上游节点的字段信息
     */
    public void setSourceFieldInfoList(SourceFieldInfo [] SourceFieldInfoList) {
        this.SourceFieldInfoList = SourceFieldInfoList;
    }

    public GenHiveTableDDLSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenHiveTableDDLSqlRequest(GenHiveTableDDLSqlRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SinkDatabase != null) {
            this.SinkDatabase = new String(source.SinkDatabase);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.SourceDatabase != null) {
            this.SourceDatabase = new String(source.SourceDatabase);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.SinkType != null) {
            this.SinkType = new String(source.SinkType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.SourceFieldInfoList != null) {
            this.SourceFieldInfoList = new SourceFieldInfo[source.SourceFieldInfoList.length];
            for (int i = 0; i < source.SourceFieldInfoList.length; i++) {
                this.SourceFieldInfoList[i] = new SourceFieldInfo(source.SourceFieldInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SinkDatabase", this.SinkDatabase);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "SourceDatabase", this.SourceDatabase);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SinkType", this.SinkType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamArrayObj(map, prefix + "SourceFieldInfoList.", this.SourceFieldInfoList);

    }
}

