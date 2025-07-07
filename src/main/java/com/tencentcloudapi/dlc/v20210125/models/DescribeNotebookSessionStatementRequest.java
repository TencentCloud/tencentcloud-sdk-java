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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSessionStatementRequest extends AbstractModel {

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Session Statement唯一标识
    */
    @SerializedName("StatementId")
    @Expose
    private String StatementId;

    /**
    * 任务唯一标识
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get Session唯一标识 
     * @return SessionId Session唯一标识
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
     * @param SessionId Session唯一标识
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Session Statement唯一标识 
     * @return StatementId Session Statement唯一标识
     */
    public String getStatementId() {
        return this.StatementId;
    }

    /**
     * Set Session Statement唯一标识
     * @param StatementId Session Statement唯一标识
     */
    public void setStatementId(String StatementId) {
        this.StatementId = StatementId;
    }

    /**
     * Get 任务唯一标识 
     * @return TaskId 任务唯一标识
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一标识
     * @param TaskId 任务唯一标识
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeNotebookSessionStatementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionStatementRequest(DescribeNotebookSessionStatementRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.StatementId != null) {
            this.StatementId = new String(source.StatementId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StatementId", this.StatementId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

