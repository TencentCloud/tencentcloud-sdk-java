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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobLogResult extends AbstractModel{

    /**
    * 日志时间戳，毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 日志topic id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志topic name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志内容，json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
    * 日志ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
     * Get 日志时间戳，毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 日志时间戳，毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间戳，毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 日志时间戳，毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 日志topic id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId 日志topic id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志topic id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId 日志topic id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志topic name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 日志topic name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志topic name
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 日志topic name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志内容，json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogJson 日志内容，json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set 日志内容，json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogJson 日志内容，json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    /**
     * Get 日志ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgLogId 日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgLogId 日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    public JobLogResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobLogResult(JobLogResult source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogJson != null) {
            this.LogJson = new String(source.LogJson);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogJson", this.LogJson);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);

    }
}

