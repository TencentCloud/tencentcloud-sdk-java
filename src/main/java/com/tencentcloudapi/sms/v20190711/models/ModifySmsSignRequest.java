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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySmsSignRequest extends AbstractModel {

    /**
    * 待修改的签名 ID。
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
    * 签名名称。
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司，可选 DocumentType 有（0，1）。
1：APP，可选 DocumentType 有（0，1，2，3，4） 。
4：商标，可选 DocumentType 有（7）。
5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。
注1：必须按照对应关系选择证明类型，否则会审核失败。
注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
7：商标注册书。
注：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
    */
    @SerializedName("DocumentType")
    @Expose
    private Long DocumentType;

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
注：需要和待修改签名International值保持一致，该参数不能直接修改国内签名到国际签名。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 签名用途：
0：自用。
1：他用。
    */
    @SerializedName("UsedMethod")
    @Expose
    private Long UsedMethod;

    /**
    * 签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
    */
    @SerializedName("ProofImage")
    @Expose
    private String ProofImage;

    /**
    * 委托授权证明。选择 UsedMethod 为他用之后需要提交委托的授权证明。
图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
注：只有 UsedMethod 在选择为 1（他用）时，这个字段才会生效。
    */
    @SerializedName("CommissionImage")
    @Expose
    private String CommissionImage;

    /**
    * 签名的申请备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。<dx-alert infotype="notice" title="说明"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></dx-alert>
    */
    @SerializedName("QualificationId")
    @Expose
    private Long QualificationId;

    /**
     * Get 待修改的签名 ID。 
     * @return SignId 待修改的签名 ID。
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set 待修改的签名 ID。
     * @param SignId 待修改的签名 ID。
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签名名称。 
     * @return SignName 签名名称。
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 签名名称。
     * @param SignName 签名名称。
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司，可选 DocumentType 有（0，1）。
1：APP，可选 DocumentType 有（0，1，2，3，4） 。
4：商标，可选 DocumentType 有（7）。
5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。
注1：必须按照对应关系选择证明类型，否则会审核失败。
注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。 
     * @return SignType 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司，可选 DocumentType 有（0，1）。
1：APP，可选 DocumentType 有（0，1，2，3，4） 。
4：商标，可选 DocumentType 有（7）。
5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。
注1：必须按照对应关系选择证明类型，否则会审核失败。
注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司，可选 DocumentType 有（0，1）。
1：APP，可选 DocumentType 有（0，1，2，3，4） 。
4：商标，可选 DocumentType 有（7）。
5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。
注1：必须按照对应关系选择证明类型，否则会审核失败。
注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
     * @param SignType 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司，可选 DocumentType 有（0，1）。
1：APP，可选 DocumentType 有（0，1，2，3，4） 。
4：商标，可选 DocumentType 有（7）。
5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。
注1：必须按照对应关系选择证明类型，否则会审核失败。
注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
7：商标注册书。
注：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。 
     * @return DocumentType 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
7：商标注册书。
注：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
     */
    public Long getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
7：商标注册书。
注：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
     * @param DocumentType 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
7：商标注册书。
注：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 [关于腾讯云短信签名申请规则更新的公告](https://cloud.tencent.com/document/product/382/116397)。
     */
    public void setDocumentType(Long DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
注：需要和待修改签名International值保持一致，该参数不能直接修改国内签名到国际签名。 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
注：需要和待修改签名International值保持一致，该参数不能直接修改国内签名到国际签名。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
注：需要和待修改签名International值保持一致，该参数不能直接修改国内签名到国际签名。
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
注：需要和待修改签名International值保持一致，该参数不能直接修改国内签名到国际签名。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 签名用途：
0：自用。
1：他用。 
     * @return UsedMethod 签名用途：
0：自用。
1：他用。
     */
    public Long getUsedMethod() {
        return this.UsedMethod;
    }

    /**
     * Set 签名用途：
0：自用。
1：他用。
     * @param UsedMethod 签名用途：
0：自用。
1：他用。
     */
    public void setUsedMethod(Long UsedMethod) {
        this.UsedMethod = UsedMethod;
    }

    /**
     * Get 签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。 
     * @return ProofImage 签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
     */
    public String getProofImage() {
        return this.ProofImage;
    }

    /**
     * Set 签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
     * @param ProofImage 签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
     */
    public void setProofImage(String ProofImage) {
        this.ProofImage = ProofImage;
    }

    /**
     * Get 委托授权证明。选择 UsedMethod 为他用之后需要提交委托的授权证明。
图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
注：只有 UsedMethod 在选择为 1（他用）时，这个字段才会生效。 
     * @return CommissionImage 委托授权证明。选择 UsedMethod 为他用之后需要提交委托的授权证明。
图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
注：只有 UsedMethod 在选择为 1（他用）时，这个字段才会生效。
     */
    public String getCommissionImage() {
        return this.CommissionImage;
    }

    /**
     * Set 委托授权证明。选择 UsedMethod 为他用之后需要提交委托的授权证明。
图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
注：只有 UsedMethod 在选择为 1（他用）时，这个字段才会生效。
     * @param CommissionImage 委托授权证明。选择 UsedMethod 为他用之后需要提交委托的授权证明。
图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀`data:image/jpeg;base64,`再赋值给该参数。
注：只有 UsedMethod 在选择为 1（他用）时，这个字段才会生效。
     */
    public void setCommissionImage(String CommissionImage) {
        this.CommissionImage = CommissionImage;
    }

    /**
     * Get 签名的申请备注。 
     * @return Remark 签名的申请备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 签名的申请备注。
     * @param Remark 签名的申请备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。<dx-alert infotype="notice" title="说明"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></dx-alert> 
     * @return QualificationId 已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。<dx-alert infotype="notice" title="说明"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></dx-alert>
     */
    public Long getQualificationId() {
        return this.QualificationId;
    }

    /**
     * Set 已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。<dx-alert infotype="notice" title="说明"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></dx-alert>
     * @param QualificationId 已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 [实名资质管理](https://console.cloud.tencent.com/smsv2/enterprise) 页查看。<dx-alert infotype="notice" title="说明"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></dx-alert>
     */
    public void setQualificationId(Long QualificationId) {
        this.QualificationId = QualificationId;
    }

    public ModifySmsSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmsSignRequest(ModifySmsSignRequest source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new Long(source.DocumentType);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.UsedMethod != null) {
            this.UsedMethod = new Long(source.UsedMethod);
        }
        if (source.ProofImage != null) {
            this.ProofImage = new String(source.ProofImage);
        }
        if (source.CommissionImage != null) {
            this.CommissionImage = new String(source.CommissionImage);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.QualificationId != null) {
            this.QualificationId = new Long(source.QualificationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "UsedMethod", this.UsedMethod);
        this.setParamSimple(map, prefix + "ProofImage", this.ProofImage);
        this.setParamSimple(map, prefix + "CommissionImage", this.CommissionImage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "QualificationId", this.QualificationId);

    }
}

