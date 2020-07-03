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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEipRequest extends AbstractModel{

    /**
    * 申请数量，默认为1, 最大 20
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * EIP计费方式，flow-流量计费；bandwidth-带宽计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 带宽设定值（只在带宽计费时生效）
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * EIP模式，目前支持tunnel和fullnat
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
    * 是否使用独占集群，0：不使用，1：使用。默认为0
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * EIP归属私有网络ID，例如vpc-k7j1t2x1
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 指定申请的IP列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get 申请数量，默认为1, 最大 20 
     * @return GoodsNum 申请数量，默认为1, 最大 20
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 申请数量，默认为1, 最大 20
     * @param GoodsNum 申请数量，默认为1, 最大 20
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get EIP计费方式，flow-流量计费；bandwidth-带宽计费 
     * @return PayMode EIP计费方式，flow-流量计费；bandwidth-带宽计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set EIP计费方式，flow-流量计费；bandwidth-带宽计费
     * @param PayMode EIP计费方式，flow-流量计费；bandwidth-带宽计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 带宽设定值（只在带宽计费时生效） 
     * @return Bandwidth 带宽设定值（只在带宽计费时生效）
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽设定值（只在带宽计费时生效）
     * @param Bandwidth 带宽设定值（只在带宽计费时生效）
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get EIP模式，目前支持tunnel和fullnat 
     * @return SetType EIP模式，目前支持tunnel和fullnat
     */
    public String getSetType() {
        return this.SetType;
    }

    /**
     * Set EIP模式，目前支持tunnel和fullnat
     * @param SetType EIP模式，目前支持tunnel和fullnat
     */
    public void setSetType(String SetType) {
        this.SetType = SetType;
    }

    /**
     * Get 是否使用独占集群，0：不使用，1：使用。默认为0 
     * @return Exclusive 是否使用独占集群，0：不使用，1：使用。默认为0
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 是否使用独占集群，0：不使用，1：使用。默认为0
     * @param Exclusive 是否使用独占集群，0：不使用，1：使用。默认为0
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get EIP归属私有网络ID，例如vpc-k7j1t2x1 
     * @return VpcId EIP归属私有网络ID，例如vpc-k7j1t2x1
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set EIP归属私有网络ID，例如vpc-k7j1t2x1
     * @param VpcId EIP归属私有网络ID，例如vpc-k7j1t2x1
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 指定申请的IP列表 
     * @return IpList 指定申请的IP列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set 指定申请的IP列表
     * @param IpList 指定申请的IP列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "SetType", this.SetType);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

