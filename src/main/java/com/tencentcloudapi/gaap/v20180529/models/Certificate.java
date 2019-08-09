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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Certificate  extends AbstractModel{

    /**
    * 证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 证书名称（旧参数，请使用CertificateAlias）。
    */
    @SerializedName("CertificateName")
    @Expose
    private String CertificateName;

    /**
    * 证书类型
    */
    @SerializedName("CertificateType")
    @Expose
    private Long CertificateType;

    /**
    * 证书名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * 证书创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 证书生效起始时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 证书过期时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 证书签发者通用名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuerCN")
    @Expose
    private String IssuerCN;

    /**
    * 证书主题通用名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectCN")
    @Expose
    private String SubjectCN;

    /**
     * 获取证书ID
     * @return CertificateId 证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * 设置证书ID
     * @param CertificateId 证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * 获取证书名称（旧参数，请使用CertificateAlias）。
     * @return CertificateName 证书名称（旧参数，请使用CertificateAlias）。
     */
    public String getCertificateName() {
        return this.CertificateName;
    }

    /**
     * 设置证书名称（旧参数，请使用CertificateAlias）。
     * @param CertificateName 证书名称（旧参数，请使用CertificateAlias）。
     */
    public void setCertificateName(String CertificateName) {
        this.CertificateName = CertificateName;
    }

    /**
     * 获取证书类型
     * @return CertificateType 证书类型
     */
    public Long getCertificateType() {
        return this.CertificateType;
    }

    /**
     * 设置证书类型
     * @param CertificateType 证书类型
     */
    public void setCertificateType(Long CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * 获取证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CertificateAlias 证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * 设置证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateAlias 证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * 获取证书创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @return CreateTime 证书创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置证书创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     * @param CreateTime 证书创建时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取证书生效起始时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return BeginTime 证书生效起始时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * 设置证书生效起始时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 证书生效起始时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * 获取证书过期时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return EndTime 证书过期时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置证书过期时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 证书过期时间，采用unix时间戳的方式，表示从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取证书签发者通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return IssuerCN 证书签发者通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuerCN() {
        return this.IssuerCN;
    }

    /**
     * 设置证书签发者通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuerCN 证书签发者通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuerCN(String IssuerCN) {
        this.IssuerCN = IssuerCN;
    }

    /**
     * 获取证书主题通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SubjectCN 证书主题通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubjectCN() {
        return this.SubjectCN;
    }

    /**
     * 设置证书主题通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectCN 证书主题通用名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectCN(String SubjectCN) {
        this.SubjectCN = SubjectCN;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateName", this.CertificateName);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IssuerCN", this.IssuerCN);
        this.setParamSimple(map, prefix + "SubjectCN", this.SubjectCN);

    }
}

