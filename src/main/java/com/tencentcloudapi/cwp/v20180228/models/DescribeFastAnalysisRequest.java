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

public class DescribeFastAnalysisRequest extends AbstractModel {

    /**
    * 起始时间，单位ms
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 结束时间，单位ms
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 查询语句，语句长度最大为4096
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
     * Get 起始时间，单位ms 
     * @return From 起始时间，单位ms
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 起始时间，单位ms
     * @param From 起始时间，单位ms
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 结束时间，单位ms 
     * @return To 结束时间，单位ms
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 结束时间，单位ms
     * @param To 结束时间，单位ms
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get 查询语句，语句长度最大为4096 
     * @return Query 查询语句，语句长度最大为4096
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，语句长度最大为4096
     * @param Query 查询语句，语句长度最大为4096
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 日志字段名称 
     * @return FieldName 日志字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 日志字段名称
     * @param FieldName 日志字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public DescribeFastAnalysisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFastAnalysisRequest(DescribeFastAnalysisRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);

    }
}

