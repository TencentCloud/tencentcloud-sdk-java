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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAvailRatioHistoryRequest extends AbstractModel{

    /**
    * 拨测任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 具体时间点
    */
    @SerializedName("TimeStamp")
    @Expose
    private String TimeStamp;

    /**
     * Get 拨测任务Id 
     * @return TaskId 拨测任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拨测任务Id
     * @param TaskId 拨测任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 具体时间点 
     * @return TimeStamp 具体时间点
     */
    public String getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 具体时间点
     * @param TimeStamp 具体时间点
     */
    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

