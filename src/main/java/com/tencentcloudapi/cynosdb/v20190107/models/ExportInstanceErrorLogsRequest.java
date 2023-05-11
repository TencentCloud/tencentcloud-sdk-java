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

public class ExportInstanceErrorLogsRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志最早时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志最晚时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 日志等级
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * 关键字
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
    * 文件类型，可选值：csv, original
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 可选值Timestamp
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * ASC或DESC
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志最早时间 
     * @return StartTime 日志最早时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志最早时间
     * @param StartTime 日志最早时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志最晚时间 
     * @return EndTime 日志最晚时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志最晚时间
     * @param EndTime 日志最晚时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 限制条数 
     * @return Limit 限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数
     * @param Limit 限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 日志等级 
     * @return LogLevels 日志等级
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set 日志等级
     * @param LogLevels 日志等级
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get 关键字 
     * @return KeyWords 关键字
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 关键字
     * @param KeyWords 关键字
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get 文件类型，可选值：csv, original 
     * @return FileType 文件类型，可选值：csv, original
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，可选值：csv, original
     * @param FileType 文件类型，可选值：csv, original
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 可选值Timestamp 
     * @return OrderBy 可选值Timestamp
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 可选值Timestamp
     * @param OrderBy 可选值Timestamp
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get ASC或DESC 
     * @return OrderByType ASC或DESC
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set ASC或DESC
     * @param OrderByType ASC或DESC
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public ExportInstanceErrorLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportInstanceErrorLogsRequest(ExportInstanceErrorLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

