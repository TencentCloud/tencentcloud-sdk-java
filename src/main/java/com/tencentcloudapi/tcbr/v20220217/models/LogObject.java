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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogObject extends AbstractModel {

    /**
    * 日志属于的 topic ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 日志内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 采集路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 日志来源设备
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 日志唯一标识
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
     * Get 日志属于的 topic ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 日志属于的 topic ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志属于的 topic ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 日志属于的 topic ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 日志主题的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 日志主题的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 日志时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 日志时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 日志内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 采集路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 采集路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 日志来源设备
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 日志来源设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 日志来源设备
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 日志来源设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 日志唯一标识 
     * @return PkgLogId 日志唯一标识
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志唯一标识
     * @param PkgLogId 日志唯一标识
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    public LogObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogObject(LogObject source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);

    }
}

