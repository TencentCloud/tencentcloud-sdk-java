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

public class ParamGetTestRunTaskInstancesStatusInfoTask extends AbstractModel {

    /**
    * 记录编号
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 任务编号
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 记录编号 
     * @return RecordId 记录编号
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录编号
     * @param RecordId 记录编号
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 任务编号 
     * @return TaskId 任务编号
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务编号
     * @param TaskId 任务编号
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public ParamGetTestRunTaskInstancesStatusInfoTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamGetTestRunTaskInstancesStatusInfoTask(ParamGetTestRunTaskInstancesStatusInfoTask source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

