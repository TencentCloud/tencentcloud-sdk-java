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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VipInfo extends AbstractModel {

    /**
    * VIP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * waf实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * ip运营商类型
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * ip类型
    */
    @SerializedName("VipType")
    @Expose
    private String VipType;

    /**
    * 域名信息
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
     * Get VIP地址 
     * @return Vip VIP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP地址
     * @param Vip VIP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get waf实例id 
     * @return InstanceId waf实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set waf实例id
     * @param InstanceId waf实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 创建时间 
     * @return InstanceCreateTime 创建时间
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set 创建时间
     * @param InstanceCreateTime 创建时间
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get ip运营商类型 
     * @return ISP ip运营商类型
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set ip运营商类型
     * @param ISP ip运营商类型
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get ip类型 
     * @return VipType ip类型
     */
    public String getVipType() {
        return this.VipType;
    }

    /**
     * Set ip类型
     * @param VipType ip类型
     */
    public void setVipType(String VipType) {
        this.VipType = VipType;
    }

    /**
     * Get 域名信息 
     * @return AddressName 域名信息
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set 域名信息
     * @param AddressName 域名信息
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    public VipInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VipInfo(VipInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.VipType != null) {
            this.VipType = new String(source.VipType);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);

    }
}

