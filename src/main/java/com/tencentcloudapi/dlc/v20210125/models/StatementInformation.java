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

public class StatementInformation extends AbstractModel {

    /**
    * SQL任务唯一ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * SQL内容
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
     * Get SQL任务唯一ID 
     * @return TaskId SQL任务唯一ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set SQL任务唯一ID
     * @param TaskId SQL任务唯一ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get SQL内容 
     * @return SQL SQL内容
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set SQL内容
     * @param SQL SQL内容
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    public StatementInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatementInformation(StatementInformation source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SQL", this.SQL);

    }
}

