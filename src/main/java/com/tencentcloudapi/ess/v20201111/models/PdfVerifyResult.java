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

public class PdfVerifyResult extends AbstractModel {

    /**
    * <p>验签结果。0-签名域未签名；1-验签成功； 3-验签失败；4-未找到签名域：文件内没有签名域；5-签名值格式不正确。</p>
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * <p>签署平台<br>如果文件是在腾讯电子签平台签署，则为<strong>腾讯电子签</strong>，<br>如果文件不在腾讯电子签平台签署，则为<strong>其他平台</strong>。</p>
    */
    @SerializedName("SignPlatform")
    @Expose
    private String SignPlatform;

    /**
    * <p>申请证书的主体的名字</p><p>如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下<br><strong>企业</strong>:  ESS@企业名称@编码<br><strong>个人</strong>: ESS@个人姓名@证件号@808854</p><p>如果在其他平台签署的, 主体的名字参考其他平台的说明</p>
    */
    @SerializedName("SignerName")
    @Expose
    private String SignerName;

    /**
    * <p>签署时间的Unix时间戳，单位毫秒</p>
    */
    @SerializedName("SignTime")
    @Expose
    private Long SignTime;

    /**
    * <p>证书签名算法,  如SHA1withRSA等算法</p>
    */
    @SerializedName("SignAlgorithm")
    @Expose
    private String SignAlgorithm;

    /**
    * <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。</p>
    */
    @SerializedName("CertSn")
    @Expose
    private String CertSn;

    /**
    * <p>证书起始时间的Unix时间戳，单位毫秒</p>
    */
    @SerializedName("CertNotBefore")
    @Expose
    private Long CertNotBefore;

    /**
    * <p>证书过期时间的时间戳，单位毫秒</p>
    */
    @SerializedName("CertNotAfter")
    @Expose
    private Long CertNotAfter;

    /**
    * <p>签名域横坐标，单位px</p>
    */
    @SerializedName("ComponentPosX")
    @Expose
    private Float ComponentPosX;

    /**
    * <p>签名域纵坐标，单位px</p>
    */
    @SerializedName("ComponentPosY")
    @Expose
    private Float ComponentPosY;

    /**
    * <p>签名域宽度，单位px</p>
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

    /**
    * <p>签名域高度，单位px</p>
    */
    @SerializedName("ComponentHeight")
    @Expose
    private Float ComponentHeight;

    /**
    * <p>签名域所在页码，1～N</p>
    */
    @SerializedName("ComponentPage")
    @Expose
    private Long ComponentPage;

    /**
    * <p>证书颁发机构</p>
    */
    @SerializedName("CertProvider")
    @Expose
    private String CertProvider;

    /**
    * <p>是否有可信时间戳</p>
    */
    @SerializedName("IsTimestampTrust")
    @Expose
    private Boolean IsTimestampTrust;

    /**
     * Get <p>验签结果。0-签名域未签名；1-验签成功； 3-验签失败；4-未找到签名域：文件内没有签名域；5-签名值格式不正确。</p> 
     * @return VerifyResult <p>验签结果。0-签名域未签名；1-验签成功； 3-验签失败；4-未找到签名域：文件内没有签名域；5-签名值格式不正确。</p>
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set <p>验签结果。0-签名域未签名；1-验签成功； 3-验签失败；4-未找到签名域：文件内没有签名域；5-签名值格式不正确。</p>
     * @param VerifyResult <p>验签结果。0-签名域未签名；1-验签成功； 3-验签失败；4-未找到签名域：文件内没有签名域；5-签名值格式不正确。</p>
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get <p>签署平台<br>如果文件是在腾讯电子签平台签署，则为<strong>腾讯电子签</strong>，<br>如果文件不在腾讯电子签平台签署，则为<strong>其他平台</strong>。</p> 
     * @return SignPlatform <p>签署平台<br>如果文件是在腾讯电子签平台签署，则为<strong>腾讯电子签</strong>，<br>如果文件不在腾讯电子签平台签署，则为<strong>其他平台</strong>。</p>
     */
    public String getSignPlatform() {
        return this.SignPlatform;
    }

    /**
     * Set <p>签署平台<br>如果文件是在腾讯电子签平台签署，则为<strong>腾讯电子签</strong>，<br>如果文件不在腾讯电子签平台签署，则为<strong>其他平台</strong>。</p>
     * @param SignPlatform <p>签署平台<br>如果文件是在腾讯电子签平台签署，则为<strong>腾讯电子签</strong>，<br>如果文件不在腾讯电子签平台签署，则为<strong>其他平台</strong>。</p>
     */
    public void setSignPlatform(String SignPlatform) {
        this.SignPlatform = SignPlatform;
    }

