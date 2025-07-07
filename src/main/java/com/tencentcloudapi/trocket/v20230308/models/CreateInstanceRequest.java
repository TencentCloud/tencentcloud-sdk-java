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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * 实例类型，枚举值如下：

- EXPERIMENT：体验版

- BASIC：基础版

- PRO：专业版

- PLATINUM：铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 集群名称，不能为空， 3-64个字符，只能包含数字、字母、“-”和“_”
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品规格，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参获得。
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * 集群绑定的VPC信息，必填
    */
    @SerializedName("VpcList")
    @Expose
    private VpcInfo [] VpcList;

    /**
    * 是否开启公网，默认值为false表示不开启
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * 公网是否按流量计费，默认值为false表示不按流量计费
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
    * 公网带宽（单位：兆），默认值为0。如果开启公网，该字段必须为大于0的正整数
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 公网访问白名单，不填表示拒绝所有 IP 访问
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * 消息保留时长（单位：小时），取值范围参考 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值：DefaultRetention 参数
- 最小值：RetentionLowerLimit 参数
- 最大值：RetentionUpperLimit 参数
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * 付费模式（0: 后付费；1: 预付费），默认值为0
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 预付费集群是否自动续费（0: 不自动续费；1: 自动续费），默认值为0
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 预付费集群的购买时长（单位：月），取值范围为1～60，默认值为1
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 最大可创建主题数，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值和最小值：TopicNumLimit 参数
- 最大值：TopicNumUpperLimit 参数
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * 部署可用区列表，从 [DescribeZones](https://cloud.tencent.com/document/product/1596/77929) 接口返回中的 [ZoneInfo](https://cloud.tencent.com/document/api/1596/77932#ZoneInfo) 数据结构中获得。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
     * Get 实例类型，枚举值如下：

- EXPERIMENT：体验版

- BASIC：基础版

- PRO：专业版

- PLATINUM：铂金版 
     * @return InstanceType 实例类型，枚举值如下：

- EXPERIMENT：体验版

- BASIC：基础版

- PRO：专业版

- PLATINUM：铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，枚举值如下：

- EXPERIMENT：体验版

- BASIC：基础版

- PRO：专业版

- PLATINUM：铂金版
     * @param InstanceType 实例类型，枚举值如下：

- EXPERIMENT：体验版

- BASIC：基础版

- PRO：专业版

- PLATINUM：铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 集群名称，不能为空， 3-64个字符，只能包含数字、字母、“-”和“_” 
     * @return Name 集群名称，不能为空， 3-64个字符，只能包含数字、字母、“-”和“_”
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群名称，不能为空， 3-64个字符，只能包含数字、字母、“-”和“_”
     * @param Name 集群名称，不能为空， 3-64个字符，只能包含数字、字母、“-”和“_”
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商品规格，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参获得。 
     * @return SkuCode 商品规格，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参获得。
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 商品规格，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参获得。
     * @param SkuCode 商品规格，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参获得。
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 标签列表 
     * @return TagList 标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签列表
     * @param TagList 标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 集群绑定的VPC信息，必填 
     * @return VpcList 集群绑定的VPC信息，必填
     */
    public VpcInfo [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 集群绑定的VPC信息，必填
     * @param VpcList 集群绑定的VPC信息，必填
     */
    public void setVpcList(VpcInfo [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 是否开启公网，默认值为false表示不开启 
     * @return EnablePublic 是否开启公网，默认值为false表示不开启
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set 是否开启公网，默认值为false表示不开启
     * @param EnablePublic 是否开启公网，默认值为false表示不开启
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get 公网是否按流量计费，默认值为false表示不按流量计费 
     * @return BillingFlow 公网是否按流量计费，默认值为false表示不按流量计费
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set 公网是否按流量计费，默认值为false表示不按流量计费
     * @param BillingFlow 公网是否按流量计费，默认值为false表示不按流量计费
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    /**
     * Get 公网带宽（单位：兆），默认值为0。如果开启公网，该字段必须为大于0的正整数 
     * @return Bandwidth 公网带宽（单位：兆），默认值为0。如果开启公网，该字段必须为大于0的正整数
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽（单位：兆），默认值为0。如果开启公网，该字段必须为大于0的正整数
     * @param Bandwidth 公网带宽（单位：兆），默认值为0。如果开启公网，该字段必须为大于0的正整数
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 公网访问白名单，不填表示拒绝所有 IP 访问 
     * @return IpRules 公网访问白名单，不填表示拒绝所有 IP 访问
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set 公网访问白名单，不填表示拒绝所有 IP 访问
     * @param IpRules 公网访问白名单，不填表示拒绝所有 IP 访问
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get 消息保留时长（单位：小时），取值范围参考 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值：DefaultRetention 参数
- 最小值：RetentionLowerLimit 参数
- 最大值：RetentionUpperLimit 参数 
     * @return MessageRetention 消息保留时长（单位：小时），取值范围参考 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值：DefaultRetention 参数
- 最小值：RetentionLowerLimit 参数
- 最大值：RetentionUpperLimit 参数
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set 消息保留时长（单位：小时），取值范围参考 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值：DefaultRetention 参数
- 最小值：RetentionLowerLimit 参数
- 最大值：RetentionUpperLimit 参数
     * @param MessageRetention 消息保留时长（单位：小时），取值范围参考 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值：DefaultRetention 参数
- 最小值：RetentionLowerLimit 参数
- 最大值：RetentionUpperLimit 参数
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get 付费模式（0: 后付费；1: 预付费），默认值为0 
     * @return PayMode 付费模式（0: 后付费；1: 预付费），默认值为0
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式（0: 后付费；1: 预付费），默认值为0
     * @param PayMode 付费模式（0: 后付费；1: 预付费），默认值为0
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 预付费集群是否自动续费（0: 不自动续费；1: 自动续费），默认值为0 
     * @return RenewFlag 预付费集群是否自动续费（0: 不自动续费；1: 自动续费），默认值为0
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费集群是否自动续费（0: 不自动续费；1: 自动续费），默认值为0
     * @param RenewFlag 预付费集群是否自动续费（0: 不自动续费；1: 自动续费），默认值为0
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 预付费集群的购买时长（单位：月），取值范围为1～60，默认值为1 
     * @return TimeSpan 预付费集群的购买时长（单位：月），取值范围为1～60，默认值为1
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 预付费集群的购买时长（单位：月），取值范围为1～60，默认值为1
     * @param TimeSpan 预付费集群的购买时长（单位：月），取值范围为1～60，默认值为1
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 最大可创建主题数，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值和最小值：TopicNumLimit 参数
- 最大值：TopicNumUpperLimit 参数 
     * @return MaxTopicNum 最大可创建主题数，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值和最小值：TopicNumLimit 参数
- 最大值：TopicNumUpperLimit 参数
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set 最大可创建主题数，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值和最小值：TopicNumLimit 参数
- 最大值：TopicNumUpperLimit 参数
     * @param MaxTopicNum 最大可创建主题数，从 [DescribeProductSKUs](https://cloud.tencent.com/document/api/1493/107676) 接口中的 [ProductSKU](https://cloud.tencent.com/document/api/1493/96031#ProductSKU) 出参：

- 默认值和最小值：TopicNumLimit 参数
- 最大值：TopicNumUpperLimit 参数
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get 部署可用区列表，从 [DescribeZones](https://cloud.tencent.com/document/product/1596/77929) 接口返回中的 [ZoneInfo](https://cloud.tencent.com/document/api/1596/77932#ZoneInfo) 数据结构中获得。 
     * @return ZoneIds 部署可用区列表，从 [DescribeZones](https://cloud.tencent.com/document/product/1596/77929) 接口返回中的 [ZoneInfo](https://cloud.tencent.com/document/api/1596/77932#ZoneInfo) 数据结构中获得。
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 部署可用区列表，从 [DescribeZones](https://cloud.tencent.com/document/product/1596/77929) 接口返回中的 [ZoneInfo](https://cloud.tencent.com/document/api/1596/77932#ZoneInfo) 数据结构中获得。
     * @param ZoneIds 部署可用区列表，从 [DescribeZones](https://cloud.tencent.com/document/product/1596/77929) 接口返回中的 [ZoneInfo](https://cloud.tencent.com/document/api/1596/77932#ZoneInfo) 数据结构中获得。
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new VpcInfo[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new VpcInfo(source.VpcList[i]);
            }
        }
        if (source.EnablePublic != null) {
            this.EnablePublic = new Boolean(source.EnablePublic);
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
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
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamSimple(map, prefix + "EnablePublic", this.EnablePublic);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

