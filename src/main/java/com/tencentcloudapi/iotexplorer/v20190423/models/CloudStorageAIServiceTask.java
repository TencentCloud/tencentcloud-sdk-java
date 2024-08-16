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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorageAIServiceTask extends AbstractModel {

    /**
    * 云存 AI 服务任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 云存 AI 服务类型。可能取值：

- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 对应云存视频的起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 对应云存视频的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；4：执行中）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 任务输出文件列表
    */
    @SerializedName("Files")
    @Expose
    private String [] Files;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 自定义任务 ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
     * Get 云存 AI 服务任务 ID 
     * @return TaskId 云存 AI 服务任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 云存 AI 服务任务 ID
     * @param TaskId 云存 AI 服务任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 云存 AI 服务类型。可能取值：

- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩 
     * @return ServiceType 云存 AI 服务类型。可能取值：

- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 云存 AI 服务类型。可能取值：

- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
     * @param ServiceType 云存 AI 服务类型。可能取值：

- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 对应云存视频的起始时间 
     * @return StartTime 对应云存视频的起始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 对应云存视频的起始时间
     * @param StartTime 对应云存视频的起始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 对应云存视频的结束时间 
     * @return EndTime 对应云存视频的结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 对应云存视频的结束时间
     * @param EndTime 对应云存视频的结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；4：执行中） 
     * @return Status 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；4：执行中）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；4：执行中）
     * @param Status 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空；4：执行中）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务结果 
     * @return Result 任务结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 任务结果
     * @param Result 任务结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 任务输出文件列表 
     * @return Files 任务输出文件列表
     */
    public String [] getFiles() {
        return this.Files;
    }

    /**
     * Set 任务输出文件列表
     * @param Files 任务输出文件列表
     */
    public void setFiles(String [] Files) {
        this.Files = Files;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后更新时间 
     * @return UpdateTime 最后更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 自定义任务 ID 
     * @return CustomId 自定义任务 ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义任务 ID
     * @param CustomId 自定义任务 ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    public CloudStorageAIServiceTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorageAIServiceTask(CloudStorageAIServiceTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Files != null) {
            this.Files = new String[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new String(source.Files[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArraySimple(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);

    }
}

