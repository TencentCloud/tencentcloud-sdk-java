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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * 实例类型，需要和SkuCode保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
BASIC 基础版
PRO  专业版
PLATINUM 铂金版

    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品规格，需要和InstanceType保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 备注信息，最长 128 字符
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
    * 实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET
    */
    @SerializedName("VpcList")
    @Expose
    private VpcInfo [] VpcList;

    /**
    * 是否开启公网，默认false（关闭）
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * 公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 公网访问白名单，不传表示拒绝所有IP网络访问。
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * 是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 付费模式（0: 后付费；1: 预付费），默认0（后付费）。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 实例类型，需要和SkuCode保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
 
     * @return InstanceType 实例类型，需要和SkuCode保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
BASIC 基础版
PRO  专业版
PLATINUM 铂金版

     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，需要和SkuCode保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
BASIC 基础版
PRO  专业版
PLATINUM 铂金版

     * @param InstanceType 实例类型，需要和SkuCode保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
BASIC 基础版
PRO  专业版
PLATINUM 铂金版

     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。 
     * @return Name 集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
     * @param Name 集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商品规格，需要和InstanceType保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。 
     * @return SkuCode 商品规格，需要和InstanceType保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 商品规格，需要和InstanceType保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
     * @param SkuCode 商品规格，需要和InstanceType保持对应关系，可参考 [获取MQTT产品售卖规格](https://cloud.tencent.com/document/api/1778/116232) 接口获取。
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 备注信息，最长 128 字符 
     * @return Remark 备注信息，最长 128 字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，最长 128 字符
     * @param Remark 备注信息，最长 128 字符
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
     * Get 实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET 
     * @return VpcList 实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET
     */
    public VpcInfo [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET
     * @param VpcList 实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET
     */
    public void setVpcList(VpcInfo [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 是否开启公网，默认false（关闭） 
     * @return EnablePublic 是否开启公网，默认false（关闭）
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set 是否开启公网，默认false（关闭）
     * @param EnablePublic 是否开启公网，默认false（关闭）
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get 公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0. 
     * @return Bandwidth 公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.
     * @param Bandwidth 公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 公网访问白名单，不传表示拒绝所有IP网络访问。 
     * @return IpRules 公网访问白名单，不传表示拒绝所有IP网络访问。
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set 公网访问白名单，不传表示拒绝所有IP网络访问。
     * @param IpRules 公网访问白名单，不传表示拒绝所有IP网络访问。
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get 是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费 
     * @return RenewFlag 是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费
     * @param RenewFlag 是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60； 
     * @return TimeSpan 购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；
     * @param TimeSpan 购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 付费模式（0: 后付费；1: 预付费），默认0（后付费）。 
     * @return PayMode 付费模式（0: 后付费；1: 预付费），默认0（后付费）。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式（0: 后付费；1: 预付费），默认0（后付费）。
     * @param PayMode 付费模式（0: 后付费；1: 预付费），默认0（后付费）。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
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
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

