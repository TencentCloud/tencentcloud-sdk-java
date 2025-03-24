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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Config extends AbstractModel {

    /**
    * 消息保留时间
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

    /**
    * 最小同步复制数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * 日志清理模式，默认 delete。
delete：日志按保存时间删除；compact：日志按 key 压缩；compact, delete：日志按 key 压缩且会保存时间删除。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * Segment 分片滚动的时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * 0表示 false。 1表示 true。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * Segment 分片滚动的字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentBytes")
    @Expose
    private Long SegmentBytes;

    /**
    * 最大消息字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * 消息保留文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * 消息保存的时间类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogMsgTimestampType")
    @Expose
    private String LogMsgTimestampType;

    /**
     * Get 消息保留时间 
     * @return Retention 消息保留时间
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set 消息保留时间
     * @param Retention 消息保留时间
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    /**
     * Get 最小同步复制数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinInsyncReplicas 最小同步复制数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set 最小同步复制数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinInsyncReplicas 最小同步复制数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get 日志清理模式，默认 delete。
delete：日志按保存时间删除；compact：日志按 key 压缩；compact, delete：日志按 key 压缩且会保存时间删除。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CleanUpPolicy 日志清理模式，默认 delete。
delete：日志按保存时间删除；compact：日志按 key 压缩；compact, delete：日志按 key 压缩且会保存时间删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set 日志清理模式，默认 delete。
delete：日志按保存时间删除；compact：日志按 key 压缩；compact, delete：日志按 key 压缩且会保存时间删除。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CleanUpPolicy 日志清理模式，默认 delete。
delete：日志按保存时间删除；compact：日志按 key 压缩；compact, delete：日志按 key 压缩且会保存时间删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get Segment 分片滚动的时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentMs Segment 分片滚动的时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment 分片滚动的时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentMs Segment 分片滚动的时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get 0表示 false。 1表示 true。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UncleanLeaderElectionEnable 0表示 false。 1表示 true。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 0表示 false。 1表示 true。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UncleanLeaderElectionEnable 0表示 false。 1表示 true。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Segment 分片滚动的字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentBytes Segment 分片滚动的字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSegmentBytes() {
        return this.SegmentBytes;
    }

    /**
     * Set Segment 分片滚动的字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentBytes Segment 分片滚动的字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentBytes(Long SegmentBytes) {
        this.SegmentBytes = SegmentBytes;
    }

    /**
     * Get 最大消息字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMessageBytes 最大消息字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set 最大消息字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMessageBytes 最大消息字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get 消息保留文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionBytes 消息保留文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set 消息保留文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionBytes 消息保留文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get 消息保存的时间类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogMsgTimestampType 消息保存的时间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogMsgTimestampType() {
        return this.LogMsgTimestampType;
    }

    /**
     * Set 消息保存的时间类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogMsgTimestampType 消息保存的时间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogMsgTimestampType(String LogMsgTimestampType) {
        this.LogMsgTimestampType = LogMsgTimestampType;
    }

    public Config() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Config(Config source) {
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
        if (source.MinInsyncReplicas != null) {
            this.MinInsyncReplicas = new Long(source.MinInsyncReplicas);
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.SegmentBytes != null) {
            this.SegmentBytes = new Long(source.SegmentBytes);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.LogMsgTimestampType != null) {
            this.LogMsgTimestampType = new String(source.LogMsgTimestampType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Retention", this.Retention);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "SegmentBytes", this.SegmentBytes);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamSimple(map, prefix + "LogMsgTimestampType", this.LogMsgTimestampType);

    }
}

