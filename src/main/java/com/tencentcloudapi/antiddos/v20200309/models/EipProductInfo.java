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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipProductInfo extends AbstractModel{

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 云产品类型，取值[
public（CVM产品），
bm（黑石产品），
eni（弹性网卡），
vpngw（VPN网关），
 natgw（NAT网关），
waf（Web应用安全产品），
fpc（金融产品），
gaap（GAAP产品）, 
other(托管IP)
]
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 云产品子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * IP所属的云产品实例ID，例如是弹性网卡的IP，InstanceId为弹性网卡的ID(eni-*); 如果是托管IP没有对应的资源实例ID,InstanceId为""
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 云产品类型，取值[
public（CVM产品），
bm（黑石产品），
eni（弹性网卡），
vpngw（VPN网关），
 natgw（NAT网关），
waf（Web应用安全产品），
fpc（金融产品），
gaap（GAAP产品）, 
other(托管IP)
] 
     * @return BizType 云产品类型，取值[
public（CVM产品），
bm（黑石产品），
eni（弹性网卡），
vpngw（VPN网关），
 natgw（NAT网关），
waf（Web应用安全产品），
fpc（金融产品），
gaap（GAAP产品）, 
other(托管IP)
]
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 云产品类型，取值[
public（CVM产品），
bm（黑石产品），
eni（弹性网卡），
vpngw（VPN网关），
 natgw（NAT网关），
waf（Web应用安全产品），
fpc（金融产品），
gaap（GAAP产品）, 
other(托管IP)
]
     * @param BizType 云产品类型，取值[
public（CVM产品），
bm（黑石产品），
eni（弹性网卡），
vpngw（VPN网关），
 natgw（NAT网关），
waf（Web应用安全产品），
fpc（金融产品），
gaap（GAAP产品）, 
other(托管IP)
]
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 云产品子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）] 
     * @return DeviceType 云产品子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 云产品子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
     * @param DeviceType 云产品子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get IP所属的云产品实例ID，例如是弹性网卡的IP，InstanceId为弹性网卡的ID(eni-*); 如果是托管IP没有对应的资源实例ID,InstanceId为"" 
     * @return InstanceId IP所属的云产品实例ID，例如是弹性网卡的IP，InstanceId为弹性网卡的ID(eni-*); 如果是托管IP没有对应的资源实例ID,InstanceId为""
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set IP所属的云产品实例ID，例如是弹性网卡的IP，InstanceId为弹性网卡的ID(eni-*); 如果是托管IP没有对应的资源实例ID,InstanceId为""
     * @param InstanceId IP所属的云产品实例ID，例如是弹性网卡的IP，InstanceId为弹性网卡的ID(eni-*); 如果是托管IP没有对应的资源实例ID,InstanceId为""
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public EipProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipProductInfo(EipProductInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

