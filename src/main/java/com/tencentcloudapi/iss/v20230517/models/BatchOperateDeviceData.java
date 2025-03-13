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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperateDeviceData extends AbstractModel {

    /**
    * 任务 ID（用于在查询任务的子任务列表接口ListSubTasks中查询任务进度）
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 任务 ID（用于在查询任务的子任务列表接口ListSubTasks中查询任务进度） 
     * @return TaskId 任务 ID（用于在查询任务的子任务列表接口ListSubTasks中查询任务进度）
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID（用于在查询任务的子任务列表接口ListSubTasks中查询任务进度）
     * @param TaskId 任务 ID（用于在查询任务的子任务列表接口ListSubTasks中查询任务进度）
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public BatchOperateDeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperateDeviceData(BatchOperateDeviceData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

