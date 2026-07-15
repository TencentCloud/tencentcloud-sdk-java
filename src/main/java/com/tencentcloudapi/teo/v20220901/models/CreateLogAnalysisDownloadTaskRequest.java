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

public class CreateLogAnalysisDownloadTaskRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>数据归属地区，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul>注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>开始时间，示例值：2020-04-29T00:00:00Z。套餐版本不同，支持的可查询开始时间至今的最大时间跨度不同，详情请见 <a href="https://cloud.tencent.com/document/product/1552/94165#45435466-9103-4ff6-be22-e31717044fb2">套餐选型对比</a>。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，示例值：2020-04-30T00:00:00Z。单次查询的开始时间到结束时间跨度最大为 31 天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>日志类型，可选值：<ul><li> l7-access-logs：七层访问日志；</li><li>web-attack：托管规则日志。</li></ul>默认为 l7-access-logs 。</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，最大长度 12KB。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>文件格式，可选值：<ul><li>csv</li></ul>默认为 csv。</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>原始日志的时间排序，可选值：  <ul><li>asc：升序；</li>  <li>desc：降序。</li></ul>  默认为 desc。</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

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
     * Get <p>数据归属地区，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul>注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p> 
     * @return Area <p>数据归属地区，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul>注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据归属地区，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul>注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
     * @param Area <p>数据归属地区，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul>注意：若站点服务区域为“全球可用区”，获取全部数据需要分别查询 mainland 和 overseas 的数据。</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>开始时间，示例值：2020-04-29T00:00:00Z。套餐版本不同，支持的可查询开始时间至今的最大时间跨度不同，详情请见 <a href="https://cloud.tencent.com/document/product/1552/94165#45435466-9103-4ff6-be22-e31717044fb2">套餐选型对比</a>。</p> 
     * @return StartTime <p>开始时间，示例值：2020-04-29T00:00:00Z。套餐版本不同，支持的可查询开始时间至今的最大时间跨度不同，详情请见 <a href="https://cloud.tencent.com/document/product/1552/94165#45435466-9103-4ff6-be22-e31717044fb2">套餐选型对比</a>。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，示例值：2020-04-29T00:00:00Z。套餐版本不同，支持的可查询开始时间至今的最大时间跨度不同，详情请见 <a href="https://cloud.tencent.com/document/product/1552/94165#45435466-9103-4ff6-be22-e31717044fb2">套餐选型对比</a>。</p>
     * @param StartTime <p>开始时间，示例值：2020-04-29T00:00:00Z。套餐版本不同，支持的可查询开始时间至今的最大时间跨度不同，详情请见 <a href="https://cloud.tencent.com/document/product/1552/94165#45435466-9103-4ff6-be22-e31717044fb2">套餐选型对比</a>。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，示例值：2020-04-30T00:00:00Z。单次查询的开始时间到结束时间跨度最大为 31 天。</p> 
     * @return EndTime <p>结束时间，示例值：2020-04-30T00:00:00Z。单次查询的开始时间到结束时间跨度最大为 31 天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，示例值：2020-04-30T00:00:00Z。单次查询的开始时间到结束时间跨度最大为 31 天。</p>
     * @param EndTime <p>结束时间，示例值：2020-04-30T00:00:00Z。单次查询的开始时间到结束时间跨度最大为 31 天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，最大长度 12KB。</p> 
     * @return Condition <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，最大长度 12KB。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，最大长度 12KB。</p>
     * @param Condition <p><a href="https://cloud.tencent.com/document/product/1552/124662">日志匹配条件</a>，最大长度 12KB。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>文件格式，可选值：<ul><li>csv</li></ul>默认为 csv。</p> 
     * @return Format <p>文件格式，可选值：<ul><li>csv</li></ul>默认为 csv。</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>文件格式，可选值：<ul><li>csv</li></ul>默认为 csv。</p>
     * @param Format <p>文件格式，可选值：<ul><li>csv</li></ul>默认为 csv。</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>原始日志的时间排序，可选值：  <ul><li>asc：升序；</li>  <li>desc：降序。</li></ul>  默认为 desc。</p> 
     * @return Sort <p>原始日志的时间排序，可选值：  <ul><li>asc：升序；</li>  <li>desc：降序。</li></ul>  默认为 desc。</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>原始日志的时间排序，可选值：  <ul><li>asc：升序；</li>  <li>desc：降序。</li></ul>  默认为 desc。</p>
     * @param Sort <p>原始日志的时间排序，可选值：  <ul><li>asc：升序；</li>  <li>desc：降序。</li></ul>  默认为 desc。</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public CreateLogAnalysisDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogAnalysisDownloadTaskRequest(CreateLogAnalysisDownloadTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

