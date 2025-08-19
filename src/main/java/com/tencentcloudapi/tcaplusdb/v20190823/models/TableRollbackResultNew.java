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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableRollbackResultNew extends AbstractModel {

    /**
    * 表格实例ID，形如：tcaplus-3be64cbb
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 任务ID，对于创建单任务的接口有效
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格数据结构类型，如：`GENERIC`或`LIST`
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表格所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 错误信息
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * 任务ID列表，对于创建多任务的接口有效
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 上传的key文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 校验成功Key数量
    */
    @SerializedName("SuccKeyNum")
    @Expose
    private Long SuccKeyNum;

    /**
    * Key文件中包含总的Key数量
    */
    @SerializedName("TotalKeyNum")
    @Expose
    private Long TotalKeyNum;

    /**
     * Get 表格实例ID，形如：tcaplus-3be64cbb 
     * @return TableInstanceId 表格实例ID，形如：tcaplus-3be64cbb
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表格实例ID，形如：tcaplus-3be64cbb
     * @param TableInstanceId 表格实例ID，形如：tcaplus-3be64cbb
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 任务ID，对于创建单任务的接口有效 
     * @return TaskId 任务ID，对于创建单任务的接口有效
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，对于创建单任务的接口有效
     * @param TaskId 任务ID，对于创建单任务的接口有效
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 表格名称 
     * @return TableName 表格名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
     * @param TableName 表格名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表格数据结构类型，如：`GENERIC`或`LIST` 
     * @return TableType 表格数据结构类型，如：`GENERIC`或`LIST`
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表格数据结构类型，如：`GENERIC`或`LIST`
     * @param TableType 表格数据结构类型，如：`GENERIC`或`LIST`
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR` 
     * @return TableIdlType 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
     * @param TableIdlType 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表格所属表格组ID 
     * @return TableGroupId 表格所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格所属表格组ID
     * @param TableGroupId 表格所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 错误信息 
     * @return Error 错误信息
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
     * @param Error 错误信息
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get 任务ID列表，对于创建多任务的接口有效 
     * @return TaskIds 任务ID列表，对于创建多任务的接口有效
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务ID列表，对于创建多任务的接口有效
     * @param TaskIds 任务ID列表，对于创建多任务的接口有效
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 上传的key文件ID 
     * @return FileId 上传的key文件ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 上传的key文件ID
     * @param FileId 上传的key文件ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 校验成功Key数量 
     * @return SuccKeyNum 校验成功Key数量
     */
    public Long getSuccKeyNum() {
        return this.SuccKeyNum;
    }

    /**
     * Set 校验成功Key数量
     * @param SuccKeyNum 校验成功Key数量
     */
    public void setSuccKeyNum(Long SuccKeyNum) {
        this.SuccKeyNum = SuccKeyNum;
    }

    /**
     * Get Key文件中包含总的Key数量 
     * @return TotalKeyNum Key文件中包含总的Key数量
     */
    public Long getTotalKeyNum() {
        return this.TotalKeyNum;
    }

    /**
     * Set Key文件中包含总的Key数量
     * @param TotalKeyNum Key文件中包含总的Key数量
     */
    public void setTotalKeyNum(Long TotalKeyNum) {
        this.TotalKeyNum = TotalKeyNum;
    }

    public TableRollbackResultNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableRollbackResultNew(TableRollbackResultNew source) {
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SuccKeyNum != null) {
            this.SuccKeyNum = new Long(source.SuccKeyNum);
        }
        if (source.TotalKeyNum != null) {
            this.TotalKeyNum = new Long(source.TotalKeyNum);
        }
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
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SuccKeyNum", this.SuccKeyNum);
        this.setParamSimple(map, prefix + "TotalKeyNum", this.TotalKeyNum);

    }
}

