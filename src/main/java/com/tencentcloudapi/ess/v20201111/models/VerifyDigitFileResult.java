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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDigitFileResult extends AbstractModel {

    /**
    * 证书起始时间的Unix时间戳，单位毫秒
    */
    @SerializedName("CertNotBefore")
    @Expose
    private Long CertNotBefore;

    /**
    * 证书过期时间的时间戳，单位毫秒
    */
    @SerializedName("CertNotAfter")
    @Expose
    private Long CertNotAfter;

    /**
    * 证书序列号，在数字证书申请过程中，系统会自动生成一个独一无二的序号。	
    */
    @SerializedName("CertSn")
    @Expose
    private String CertSn;

    /**
    * 证书签名算法, 如SHA1withRSA等算法
    */
    @SerializedName("SignAlgorithm")
    @Expose
    private String SignAlgorithm;

    /**
    * 签署时间的Unix时间戳，单位毫秒
    */
    @SerializedName("SignTime")
    @Expose
    private Long SignTime;

    /**
    * 签名类型。0表示带签章的数字签名，1表示仅数字签名
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@编码
**个人**: ESS@个人姓名@证件号@808854

如果在其他平台签署的, 主体的名字参考其他平台的说明
    */
    @SerializedName("SignerName")
    @Expose
    private String SignerName;

    /**
     * Get 证书起始时间的Unix时间戳，单位毫秒 
     * @return CertNotBefore 证书起始时间的Unix时间戳，单位毫秒
     */
    public Long getCertNotBefore() {
        return this.CertNotBefore;
    }

    /**
     * Set 证书起始时间的Unix时间戳，单位毫秒
     * @param CertNotBefore 证书起始时间的Unix时间戳，单位毫秒
     */
    public void setCertNotBefore(Long CertNotBefore) {
        this.CertNotBefore = CertNotBefore;
    }

    /**
     * Get 证书过期时间的时间戳，单位毫秒 
     * @return CertNotAfter 证书过期时间的时间戳，单位毫秒
     */
    public Long getCertNotAfter() {
        return this.CertNotAfter;
    }

    /**
     * Set 证书过期时间的时间戳，单位毫秒
     * @param CertNotAfter 证书过期时间的时间戳，单位毫秒
     */
    public void setCertNotAfter(Long CertNotAfter) {
        this.CertNotAfter = CertNotAfter;
    }

    /**
     * Get 证书序列号，在数字证书申请过程中，系统会自动生成一个独一无二的序号。	 
     * @return CertSn 证书序列号，在数字证书申请过程中，系统会自动生成一个独一无二的序号。	
     */
    public String getCertSn() {
        return this.CertSn;
    }

    /**
     * Set 证书序列号，在数字证书申请过程中，系统会自动生成一个独一无二的序号。	
     * @param CertSn 证书序列号，在数字证书申请过程中，系统会自动生成一个独一无二的序号。	
     */
    public void setCertSn(String CertSn) {
        this.CertSn = CertSn;
    }

    /**
     * Get 证书签名算法, 如SHA1withRSA等算法 
     * @return SignAlgorithm 证书签名算法, 如SHA1withRSA等算法
     */
    public String getSignAlgorithm() {
        return this.SignAlgorithm;
    }

    /**
     * Set 证书签名算法, 如SHA1withRSA等算法
     * @param SignAlgorithm 证书签名算法, 如SHA1withRSA等算法
     */
    public void setSignAlgorithm(String SignAlgorithm) {
        this.SignAlgorithm = SignAlgorithm;
    }

    /**
     * Get 签署时间的Unix时间戳，单位毫秒 
     * @return SignTime 签署时间的Unix时间戳，单位毫秒
     */
    public Long getSignTime() {
        return this.SignTime;
    }

    /**
     * Set 签署时间的Unix时间戳，单位毫秒
     * @param SignTime 签署时间的Unix时间戳，单位毫秒
     */
    public void setSignTime(Long SignTime) {
        this.SignTime = SignTime;
    }

    /**
     * Get 签名类型。0表示带签章的数字签名，1表示仅数字签名 
     * @return SignType 签名类型。0表示带签章的数字签名，1表示仅数字签名
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set 签名类型。0表示带签章的数字签名，1表示仅数字签名
     * @param SignType 签名类型。0表示带签章的数字签名，1表示仅数字签名
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@编码
**个人**: ESS@个人姓名@证件号@808854

如果在其他平台签署的, 主体的名字参考其他平台的说明 
     * @return SignerName 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@编码
**个人**: ESS@个人姓名@证件号@808854

如果在其他平台签署的, 主体的名字参考其他平台的说明
     */
    public String getSignerName() {
        return this.SignerName;
    }

    /**
     * Set 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@编码
**个人**: ESS@个人姓名@证件号@808854

如果在其他平台签署的, 主体的名字参考其他平台的说明
     * @param SignerName 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@编码
**个人**: ESS@个人姓名@证件号@808854

如果在其他平台签署的, 主体的名字参考其他平台的说明
     */
    public void setSignerName(String SignerName) {
        this.SignerName = SignerName;
    }

    public VerifyDigitFileResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDigitFileResult(VerifyDigitFileResult source) {
        if (source.CertNotBefore != null) {
            this.CertNotBefore = new Long(source.CertNotBefore);
        }
        if (source.CertNotAfter != null) {
            this.CertNotAfter = new Long(source.CertNotAfter);
        }
        if (source.CertSn != null) {
            this.CertSn = new String(source.CertSn);
        }
        if (source.SignAlgorithm != null) {
            this.SignAlgorithm = new String(source.SignAlgorithm);
        }
        if (source.SignTime != null) {
            this.SignTime = new Long(source.SignTime);
        }
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
        }
        if (source.SignerName != null) {
            this.SignerName = new String(source.SignerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertNotBefore", this.CertNotBefore);
        this.setParamSimple(map, prefix + "CertNotAfter", this.CertNotAfter);
        this.setParamSimple(map, prefix + "CertSn", this.CertSn);
        this.setParamSimple(map, prefix + "SignAlgorithm", this.SignAlgorithm);
        this.setParamSimple(map, prefix + "SignTime", this.SignTime);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "SignerName", this.SignerName);

    }
}

