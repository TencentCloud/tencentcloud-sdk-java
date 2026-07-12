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

public class IdCardOCRVerificationResponse extends AbstractModel {

    /**
    * <p>认证结果码，收费情况如下。</p><ul><li>收费结果码：<br>0: 姓名和身份证号一致。<br>-1: 姓名和身份证号不一致。</li><li>不收费结果码：<br>-2: 非法身份证号（长度、校验位等不正确）。<br>-3: 非法姓名（长度、格式等不正确）。<br>-4: 证件库服务异常。<br>-5: 证件库中无此身份证记录。<br>-6: 权威比对系统升级中，请稍后再试。<br>-7: 认证次数超过当日限制。</li></ul>
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
    * <p>用于验证的姓名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用于验证的身份证号。</p>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>OCR得到的性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>OCR得到的民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>OCR得到的生日。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * <p>OCR得到的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>身份证头像照片的base64编码</p>
    */
    @SerializedName("Portrait")
    @Expose
    private String Portrait;

    /**
    * <p>告警信息。</p><ul><li>Code 告警码列表和释义：<br>  &#39;-9101&#39;：身份证边框不完整告警。<br>  &#39;-9102&#39;：身份证复印件告警。<br>  &#39;-9103&#39;：身份证翻拍告警。<br>  &#39;-9105&#39;：身份证框内遮挡告警。&#39;<br>  &#39;-9104&#39;：临时身份证告警。<br>  &#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>  &#39;-9107&#39;：身份证反光告警。<br>  &#39;-9108&#39;：身份证复印件告警（仅黑白复印件）。<br>  &#39;-9109&#39;：身份证有效日期不合法告警。<br>  &#39;-8001&#39;：图片模糊告警。</li><li>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</li></ul>
    */
    @SerializedName("Warnings")
    @Expose
    private String Warnings;

    /**
    * <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li><ul><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul></li></ul>
    */
    @SerializedName("Quality")
    @Expose
    private Float Quality;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>认证结果码，收费情况如下。</p><ul><li>收费结果码：<br>0: 姓名和身份证号一致。<br>-1: 姓名和身份证号不一致。</li><li>不收费结果码：<br>-2: 非法身份证号（长度、校验位等不正确）。<br>-3: 非法姓名（长度、格式等不正确）。<br>-4: 证件库服务异常。<br>-5: 证件库中无此身份证记录。<br>-6: 权威比对系统升级中，请稍后再试。<br>-7: 认证次数超过当日限制。</li></ul> 
     * @return Result <p>认证结果码，收费情况如下。</p><ul><li>收费结果码：<br>0: 姓名和身份证号一致。<br>-1: 姓名和身份证号不一致。</li><li>不收费结果码：<br>-2: 非法身份证号（长度、校验位等不正确）。<br>-3: 非法姓名（长度、格式等不正确）。<br>-4: 证件库服务异常。<br>-5: 证件库中无此身份证记录。<br>-6: 权威比对系统升级中，请稍后再试。<br>-7: 认证次数超过当日限制。</li></ul>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>认证结果码，收费情况如下。</p><ul><li>收费结果码：<br>0: 姓名和身份证号一致。<br>-1: 姓名和身份证号不一致。</li><li>不收费结果码：<br>-2: 非法身份证号（长度、校验位等不正确）。<br>-3: 非法姓名（长度、格式等不正确）。<br>-4: 证件库服务异常。<br>-5: 证件库中无此身份证记录。<br>-6: 权威比对系统升级中，请稍后再试。<br>-7: 认证次数超过当日限制。</li></ul>
     * @param Result <p>认证结果码，收费情况如下。</p><ul><li>收费结果码：<br>0: 姓名和身份证号一致。<br>-1: 姓名和身份证号不一致。</li><li>不收费结果码：<br>-2: 非法身份证号（长度、校验位等不正确）。<br>-3: 非法姓名（长度、格式等不正确）。<br>-4: 证件库服务异常。<br>-5: 证件库中无此身份证记录。<br>-6: 权威比对系统升级中，请稍后再试。<br>-7: 认证次数超过当日限制。</li></ul>
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
     * Get <p>用于验证的姓名。</p> 
     * @return Name <p>用于验证的姓名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>用于验证的姓名。</p>
     * @param Name <p>用于验证的姓名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用于验证的身份证号。</p> 
     * @return IdCard <p>用于验证的身份证号。</p>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>用于验证的身份证号。</p>
     * @param IdCard <p>用于验证的身份证号。</p>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>OCR得到的性别。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex <p>OCR得到的性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>OCR得到的性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex <p>OCR得到的性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>OCR得到的民族。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nation <p>OCR得到的民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>OCR得到的民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nation <p>OCR得到的民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>OCR得到的生日。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birth <p>OCR得到的生日。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set <p>OCR得到的生日。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birth <p>OCR得到的生日。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get <p>OCR得到的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address <p>OCR得到的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>OCR得到的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address <p>OCR得到的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>身份证头像照片的base64编码</p> 
     * @return Portrait <p>身份证头像照片的base64编码</p>
     */
    public String getPortrait() {
        return this.Portrait;
    }

