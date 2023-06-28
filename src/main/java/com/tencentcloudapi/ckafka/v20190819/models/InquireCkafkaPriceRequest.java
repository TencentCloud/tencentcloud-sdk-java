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

public class InquireCkafkaPriceRequest extends AbstractModel{

    /**
    * 国内站标准版填写standards2, 国际站标准版填写standard，专业版填写profession
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 购买/续费付费类型(购买时不填的话, 默认获取购买包年包月一个月的费用)
    */
    @SerializedName("InstanceChargeParam")
    @Expose
    private InstanceChargeParam InstanceChargeParam;

    /**
    * 购买/续费时购买的实例数量(不填时, 默认为1个)
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 实例内网带宽大小, 单位MB/s (购买时必填，专业版询价时带宽信息必填)
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 实例的硬盘购买类型以及大小 (购买时必填，专业版询价时磁盘信息必填)
    */
    @SerializedName("InquiryDiskParam")
    @Expose
    private InquiryDiskParam InquiryDiskParam;

    /**
    * 实例消息保留时间大小, 单位小时 (购买时必填)
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * 购买实例topic数, 单位个 (购买时必填)
    */
    @SerializedName("Topic")
    @Expose
    private Long Topic;

    /**
    * 购买实例分区数, 单位个 (购买时必填，专业版询价时带宽信息必填)
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * 购买地域, 可通过查看DescribeCkafkaZone这个接口获取ZoneId
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 标记操作, 新购填写purchase, 续费填写renew, (不填时, 默认为purchase)
    */
    @SerializedName("CategoryAction")
    @Expose
    private String CategoryAction;

    /**
    * 国内站购买的版本, sv_ckafka_instance_s2_1(入门型), sv_ckafka_instance_s2_2(标准版), sv_ckafka_instance_s2_3(进阶型), 如果instanceType为standards2, 但该参数为空, 则默认值为sv_ckafka_instance_s2_1
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * 公网带宽计费模式, 目前只有专业版支持公网带宽 (购买公网带宽时必填)
    */
    @SerializedName("PublicNetworkParam")
    @Expose
    private InquiryPublicNetworkParam PublicNetworkParam;

    /**
    * 续费时的实例id, 续费时填写
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 国内站标准版填写standards2, 国际站标准版填写standard，专业版填写profession 
     * @return InstanceType 国内站标准版填写standards2, 国际站标准版填写standard，专业版填写profession
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 国内站标准版填写standards2, 国际站标准版填写standard，专业版填写profession
     * @param InstanceType 国内站标准版填写standards2, 国际站标准版填写standard，专业版填写profession
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 购买/续费付费类型(购买时不填的话, 默认获取购买包年包月一个月的费用) 
     * @return InstanceChargeParam 购买/续费付费类型(购买时不填的话, 默认获取购买包年包月一个月的费用)
     */
    public InstanceChargeParam getInstanceChargeParam() {
        return this.InstanceChargeParam;
    }

    /**
     * Set 购买/续费付费类型(购买时不填的话, 默认获取购买包年包月一个月的费用)
     * @param InstanceChargeParam 购买/续费付费类型(购买时不填的话, 默认获取购买包年包月一个月的费用)
     */
    public void setInstanceChargeParam(InstanceChargeParam InstanceChargeParam) {
        this.InstanceChargeParam = InstanceChargeParam;
    }

    /**
     * Get 购买/续费时购买的实例数量(不填时, 默认为1个) 
     * @return InstanceNum 购买/续费时购买的实例数量(不填时, 默认为1个)
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 购买/续费时购买的实例数量(不填时, 默认为1个)
     * @param InstanceNum 购买/续费时购买的实例数量(不填时, 默认为1个)
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 实例内网带宽大小, 单位MB/s (购买时必填，专业版询价时带宽信息必填) 
     * @return Bandwidth 实例内网带宽大小, 单位MB/s (购买时必填，专业版询价时带宽信息必填)
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 实例内网带宽大小, 单位MB/s (购买时必填，专业版询价时带宽信息必填)
     * @param Bandwidth 实例内网带宽大小, 单位MB/s (购买时必填，专业版询价时带宽信息必填)
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 实例的硬盘购买类型以及大小 (购买时必填，专业版询价时磁盘信息必填) 
     * @return InquiryDiskParam 实例的硬盘购买类型以及大小 (购买时必填，专业版询价时磁盘信息必填)
     */
    public InquiryDiskParam getInquiryDiskParam() {
        return this.InquiryDiskParam;
    }

    /**
     * Set 实例的硬盘购买类型以及大小 (购买时必填，专业版询价时磁盘信息必填)
     * @param InquiryDiskParam 实例的硬盘购买类型以及大小 (购买时必填，专业版询价时磁盘信息必填)
     */
    public void setInquiryDiskParam(InquiryDiskParam InquiryDiskParam) {
        this.InquiryDiskParam = InquiryDiskParam;
    }

