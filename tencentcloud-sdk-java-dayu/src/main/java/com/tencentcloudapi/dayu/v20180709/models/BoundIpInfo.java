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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BoundIpInfo extends AbstractModel{

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 绑定的产品分类，取值[public（CVM产品），bm（黑石产品），eni（弹性网卡），vpngw（VPN网关）， natgw（NAT网关），waf（Web应用安全产品），fpc（金融产品），gaap（GAAP产品）, other(托管IP)]
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 产品分类下的子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * IP所属的资源实例ID，当绑定新IP时必须填写此字段；例如是弹性网卡的IP，则InstanceId填写弹性网卡的ID(eni-*); 如果绑定的是托管IP没有对应的资源实例ID，请填写"none";
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 绑定的产品分类，取值[public（CVM产品），bm（黑石产品），eni（弹性网卡），vpngw（VPN网关）， natgw（NAT网关），waf（Web应用安全产品），fpc（金融产品），gaap（GAAP产品）, other(托管IP)] 
     * @return BizType 绑定的产品分类，取值[public（CVM产品），bm（黑石产品），eni（弹性网卡），vpngw（VPN网关）， natgw（NAT网关），waf（Web应用安全产品），fpc（金融产品），gaap（GAAP产品）, other(托管IP)]
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 绑定的产品分类，取值[public（CVM产品），bm（黑石产品），eni（弹性网卡），vpngw（VPN网关）， natgw（NAT网关），waf（Web应用安全产品），fpc（金融产品），gaap（GAAP产品）, other(托管IP)]
     * @param BizType 绑定的产品分类，取值[public（CVM产品），bm（黑石产品），eni（弹性网卡），vpngw（VPN网关）， natgw（NAT网关），waf（Web应用安全产品），fpc（金融产品），gaap（GAAP产品）, other(托管IP)]
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 产品分类下的子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）] 
     * @return DeviceType 产品分类下的子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 产品分类下的子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
     * @param DeviceType 产品分类下的子类型，取值[cvm（CVM），lb（负载均衡器），eni（弹性网卡），vpngw（VPN），natgw（NAT），waf（WAF），fpc（金融），gaap（GAAP），other（托管IP），eip（黑石弹性IP）]
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get IP所属的资源实例ID，当绑定新IP时必须填写此字段；例如是弹性网卡的IP，则InstanceId填写弹性网卡的ID(eni-*); 如果绑定的是托管IP没有对应的资源实例ID，请填写"none"; 
     * @return InstanceId IP所属的资源实例ID，当绑定新IP时必须填写此字段；例如是弹性网卡的IP，则InstanceId填写弹性网卡的ID(eni-*); 如果绑定的是托管IP没有对应的资源实例ID，请填写"none";
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set IP所属的资源实例ID，当绑定新IP时必须填写此字段；例如是弹性网卡的IP，则InstanceId填写弹性网卡的ID(eni-*); 如果绑定的是托管IP没有对应的资源实例ID，请填写"none";
     * @param InstanceId IP所属的资源实例ID，当绑定新IP时必须填写此字段；例如是弹性网卡的IP，则InstanceId填写弹性网卡的ID(eni-*); 如果绑定的是托管IP没有对应的资源实例ID，请填写"none";
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

