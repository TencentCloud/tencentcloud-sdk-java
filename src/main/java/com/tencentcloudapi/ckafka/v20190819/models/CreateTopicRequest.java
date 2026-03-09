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

public class CreateTopicRequest extends AbstractModel {

    /**
    * <p>实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>只能包含字母、数字、下划线、“-”、“.”</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Partition个数，大于0</p>
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * <p>副本个数，不能多于 broker 数，最大为3</p>
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * <p>ip白名单开关, 1:打开  0:关闭，默认不打开</p>
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * <p>Ip白名单列表，配额限制，enableWhileList=1时必选</p>
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * <p>清理日志策略，日志清理模式，默认为&quot;delete&quot;。&quot;delete&quot;：日志按保存时间删除，&quot;compact&quot;：日志按 key 压缩，&quot;compact, delete&quot;：日志按 key 压缩且会按保存时间删除。</p>
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * <p>主题备注</p><p>入参限制：不超过 64 个字符</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>最小同步副本数</p><p>默认值：1</p><p>最小值为1</p>
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * <p>是否允许未同步的副本选为leader，0:不允许，1:允许，默认不允许</p>
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <p>可选参数，消息保留时间</p><p>取值范围：[60000, 7776000000]</p><p>单位：毫秒</p><p>默认值：7200000</p>
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * <p>主题消息最大值，单位为 Byte，最小值1024Bytes(即1KB)，最大值为12582912Bytes（即12MB）</p>
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * <p>预设ACL规则, 1:打开  0:关闭，默认不打开</p>
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * <p>预设ACL规则的名称</p>
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * <p>可选, 保留文件大小. 默认为-1,单位Byte, 当前最小值为1073741824。</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：字节</p><p>特殊值：-1表示无限制</p>
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
    * <p>消息保存的时间类型:CreateTime/LogAppendTime</p>
    */
    @SerializedName("LogMsgTimestampType")
    @Expose
    private String LogMsgTimestampType;

