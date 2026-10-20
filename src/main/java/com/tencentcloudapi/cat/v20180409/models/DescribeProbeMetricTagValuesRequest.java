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
    * <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
    */
    @SerializedName("AnalyzeTaskType")
    @Expose
    private String AnalyzeTaskType;

    /**
    * <p>维度标签值，参考：<br>host：任务域名<br>errorInfo：状态类型<br>area：拨测点地区<br>operator：拨测点运营商<br>taskId：任务ID</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>过滤条件数组</p>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * <p>时间范围</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
     * Get <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p> 
     * @return AnalyzeTaskType <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     */
    public String getAnalyzeTaskType() {
        return this.AnalyzeTaskType;
    }

    /**
     * Set <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     * @param AnalyzeTaskType <p>分析任务类型，支持以下几种类型：<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_UploadDownload：文件传输<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     */
    public void setAnalyzeTaskType(String AnalyzeTaskType) {
        this.AnalyzeTaskType = AnalyzeTaskType;
    }

    /**
     * Get <p>维度标签值，参考：<br>host：任务域名<br>errorInfo：状态类型<br>area：拨测点地区<br>operator：拨测点运营商<br>taskId：任务ID</p> 
     * @return Key <p>维度标签值，参考：<br>host：任务域名<br>errorInfo：状态类型<br>area：拨测点地区<br>operator：拨测点运营商<br>taskId：任务ID</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>维度标签值，参考：<br>host：任务域名<br>errorInfo：状态类型<br>area：拨测点地区<br>operator：拨测点运营商<br>taskId：任务ID</p>
     * @param Key <p>维度标签值，参考：<br>host：任务域名<br>errorInfo：状态类型<br>area：拨测点地区<br>operator：拨测点运营商<br>taskId：任务ID</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配</p> 
     * @return Filter <p>过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配</p>
     * @param Filter <p>过滤条件，可以传单个过滤条件也可以拼接多个参数，支持正则匹配</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>过滤条件数组</p> 
     * @return Filters <p>过滤条件数组</p>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件数组</p>
     * @param Filters <p>过滤条件数组</p>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>时间范围</p> 
     * @return TimeRange <p>时间范围</p>
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>时间范围</p>
     * @param TimeRange <p>时间范围</p>
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

