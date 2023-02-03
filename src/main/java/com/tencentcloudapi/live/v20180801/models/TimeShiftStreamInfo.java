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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftStreamInfo extends AbstractModel{

    /**
    * 推流域名所属组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainGroup")
    @Expose
    private String DomainGroup;

    /**
    * 推流域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 推流路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 流起始时间，Unix 时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 截止查询时流结束时间，Unix 时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 转码模板ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransCodeId")
    @Expose
    private Long TransCodeId;

    /**
    * 流类型，取值0为原始流，1为水印流，2为转码流。
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 时移数据存储时长，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 推流域名所属组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainGroup 推流域名所属组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainGroup() {
        return this.DomainGroup;
    }

    /**
     * Set 推流域名所属组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainGroup 推流域名所属组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }

    /**
     * Get 推流域名。 
     * @return Domain 推流域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 推流域名。
     * @param Domain 推流域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 推流路径。 
     * @return AppName 推流路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
     * @param AppName 推流路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 流起始时间，Unix 时间戳。 
     * @return StartTime 流起始时间，Unix 时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 流起始时间，Unix 时间戳。
     * @param StartTime 流起始时间，Unix 时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止查询时流结束时间，Unix 时间戳。 
     * @return EndTime 截止查询时流结束时间，Unix 时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止查询时流结束时间，Unix 时间戳。
     * @param EndTime 截止查询时流结束时间，Unix 时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 转码模板ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransCodeId 转码模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransCodeId() {
        return this.TransCodeId;
    }

    /**
     * Set 转码模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransCodeId 转码模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransCodeId(Long TransCodeId) {
        this.TransCodeId = TransCodeId;
    }

    /**
     * Get 流类型，取值0为原始流，1为水印流，2为转码流。 
     * @return StreamType 流类型，取值0为原始流，1为水印流，2为转码流。
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 流类型，取值0为原始流，1为水印流，2为转码流。
     * @param StreamType 流类型，取值0为原始流，1为水印流，2为转码流。
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 时移数据存储时长，单位秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 时移数据存储时长，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 时移数据存储时长，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 时移数据存储时长，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public TimeShiftStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftStreamInfo(TimeShiftStreamInfo source) {
        if (source.DomainGroup != null) {
            this.DomainGroup = new String(source.DomainGroup);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TransCodeId != null) {
            this.TransCodeId = new Long(source.TransCodeId);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainGroup", this.DomainGroup);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TransCodeId", this.TransCodeId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

