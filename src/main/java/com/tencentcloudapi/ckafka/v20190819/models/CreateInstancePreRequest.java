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
    * <p>ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>可用区。当购买多可用区实例时，当前参数为主可用区。  <a href="https://cloud.tencent.com/document/product/597/55246">查看可用区</a></p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <p>国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>私有网络Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。</p>
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>创建实例时可以选择集群Id, 该入参表示集群Id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <p>预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。</p>
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <p>实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"</p>
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * <p>磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>是否创建跨可用区实例，当前参数为 true 时，zoneIds必填</p>
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * <p>可用区列表，购买多可用区实例时为必填项</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍</p>
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
    * <p>购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例</p>
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>是否自动选择代金券:1-是;0否。默认为0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>弹性带宽开关 0不开启  1开启（0默认）</p>
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
    * <p>自定义证书Id,仅当SpecificationsType为profession时生效,支持自定义证书能力</p><p>可通过<a href="https://cloud.tencent.com/document/product/400/41673">DescribeCertificateDetail</a>接口获取</p>
    */
    @SerializedName("CustomSSLCertId")
    @Expose
    private String CustomSSLCertId;

    /**
     * Get <p>ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。</p> 
     * @return InstanceName <p>ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。</p>
     * @param InstanceName <p>ckafka集群实例Name，是一个不超过 128 个字符的任意字符串。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>可用区。当购买多可用区实例时，当前参数为主可用区。  <a href="https://cloud.tencent.com/document/product/597/55246">查看可用区</a></p> 
     * @return ZoneId <p>可用区。当购买多可用区实例时，当前参数为主可用区。  <a href="https://cloud.tencent.com/document/product/597/55246">查看可用区</a></p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区。当购买多可用区实例时，当前参数为主可用区。  <a href="https://cloud.tencent.com/document/product/597/55246">查看可用区</a></p>
     * @param ZoneId <p>可用区。当购买多可用区实例时，当前参数为主可用区。  <a href="https://cloud.tencent.com/document/product/597/55246">查看可用区</a></p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m</p> 
     * @return Period <p>预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m</p>
     * @param Period <p>预付费购买时长，例如 "1m",就是一个月,取值范围 1m~36m</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get <p>国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。</p> 
     * @return InstanceType <p>国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。</p>
     * @param InstanceType <p>国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>私有网络Id</p> 
     * @return VpcId <p>私有网络Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络Id</p>
     * @param VpcId <p>私有网络Id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网id</p> 
     * @return SubnetId <p>子网id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网id</p>
     * @param SubnetId <p>子网id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。</p> 
     * @return MsgRetentionTime <p>可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。</p>
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <p>可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。</p>
     * @param MsgRetentionTime <p>可选。实例日志的最长保留时间，单位分钟，不填默认为1440（1天），可设置范围为1分钟到90天。</p>
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>创建实例时可以选择集群Id, 该入参表示集群Id</p> 
     * @return ClusterId <p>创建实例时可以选择集群Id, 该入参表示集群Id</p>
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>创建实例时可以选择集群Id, 该入参表示集群Id</p>
     * @param ClusterId <p>创建实例时可以选择集群Id, 该入参表示集群Id</p>
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p> 
     * @return RenewFlag <p>预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     * @param RenewFlag <p>预付费自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。</p> 
     * @return KafkaVersion <p>CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。</p>
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。</p>
     * @param KafkaVersion <p>CKafka版本号[2.4.1, 2.4.2, 2.8.1, 3.2.3], 默认取值是2.4.1。2.4.1 与 2.4.2 属于同一个版本，传任意一个均可。</p>
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <p>实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"</p> 
     * @return SpecificationsType <p>实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"</p>
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set <p>实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"</p>
     * @param SpecificationsType <p>实例类型: [标准版实例]填写 "standard" (默认), [专业版实例]填写 "profession",[高级版实例]填写"premium"</p>
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get <p>磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p> 
     * @return DiskSize <p>磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
     * @param DiskSize <p>磁盘大小，如果跟控制台规格配比不相符，则无法创建成功。默认取值为500，步长设置为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p> 
     * @return BandWidth <p>实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
     * @param BandWidth <p>实例带宽,默认值为40，单位MB/s; 最小值:20MB/s, 高级版最大值:360MB/s,专业版最大值:100000MB/s  标准版固定带宽规格: 40MB/s, 100MB/s, 150MB/s。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p> 
     * @return Partition <p>分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
     * @param Partition <p>分区大小，如果跟控制台规格配比不相符，则无法创建成功。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"</p> 
     * @return DiskType <p>专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"</p>
     * @param DiskType <p>专业版/高级版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认为 "CLOUD_BASIC"</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>是否创建跨可用区实例，当前参数为 true 时，zoneIds必填</p> 
     * @return MultiZoneFlag <p>是否创建跨可用区实例，当前参数为 true 时，zoneIds必填</p>
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set <p>是否创建跨可用区实例，当前参数为 true 时，zoneIds必填</p>
     * @param MultiZoneFlag <p>是否创建跨可用区实例，当前参数为 true 时，zoneIds必填</p>
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get <p>可用区列表，购买多可用区实例时为必填项</p> 
     * @return ZoneIds <p>可用区列表，购买多可用区实例时为必填项</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区列表，购买多可用区实例时为必填项</p>
     * @param ZoneIds <p>可用区列表，购买多可用区实例时为必填项</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍</p> 
     * @return PublicNetworkMonthly <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍</p>
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍</p>
     * @param PublicNetworkMonthly <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。默认值为 0。需要保证传入参数为 3 的整数倍</p>
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
    }

    /**
     * Get <p>购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例</p> 
     * @return InstanceNum <p>购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例</p>
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set <p>购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例</p>
     * @param InstanceNum <p>购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例</p>
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get <p>是否自动选择代金券:1-是;0否。默认为0</p> 
     * @return AutoVoucher <p>是否自动选择代金券:1-是;0否。默认为0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券:1-是;0否。默认为0</p>
     * @param AutoVoucher <p>是否自动选择代金券:1-是;0否。默认为0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>弹性带宽开关 0不开启  1开启（0默认）</p> 
     * @return ElasticBandwidthSwitch <p>弹性带宽开关 0不开启  1开启（0默认）</p>
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set <p>弹性带宽开关 0不开启  1开启（0默认）</p>
     * @param ElasticBandwidthSwitch <p>弹性带宽开关 0不开启  1开启（0默认）</p>
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    /**
     * Get <p>自定义证书Id,仅当SpecificationsType为profession时生效,支持自定义证书能力</p><p>可通过<a href="https://cloud.tencent.com/document/product/400/41673">DescribeCertificateDetail</a>接口获取</p> 
     * @return CustomSSLCertId <p>自定义证书Id,仅当SpecificationsType为profession时生效,支持自定义证书能力</p><p>可通过<a href="https://cloud.tencent.com/document/product/400/41673">DescribeCertificateDetail</a>接口获取</p>
     */
    public String getCustomSSLCertId() {
        return this.CustomSSLCertId;
    }

    /**
     * Set <p>自定义证书Id,仅当SpecificationsType为profession时生效,支持自定义证书能力</p><p>可通过<a href="https://cloud.tencent.com/document/product/400/41673">DescribeCertificateDetail</a>接口获取</p>
     * @param CustomSSLCertId <p>自定义证书Id,仅当SpecificationsType为profession时生效,支持自定义证书能力</p><p>可通过<a href="https://cloud.tencent.com/document/product/400/41673">DescribeCertificateDetail</a>接口获取</p>
     */
    public void setCustomSSLCertId(String CustomSSLCertId) {
        this.CustomSSLCertId = CustomSSLCertId;
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
        if (source.CustomSSLCertId != null) {
            this.CustomSSLCertId = new String(source.CustomSSLCertId);
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
        this.setParamSimple(map, prefix + "CustomSSLCertId", this.CustomSSLCertId);

    }
}

