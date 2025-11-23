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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePortRequest extends AbstractModel {

    /**
    * 企业Id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * IP或域名地址
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * 是否高危
    */
    @SerializedName("IsHighRisk")
    @Expose
    private Boolean IsHighRisk;

    /**
    * 子公司
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * base64编码后的指纹
    */
    @SerializedName("Banner")
    @Expose
    private String Banner;

    /**
    * 解析的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 组件名称
    */
    @SerializedName("App")
    @Expose
    private String App;

    /**
    * 服务名称
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
     * Get 企业Id 
     * @return CustomerId 企业Id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业Id
     * @param CustomerId 企业Id
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get IP或域名地址 
     * @return Asset IP或域名地址
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set IP或域名地址
     * @param Asset IP或域名地址
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 是否高危 
     * @return IsHighRisk 是否高危
     */
    public Boolean getIsHighRisk() {
        return this.IsHighRisk;
    }

    /**
     * Set 是否高危
     * @param IsHighRisk 是否高危
     */
    public void setIsHighRisk(Boolean IsHighRisk) {
        this.IsHighRisk = IsHighRisk;
    }

    /**
     * Get 子公司 
     * @return EnterpriseUid 子公司
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司
     * @param EnterpriseUid 子公司
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get base64编码后的指纹 
     * @return Banner base64编码后的指纹
     */
    public String getBanner() {
        return this.Banner;
    }

    /**
     * Set base64编码后的指纹
     * @param Banner base64编码后的指纹
     */
    public void setBanner(String Banner) {
        this.Banner = Banner;
    }

    /**
     * Get 解析的IP 
     * @return Ip 解析的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 解析的IP
     * @param Ip 解析的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 组件名称 
     * @return App 组件名称
     */
    public String getApp() {
        return this.App;
    }

    /**
     * Set 组件名称
     * @param App 组件名称
     */
    public void setApp(String App) {
        this.App = App;
    }

    /**
     * Get 服务名称 
     * @return Service 服务名称
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务名称
     * @param Service 服务名称
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    public CreatePortRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePortRequest(CreatePortRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Asset != null) {
            this.Asset = new String(source.Asset);
        }
        if (source.IsHighRisk != null) {
            this.IsHighRisk = new Boolean(source.IsHighRisk);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
        if (source.Banner != null) {
            this.Banner = new String(source.Banner);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.App != null) {
            this.App = new String(source.App);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "IsHighRisk", this.IsHighRisk);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);
        this.setParamSimple(map, prefix + "Banner", this.Banner);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "App", this.App);
        this.setParamSimple(map, prefix + "Service", this.Service);

    }
}

