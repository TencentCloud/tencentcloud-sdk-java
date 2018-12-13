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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMultiDevicesResponse  extends AbstractModel{

    /**
    * 任务 ID，由批量创建设备接口返回
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 设备详细信息列表
    */
    @SerializedName("DevicesInfo")
    @Expose
    private MultiDevicesInfo [] DevicesInfo;

    /**
    * 该任务创建设备的总数
    */
    @SerializedName("TotalDevNum")
    @Expose
    private Integer TotalDevNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务 ID，由批量创建设备接口返回
     * @return TaskId 任务 ID，由批量创建设备接口返回
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务 ID，由批量创建设备接口返回
     * @param TaskId 任务 ID，由批量创建设备接口返回
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取设备详细信息列表
     * @return DevicesInfo 设备详细信息列表
     */
    public MultiDevicesInfo [] getDevicesInfo() {
        return this.DevicesInfo;
    }

    /**
     * 设置设备详细信息列表
     * @param DevicesInfo 设备详细信息列表
     */
    public void setDevicesInfo(MultiDevicesInfo [] DevicesInfo) {
        this.DevicesInfo = DevicesInfo;
    }

    /**
     * 获取该任务创建设备的总数
     * @return TotalDevNum 该任务创建设备的总数
     */
    public Integer getTotalDevNum() {
        return this.TotalDevNum;
    }

    /**
     * 设置该任务创建设备的总数
     * @param TotalDevNum 该任务创建设备的总数
     */
    public void setTotalDevNum(Integer TotalDevNum) {
        this.TotalDevNum = TotalDevNum;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "DevicesInfo.", this.DevicesInfo);
        this.setParamSimple(map, prefix + "TotalDevNum", this.TotalDevNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

