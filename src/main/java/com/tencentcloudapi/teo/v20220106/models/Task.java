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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 资源
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 任务类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务完成时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务ID 
     * @return JobId 任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID
     * @param JobId 任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 资源 
     * @return Target 资源
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 资源
     * @param Target 资源
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 任务类型 
     * @return Type 任务类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型
     * @param Type 任务类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务完成时间 
     * @return UpdateTime 任务完成时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务完成时间
     * @param UpdateTime 任务完成时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

