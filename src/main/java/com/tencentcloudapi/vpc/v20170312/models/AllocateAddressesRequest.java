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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateAddressesRequest  extends AbstractModel{

    /**
    * 申请 EIP 数量，默认值为1。
    */
    @SerializedName("AddressCount")
    @Expose
    private Integer AddressCount;

    /**
    * 运营商名称，可选值[BGP|CTCC|CMCC|CUCC]，默认BGP。
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * EIP类型，EIP|AnycastEIP，默认EIP。
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Anycast发布域，ANYCAST_ZONE_A|ANYCAST_ZONE_B，默认为当前地域可选的任一发布域。
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
     * 获取申请 EIP 数量，默认值为1。
     * @return AddressCount 申请 EIP 数量，默认值为1。
     */
    public Integer getAddressCount() {
        return this.AddressCount;
    }

    /**
     * 设置申请 EIP 数量，默认值为1。
     * @param AddressCount 申请 EIP 数量，默认值为1。
     */
    public void setAddressCount(Integer AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * 获取运营商名称，可选值[BGP|CTCC|CMCC|CUCC]，默认BGP。
     * @return InternetServiceProvider 运营商名称，可选值[BGP|CTCC|CMCC|CUCC]，默认BGP。
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * 设置运营商名称，可选值[BGP|CTCC|CMCC|CUCC]，默认BGP。
     * @param InternetServiceProvider 运营商名称，可选值[BGP|CTCC|CMCC|CUCC]，默认BGP。
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * 获取EIP类型，EIP|AnycastEIP，默认EIP。
     * @return AddressType EIP类型，EIP|AnycastEIP，默认EIP。
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * 设置EIP类型，EIP|AnycastEIP，默认EIP。
     * @param AddressType EIP类型，EIP|AnycastEIP，默认EIP。
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * 获取Anycast发布域，ANYCAST_ZONE_A|ANYCAST_ZONE_B，默认为当前地域可选的任一发布域。
     * @return AnycastZone Anycast发布域，ANYCAST_ZONE_A|ANYCAST_ZONE_B，默认为当前地域可选的任一发布域。
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * 设置Anycast发布域，ANYCAST_ZONE_A|ANYCAST_ZONE_B，默认为当前地域可选的任一发布域。
     * @param AnycastZone Anycast发布域，ANYCAST_ZONE_A|ANYCAST_ZONE_B，默认为当前地域可选的任一发布域。
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);

    }
}

