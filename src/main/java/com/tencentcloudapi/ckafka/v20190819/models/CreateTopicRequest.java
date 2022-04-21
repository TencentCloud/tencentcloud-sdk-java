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

public class CreateTopicRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Partition个数，大于0
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 副本个数，不能多于 broker 数，最大为3
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * ip白名单开关, 1:打开  0:关闭，默认不打开
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * Ip白名单列表，配额限制，enableWhileList=1时必选
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * 清理日志策略，日志清理模式，默认为"delete"。"delete"：日志按保存时间删除，"compact"：日志按 key 压缩，"compact, delete"：日志按 key 压缩且会按保存时间删除。
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 默认为1
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * 是否允许未同步的副本选为leader，false:不允许，true:允许，默认不允许
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * 可选参数。消息保留时间，单位ms，当前最小值为60000ms
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Segment分片滚动的时长，单位ms，当前最小为3600000ms
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * 主题消息最大值，单位为 Byte，最小值1024Byte(即1KB)，最大值为8388608Byte（即8MB）。
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * 预设ACL规则, 1:打开  0:关闭，默认不打开
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * 预设ACL规则的名称
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
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return TopicName 主题名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param TopicName 主题名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Partition个数，大于0 
     * @return PartitionNum Partition个数，大于0
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Partition个数，大于0
     * @param PartitionNum Partition个数，大于0
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get 副本个数，不能多于 broker 数，最大为3 
     * @return ReplicaNum 副本个数，不能多于 broker 数，最大为3
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本个数，不能多于 broker 数，最大为3
     * @param ReplicaNum 副本个数，不能多于 broker 数，最大为3
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get ip白名单开关, 1:打开  0:关闭，默认不打开 
     * @return EnableWhiteList ip白名单开关, 1:打开  0:关闭，默认不打开
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set ip白名单开关, 1:打开  0:关闭，默认不打开
     * @param EnableWhiteList ip白名单开关, 1:打开  0:关闭，默认不打开
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
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
     * Get 清理日志策略，日志清理模式，默认为"delete"。"delete"：日志按保存时间删除，"compact"：日志按 key 压缩，"compact, delete"：日志按 key 压缩且会按保存时间删除。 
     * @return CleanUpPolicy 清理日志策略，日志清理模式，默认为"delete"。"delete"：日志按保存时间删除，"compact"：日志按 key 压缩，"compact, delete"：日志按 key 压缩且会按保存时间删除。
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set 清理日志策略，日志清理模式，默认为"delete"。"delete"：日志按保存时间删除，"compact"：日志按 key 压缩，"compact, delete"：日志按 key 压缩且会按保存时间删除。
     * @param CleanUpPolicy 清理日志策略，日志清理模式，默认为"delete"。"delete"：日志按保存时间删除，"compact"：日志按 key 压缩，"compact, delete"：日志按 key 压缩且会按保存时间删除。
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return Note 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param Note 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 默认为1 
     * @return MinInsyncReplicas 默认为1
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set 默认为1
     * @param MinInsyncReplicas 默认为1
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get 是否允许未同步的副本选为leader，false:不允许，true:允许，默认不允许 
     * @return UncleanLeaderElectionEnable 是否允许未同步的副本选为leader，false:不允许，true:允许，默认不允许
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 是否允许未同步的副本选为leader，false:不允许，true:允许，默认不允许
     * @param UncleanLeaderElectionEnable 是否允许未同步的副本选为leader，false:不允许，true:允许，默认不允许
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get 可选参数。消息保留时间，单位ms，当前最小值为60000ms 
     * @return RetentionMs 可选参数。消息保留时间，单位ms，当前最小值为60000ms
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set 可选参数。消息保留时间，单位ms，当前最小值为60000ms
     * @param RetentionMs 可选参数。消息保留时间，单位ms，当前最小值为60000ms
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Segment分片滚动的时长，单位ms，当前最小为3600000ms 
     * @return SegmentMs Segment分片滚动的时长，单位ms，当前最小为3600000ms
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment分片滚动的时长，单位ms，当前最小为3600000ms
     * @param SegmentMs Segment分片滚动的时长，单位ms，当前最小为3600000ms
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get 主题消息最大值，单位为 Byte，最小值1024Byte(即1KB)，最大值为8388608Byte（即8MB）。 
     * @return MaxMessageBytes 主题消息最大值，单位为 Byte，最小值1024Byte(即1KB)，最大值为8388608Byte（即8MB）。
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set 主题消息最大值，单位为 Byte，最小值1024Byte(即1KB)，最大值为8388608Byte（即8MB）。
     * @param MaxMessageBytes 主题消息最大值，单位为 Byte，最小值1024Byte(即1KB)，最大值为8388608Byte（即8MB）。
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
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
     * Get 预设ACL规则的名称 
     * @return AclRuleName 预设ACL规则的名称
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set 预设ACL规则的名称
     * @param AclRuleName 预设ACL规则的名称
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

    }
}

