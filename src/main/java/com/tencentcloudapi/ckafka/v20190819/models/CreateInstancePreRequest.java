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
    * 可用区。当购买多可用区实例时，当前参数为主可用区。需要保证传入的参数和 SubnetId 所在子网属于同一个可用区
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
    * 国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * vpcId，必填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id，必填
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
    * CKafka版本号[0.10.2、1.1.1、2.4.1、2.4.2、2.8.1], 默认是1.1.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession"
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 带宽，如果跟控制台规格配比不相符，则无法创建成功
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 分区大小，如果跟控制台规格配比不相符，则无法创建成功
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
    * 专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 是否创建跨可用区实例，当前参数为 true 时，zoneIds必填
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * 可用区列表，购买多可用区实例时为必填项
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
    * 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

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
     * Get 可用区。当购买多可用区实例时，当前参数为主可用区。需要保证传入的参数和 SubnetId 所在子网属于同一个可用区 
     * @return ZoneId 可用区。当购买多可用区实例时，当前参数为主可用区。需要保证传入的参数和 SubnetId 所在子网属于同一个可用区
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区。当购买多可用区实例时，当前参数为主可用区。需要保证传入的参数和 SubnetId 所在子网属于同一个可用区
     * @param ZoneId 可用区。当购买多可用区实例时，当前参数为主可用区。需要保证传入的参数和 SubnetId 所在子网属于同一个可用区
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
     * Get 国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。 
     * @return InstanceType 国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。
     * @param InstanceType 国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get vpcId，必填 
     * @return VpcId vpcId，必填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId，必填
     * @param VpcId vpcId，必填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id，必填 
     * @return SubnetId 子网id，必填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id，必填
     * @param SubnetId 子网id，必填
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
     * Get CKafka版本号[0.10.2、1.1.1、2.4.1、2.4.2、2.8.1], 默认是1.1.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。 
     * @return KafkaVersion CKafka版本号[0.10.2、1.1.1、2.4.1、2.4.2、2.8.1], 默认是1.1.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set CKafka版本号[0.10.2、1.1.1、2.4.1、2.4.2、2.8.1], 默认是1.1.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
     * @param KafkaVersion CKafka版本号[0.10.2、1.1.1、2.4.1、2.4.2、2.8.1], 默认是1.1.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession" 
     * @return SpecificationsType 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession"
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession"
     * @param SpecificationsType 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession"
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功 
     * @return DiskSize 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功
     * @param DiskSize 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 带宽，如果跟控制台规格配比不相符，则无法创建成功 
     * @return BandWidth 带宽，如果跟控制台规格配比不相符，则无法创建成功
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 带宽，如果跟控制台规格配比不相符，则无法创建成功
     * @param BandWidth 带宽，如果跟控制台规格配比不相符，则无法创建成功
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 分区大小，如果跟控制台规格配比不相符，则无法创建成功 
     * @return Partition 分区大小，如果跟控制台规格配比不相符，则无法创建成功
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区大小，如果跟控制台规格配比不相符，则无法创建成功
     * @param Partition 分区大小，如果跟控制台规格配比不相符，则无法创建成功
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
     * Get 专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC" 
     * @return DiskType 专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
     * @param DiskType 专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 是否创建跨可用区实例，当前参数为 true 时，zoneIds必填 
     * @return MultiZoneFlag 是否创建跨可用区实例，当前参数为 true 时，zoneIds必填
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set 是否创建跨可用区实例，当前参数为 true 时，zoneIds必填
     * @param MultiZoneFlag 是否创建跨可用区实例，当前参数为 true 时，zoneIds必填
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get 可用区列表，购买多可用区实例时为必填项 
     * @return ZoneIds 可用区列表，购买多可用区实例时为必填项
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区列表，购买多可用区实例时为必填项
     * @param ZoneIds 可用区列表，购买多可用区实例时为必填项
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍 
     * @return PublicNetworkMonthly 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍
     * @param PublicNetworkMonthly 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
    }

    /**
     * Get 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例 
     * @return InstanceNum 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
     * @param InstanceNum 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
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
        if (source.PublicNetworkMonthly != null) {
            this.PublicNetworkMonthly = new Long(source.PublicNetworkMonthly);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
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
        this.setParamSimple(map, prefix + "PublicNetworkMonthly", this.PublicNetworkMonthly);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);

    }
}

