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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPNetwork extends AbstractModel {

    /**
    * <p>互联网服务提供商</p>
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * <p>自治系统号</p>
    */
    @SerializedName("ASN")
    @Expose
    private String ASN;

    /**
    * <p>IP注册组织名称</p>
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * <p>是否保留IP</p>
    */
    @SerializedName("IsReserved")
    @Expose
    private Boolean IsReserved;

    /**
    * <p>是否网关IP</p>
    */
    @SerializedName("IsGateway")
    @Expose
    private Boolean IsGateway;

    /**
    * <p>是否任播网络</p>
    */
    @SerializedName("IsAnycast")
    @Expose
    private Boolean IsAnycast;

    /**
    * <p>是否移动网络</p>
    */
    @SerializedName("IsMobile")
    @Expose
    private Boolean IsMobile;

    /**
    * <p>是否动态IP</p>
    */
    @SerializedName("IsDynamic")
    @Expose
    private Boolean IsDynamic;

    /**
    * <p>是否网络出口</p>
    */
    @SerializedName("IsEgress")
    @Expose
    private Boolean IsEgress;

    /**
    * <p>是否域名解析</p>
    */
    @SerializedName("IsDNS")
    @Expose
    private Boolean IsDNS;

    /**
    * <p>是否教育机构</p>
    */
    @SerializedName("IsEducation")
    @Expose
    private Boolean IsEducation;

    /**
    * <p>是否组织机构</p>
    */
    @SerializedName("IsInstitution")
    @Expose
    private Boolean IsInstitution;

    /**
    * <p>是否企业专线</p>
    */
    @SerializedName("IsCompany")
    @Expose
    private Boolean IsCompany;

    /**
    * <p>是否家用宽带</p>
    */
    @SerializedName("IsResidence")
    @Expose
    private Boolean IsResidence;

    /**
    * <p>是否云服务</p>
    */
    @SerializedName("IsCloudService")
    @Expose
    private Boolean IsCloudService;

    /**
    * <p>是否基础设施</p>
    */
    @SerializedName("IsInfrastructure")
    @Expose
    private Boolean IsInfrastructure;

    /**
    * <p>是否邮箱服务</p>
    */
    @SerializedName("IsMXServer")
    @Expose
    private Boolean IsMXServer;

    /**
     * Get <p>互联网服务提供商</p> 
     * @return ISP <p>互联网服务提供商</p>
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set <p>互联网服务提供商</p>
     * @param ISP <p>互联网服务提供商</p>
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get <p>自治系统号</p> 
     * @return ASN <p>自治系统号</p>
     */
    public String getASN() {
        return this.ASN;
    }

    /**
     * Set <p>自治系统号</p>
     * @param ASN <p>自治系统号</p>
     */
    public void setASN(String ASN) {
        this.ASN = ASN;
    }

    /**
     * Get <p>IP注册组织名称</p> 
     * @return Organization <p>IP注册组织名称</p>
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set <p>IP注册组织名称</p>
     * @param Organization <p>IP注册组织名称</p>
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get <p>是否保留IP</p> 
     * @return IsReserved <p>是否保留IP</p>
     */
    public Boolean getIsReserved() {
        return this.IsReserved;
    }

    /**
     * Set <p>是否保留IP</p>
     * @param IsReserved <p>是否保留IP</p>
     */
    public void setIsReserved(Boolean IsReserved) {
        this.IsReserved = IsReserved;
    }

    /**
     * Get <p>是否网关IP</p> 
     * @return IsGateway <p>是否网关IP</p>
     */
    public Boolean getIsGateway() {
        return this.IsGateway;
    }

    /**
     * Set <p>是否网关IP</p>
     * @param IsGateway <p>是否网关IP</p>
     */
    public void setIsGateway(Boolean IsGateway) {
        this.IsGateway = IsGateway;
    }

    /**
     * Get <p>是否任播网络</p> 
     * @return IsAnycast <p>是否任播网络</p>
     */
    public Boolean getIsAnycast() {
        return this.IsAnycast;
    }

    /**
     * Set <p>是否任播网络</p>
     * @param IsAnycast <p>是否任播网络</p>
     */
    public void setIsAnycast(Boolean IsAnycast) {
        this.IsAnycast = IsAnycast;
    }

    /**
     * Get <p>是否移动网络</p> 
     * @return IsMobile <p>是否移动网络</p>
     */
    public Boolean getIsMobile() {
        return this.IsMobile;
    }

    /**
     * Set <p>是否移动网络</p>
     * @param IsMobile <p>是否移动网络</p>
     */
    public void setIsMobile(Boolean IsMobile) {
        this.IsMobile = IsMobile;
    }

    /**
     * Get <p>是否动态IP</p> 
     * @return IsDynamic <p>是否动态IP</p>
     */
    public Boolean getIsDynamic() {
        return this.IsDynamic;
    }

    /**
     * Set <p>是否动态IP</p>
     * @param IsDynamic <p>是否动态IP</p>
     */
    public void setIsDynamic(Boolean IsDynamic) {
        this.IsDynamic = IsDynamic;
    }

    /**
     * Get <p>是否网络出口</p> 
     * @return IsEgress <p>是否网络出口</p>
     */
    public Boolean getIsEgress() {
        return this.IsEgress;
    }

    /**
     * Set <p>是否网络出口</p>
     * @param IsEgress <p>是否网络出口</p>
     */
    public void setIsEgress(Boolean IsEgress) {
        this.IsEgress = IsEgress;
    }

    /**
     * Get <p>是否域名解析</p> 
     * @return IsDNS <p>是否域名解析</p>
     */
    public Boolean getIsDNS() {
        return this.IsDNS;
    }

    /**
     * Set <p>是否域名解析</p>
     * @param IsDNS <p>是否域名解析</p>
     */
    public void setIsDNS(Boolean IsDNS) {
        this.IsDNS = IsDNS;
    }

    /**
     * Get <p>是否教育机构</p> 
     * @return IsEducation <p>是否教育机构</p>
     */
    public Boolean getIsEducation() {
        return this.IsEducation;
    }

    /**
     * Set <p>是否教育机构</p>
     * @param IsEducation <p>是否教育机构</p>
     */
    public void setIsEducation(Boolean IsEducation) {
        this.IsEducation = IsEducation;
    }

    /**
     * Get <p>是否组织机构</p> 
     * @return IsInstitution <p>是否组织机构</p>
     */
    public Boolean getIsInstitution() {
        return this.IsInstitution;
    }

    /**
     * Set <p>是否组织机构</p>
     * @param IsInstitution <p>是否组织机构</p>
     */
    public void setIsInstitution(Boolean IsInstitution) {
        this.IsInstitution = IsInstitution;
    }

    /**
     * Get <p>是否企业专线</p> 
     * @return IsCompany <p>是否企业专线</p>
     */
    public Boolean getIsCompany() {
        return this.IsCompany;
    }

    /**
     * Set <p>是否企业专线</p>
     * @param IsCompany <p>是否企业专线</p>
     */
    public void setIsCompany(Boolean IsCompany) {
        this.IsCompany = IsCompany;
    }

    /**
     * Get <p>是否家用宽带</p> 
     * @return IsResidence <p>是否家用宽带</p>
     */
    public Boolean getIsResidence() {
        return this.IsResidence;
    }

    /**
     * Set <p>是否家用宽带</p>
     * @param IsResidence <p>是否家用宽带</p>
     */
    public void setIsResidence(Boolean IsResidence) {
        this.IsResidence = IsResidence;
    }

    /**
     * Get <p>是否云服务</p> 
     * @return IsCloudService <p>是否云服务</p>
     */
    public Boolean getIsCloudService() {
        return this.IsCloudService;
    }

    /**
     * Set <p>是否云服务</p>
     * @param IsCloudService <p>是否云服务</p>
     */
    public void setIsCloudService(Boolean IsCloudService) {
        this.IsCloudService = IsCloudService;
    }

    /**
     * Get <p>是否基础设施</p> 
     * @return IsInfrastructure <p>是否基础设施</p>
     */
    public Boolean getIsInfrastructure() {
        return this.IsInfrastructure;
    }

    /**
     * Set <p>是否基础设施</p>
     * @param IsInfrastructure <p>是否基础设施</p>
     */
    public void setIsInfrastructure(Boolean IsInfrastructure) {
        this.IsInfrastructure = IsInfrastructure;
    }

    /**
     * Get <p>是否邮箱服务</p> 
     * @return IsMXServer <p>是否邮箱服务</p>
     */
    public Boolean getIsMXServer() {
        return this.IsMXServer;
    }

    /**
     * Set <p>是否邮箱服务</p>
     * @param IsMXServer <p>是否邮箱服务</p>
     */
    public void setIsMXServer(Boolean IsMXServer) {
        this.IsMXServer = IsMXServer;
    }

    public IPNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPNetwork(IPNetwork source) {
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.ASN != null) {
            this.ASN = new String(source.ASN);
        }
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.IsReserved != null) {
            this.IsReserved = new Boolean(source.IsReserved);
        }
        if (source.IsGateway != null) {
            this.IsGateway = new Boolean(source.IsGateway);
        }
        if (source.IsAnycast != null) {
            this.IsAnycast = new Boolean(source.IsAnycast);
        }
        if (source.IsMobile != null) {
            this.IsMobile = new Boolean(source.IsMobile);
        }
        if (source.IsDynamic != null) {
            this.IsDynamic = new Boolean(source.IsDynamic);
        }
        if (source.IsEgress != null) {
            this.IsEgress = new Boolean(source.IsEgress);
        }
        if (source.IsDNS != null) {
            this.IsDNS = new Boolean(source.IsDNS);
        }
        if (source.IsEducation != null) {
            this.IsEducation = new Boolean(source.IsEducation);
        }
        if (source.IsInstitution != null) {
            this.IsInstitution = new Boolean(source.IsInstitution);
        }
        if (source.IsCompany != null) {
            this.IsCompany = new Boolean(source.IsCompany);
        }
        if (source.IsResidence != null) {
            this.IsResidence = new Boolean(source.IsResidence);
        }
        if (source.IsCloudService != null) {
            this.IsCloudService = new Boolean(source.IsCloudService);
        }
        if (source.IsInfrastructure != null) {
            this.IsInfrastructure = new Boolean(source.IsInfrastructure);
        }
        if (source.IsMXServer != null) {
            this.IsMXServer = new Boolean(source.IsMXServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "ASN", this.ASN);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "IsReserved", this.IsReserved);
        this.setParamSimple(map, prefix + "IsGateway", this.IsGateway);
        this.setParamSimple(map, prefix + "IsAnycast", this.IsAnycast);
        this.setParamSimple(map, prefix + "IsMobile", this.IsMobile);
        this.setParamSimple(map, prefix + "IsDynamic", this.IsDynamic);
        this.setParamSimple(map, prefix + "IsEgress", this.IsEgress);
        this.setParamSimple(map, prefix + "IsDNS", this.IsDNS);
        this.setParamSimple(map, prefix + "IsEducation", this.IsEducation);
        this.setParamSimple(map, prefix + "IsInstitution", this.IsInstitution);
        this.setParamSimple(map, prefix + "IsCompany", this.IsCompany);
        this.setParamSimple(map, prefix + "IsResidence", this.IsResidence);
        this.setParamSimple(map, prefix + "IsCloudService", this.IsCloudService);
        this.setParamSimple(map, prefix + "IsInfrastructure", this.IsInfrastructure);
        this.setParamSimple(map, prefix + "IsMXServer", this.IsMXServer);

    }
}

