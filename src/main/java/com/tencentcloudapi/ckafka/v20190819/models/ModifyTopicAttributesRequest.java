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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTopicAttributesRequest extends AbstractModel {

    /**
    * ckafka集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名
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
    * 主题消息最大值，单位为 Byte，最大值为12582912Byte（即12MB）。
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * Segment 分片滚动的时长，单位：ms，当前最小值86400000ms。
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * 消息删除策略，可以选择delete 或者compact
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * Ip白名单列表，配额限制，enableWhileList=1时必选
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * 预设ACL规则, 1:打开  0:关闭，默认不打开
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * ACL规则名
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * 可选, 保留文件大小. 默认为-1,单位bytes, 当前最小值为1048576B
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 生产限流，单位 MB/s；设置为-1，则生产不限流
    */
    @SerializedName("QuotaProducerByteRate")
    @Expose
    private Long QuotaProducerByteRate;

    /**
    * 消费限流，单位 MB/s；设置为-1，则消费不限流
    */
    @SerializedName("QuotaConsumerByteRate")
    @Expose
    private Long QuotaConsumerByteRate;

    /**
    * topic副本数  最小值 1,最大值 3
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
     * Get ckafka集群实例Id 
     * @return InstanceId ckafka集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id
     * @param InstanceId ckafka集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名 
     * @return TopicName 主题名
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名
     * @param TopicName 主题名
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
     * Get 主题消息最大值，单位为 Byte，最大值为12582912Byte（即12MB）。 
     * @return MaxMessageBytes 主题消息最大值，单位为 Byte，最大值为12582912Byte（即12MB）。
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set 主题消息最大值，单位为 Byte，最大值为12582912Byte（即12MB）。
     * @param MaxMessageBytes 主题消息最大值，单位为 Byte，最大值为12582912Byte（即12MB）。
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get Segment 分片滚动的时长，单位：ms，当前最小值86400000ms。 
     * @return SegmentMs Segment 分片滚动的时长，单位：ms，当前最小值86400000ms。
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment 分片滚动的时长，单位：ms，当前最小值86400000ms。
     * @param SegmentMs Segment 分片滚动的时长，单位：ms，当前最小值86400000ms。
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
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
     * Get Ip白名单列表，配额限制，enableWhileList=1时必选 
     * @return IpWhiteList Ip白名单列表，配额限制，enableWhileList=1时必选
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set Ip白名单列表，配额限制，enableWhileList=1时必选
     * @param IpWhiteList Ip白名单列表，配额限制，enableWhileList=1时必选
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get 预设ACL规则, 1:打开  0:关闭，默认不打开 
     * @return EnableAclRule 预设ACL规则, 1:打开  0:关闭，默认不打开
     */
    public Long getEnableAclRule() {
        return this.EnableAclRule;
    }

    /**
     * Set 预设ACL规则, 1:打开  0:关闭，默认不打开
     * @param EnableAclRule 预设ACL规则, 1:打开  0:关闭，默认不打开
     */
    public void setEnableAclRule(Long EnableAclRule) {
        this.EnableAclRule = EnableAclRule;
    }

    /**
     * Get ACL规则名 
     * @return AclRuleName ACL规则名
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set ACL规则名
     * @param AclRuleName ACL规则名
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get 可选, 保留文件大小. 默认为-1,单位bytes, 当前最小值为1048576B 
     * @return RetentionBytes 可选, 保留文件大小. 默认为-1,单位bytes, 当前最小值为1048576B
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set 可选, 保留文件大小. 默认为-1,单位bytes, 当前最小值为1048576B
     * @param RetentionBytes 可选, 保留文件大小. 默认为-1,单位bytes, 当前最小值为1048576B
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 生产限流，单位 MB/s；设置为-1，则生产不限流 
     * @return QuotaProducerByteRate 生产限流，单位 MB/s；设置为-1，则生产不限流
     */
    public Long getQuotaProducerByteRate() {
        return this.QuotaProducerByteRate;
    }

    /**
     * Set 生产限流，单位 MB/s；设置为-1，则生产不限流
     * @param QuotaProducerByteRate 生产限流，单位 MB/s；设置为-1，则生产不限流
     */
    public void setQuotaProducerByteRate(Long QuotaProducerByteRate) {
        this.QuotaProducerByteRate = QuotaProducerByteRate;
    }

    /**
     * Get 消费限流，单位 MB/s；设置为-1，则消费不限流 
     * @return QuotaConsumerByteRate 消费限流，单位 MB/s；设置为-1，则消费不限流
     */
    public Long getQuotaConsumerByteRate() {
        return this.QuotaConsumerByteRate;
    }

    /**
     * Set 消费限流，单位 MB/s；设置为-1，则消费不限流
     * @param QuotaConsumerByteRate 消费限流，单位 MB/s；设置为-1，则消费不限流
     */
    public void setQuotaConsumerByteRate(Long QuotaConsumerByteRate) {
        this.QuotaConsumerByteRate = QuotaConsumerByteRate;
    }

    /**
     * Get topic副本数  最小值 1,最大值 3 
     * @return ReplicaNum topic副本数  最小值 1,最大值 3
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set topic副本数  最小值 1,最大值 3
     * @param ReplicaNum topic副本数  最小值 1,最大值 3
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    public ModifyTopicAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicAttributesRequest(ModifyTopicAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.EnableWhiteList != null) {
            this.EnableWhiteList = new Long(source.EnableWhiteList);
        }
        if (source.MinInsyncReplicas != null) {
            this.MinInsyncReplicas = new Long(source.MinInsyncReplicas);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
        }
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.EnableAclRule != null) {
            this.EnableAclRule = new Long(source.EnableAclRule);
        }
        if (source.AclRuleName != null) {
            this.AclRuleName = new String(source.AclRuleName);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.QuotaProducerByteRate != null) {
            this.QuotaProducerByteRate = new Long(source.QuotaProducerByteRate);
        }
        if (source.QuotaConsumerByteRate != null) {
            this.QuotaConsumerByteRate = new Long(source.QuotaConsumerByteRate);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
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
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "EnableAclRule", this.EnableAclRule);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "QuotaProducerByteRate", this.QuotaProducerByteRate);
        this.setParamSimple(map, prefix + "QuotaConsumerByteRate", this.QuotaConsumerByteRate);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);

    }
}

