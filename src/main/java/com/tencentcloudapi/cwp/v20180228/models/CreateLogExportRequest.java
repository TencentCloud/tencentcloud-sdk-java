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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogExportRequest extends AbstractModel {

    /**
    * 日志导出数量, 最大值5000万
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 日志导出起始时间，毫秒时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 日志导出结束时间，毫秒时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 日志导出检索语句，不支持[SQL语句]
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * 日志导出时间排序。desc，asc，默认为desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 日志导出数据格式。json，csv，默认为json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 日志导出数量, 最大值5000万 
     * @return Count 日志导出数量, 最大值5000万
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志导出数量, 最大值5000万
     * @param Count 日志导出数量, 最大值5000万
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 日志导出起始时间，毫秒时间戳 
     * @return StartTime 日志导出起始时间，毫秒时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志导出起始时间，毫秒时间戳
     * @param StartTime 日志导出起始时间，毫秒时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志导出结束时间，毫秒时间戳 
     * @return EndTime 日志导出结束时间，毫秒时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志导出结束时间，毫秒时间戳
     * @param EndTime 日志导出结束时间，毫秒时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志导出检索语句，不支持[SQL语句] 
     * @return QueryString 日志导出检索语句，不支持[SQL语句]
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 日志导出检索语句，不支持[SQL语句]
     * @param QueryString 日志导出检索语句，不支持[SQL语句]
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 日志导出时间排序。desc，asc，默认为desc 
     * @return Sort 日志导出时间排序。desc，asc，默认为desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 日志导出时间排序。desc，asc，默认为desc
     * @param Sort 日志导出时间排序。desc，asc，默认为desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 日志导出数据格式。json，csv，默认为json 
     * @return Format 日志导出数据格式。json，csv，默认为json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 日志导出数据格式。json，csv，默认为json
     * @param Format 日志导出数据格式。json，csv，默认为json
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CreateLogExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogExportRequest(CreateLogExportRequest source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

