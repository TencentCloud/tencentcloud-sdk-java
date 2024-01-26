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

public class KillTasksTestRunRequest extends AbstractModel {

    /**
    * 作业ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 任务编号列表
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get 作业ID 
     * @return Id 作业ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 作业ID
     * @param Id 作业ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 任务编号列表 
     * @return TaskIds 任务编号列表
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务编号列表
     * @param TaskIds 任务编号列表
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public KillTasksTestRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillTasksTestRunRequest(KillTasksTestRunRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

