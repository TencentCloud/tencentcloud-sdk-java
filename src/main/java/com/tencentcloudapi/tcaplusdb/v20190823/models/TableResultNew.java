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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableResultNew extends AbstractModel{

    /**
    * 表格实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 表格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get 表格实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInstanceId 表格实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表格实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 表格实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 表格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIdlType 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIdlType 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupId 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupId 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskIds 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIds 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

