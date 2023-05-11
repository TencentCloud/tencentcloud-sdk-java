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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceErrorLogsRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志条数限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 日志条数偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序字段，有Timestamp枚举值
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型，有ASC,DESC枚举值
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 日志等级，有error、warning、note三种，支持多个等级同时搜索
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * 关键字，支持模糊搜索
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志条数限制 
     * @return Limit 日志条数限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 日志条数限制
     * @param Limit 日志条数限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 日志条数偏移量 
     * @return Offset 日志条数偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 日志条数偏移量
     * @param Offset 日志条数偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序字段，有Timestamp枚举值 
     * @return OrderBy 排序字段，有Timestamp枚举值
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，有Timestamp枚举值
     * @param OrderBy 排序字段，有Timestamp枚举值
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型，有ASC,DESC枚举值 
     * @return OrderByType 排序类型，有ASC,DESC枚举值
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型，有ASC,DESC枚举值
     * @param OrderByType 排序类型，有ASC,DESC枚举值
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 日志等级，有error、warning、note三种，支持多个等级同时搜索 
     * @return LogLevels 日志等级，有error、warning、note三种，支持多个等级同时搜索
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set 日志等级，有error、warning、note三种，支持多个等级同时搜索
     * @param LogLevels 日志等级，有error、warning、note三种，支持多个等级同时搜索
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get 关键字，支持模糊搜索 
     * @return KeyWords 关键字，支持模糊搜索
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 关键字，支持模糊搜索
     * @param KeyWords 关键字，支持模糊搜索
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    public DescribeInstanceErrorLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceErrorLogsRequest(DescribeInstanceErrorLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String[source.KeyWords.length];
            for (int i = 0; i < source.KeyWords.length; i++) {
                this.KeyWords[i] = new String(source.KeyWords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);

    }
}

