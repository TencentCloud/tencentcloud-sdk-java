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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo extends AbstractModel {

    /**
    * <p>证书名称</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * <p>证书序列号</p>
    */
    @SerializedName("CertSN")
    @Expose
    private String CertSN;

    /**
    * <p>证书颁发者名称（颁发机构的 CN）</p>
    */
    @SerializedName("IssuerName")
    @Expose
    private String IssuerName;

    /**
    * <p>证书主题，即证书持有者信息</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>证书创建时间，Unix 时间戳，</p><p>单位：秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>证书生效时间，Unix 时间戳，</p><p>单位：秒</p>
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * <p>证书过期时间，Unix 时间戳，</p><p>单位：秒</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>证书内容，PEM 格式文本</p>
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
     * Get <p>证书名称</p> 
     * @return CertName <p>证书名称</p>
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set <p>证书名称</p>
     * @param CertName <p>证书名称</p>
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get <p>证书序列号</p> 
     * @return CertSN <p>证书序列号</p>
     */
    public String getCertSN() {
        return this.CertSN;
    }

    /**
     * Set <p>证书序列号</p>
     * @param CertSN <p>证书序列号</p>
     */
    public void setCertSN(String CertSN) {
        this.CertSN = CertSN;
    }

    /**
     * Get <p>证书颁发者名称（颁发机构的 CN）</p> 
     * @return IssuerName <p>证书颁发者名称（颁发机构的 CN）</p>
     */
    public String getIssuerName() {
        return this.IssuerName;
    }

    /**
     * Set <p>证书颁发者名称（颁发机构的 CN）</p>
     * @param IssuerName <p>证书颁发者名称（颁发机构的 CN）</p>
     */
    public void setIssuerName(String IssuerName) {
        this.IssuerName = IssuerName;
    }

    /**
     * Get <p>证书主题，即证书持有者信息</p> 
     * @return Subject <p>证书主题，即证书持有者信息</p>
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set <p>证书主题，即证书持有者信息</p>
     * @param Subject <p>证书主题，即证书持有者信息</p>
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get <p>证书创建时间，Unix 时间戳，</p><p>单位：秒</p> 
     * @return CreateTime <p>证书创建时间，Unix 时间戳，</p><p>单位：秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>证书创建时间，Unix 时间戳，</p><p>单位：秒</p>
     * @param CreateTime <p>证书创建时间，Unix 时间戳，</p><p>单位：秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>证书生效时间，Unix 时间戳，</p><p>单位：秒</p> 
     * @return EffectiveTime <p>证书生效时间，Unix 时间戳，</p><p>单位：秒</p>
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set <p>证书生效时间，Unix 时间戳，</p><p>单位：秒</p>
     * @param EffectiveTime <p>证书生效时间，Unix 时间戳，</p><p>单位：秒</p>
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get <p>证书过期时间，Unix 时间戳，</p><p>单位：秒</p> 
     * @return ExpireTime <p>证书过期时间，Unix 时间戳，</p><p>单位：秒</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>证书过期时间，Unix 时间戳，</p><p>单位：秒</p>
     * @param ExpireTime <p>证书过期时间，Unix 时间戳，</p><p>单位：秒</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>证书内容，PEM 格式文本</p> 
     * @return CertText <p>证书内容，PEM 格式文本</p>
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set <p>证书内容，PEM 格式文本</p>
     * @param CertText <p>证书内容，PEM 格式文本</p>
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

