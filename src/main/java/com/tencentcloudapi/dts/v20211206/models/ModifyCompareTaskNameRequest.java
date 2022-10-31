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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCompareTaskNameRequest extends AbstractModel{

    /**
    * 迁移任务 Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 一致性校验任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
     * Get 迁移任务 Id 
     * @return JobId 迁移任务 Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 迁移任务 Id
     * @param JobId 迁移任务 Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9 
     * @return CompareTaskId 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9
     * @param CompareTaskId 对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 一致性校验任务名称 
     * @return TaskName 一致性校验任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 一致性校验任务名称
     * @param TaskName 一致性校验任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public ModifyCompareTaskNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompareTaskNameRequest(ModifyCompareTaskNameRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);

    }
}

