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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMQTTInstanceRequest extends AbstractModel {

    /**
    * 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品规格，可用规格如下：
basic_1k,
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
    * 实例绑定的VPC信息
    */
    @SerializedName("VpcList")
    @Expose
    private VpcInfo [] VpcList;

    /**
    * 是否开启公网
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * 公网带宽（单位：兆）
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 公网访问白名单
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * 是否自动续费（0: 不自动续费；1: 自动续费）
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 购买时长（单位：月）
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版 
     * @return InstanceType 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     * @param InstanceType 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商品规格，可用规格如下：
basic_1k, 
     * @return SkuCode 商品规格，可用规格如下：
basic_1k,
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 商品规格，可用规格如下：
basic_1k,
     * @param SkuCode 商品规格，可用规格如下：
basic_1k,
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
     * Get 实例绑定的VPC信息 
     * @return VpcList 实例绑定的VPC信息
     */
    public VpcInfo [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 实例绑定的VPC信息
     * @param VpcList 实例绑定的VPC信息
     */
    public void setVpcList(VpcInfo [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 是否开启公网 
     * @return EnablePublic 是否开启公网
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set 是否开启公网
     * @param EnablePublic 是否开启公网
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get 公网带宽（单位：兆） 
     * @return Bandwidth 公网带宽（单位：兆）
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽（单位：兆）
     * @param Bandwidth 公网带宽（单位：兆）
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 公网访问白名单 
     * @return IpRules 公网访问白名单
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set 公网访问白名单
     * @param IpRules 公网访问白名单
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get 是否自动续费（0: 不自动续费；1: 自动续费） 
     * @return RenewFlag 是否自动续费（0: 不自动续费；1: 自动续费）
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费（0: 不自动续费；1: 自动续费）
     * @param RenewFlag 是否自动续费（0: 不自动续费；1: 自动续费）
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 购买时长（单位：月） 
     * @return TimeSpan 购买时长（单位：月）
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长（单位：月）
     * @param TimeSpan 购买时长（单位：月）
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public CreateMQTTInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMQTTInstanceRequest(CreateMQTTInstanceRequest source) {
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
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
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
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