    /**
     * Get <p>实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p> 
     * @return InstanceId <p>实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     * @param InstanceId <p>实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>只能包含字母、数字、下划线、“-”、“.”</p> 
     * @return TopicName <p>只能包含字母、数字、下划线、“-”、“.”</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>只能包含字母、数字、下划线、“-”、“.”</p>
     * @param TopicName <p>只能包含字母、数字、下划线、“-”、“.”</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Partition个数，大于0</p> 
     * @return PartitionNum <p>Partition个数，大于0</p>
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set <p>Partition个数，大于0</p>
     * @param PartitionNum <p>Partition个数，大于0</p>
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get <p>副本个数，不能多于 broker 数，最大为3</p> 
     * @return ReplicaNum <p>副本个数，不能多于 broker 数，最大为3</p>
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set <p>副本个数，不能多于 broker 数，最大为3</p>
     * @param ReplicaNum <p>副本个数，不能多于 broker 数，最大为3</p>
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get <p>ip白名单开关, 1:打开  0:关闭，默认不打开</p> 
     * @return EnableWhiteList <p>ip白名单开关, 1:打开  0:关闭，默认不打开</p>
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set <p>ip白名单开关, 1:打开  0:关闭，默认不打开</p>
     * @param EnableWhiteList <p>ip白名单开关, 1:打开  0:关闭，默认不打开</p>
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
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
     * Get <p>清理日志策略，日志清理模式，默认为&quot;delete&quot;。&quot;delete&quot;：日志按保存时间删除，&quot;compact&quot;：日志按 key 压缩，&quot;compact, delete&quot;：日志按 key 压缩且会按保存时间删除。</p> 
     * @return CleanUpPolicy <p>清理日志策略，日志清理模式，默认为&quot;delete&quot;。&quot;delete&quot;：日志按保存时间删除，&quot;compact&quot;：日志按 key 压缩，&quot;compact, delete&quot;：日志按 key 压缩且会按保存时间删除。</p>
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set <p>清理日志策略，日志清理模式，默认为&quot;delete&quot;。&quot;delete&quot;：日志按保存时间删除，&quot;compact&quot;：日志按 key 压缩，&quot;compact, delete&quot;：日志按 key 压缩且会按保存时间删除。</p>
     * @param CleanUpPolicy <p>清理日志策略，日志清理模式，默认为&quot;delete&quot;。&quot;delete&quot;：日志按保存时间删除，&quot;compact&quot;：日志按 key 压缩，&quot;compact, delete&quot;：日志按 key 压缩且会按保存时间删除。</p>
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get <p>主题备注</p><p>入参限制：不超过 64 个字符</p> 
     * @return Note <p>主题备注</p><p>入参限制：不超过 64 个字符</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>主题备注</p><p>入参限制：不超过 64 个字符</p>
     * @param Note <p>主题备注</p><p>入参限制：不超过 64 个字符</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
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
     * Get <p>是否允许未同步的副本选为leader，0:不允许，1:允许，默认不允许</p> 
     * @return UncleanLeaderElectionEnable <p>是否允许未同步的副本选为leader，0:不允许，1:允许，默认不允许</p>
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <p>是否允许未同步的副本选为leader，0:不允许，1:允许，默认不允许</p>
     * @param UncleanLeaderElectionEnable <p>是否允许未同步的副本选为leader，0:不允许，1:允许，默认不允许</p>
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <p>可选参数，消息保留时间</p><p>取值范围：[60000, 7776000000]</p><p>单位：毫秒</p><p>默认值：7200000</p> 
     * @return RetentionMs <p>可选参数，消息保留时间</p><p>取值范围：[60000, 7776000000]</p><p>单位：毫秒</p><p>默认值：7200000</p>
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set <p>可选参数，消息保留时间</p><p>取值范围：[60000, 7776000000]</p><p>单位：毫秒</p><p>默认值：7200000</p>
     * @param RetentionMs <p>可选参数，消息保留时间</p><p>取值范围：[60000, 7776000000]</p><p>单位：毫秒</p><p>默认值：7200000</p>
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p> 
     * @return SegmentMs <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
     * @param SegmentMs <p>Segment分片滚动的时长</p><p>单位：毫秒</p><p>默认值：86400000</p><p>最小值为86400000ms（1天）</p>
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get <p>主题消息最大值，单位为 Byte，最小值1024Bytes(即1KB)，最大值为12582912Bytes（即12MB）</p> 
     * @return MaxMessageBytes <p>主题消息最大值，单位为 Byte，最小值1024Bytes(即1KB)，最大值为12582912Bytes（即12MB）</p>
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set <p>主题消息最大值，单位为 Byte，最小值1024Bytes(即1KB)，最大值为12582912Bytes（即12MB）</p>
     * @param MaxMessageBytes <p>主题消息最大值，单位为 Byte，最小值1024Bytes(即1KB)，最大值为12582912Bytes（即12MB）</p>
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
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
     * Get <p>预设ACL规则的名称</p> 
     * @return AclRuleName <p>预设ACL规则的名称</p>
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set <p>预设ACL规则的名称</p>
     * @param AclRuleName <p>预设ACL规则的名称</p>
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get <p>可选, 保留文件大小. 默认为-1,单位Byte, 当前最小值为1073741824。</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：字节</p><p>特殊值：-1表示无限制</p> 
     * @return RetentionBytes <p>可选, 保留文件大小. 默认为-1,单位Byte, 当前最小值为1073741824。</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：字节</p><p>特殊值：-1表示无限制</p>
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set <p>可选, 保留文件大小. 默认为-1,单位Byte, 当前最小值为1073741824。</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：字节</p><p>特殊值：-1表示无限制</p>
     * @param RetentionBytes <p>可选, 保留文件大小. 默认为-1,单位Byte, 当前最小值为1073741824。</p><p>取值范围：[1073741824, 1099511627776]</p><p>单位：字节</p><p>特殊值：-1表示无限制</p>
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
     * Get <p>消息保存的时间类型:CreateTime/LogAppendTime</p> 
     * @return LogMsgTimestampType <p>消息保存的时间类型:CreateTime/LogAppendTime</p>
     */
    public String getLogMsgTimestampType() {
        return this.LogMsgTimestampType;
    }

    /**
     * Set <p>消息保存的时间类型:CreateTime/LogAppendTime</p>
     * @param LogMsgTimestampType <p>消息保存的时间类型:CreateTime/LogAppendTime</p>
     */
    public void setLogMsgTimestampType(String LogMsgTimestampType) {
        this.LogMsgTimestampType = LogMsgTimestampType;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.EnableWhiteList != null) {
            this.EnableWhiteList = new Long(source.EnableWhiteList);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
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
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
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
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "EnableAclRule", this.EnableAclRule);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LogMsgTimestampType", this.LogMsgTimestampType);

    }
}

