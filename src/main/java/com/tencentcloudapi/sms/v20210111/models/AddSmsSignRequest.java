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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSmsSignRequest extends AbstractModel {

    /**
    * <p>签名名称。<br>注：不能重复申请已通过或待审核的签名。</p>
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * <p>签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：<br>0：公司，可选 DocumentType 有（0，1）。<br>1：APP，可选 DocumentType 有（0，1，2，3，4） 。<br>4：商标，可选 DocumentType 有（7）。<br>5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。<br>注1：必须按照对应关系选择证明类型，否则会审核失败。<br>注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注3：申请国内短信签名已不再支持签名类型1（APP），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * <p>证明类型：<br>0：三证合一。<br>1：企业营业执照。<br>2：组织机构代码证书。<br>3：社会信用代码证书。<br>4：应用后台管理截图（个人开发APP）。<br>7：商标注册书。<br>注1：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注2：申请国内短信签名已不再支持证明类型4（应用后台管理截图），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
    */
    @SerializedName("DocumentType")
    @Expose
    private Long DocumentType;

    /**
    * <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * <p>签名用途：<br>0：自用。<br>1：他用。</p>
    */
    @SerializedName("SignPurpose")
    @Expose
    private Long SignPurpose;

    /**
    * <p>签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。</p>
    */
    @SerializedName("ProofImage")
    @Expose
    private String ProofImage;

    /**
    * <p>委托授权证明。选择 SignPurpose 为他用之后需要提交委托的授权证明。<br>图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。<br>注：只有 SignPurpose 在选择为 1（他用）时，这个字段才会生效。</p>
    */
    @SerializedName("CommissionImage")
    @Expose
    private String CommissionImage;

    /**
    * <p>签名的申请备注。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 <a href="https://console.cloud.tencent.com/smsv2/enterprise">实名资质管理</a> 页查看。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></div>    </div></blockquote></p>
    */
    @SerializedName("QualificationId")
    @Expose
    private Long QualificationId;

    /**
     * Get <p>签名名称。<br>注：不能重复申请已通过或待审核的签名。</p> 
     * @return SignName <p>签名名称。<br>注：不能重复申请已通过或待审核的签名。</p>
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set <p>签名名称。<br>注：不能重复申请已通过或待审核的签名。</p>
     * @param SignName <p>签名名称。<br>注：不能重复申请已通过或待审核的签名。</p>
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get <p>签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：<br>0：公司，可选 DocumentType 有（0，1）。<br>1：APP，可选 DocumentType 有（0，1，2，3，4） 。<br>4：商标，可选 DocumentType 有（7）。<br>5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。<br>注1：必须按照对应关系选择证明类型，否则会审核失败。<br>注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注3：申请国内短信签名已不再支持签名类型1（APP），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p> 
     * @return SignType <p>签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：<br>0：公司，可选 DocumentType 有（0，1）。<br>1：APP，可选 DocumentType 有（0，1，2，3，4） 。<br>4：商标，可选 DocumentType 有（7）。<br>5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。<br>注1：必须按照对应关系选择证明类型，否则会审核失败。<br>注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注3：申请国内短信签名已不再支持签名类型1（APP），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set <p>签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：<br>0：公司，可选 DocumentType 有（0，1）。<br>1：APP，可选 DocumentType 有（0，1，2，3，4） 。<br>4：商标，可选 DocumentType 有（7）。<br>5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。<br>注1：必须按照对应关系选择证明类型，否则会审核失败。<br>注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注3：申请国内短信签名已不再支持签名类型1（APP），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
     * @param SignType <p>签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：<br>0：公司，可选 DocumentType 有（0，1）。<br>1：APP，可选 DocumentType 有（0，1，2，3，4） 。<br>4：商标，可选 DocumentType 有（7）。<br>5：政府/机关事业单位/其他机构，可选 DocumentType 有（2，3）。<br>注1：必须按照对应关系选择证明类型，否则会审核失败。<br>注2：签名类型2（网站）、3（公众号）、6（小程序）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注3：申请国内短信签名已不再支持签名类型1（APP），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get <p>证明类型：<br>0：三证合一。<br>1：企业营业执照。<br>2：组织机构代码证书。<br>3：社会信用代码证书。<br>4：应用后台管理截图（个人开发APP）。<br>7：商标注册书。<br>注1：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注2：申请国内短信签名已不再支持证明类型4（应用后台管理截图），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p> 
     * @return DocumentType <p>证明类型：<br>0：三证合一。<br>1：企业营业执照。<br>2：组织机构代码证书。<br>3：社会信用代码证书。<br>4：应用后台管理截图（个人开发APP）。<br>7：商标注册书。<br>注1：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注2：申请国内短信签名已不再支持证明类型4（应用后台管理截图），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
     */
    public Long getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set <p>证明类型：<br>0：三证合一。<br>1：企业营业执照。<br>2：组织机构代码证书。<br>3：社会信用代码证书。<br>4：应用后台管理截图（个人开发APP）。<br>7：商标注册书。<br>注1：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注2：申请国内短信签名已不再支持证明类型4（应用后台管理截图），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
     * @param DocumentType <p>证明类型：<br>0：三证合一。<br>1：企业营业执照。<br>2：组织机构代码证书。<br>3：社会信用代码证书。<br>4：应用后台管理截图（个人开发APP）。<br>7：商标注册书。<br>注1：证明类型5（网站备案后台截图）、6（小程序设置页面截图）、8（公众号设置页面截图）已不再支持，具体可参考 <a href="https://cloud.tencent.com/document/product/382/116397">关于腾讯云短信签名申请规则更新的公告</a>。<br>注2：申请国内短信签名已不再支持证明类型4（应用后台管理截图），具体可参考 <a href="https://cloud.tencent.com/announce/detail/2256">关于腾讯云短信签名申请规则更新的公告</a>。</p>
     */
    public void setDocumentType(Long DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p> 
     * @return International <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
     * @param International <p>是否国际/港澳台短信：<br>0：表示国内短信。<br>1：表示国际/港澳台短信。</p>
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get <p>签名用途：<br>0：自用。<br>1：他用。</p> 
     * @return SignPurpose <p>签名用途：<br>0：自用。<br>1：他用。</p>
     */
    public Long getSignPurpose() {
        return this.SignPurpose;
    }

    /**
     * Set <p>签名用途：<br>0：自用。<br>1：他用。</p>
     * @param SignPurpose <p>签名用途：<br>0：自用。<br>1：他用。</p>
     */
    public void setSignPurpose(Long SignPurpose) {
        this.SignPurpose = SignPurpose;
    }

    /**
     * Get <p>签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。</p> 
     * @return ProofImage <p>签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。</p>
     */
    public String getProofImage() {
        return this.ProofImage;
    }

    /**
     * Set <p>签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。</p>
     * @param ProofImage <p>签名对应的资质证明图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。</p>
     */
    public void setProofImage(String ProofImage) {
        this.ProofImage = ProofImage;
    }

    /**
     * Get <p>委托授权证明。选择 SignPurpose 为他用之后需要提交委托的授权证明。<br>图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。<br>注：只有 SignPurpose 在选择为 1（他用）时，这个字段才会生效。</p> 
     * @return CommissionImage <p>委托授权证明。选择 SignPurpose 为他用之后需要提交委托的授权证明。<br>图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。<br>注：只有 SignPurpose 在选择为 1（他用）时，这个字段才会生效。</p>
     */
    public String getCommissionImage() {
        return this.CommissionImage;
    }

    /**
     * Set <p>委托授权证明。选择 SignPurpose 为他用之后需要提交委托的授权证明。<br>图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。<br>注：只有 SignPurpose 在选择为 1（他用）时，这个字段才会生效。</p>
     * @param CommissionImage <p>委托授权证明。选择 SignPurpose 为他用之后需要提交委托的授权证明。<br>图片需先进行 base64 编码格式转换，将转换后的字符串去掉前缀<code>data:image/jpeg;base64,</code>再赋值给该参数。<br>注：只有 SignPurpose 在选择为 1（他用）时，这个字段才会生效。</p>
     */
    public void setCommissionImage(String CommissionImage) {
        this.CommissionImage = CommissionImage;
    }

    /**
     * Get <p>签名的申请备注。</p> 
     * @return Remark <p>签名的申请备注。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>签名的申请备注。</p>
     * @param Remark <p>签名的申请备注。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 <a href="https://console.cloud.tencent.com/smsv2/enterprise">实名资质管理</a> 页查看。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></div>    </div></blockquote></p> 
     * @return QualificationId <p>已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 <a href="https://console.cloud.tencent.com/smsv2/enterprise">实名资质管理</a> 页查看。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></div>    </div></blockquote></p>
     */
    public Long getQualificationId() {
        return this.QualificationId;
    }

    /**
     * Set <p>已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 <a href="https://console.cloud.tencent.com/smsv2/enterprise">实名资质管理</a> 页查看。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></div>    </div></blockquote></p>
     * @param QualificationId <p>已审核通过的国内短信的资质 ID。资质 ID 信息可前往国内短信的 <a href="https://console.cloud.tencent.com/smsv2/enterprise">实名资质管理</a> 页查看。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">说明</div>        <div class="rno-document-tip-desc"><ul><li>国内短信需填写资质ID，国际短信无需填写。</li></ul></div>    </div></blockquote></p>
     */
    public void setQualificationId(Long QualificationId) {
        this.QualificationId = QualificationId;
    }

    public AddSmsSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSmsSignRequest(AddSmsSignRequest source) {
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
        if (source.SignPurpose != null) {
            this.SignPurpose = new Long(source.SignPurpose);
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
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "SignPurpose", this.SignPurpose);
        this.setParamSimple(map, prefix + "ProofImage", this.ProofImage);
        this.setParamSimple(map, prefix + "CommissionImage", this.CommissionImage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "QualificationId", this.QualificationId);

    }
}

