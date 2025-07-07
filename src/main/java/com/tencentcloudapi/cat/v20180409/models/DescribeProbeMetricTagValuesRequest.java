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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProbeMetricTagValuesRequest extends AbstractModel {

    /**
    * 分析任务类型，支持以下几种类型：
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能 
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_UploadDownload：文件传输
AnalyzeTaskType_MediaStream：音视频体验

    */
    @SerializedName("AnalyzeTaskType")
    @Expose
    private String AnalyzeTaskType;

    /**
    * 维度标签值，参考：
host：任务域名
errorInfo：状态类型
area：拨测点地区
operator：拨测点运营商
taskId：任务ID
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 过滤条件数组
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * 时间范围
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
     * Get 分析任务类型，支持以下几种类型：
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能 
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_UploadDownload：文件传输
AnalyzeTaskType_MediaStream：音视频体验
 
     * @return AnalyzeTaskType 分析任务类型，支持以下几种类型：
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能 
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_UploadDownload：文件传输
AnalyzeTaskType_MediaStream：音视频体验

     */
    public String getAnalyzeTaskType() {
        return this.AnalyzeTaskType;
    }

    /**
     * Set 分析任务类型，支持以下几种类型：
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能 
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_UploadDownload：文件传输
AnalyzeTaskType_MediaStream：音视频体验

     * @param AnalyzeTaskType 分析任务类型，支持以下几种类型：
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能 
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_UploadDownload：文件传输
AnalyzeTaskType_MediaStream：音视频体验

     */
    public void setAnalyzeTaskType(String AnalyzeTaskType) {
        this.AnalyzeTaskType = AnalyzeTaskType;
    }

    /**
     * Get 维度标签值，参考：
host：任务域名
errorInfo：状态类型
area：拨测点地区
operator：拨测点运营商
taskId：任务ID 
     * @return Key 维度标签值，参考：
host：任务域名
errorInfo：状态类型
area：拨测点地区
operator：拨测点运营商
taskId：任务ID
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 维度标签值，参考：
host：任务域名
errorInfo：状态类型
area：拨测点地区
operator：拨测点运营商
taskId：任务ID
     * @param Key 维度标签值，参考：
host：任务域名
errorInfo：状态类型
area：拨测点地区
operator：拨测点运营商
taskId：任务ID
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配 
     * @return Filter 过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配
     * @param Filter 过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 过滤条件数组 
     * @return Filters 过滤条件数组
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件数组
     * @param Filters 过滤条件数组
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 时间范围 
     * @return TimeRange 时间范围
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 时间范围
     * @param TimeRange 时间范围
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    public DescribeProbeMetricTagValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProbeMetricTagValuesRequest(DescribeProbeMetricTagValuesRequest source) {
        if (source.AnalyzeTaskType != null) {
            this.AnalyzeTaskType = new String(source.AnalyzeTaskType);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnalyzeTaskType", this.AnalyzeTaskType);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);

    }
}

