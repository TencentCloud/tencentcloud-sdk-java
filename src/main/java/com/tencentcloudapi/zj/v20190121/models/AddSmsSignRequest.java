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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSmsSignRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司（0，1，2，3）。
1：APP（0，1，2，3，4） 。
2：网站（0，1，2，3，5）。
3：公众号或者小程序（0，1，2，3，6）。
4：商标（7）。
5：政府/机关事业单位/其他机构（2，3）。
注：必须按照对应关系选择证明类型，否则会审核失败。
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
5：网站备案后台截图（个人开发网站）。
6：小程序设置页面截图（个人认证小程序）。
7：商标注册书
    */
    @SerializedName("DocumentType")
    @Expose
    private Long DocumentType;

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 资质图片url
    */
    @SerializedName("ProofImage")
    @Expose
    private String ProofImage;

    /**
    * 签名内容
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 签名备注，比如申请原因，使用场景等,可以填空
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司（0，1，2，3）。
1：APP（0，1，2，3，4） 。
2：网站（0，1，2，3，5）。
3：公众号或者小程序（0，1，2，3，6）。
4：商标（7）。
5：政府/机关事业单位/其他机构（2，3）。
注：必须按照对应关系选择证明类型，否则会审核失败。 
     * @return SignType 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司（0，1，2，3）。
1：APP（0，1，2，3，4） 。
2：网站（0，1，2，3，5）。
3：公众号或者小程序（0，1，2，3，6）。
4：商标（7）。
5：政府/机关事业单位/其他机构（2，3）。
注：必须按照对应关系选择证明类型，否则会审核失败。
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司（0，1，2，3）。
1：APP（0，1，2，3，4） 。
2：网站（0，1，2，3，5）。
3：公众号或者小程序（0，1，2，3，6）。
4：商标（7）。
5：政府/机关事业单位/其他机构（2，3）。
注：必须按照对应关系选择证明类型，否则会审核失败。
     * @param SignType 签名类型。其中每种类型后面标注了其可选的 DocumentType（证明类型）：
0：公司（0，1，2，3）。
1：APP（0，1，2，3，4） 。
2：网站（0，1，2，3，5）。
3：公众号或者小程序（0，1，2，3，6）。
4：商标（7）。
5：政府/机关事业单位/其他机构（2，3）。
注：必须按照对应关系选择证明类型，否则会审核失败。
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
5：网站备案后台截图（个人开发网站）。
6：小程序设置页面截图（个人认证小程序）。
7：商标注册书 
     * @return DocumentType 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
5：网站备案后台截图（个人开发网站）。
6：小程序设置页面截图（个人认证小程序）。
7：商标注册书
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
5：网站备案后台截图（个人开发网站）。
6：小程序设置页面截图（个人认证小程序）。
7：商标注册书
     * @param DocumentType 证明类型：
0：三证合一。
1：企业营业执照。
2：组织机构代码证书。
3：社会信用代码证书。
4：应用后台管理截图（个人开发APP）。
5：网站备案后台截图（个人开发网站）。
6：小程序设置页面截图（个人认证小程序）。
7：商标注册书
     */
    public void setDocumentType(Long DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 资质图片url 
     * @return ProofImage 资质图片url
     */
    public String getProofImage() {
        return this.ProofImage;
    }

    /**
     * Set 资质图片url
     * @param ProofImage 资质图片url
     */
    public void setProofImage(String ProofImage) {
        this.ProofImage = ProofImage;
    }

    /**
     * Get 签名内容 
     * @return SignName 签名内容
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 签名内容
     * @param SignName 签名内容
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get 签名备注，比如申请原因，使用场景等,可以填空 
     * @return Remark 签名备注，比如申请原因，使用场景等,可以填空
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 签名备注，比如申请原因，使用场景等,可以填空
     * @param Remark 签名备注，比如申请原因，使用场景等,可以填空
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AddSmsSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSmsSignRequest(AddSmsSignRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
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
        if (source.ProofImage != null) {
            this.ProofImage = new String(source.ProofImage);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "ProofImage", this.ProofImage);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

