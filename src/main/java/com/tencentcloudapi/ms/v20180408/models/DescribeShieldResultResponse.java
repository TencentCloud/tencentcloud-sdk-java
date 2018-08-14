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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShieldResultResponse  extends AbstractModel{

    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;

    /**
    * app加固前的详细信息
    */
    @SerializedName("AppDetailInfo")
    @Expose
    private AppDetailInfo AppDetailInfo;

    /**
    * app加固后的详细信息
    */
    @SerializedName("ShieldInfo")
    @Expose
    private ShieldInfo ShieldInfo;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @return TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @param TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取app加固前的详细信息
     * @return AppDetailInfo app加固前的详细信息
     */
    public AppDetailInfo getAppDetailInfo() {
        return this.AppDetailInfo;
    }

    /**
     * 设置app加固前的详细信息
     * @param AppDetailInfo app加固前的详细信息
     */
    public void setAppDetailInfo(AppDetailInfo AppDetailInfo) {
        this.AppDetailInfo = AppDetailInfo;
    }

    /**
     * 获取app加固后的详细信息
     * @return ShieldInfo app加固后的详细信息
     */
    public ShieldInfo getShieldInfo() {
        return this.ShieldInfo;
    }

    /**
     * 设置app加固后的详细信息
     * @param ShieldInfo app加固后的详细信息
     */
    public void setShieldInfo(ShieldInfo ShieldInfo) {
        this.ShieldInfo = ShieldInfo;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "AppDetailInfo.", this.AppDetailInfo);
        this.setParamObj(map, prefix + "ShieldInfo.", this.ShieldInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

