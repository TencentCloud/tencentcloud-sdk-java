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

public class ImportTableDTO extends AbstractModel {

    /**
    * 导入记录ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 导入进度信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 导入状态（1：初始，2：建表中，3：建表成功，4：建表失败，5：导入数据中，6：导入数据成功，7：导入数据失败 8：回滚失败)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportStatus")
    @Expose
    private Long ImportStatus;

    /**
    * 数据路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceDataPath")
    @Expose
    private String SourceDataPath;

    /**
    * 数据源ID
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
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 租户ID，即AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private Long TenantId;

    /**
    * 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserId")
    @Expose
    private Long OwnerUserId;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get 导入记录ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 导入记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 导入记录ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 导入记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 导入进度信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 导入进度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 导入进度信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 导入进度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 导入状态（1：初始，2：建表中，3：建表成功，4：建表失败，5：导入数据中，6：导入数据成功，7：导入数据失败 8：回滚失败)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportStatus 导入状态（1：初始，2：建表中，3：建表成功，4：建表失败，5：导入数据中，6：导入数据成功，7：导入数据失败 8：回滚失败)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImportStatus() {
        return this.ImportStatus;
    }

    /**
     * Set 导入状态（1：初始，2：建表中，3：建表成功，4：建表失败，5：导入数据中，6：导入数据成功，7：导入数据失败 8：回滚失败)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportStatus 导入状态（1：初始，2：建表中，3：建表成功，4：建表失败，5：导入数据中，6：导入数据成功，7：导入数据失败 8：回滚失败)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportStatus(Long ImportStatus) {
        this.ImportStatus = ImportStatus;
    }

    /**
     * Get 数据路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceDataPath 数据路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceDataPath() {
        return this.SourceDataPath;
    }

    /**
     * Set 数据路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceDataPath 数据路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceDataPath(String SourceDataPath) {
        this.SourceDataPath = SourceDataPath;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
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
     * Get 表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 租户ID，即AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户ID，即AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户ID，即AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户ID，即AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(Long TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 主账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserId 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserId 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserId(Long OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
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
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public ImportTableDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportTableDTO(ImportTableDTO source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ImportStatus != null) {
            this.ImportStatus = new Long(source.ImportStatus);
        }
        if (source.SourceDataPath != null) {
            this.SourceDataPath = new String(source.SourceDataPath);
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
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TenantId != null) {
            this.TenantId = new Long(source.TenantId);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new Long(source.OwnerUserId);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ImportStatus", this.ImportStatus);
        this.setParamSimple(map, prefix + "SourceDataPath", this.SourceDataPath);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

