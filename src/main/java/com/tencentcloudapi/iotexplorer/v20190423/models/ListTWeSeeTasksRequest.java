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
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>算法类目。可选值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
    * <p>分页拉取数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页拉取偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>算法类型。</p><p>当 ServiceCategory 为 <code>COMPREHENSION</code> 时，可选值包括：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>CONT_PERSON_MOTIONLESS</code>：静姿检测</li></ul><p>当 ServiceCategory 为 <code>HIGHLIGHT</code> 时，可选值包括：</p><ul><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
    */
    @SerializedName("ServiceTypes")
    @Expose
    private String [] ServiceTypes;

    /**
    * <p>通道 ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * <p>查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * <p>要查询的任务的状态条件。不传则不按照状态过滤，可选值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL</p>
    */
    @SerializedName("FileURLExpireTime")
    @Expose
    private Long FileURLExpireTime;

    /**
    * <p>任务结果过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private VisionRecognitionTaskFilter [] Filters;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>算法类目。可选值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul> 
     * @return ServiceCategory <p>算法类目。可选值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set <p>算法类目。可选值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
     * @param ServiceCategory <p>算法类目。可选值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    /**
     * Get <p>分页拉取数量</p> 
     * @return Limit <p>分页拉取数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页拉取数量</p>
     * @param Limit <p>分页拉取数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页拉取偏移</p> 
     * @return Offset <p>分页拉取偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页拉取偏移</p>
     * @param Offset <p>分页拉取偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>算法类型。</p><p>当 ServiceCategory 为 <code>COMPREHENSION</code> 时，可选值包括：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>CONT_PERSON_MOTIONLESS</code>：静姿检测</li></ul><p>当 ServiceCategory 为 <code>HIGHLIGHT</code> 时，可选值包括：</p><ul><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul> 
     * @return ServiceTypes <p>算法类型。</p><p>当 ServiceCategory 为 <code>COMPREHENSION</code> 时，可选值包括：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>CONT_PERSON_MOTIONLESS</code>：静姿检测</li></ul><p>当 ServiceCategory 为 <code>HIGHLIGHT</code> 时，可选值包括：</p><ul><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public String [] getServiceTypes() {
        return this.ServiceTypes;
    }

    /**
     * Set <p>算法类型。</p><p>当 ServiceCategory 为 <code>COMPREHENSION</code> 时，可选值包括：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>CONT_PERSON_MOTIONLESS</code>：静姿检测</li></ul><p>当 ServiceCategory 为 <code>HIGHLIGHT</code> 时，可选值包括：</p><ul><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
     * @param ServiceTypes <p>算法类型。</p><p>当 ServiceCategory 为 <code>COMPREHENSION</code> 时，可选值包括：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>CONT_PERSON_MOTIONLESS</code>：静姿检测</li></ul><p>当 ServiceCategory 为 <code>HIGHLIGHT</code> 时，可选值包括：</p><ul><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public void setServiceTypes(String [] ServiceTypes) {
        this.ServiceTypes = ServiceTypes;
    }

    /**
     * Get <p>通道 ID</p> 
     * @return ChannelId <p>通道 ID</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p>
     * @param ChannelId <p>通道 ID</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p> 
     * @return StartTimeMs <p>查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set <p>查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
     * @param StartTimeMs <p>查询任务时间范围的起始时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get <p>查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p> 
     * @return EndTimeMs <p>查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set <p>查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
     * @param EndTimeMs <p>查询任务时间范围的结束时间（毫秒级 UNIX 时间戳）。不传则不生效时间范围条件。</p>
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get <p>要查询的任务的状态条件。不传则不按照状态过滤，可选值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li></ul> 
     * @return Status <p>要查询的任务的状态条件。不传则不按照状态过滤，可选值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>要查询的任务的状态条件。不传则不按照状态过滤，可选值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li></ul>
     * @param Status <p>要查询的任务的状态条件。不传则不按照状态过滤，可选值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL</p> 
     * @return FileURLExpireTime <p>下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL</p>
     */
    public Long getFileURLExpireTime() {
        return this.FileURLExpireTime;
    }

    /**
     * Set <p>下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL</p>
     * @param FileURLExpireTime <p>下载 URL 的过期时间（秒级 UNIX 时间戳）。若传入该参数，则响应中将包含所有文件的下载 URL</p>
     */
    public void setFileURLExpireTime(Long FileURLExpireTime) {
        this.FileURLExpireTime = FileURLExpireTime;
    }

    /**
     * Get <p>任务结果过滤条件</p> 
     * @return Filters <p>任务结果过滤条件</p>
     */
    public VisionRecognitionTaskFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>任务结果过滤条件</p>
     * @param Filters <p>任务结果过滤条件</p>
     */
    public void setFilters(VisionRecognitionTaskFilter [] Filters) {
        this.Filters = Filters;
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
        if (source.Filters != null) {
            this.Filters = new VisionRecognitionTaskFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new VisionRecognitionTaskFilter(source.Filters[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

