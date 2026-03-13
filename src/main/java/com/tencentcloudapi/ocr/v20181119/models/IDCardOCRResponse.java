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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IDCardOCRResponse extends AbstractModel {

    /**
    * <p>姓名（人像面）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>性别（人像面）</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>民族（人像面）</p>
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>出生日期（人像面）</p>
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * <p>地址（人像面）</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>身份证号（人像面）</p>
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * <p>发证机关（国徽面）</p>
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * <p>证件有效期（国徽面）</p>
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * <p>扩展信息，不请求则不返回，具体输入参考示例3和示例4。<br>IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；<br>Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；<br>Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;<br>BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;<br>WarnInfos，告警信息，Code 告警码列表和释义：<br>-9109 身份证有效日期不合法告警，<br>-9101 身份证边框不完整告警，<br>-9102 身份证复印件告警（黑白及彩色复印件）,<br>-9108 身份证复印件告警（仅黑白复印件），<br>-9103 身份证翻拍告警，<br>-9105 身份证框内遮挡告警，<br>-9104 临时身份证告警，<br>-9106 身份证疑似存在PS痕迹告警，<br>-9107 身份证反光告警，<br>-9110 电子身份证告警，<br>-9111 水印告警（仅CardWarnType参数为Advanced时）</p>
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * <p>反光点覆盖区域详情结果，具体内容请点击左侧链接</p>
    */
    @SerializedName("ReflectDetailInfos")
    @Expose
    private ReflectDetailInfo [] ReflectDetailInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>姓名（人像面）</p> 
     * @return Name <p>姓名（人像面）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名（人像面）</p>
     * @param Name <p>姓名（人像面）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>性别（人像面）</p> 
     * @return Sex <p>性别（人像面）</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别（人像面）</p>
     * @param Sex <p>性别（人像面）</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>民族（人像面）</p> 
     * @return Nation <p>民族（人像面）</p>
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>民族（人像面）</p>
     * @param Nation <p>民族（人像面）</p>
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>出生日期（人像面）</p> 
     * @return Birth <p>出生日期（人像面）</p>
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set <p>出生日期（人像面）</p>
     * @param Birth <p>出生日期（人像面）</p>
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get <p>地址（人像面）</p> 
     * @return Address <p>地址（人像面）</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址（人像面）</p>
     * @param Address <p>地址（人像面）</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>身份证号（人像面）</p> 
     * @return IdNum <p>身份证号（人像面）</p>
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set <p>身份证号（人像面）</p>
     * @param IdNum <p>身份证号（人像面）</p>
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get <p>发证机关（国徽面）</p> 
     * @return Authority <p>发证机关（国徽面）</p>
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set <p>发证机关（国徽面）</p>
     * @param Authority <p>发证机关（国徽面）</p>
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get <p>证件有效期（国徽面）</p> 
     * @return ValidDate <p>证件有效期（国徽面）</p>
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set <p>证件有效期（国徽面）</p>
     * @param ValidDate <p>证件有效期（国徽面）</p>
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get <p>扩展信息，不请求则不返回，具体输入参考示例3和示例4。<br>IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；<br>Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；<br>Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;<br>BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;<br>WarnInfos，告警信息，Code 告警码列表和释义：<br>-9109 身份证有效日期不合法告警，<br>-9101 身份证边框不完整告警，<br>-9102 身份证复印件告警（黑白及彩色复印件）,<br>-9108 身份证复印件告警（仅黑白复印件），<br>-9103 身份证翻拍告警，<br>-9105 身份证框内遮挡告警，<br>-9104 临时身份证告警，<br>-9106 身份证疑似存在PS痕迹告警，<br>-9107 身份证反光告警，<br>-9110 电子身份证告警，<br>-9111 水印告警（仅CardWarnType参数为Advanced时）</p> 
     * @return AdvancedInfo <p>扩展信息，不请求则不返回，具体输入参考示例3和示例4。<br>IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；<br>Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；<br>Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;<br>BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;<br>WarnInfos，告警信息，Code 告警码列表和释义：<br>-9109 身份证有效日期不合法告警，<br>-9101 身份证边框不完整告警，<br>-9102 身份证复印件告警（黑白及彩色复印件）,<br>-9108 身份证复印件告警（仅黑白复印件），<br>-9103 身份证翻拍告警，<br>-9105 身份证框内遮挡告警，<br>-9104 临时身份证告警，<br>-9106 身份证疑似存在PS痕迹告警，<br>-9107 身份证反光告警，<br>-9110 电子身份证告警，<br>-9111 水印告警（仅CardWarnType参数为Advanced时）</p>
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set <p>扩展信息，不请求则不返回，具体输入参考示例3和示例4。<br>IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；<br>Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；<br>Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;<br>BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;<br>WarnInfos，告警信息，Code 告警码列表和释义：<br>-9109 身份证有效日期不合法告警，<br>-9101 身份证边框不完整告警，<br>-9102 身份证复印件告警（黑白及彩色复印件）,<br>-9108 身份证复印件告警（仅黑白复印件），<br>-9103 身份证翻拍告警，<br>-9105 身份证框内遮挡告警，<br>-9104 临时身份证告警，<br>-9106 身份证疑似存在PS痕迹告警，<br>-9107 身份证反光告警，<br>-9110 电子身份证告警，<br>-9111 水印告警（仅CardWarnType参数为Advanced时）</p>
     * @param AdvancedInfo <p>扩展信息，不请求则不返回，具体输入参考示例3和示例4。<br>IdCard，裁剪后身份证照片的base64编码，请求 Config.CropIdCard 时返回；<br>Portrait，身份证头像照片的base64编码，请求 Config.CropPortrait 时返回；<br>Quality，图片质量分数，请求 Config.Quality 时返回（取值范围：0 ~ 100，分数越低越模糊，建议阈值≥50）;<br>BorderCodeValue，身份证边框不完整告警阈值分数，请求 Config.BorderCheckWarn时返回（取值范围：0 ~ 100，分数越低边框遮挡可能性越低，建议阈值≤50）;<br>WarnInfos，告警信息，Code 告警码列表和释义：<br>-9109 身份证有效日期不合法告警，<br>-9101 身份证边框不完整告警，<br>-9102 身份证复印件告警（黑白及彩色复印件）,<br>-9108 身份证复印件告警（仅黑白复印件），<br>-9103 身份证翻拍告警，<br>-9105 身份证框内遮挡告警，<br>-9104 临时身份证告警，<br>-9106 身份证疑似存在PS痕迹告警，<br>-9107 身份证反光告警，<br>-9110 电子身份证告警，<br>-9111 水印告警（仅CardWarnType参数为Advanced时）</p>
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get <p>反光点覆盖区域详情结果，具体内容请点击左侧链接</p> 
     * @return ReflectDetailInfos <p>反光点覆盖区域详情结果，具体内容请点击左侧链接</p>
     */
    public ReflectDetailInfo [] getReflectDetailInfos() {
        return this.ReflectDetailInfos;
    }

    /**
     * Set <p>反光点覆盖区域详情结果，具体内容请点击左侧链接</p>
     * @param ReflectDetailInfos <p>反光点覆盖区域详情结果，具体内容请点击左侧链接</p>
     */
    public void setReflectDetailInfos(ReflectDetailInfo [] ReflectDetailInfos) {
        this.ReflectDetailInfos = ReflectDetailInfos;
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

    public IDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IDCardOCRResponse(IDCardOCRResponse source) {
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

