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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PdfVerifyResult extends AbstractModel {

    /**
    * 验签结果详情，每个签名域对应的验签结果。状态值如下
<ul><li> **1** :验签成功，在电子签签署</li>
<li> **2** :验签成功，在其他平台签署</li>
<li> **3** :验签失败</li>
<li> **4** :pdf文件没有签名域</li>
<li> **5** :文件签名格式错误</li></ul>
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * 签署平台
如果文件是在腾讯电子签平台签署，则为**腾讯电子签**，
如果文件不在腾讯电子签平台签署，则为**其他平台**。
    */
    @SerializedName("SignPlatform")
    @Expose
    private String SignPlatform;

    /**
    * 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@平台生成的数字编码
**个人**: ESS@个人姓名@证件号@平台生成的数字编码

如果在其他平台签署的, 主体的名字参考其他平台的说明
    */
    @SerializedName("SignerName")
    @Expose
    private String SignerName;

    /**
    * 签署时间的Unix时间戳，单位毫秒
    */
    @SerializedName("SignTime")
    @Expose
    private Long SignTime;

    /**
    * 证书签名算法,  如SHA1withRSA等算法
    */
    @SerializedName("SignAlgorithm")
    @Expose
    private String SignAlgorithm;

    /**
    * CA供应商下发给用户的证书编号

注意：`腾讯电子签接入多家CA供应商以提供容灾能力，不同CA下发的证书编号区别较大，但基本都是由数字和字母组成，长度在200以下`。
    */
    @SerializedName("CertSn")
    @Expose
    private String CertSn;

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
    * 签名类型, 保留字段, 现在全部为0


    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * 签名域横坐标，单位px
    */
    @SerializedName("ComponentPosX")
    @Expose
    private Float ComponentPosX;

    /**
    * 签名域纵坐标，单位px
    */
    @SerializedName("ComponentPosY")
    @Expose
    private Float ComponentPosY;

    /**
    * 签名域宽度，单位px
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

    /**
    * 签名域高度，单位px
    */
    @SerializedName("ComponentHeight")
    @Expose
    private Float ComponentHeight;

    /**
    * 签名域所在页码，1～N
    */
    @SerializedName("ComponentPage")
    @Expose
    private Long ComponentPage;

    /**
     * Get 验签结果详情，每个签名域对应的验签结果。状态值如下
<ul><li> **1** :验签成功，在电子签签署</li>
<li> **2** :验签成功，在其他平台签署</li>
<li> **3** :验签失败</li>
<li> **4** :pdf文件没有签名域</li>
<li> **5** :文件签名格式错误</li></ul> 
     * @return VerifyResult 验签结果详情，每个签名域对应的验签结果。状态值如下
<ul><li> **1** :验签成功，在电子签签署</li>
<li> **2** :验签成功，在其他平台签署</li>
<li> **3** :验签失败</li>
<li> **4** :pdf文件没有签名域</li>
<li> **5** :文件签名格式错误</li></ul>
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 验签结果详情，每个签名域对应的验签结果。状态值如下
<ul><li> **1** :验签成功，在电子签签署</li>
<li> **2** :验签成功，在其他平台签署</li>
<li> **3** :验签失败</li>
<li> **4** :pdf文件没有签名域</li>
<li> **5** :文件签名格式错误</li></ul>
     * @param VerifyResult 验签结果详情，每个签名域对应的验签结果。状态值如下
<ul><li> **1** :验签成功，在电子签签署</li>
<li> **2** :验签成功，在其他平台签署</li>
<li> **3** :验签失败</li>
<li> **4** :pdf文件没有签名域</li>
<li> **5** :文件签名格式错误</li></ul>
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 签署平台
如果文件是在腾讯电子签平台签署，则为**腾讯电子签**，
如果文件不在腾讯电子签平台签署，则为**其他平台**。 
     * @return SignPlatform 签署平台
如果文件是在腾讯电子签平台签署，则为**腾讯电子签**，
如果文件不在腾讯电子签平台签署，则为**其他平台**。
     */
    public String getSignPlatform() {
        return this.SignPlatform;
    }

    /**
     * Set 签署平台
如果文件是在腾讯电子签平台签署，则为**腾讯电子签**，
如果文件不在腾讯电子签平台签署，则为**其他平台**。
     * @param SignPlatform 签署平台
如果文件是在腾讯电子签平台签署，则为**腾讯电子签**，
如果文件不在腾讯电子签平台签署，则为**其他平台**。
     */
    public void setSignPlatform(String SignPlatform) {
        this.SignPlatform = SignPlatform;
    }

    /**
     * Get 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@平台生成的数字编码
**个人**: ESS@个人姓名@证件号@平台生成的数字编码

如果在其他平台签署的, 主体的名字参考其他平台的说明 
     * @return SignerName 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@平台生成的数字编码
**个人**: ESS@个人姓名@证件号@平台生成的数字编码

如果在其他平台签署的, 主体的名字参考其他平台的说明
     */
    public String getSignerName() {
        return this.SignerName;
    }

    /**
     * Set 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@平台生成的数字编码
**个人**: ESS@个人姓名@证件号@平台生成的数字编码

如果在其他平台签署的, 主体的名字参考其他平台的说明
     * @param SignerName 申请证书的主体的名字

如果是在腾讯电子签平台签署, 则对应的主体的名字个数如下
**企业**:  ESS@企业名称@平台生成的数字编码
**个人**: ESS@个人姓名@证件号@平台生成的数字编码

如果在其他平台签署的, 主体的名字参考其他平台的说明
     */
    public void setSignerName(String SignerName) {
        this.SignerName = SignerName;
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
     * Get 证书签名算法,  如SHA1withRSA等算法 
     * @return SignAlgorithm 证书签名算法,  如SHA1withRSA等算法
     */
    public String getSignAlgorithm() {
        return this.SignAlgorithm;
    }

    /**
     * Set 证书签名算法,  如SHA1withRSA等算法
     * @param SignAlgorithm 证书签名算法,  如SHA1withRSA等算法
     */
    public void setSignAlgorithm(String SignAlgorithm) {
        this.SignAlgorithm = SignAlgorithm;
    }

    /**
     * Get CA供应商下发给用户的证书编号

注意：`腾讯电子签接入多家CA供应商以提供容灾能力，不同CA下发的证书编号区别较大，但基本都是由数字和字母组成，长度在200以下`。 
     * @return CertSn CA供应商下发给用户的证书编号

注意：`腾讯电子签接入多家CA供应商以提供容灾能力，不同CA下发的证书编号区别较大，但基本都是由数字和字母组成，长度在200以下`。
     */
    public String getCertSn() {
        return this.CertSn;
    }

    /**
     * Set CA供应商下发给用户的证书编号

注意：`腾讯电子签接入多家CA供应商以提供容灾能力，不同CA下发的证书编号区别较大，但基本都是由数字和字母组成，长度在200以下`。
     * @param CertSn CA供应商下发给用户的证书编号

注意：`腾讯电子签接入多家CA供应商以提供容灾能力，不同CA下发的证书编号区别较大，但基本都是由数字和字母组成，长度在200以下`。
     */
    public void setCertSn(String CertSn) {
        this.CertSn = CertSn;
    }

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
     * Get 签名类型, 保留字段, 现在全部为0

 
     * @return SignType 签名类型, 保留字段, 现在全部为0


     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set 签名类型, 保留字段, 现在全部为0


     * @param SignType 签名类型, 保留字段, 现在全部为0


     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get 签名域横坐标，单位px 
     * @return ComponentPosX 签名域横坐标，单位px
     */
    public Float getComponentPosX() {
        return this.ComponentPosX;
    }

    /**
     * Set 签名域横坐标，单位px
     * @param ComponentPosX 签名域横坐标，单位px
     */
    public void setComponentPosX(Float ComponentPosX) {
        this.ComponentPosX = ComponentPosX;
    }

    /**
     * Get 签名域纵坐标，单位px 
     * @return ComponentPosY 签名域纵坐标，单位px
     */
    public Float getComponentPosY() {
        return this.ComponentPosY;
    }

    /**
     * Set 签名域纵坐标，单位px
     * @param ComponentPosY 签名域纵坐标，单位px
     */
    public void setComponentPosY(Float ComponentPosY) {
        this.ComponentPosY = ComponentPosY;
    }

    /**
     * Get 签名域宽度，单位px 
     * @return ComponentWidth 签名域宽度，单位px
     */
    public Float getComponentWidth() {
        return this.ComponentWidth;
    }

    /**
     * Set 签名域宽度，单位px
     * @param ComponentWidth 签名域宽度，单位px
     */
    public void setComponentWidth(Float ComponentWidth) {
        this.ComponentWidth = ComponentWidth;
    }

    /**
     * Get 签名域高度，单位px 
     * @return ComponentHeight 签名域高度，单位px
     */
    public Float getComponentHeight() {
        return this.ComponentHeight;
    }

    /**
     * Set 签名域高度，单位px
     * @param ComponentHeight 签名域高度，单位px
     */
    public void setComponentHeight(Float ComponentHeight) {
        this.ComponentHeight = ComponentHeight;
    }

    /**
     * Get 签名域所在页码，1～N 
     * @return ComponentPage 签名域所在页码，1～N
     */
    public Long getComponentPage() {
        return this.ComponentPage;
    }

    /**
     * Set 签名域所在页码，1～N
     * @param ComponentPage 签名域所在页码，1～N
     */
    public void setComponentPage(Long ComponentPage) {
        this.ComponentPage = ComponentPage;
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
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
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
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "ComponentPosX", this.ComponentPosX);
        this.setParamSimple(map, prefix + "ComponentPosY", this.ComponentPosY);
        this.setParamSimple(map, prefix + "ComponentWidth", this.ComponentWidth);
        this.setParamSimple(map, prefix + "ComponentHeight", this.ComponentHeight);
        this.setParamSimple(map, prefix + "ComponentPage", this.ComponentPage);

    }
}

