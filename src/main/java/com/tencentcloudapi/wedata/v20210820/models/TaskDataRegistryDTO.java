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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDataRegistryDTO extends AbstractModel {

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbGuid")
    @Expose
    private String DbGuid;

    /**
    * 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGuid")
    @Expose
    private String TableGuid;

    /**
    * 分区名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * 登记项id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataFlowType")
    @Expose
    private String DataFlowType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 主账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
    * 表物理唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePhysicalId")
    @Expose
    private String TablePhysicalId;

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbGuid 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbGuid() {
        return this.DbGuid;
    }

    /**
     * Set 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbGuid 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbGuid(String DbGuid) {
        this.DbGuid = DbGuid;
    }

    /**
     * Get 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGuid 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGuid() {
        return this.TableGuid;
    }

    /**
     * Set 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGuid 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGuid(String TableGuid) {
        this.TableGuid = TableGuid;
    }

    /**
     * Get 分区名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionName 分区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set 分区名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionName 分区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get 登记项id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 登记项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 登记项id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 登记项id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataFlowType 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataFlowType() {
        return this.DataFlowType;
    }

    /**
     * Set 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataFlowType 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataFlowType(String DataFlowType) {
        this.DataFlowType = DataFlowType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 主账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 主账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 主账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 表物理唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePhysicalId 表物理唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTablePhysicalId() {
        return this.TablePhysicalId;
    }

    /**
     * Set 表物理唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePhysicalId 表物理唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePhysicalId(String TablePhysicalId) {
        this.TablePhysicalId = TablePhysicalId;
    }

    public TaskDataRegistryDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDataRegistryDTO(TaskDataRegistryDTO source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DbGuid != null) {
            this.DbGuid = new String(source.DbGuid);
        }
        if (source.TableGuid != null) {
            this.TableGuid = new String(source.TableGuid);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.DataFlowType != null) {
            this.DataFlowType = new String(source.DataFlowType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
        if (source.TablePhysicalId != null) {
            this.TablePhysicalId = new String(source.TablePhysicalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DbGuid", this.DbGuid);
        this.setParamSimple(map, prefix + "TableGuid", this.TableGuid);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "DataFlowType", this.DataFlowType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Ext", this.Ext);
        this.setParamSimple(map, prefix + "TablePhysicalId", this.TablePhysicalId);

    }
}

