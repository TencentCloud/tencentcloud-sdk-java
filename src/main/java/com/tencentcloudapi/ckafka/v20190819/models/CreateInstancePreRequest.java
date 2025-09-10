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

public class CreateInstancePreRequest extends AbstractModel {

    /**
    * ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 可用区。当购买多可用区实例时，当前参数为主可用区。  [查看可用区](https://cloud.tencent.com/document/product/597/55246)
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m
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
    * 私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。
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
    * CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563
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
    * 专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
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
    * 是否自动选择代金券:1-是;0否。默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 弹性带宽开关 0不开启  1开启（0默认）
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
     * Get ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。 
     * @return InstanceName ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。
     * @param InstanceName ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 可用区。当购买多可用区实例时，当前参数为主可用区。  [查看可用区](https://cloud.tencent.com/document/product/597/55246) 
     * @return ZoneId 可用区。当购买多可用区实例时，当前参数为主可用区。  [查看可用区](https://cloud.tencent.com/document/product/597/55246)
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区。当购买多可用区实例时，当前参数为主可用区。  [查看可用区](https://cloud.tencent.com/document/product/597/55246)
     * @param ZoneId 可用区。当购买多可用区实例时，当前参数为主可用区。  [查看可用区](https://cloud.tencent.com/document/product/597/55246)
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m 
     * @return Period 预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m
     * @param Period 预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m
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
     * Get 私有网络Id 
     * @return VpcId 私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id
     * @param VpcId 私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。 
     * @return MsgRetentionTime 可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set 可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。
     * @param MsgRetentionTime 可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。
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
     * Get CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。 
     * @return KafkaVersion CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
     * @param KafkaVersion CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium" 
     * @return SpecificationsType 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"
     * @param SpecificationsType 实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562 
     * @return DiskSize 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562
     * @param DiskSize 磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745 
     * @return BandWidth 实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745
     * @param BandWidth 实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563 
     * @return Partition 分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563
     * @param Partition 分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563
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
     * Get 专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC" 
     * @return DiskType 专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
     * @param DiskType 专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"
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

    /**
     * Get 是否自动选择代金券:1-是;0否。默认为0 
     * @return AutoVoucher 是否自动选择代金券:1-是;0否。默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券:1-是;0否。默认为0
     * @param AutoVoucher 是否自动选择代金券:1-是;0否。默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 弹性带宽开关 0不开启  1开启（0默认） 
     * @return ElasticBandwidthSwitch 弹性带宽开关 0不开启  1开启（0默认）
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set 弹性带宽开关 0不开启  1开启（0默认）
     * @param ElasticBandwidthSwitch 弹性带宽开关 0不开启  1开启（0默认）
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
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
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.ElasticBandwidthSwitch != null) {
            this.ElasticBandwidthSwitch = new Long(source.ElasticBandwidthSwitch);
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
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "ElasticBandwidthSwitch", this.ElasticBandwidthSwitch);

    }
}

