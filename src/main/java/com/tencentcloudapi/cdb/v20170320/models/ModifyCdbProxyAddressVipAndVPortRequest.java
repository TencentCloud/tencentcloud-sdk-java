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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCdbProxyAddressVipAndVPortRequest extends AbstractModel{

    /**
    * 代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 代理组地址ID
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * 私有网络ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有子网ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * IP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 旧IP地址回收时间
    */
    @SerializedName("ReleaseDuration")
    @Expose
    private Long ReleaseDuration;

    /**
     * Get 代理组ID 
     * @return ProxyGroupId 代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组ID
     * @param ProxyGroupId 代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 代理组地址ID 
     * @return ProxyAddressId 代理组地址ID
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set 代理组地址ID
     * @param ProxyAddressId 代理组地址ID
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get 私有网络ID 
     * @return UniqVpcId 私有网络ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID
     * @param UniqVpcId 私有网络ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有子网ID 
     * @return UniqSubnetId 私有子网ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有子网ID
     * @param UniqSubnetId 私有子网ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get IP地址 
     * @return Vip IP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP地址
     * @param Vip IP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口 
     * @return VPort 端口
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 端口
     * @param VPort 端口
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 旧IP地址回收时间 
     * @return ReleaseDuration 旧IP地址回收时间
     */
    public Long getReleaseDuration() {
        return this.ReleaseDuration;
    }

    /**
     * Set 旧IP地址回收时间
     * @param ReleaseDuration 旧IP地址回收时间
     */
    public void setReleaseDuration(Long ReleaseDuration) {
        this.ReleaseDuration = ReleaseDuration;
    }

    public ModifyCdbProxyAddressVipAndVPortRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCdbProxyAddressVipAndVPortRequest(ModifyCdbProxyAddressVipAndVPortRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.ReleaseDuration != null) {
            this.ReleaseDuration = new Long(source.ReleaseDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "ReleaseDuration", this.ReleaseDuration);

    }
}

