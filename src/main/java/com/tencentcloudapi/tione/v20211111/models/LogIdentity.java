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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogIdentity extends AbstractModel{

    /**
    * 单条日志的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 单条日志的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 这条日志对应的Pod名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 日志的时间戳（RFC3339格式的时间字符串）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
     * Get 单条日志的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 单条日志的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 单条日志的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 单条日志的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 单条日志的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 单条日志的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 单条日志的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 单条日志的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 这条日志对应的Pod名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName 这条日志对应的Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 这条日志对应的Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName 这条日志对应的Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 日志的时间戳（RFC3339格式的时间字符串）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 日志的时间戳（RFC3339格式的时间字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志的时间戳（RFC3339格式的时间字符串）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 日志的时间戳（RFC3339格式的时间字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public LogIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogIdentity(LogIdentity source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

