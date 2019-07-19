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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResultRequest  extends AbstractModel{

    /**
    * 异步任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Integer TaskId;

    /**
    * 计费订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * 获取异步任务ID
     * @return TaskId 异步任务ID
     */
    public Integer getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置异步任务ID
     * @param TaskId 异步任务ID
     */
    public void setTaskId(Integer TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取计费订单号
     * @return DealName 计费订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * 设置计费订单号
     * @param DealName 计费订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

