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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：Task
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：DescribeTaskStatus
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 任务ID，"上传文件"接口返回的DataResId，形如abc-xyz123
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例ID，不传默认为系统分配的初始实例。
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

    /**
     * Get 模块名，本接口取值：Task 
     * @return Module 模块名，本接口取值：Task
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：Task
     * @param Module 模块名，本接口取值：Task
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：DescribeTaskStatus 
     * @return Operation 操作名，本接口取值：DescribeTaskStatus
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：DescribeTaskStatus
     * @param Operation 操作名，本接口取值：DescribeTaskStatus
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 任务ID，"上传文件"接口返回的DataResId，形如abc-xyz123 
     * @return TaskId 任务ID，"上传文件"接口返回的DataResId，形如abc-xyz123
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，"上传文件"接口返回的DataResId，形如abc-xyz123
     * @param TaskId 任务ID，"上传文件"接口返回的DataResId，形如abc-xyz123
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例ID，不传默认为系统分配的初始实例。 
     * @return InstId 实例ID，不传默认为系统分配的初始实例。
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * Set 实例ID，不传默认为系统分配的初始实例。
     * @param InstId 实例ID，不传默认为系统分配的初始实例。
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstId", this.InstId);

    }
}

