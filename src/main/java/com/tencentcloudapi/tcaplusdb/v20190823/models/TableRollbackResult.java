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

public class TableRollbackResult  extends AbstractModel{

    /**
    * 表实例ID，形如：tcaplus-3be64cbb
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
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表数据结构类型，如：`GENERIC`或`LIST`
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
    * 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

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
    * 上传的key文件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 校验成功Key数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccKeyNum")
    @Expose
    private Long SuccKeyNum;

    /**
    * Key文件中包含总的Key数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalKeyNum")
    @Expose
    private Long TotalKeyNum;

    /**
     * 获取表实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     * @return TableInstanceId 表实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * 设置表实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 表实例ID，形如：tcaplus-3be64cbb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * 获取任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     * @return TaskId 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID，对于创建单任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取表名
注意：此字段可能返回 null，表示取不到有效值。
     * @return TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * 设置表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * 获取表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     * @return TableType 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * 设置表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * 获取表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @return TableIdlType 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * 设置表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIdlType 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * 获取表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return LogicZoneId 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * 设置表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicZoneId 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * 获取错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * 设置错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * 获取任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     * @return TaskIds 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * 设置任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIds 任务ID列表，对于创建多任务的接口有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * 获取上传的key文件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 上传的key文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置上传的key文件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 上传的key文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取校验成功Key数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return SuccKeyNum 校验成功Key数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccKeyNum() {
        return this.SuccKeyNum;
    }

    /**
     * 设置校验成功Key数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccKeyNum 校验成功Key数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccKeyNum(Long SuccKeyNum) {
        this.SuccKeyNum = SuccKeyNum;
    }

    /**
     * 获取Key文件中包含总的Key数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return TotalKeyNum Key文件中包含总的Key数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalKeyNum() {
        return this.TotalKeyNum;
    }

    /**
     * 设置Key文件中包含总的Key数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalKeyNum Key文件中包含总的Key数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalKeyNum(Long TotalKeyNum) {
        this.TotalKeyNum = TotalKeyNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SuccKeyNum", this.SuccKeyNum);
        this.setParamSimple(map, prefix + "TotalKeyNum", this.TotalKeyNum);

    }
}

