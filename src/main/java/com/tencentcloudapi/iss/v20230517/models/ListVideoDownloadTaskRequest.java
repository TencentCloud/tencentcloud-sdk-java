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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVideoDownloadTaskRequest extends AbstractModel {

    /**
    * 设备名称，用于模糊搜索
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 通道名称，用于模糊搜索
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 任务状态（0：准备中，1：执行中，2：已完成，3：失败）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 排序规则（仅支持 StartTime，倒序为-StartTime）
    */
    @SerializedName("SortRule")
    @Expose
    private String SortRule;

    /**
    * 响应是否携带预览地址(0:不携带；1:携带)
    */
    @SerializedName("WithPreviewUrl")
    @Expose
    private Long WithPreviewUrl;

    /**
    * 分页页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 下载任务 ID
    */
    @SerializedName("DownloadTaskId")
    @Expose
    private String DownloadTaskId;

    /**
    * 下载地址过期时间，单位秒，最大为 1 天， 86400秒
    */
    @SerializedName("UrlExpires")
    @Expose
    private Long UrlExpires;

    /**
    * 任务日期，默认当天
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 设备名称，用于模糊搜索 
     * @return DeviceName 设备名称，用于模糊搜索
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称，用于模糊搜索
     * @param DeviceName 设备名称，用于模糊搜索
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 通道名称，用于模糊搜索 
     * @return ChannelName 通道名称，用于模糊搜索
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通道名称，用于模糊搜索
     * @param ChannelName 通道名称，用于模糊搜索
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 任务状态（0：准备中，1：执行中，2：已完成，3：失败） 
     * @return Status 任务状态（0：准备中，1：执行中，2：已完成，3：失败）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（0：准备中，1：执行中，2：已完成，3：失败）
     * @param Status 任务状态（0：准备中，1：执行中，2：已完成，3：失败）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 排序规则（仅支持 StartTime，倒序为-StartTime） 
     * @return SortRule 排序规则（仅支持 StartTime，倒序为-StartTime）
     */
    public String getSortRule() {
        return this.SortRule;
    }

    /**
     * Set 排序规则（仅支持 StartTime，倒序为-StartTime）
     * @param SortRule 排序规则（仅支持 StartTime，倒序为-StartTime）
     */
    public void setSortRule(String SortRule) {
        this.SortRule = SortRule;
    }

    /**
     * Get 响应是否携带预览地址(0:不携带；1:携带) 
     * @return WithPreviewUrl 响应是否携带预览地址(0:不携带；1:携带)
     */
    public Long getWithPreviewUrl() {
        return this.WithPreviewUrl;
    }

    /**
     * Set 响应是否携带预览地址(0:不携带；1:携带)
     * @param WithPreviewUrl 响应是否携带预览地址(0:不携带；1:携带)
     */
    public void setWithPreviewUrl(Long WithPreviewUrl) {
        this.WithPreviewUrl = WithPreviewUrl;
    }

    /**
     * Get 分页页数 
     * @return PageNumber 分页页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页数
     * @param PageNumber 分页页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 下载任务 ID 
     * @return DownloadTaskId 下载任务 ID
     */
    public String getDownloadTaskId() {
        return this.DownloadTaskId;
    }

    /**
     * Set 下载任务 ID
     * @param DownloadTaskId 下载任务 ID
     */
    public void setDownloadTaskId(String DownloadTaskId) {
        this.DownloadTaskId = DownloadTaskId;
    }

    /**
     * Get 下载地址过期时间，单位秒，最大为 1 天， 86400秒 
     * @return UrlExpires 下载地址过期时间，单位秒，最大为 1 天， 86400秒
     */
    public Long getUrlExpires() {
        return this.UrlExpires;
    }

    /**
     * Set 下载地址过期时间，单位秒，最大为 1 天， 86400秒
     * @param UrlExpires 下载地址过期时间，单位秒，最大为 1 天， 86400秒
     */
    public void setUrlExpires(Long UrlExpires) {
        this.UrlExpires = UrlExpires;
    }

    /**
     * Get 任务日期，默认当天 
     * @return Date 任务日期，默认当天
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 任务日期，默认当天
     * @param Date 任务日期，默认当天
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public ListVideoDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoDownloadTaskRequest(ListVideoDownloadTaskRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SortRule != null) {
            this.SortRule = new String(source.SortRule);
        }
        if (source.WithPreviewUrl != null) {
            this.WithPreviewUrl = new Long(source.WithPreviewUrl);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DownloadTaskId != null) {
            this.DownloadTaskId = new String(source.DownloadTaskId);
        }
        if (source.UrlExpires != null) {
            this.UrlExpires = new Long(source.UrlExpires);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SortRule", this.SortRule);
        this.setParamSimple(map, prefix + "WithPreviewUrl", this.WithPreviewUrl);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DownloadTaskId", this.DownloadTaskId);
        this.setParamSimple(map, prefix + "UrlExpires", this.UrlExpires);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

