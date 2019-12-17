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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Dependence extends AbstractModel{

    /**
    * 依赖关系的起点任务名称
    */
    @SerializedName("StartTask")
    @Expose
    private String StartTask;

    /**
    * 依赖关系的终点任务名称
    */
    @SerializedName("EndTask")
    @Expose
    private String EndTask;

    /**
     * Get 依赖关系的起点任务名称 
     * @return StartTask 依赖关系的起点任务名称
     */
    public String getStartTask() {
        return this.StartTask;
    }

    /**
     * Set 依赖关系的起点任务名称
     * @param StartTask 依赖关系的起点任务名称
     */
    public void setStartTask(String StartTask) {
        this.StartTask = StartTask;
    }

    /**
     * Get 依赖关系的终点任务名称 
     * @return EndTask 依赖关系的终点任务名称
     */
    public String getEndTask() {
        return this.EndTask;
    }

    /**
     * Set 依赖关系的终点任务名称
     * @param EndTask 依赖关系的终点任务名称
     */
    public void setEndTask(String EndTask) {
        this.EndTask = EndTask;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTask", this.StartTask);
        this.setParamSimple(map, prefix + "EndTask", this.EndTask);

    }
}

