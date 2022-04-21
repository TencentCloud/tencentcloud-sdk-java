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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel{

    /**
    * 日志时间，单位ms
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志来源IP
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 日志文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 日志上报请求包的ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 请求包内日志的ID
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * 日志内容的Json序列化字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
    * 日志来源主机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get 日志时间，单位ms 
     * @return Time 日志时间，单位ms
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间，单位ms
     * @param Time 日志时间，单位ms
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题名称 
     * @return TopicName 日志主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称
     * @param TopicName 日志主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志来源IP 
     * @return Source 日志来源IP
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 日志来源IP
     * @param Source 日志来源IP
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 日志文件名称 
     * @return FileName 日志文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 日志文件名称
     * @param FileName 日志文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 日志上报请求包的ID 
     * @return PkgId 日志上报请求包的ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志上报请求包的ID
     * @param PkgId 日志上报请求包的ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 请求包内日志的ID 
     * @return PkgLogId 请求包内日志的ID
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 请求包内日志的ID
     * @param PkgLogId 请求包内日志的ID
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 日志内容的Json序列化字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogJson 日志内容的Json序列化字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set 日志内容的Json序列化字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogJson 日志内容的Json序列化字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    /**
     * Get 日志来源主机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 日志来源主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 日志来源主机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 日志来源主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
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
        if (source.LogJson != null) {
            this.LogJson = new String(source.LogJson);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
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
        this.setParamSimple(map, prefix + "LogJson", this.LogJson);
        this.setParamSimple(map, prefix + "HostName", this.HostName);

    }
}

