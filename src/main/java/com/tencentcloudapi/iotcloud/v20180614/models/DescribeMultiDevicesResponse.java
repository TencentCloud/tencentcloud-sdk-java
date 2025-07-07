/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMultiDevicesResponse extends AbstractModel {

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
    private Long TotalDevNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务 ID，由批量创建设备接口返回 
     * @return TaskId 任务 ID，由批量创建设备接口返回
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID，由批量创建设备接口返回
     * @param TaskId 任务 ID，由批量创建设备接口返回
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 设备详细信息列表 
     * @return DevicesInfo 设备详细信息列表
     */
    public MultiDevicesInfo [] getDevicesInfo() {
        return this.DevicesInfo;
    }

    /**
     * Set 设备详细信息列表
     * @param DevicesInfo 设备详细信息列表
     */
    public void setDevicesInfo(MultiDevicesInfo [] DevicesInfo) {
        this.DevicesInfo = DevicesInfo;
    }

    /**
     * Get 该任务创建设备的总数 
     * @return TotalDevNum 该任务创建设备的总数
     */
    public Long getTotalDevNum() {
        return this.TotalDevNum;
    }

    /**
     * Set 该任务创建设备的总数
     * @param TotalDevNum 该任务创建设备的总数
     */
    public void setTotalDevNum(Long TotalDevNum) {
        this.TotalDevNum = TotalDevNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMultiDevicesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMultiDevicesResponse(DescribeMultiDevicesResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DevicesInfo != null) {
            this.DevicesInfo = new MultiDevicesInfo[source.DevicesInfo.length];
            for (int i = 0; i < source.DevicesInfo.length; i++) {
                this.DevicesInfo[i] = new MultiDevicesInfo(source.DevicesInfo[i]);
            }
        }
        if (source.TotalDevNum != null) {
            this.TotalDevNum = new Long(source.TotalDevNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "DevicesInfo.", this.DevicesInfo);
        this.setParamSimple(map, prefix + "TotalDevNum", this.TotalDevNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

