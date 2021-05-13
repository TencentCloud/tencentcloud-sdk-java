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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchTemplate extends AbstractModel{

    /**
    * 检索名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检索索引类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 检索语句
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 时间范围
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * 转换的检索语句内容
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 检索方式。输入框检索：standard,过滤，检索：simple
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 展示数据
    */
    @SerializedName("DisplayData")
    @Expose
    private String DisplayData;

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 检索名称 
     * @return Name 检索名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检索名称
     * @param Name 检索名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检索索引类型 
     * @return LogType 检索索引类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 检索索引类型
     * @param LogType 检索索引类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 检索语句 
     * @return Condition 检索语句
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 检索语句
     * @param Condition 检索语句
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
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

    /**
     * Get 转换的检索语句内容 
     * @return Query 转换的检索语句内容
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 转换的检索语句内容
     * @param Query 转换的检索语句内容
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 检索方式。输入框检索：standard,过滤，检索：simple 
     * @return Flag 检索方式。输入框检索：standard,过滤，检索：simple
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 检索方式。输入框检索：standard,过滤，检索：simple
     * @param Flag 检索方式。输入框检索：standard,过滤，检索：simple
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 展示数据 
     * @return DisplayData 展示数据
     */
    public String getDisplayData() {
        return this.DisplayData;
    }

    /**
     * Set 展示数据
     * @param DisplayData 展示数据
     */
    public void setDisplayData(String DisplayData) {
        this.DisplayData = DisplayData;
    }

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public SearchTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchTemplate(SearchTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.DisplayData != null) {
            this.DisplayData = new String(source.DisplayData);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "DisplayData", this.DisplayData);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

