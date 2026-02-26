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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIdCardInformationResponse extends AbstractModel {

    /**
    * <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * <p>业务错误码。- 成功情况返回Success。- 错误情况请参考下方错误码 列表中FailedOperation部分</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>业务结果描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>姓名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>性别。</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>民族。</p>
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>出生日期。</p>
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * <p>地址。</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>身份证号。</p>
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * <p>身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。</p>
    */
    @SerializedName("Portrait")
    @Expose
    private String Portrait;

    /**
    * <p>告警信息。</p><ul><li><p>当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息。</p></li><li><p>Code 告警码列表和释义：<br>&#39;-9101&#39;：身份证边框不完整告警。<br>&#39;-9102&#39;：身份证复印件告警。<br>&#39;-9103&#39;：身份证翻拍告警。<br>&#39;-9105&#39;：身份证框内遮挡告警。<br>&#39;-9104&#39;：临时身份证告警。<br>&#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>&#39;-8001&#39;：图片模糊告警。</p></li><li><p>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</p></li></ul>
    */
    @SerializedName("Warnings")
    @Expose
    private String Warnings;

    /**
    * <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul>
    */
    @SerializedName("Quality")
    @Expose
    private Float Quality;

    /**
    * <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>加密后的数据。</p>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p> 
     * @return Sim <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
     * @param Sim <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get <p>业务错误码。- 成功情况返回Success。- 错误情况请参考下方错误码 列表中FailedOperation部分</p> 
     * @return Result <p>业务错误码。- 成功情况返回Success。- 错误情况请参考下方错误码 列表中FailedOperation部分</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>业务错误码。- 成功情况返回Success。- 错误情况请参考下方错误码 列表中FailedOperation部分</p>
     * @param Result <p>业务错误码。- 成功情况返回Success。- 错误情况请参考下方错误码 列表中FailedOperation部分</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>业务结果描述。</p> 
     * @return Description <p>业务结果描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>业务结果描述。</p>
     * @param Description <p>业务结果描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>姓名。</p> 
     * @return Name <p>姓名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p>
     * @param Name <p>姓名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>性别。</p> 
     * @return Sex <p>性别。</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别。</p>
     * @param Sex <p>性别。</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>民族。</p> 
     * @return Nation <p>民族。</p>
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>民族。</p>
     * @param Nation <p>民族。</p>
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>出生日期。</p> 
     * @return Birth <p>出生日期。</p>
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set <p>出生日期。</p>
     * @param Birth <p>出生日期。</p>
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get <p>地址。</p> 
     * @return Address <p>地址。</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址。</p>
     * @param Address <p>地址。</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>身份证号。</p> 
     * @return IdNum <p>身份证号。</p>
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set <p>身份证号。</p>
     * @param IdNum <p>身份证号。</p>
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get <p>身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。</p> 
     * @return Portrait <p>身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。</p>
     */
    public String getPortrait() {
        return this.Portrait;
    }

    /**
     * Set <p>身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。</p>
     * @param Portrait <p>身份证头像照片的base64编码，如果抠图失败会拿整张身份证做比对并返回空。</p>
     */
    public void setPortrait(String Portrait) {
        this.Portrait = Portrait;
    }

    /**
     * Get <p>告警信息。</p><ul><li><p>当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息。</p></li><li><p>Code 告警码列表和释义：<br>&#39;-9101&#39;：身份证边框不完整告警。<br>&#39;-9102&#39;：身份证复印件告警。<br>&#39;-9103&#39;：身份证翻拍告警。<br>&#39;-9105&#39;：身份证框内遮挡告警。<br>&#39;-9104&#39;：临时身份证告警。<br>&#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>&#39;-8001&#39;：图片模糊告警。</p></li><li><p>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</p></li></ul> 
     * @return Warnings <p>告警信息。</p><ul><li><p>当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息。</p></li><li><p>Code 告警码列表和释义：<br>&#39;-9101&#39;：身份证边框不完整告警。<br>&#39;-9102&#39;：身份证复印件告警。<br>&#39;-9103&#39;：身份证翻拍告警。<br>&#39;-9105&#39;：身份证框内遮挡告警。<br>&#39;-9104&#39;：临时身份证告警。<br>&#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>&#39;-8001&#39;：图片模糊告警。</p></li><li><p>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</p></li></ul>
     */
    public String getWarnings() {
        return this.Warnings;
    }

    /**
     * Set <p>告警信息。</p><ul><li><p>当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息。</p></li><li><p>Code 告警码列表和释义：<br>&#39;-9101&#39;：身份证边框不完整告警。<br>&#39;-9102&#39;：身份证复印件告警。<br>&#39;-9103&#39;：身份证翻拍告警。<br>&#39;-9105&#39;：身份证框内遮挡告警。<br>&#39;-9104&#39;：临时身份证告警。<br>&#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>&#39;-8001&#39;：图片模糊告警。</p></li><li><p>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</p></li></ul>
     * @param Warnings <p>告警信息。</p><ul><li><p>当在Config中配置了告警信息会停止人像比对，Result返回错误（FailedOperation.OcrWarningOccurred）并有此告警信息。</p></li><li><p>Code 告警码列表和释义：<br>&#39;-9101&#39;：身份证边框不完整告警。<br>&#39;-9102&#39;：身份证复印件告警。<br>&#39;-9103&#39;：身份证翻拍告警。<br>&#39;-9105&#39;：身份证框内遮挡告警。<br>&#39;-9104&#39;：临时身份证告警。<br>&#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>&#39;-8001&#39;：图片模糊告警。</p></li><li><p>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</p></li></ul>
     */
    public void setWarnings(String Warnings) {
        this.Warnings = Warnings;
    }

    /**
     * Get <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul> 
     * @return Quality <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul>
     */
    public Float getQuality() {
        return this.Quality;
    }

    /**
     * Set <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul>
     * @param Quality <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul>
     */
    public void setQuality(Float Quality) {
        this.Quality = Quality;
    }

    /**
     * Get <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encryption <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encryption <p>敏感数据加密信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>加密后的数据。</p> 
     * @return EncryptedBody <p>加密后的数据。</p>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>加密后的数据。</p>
     * @param EncryptedBody <p>加密后的数据。</p>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckIdCardInformationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdCardInformationResponse(CheckIdCardInformationResponse source) {
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Birth != null) {
            this.Birth = new String(source.Birth);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Portrait != null) {
            this.Portrait = new String(source.Portrait);
        }
        if (source.Warnings != null) {
            this.Warnings = new String(source.Warnings);
        }
        if (source.Quality != null) {
            this.Quality = new Float(source.Quality);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Portrait", this.Portrait);
        this.setParamSimple(map, prefix + "Warnings", this.Warnings);
        this.setParamSimple(map, prefix + "Quality", this.Quality);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

