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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeEncryptedIDCardOCRResponse extends AbstractModel {

    /**
    * 姓名（人像面）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别（人像面）
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 民族（人像面）
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 出生日期（人像面）
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * 地址（人像面）
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 身份证号（人像面）
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * 发证机关（国徽面）
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * 证件有效期（国徽面）
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 扩展信息，不请求则不返回，具体输入参考示例3和示例4。
IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；
Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；

Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;
BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;

WarnInfos，告警信息，Code 告警码列表和释义：
-9100 身份证有效日期不合法告警，
-9101 身份证边框不完整告警，

-9102 身份证复印件告警（黑白及彩色复印件）,
-9108 身份证复印件告警（仅黑白复印件），

-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证疑似存在PS痕迹告警，
-9107 身份证反光告警。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 反光点覆盖区域详情结果，具体内容请点击左侧链接
    */
    @SerializedName("ReflectDetailInfos")
    @Expose
    private ReflectDetailInfo [] ReflectDetailInfos;

    /**
    * 加密后的数据（Base64编码）
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
    * 敏感数据加密信息
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 姓名（人像面） 
     * @return Name 姓名（人像面）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名（人像面）
     * @param Name 姓名（人像面）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 性别（人像面） 
     * @return Sex 性别（人像面）
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别（人像面）
     * @param Sex 性别（人像面）
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 民族（人像面） 
     * @return Nation 民族（人像面）
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 民族（人像面）
     * @param Nation 民族（人像面）
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 出生日期（人像面） 
     * @return Birth 出生日期（人像面）
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set 出生日期（人像面）
     * @param Birth 出生日期（人像面）
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get 地址（人像面） 
     * @return Address 地址（人像面）
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址（人像面）
     * @param Address 地址（人像面）
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 身份证号（人像面） 
     * @return IdNum 身份证号（人像面）
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 身份证号（人像面）
     * @param IdNum 身份证号（人像面）
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 发证机关（国徽面） 
     * @return Authority 发证机关（国徽面）
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set 发证机关（国徽面）
     * @param Authority 发证机关（国徽面）
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get 证件有效期（国徽面） 
     * @return ValidDate 证件有效期（国徽面）
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 证件有效期（国徽面）
     * @param ValidDate 证件有效期（国徽面）
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 扩展信息，不请求则不返回，具体输入参考示例3和示例4。
IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；
Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；

Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;
BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;

WarnInfos，告警信息，Code 告警码列表和释义：
-9100 身份证有效日期不合法告警，
-9101 身份证边框不完整告警，

-9102 身份证复印件告警（黑白及彩色复印件）,
-9108 身份证复印件告警（仅黑白复印件），

-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证疑似存在PS痕迹告警，
-9107 身份证反光告警。 
     * @return AdvancedInfo 扩展信息，不请求则不返回，具体输入参考示例3和示例4。
IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；
Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；

Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;
BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;

WarnInfos，告警信息，Code 告警码列表和释义：
-9100 身份证有效日期不合法告警，
-9101 身份证边框不完整告警，

-9102 身份证复印件告警（黑白及彩色复印件）,
-9108 身份证复印件告警（仅黑白复印件），

-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证疑似存在PS痕迹告警，
-9107 身份证反光告警。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 扩展信息，不请求则不返回，具体输入参考示例3和示例4。
IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；
Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；

Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;
BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;

WarnInfos，告警信息，Code 告警码列表和释义：
-9100 身份证有效日期不合法告警，
-9101 身份证边框不完整告警，

-9102 身份证复印件告警（黑白及彩色复印件）,
-9108 身份证复印件告警（仅黑白复印件），

-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证疑似存在PS痕迹告警，
-9107 身份证反光告警。
     * @param AdvancedInfo 扩展信息，不请求则不返回，具体输入参考示例3和示例4。
IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；
Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；

Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;
BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;

WarnInfos，告警信息，Code 告警码列表和释义：
-9100 身份证有效日期不合法告警，
-9101 身份证边框不完整告警，

-9102 身份证复印件告警（黑白及彩色复印件）,
-9108 身份证复印件告警（仅黑白复印件），

-9103 身份证翻拍告警，
-9105 身份证框内遮挡告警，
-9104 临时身份证告警，
-9106 身份证疑似存在PS痕迹告警，
-9107 身份证反光告警。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 反光点覆盖区域详情结果，具体内容请点击左侧链接 
     * @return ReflectDetailInfos 反光点覆盖区域详情结果，具体内容请点击左侧链接
     */
    public ReflectDetailInfo [] getReflectDetailInfos() {
        return this.ReflectDetailInfos;
    }

    /**
     * Set 反光点覆盖区域详情结果，具体内容请点击左侧链接
     * @param ReflectDetailInfos 反光点覆盖区域详情结果，具体内容请点击左侧链接
     */
    public void setReflectDetailInfos(ReflectDetailInfo [] ReflectDetailInfos) {
        this.ReflectDetailInfos = ReflectDetailInfos;
    }

    /**
     * Get 加密后的数据（Base64编码） 
     * @return EncryptedBody 加密后的数据（Base64编码）
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set 加密后的数据（Base64编码）
     * @param EncryptedBody 加密后的数据（Base64编码）
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    /**
     * Get 敏感数据加密信息 
     * @return Encryption 敏感数据加密信息
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息
     * @param Encryption 敏感数据加密信息
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
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

    public RecognizeEncryptedIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeEncryptedIDCardOCRResponse(RecognizeEncryptedIDCardOCRResponse source) {
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
        if (source.Authority != null) {
            this.Authority = new String(source.Authority);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.ReflectDetailInfos != null) {
            this.ReflectDetailInfos = new ReflectDetailInfo[source.ReflectDetailInfos.length];
            for (int i = 0; i < source.ReflectDetailInfos.length; i++) {
                this.ReflectDetailInfos[i] = new ReflectDetailInfo(source.ReflectDetailInfos[i]);
            }
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamArrayObj(map, prefix + "ReflectDetailInfos.", this.ReflectDetailInfos);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

