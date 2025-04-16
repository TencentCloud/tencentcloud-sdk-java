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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchSqlTask extends AbstractModel {

    /**
    * SQL子任务唯一标识
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 运行SQL
    */
    @SerializedName("ExecuteSQL")
    @Expose
    private String ExecuteSQL;

    /**
    * 任务信息，成功则返回：Task Success!，失败则返回异常信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get SQL子任务唯一标识 
     * @return TaskId SQL子任务唯一标识
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set SQL子任务唯一标识
     * @param TaskId SQL子任务唯一标识
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 运行SQL 
     * @return ExecuteSQL 运行SQL
     */
    public String getExecuteSQL() {
        return this.ExecuteSQL;
    }

    /**
     * Set 运行SQL
     * @param ExecuteSQL 运行SQL
     */
    public void setExecuteSQL(String ExecuteSQL) {
        this.ExecuteSQL = ExecuteSQL;
    }

    /**
     * Get 任务信息，成功则返回：Task Success!，失败则返回异常信息 
     * @return Message 任务信息，成功则返回：Task Success!，失败则返回异常信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 任务信息，成功则返回：Task Success!，失败则返回异常信息
     * @param Message 任务信息，成功则返回：Task Success!，失败则返回异常信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public BatchSqlTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSqlTask(BatchSqlTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ExecuteSQL != null) {
            this.ExecuteSQL = new String(source.ExecuteSQL);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ExecuteSQL", this.ExecuteSQL);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

