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
    * 分区字段
    */
    @SerializedName("Partitions")
    @Expose
    private Partition [] Partitions;

    /**
    * 建表属性
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 建表模式，0:向导模式，1:ddl
    */
    @SerializedName("TableMode")
    @Expose
    private Long TableMode;

    /**
    * DLC表版本，v1/v2
    */
    @SerializedName("TableVersion")
    @Expose
    private String TableVersion;

    /**
    * 是否upsert写入
    */
    @SerializedName("UpsertFlag")
    @Expose
    private Boolean UpsertFlag;

    /**
    * 表描述信息
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * 增加的文件数量阈值, 超过值将触发小文件合并
    */
    @SerializedName("AddDataFiles")
    @Expose
    private Long AddDataFiles;

    /**
    * 增加的Equality delete数量阈值, 超过值将触发小文件合并
    */
    @SerializedName("AddEqualityDeletes")
    @Expose
    private Long AddEqualityDeletes;

    /**
    * 增加的Position delete数量阈值, 超过值将触发小文件合并
    */
    @SerializedName("AddPositionDeletes")
    @Expose
    private Long AddPositionDeletes;

    /**
    * 增加的delete file数量阈值
    */
    @SerializedName("AddDeleteFiles")
    @Expose
    private Long AddDeleteFiles;

    /**
    * 下游节点数据源ID
    */
    @SerializedName("TargetDatasourceId")
    @Expose
    private String TargetDatasourceId;

    /**
    * dlc upsert主键
    */
    @SerializedName("UpsertKeys")
    @Expose
    private String [] UpsertKeys;

    /**
    * dlc表治理信息
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

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

    /**
     * Get 分区字段 
     * @return Partitions 分区字段
     */
    public Partition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区字段
     * @param Partitions 分区字段
     */
    public void setPartitions(Partition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 建表属性 
     * @return Properties 建表属性
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 建表属性
     * @param Properties 建表属性
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 建表模式，0:向导模式，1:ddl 
     * @return TableMode 建表模式，0:向导模式，1:ddl
     */
    public Long getTableMode() {
        return this.TableMode;
    }

    /**
     * Set 建表模式，0:向导模式，1:ddl
     * @param TableMode 建表模式，0:向导模式，1:ddl
     */
    public void setTableMode(Long TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get DLC表版本，v1/v2 
     * @return TableVersion DLC表版本，v1/v2
     */
    public String getTableVersion() {
        return this.TableVersion;
    }

    /**
     * Set DLC表版本，v1/v2
     * @param TableVersion DLC表版本，v1/v2
     */
    public void setTableVersion(String TableVersion) {
        this.TableVersion = TableVersion;
    }

    /**
     * Get 是否upsert写入 
     * @return UpsertFlag 是否upsert写入
     */
    public Boolean getUpsertFlag() {
        return this.UpsertFlag;
    }

    /**
     * Set 是否upsert写入
     * @param UpsertFlag 是否upsert写入
     */
    public void setUpsertFlag(Boolean UpsertFlag) {
        this.UpsertFlag = UpsertFlag;
    }

    /**
     * Get 表描述信息 
     * @return TableComment 表描述信息
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set 表描述信息
     * @param TableComment 表描述信息
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get 增加的文件数量阈值, 超过值将触发小文件合并 
     * @return AddDataFiles 增加的文件数量阈值, 超过值将触发小文件合并
     */
    public Long getAddDataFiles() {
        return this.AddDataFiles;
    }

    /**
     * Set 增加的文件数量阈值, 超过值将触发小文件合并
     * @param AddDataFiles 增加的文件数量阈值, 超过值将触发小文件合并
     */
    public void setAddDataFiles(Long AddDataFiles) {
        this.AddDataFiles = AddDataFiles;
    }

    /**
     * Get 增加的Equality delete数量阈值, 超过值将触发小文件合并 
     * @return AddEqualityDeletes 增加的Equality delete数量阈值, 超过值将触发小文件合并
     */
    public Long getAddEqualityDeletes() {
        return this.AddEqualityDeletes;
    }

    /**
     * Set 增加的Equality delete数量阈值, 超过值将触发小文件合并
     * @param AddEqualityDeletes 增加的Equality delete数量阈值, 超过值将触发小文件合并
     */
    public void setAddEqualityDeletes(Long AddEqualityDeletes) {
        this.AddEqualityDeletes = AddEqualityDeletes;
    }

    /**
     * Get 增加的Position delete数量阈值, 超过值将触发小文件合并 
     * @return AddPositionDeletes 增加的Position delete数量阈值, 超过值将触发小文件合并
     */
    public Long getAddPositionDeletes() {
        return this.AddPositionDeletes;
    }

    /**
     * Set 增加的Position delete数量阈值, 超过值将触发小文件合并
     * @param AddPositionDeletes 增加的Position delete数量阈值, 超过值将触发小文件合并
     */
    public void setAddPositionDeletes(Long AddPositionDeletes) {
        this.AddPositionDeletes = AddPositionDeletes;
    }

    /**
     * Get 增加的delete file数量阈值 
     * @return AddDeleteFiles 增加的delete file数量阈值
     */
    public Long getAddDeleteFiles() {
        return this.AddDeleteFiles;
    }

    /**
     * Set 增加的delete file数量阈值
     * @param AddDeleteFiles 增加的delete file数量阈值
     */
    public void setAddDeleteFiles(Long AddDeleteFiles) {
        this.AddDeleteFiles = AddDeleteFiles;
    }

    /**
     * Get 下游节点数据源ID 
     * @return TargetDatasourceId 下游节点数据源ID
     */
    public String getTargetDatasourceId() {
        return this.TargetDatasourceId;
    }

    /**
     * Set 下游节点数据源ID
     * @param TargetDatasourceId 下游节点数据源ID
     */
    public void setTargetDatasourceId(String TargetDatasourceId) {
        this.TargetDatasourceId = TargetDatasourceId;
    }

    /**
     * Get dlc upsert主键 
     * @return UpsertKeys dlc upsert主键
     */
    public String [] getUpsertKeys() {
        return this.UpsertKeys;
    }

    /**
     * Set dlc upsert主键
     * @param UpsertKeys dlc upsert主键
     */
    public void setUpsertKeys(String [] UpsertKeys) {
        this.UpsertKeys = UpsertKeys;
    }

    /**
     * Get dlc表治理信息 
     * @return TableBaseInfo dlc表治理信息
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set dlc表治理信息
     * @param TableBaseInfo dlc表治理信息
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
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
        if (source.Partitions != null) {
            this.Partitions = new Partition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partition(source.Partitions[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.TableMode != null) {
            this.TableMode = new Long(source.TableMode);
        }
        if (source.TableVersion != null) {
            this.TableVersion = new String(source.TableVersion);
        }
        if (source.UpsertFlag != null) {
            this.UpsertFlag = new Boolean(source.UpsertFlag);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.AddDataFiles != null) {
            this.AddDataFiles = new Long(source.AddDataFiles);
        }
        if (source.AddEqualityDeletes != null) {
            this.AddEqualityDeletes = new Long(source.AddEqualityDeletes);
        }
        if (source.AddPositionDeletes != null) {
            this.AddPositionDeletes = new Long(source.AddPositionDeletes);
        }
        if (source.AddDeleteFiles != null) {
            this.AddDeleteFiles = new Long(source.AddDeleteFiles);
        }
        if (source.TargetDatasourceId != null) {
            this.TargetDatasourceId = new String(source.TargetDatasourceId);
        }
        if (source.UpsertKeys != null) {
            this.UpsertKeys = new String[source.UpsertKeys.length];
            for (int i = 0; i < source.UpsertKeys.length; i++) {
                this.UpsertKeys[i] = new String(source.UpsertKeys[i]);
            }
        }
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
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
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamSimple(map, prefix + "TableVersion", this.TableVersion);
        this.setParamSimple(map, prefix + "UpsertFlag", this.UpsertFlag);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "AddDataFiles", this.AddDataFiles);
        this.setParamSimple(map, prefix + "AddEqualityDeletes", this.AddEqualityDeletes);
        this.setParamSimple(map, prefix + "AddPositionDeletes", this.AddPositionDeletes);
        this.setParamSimple(map, prefix + "AddDeleteFiles", this.AddDeleteFiles);
        this.setParamSimple(map, prefix + "TargetDatasourceId", this.TargetDatasourceId);
        this.setParamArraySimple(map, prefix + "UpsertKeys.", this.UpsertKeys);
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);

    }
}

