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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTopicAttributesRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题备注，是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线-。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * IP 白名单开关，1：打开；0：关闭。
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * 默认为1。
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * 默认为 0，0：false；1：true。
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * 消息保留时间，单位：ms，当前最小值为60000ms。
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Segment 分片滚动的时长，单位：ms，当前最小为86400000ms。
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * 主题消息最大值，单位为 Byte，最大值为8388608Byte（即8MB）。
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * 消息删除策略，可以选择delete 或者compact
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题备注，是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线-。 
     * @return Note 主题备注，是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线-。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 主题备注，是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线-。
     * @param Note 主题备注，是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线-。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get IP 白名单开关，1：打开；0：关闭。 
     * @return EnableWhiteList IP 白名单开关，1：打开；0：关闭。
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set IP 白名单开关，1：打开；0：关闭。
     * @param EnableWhiteList IP 白名单开关，1：打开；0：关闭。
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get 默认为1。 
     * @return MinInsyncReplicas 默认为1。
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set 默认为1。
     * @param MinInsyncReplicas 默认为1。
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get 默认为 0，0：false；1：true。 
     * @return UncleanLeaderElectionEnable 默认为 0，0：false；1：true。
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 默认为 0，0：false；1：true。
     * @param UncleanLeaderElectionEnable 默认为 0，0：false；1：true。
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get 消息保留时间，单位：ms，当前最小值为60000ms。 
     * @return RetentionMs 消息保留时间，单位：ms，当前最小值为60000ms。
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set 消息保留时间，单位：ms，当前最小值为60000ms。
     * @param RetentionMs 消息保留时间，单位：ms，当前最小值为60000ms。
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Segment 分片滚动的时长，单位：ms，当前最小为86400000ms。 
     * @return SegmentMs Segment 分片滚动的时长，单位：ms，当前最小为86400000ms。
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment 分片滚动的时长，单位：ms，当前最小为86400000ms。
     * @param SegmentMs Segment 分片滚动的时长，单位：ms，当前最小为86400000ms。
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get 主题消息最大值，单位为 Byte，最大值为8388608Byte（即8MB）。 
     * @return MaxMessageBytes 主题消息最大值，单位为 Byte，最大值为8388608Byte（即8MB）。
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set 主题消息最大值，单位为 Byte，最大值为8388608Byte（即8MB）。
     * @param MaxMessageBytes 主题消息最大值，单位为 Byte，最大值为8388608Byte（即8MB）。
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get 消息删除策略，可以选择delete 或者compact 
     * @return CleanUpPolicy 消息删除策略，可以选择delete 或者compact
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set 消息删除策略，可以选择delete 或者compact
     * @param CleanUpPolicy 消息删除策略，可以选择delete 或者compact
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);

    }
}

