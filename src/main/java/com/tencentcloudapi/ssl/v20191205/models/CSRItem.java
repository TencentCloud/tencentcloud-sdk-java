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

public class CSRItem extends AbstractModel {

    /**
    * <p>CSR Id标识</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>账号</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

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
    * <p>国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>算法</p>
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
    * <p>算法参数</p>
    */
    @SerializedName("KeyParameter")
    @Expose
    private String KeyParameter;

    /**
    * <p>标签</p>
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
     * Get <p>CSR Id标识</p> 
     * @return Id <p>CSR Id标识</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>CSR Id标识</p>
     * @param Id <p>CSR Id标识</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>账号</p> 
     * @return OwnerUin <p>账号</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>账号</p>
     * @param OwnerUin <p>账号</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

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
     * Get <p>国家</p> 
     * @return Country <p>国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家</p>
     * @param Country <p>国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>备注</p> 
     * @return Remarks <p>备注</p>
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set <p>备注</p>
     * @param Remarks <p>备注</p>
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>算法</p> 
     * @return EncryptAlgo <p>算法</p>
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set <p>算法</p>
     * @param EncryptAlgo <p>算法</p>
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    /**
     * Get <p>算法参数</p> 
     * @return KeyParameter <p>算法参数</p>
     */
    public String getKeyParameter() {
        return this.KeyParameter;
    }

    /**
     * Set <p>算法参数</p>
     * @param KeyParameter <p>算法参数</p>
     */
    public void setKeyParameter(String KeyParameter) {
        this.KeyParameter = KeyParameter;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
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

    public CSRItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CSRItem(CSRItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
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
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
        }
        if (source.KeyParameter != null) {
            this.KeyParameter = new String(source.KeyParameter);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);
        this.setParamSimple(map, prefix + "KeyParameter", this.KeyParameter);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);

    }
}

