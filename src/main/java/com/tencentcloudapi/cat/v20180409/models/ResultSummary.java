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

public class ResultSummary extends AbstractModel{

    /**
    * 统计时间
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 实时可用率
    */
    @SerializedName("AvailRatio")
    @Expose
    private Float AvailRatio;

    /**
    * 实时响应时间
    */
    @SerializedName("ReponseTime")
    @Expose
    private Float ReponseTime;

    /**
     * Get 统计时间 
     * @return LogTime 统计时间
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 统计时间
     * @param LogTime 统计时间
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实时可用率 
     * @return AvailRatio 实时可用率
     */
    public Float getAvailRatio() {
        return this.AvailRatio;
    }

    /**
     * Set 实时可用率
     * @param AvailRatio 实时可用率
     */
    public void setAvailRatio(Float AvailRatio) {
        this.AvailRatio = AvailRatio;
    }

    /**
     * Get 实时响应时间 
     * @return ReponseTime 实时响应时间
     */
    public Float getReponseTime() {
        return this.ReponseTime;
    }

    /**
     * Set 实时响应时间
     * @param ReponseTime 实时响应时间
     */
    public void setReponseTime(Float ReponseTime) {
        this.ReponseTime = ReponseTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AvailRatio", this.AvailRatio);
        this.setParamSimple(map, prefix + "ReponseTime", this.ReponseTime);

    }
}

