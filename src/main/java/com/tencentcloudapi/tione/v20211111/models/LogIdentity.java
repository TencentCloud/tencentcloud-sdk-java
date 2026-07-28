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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogIdentity extends AbstractModel {

    /**
    * <p>单条日志的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>单条日志的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>这条日志对应的Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>日志的时间戳（RFC3339格式的时间字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

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
     * Get <p>单条日志的ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>单条日志的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>单条日志的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>单条日志的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>单条日志的内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>单条日志的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>单条日志的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>单条日志的内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>这条日志对应的Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName <p>这条日志对应的Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>这条日志对应的Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName <p>这条日志对应的Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>日志的时间戳（RFC3339格式的时间字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>日志的时间戳（RFC3339格式的时间字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>日志的时间戳（RFC3339格式的时间字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>日志的时间戳（RFC3339格式的时间字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
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
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
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
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);

    }
}

