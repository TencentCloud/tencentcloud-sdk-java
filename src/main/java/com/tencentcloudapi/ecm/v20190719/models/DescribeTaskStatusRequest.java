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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusRequest extends AbstractModel{

    /**
    * 任务描述
    */
    @SerializedName("TaskSet")
    @Expose
    private TaskInput [] TaskSet;

    /**
     * Get 任务描述 
     * @return TaskSet 任务描述
     */
    public TaskInput [] getTaskSet() {
        return this.TaskSet;
    }

    /**
     * Set 任务描述
     * @param TaskSet 任务描述
     */
    public void setTaskSet(TaskInput [] TaskSet) {
        this.TaskSet = TaskSet;
    }

    public DescribeTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskStatusRequest(DescribeTaskStatusRequest source) {
        if (source.TaskSet != null) {
            this.TaskSet = new TaskInput[source.TaskSet.length];
            for (int i = 0; i < source.TaskSet.length; i++) {
                this.TaskSet[i] = new TaskInput(source.TaskSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskSet.", this.TaskSet);

    }
}

