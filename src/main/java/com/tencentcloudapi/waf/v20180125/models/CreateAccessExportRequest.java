/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessExportRequest extends AbstractModel{

    /**
    * 客户要查询的日志主题ID，每个客户都有对应的一个主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 要查询的日志的起始时间，Unix时间戳，单位ms
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 要查询的日志的结束时间，Unix时间戳，单位ms
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 日志导出检索语句
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志导出数量，最大值100w
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 日志导出数据格式。json，csv，默认为json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 日志导出时间排序。desc，asc，默认为desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 客户要查询的日志主题ID，每个客户都有对应的一个主题 
     * @return TopicId 客户要查询的日志主题ID，每个客户都有对应的一个主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 客户要查询的日志主题ID，每个客户都有对应的一个主题
     * @param TopicId 客户要查询的日志主题ID，每个客户都有对应的一个主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 要查询的日志的起始时间，Unix时间戳，单位ms 
     * @return From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 要查询的日志的起始时间，Unix时间戳，单位ms
     * @param From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 要查询的日志的结束时间，Unix时间戳，单位ms 
     * @return To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 要查询的日志的结束时间，Unix时间戳，单位ms
     * @param To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get 日志导出检索语句 
     * @return Query 日志导出检索语句
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 日志导出检索语句
     * @param Query 日志导出检索语句
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 日志导出数量，最大值100w 
     * @return Count 日志导出数量，最大值100w
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志导出数量，最大值100w
     * @param Count 日志导出数量，最大值100w
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    /**
     * Get 日志导出时间排序。desc，asc，默认为desc 
     * @return Order 日志导出时间排序。desc，asc，默认为desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 日志导出时间排序。desc，asc，默认为desc
     * @param Order 日志导出时间排序。desc，asc，默认为desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public CreateAccessExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessExportRequest(CreateAccessExportRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

