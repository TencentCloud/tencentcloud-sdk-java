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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskRunStatusRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务状态, 1001--未开始 1002--进行中（执行）1003--进行中（暂停）1004--执行结束
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 执行结果是否符合预期（当前扭转状态为执行结束时，需要必传此字段）
    */
    @SerializedName("IsExpect")
    @Expose
    private Boolean IsExpect;

    /**
    * 演习结论（当演习状态转变为执行结束时，需要填写此字段）
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

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
     * Get 任务状态, 1001--未开始 1002--进行中（执行）1003--进行中（暂停）1004--执行结束 
     * @return Status 任务状态, 1001--未开始 1002--进行中（执行）1003--进行中（暂停）1004--执行结束
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态, 1001--未开始 1002--进行中（执行）1003--进行中（暂停）1004--执行结束
     * @param Status 任务状态, 1001--未开始 1002--进行中（执行）1003--进行中（暂停）1004--执行结束
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 执行结果是否符合预期（当前扭转状态为执行结束时，需要必传此字段） 
     * @return IsExpect 执行结果是否符合预期（当前扭转状态为执行结束时，需要必传此字段）
     */
    public Boolean getIsExpect() {
        return this.IsExpect;
    }

    /**
     * Set 执行结果是否符合预期（当前扭转状态为执行结束时，需要必传此字段）
     * @param IsExpect 执行结果是否符合预期（当前扭转状态为执行结束时，需要必传此字段）
     */
    public void setIsExpect(Boolean IsExpect) {
        this.IsExpect = IsExpect;
    }

    /**
     * Get 演习结论（当演习状态转变为执行结束时，需要填写此字段） 
     * @return Summary 演习结论（当演习状态转变为执行结束时，需要填写此字段）
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 演习结论（当演习状态转变为执行结束时，需要填写此字段）
     * @param Summary 演习结论（当演习状态转变为执行结束时，需要填写此字段）
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public ModifyTaskRunStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskRunStatusRequest(ModifyTaskRunStatusRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsExpect != null) {
            this.IsExpect = new Boolean(source.IsExpect);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsExpect", this.IsExpect);
        this.setParamSimple(map, prefix + "Summary", this.Summary);

    }
}

