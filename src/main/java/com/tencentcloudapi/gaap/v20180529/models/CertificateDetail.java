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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateDetail extends AbstractModel {

    /**
    * 证书ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 证书类型。
    */
    @SerializedName("CertificateType")
    @Expose
    private Long CertificateType;

    /**
    * 证书名字。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * 证书内容。
    */
    @SerializedName("CertificateContent")
    @Expose
    private String CertificateContent;

    /**
    * 密钥内容。仅当证书类型为SSL证书时，返回该字段。
    */
    @SerializedName("CertificateKey")
    @Expose
    private String CertificateKey;

    /**
    * 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 证书生效起始时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 证书过期时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 证书签发者通用名称。
    */
    @SerializedName("IssuerCN")
    @Expose
    private String IssuerCN;

    /**
    * 证书主题通用名称。
    */
    @SerializedName("SubjectCN")
    @Expose
    private String SubjectCN;

    /**
     * Get 证书ID。 
     * @return CertificateId 证书ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书ID。
     * @param CertificateId 证书ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 证书类型。 
     * @return CertificateType 证书类型。
     */
    public Long getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证书类型。
     * @param CertificateType 证书类型。
     */
    public void setCertificateType(Long CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 证书名字。 
     * @return CertificateAlias 证书名字。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set 证书名字。
     * @param CertificateAlias 证书名字。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get 证书内容。 
     * @return CertificateContent 证书内容。
     */
    public String getCertificateContent() {
        return this.CertificateContent;
    }

    /**
     * Set 证书内容。
     * @param CertificateContent 证书内容。
     */
    public void setCertificateContent(String CertificateContent) {
        this.CertificateContent = CertificateContent;
    }

    /**
     * Get 密钥内容。仅当证书类型为SSL证书时，返回该字段。 
     * @return CertificateKey 密钥内容。仅当证书类型为SSL证书时，返回该字段。
     */
    public String getCertificateKey() {
        return this.CertificateKey;
    }

    /**
     * Set 密钥内容。仅当证书类型为SSL证书时，返回该字段。
     * @param CertificateKey 密钥内容。仅当证书类型为SSL证书时，返回该字段。
     */
    public void setCertificateKey(String CertificateKey) {
        this.CertificateKey = CertificateKey;
    }

    /**
     * Get 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。 
     * @return CreateTime 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @param CreateTime 创建时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 证书生效起始时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。 
     * @return BeginTime 证书生效起始时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 证书生效起始时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @param BeginTime 证书生效起始时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 证书过期时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。 
     * @return EndTime 证书过期时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 证书过期时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @param EndTime 证书过期时间，采用Unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 证书签发者通用名称。 
     * @return IssuerCN 证书签发者通用名称。
     */
    public String getIssuerCN() {
        return this.IssuerCN;
    }

    /**
     * Set 证书签发者通用名称。
     * @param IssuerCN 证书签发者通用名称。
     */
    public void setIssuerCN(String IssuerCN) {
        this.IssuerCN = IssuerCN;
    }

    /**
     * Get 证书主题通用名称。 
     * @return SubjectCN 证书主题通用名称。
     */
    public String getSubjectCN() {
        return this.SubjectCN;
    }

    /**
     * Set 证书主题通用名称。
     * @param SubjectCN 证书主题通用名称。
     */
    public void setSubjectCN(String SubjectCN) {
        this.SubjectCN = SubjectCN;
    }

    public CertificateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateDetail(CertificateDetail source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new Long(source.CertificateType);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.CertificateContent != null) {
            this.CertificateContent = new String(source.CertificateContent);
        }
        if (source.CertificateKey != null) {
            this.CertificateKey = new String(source.CertificateKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IssuerCN != null) {
            this.IssuerCN = new String(source.IssuerCN);
        }
        if (source.SubjectCN != null) {
            this.SubjectCN = new String(source.SubjectCN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CertificateContent", this.CertificateContent);
        this.setParamSimple(map, prefix + "CertificateKey", this.CertificateKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IssuerCN", this.IssuerCN);
        this.setParamSimple(map, prefix + "SubjectCN", this.SubjectCN);

    }
}