    /**
     * Get 实例消息保留时间大小, 单位小时 (购买时必填) 
     * @return MessageRetention 实例消息保留时间大小, 单位小时 (购买时必填)
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set 实例消息保留时间大小, 单位小时 (购买时必填)
     * @param MessageRetention 实例消息保留时间大小, 单位小时 (购买时必填)
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get 购买实例topic数, 单位个 (购买时必填) 
     * @return Topic 购买实例topic数, 单位个 (购买时必填)
     */
    public Long getTopic() {
        return this.Topic;
    }

    /**
     * Set 购买实例topic数, 单位个 (购买时必填)
     * @param Topic 购买实例topic数, 单位个 (购买时必填)
     */
    public void setTopic(Long Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 购买实例分区数, 单位个 (购买时必填，专业版询价时带宽信息必填) 
     * @return Partition 购买实例分区数, 单位个 (购买时必填，专业版询价时带宽信息必填)
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 购买实例分区数, 单位个 (购买时必填，专业版询价时带宽信息必填)
     * @param Partition 购买实例分区数, 单位个 (购买时必填，专业版询价时带宽信息必填)
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 购买地域, 可通过查看DescribeCkafkaZone这个接口获取ZoneId 
     * @return ZoneIds 购买地域, 可通过查看DescribeCkafkaZone这个接口获取ZoneId
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 购买地域, 可通过查看DescribeCkafkaZone这个接口获取ZoneId
     * @param ZoneIds 购买地域, 可通过查看DescribeCkafkaZone这个接口获取ZoneId
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 标记操作, 新购填写purchase, 续费填写renew, (不填时, 默认为purchase) 
     * @return CategoryAction 标记操作, 新购填写purchase, 续费填写renew, (不填时, 默认为purchase)
     */
    public String getCategoryAction() {
        return this.CategoryAction;
    }

    /**
     * Set 标记操作, 新购填写purchase, 续费填写renew, (不填时, 默认为purchase)
     * @param CategoryAction 标记操作, 新购填写purchase, 续费填写renew, (不填时, 默认为purchase)
     */
    public void setCategoryAction(String CategoryAction) {
        this.CategoryAction = CategoryAction;
    }

    /**
     * Get 国内站购买的版本, sv_ckafka_instance_s2_1(入门型), sv_ckafka_instance_s2_2(标准版), sv_ckafka_instance_s2_3(进阶型), 如果instanceType为standards2, 但该参数为空, 则默认值为sv_ckafka_instance_s2_1 
     * @return BillType 国内站购买的版本, sv_ckafka_instance_s2_1(入门型), sv_ckafka_instance_s2_2(标准版), sv_ckafka_instance_s2_3(进阶型), 如果instanceType为standards2, 但该参数为空, 则默认值为sv_ckafka_instance_s2_1
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set 国内站购买的版本, sv_ckafka_instance_s2_1(入门型), sv_ckafka_instance_s2_2(标准版), sv_ckafka_instance_s2_3(进阶型), 如果instanceType为standards2, 但该参数为空, 则默认值为sv_ckafka_instance_s2_1
     * @param BillType 国内站购买的版本, sv_ckafka_instance_s2_1(入门型), sv_ckafka_instance_s2_2(标准版), sv_ckafka_instance_s2_3(进阶型), 如果instanceType为standards2, 但该参数为空, 则默认值为sv_ckafka_instance_s2_1
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get 公网带宽计费模式, 目前只有专业版支持公网带宽 (购买公网带宽时必填) 
     * @return PublicNetworkParam 公网带宽计费模式, 目前只有专业版支持公网带宽 (购买公网带宽时必填)
     */
    public InquiryPublicNetworkParam getPublicNetworkParam() {
        return this.PublicNetworkParam;
    }

    /**
     * Set 公网带宽计费模式, 目前只有专业版支持公网带宽 (购买公网带宽时必填)
     * @param PublicNetworkParam 公网带宽计费模式, 目前只有专业版支持公网带宽 (购买公网带宽时必填)
     */
    public void setPublicNetworkParam(InquiryPublicNetworkParam PublicNetworkParam) {
        this.PublicNetworkParam = PublicNetworkParam;
    }

    /**
     * Get 续费时的实例id, 续费时填写 
     * @return InstanceId 续费时的实例id, 续费时填写
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 续费时的实例id, 续费时填写
     * @param InstanceId 续费时的实例id, 续费时填写
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public InquireCkafkaPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquireCkafkaPriceRequest(InquireCkafkaPriceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceChargeParam != null) {
            this.InstanceChargeParam = new InstanceChargeParam(source.InstanceChargeParam);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.InquiryDiskParam != null) {
            this.InquiryDiskParam = new InquiryDiskParam(source.InquiryDiskParam);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.Topic != null) {
            this.Topic = new Long(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.CategoryAction != null) {
            this.CategoryAction = new String(source.CategoryAction);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.PublicNetworkParam != null) {
            this.PublicNetworkParam = new InquiryPublicNetworkParam(source.PublicNetworkParam);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "InstanceChargeParam.", this.InstanceChargeParam);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamObj(map, prefix + "InquiryDiskParam.", this.InquiryDiskParam);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "CategoryAction", this.CategoryAction);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamObj(map, prefix + "PublicNetworkParam.", this.PublicNetworkParam);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

