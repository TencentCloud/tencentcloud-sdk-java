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

public class ListTWeSeeTasksRequest extends AbstractModel {

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
    * 算法类目。可选值：
- `COMPREHENSION`：视觉理解
- `HIGHLIGHT`：视频浓缩
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

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
    * 算法类型。

当 ServiceCategory 为 `COMPREHENSION` 时，可选值包括：
- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
- `CONT_PERSON_MOTIONLESS`：静姿检测

当 ServiceCategory 为 `HIGHLIGHT` 时，可选值包括：
- `COMP_HIGHLIGHT`：视频浓缩
    */
    @SerializedName("ServiceTypes")
    @Expose
    private String [] ServiceTypes;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * 查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * 要查询的任务的状态条件。不传则不按照状态过滤，可选值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL
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
     * Get 算法类目。可选值：
- `COMPREHENSION`：视觉理解
- `HIGHLIGHT`：视频浓缩 
     * @return ServiceCategory 算法类目。可选值：
- `COMPREHENSION`：视觉理解
- `HIGHLIGHT`：视频浓缩
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set 算法类目。可选值：
- `COMPREHENSION`：视觉理解
- `HIGHLIGHT`：视频浓缩
     * @param ServiceCategory 算法类目。可选值：
- `COMPREHENSION`：视觉理解
- `HIGHLIGHT`：视频浓缩
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
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
     * Get 算法类型。

当 ServiceCategory 为 `COMPREHENSION` 时，可选值包括：
- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
- `CONT_PERSON_MOTIONLESS`：静姿检测

当 ServiceCategory 为 `HIGHLIGHT` 时，可选值包括：
- `COMP_HIGHLIGHT`：视频浓缩 
     * @return ServiceTypes 算法类型。

当 ServiceCategory 为 `COMPREHENSION` 时，可选值包括：
- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
- `CONT_PERSON_MOTIONLESS`：静姿检测

当 ServiceCategory 为 `HIGHLIGHT` 时，可选值包括：
- `COMP_HIGHLIGHT`：视频浓缩
     */
    public String [] getServiceTypes() {
        return this.ServiceTypes;
    }

    /**
     * Set 算法类型。

当 ServiceCategory 为 `COMPREHENSION` 时，可选值包括：
- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
- `CONT_PERSON_MOTIONLESS`：静姿检测

当 ServiceCategory 为 `HIGHLIGHT` 时，可选值包括：
- `COMP_HIGHLIGHT`：视频浓缩
     * @param ServiceTypes 算法类型。

当 ServiceCategory 为 `COMPREHENSION` 时，可选值包括：
- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
- `CONT_PERSON_MOTIONLESS`：静姿检测

当 ServiceCategory 为 `HIGHLIGHT` 时，可选值包括：
- `COMP_HIGHLIGHT`：视频浓缩
     */
    public void setServiceTypes(String [] ServiceTypes) {
        this.ServiceTypes = ServiceTypes;
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
     * Get 查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。 
     * @return StartTimeMs 查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set 查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
     * @param StartTimeMs 查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get 查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。 
     * @return EndTimeMs 查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set 查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
     * @param EndTimeMs 查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get 要查询的任务的状态条件。不传则不按照状态过滤，可选值：

- `1`：失败
- `2`：空结果
- `3`：有效结果 
     * @return Status 要查询的任务的状态条件。不传则不按照状态过滤，可选值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 要查询的任务的状态条件。不传则不按照状态过滤，可选值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
     * @param Status 要查询的任务的状态条件。不传则不按照状态过滤，可选值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL 
     * @return FileURLExpireTime 下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL
     */
    public Long getFileURLExpireTime() {
        return this.FileURLExpireTime;
    }

    /**
     * Set 下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL
     * @param FileURLExpireTime 下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL
     */
    public void setFileURLExpireTime(Long FileURLExpireTime) {
        this.FileURLExpireTime = FileURLExpireTime;
    }

    public ListTWeSeeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTWeSeeTasksRequest(ListTWeSeeTasksRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ServiceTypes != null) {
            this.ServiceTypes = new String[source.ServiceTypes.length];
            for (int i = 0; i < source.ServiceTypes.length; i++) {
                this.ServiceTypes[i] = new String(source.ServiceTypes[i]);
            }
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ServiceTypes.", this.ServiceTypes);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileURLExpireTime", this.FileURLExpireTime);

    }
}

