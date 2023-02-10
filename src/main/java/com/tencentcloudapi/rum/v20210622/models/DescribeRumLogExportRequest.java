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

public class DescribeRumLogExportRequest extends AbstractModel{

    /**
    * 导出标识name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 开始时间（必填）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 结束时间（必填）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 项目ID（必填）
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * field条件
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
     * Get 导出标识name 
     * @return Name 导出标识name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 导出标识name
     * @param Name 导出标识name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 开始时间（必填） 
     * @return StartTime 开始时间（必填）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（必填）
     * @param StartTime 开始时间（必填）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询语句，参考控制台请求参数，语句长度最大为4096（必填） 
     * @return Query 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
     * @param Query 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 结束时间（必填） 
     * @return EndTime 结束时间（必填）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（必填）
     * @param EndTime 结束时间（必填）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 项目ID（必填） 
     * @return ID 项目ID（必填）
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目ID（必填）
     * @param ID 项目ID（必填）
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get field条件 
     * @return Fields field条件
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set field条件
     * @param Fields field条件
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