    /**
     * Set <p>身份证头像照片的base64编码</p>
     * @param Portrait <p>身份证头像照片的base64编码</p>
     */
    public void setPortrait(String Portrait) {
        this.Portrait = Portrait;
    }

    /**
     * Get <p>告警信息。</p><ul><li>Code 告警码列表和释义：<br>  &#39;-9101&#39;：身份证边框不完整告警。<br>  &#39;-9102&#39;：身份证复印件告警。<br>  &#39;-9103&#39;：身份证翻拍告警。<br>  &#39;-9105&#39;：身份证框内遮挡告警。&#39;<br>  &#39;-9104&#39;：临时身份证告警。<br>  &#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>  &#39;-9107&#39;：身份证反光告警。<br>  &#39;-9108&#39;：身份证复印件告警（仅黑白复印件）。<br>  &#39;-9109&#39;：身份证有效日期不合法告警。<br>  &#39;-8001&#39;：图片模糊告警。</li><li>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</li></ul> 
     * @return Warnings <p>告警信息。</p><ul><li>Code 告警码列表和释义：<br>  &#39;-9101&#39;：身份证边框不完整告警。<br>  &#39;-9102&#39;：身份证复印件告警。<br>  &#39;-9103&#39;：身份证翻拍告警。<br>  &#39;-9105&#39;：身份证框内遮挡告警。&#39;<br>  &#39;-9104&#39;：临时身份证告警。<br>  &#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>  &#39;-9107&#39;：身份证反光告警。<br>  &#39;-9108&#39;：身份证复印件告警（仅黑白复印件）。<br>  &#39;-9109&#39;：身份证有效日期不合法告警。<br>  &#39;-8001&#39;：图片模糊告警。</li><li>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</li></ul>
     */
    public String getWarnings() {
        return this.Warnings;
    }

    /**
     * Set <p>告警信息。</p><ul><li>Code 告警码列表和释义：<br>  &#39;-9101&#39;：身份证边框不完整告警。<br>  &#39;-9102&#39;：身份证复印件告警。<br>  &#39;-9103&#39;：身份证翻拍告警。<br>  &#39;-9105&#39;：身份证框内遮挡告警。&#39;<br>  &#39;-9104&#39;：临时身份证告警。<br>  &#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>  &#39;-9107&#39;：身份证反光告警。<br>  &#39;-9108&#39;：身份证复印件告警（仅黑白复印件）。<br>  &#39;-9109&#39;：身份证有效日期不合法告警。<br>  &#39;-8001&#39;：图片模糊告警。</li><li>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</li></ul>
     * @param Warnings <p>告警信息。</p><ul><li>Code 告警码列表和释义：<br>  &#39;-9101&#39;：身份证边框不完整告警。<br>  &#39;-9102&#39;：身份证复印件告警。<br>  &#39;-9103&#39;：身份证翻拍告警。<br>  &#39;-9105&#39;：身份证框内遮挡告警。&#39;<br>  &#39;-9104&#39;：临时身份证告警。<br>  &#39;-9106&#39;：身份证 PS 告警（疑似存在PS痕迹）。<br>  &#39;-9107&#39;：身份证反光告警。<br>  &#39;-9108&#39;：身份证复印件告警（仅黑白复印件）。<br>  &#39;-9109&#39;：身份证有效日期不合法告警。<br>  &#39;-8001&#39;：图片模糊告警。</li><li>多个会用“|” 隔开，如 &quot;-9101|-9106|-9104&quot;。</li></ul>
     */
    public void setWarnings(String Warnings) {
        this.Warnings = Warnings;
    }

    /**
     * Get <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li><ul><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul></li></ul> 
     * @return Quality <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li><ul><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul></li></ul>
     */
    public Float getQuality() {
        return this.Quality;
    }

    /**
     * Set <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li><ul><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul></li></ul>
     * @param Quality <p>图片质量分数。</p><ul><li>当请求Config中配置图片模糊告警该参数才有意义。</li><li><ul><li>取值范围（0～100），目前默认阈值是50分，低于50分会触发模糊告警。</li></ul></li></ul>
     */
    public void setQuality(Float Quality) {
        this.Quality = Quality;
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

    public IdCardOCRVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdCardOCRVerificationResponse(IdCardOCRVerificationResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
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
        if (source.Portrait != null) {
            this.Portrait = new String(source.Portrait);
        }
        if (source.Warnings != null) {
            this.Warnings = new String(source.Warnings);
        }
        if (source.Quality != null) {
            this.Quality = new Float(source.Quality);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Portrait", this.Portrait);
        this.setParamSimple(map, prefix + "Warnings", this.Warnings);
        this.setParamSimple(map, prefix + "Quality", this.Quality);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

