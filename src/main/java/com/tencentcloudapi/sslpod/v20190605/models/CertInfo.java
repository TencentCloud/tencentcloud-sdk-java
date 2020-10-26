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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo extends AbstractModel{

    /**
    * 证书sha1
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
    * 证书通用名称
    */
    @SerializedName("CN")
    @Expose
    private String CN;

    /**
    * 备用名称
    */
    @SerializedName("SANs")
    @Expose
    private String SANs;

    /**
    * 公钥算法
    */
    @SerializedName("KeyAlgo")
    @Expose
    private String KeyAlgo;

    /**
    * 颁发者
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 有效期开始
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 有效期结束
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 剩余天数
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * 品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 信任状态
    */
    @SerializedName("TrustStatus")
    @Expose
    private String TrustStatus;

    /**
    * 证书类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
     * Get 证书sha1 
     * @return Hash 证书sha1
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set 证书sha1
     * @param Hash 证书sha1
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    /**
     * Get 证书通用名称 
     * @return CN 证书通用名称
     */
    public String getCN() {
        return this.CN;
    }

    /**
     * Set 证书通用名称
     * @param CN 证书通用名称
     */
    public void setCN(String CN) {
        this.CN = CN;
    }

    /**
     * Get 备用名称 
     * @return SANs 备用名称
     */
    public String getSANs() {
        return this.SANs;
    }

    /**
     * Set 备用名称
     * @param SANs 备用名称
     */
    public void setSANs(String SANs) {
        this.SANs = SANs;
    }

    /**
     * Get 公钥算法 
     * @return KeyAlgo 公钥算法
     */
    public String getKeyAlgo() {
        return this.KeyAlgo;
    }

    /**
     * Set 公钥算法
     * @param KeyAlgo 公钥算法
     */
    public void setKeyAlgo(String KeyAlgo) {
        this.KeyAlgo = KeyAlgo;
    }

    /**
     * Get 颁发者 
     * @return Issuer 颁发者
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 颁发者
     * @param Issuer 颁发者
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 有效期开始 
     * @return BeginTime 有效期开始
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 有效期开始
     * @param BeginTime 有效期开始
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 有效期结束 
     * @return EndTime 有效期结束
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 有效期结束
     * @param EndTime 有效期结束
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 剩余天数 
     * @return Days 剩余天数
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set 剩余天数
     * @param Days 剩余天数
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get 品牌 
     * @return Brand 品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 品牌
     * @param Brand 品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 信任状态 
     * @return TrustStatus 信任状态
     */
    public String getTrustStatus() {
        return this.TrustStatus;
    }

    /**
     * Set 信任状态
     * @param TrustStatus 信任状态
     */
    public void setTrustStatus(String TrustStatus) {
        this.TrustStatus = TrustStatus;
    }

    /**
     * Get 证书类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertType 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertType 证书类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hash", this.Hash);
        this.setParamSimple(map, prefix + "CN", this.CN);
        this.setParamSimple(map, prefix + "SANs", this.SANs);
        this.setParamSimple(map, prefix + "KeyAlgo", this.KeyAlgo);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "TrustStatus", this.TrustStatus);
        this.setParamSimple(map, prefix + "CertType", this.CertType);

    }
}

