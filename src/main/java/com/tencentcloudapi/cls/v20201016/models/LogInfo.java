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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel {

    /**
    * <p>日志时间，单位ms</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志主题名称</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>日志来源IP</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>日志文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>日志上报请求包的ID</p>
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * <p>请求包内日志的ID</p>
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * <p>符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
    */
    @SerializedName("HighLights")
    @Expose
    private HighLightItem [] HighLights;

    /**
    * <p>日志内容的Json序列化字符串</p>
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
    * <p>日志来源主机名称</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>原始日志(仅在日志创建索引异常时有值)</p>
    */
    @SerializedName("RawLog")
    @Expose
    private String RawLog;

    /**
    * <p>日志创建索引异常原因(仅在日志创建索引异常时有值)</p>
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * <p>日志时间，单位ns</p><p>单位：纳秒</p>
    */
    @SerializedName("TimeNanos")
    @Expose
    private Long TimeNanos;

    /**
     * Get <p>日志时间，单位ms</p> 
     * @return Time <p>日志时间，单位ms</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>日志时间，单位ms</p>
     * @param Time <p>日志时间，单位ms</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志主题名称</p> 
     * @return TopicName <p>日志主题名称</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>日志主题名称</p>
     * @param TopicName <p>日志主题名称</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>日志来源IP</p> 
     * @return Source <p>日志来源IP</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>日志来源IP</p>
     * @param Source <p>日志来源IP</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>日志文件名称</p> 
     * @return FileName <p>日志文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>日志文件名称</p>
     * @param FileName <p>日志文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>日志上报请求包的ID</p> 
     * @return PkgId <p>日志上报请求包的ID</p>
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set <p>日志上报请求包的ID</p>
     * @param PkgId <p>日志上报请求包的ID</p>
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get <p>请求包内日志的ID</p> 
     * @return PkgLogId <p>请求包内日志的ID</p>
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set <p>请求包内日志的ID</p>
     * @param PkgLogId <p>请求包内日志的ID</p>
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get <p>符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p> 
     * @return HighLights <p>符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
     */
    public HighLightItem [] getHighLights() {
        return this.HighLights;
    }

    /**
     * Set <p>符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
     * @param HighLights <p>符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
     */
    public void setHighLights(HighLightItem [] HighLights) {
        this.HighLights = HighLights;
    }

    /**
     * Get <p>日志内容的Json序列化字符串</p> 
     * @return LogJson <p>日志内容的Json序列化字符串</p>
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set <p>日志内容的Json序列化字符串</p>
     * @param LogJson <p>日志内容的Json序列化字符串</p>
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    /**
     * Get <p>日志来源主机名称</p> 
     * @return HostName <p>日志来源主机名称</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>日志来源主机名称</p>
     * @param HostName <p>日志来源主机名称</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>原始日志(仅在日志创建索引异常时有值)</p> 
     * @return RawLog <p>原始日志(仅在日志创建索引异常时有值)</p>
     */
    public String getRawLog() {
        return this.RawLog;
    }

    /**
     * Set <p>原始日志(仅在日志创建索引异常时有值)</p>
     * @param RawLog <p>原始日志(仅在日志创建索引异常时有值)</p>
     */
    public void setRawLog(String RawLog) {
        this.RawLog = RawLog;
    }

    /**
     * Get <p>日志创建索引异常原因(仅在日志创建索引异常时有值)</p> 
     * @return IndexStatus <p>日志创建索引异常原因(仅在日志创建索引异常时有值)</p>
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set <p>日志创建索引异常原因(仅在日志创建索引异常时有值)</p>
     * @param IndexStatus <p>日志创建索引异常原因(仅在日志创建索引异常时有值)</p>
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get <p>日志时间，单位ns</p><p>单位：纳秒</p> 
     * @return TimeNanos <p>日志时间，单位ns</p><p>单位：纳秒</p>
     */
    public Long getTimeNanos() {
        return this.TimeNanos;
    }

    /**
     * Set <p>日志时间，单位ns</p><p>单位：纳秒</p>
     * @param TimeNanos <p>日志时间，单位ns</p><p>单位：纳秒</p>
     */
    public void setTimeNanos(Long TimeNanos) {
        this.TimeNanos = TimeNanos;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.HighLights != null) {
            this.HighLights = new HighLightItem[source.HighLights.length];
            for (int i = 0; i < source.HighLights.length; i++) {
                this.HighLights[i] = new HighLightItem(source.HighLights[i]);
            }
        }
        if (source.LogJson != null) {
            this.LogJson = new String(source.LogJson);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.RawLog != null) {
            this.RawLog = new String(source.RawLog);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
        if (source.TimeNanos != null) {
            this.TimeNanos = new Long(source.TimeNanos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamArrayObj(map, prefix + "HighLights.", this.HighLights);
        this.setParamSimple(map, prefix + "LogJson", this.LogJson);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RawLog", this.RawLog);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);
        this.setParamSimple(map, prefix + "TimeNanos", this.TimeNanos);

    }
}

