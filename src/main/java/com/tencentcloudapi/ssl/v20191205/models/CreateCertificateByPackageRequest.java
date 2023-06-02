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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateByPackageRequest extends AbstractModel{

    /**
    * 证书产品PID。
    */
    @SerializedName("ProductPid")
    @Expose
    private Long ProductPid;

    /**
    * 要消耗的权益包ID。
    */
    @SerializedName("PackageIds")
    @Expose
    private String [] PackageIds;

    /**
    * 证书域名数量。
    */
    @SerializedName("DomainCount")
    @Expose
    private String DomainCount;

    /**
    * 多年期证书年限。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 要续费的原证书ID（续费时填写）。
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 续费时CSR生成方式（original、upload、online）。
    */
    @SerializedName("RenewGenCsrMethod")
    @Expose
    private String RenewGenCsrMethod;

    /**
    * 续费时选择上传CSR时填写CSR。
    */
    @SerializedName("RenewCsr")
    @Expose
    private String RenewCsr;

    /**
    * 续费证书CSR的算法类型。
    */
    @SerializedName("RenewAlgorithmType")
    @Expose
    private String RenewAlgorithmType;

    /**
    * 续费证书CSR的算法参数。
    */
    @SerializedName("RenewAlgorithmParam")
    @Expose
    private String RenewAlgorithmParam;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 续费证书的私钥密码。
    */
    @SerializedName("RenewKeyPass")
    @Expose
    private String RenewKeyPass;

    /**
    * 批量购买证书时预填写的域名。
    */
    @SerializedName("DomainNames")
    @Expose
    private String DomainNames;

    /**
    * 批量购买证书数量。
    */
    @SerializedName("CertificateCount")
    @Expose
    private Long CertificateCount;

    /**
    * 预填写的管理人ID。
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
    * 预填写的公司ID。
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 验证方式
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get 证书产品PID。 
     * @return ProductPid 证书产品PID。
     */
    public Long getProductPid() {
        return this.ProductPid;
    }

    /**
     * Set 证书产品PID。
     * @param ProductPid 证书产品PID。
     */
    public void setProductPid(Long ProductPid) {
        this.ProductPid = ProductPid;
    }

    /**
     * Get 要消耗的权益包ID。 
     * @return PackageIds 要消耗的权益包ID。
     */
    public String [] getPackageIds() {
        return this.PackageIds;
    }

    /**
     * Set 要消耗的权益包ID。
     * @param PackageIds 要消耗的权益包ID。
     */
    public void setPackageIds(String [] PackageIds) {
        this.PackageIds = PackageIds;
    }

    /**
     * Get 证书域名数量。 
     * @return DomainCount 证书域名数量。
     */
    public String getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 证书域名数量。
     * @param DomainCount 证书域名数量。
     */
    public void setDomainCount(String DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 多年期证书年限。 
     * @return Period 多年期证书年限。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 多年期证书年限。
     * @param Period 多年期证书年限。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 要续费的原证书ID（续费时填写）。 
     * @return OldCertificateId 要续费的原证书ID（续费时填写）。
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 要续费的原证书ID（续费时填写）。
     * @param OldCertificateId 要续费的原证书ID（续费时填写）。
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 续费时CSR生成方式（original、upload、online）。 
     * @return RenewGenCsrMethod 续费时CSR生成方式（original、upload、online）。
     */
    public String getRenewGenCsrMethod() {
        return this.RenewGenCsrMethod;
    }

    /**
     * Set 续费时CSR生成方式（original、upload、online）。
     * @param RenewGenCsrMethod 续费时CSR生成方式（original、upload、online）。
     */
    public void setRenewGenCsrMethod(String RenewGenCsrMethod) {
        this.RenewGenCsrMethod = RenewGenCsrMethod;
    }

    /**
     * Get 续费时选择上传CSR时填写CSR。 
     * @return RenewCsr 续费时选择上传CSR时填写CSR。
     */
    public String getRenewCsr() {
        return this.RenewCsr;
    }

    /**
     * Set 续费时选择上传CSR时填写CSR。
     * @param RenewCsr 续费时选择上传CSR时填写CSR。
     */
    public void setRenewCsr(String RenewCsr) {
        this.RenewCsr = RenewCsr;
    }

    /**
     * Get 续费证书CSR的算法类型。 
     * @return RenewAlgorithmType 续费证书CSR的算法类型。
     */
    public String getRenewAlgorithmType() {
        return this.RenewAlgorithmType;
    }

    /**
     * Set 续费证书CSR的算法类型。
     * @param RenewAlgorithmType 续费证书CSR的算法类型。
     */
    public void setRenewAlgorithmType(String RenewAlgorithmType) {
        this.RenewAlgorithmType = RenewAlgorithmType;
    }

    /**
     * Get 续费证书CSR的算法参数。 
     * @return RenewAlgorithmParam 续费证书CSR的算法参数。
     */
    public String getRenewAlgorithmParam() {
        return this.RenewAlgorithmParam;
    }

    /**
     * Set 续费证书CSR的算法参数。
     * @param RenewAlgorithmParam 续费证书CSR的算法参数。
     */
    public void setRenewAlgorithmParam(String RenewAlgorithmParam) {
        this.RenewAlgorithmParam = RenewAlgorithmParam;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 续费证书的私钥密码。 
     * @return RenewKeyPass 续费证书的私钥密码。
     */
    public String getRenewKeyPass() {
        return this.RenewKeyPass;
    }

    /**
     * Set 续费证书的私钥密码。
     * @param RenewKeyPass 续费证书的私钥密码。
     */
    public void setRenewKeyPass(String RenewKeyPass) {
        this.RenewKeyPass = RenewKeyPass;
    }

    /**
     * Get 批量购买证书时预填写的域名。 
     * @return DomainNames 批量购买证书时预填写的域名。
     */
    public String getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 批量购买证书时预填写的域名。
     * @param DomainNames 批量购买证书时预填写的域名。
     */
    public void setDomainNames(String DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get 批量购买证书数量。 
     * @return CertificateCount 批量购买证书数量。
     */
    public Long getCertificateCount() {
        return this.CertificateCount;
    }

    /**
     * Set 批量购买证书数量。
     * @param CertificateCount 批量购买证书数量。
     */
    public void setCertificateCount(Long CertificateCount) {
        this.CertificateCount = CertificateCount;
    }

    /**
     * Get 预填写的管理人ID。 
     * @return ManagerId 预填写的管理人ID。
     */
    public Long getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 预填写的管理人ID。
     * @param ManagerId 预填写的管理人ID。
     */
    public void setManagerId(Long ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 预填写的公司ID。 
     * @return CompanyId 预填写的公司ID。
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 预填写的公司ID。
     * @param CompanyId 预填写的公司ID。
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 验证方式 
     * @return VerifyType 验证方式
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证方式
     * @param VerifyType 验证方式
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public CreateCertificateByPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCertificateByPackageRequest(CreateCertificateByPackageRequest source) {
        if (source.ProductPid != null) {
            this.ProductPid = new Long(source.ProductPid);
        }
        if (source.PackageIds != null) {
            this.PackageIds = new String[source.PackageIds.length];
            for (int i = 0; i < source.PackageIds.length; i++) {
                this.PackageIds[i] = new String(source.PackageIds[i]);
            }
        }
        if (source.DomainCount != null) {
            this.DomainCount = new String(source.DomainCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.RenewGenCsrMethod != null) {
            this.RenewGenCsrMethod = new String(source.RenewGenCsrMethod);
        }
        if (source.RenewCsr != null) {
            this.RenewCsr = new String(source.RenewCsr);
        }
        if (source.RenewAlgorithmType != null) {
            this.RenewAlgorithmType = new String(source.RenewAlgorithmType);
        }
        if (source.RenewAlgorithmParam != null) {
            this.RenewAlgorithmParam = new String(source.RenewAlgorithmParam);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.RenewKeyPass != null) {
            this.RenewKeyPass = new String(source.RenewKeyPass);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String(source.DomainNames);
        }
        if (source.CertificateCount != null) {
            this.CertificateCount = new Long(source.CertificateCount);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductPid", this.ProductPid);
        this.setParamArraySimple(map, prefix + "PackageIds.", this.PackageIds);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamSimple(map, prefix + "RenewGenCsrMethod", this.RenewGenCsrMethod);
        this.setParamSimple(map, prefix + "RenewCsr", this.RenewCsr);
        this.setParamSimple(map, prefix + "RenewAlgorithmType", this.RenewAlgorithmType);
        this.setParamSimple(map, prefix + "RenewAlgorithmParam", this.RenewAlgorithmParam);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RenewKeyPass", this.RenewKeyPass);
        this.setParamSimple(map, prefix + "DomainNames", this.DomainNames);
        this.setParamSimple(map, prefix + "CertificateCount", this.CertificateCount);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

