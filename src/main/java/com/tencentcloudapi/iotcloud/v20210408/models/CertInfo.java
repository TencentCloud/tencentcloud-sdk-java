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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo extends AbstractModel{

    /**
    * 证书名称
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 证书的序列号，16进制编码
    */
    @SerializedName("CertSN")
    @Expose
    private String CertSN;

    /**
    * 证书颁发着名称
    */
    @SerializedName("IssuerName")
    @Expose
    private String IssuerName;

    /**
    * 证书主题
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 证书创建时间，秒级时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 证书生效时间，秒级时间戳
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * 证书失效时间，秒级时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * X509证书内容
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
     * Get 证书名称 
     * @return CertName 证书名称
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 证书名称
     * @param CertName 证书名称
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 证书的序列号，16进制编码 
     * @return CertSN 证书的序列号，16进制编码
     */
    public String getCertSN() {
        return this.CertSN;
    }

    /**
     * Set 证书的序列号，16进制编码
     * @param CertSN 证书的序列号，16进制编码
     */
    public void setCertSN(String CertSN) {
        this.CertSN = CertSN;
    }

    /**
     * Get 证书颁发着名称 
     * @return IssuerName 证书颁发着名称
     */
    public String getIssuerName() {
        return this.IssuerName;
    }

    /**
     * Set 证书颁发着名称
     * @param IssuerName 证书颁发着名称
     */
    public void setIssuerName(String IssuerName) {
        this.IssuerName = IssuerName;
    }

    /**
     * Get 证书主题 
     * @return Subject 证书主题
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 证书主题
     * @param Subject 证书主题
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 证书创建时间，秒级时间戳 
     * @return CreateTime 证书创建时间，秒级时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 证书创建时间，秒级时间戳
     * @param CreateTime 证书创建时间，秒级时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 证书生效时间，秒级时间戳 
     * @return EffectiveTime 证书生效时间，秒级时间戳
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 证书生效时间，秒级时间戳
     * @param EffectiveTime 证书生效时间，秒级时间戳
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 证书失效时间，秒级时间戳 
     * @return ExpireTime 证书失效时间，秒级时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 证书失效时间，秒级时间戳
     * @param ExpireTime 证书失效时间，秒级时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get X509证书内容 
     * @return CertText X509证书内容
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set X509证书内容
     * @param CertText X509证书内容
     */
    public void setCertText(String CertText) {
        this.CertText = CertText;
    }

    public CertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertInfo(CertInfo source) {
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertSN != null) {
            this.CertSN = new String(source.CertSN);
        }
        if (source.IssuerName != null) {
            this.IssuerName = new String(source.IssuerName);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new Long(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.CertText != null) {
            this.CertText = new String(source.CertText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertSN", this.CertSN);
        this.setParamSimple(map, prefix + "IssuerName", this.IssuerName);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CertText", this.CertText);

    }
}

