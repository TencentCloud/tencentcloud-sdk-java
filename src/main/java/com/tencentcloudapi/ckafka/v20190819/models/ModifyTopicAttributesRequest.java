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
    * <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题名</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>主题备注</p><p>入参限制：不超过64个字符</p><p>默认值：&quot;&quot;</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>IP 白名单开关，1：打开；0：关闭。</p>
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * <p>最小同步副本数</p><p>默认值：1</p><p>最小值为1</p>
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * <p>是否允许未同步的副本选为leader</p><p>枚举值：</p><ul><li>0： 不允许</li><li>1： 允许</li></ul><p>默认值：0</p>
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * <p>主题消息最大值</p><p>取值范围：[1024, 12582912]</p><p>单位：Bytes</p>
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * <p>Segment 分片滚动的时长</p><p>单位：毫秒</p><p>最小值为86400000ms（1天）</p>
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * <p>消息删除策略，可以选择delete 或者compact</p>
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * <p>Ip白名单列表，配额限制，enableWhileList=1时必选</p>
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * <p>预设ACL规则, 1:打开  0:关闭，默认不打开</p>
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * <p>ACL规则名</p>
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * <p>可选, 保留文件大小</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：Bytes</p><p>默认值：-1</p><p>特殊值：-1表示无限制</p>
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>生产限流，单位 MB/s；设置为-1，则生产不限流</p>
    */
    @SerializedName("QuotaProducerByteRate")
    @Expose
    private Long QuotaProducerByteRate;

    /**
    * <p>消费限流，单位 MB/s；设置为-1，则消费不限流</p>
    */
    @SerializedName("QuotaConsumerByteRate")
    @Expose
    private Long QuotaConsumerByteRate;

    /**
    * <p>topic副本数  最小值 1,最大值 3</p>
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * <p>消息保存的时间类型：CreateTime/LogAppendTime</p>
    */
    @SerializedName("LogMsgTimestampType")
    @Expose
    private String LogMsgTimestampType;

    /**
     * Get <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题名</p> 
     * @return TopicName <p>主题名</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>主题名</p>
     * @param TopicName <p>主题名</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>主题备注</p><p>入参限制：不超过64个字符</p><p>默认值：&quot;&quot;</p> 
     * @return Note <p>主题备注</p><p>入参限制：不超过64个字符</p><p>默认值：&quot;&quot;</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>主题备注</p><p>入参限制：不超过64个字符</p><p>默认值：&quot;&quot;</p>
     * @param Note <p>主题备注</p><p>入参限制：不超过64个字符</p><p>默认值：&quot;&quot;</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>IP 白名单开关，1：打开；0：关闭。</p> 
     * @return EnableWhiteList <p>IP 白名单开关，1：打开；0：关闭。</p>
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set <p>IP 白名单开关，1：打开；0：关闭。</p>
     * @param EnableWhiteList <p>IP 白名单开关，1：打开；0：关闭。</p>
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get <p>最小同步副本数</p><p>默认值：1</p><p>最小值为1</p> 
     * @return MinInsyncReplicas <p>最小同步副本数</p><p>默认值：1</p><p>最小值为1</p>
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set <p>最小同步副本数</p><p>默认值：1</p><p>最小值为1</p>
     * @param MinInsyncReplicas <p>最小同步副本数</p><p>默认值：1</p><p>最小值为1</p>
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get <p>是否允许未同步的副本选为leader</p><p>枚举值：</p><ul><li>0： 不允许</li><li>1： 允许</li></ul><p>默认值：0</p> 
     * @return UncleanLeaderElectionEnable <p>是否允许未同步的副本选为leader</p><p>枚举值：</p><ul><li>0： 不允许</li><li>1： 允许</li></ul><p>默认值：0</p>
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <p>是否允许未同步的副本选为leader</p><p>枚举值：</p><ul><li>0： 不允许</li><li>1： 允许</li></ul><p>默认值：0</p>
     * @param UncleanLeaderElectionEnable <p>是否允许未同步的副本选为leader</p><p>枚举值：</p><ul><li>0： 不允许</li><li>1： 允许</li></ul><p>默认值：0</p>
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p> 
     * @return RetentionMs <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
     * @param RetentionMs <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get <p>主题消息最大值</p><p>取值范围：[1024, 12582912]</p><p>单位：Bytes</p> 
     * @return MaxMessageBytes <p>主题消息最大值</p><p>取值范围：[1024, 12582912]</p><p>单位：Bytes</p>
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set <p>主题消息最大值</p><p>取值范围：[1024, 12582912]</p><p>单位：Bytes</p>
     * @param MaxMessageBytes <p>主题消息最大值</p><p>取值范围：[1024, 12582912]</p><p>单位：Bytes</p>
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get <p>Segment 分片滚动的时长</p><p>单位：毫秒</p><p>最小值为86400000ms（1天）</p> 
     * @return SegmentMs <p>Segment 分片滚动的时长</p><p>单位：毫秒</p><p>最小值为86400000ms（1天）</p>
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set <p>Segment 分片滚动的时长</p><p>单位：毫秒</p><p>最小值为86400000ms（1天）</p>
     * @param SegmentMs <p>Segment 分片滚动的时长</p><p>单位：毫秒</p><p>最小值为86400000ms（1天）</p>
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get <p>消息删除策略，可以选择delete 或者compact</p> 
     * @return CleanUpPolicy <p>消息删除策略，可以选择delete 或者compact</p>
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set <p>消息删除策略，可以选择delete 或者compact</p>
     * @param CleanUpPolicy <p>消息删除策略，可以选择delete 或者compact</p>
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get <p>Ip白名单列表，配额限制，enableWhileList=1时必选</p> 
     * @return IpWhiteList <p>Ip白名单列表，配额限制，enableWhileList=1时必选</p>
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set <p>Ip白名单列表，配额限制，enableWhileList=1时必选</p>
     * @param IpWhiteList <p>Ip白名单列表，配额限制，enableWhileList=1时必选</p>
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get <p>预设ACL规则, 1:打开  0:关闭，默认不打开</p> 
     * @return EnableAclRule <p>预设ACL规则, 1:打开  0:关闭，默认不打开</p>
     */
    public Long getEnableAclRule() {
        return this.EnableAclRule;
    }

    /**
     * Set <p>预设ACL规则, 1:打开  0:关闭，默认不打开</p>
     * @param EnableAclRule <p>预设ACL规则, 1:打开  0:关闭，默认不打开</p>
     */
    public void setEnableAclRule(Long EnableAclRule) {
        this.EnableAclRule = EnableAclRule;
    }

    /**
     * Get <p>ACL规则名</p> 
     * @return AclRuleName <p>ACL规则名</p>
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set <p>ACL规则名</p>
     * @param AclRuleName <p>ACL规则名</p>
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get <p>可选, 保留文件大小</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：Bytes</p><p>默认值：-1</p><p>特殊值：-1表示无限制</p> 
     * @return RetentionBytes <p>可选, 保留文件大小</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：Bytes</p><p>默认值：-1</p><p>特殊值：-1表示无限制</p>
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set <p>可选, 保留文件大小</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：Bytes</p><p>默认值：-1</p><p>特殊值：-1表示无限制</p>
     * @param RetentionBytes <p>可选, 保留文件大小</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：Bytes</p><p>默认值：-1</p><p>特殊值：-1表示无限制</p>
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>生产限流，单位 MB/s；设置为-1，则生产不限流</p> 
     * @return QuotaProducerByteRate <p>生产限流，单位 MB/s；设置为-1，则生产不限流</p>
     */
    public Long getQuotaProducerByteRate() {
        return this.QuotaProducerByteRate;
    }

    /**
     * Set <p>生产限流，单位 MB/s；设置为-1，则生产不限流</p>
     * @param QuotaProducerByteRate <p>生产限流，单位 MB/s；设置为-1，则生产不限流</p>
     */
    public void setQuotaProducerByteRate(Long QuotaProducerByteRate) {
        this.QuotaProducerByteRate = QuotaProducerByteRate;
    }

    /**
     * Get <p>消费限流，单位 MB/s；设置为-1，则消费不限流</p> 
     * @return QuotaConsumerByteRate <p>消费限流，单位 MB/s；设置为-1，则消费不限流</p>
     */
    public Long getQuotaConsumerByteRate() {
        return this.QuotaConsumerByteRate;
    }

    /**
     * Set <p>消费限流，单位 MB/s；设置为-1，则消费不限流</p>
     * @param QuotaConsumerByteRate <p>消费限流，单位 MB/s；设置为-1，则消费不限流</p>
     */
    public void setQuotaConsumerByteRate(Long QuotaConsumerByteRate) {
        this.QuotaConsumerByteRate = QuotaConsumerByteRate;
    }

    /**
     * Get <p>topic副本数  最小值 1,最大值 3</p> 
     * @return ReplicaNum <p>topic副本数  最小值 1,最大值 3</p>
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set <p>topic副本数  最小值 1,最大值 3</p>
     * @param ReplicaNum <p>topic副本数  最小值 1,最大值 3</p>
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get <p>消息保存的时间类型：CreateTime/LogAppendTime</p> 
     * @return LogMsgTimestampType <p>消息保存的时间类型：CreateTime/LogAppendTime</p>
     */
    public String getLogMsgTimestampType() {
        return this.LogMsgTimestampType;
    }

    /**
     * Set <p>消息保存的时间类型：CreateTime/LogAppendTime</p>
     * @param LogMsgTimestampType <p>消息保存的时间类型：CreateTime/LogAppendTime</p>
     */
    public void setLogMsgTimestampType(String LogMsgTimestampType) {
        this.LogMsgTimestampType = LogMsgTimestampType;
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
        if (source.LogMsgTimestampType != null) {
            this.LogMsgTimestampType = new String(source.LogMsgTimestampType);
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
        this.setParamSimple(map, prefix + "LogMsgTimestampType", this.LogMsgTimestampType);

    }
}

