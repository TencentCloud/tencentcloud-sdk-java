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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceDomain extends AbstractModel {

    /**
    * <p>域名名称。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名状态。</p><p>枚举值：</p><ul><li>Online： 已生效；</li><li>Process： 部署中；</li><li>Offline： 已停用；</li><li>Init： 未生效，待激活站点。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
    */
    @SerializedName("AuthSwitch")
    @Expose
    private String AuthSwitch;

    /**
    * <p>CNAME 地址。</p><p>校验域名 CNAME 配置状态，请参考<a href="https://cloud.tencent.com/document/api/1552/94491"> CheckCnameStatus </a>接口。</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p><p>验证归属权，请参考<a href="https://cloud.tencent.com/document/api/1552/98879"> VerifyOwnership </a>接口。</p>
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * <p>域名证书信息。</p><p>申请免费证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/124807">ApplyFreeCertificate</a> 接口；<br>检查免费证书申请结果，请参考 <a href="https://cloud.tencent.com/document/api/1552/124806">CheckFreeCertificateVerification</a> 接口；<br>配置域名证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/80764">ModifyHostsCertificate</a> 接口。</p>
    */
    @SerializedName("Certificate")
    @Expose
    private HostsCertificate Certificate;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>域名名称。</p> 
     * @return Domain <p>域名名称。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名名称。</p>
     * @param Domain <p>域名名称。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名状态。</p><p>枚举值：</p><ul><li>Online： 已生效；</li><li>Process： 部署中；</li><li>Offline： 已停用；</li><li>Init： 未生效，待激活站点。</li></ul> 
     * @return Status <p>域名状态。</p><p>枚举值：</p><ul><li>Online： 已生效；</li><li>Process： 部署中；</li><li>Offline： 已停用；</li><li>Init： 未生效，待激活站点。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>域名状态。</p><p>枚举值：</p><ul><li>Online： 已生效；</li><li>Process： 部署中；</li><li>Offline： 已停用；</li><li>Init： 未生效，待激活站点。</li></ul>
     * @param Status <p>域名状态。</p><p>枚举值：</p><ul><li>Online： 已生效；</li><li>Process： 部署中；</li><li>Offline： 已停用；</li><li>Init： 未生效，待激活站点。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p> 
     * @return AuthSwitch <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
     */
    public String getAuthSwitch() {
        return this.AuthSwitch;
    }

    /**
     * Set <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
     * @param AuthSwitch <p>推理任务请求鉴权开关。</p><p>枚举值：</p><ul><li>Off： 关闭鉴权；</li><li>On： 开启鉴权。</li></ul><p>默认值：On。</p>
     */
    public void setAuthSwitch(String AuthSwitch) {
        this.AuthSwitch = AuthSwitch;
    }

    /**
     * Get <p>CNAME 地址。</p><p>校验域名 CNAME 配置状态，请参考<a href="https://cloud.tencent.com/document/api/1552/94491"> CheckCnameStatus </a>接口。</p> 
     * @return Cname <p>CNAME 地址。</p><p>校验域名 CNAME 配置状态，请参考<a href="https://cloud.tencent.com/document/api/1552/94491"> CheckCnameStatus </a>接口。</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>CNAME 地址。</p><p>校验域名 CNAME 配置状态，请参考<a href="https://cloud.tencent.com/document/api/1552/94491"> CheckCnameStatus </a>接口。</p>
     * @param Cname <p>CNAME 地址。</p><p>校验域名 CNAME 配置状态，请参考<a href="https://cloud.tencent.com/document/api/1552/94491"> CheckCnameStatus </a>接口。</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p><p>验证归属权，请参考<a href="https://cloud.tencent.com/document/api/1552/98879"> VerifyOwnership </a>接口。</p> 
     * @return OwnershipVerification <p>域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p><p>验证归属权，请参考<a href="https://cloud.tencent.com/document/api/1552/98879"> VerifyOwnership </a>接口。</p>
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set <p>域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p><p>验证归属权，请参考<a href="https://cloud.tencent.com/document/api/1552/98879"> VerifyOwnership </a>接口。</p>
     * @param OwnershipVerification <p>域名需进行归属权验证才能继续提供服务时，该对象会携带对应验证方式所需要的信息。</p><p>验证归属权，请参考<a href="https://cloud.tencent.com/document/api/1552/98879"> VerifyOwnership </a>接口。</p>
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get <p>域名证书信息。</p><p>申请免费证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/124807">ApplyFreeCertificate</a> 接口；<br>检查免费证书申请结果，请参考 <a href="https://cloud.tencent.com/document/api/1552/124806">CheckFreeCertificateVerification</a> 接口；<br>配置域名证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/80764">ModifyHostsCertificate</a> 接口。</p> 
     * @return Certificate <p>域名证书信息。</p><p>申请免费证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/124807">ApplyFreeCertificate</a> 接口；<br>检查免费证书申请结果，请参考 <a href="https://cloud.tencent.com/document/api/1552/124806">CheckFreeCertificateVerification</a> 接口；<br>配置域名证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/80764">ModifyHostsCertificate</a> 接口。</p>
     */
    public HostsCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>域名证书信息。</p><p>申请免费证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/124807">ApplyFreeCertificate</a> 接口；<br>检查免费证书申请结果，请参考 <a href="https://cloud.tencent.com/document/api/1552/124806">CheckFreeCertificateVerification</a> 接口；<br>配置域名证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/80764">ModifyHostsCertificate</a> 接口。</p>
     * @param Certificate <p>域名证书信息。</p><p>申请免费证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/124807">ApplyFreeCertificate</a> 接口；<br>检查免费证书申请结果，请参考 <a href="https://cloud.tencent.com/document/api/1552/124806">CheckFreeCertificateVerification</a> 接口；<br>配置域名证书，请参考 <a href="https://cloud.tencent.com/document/api/1552/80764">ModifyHostsCertificate</a> 接口。</p>
     */
    public void setCertificate(HostsCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间。</p> 
     * @return UpdateTime <p>修改时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间。</p>
     * @param UpdateTime <p>修改时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public InferenceDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceDomain(InferenceDomain source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AuthSwitch != null) {
            this.AuthSwitch = new String(source.AuthSwitch);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.Certificate != null) {
            this.Certificate = new HostsCertificate(source.Certificate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthSwitch", this.AuthSwitch);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

