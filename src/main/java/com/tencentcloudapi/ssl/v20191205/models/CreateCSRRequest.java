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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCSRRequest extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>企业/单位名称</p>
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * <p>部门</p>
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * <p>邮箱</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>省份</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * <p>城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>符合ISO 3166 标准的国家或地域代码。如:CN、US</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>加密算法，支持 RSA及ECC。</p>
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
    * <p>密钥参数，RSA仅支持2048，4096。ECC仅支持prime256v1</p>
    */
    @SerializedName("KeyParameter")
    @Expose
    private String KeyParameter;

    /**
    * <p>是否生成CSR内容。生成CSR内容后，此CSR记录不再支持修改</p>
    */
    @SerializedName("Generate")
    @Expose
    private Boolean Generate;

    /**
    * <p>私钥密码</p>
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>SAN域名</p>
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>企业/单位名称</p> 
     * @return Organization <p>企业/单位名称</p>
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set <p>企业/单位名称</p>
     * @param Organization <p>企业/单位名称</p>
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get <p>部门</p> 
     * @return Department <p>部门</p>
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>部门</p>
     * @param Department <p>部门</p>
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get <p>邮箱</p> 
     * @return Email <p>邮箱</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱</p>
     * @param Email <p>邮箱</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>省份</p> 
     * @return Province <p>省份</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>省份</p>
     * @param Province <p>省份</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get <p>城市</p> 
     * @return City <p>城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>城市</p>
     * @param City <p>城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>符合ISO 3166 标准的国家或地域代码。如:CN、US</p> 
     * @return Country <p>符合ISO 3166 标准的国家或地域代码。如:CN、US</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>符合ISO 3166 标准的国家或地域代码。如:CN、US</p>
     * @param Country <p>符合ISO 3166 标准的国家或地域代码。如:CN、US</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>加密算法，支持 RSA及ECC。</p> 
     * @return EncryptAlgo <p>加密算法，支持 RSA及ECC。</p>
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set <p>加密算法，支持 RSA及ECC。</p>
     * @param EncryptAlgo <p>加密算法，支持 RSA及ECC。</p>
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    /**
     * Get <p>密钥参数，RSA仅支持2048，4096。ECC仅支持prime256v1</p> 
     * @return KeyParameter <p>密钥参数，RSA仅支持2048，4096。ECC仅支持prime256v1</p>
     */
    public String getKeyParameter() {
        return this.KeyParameter;
    }

    /**
     * Set <p>密钥参数，RSA仅支持2048，4096。ECC仅支持prime256v1</p>
     * @param KeyParameter <p>密钥参数，RSA仅支持2048，4096。ECC仅支持prime256v1</p>
     */
    public void setKeyParameter(String KeyParameter) {
        this.KeyParameter = KeyParameter;
    }

    /**
     * Get <p>是否生成CSR内容。生成CSR内容后，此CSR记录不再支持修改</p> 
     * @return Generate <p>是否生成CSR内容。生成CSR内容后，此CSR记录不再支持修改</p>
     */
    public Boolean getGenerate() {
        return this.Generate;
    }

    /**
     * Set <p>是否生成CSR内容。生成CSR内容后，此CSR记录不再支持修改</p>
     * @param Generate <p>是否生成CSR内容。生成CSR内容后，此CSR记录不再支持修改</p>
     */
    public void setGenerate(Boolean Generate) {
        this.Generate = Generate;
    }

    /**
     * Get <p>私钥密码</p> 
     * @return KeyPassword <p>私钥密码</p>
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set <p>私钥密码</p>
     * @param KeyPassword <p>私钥密码</p>
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>SAN域名</p> 
     * @return SubjectAltName <p>SAN域名</p>
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set <p>SAN域名</p>
     * @param SubjectAltName <p>SAN域名</p>
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    public CreateCSRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCSRRequest(CreateCSRRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
        }
        if (source.KeyParameter != null) {
            this.KeyParameter = new String(source.KeyParameter);
        }
        if (source.Generate != null) {
            this.Generate = new Boolean(source.Generate);
        }
        if (source.KeyPassword != null) {
            this.KeyPassword = new String(source.KeyPassword);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);
        this.setParamSimple(map, prefix + "KeyParameter", this.KeyParameter);
        this.setParamSimple(map, prefix + "Generate", this.Generate);
        this.setParamSimple(map, prefix + "KeyPassword", this.KeyPassword);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);

    }
}

