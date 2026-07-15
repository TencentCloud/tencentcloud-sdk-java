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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogAnalysisDownloadTasksRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>数据归属地区，可选值： <ul><li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></ul> 注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>日志类型，可选值：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul>默认为 l7-access-logs 。</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：<ul><li>task-id：按照日志下载任务 ID进行过滤，可选值参考 CreateLogAnalysisDownloadTask 接口返回的 TaskId。</li></ul></p><p>取值参考：CreateLogAnalysisDownloadTask</p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>分页查询限制数目，默认值：20，最大值 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询偏移量，默认为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>数据归属地区，可选值： <ul><li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></ul> 注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p> 
     * @return Area <p>数据归属地区，可选值： <ul><li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></ul> 注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据归属地区，可选值： <ul><li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></ul> 注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
     * @param Area <p>数据归属地区，可选值： <ul><li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></ul> 注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>日志类型，可选值：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul>默认为 l7-access-logs 。</p> 
     * @return LogType <p>日志类型，可选值：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul>默认为 l7-access-logs 。</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型，可选值：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul>默认为 l7-access-logs 。</p>
     * @param LogType <p>日志类型，可选值：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul>默认为 l7-access-logs 。</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：<ul><li>task-id：按照日志下载任务 ID进行过滤，可选值参考 CreateLogAnalysisDownloadTask 接口返回的 TaskId。</li></ul></p><p>取值参考：CreateLogAnalysisDownloadTask</p> 
     * @return Filters <p>过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：<ul><li>task-id：按照日志下载任务 ID进行过滤，可选值参考 CreateLogAnalysisDownloadTask 接口返回的 TaskId。</li></ul></p><p>取值参考：CreateLogAnalysisDownloadTask</p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：<ul><li>task-id：按照日志下载任务 ID进行过滤，可选值参考 CreateLogAnalysisDownloadTask 接口返回的 TaskId。</li></ul></p><p>取值参考：CreateLogAnalysisDownloadTask</p>
     * @param Filters <p>过滤条件，Filters.Values 的上限为 20。详细的过滤条件如下：<ul><li>task-id：按照日志下载任务 ID进行过滤，可选值参考 CreateLogAnalysisDownloadTask 接口返回的 TaskId。</li></ul></p><p>取值参考：CreateLogAnalysisDownloadTask</p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询限制数目，默认值：20，最大值 100。</p> 
     * @return Limit <p>分页查询限制数目，默认值：20，最大值 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目，默认值：20，最大值 100。</p>
     * @param Limit <p>分页查询限制数目，默认值：20，最大值 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询偏移量，默认为 0。</p> 
     * @return Offset <p>分页查询偏移量，默认为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量，默认为 0。</p>
     * @param Offset <p>分页查询偏移量，默认为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLogAnalysisDownloadTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogAnalysisDownloadTasksRequest(DescribeLogAnalysisDownloadTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

