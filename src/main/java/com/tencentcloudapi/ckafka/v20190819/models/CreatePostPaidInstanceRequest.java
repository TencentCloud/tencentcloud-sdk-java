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

public class CreatePostPaidInstanceRequest extends AbstractModel {

    /**
    * <p>私有网络Id,可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网Id,可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>ckafka集群实例名称，是一个长度不超过128的任意字符。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>国际站标准版实例规格。目前只有国际站标准版使用当前字段区分规格，国内站标准版使用峰值带宽区分规格。除了国际站标准版外的所有实例填写 1 即可。国际站标准版实例：入门型(general)]填写1；[标准型(standard)]填写2；[进阶型(advanced)]填写3；[容量型(capacity)]填写4；[高阶型1(specialized-1)]填写5；[高阶型2(specialized-2)]填写6；[高阶型3(specialized-3)]填写7；[高阶型4(specialized-4)]填写8。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准</p>
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <p>实例版本。目前支持当前支持"2.4.1", "2.4.2","2.8.1", "3.2.3"，默认取值"2.4.1"。"2.4.1" 与 "2.4.2" 属于同一个版本，传任意一个均可。</p>
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <p>实例类型。"standard"：标准版，"profession"：专业版。  (标准版仅国际站支持，国内站目前支持专业版)</p>
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * <p>专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认值为 "CLOUD_BASIC"</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>实例内网峰值带宽，默认值为40。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>实例硬盘大小，默认取值为500，步长设置为100。需要满足当前实例的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>实例最大分区数量，需要满足当前实例的计费规格。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>实例最大 topic 数量，需要满足当前实例的计费规格。默认值为800，步长设置为100。</p>
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * <p>实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在子网的可用区 id。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>当前实例是否为多可用区实例。</p>
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * <p>当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例</p>
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。需要保证传入参数为 3 的整数倍</p>
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>弹性带宽开关 0不开启  1开启（0默认)</p>
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
     * Get <p>私有网络Id,可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取</p> 
     * @return VpcId <p>私有网络Id,可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络Id,可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取</p>
     * @param VpcId <p>私有网络Id,可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>接口获取</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网Id,可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取</p> 
     * @return SubnetId <p>子网Id,可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网Id,可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取</p>
     * @param SubnetId <p>子网Id,可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>ckafka集群实例名称，是一个长度不超过128的任意字符。</p> 
     * @return InstanceName <p>ckafka集群实例名称，是一个长度不超过128的任意字符。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ckafka集群实例名称，是一个长度不超过128的任意字符。</p>
     * @param InstanceName <p>ckafka集群实例名称，是一个长度不超过128的任意字符。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准</p> 
     * @return MsgRetentionTime <p>实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准</p>
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <p>实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准</p>
     * @param MsgRetentionTime <p>实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准</p>
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数</p> 
     * @return ClusterId <p>创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数</p>
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数</p>
     * @param ClusterId <p>创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数</p>
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例版本。目前支持当前支持"2.4.1", "2.4.2","2.8.1", "3.2.3"，默认取值"2.4.1"。"2.4.1" 与 "2.4.2" 属于同一个版本，传任意一个均可。</p> 
     * @return KafkaVersion <p>实例版本。目前支持当前支持"2.4.1", "2.4.2","2.8.1", "3.2.3"，默认取值"2.4.1"。"2.4.1" 与 "2.4.2" 属于同一个版本，传任意一个均可。</p>
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>实例版本。目前支持当前支持"2.4.1", "2.4.2","2.8.1", "3.2.3"，默认取值"2.4.1"。"2.4.1" 与 "2.4.2" 属于同一个版本，传任意一个均可。</p>
     * @param KafkaVersion <p>实例版本。目前支持当前支持"2.4.1", "2.4.2","2.8.1", "3.2.3"，默认取值"2.4.1"。"2.4.1" 与 "2.4.2" 属于同一个版本，传任意一个均可。</p>
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <p>实例类型。"standard"：标准版，"profession"：专业版。  (标准版仅国际站支持，国内站目前支持专业版)</p> 
     * @return SpecificationsType <p>实例类型。"standard"：标准版，"profession"：专业版。  (标准版仅国际站支持，国内站目前支持专业版)</p>
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set <p>实例类型。"standard"：标准版，"profession"：专业版。  (标准版仅国际站支持，国内站目前支持专业版)</p>
     * @param SpecificationsType <p>实例类型。"standard"：标准版，"profession"：专业版。  (标准版仅国际站支持，国内站目前支持专业版)</p>
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get <p>专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认值为 "CLOUD_BASIC"</p> 
     * @return DiskType <p>专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认值为 "CLOUD_BASIC"</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认值为 "CLOUD_BASIC"</p>
     * @param DiskType <p>专业版实例磁盘类型，标准版实例不需要填写。"CLOUD_SSD"：SSD云硬盘；"CLOUD_BASIC"：高性能云硬盘。不传默认值为 "CLOUD_BASIC"</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>实例内网峰值带宽，默认值为40。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p> 
     * @return BandWidth <p>实例内网峰值带宽，默认值为40。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>实例内网峰值带宽，默认值为40。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
     * @param BandWidth <p>实例内网峰值带宽，默认值为40。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/11745</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>实例硬盘大小，默认取值为500，步长设置为100。需要满足当前实例的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p> 
     * @return DiskSize <p>实例硬盘大小，默认取值为500，步长设置为100。需要满足当前实例的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>实例硬盘大小，默认取值为500，步长设置为100。需要满足当前实例的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
     * @param DiskSize <p>实例硬盘大小，默认取值为500，步长设置为100。需要满足当前实例的计费规格，可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122562</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>实例最大分区数量，需要满足当前实例的计费规格。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p> 
     * @return Partition <p>实例最大分区数量，需要满足当前实例的计费规格。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>实例最大分区数量，需要满足当前实例的计费规格。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
     * @param Partition <p>实例最大分区数量，需要满足当前实例的计费规格。默认值为800，步长为100。可以通过以下链接查看计费规格：https://cloud.tencent.com/document/product/597/122563</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>实例最大 topic 数量，需要满足当前实例的计费规格。默认值为800，步长设置为100。</p> 
     * @return TopicNum <p>实例最大 topic 数量，需要满足当前实例的计费规格。默认值为800，步长设置为100。</p>
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set <p>实例最大 topic 数量，需要满足当前实例的计费规格。默认值为800，步长设置为100。</p>
     * @param TopicNum <p>实例最大 topic 数量，需要满足当前实例的计费规格。默认值为800，步长设置为100。</p>
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get <p>实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在子网的可用区 id。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p> 
     * @return ZoneId <p>实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在子网的可用区 id。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在子网的可用区 id。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
     * @param ZoneId <p>实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在子网的可用区 id。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>当前实例是否为多可用区实例。</p> 
     * @return MultiZoneFlag <p>当前实例是否为多可用区实例。</p>
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set <p>当前实例是否为多可用区实例。</p>
     * @param MultiZoneFlag <p>当前实例是否为多可用区实例。</p>
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get <p>当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p> 
     * @return ZoneIds <p>当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
     * @param ZoneIds <p>当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中。ZoneId、ZoneIds不能同时为空，可通过<a href="https://cloud.tencent.com/document/product/597/55246">DescribeCkafkaZone</a>接口获取。</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
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
     * Get <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。需要保证传入参数为 3 的整数倍</p> 
     * @return PublicNetworkMonthly <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。需要保证传入参数为 3 的整数倍</p>
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。需要保证传入参数为 3 的整数倍</p>
     * @param PublicNetworkMonthly <p>公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 6Mbps 公网带宽，此处传 3。需要保证传入参数为 3 的整数倍</p>
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
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
     * Get <p>弹性带宽开关 0不开启  1开启（0默认)</p> 
     * @return ElasticBandwidthSwitch <p>弹性带宽开关 0不开启  1开启（0默认)</p>
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set <p>弹性带宽开关 0不开启  1开启（0默认)</p>
     * @param ElasticBandwidthSwitch <p>弹性带宽开关 0不开启  1开启（0默认)</p>
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

    public CreatePostPaidInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePostPaidInstanceRequest(CreatePostPaidInstanceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SpecificationsType != null) {
            this.SpecificationsType = new String(source.SpecificationsType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
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
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.PublicNetworkMonthly != null) {
            this.PublicNetworkMonthly = new Long(source.PublicNetworkMonthly);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SpecificationsType", this.SpecificationsType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "PublicNetworkMonthly", this.PublicNetworkMonthly);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ElasticBandwidthSwitch", this.ElasticBandwidthSwitch);
        this.setParamSimple(map, prefix + "CustomSSLCertId", this.CustomSSLCertId);

    }
}

