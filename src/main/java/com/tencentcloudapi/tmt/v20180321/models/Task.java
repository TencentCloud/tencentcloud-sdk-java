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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * 任务ID，可通过此ID在轮询接口获取识别状态与结果。注意：TaskId数据类型为字符串类型
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 任务ID，可通过此ID在轮询接口获取识别状态与结果。注意：TaskId数据类型为字符串类型 
     * @return TaskId 任务ID，可通过此ID在轮询接口获取识别状态与结果。注意：TaskId数据类型为字符串类型
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，可通过此ID在轮询接口获取识别状态与结果。注意：TaskId数据类型为字符串类型
     * @param TaskId 任务ID，可通过此ID在轮询接口获取识别状态与结果。注意：TaskId数据类型为字符串类型
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
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

