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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel {

    /**
    * 日志类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogComponent")
    @Expose
    private String LogComponent;

    /**
    * 日志级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * 日志产生时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * 日志详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogDetail")
    @Expose
    private String LogDetail;

    /**
    * 日志连接信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConnection")
    @Expose
    private String LogConnection;

    /**
    * 日志id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
     * Get 日志类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogComponent 日志类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogComponent() {
        return this.LogComponent;
    }

    /**
     * Set 日志类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogComponent 日志类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogComponent(String LogComponent) {
        this.LogComponent = LogComponent;
    }

    /**
     * Get 日志级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogLevel 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogLevel 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get 日志产生时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTime 日志产生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 日志产生时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTime 日志产生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 日志详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogDetail 日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogDetail() {
        return this.LogDetail;
    }

    /**
     * Set 日志详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogDetail 日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogDetail(String LogDetail) {
        this.LogDetail = LogDetail;
    }

    /**
     * Get 日志连接信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConnection 日志连接信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogConnection() {
        return this.LogConnection;
    }

    /**
     * Set 日志连接信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConnection 日志连接信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConnection(String LogConnection) {
        this.LogConnection = LogConnection;
    }

    /**
     * Get 日志id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogId 日志id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 日志id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogId 日志id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.LogComponent != null) {
            this.LogComponent = new String(source.LogComponent);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.LogTime != null) {
            this.LogTime = new String(source.LogTime);
        }
        if (source.LogDetail != null) {
            this.LogDetail = new String(source.LogDetail);
        }
        if (source.LogConnection != null) {
            this.LogConnection = new String(source.LogConnection);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogComponent", this.LogComponent);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "LogDetail", this.LogDetail);
        this.setParamSimple(map, prefix + "LogConnection", this.LogConnection);
        this.setParamSimple(map, prefix + "LogId", this.LogId);

    }
}

