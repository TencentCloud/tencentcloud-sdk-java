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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDDoSPolicyRequest extends AbstractModel {

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 协议禁用，必须填写且数组长度必须为1
    */
    @SerializedName("DropOptions")
    @Expose
    private DDoSPolicyDropOption [] DropOptions;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 端口禁用，当没有禁用端口时填空数组
    */
    @SerializedName("PortLimits")
    @Expose
    private DDoSPolicyPortLimit [] PortLimits;

    /**
    * 请求源IP黑白名单，当没有IP黑白名单时填空数组
    */
    @SerializedName("IpAllowDenys")
    @Expose
    private IpBlackWhite [] IpAllowDenys;

    /**
    * 报文过滤，当没有报文过滤时填空数组
    */
    @SerializedName("PacketFilters")
    @Expose
    private DDoSPolicyPacketFilter [] PacketFilters;

    /**
    * 水印策略参数，当没有启用水印功能时填空数组，最多只能传一条水印策略（即数组大小不超过1）
    */
    @SerializedName("WaterPrint")
    @Expose
    private WaterPrintPolicy [] WaterPrint;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 协议禁用，必须填写且数组长度必须为1 
     * @return DropOptions 协议禁用，必须填写且数组长度必须为1
     */
    public DDoSPolicyDropOption [] getDropOptions() {
        return this.DropOptions;
    }

    /**
     * Set 协议禁用，必须填写且数组长度必须为1
     * @param DropOptions 协议禁用，必须填写且数组长度必须为1
     */
    public void setDropOptions(DDoSPolicyDropOption [] DropOptions) {
        this.DropOptions = DropOptions;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 端口禁用，当没有禁用端口时填空数组 
     * @return PortLimits 端口禁用，当没有禁用端口时填空数组
     */
    public DDoSPolicyPortLimit [] getPortLimits() {
        return this.PortLimits;
    }

    /**
     * Set 端口禁用，当没有禁用端口时填空数组
     * @param PortLimits 端口禁用，当没有禁用端口时填空数组
     */
    public void setPortLimits(DDoSPolicyPortLimit [] PortLimits) {
        this.PortLimits = PortLimits;
    }

    /**
     * Get 请求源IP黑白名单，当没有IP黑白名单时填空数组 
     * @return IpAllowDenys 请求源IP黑白名单，当没有IP黑白名单时填空数组
     */
    public IpBlackWhite [] getIpAllowDenys() {
        return this.IpAllowDenys;
    }

    /**
     * Set 请求源IP黑白名单，当没有IP黑白名单时填空数组
     * @param IpAllowDenys 请求源IP黑白名单，当没有IP黑白名单时填空数组
     */
    public void setIpAllowDenys(IpBlackWhite [] IpAllowDenys) {
        this.IpAllowDenys = IpAllowDenys;
    }

    /**
     * Get 报文过滤，当没有报文过滤时填空数组 
     * @return PacketFilters 报文过滤，当没有报文过滤时填空数组
     */
    public DDoSPolicyPacketFilter [] getPacketFilters() {
        return this.PacketFilters;
    }

    /**
     * Set 报文过滤，当没有报文过滤时填空数组
     * @param PacketFilters 报文过滤，当没有报文过滤时填空数组
     */
    public void setPacketFilters(DDoSPolicyPacketFilter [] PacketFilters) {
        this.PacketFilters = PacketFilters;
    }

    /**
     * Get 水印策略参数，当没有启用水印功能时填空数组，最多只能传一条水印策略（即数组大小不超过1） 
     * @return WaterPrint 水印策略参数，当没有启用水印功能时填空数组，最多只能传一条水印策略（即数组大小不超过1）
     */
    public WaterPrintPolicy [] getWaterPrint() {
        return this.WaterPrint;
    }

    /**
     * Set 水印策略参数，当没有启用水印功能时填空数组，最多只能传一条水印策略（即数组大小不超过1）
     * @param WaterPrint 水印策略参数，当没有启用水印功能时填空数组，最多只能传一条水印策略（即数组大小不超过1）
     */
    public void setWaterPrint(WaterPrintPolicy [] WaterPrint) {
        this.WaterPrint = WaterPrint;
    }

    public CreateDDoSPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDDoSPolicyRequest(CreateDDoSPolicyRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.DropOptions != null) {
            this.DropOptions = new DDoSPolicyDropOption[source.DropOptions.length];
            for (int i = 0; i < source.DropOptions.length; i++) {
                this.DropOptions[i] = new DDoSPolicyDropOption(source.DropOptions[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PortLimits != null) {
            this.PortLimits = new DDoSPolicyPortLimit[source.PortLimits.length];
            for (int i = 0; i < source.PortLimits.length; i++) {
                this.PortLimits[i] = new DDoSPolicyPortLimit(source.PortLimits[i]);
            }
        }
        if (source.IpAllowDenys != null) {
            this.IpAllowDenys = new IpBlackWhite[source.IpAllowDenys.length];
            for (int i = 0; i < source.IpAllowDenys.length; i++) {
                this.IpAllowDenys[i] = new IpBlackWhite(source.IpAllowDenys[i]);
            }
        }
        if (source.PacketFilters != null) {
            this.PacketFilters = new DDoSPolicyPacketFilter[source.PacketFilters.length];
            for (int i = 0; i < source.PacketFilters.length; i++) {
                this.PacketFilters[i] = new DDoSPolicyPacketFilter(source.PacketFilters[i]);
            }
        }
        if (source.WaterPrint != null) {
            this.WaterPrint = new WaterPrintPolicy[source.WaterPrint.length];
            for (int i = 0; i < source.WaterPrint.length; i++) {
                this.WaterPrint[i] = new WaterPrintPolicy(source.WaterPrint[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArrayObj(map, prefix + "DropOptions.", this.DropOptions);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "PortLimits.", this.PortLimits);
        this.setParamArrayObj(map, prefix + "IpAllowDenys.", this.IpAllowDenys);
        this.setParamArrayObj(map, prefix + "PacketFilters.", this.PacketFilters);
        this.setParamArrayObj(map, prefix + "WaterPrint.", this.WaterPrint);

    }
}

