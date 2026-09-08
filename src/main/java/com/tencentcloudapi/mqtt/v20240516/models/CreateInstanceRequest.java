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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * <p>实例类型，需要和SkuCode保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>商品规格，需要和InstanceType保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。</p>
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * <p>备注信息，最长 128 字符</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET</p>
    */
    @SerializedName("VpcList")
    @Expose
    private VpcInfo [] VpcList;

    /**
    * <p>是否开启公网，默认false（关闭）</p>
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * <p>公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>公网访问白名单，不传表示拒绝所有IP网络访问。</p>
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * <p>是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>付费模式（0: 后付费；1: 预付费），默认0（后付费）。</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get <p>实例类型，需要和SkuCode保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p> 
     * @return InstanceType <p>实例类型，需要和SkuCode保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型，需要和SkuCode保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
     * @param InstanceType <p>实例类型，需要和SkuCode保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p> 
     * @return Name <p>集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
     * @param Name <p>集群名称不能为空, 3-64个字符，只能包含数字、字母、“-”和“_”。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>商品规格，需要和InstanceType保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。</p> 
     * @return SkuCode <p>商品规格，需要和InstanceType保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。</p>
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set <p>商品规格，需要和InstanceType保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。</p>
     * @param SkuCode <p>商品规格，需要和InstanceType保持对应关系，可参考 <a href="https://cloud.tencent.com/document/api/1778/116232">获取MQTT产品售卖规格</a> 接口获取。</p>
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get <p>备注信息，最长 128 字符</p> 
     * @return Remark <p>备注信息，最长 128 字符</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息，最长 128 字符</p>
     * @param Remark <p>备注信息，最长 128 字符</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagList <p>标签列表</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagList <p>标签列表</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET</p> 
     * @return VpcList <p>实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET</p>
     */
    public VpcInfo [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set <p>实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET</p>
     * @param VpcList <p>实例绑定的VPC信息，需要传当前用户下可用的VPC和SUBNET</p>
     */
    public void setVpcList(VpcInfo [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get <p>是否开启公网，默认false（关闭）</p> 
     * @return EnablePublic <p>是否开启公网，默认false（关闭）</p>
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set <p>是否开启公网，默认false（关闭）</p>
     * @param EnablePublic <p>是否开启公网，默认false（关闭）</p>
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get <p>公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.</p> 
     * @return Bandwidth <p>公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.</p>
     * @param Bandwidth <p>公网带宽（单位：Mbps），EnablePublic 为True时，该字段必须填写且大于0.</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>公网访问白名单，不传表示拒绝所有IP网络访问。</p> 
     * @return IpRules <p>公网访问白名单，不传表示拒绝所有IP网络访问。</p>
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set <p>公网访问白名单，不传表示拒绝所有IP网络访问。</p>
     * @param IpRules <p>公网访问白名单，不传表示拒绝所有IP网络访问。</p>
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get <p>是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费</p> 
     * @return RenewFlag <p>是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费</p>
     * @param RenewFlag <p>是否自动续费（0: 不自动续费；1: 自动续费），仅购买预付费集群时生效。默认1:自动续费</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；</p> 
     * @return TimeSpan <p>购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；</p>
     * @param TimeSpan <p>购买时长（单位：月），购买预付费集群时生效，默认1m（月）。可选范围：1~12、24、36、48、60；</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>付费模式（0: 后付费；1: 预付费），默认0（后付费）。</p> 
     * @return PayMode <p>付费模式（0: 后付费；1: 预付费），默认0（后付费）。</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式（0: 后付费；1: 预付费），默认0（后付费）。</p>
     * @param PayMode <p>付费模式（0: 后付费；1: 预付费），默认0（后付费）。</p>
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

