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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operation  extends AbstractModel{

    /**
    * 操作唯一id
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 操作开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 操作类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 操作详情
    */
    @SerializedName("Detail")
    @Expose
    private OperationDetail Detail;

    /**
    * 操作结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 流程任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDetail [] Tasks;

    /**
    * 操作进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
     * 获取操作唯一id
     * @return Id 操作唯一id
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置操作唯一id
     * @param Id 操作唯一id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取操作开始时间
     * @return StartTime 操作开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置操作开始时间
     * @param StartTime 操作开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取操作类型
     * @return Type 操作类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置操作类型
     * @param Type 操作类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取操作详情
     * @return Detail 操作详情
     */
    public OperationDetail getDetail() {
        return this.Detail;
    }

    /**
     * 设置操作详情
     * @param Detail 操作详情
     */
    public void setDetail(OperationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * 获取操作结果
     * @return Result 操作结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * 设置操作结果
     * @param Result 操作结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * 获取流程任务信息
     * @return Tasks 流程任务信息
     */
    public TaskDetail [] getTasks() {
        return this.Tasks;
    }

    /**
     * 设置流程任务信息
     * @param Tasks 流程任务信息
     */
    public void setTasks(TaskDetail [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * 获取操作进度
     * @return Progress 操作进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * 设置操作进度
     * @param Progress 操作进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

