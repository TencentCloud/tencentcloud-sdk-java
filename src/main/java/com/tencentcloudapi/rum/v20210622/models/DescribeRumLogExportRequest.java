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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogExportRequest extends AbstractModel {

    /**
    * <p>导出标识name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>查询开始时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>查询结束时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>项目ID（必填）</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>field条件</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
     * Get <p>导出标识name</p> 
     * @return Name <p>导出标识name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>导出标识name</p>
     * @param Name <p>导出标识name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>查询开始时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p> 
     * @return StartTime <p>查询开始时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
     * @param StartTime <p>查询开始时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p> 
     * @return Query <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
     * @param Query <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>查询结束时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p> 
     * @return EndTime <p>查询结束时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
     * @param EndTime <p>查询结束时间（必填）。</p><p>参数格式：支持旧 Unix 毫秒字符串或新 RFC3339（需带时区）。</p><p>入参限制：RFC3339 最多 3 位小数秒，须对应非负毫秒。</p><p>等价时间格式对应同一导出范围，返回字段一致。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>项目ID（必填）</p> 
     * @return ID <p>项目ID（必填）</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>项目ID（必填）</p>
     * @param ID <p>项目ID（必填）</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>field条件</p> 
     * @return Fields <p>field条件</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>field条件</p>
     * @param Fields <p>field条件</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    public DescribeRumLogExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogExportRequest(DescribeRumLogExportRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);

    }
}

