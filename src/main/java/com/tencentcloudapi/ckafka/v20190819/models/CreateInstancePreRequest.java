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

public class CreateInstancePreRequest extends AbstractModel{

    /**
    * 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 可用区
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 预付费购买时长，例如 "1m",就是一个月
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 实例规格说明 专业版实例[所有规格]填写1.
标准版实例 ([入门型]填写1，[标准型]填写2，[进阶型]填写3，[容量型]填写4，[高阶型1]填写5，[高阶性2]填写6,[高阶型3]填写7,[高阶型4]填写8，[独占型]填写9。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * vpcId，不填默认基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id，vpc网络需要传该参数，基础网络可以不传
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 可选。实例日志的最长保留时间，单位分钟，默认为10080（7天），最大30天，不填默认0，代表不开启日志保留时间回收策略
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * 创建实例时可以选择集群Id, 该入参表示集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * 预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * CKafka版本号[0.10.2、1.1.1、2.4.1], 默认是1.1.1
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 实例类型: [标准版实例]填写 standard(默认), [专业版实例]填写 profession
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * 磁盘大小,专业版不填写默认最小磁盘,填写后根据磁盘带宽分区数弹性计算
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 带宽,专业版不填写默认最小带宽,填写后根据磁盘带宽分区数弹性计算
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 分区大小,专业版不填写默认最小分区数,填写后根据磁盘带宽分区数弹性计算
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 磁盘类型（ssd填写CLOUD_SSD，sata填写CLOUD_BASIC）
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 跨可用区，zoneIds必填
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
     * Get 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return InstanceName 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param InstanceName 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 可用区 
     * @return ZoneId 可用区
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区
     * @param ZoneId 可用区
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 预付费购买时长，例如 "1m",就是一个月 
     * @return Period 预付费购买时长，例如 "1m",就是一个月
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 预付费购买时长，例如 "1m",就是一个月
     * @param Period 预付费购买时长，例如 "1m",就是一个月
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 实例规格说明 专业版实例[所有规格]填写1.
标准版实例 ([入门型]填写1，[标准型]填写2，[进阶型]填写3，[容量型]填写4，[高阶型1]填写5，[高阶性2]填写6,[高阶型3]填写7,[高阶型4]填写8，[独占型]填写9。 
     * @return InstanceType 实例规格说明 专业版实例[所有规格]填写1.
标准版实例 ([入门型]填写1，[标准型]填写2，[进阶型]填写3，[容量型]填写4，[高阶型1]填写5，[高阶性2]填写6,[高阶型3]填写7,[高阶型4]填写8，[独占型]填写9。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例规格说明 专业版实例[所有规格]填写1.
标准版实例 ([入门型]填写1，[标准型]填写2，[进阶型]填写3，[容量型]填写4，[高阶型1]填写5，[高阶性2]填写6,[高阶型3]填写7,[高阶型4]填写8，[独占型]填写9。
     * @param InstanceType 实例规格说明 专业版实例[所有规格]填写1.
标准版实例 ([入门型]填写1，[标准型]填写2，[进阶型]填写3，[容量型]填写4，[高阶型1]填写5，[高阶性2]填写6,[高阶型3]填写7,[高阶型4]填写8，[独占型]填写9。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get vpcId，不填默认基础网络 
     * @return VpcId vpcId，不填默认基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId，不填默认基础网络
     * @param VpcId vpcId，不填默认基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id，vpc网络需要传该参数，基础网络可以不传 
     * @return SubnetId 子网id，vpc网络需要传该参数，基础网络可以不传
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id，vpc网络需要传该参数，基础网络可以不传
     * @param SubnetId 子网id，vpc网络需要传该参数，基础网络可以不传
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 可选。实例日志的最长保留时间，单位分钟，默认为10080（7天），最大30天，不填默认0，代表不开启日志保留时间回收策略 
     * @return MsgRetentionTime 可选。实例日志的最长保留时间，单位分钟，默认为10080（7天），最大30天，不填默认0，代表不开启日志保留时间回收策略
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set 可选。实例日志的最长保留时间，单位分钟，默认为10080（7天），最大30天，不填默认0，代表不开启日志保留时间回收策略
     * @param MsgRetentionTime 可选。实例日志的最长保留时间，单位分钟，默认为10080（7天），最大30天，不填默认0，代表不开启日志保留时间回收策略
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get 创建实例时可以选择集群Id, 该入参表示集群Id 
     * @return ClusterId 创建实例时可以选择集群Id, 该入参表示集群Id
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 创建实例时可以选择集群Id, 该入参表示集群Id
     * @param ClusterId 创建实例时可以选择集群Id, 该入参表示集群Id
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置) 
     * @return RenewFlag 预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
     * @param RenewFlag 预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get CKafka版本号[0.10.2、1.1.1、2.4.1], 默认是1.1.1 
     * @return KafkaVersion CKafka版本号[0.10.2、1.1.1、2.4.1], 默认是1.1.1
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set CKafka版本号[0.10.2、1.1.1、2.4.1], 默认是1.1.1
     * @param KafkaVersion CKafka版本号[0.10.2、1.1.1、2.4.1], 默认是1.1.1
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 实例类型: [标准版实例]填写 standard(默认), [专业版实例]填写 profession 
     * @return SpecificationsType 实例类型: [标准版实例]填写 standard(默认), [专业版实例]填写 profession
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set 实例类型: [标准版实例]填写 standard(默认), [专业版实例]填写 profession
     * @param SpecificationsType 实例类型: [标准版实例]填写 standard(默认), [专业版实例]填写 profession
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get 磁盘大小,专业版不填写默认最小磁盘,填写后根据磁盘带宽分区数弹性计算 
     * @return DiskSize 磁盘大小,专业版不填写默认最小磁盘,填写后根据磁盘带宽分区数弹性计算
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小,专业版不填写默认最小磁盘,填写后根据磁盘带宽分区数弹性计算
     * @param DiskSize 磁盘大小,专业版不填写默认最小磁盘,填写后根据磁盘带宽分区数弹性计算
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 带宽,专业版不填写默认最小带宽,填写后根据磁盘带宽分区数弹性计算 
     * @return BandWidth 带宽,专业版不填写默认最小带宽,填写后根据磁盘带宽分区数弹性计算
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 带宽,专业版不填写默认最小带宽,填写后根据磁盘带宽分区数弹性计算
     * @param BandWidth 带宽,专业版不填写默认最小带宽,填写后根据磁盘带宽分区数弹性计算
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 分区大小,专业版不填写默认最小分区数,填写后根据磁盘带宽分区数弹性计算 
     * @return Partition 分区大小,专业版不填写默认最小分区数,填写后根据磁盘带宽分区数弹性计算
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区大小,专业版不填写默认最小分区数,填写后根据磁盘带宽分区数弹性计算
     * @param Partition 分区大小,专业版不填写默认最小分区数,填写后根据磁盘带宽分区数弹性计算
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 磁盘类型（ssd填写CLOUD_SSD，sata填写CLOUD_BASIC） 
     * @return DiskType 磁盘类型（ssd填写CLOUD_SSD，sata填写CLOUD_BASIC）
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型（ssd填写CLOUD_SSD，sata填写CLOUD_BASIC）
     * @param DiskType 磁盘类型（ssd填写CLOUD_SSD，sata填写CLOUD_BASIC）
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 跨可用区，zoneIds必填 
     * @return MultiZoneFlag 跨可用区，zoneIds必填
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set 跨可用区，zoneIds必填
     * @param MultiZoneFlag 跨可用区，zoneIds必填
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get 可用区列表 
     * @return ZoneIds 可用区列表
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区列表
     * @param ZoneIds 可用区列表
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public CreateInstancePreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreRequest(CreateInstancePreRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SpecificationsType != null) {
            this.SpecificationsType = new String(source.SpecificationsType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SpecificationsType", this.SpecificationsType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

