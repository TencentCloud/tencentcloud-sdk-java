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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongCertificatesPreview extends AbstractModel {

    /**
    * <p>证书名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>绑定的域名</p>
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * <p>证书状态：expired(已过期)<br>                   active(生效中)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>证书pem格式</p>
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
    * <p>证书私钥</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>证书过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>证书上传时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>证书签发时间</p>
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * <p>证书来源：native(kong自定义证书)<br>                    ssl(ssl平台证书)</p>
    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
    * <p>ssl平台证书Id</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
    */
    @SerializedName("CertUsage")
    @Expose
    private String CertUsage;

    /**
    * <p>证书被引用的次数</p>
    */
    @SerializedName("ReferCount")
    @Expose
    private Long ReferCount;

    /**
     * Get <p>证书名称</p> 
     * @return Name <p>证书名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>证书名称</p>
     * @param Name <p>证书名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Id</p> 
     * @return Id <p>Id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Id</p>
     * @param Id <p>Id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>绑定的域名</p> 
     * @return BindDomains <p>绑定的域名</p>
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set <p>绑定的域名</p>
     * @param BindDomains <p>绑定的域名</p>
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get <p>证书状态：expired(已过期)<br>                   active(生效中)</p> 
     * @return Status <p>证书状态：expired(已过期)<br>                   active(生效中)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>证书状态：expired(已过期)<br>                   active(生效中)</p>
     * @param Status <p>证书状态：expired(已过期)<br>                   active(生效中)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>证书pem格式</p> 
     * @return Crt <p>证书pem格式</p>
     */
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set <p>证书pem格式</p>
     * @param Crt <p>证书pem格式</p>
     */
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    /**
     * Get <p>证书私钥</p> 
     * @return Key <p>证书私钥</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>证书私钥</p>
     * @param Key <p>证书私钥</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>证书过期时间</p> 
     * @return ExpireTime <p>证书过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>证书过期时间</p>
     * @param ExpireTime <p>证书过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>证书上传时间</p> 
     * @return CreateTime <p>证书上传时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>证书上传时间</p>
     * @param CreateTime <p>证书上传时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>证书签发时间</p> 
     * @return IssueTime <p>证书签发时间</p>
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set <p>证书签发时间</p>
     * @param IssueTime <p>证书签发时间</p>
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get <p>证书来源：native(kong自定义证书)<br>                    ssl(ssl平台证书)</p> 
     * @return CertSource <p>证书来源：native(kong自定义证书)<br>                    ssl(ssl平台证书)</p>
     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set <p>证书来源：native(kong自定义证书)<br>                    ssl(ssl平台证书)</p>
     * @param CertSource <p>证书来源：native(kong自定义证书)<br>                    ssl(ssl平台证书)</p>
     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get <p>ssl平台证书Id</p> 
     * @return CertId <p>ssl平台证书Id</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>ssl平台证书Id</p>
     * @param CertId <p>ssl平台证书Id</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul> 
     * @return CertType <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
     * @param CertType <p>证书类型</p><p>枚举值：</p><ul><li>SVR： 服务证书</li><li>CA： CA证书</li></ul>
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul> 
     * @return CertUsage <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
     */
    public String getCertUsage() {
        return this.CertUsage;
    }

    /**
     * Set <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
     * @param CertUsage <p>证书用途</p><p>枚举值：</p><ul><li>SERVER： 用作服务端证书</li><li>CLIENT： 用作客户端证书</li></ul>
     */
    public void setCertUsage(String CertUsage) {
        this.CertUsage = CertUsage;
    }

    /**
     * Get <p>证书被引用的次数</p> 
     * @return ReferCount <p>证书被引用的次数</p>
     */
    public Long getReferCount() {
        return this.ReferCount;
    }

    /**
     * Set <p>证书被引用的次数</p>
     * @param ReferCount <p>证书被引用的次数</p>
     */
    public void setReferCount(Long ReferCount) {
        this.ReferCount = ReferCount;
    }

    public KongCertificatesPreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongCertificatesPreview(KongCertificatesPreview source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Crt != null) {
            this.Crt = new String(source.Crt);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
        }
        if (source.CertSource != null) {
            this.CertSource = new String(source.CertSource);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.CertUsage != null) {
            this.CertUsage = new String(source.CertUsage);
        }
        if (source.ReferCount != null) {
            this.ReferCount = new Long(source.ReferCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Crt", this.Crt);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertUsage", this.CertUsage);
        this.setParamSimple(map, prefix + "ReferCount", this.ReferCount);

    }
}