    /**
     * Get <p>申请证书的主体的名字</p><p>如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下<br><strong>企业</strong>:  ESS@企业名称@编码<br><strong>个人</strong>: ESS@个人姓名@证件号@808854</p><p>如果在其他平台签署的, 主体的名字参考其他平台的说明</p> 
     * @return SignerName <p>申请证书的主体的名字</p><p>如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下<br><strong>企业</strong>:  ESS@企业名称@编码<br><strong>个人</strong>: ESS@个人姓名@证件号@808854</p><p>如果在其他平台签署的, 主体的名字参考其他平台的说明</p>
     */
    public String getSignerName() {
        return this.SignerName;
    }

    /**
     * Set <p>申请证书的主体的名字</p><p>如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下<br><strong>企业</strong>:  ESS@企业名称@编码<br><strong>个人</strong>: ESS@个人姓名@证件号@808854</p><p>如果在其他平台签署的, 主体的名字参考其他平台的说明</p>
     * @param SignerName <p>申请证书的主体的名字</p><p>如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下<br><strong>企业</strong>:  ESS@企业名称@编码<br><strong>个人</strong>: ESS@个人姓名@证件号@808854</p><p>如果在其他平台签署的, 主体的名字参考其他平台的说明</p>
     */
    public void setSignerName(String SignerName) {
        this.SignerName = SignerName;
    }

    /**
     * Get <p>签署时间的Unix时间戳，单位毫秒</p> 
     * @return SignTime <p>签署时间的Unix时间戳，单位毫秒</p>
     */
    public Long getSignTime() {
        return this.SignTime;
    }

    /**
     * Set <p>签署时间的Unix时间戳，单位毫秒</p>
     * @param SignTime <p>签署时间的Unix时间戳，单位毫秒</p>
     */
    public void setSignTime(Long SignTime) {
        this.SignTime = SignTime;
    }

    /**
     * Get <p>证书签名算法,  如SHA1withRSA等算法</p> 
     * @return SignAlgorithm <p>证书签名算法,  如SHA1withRSA等算法</p>
     */
    public String getSignAlgorithm() {
        return this.SignAlgorithm;
    }

    /**
     * Set <p>证书签名算法,  如SHA1withRSA等算法</p>
     * @param SignAlgorithm <p>证书签名算法,  如SHA1withRSA等算法</p>
     */
    public void setSignAlgorithm(String SignAlgorithm) {
        this.SignAlgorithm = SignAlgorithm;
    }

    /**
     * Get <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。</p> 
     * @return CertSn <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。</p>
     */
    public String getCertSn() {
        return this.CertSn;
    }

    /**
     * Set <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。</p>
     * @param CertSn <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。</p>
     */
    public void setCertSn(String CertSn) {
        this.CertSn = CertSn;
    }

    /**
     * Get <p>证书起始时间的Unix时间戳，单位毫秒</p> 
     * @return CertNotBefore <p>证书起始时间的Unix时间戳，单位毫秒</p>
     */
    public Long getCertNotBefore() {
        return this.CertNotBefore;
    }

    /**
     * Set <p>证书起始时间的Unix时间戳，单位毫秒</p>
     * @param CertNotBefore <p>证书起始时间的Unix时间戳，单位毫秒</p>
     */
    public void setCertNotBefore(Long CertNotBefore) {
        this.CertNotBefore = CertNotBefore;
    }

    /**
     * Get <p>证书过期时间的时间戳，单位毫秒</p> 
     * @return CertNotAfter <p>证书过期时间的时间戳，单位毫秒</p>
     */
    public Long getCertNotAfter() {
        return this.CertNotAfter;
    }

    /**
     * Set <p>证书过期时间的时间戳，单位毫秒</p>
     * @param CertNotAfter <p>证书过期时间的时间戳，单位毫秒</p>
     */
    public void setCertNotAfter(Long CertNotAfter) {
        this.CertNotAfter = CertNotAfter;
    }

    /**
     * Get <p>签名域横坐标，单位px</p> 
     * @return ComponentPosX <p>签名域横坐标，单位px</p>
     */
    public Float getComponentPosX() {
        return this.ComponentPosX;
    }

    /**
     * Set <p>签名域横坐标，单位px</p>
     * @param ComponentPosX <p>签名域横坐标，单位px</p>
     */
    public void setComponentPosX(Float ComponentPosX) {
        this.ComponentPosX = ComponentPosX;
    }

    /**
     * Get <p>签名域纵坐标，单位px</p> 
     * @return ComponentPosY <p>签名域纵坐标，单位px</p>
     */
    public Float getComponentPosY() {
        return this.ComponentPosY;
    }

    /**
     * Set <p>签名域纵坐标，单位px</p>
     * @param ComponentPosY <p>签名域纵坐标，单位px</p>
     */
    public void setComponentPosY(Float ComponentPosY) {
        this.ComponentPosY = ComponentPosY;
    }

    /**
     * Get <p>签名域宽度，单位px</p> 
     * @return ComponentWidth <p>签名域宽度，单位px</p>
     */
    public Float getComponentWidth() {
        return this.ComponentWidth;
    }

