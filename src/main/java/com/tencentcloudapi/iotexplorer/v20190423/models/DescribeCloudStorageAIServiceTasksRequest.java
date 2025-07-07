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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageAIServiceTasksRequest extends AbstractModel {

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
    * 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 分页拉取数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页拉取偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 任务状态。可选值：
- （不传）：查询全部状态的任务
- `1`：失败
- `2`：成功但结果为空
- `3`：成功且结果非空
- `4`：执行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 用户 ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 设备名称列表。

当需要同时查询多台设备的任务列表时传入，优先级高于参数 `DeviceName`
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * 查询任务时间范围的起始时间（秒级 UNIX 时间戳）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询任务时间范围的结束时间（秒级 UNIX 时间戳）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 下载 URL 的过期时间。

若传入该参数，则响应中将包含所有文件的下载 URL
    */
    @SerializedName("FileURLExpireTime")
    @Expose
    private Long FileURLExpireTime;

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
     * Get 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解 
     * @return ServiceType 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
     * @param ServiceType 云存 AI 服务类型。可选值：
- `RealtimeObjectDetect`：目标检测
- `Highlight`：视频浓缩
- `VideoToText`：视频语义理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 分页拉取数量 
     * @return Limit 分页拉取数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页拉取数量
     * @param Limit 分页拉取数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页拉取偏移 
     * @return Offset 分页拉取偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页拉取偏移
     * @param Offset 分页拉取偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 任务状态。可选值：
- （不传）：查询全部状态的任务
- `1`：失败
- `2`：成功但结果为空
- `3`：成功且结果非空
- `4`：执行中 
     * @return Status 任务状态。可选值：
- （不传）：查询全部状态的任务
- `1`：失败
- `2`：成功但结果为空
- `3`：成功且结果非空
- `4`：执行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。可选值：
- （不传）：查询全部状态的任务
- `1`：失败
- `2`：成功但结果为空
- `3`：成功且结果非空
- `4`：执行中
     * @param Status 任务状态。可选值：
- （不传）：查询全部状态的任务
- `1`：失败
- `2`：成功但结果为空
- `3`：成功且结果非空
- `4`：执行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 用户 ID 
     * @return UserId 用户 ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID
     * @param UserId 用户 ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get 设备名称列表。

当需要同时查询多台设备的任务列表时传入，优先级高于参数 `DeviceName` 
     * @return DeviceNames 设备名称列表。

当需要同时查询多台设备的任务列表时传入，优先级高于参数 `DeviceName`
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * Set 设备名称列表。

当需要同时查询多台设备的任务列表时传入，优先级高于参数 `DeviceName`
     * @param DeviceNames 设备名称列表。

当需要同时查询多台设备的任务列表时传入，优先级高于参数 `DeviceName`
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * Get 查询任务时间范围的起始时间（秒级 UNIX 时间戳） 
     * @return StartTime 查询任务时间范围的起始时间（秒级 UNIX 时间戳）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询任务时间范围的起始时间（秒级 UNIX 时间戳）
     * @param StartTime 查询任务时间范围的起始时间（秒级 UNIX 时间戳）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询任务时间范围的结束时间（秒级 UNIX 时间戳） 
     * @return EndTime 查询任务时间范围的结束时间（秒级 UNIX 时间戳）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询任务时间范围的结束时间（秒级 UNIX 时间戳）
     * @param EndTime 查询任务时间范围的结束时间（秒级 UNIX 时间戳）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 下载 URL 的过期时间。

若传入该参数，则响应中将包含所有文件的下载 URL 
     * @return FileURLExpireTime 下载 URL 的过期时间。

若传入该参数，则响应中将包含所有文件的下载 URL
     */
    public Long getFileURLExpireTime() {
        return this.FileURLExpireTime;
    }

    /**
     * Set 下载 URL 的过期时间。

若传入该参数，则响应中将包含所有文件的下载 URL
     * @param FileURLExpireTime 下载 URL 的过期时间。

若传入该参数，则响应中将包含所有文件的下载 URL
     */
    public void setFileURLExpireTime(Long FileURLExpireTime) {
        this.FileURLExpireTime = FileURLExpireTime;
    }

    public DescribeCloudStorageAIServiceTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageAIServiceTasksRequest(DescribeCloudStorageAIServiceTasksRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.DeviceNames != null) {
            this.DeviceNames = new String[source.DeviceNames.length];
            for (int i = 0; i < source.DeviceNames.length; i++) {
                this.DeviceNames[i] = new String(source.DeviceNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.FileURLExpireTime != null) {
            this.FileURLExpireTime = new Long(source.FileURLExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileURLExpireTime", this.FileURLExpireTime);

    }
}

