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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogExportRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 日志导出起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志导出结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志导出检索语句
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志导出数量, 最大值1000万
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 日志导出时间排序。desc，asc，默认为desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 日志导出数据格式。json，csv，默认为json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 项目ID 
     * @return ID 项目ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目ID
     * @param ID 项目ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 日志导出起始时间 
     * @return StartTime 日志导出起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志导出起始时间
     * @param StartTime 日志导出起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志导出结束时间 
     * @return EndTime 日志导出结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志导出结束时间
     * @param EndTime 日志导出结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 日志导出数量, 最大值1000万 
     * @return Count 日志导出数量, 最大值1000万
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志导出数量, 最大值1000万
     * @param Count 日志导出数量, 最大值1000万
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