    /**
     * Set <p>签名域宽度，单位px</p>
     * @param ComponentWidth <p>签名域宽度，单位px</p>
     */
    public void setComponentWidth(Float ComponentWidth) {
        this.ComponentWidth = ComponentWidth;
    }

    /**
     * Get <p>签名域高度，单位px</p> 
     * @return ComponentHeight <p>签名域高度，单位px</p>
     */
    public Float getComponentHeight() {
        return this.ComponentHeight;
    }

    /**
     * Set <p>签名域高度，单位px</p>
     * @param ComponentHeight <p>签名域高度，单位px</p>
     */
    public void setComponentHeight(Float ComponentHeight) {
        this.ComponentHeight = ComponentHeight;
    }

    /**
     * Get <p>签名域所在页码，1～N</p> 
     * @return ComponentPage <p>签名域所在页码，1～N</p>
     */
    public Long getComponentPage() {
        return this.ComponentPage;
    }

    /**
     * Set <p>签名域所在页码，1～N</p>
     * @param ComponentPage <p>签名域所在页码，1～N</p>
     */
    public void setComponentPage(Long ComponentPage) {
        this.ComponentPage = ComponentPage;
    }

    /**
     * Get <p>证书颁发机构</p> 
     * @return CertProvider <p>证书颁发机构</p>
     */
    public String getCertProvider() {
        return this.CertProvider;
    }

    /**
     * Set <p>证书颁发机构</p>
     * @param CertProvider <p>证书颁发机构</p>
     */
    public void setCertProvider(String CertProvider) {
        this.CertProvider = CertProvider;
    }

    /**
     * Get <p>是否有可信时间戳</p> 
     * @return IsTimestampTrust <p>是否有可信时间戳</p>
     */
    public Boolean getIsTimestampTrust() {
        return this.IsTimestampTrust;
    }

    /**
     * Set <p>是否有可信时间戳</p>
     * @param IsTimestampTrust <p>是否有可信时间戳</p>
     */
    public void setIsTimestampTrust(Boolean IsTimestampTrust) {
        this.IsTimestampTrust = IsTimestampTrust;
    }

    public PdfVerifyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PdfVerifyResult(PdfVerifyResult source) {
        if (source.VerifyResult != null) {
            this.VerifyResult = new Long(source.VerifyResult);
        }
        if (source.SignPlatform != null) {
            this.SignPlatform = new String(source.SignPlatform);
        }
        if (source.SignerName != null) {
            this.SignerName = new String(source.SignerName);
        }
        if (source.SignTime != null) {
            this.SignTime = new Long(source.SignTime);
        }
        if (source.SignAlgorithm != null) {
            this.SignAlgorithm = new String(source.SignAlgorithm);
        }
        if (source.CertSn != null) {
            this.CertSn = new String(source.CertSn);
        }
        if (source.CertNotBefore != null) {
            this.CertNotBefore = new Long(source.CertNotBefore);
        }
        if (source.CertNotAfter != null) {
            this.CertNotAfter = new Long(source.CertNotAfter);
        }
        if (source.ComponentPosX != null) {
            this.ComponentPosX = new Float(source.ComponentPosX);
        }
        if (source.ComponentPosY != null) {
            this.ComponentPosY = new Float(source.ComponentPosY);
        }
        if (source.ComponentWidth != null) {
            this.ComponentWidth = new Float(source.ComponentWidth);
        }
        if (source.ComponentHeight != null) {
            this.ComponentHeight = new Float(source.ComponentHeight);
        }
        if (source.ComponentPage != null) {
            this.ComponentPage = new Long(source.ComponentPage);
        }
        if (source.CertProvider != null) {
            this.CertProvider = new String(source.CertProvider);
        }
        if (source.IsTimestampTrust != null) {
            this.IsTimestampTrust = new Boolean(source.IsTimestampTrust);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "SignPlatform", this.SignPlatform);
        this.setParamSimple(map, prefix + "SignerName", this.SignerName);
        this.setParamSimple(map, prefix + "SignTime", this.SignTime);
        this.setParamSimple(map, prefix + "SignAlgorithm", this.SignAlgorithm);
        this.setParamSimple(map, prefix + "CertSn", this.CertSn);
        this.setParamSimple(map, prefix + "CertNotBefore", this.CertNotBefore);
        this.setParamSimple(map, prefix + "CertNotAfter", this.CertNotAfter);
        this.setParamSimple(map, prefix + "ComponentPosX", this.ComponentPosX);
        this.setParamSimple(map, prefix + "ComponentPosY", this.ComponentPosY);
        this.setParamSimple(map, prefix + "ComponentWidth", this.ComponentWidth);
        this.setParamSimple(map, prefix + "ComponentHeight", this.ComponentHeight);
        this.setParamSimple(map, prefix + "ComponentPage", this.ComponentPage);
        this.setParamSimple(map, prefix + "CertProvider", this.CertProvider);
        this.setParamSimple(map, prefix + "IsTimestampTrust", this.IsTimestampTrust);

    }
}

