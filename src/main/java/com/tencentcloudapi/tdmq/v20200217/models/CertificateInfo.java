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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInfo extends AbstractModel {

    /**
    * SSL证书管理中的id
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 证书到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 证书绑定的域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 证书状态：0 已签发
1 即将过期
2 未启用
3 已过期
4 不可用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 证书类型：0：根证书，1：服务端证书
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * TencentCloud：SSL证书；Default：TDMQ官方默认证书
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 证书添加/更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get SSL证书管理中的id 
     * @return CertificateId SSL证书管理中的id
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set SSL证书管理中的id
     * @param CertificateId SSL证书管理中的id
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 证书到期时间 
     * @return ExpireTime 证书到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 证书到期时间
     * @param ExpireTime 证书到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 证书绑定的域名 
     * @return DomainName 证书绑定的域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 证书绑定的域名
     * @param DomainName 证书绑定的域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 证书状态：0 已签发
1 即将过期
2 未启用
3 已过期
4 不可用 
     * @return Status 证书状态：0 已签发
1 即将过期
2 未启用
3 已过期
4 不可用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态：0 已签发
1 即将过期
2 未启用
3 已过期
4 不可用
     * @param Status 证书状态：0 已签发
1 即将过期
2 未启用
3 已过期
4 不可用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 证书类型：0：根证书，1：服务端证书 
     * @return Type 证书类型：0：根证书，1：服务端证书
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证书类型：0：根证书，1：服务端证书
     * @param Type 证书类型：0：根证书，1：服务端证书
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get TencentCloud：SSL证书；Default：TDMQ官方默认证书 
     * @return Origin TencentCloud：SSL证书；Default：TDMQ官方默认证书
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set TencentCloud：SSL证书；Default：TDMQ官方默认证书
     * @param Origin TencentCloud：SSL证书；Default：TDMQ官方默认证书
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 证书添加/更新时间 
     * @return ModifyTime 证书添加/更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 证书添加/更新时间
     * @param ModifyTime 证书添加/更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

