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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusRequest  extends AbstractModel{

    /**
    * 模块名CommonMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名DescribeTaskStatus
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Integer TaskId;

    /**
     * 获取模块名CommonMng
     * @return Module 模块名CommonMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名CommonMng
     * @param Module 模块名CommonMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名DescribeTaskStatus
     * @return Operation 操作名DescribeTaskStatus
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名DescribeTaskStatus
     * @param Operation 操作名DescribeTaskStatus
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取任务ID
     * @return TaskId 任务ID
     */
    public Integer getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Integer TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

