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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTawInstanceRequest extends AbstractModel{

    /**
    * 片区Id，(至少大于0)
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * 计费类型, (1=后付费)
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * 数据保存时间，(至少大于0)
    */
    @SerializedName("DataRetentionDays")
    @Expose
    private Long DataRetentionDays;

    /**
    * 实例名称，(最大长度不超过255字节)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 实例描述，(最大长度不超过1024字节)
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * 每天数据上报量
    */
    @SerializedName("CountNum")
    @Expose
    private String CountNum;

    /**
    * 数据存储时长计费
    */
    @SerializedName("PeriodRetain")
    @Expose
    private String PeriodRetain;

    /**
    * 实例购买渠道("cdn" 等)
    */
    @SerializedName("BuyingChannel")
    @Expose
    private String BuyingChannel;

    /**
    * 预付费资源包类型(仅预付费需要)
    */
    @SerializedName("ResourcePackageType")
    @Expose
    private Long ResourcePackageType;

    /**
    * 预付费资源包数量(仅预付费需要)
    */
    @SerializedName("ResourcePackageNum")
    @Expose
    private Long ResourcePackageNum;

    /**
    * 实例类型 1:原web相关类型 2:app端类型
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
     * Get 片区Id，(至少大于0) 
     * @return AreaId 片区Id，(至少大于0)
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 片区Id，(至少大于0)
     * @param AreaId 片区Id，(至少大于0)
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 计费类型, (1=后付费) 
     * @return ChargeType 计费类型, (1=后付费)
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型, (1=后付费)
     * @param ChargeType 计费类型, (1=后付费)
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 数据保存时间，(至少大于0) 
     * @return DataRetentionDays 数据保存时间，(至少大于0)
     */
    public Long getDataRetentionDays() {
        return this.DataRetentionDays;
    }

    /**
     * Set 数据保存时间，(至少大于0)
     * @param DataRetentionDays 数据保存时间，(至少大于0)
     */
    public void setDataRetentionDays(Long DataRetentionDays) {
        this.DataRetentionDays = DataRetentionDays;
    }

    /**
     * Get 实例名称，(最大长度不超过255字节) 
     * @return InstanceName 实例名称，(最大长度不超过255字节)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，(最大长度不超过255字节)
     * @param InstanceName 实例名称，(最大长度不超过255字节)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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

    /**
     * Get 实例描述，(最大长度不超过1024字节) 
     * @return InstanceDesc 实例描述，(最大长度不超过1024字节)
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set 实例描述，(最大长度不超过1024字节)
     * @param InstanceDesc 实例描述，(最大长度不超过1024字节)
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get 每天数据上报量 
     * @return CountNum 每天数据上报量
     */
    public String getCountNum() {
        return this.CountNum;
    }

    /**
     * Set 每天数据上报量
     * @param CountNum 每天数据上报量
     */
    public void setCountNum(String CountNum) {
        this.CountNum = CountNum;
    }

    /**
     * Get 数据存储时长计费 
     * @return PeriodRetain 数据存储时长计费
     */
    public String getPeriodRetain() {
        return this.PeriodRetain;
    }

    /**
     * Set 数据存储时长计费
     * @param PeriodRetain 数据存储时长计费
     */
    public void setPeriodRetain(String PeriodRetain) {
        this.PeriodRetain = PeriodRetain;
    }

    /**
     * Get 实例购买渠道("cdn" 等) 
     * @return BuyingChannel 实例购买渠道("cdn" 等)
     */
    public String getBuyingChannel() {
        return this.BuyingChannel;
    }

    /**
     * Set 实例购买渠道("cdn" 等)
     * @param BuyingChannel 实例购买渠道("cdn" 等)
     */
    public void setBuyingChannel(String BuyingChannel) {
        this.BuyingChannel = BuyingChannel;
    }

    /**
     * Get 预付费资源包类型(仅预付费需要) 
     * @return ResourcePackageType 预付费资源包类型(仅预付费需要)
     */
    public Long getResourcePackageType() {
        return this.ResourcePackageType;
    }

    /**
     * Set 预付费资源包类型(仅预付费需要)
     * @param ResourcePackageType 预付费资源包类型(仅预付费需要)
     */
    public void setResourcePackageType(Long ResourcePackageType) {
        this.ResourcePackageType = ResourcePackageType;
    }

    /**
     * Get 预付费资源包数量(仅预付费需要) 
     * @return ResourcePackageNum 预付费资源包数量(仅预付费需要)
     */
    public Long getResourcePackageNum() {
        return this.ResourcePackageNum;
    }

    /**
     * Set 预付费资源包数量(仅预付费需要)
     * @param ResourcePackageNum 预付费资源包数量(仅预付费需要)
     */
    public void setResourcePackageNum(Long ResourcePackageNum) {
        this.ResourcePackageNum = ResourcePackageNum;
    }

    /**
     * Get 实例类型 1:原web相关类型 2:app端类型 
     * @return InstanceType 实例类型 1:原web相关类型 2:app端类型
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型 1:原web相关类型 2:app端类型
     * @param InstanceType 实例类型 1:原web相关类型 2:app端类型
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CreateTawInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTawInstanceRequest(CreateTawInstanceRequest source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.DataRetentionDays != null) {
            this.DataRetentionDays = new Long(source.DataRetentionDays);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.CountNum != null) {
            this.CountNum = new String(source.CountNum);
        }
        if (source.PeriodRetain != null) {
            this.PeriodRetain = new String(source.PeriodRetain);
        }
        if (source.BuyingChannel != null) {
            this.BuyingChannel = new String(source.BuyingChannel);
        }
        if (source.ResourcePackageType != null) {
            this.ResourcePackageType = new Long(source.ResourcePackageType);
        }
        if (source.ResourcePackageNum != null) {
            this.ResourcePackageNum = new Long(source.ResourcePackageNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "DataRetentionDays", this.DataRetentionDays);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "CountNum", this.CountNum);
        this.setParamSimple(map, prefix + "PeriodRetain", this.PeriodRetain);
        this.setParamSimple(map, prefix + "BuyingChannel", this.BuyingChannel);
        this.setParamSimple(map, prefix + "ResourcePackageType", this.ResourcePackageType);
        this.setParamSimple(map, prefix + "ResourcePackageNum", this.ResourcePackageNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

