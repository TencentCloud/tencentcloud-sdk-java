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

public class GetWxNFCResultResponse extends AbstractModel {

    /**
    * <p>NFC计费结果码，NFC识读成功一次则计费一次（同一个NFC请求重复拉取结果不会重复计费）。计费结果码取值范围：<br>  0：识读成功，计费<br>-1：识读失败，不计费</p>
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>证件中的人像照片</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * <p>身份类证件正面照片（人像面）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardFrontImg")
    @Expose
    private String IdCardFrontImg;

    /**
    * <p>身份类证件背面照片（国徽面）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardBackImg")
    @Expose
    private String IdCardBackImg;

    /**
    * <p>出生日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * <p>有效期起始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>住址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>民族</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>证件类型</p><p>枚举值：</p><ul><li>01： 身份证</li><li>03： 中国护照</li><li>06： 港澳通行证</li><li>07： 台胞证</li><li>08： 外国护照</li><li>13： 外国人永久居留证</li><li>14： 港澳台居民居住证</li><li>15： 回乡证</li><li>16： 大陆居民来往台湾通行证</li><li>99： 其他证件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * <p>英文姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * <p>签发机关</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SigningOrganization")
    @Expose
    private String SigningOrganization;

    /**
    * <p>港澳台居民居住证，通行证号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherIdNum")
    @Expose
    private String OtherIdNum;

    /**
    * <p>旅行证件国籍</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>旅行证件机读区第二行 29~42 位</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * <p>证件的验真结果</p><ul><li>JSON格式如下： {&quot;result_issuer &quot;:&quot;签发者证书合法性验证结果 &quot;,&quot;result_paper&quot;:&quot;证件安全对象合法性验证结果 &quot;,&quot;result_data&quot; :&quot;防数据篡改验证结果 &quot;,&quot;result_chip&quot; :&quot;防证书件芯片被复制验证结果&quot;} 。 - 取值范围： 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckMRTD")
    @Expose
    private String CheckMRTD;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>NFC计费结果码，NFC识读成功一次则计费一次（同一个NFC请求重复拉取结果不会重复计费）。计费结果码取值范围：<br>  0：识读成功，计费<br>-1：识读失败，不计费</p> 
     * @return ResultCode <p>NFC计费结果码，NFC识读成功一次则计费一次（同一个NFC请求重复拉取结果不会重复计费）。计费结果码取值范围：<br>  0：识读成功，计费<br>-1：识读失败，不计费</p>
     */
    public String getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set <p>NFC计费结果码，NFC识读成功一次则计费一次（同一个NFC请求重复拉取结果不会重复计费）。计费结果码取值范围：<br>  0：识读成功，计费<br>-1：识读失败，不计费</p>
     * @param ResultCode <p>NFC计费结果码，NFC识读成功一次则计费一次（同一个NFC请求重复拉取结果不会重复计费）。计费结果码取值范围：<br>  0：识读成功，计费<br>-1：识读失败，不计费</p>
     */
    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdNum <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdNum <p>身份证号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>证件中的人像照片</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Picture <p>证件中的人像照片</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set <p>证件中的人像照片</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Picture <p>证件中的人像照片</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get <p>身份类证件正面照片（人像面）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardFrontImg <p>身份类证件正面照片（人像面）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCardFrontImg() {
        return this.IdCardFrontImg;
    }

    /**
     * Set <p>身份类证件正面照片（人像面）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardFrontImg <p>身份类证件正面照片（人像面）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardFrontImg(String IdCardFrontImg) {
        this.IdCardFrontImg = IdCardFrontImg;
    }

    /**
     * Get <p>身份类证件背面照片（国徽面）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardBackImg <p>身份类证件背面照片（国徽面）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCardBackImg() {
        return this.IdCardBackImg;
    }

    /**
     * Set <p>身份类证件背面照片（国徽面）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardBackImg <p>身份类证件背面照片（国徽面）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardBackImg(String IdCardBackImg) {
        this.IdCardBackImg = IdCardBackImg;
    }

    /**
     * Get <p>出生日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BirthDate <p>出生日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * Set <p>出生日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BirthDate <p>出生日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Get <p>有效期起始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime <p>有效期起始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>有效期起始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime <p>有效期起始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>有效期结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>住址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address <p>住址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>住址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address <p>住址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>民族</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nation <p>民族</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>民族</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nation <p>民族</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex <p>性别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>证件类型</p><p>枚举值：</p><ul><li>01： 身份证</li><li>03： 中国护照</li><li>06： 港澳通行证</li><li>07： 台胞证</li><li>08： 外国护照</li><li>13： 外国人永久居留证</li><li>14： 港澳台居民居住证</li><li>15： 回乡证</li><li>16： 大陆居民来往台湾通行证</li><li>99： 其他证件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdType <p>证件类型</p><p>枚举值：</p><ul><li>01： 身份证</li><li>03： 中国护照</li><li>06： 港澳通行证</li><li>07： 台胞证</li><li>08： 外国护照</li><li>13： 外国人永久居留证</li><li>14： 港澳台居民居住证</li><li>15： 回乡证</li><li>16： 大陆居民来往台湾通行证</li><li>99： 其他证件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set <p>证件类型</p><p>枚举值：</p><ul><li>01： 身份证</li><li>03： 中国护照</li><li>06： 港澳通行证</li><li>07： 台胞证</li><li>08： 外国护照</li><li>13： 外国人永久居留证</li><li>14： 港澳台居民居住证</li><li>15： 回乡证</li><li>16： 大陆居民来往台湾通行证</li><li>99： 其他证件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdType <p>证件类型</p><p>枚举值：</p><ul><li>01： 身份证</li><li>03： 中国护照</li><li>06： 港澳通行证</li><li>07： 台胞证</li><li>08： 外国护照</li><li>13： 外国人永久居留证</li><li>14： 港澳台居民居住证</li><li>15： 回乡证</li><li>16： 大陆居民来往台湾通行证</li><li>99： 其他证件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get <p>英文姓名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnName <p>英文姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set <p>英文姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnName <p>英文姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get <p>签发机关</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SigningOrganization <p>签发机关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSigningOrganization() {
        return this.SigningOrganization;
    }

    /**
     * Set <p>签发机关</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SigningOrganization <p>签发机关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSigningOrganization(String SigningOrganization) {
        this.SigningOrganization = SigningOrganization;
    }

    /**
     * Get <p>港澳台居民居住证，通行证号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherIdNum <p>港澳台居民居住证，通行证号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherIdNum() {
        return this.OtherIdNum;
    }

    /**
     * Set <p>港澳台居民居住证，通行证号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherIdNum <p>港澳台居民居住证，通行证号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherIdNum(String OtherIdNum) {
        this.OtherIdNum = OtherIdNum;
    }

    /**
     * Get <p>旅行证件国籍</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nationality <p>旅行证件国籍</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>旅行证件国籍</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nationality <p>旅行证件国籍</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>旅行证件机读区第二行 29~42 位</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalNumber <p>旅行证件机读区第二行 29~42 位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set <p>旅行证件机读区第二行 29~42 位</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalNumber <p>旅行证件机读区第二行 29~42 位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get <p>证件的验真结果</p><ul><li>JSON格式如下： {&quot;result_issuer &quot;:&quot;签发者证书合法性验证结果 &quot;,&quot;result_paper&quot;:&quot;证件安全对象合法性验证结果 &quot;,&quot;result_data&quot; :&quot;防数据篡改验证结果 &quot;,&quot;result_chip&quot; :&quot;防证书件芯片被复制验证结果&quot;} 。 - 取值范围： 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckMRTD <p>证件的验真结果</p><ul><li>JSON格式如下： {&quot;result_issuer &quot;:&quot;签发者证书合法性验证结果 &quot;,&quot;result_paper&quot;:&quot;证件安全对象合法性验证结果 &quot;,&quot;result_data&quot; :&quot;防数据篡改验证结果 &quot;,&quot;result_chip&quot; :&quot;防证书件芯片被复制验证结果&quot;} 。 - 取值范围： 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckMRTD() {
        return this.CheckMRTD;
    }

    /**
     * Set <p>证件的验真结果</p><ul><li>JSON格式如下： {&quot;result_issuer &quot;:&quot;签发者证书合法性验证结果 &quot;,&quot;result_paper&quot;:&quot;证件安全对象合法性验证结果 &quot;,&quot;result_data&quot; :&quot;防数据篡改验证结果 &quot;,&quot;result_chip&quot; :&quot;防证书件芯片被复制验证结果&quot;} 。 - 取值范围： 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckMRTD <p>证件的验真结果</p><ul><li>JSON格式如下： {&quot;result_issuer &quot;:&quot;签发者证书合法性验证结果 &quot;,&quot;result_paper&quot;:&quot;证件安全对象合法性验证结果 &quot;,&quot;result_data&quot; :&quot;防数据篡改验证结果 &quot;,&quot;result_chip&quot; :&quot;防证书件芯片被复制验证结果&quot;} 。 - 取值范围： 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckMRTD(String CheckMRTD) {
        this.CheckMRTD = CheckMRTD;
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

    public GetWxNFCResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWxNFCResultResponse(GetWxNFCResultResponse source) {
        if (source.ResultCode != null) {
            this.ResultCode = new String(source.ResultCode);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Picture != null) {
            this.Picture = new String(source.Picture);
        }
        if (source.IdCardFrontImg != null) {
            this.IdCardFrontImg = new String(source.IdCardFrontImg);
        }
        if (source.IdCardBackImg != null) {
            this.IdCardBackImg = new String(source.IdCardBackImg);
        }
        if (source.BirthDate != null) {
            this.BirthDate = new String(source.BirthDate);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.SigningOrganization != null) {
            this.SigningOrganization = new String(source.SigningOrganization);
        }
        if (source.OtherIdNum != null) {
            this.OtherIdNum = new String(source.OtherIdNum);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.PersonalNumber != null) {
            this.PersonalNumber = new String(source.PersonalNumber);
        }
        if (source.CheckMRTD != null) {
            this.CheckMRTD = new String(source.CheckMRTD);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "IdCardFrontImg", this.IdCardFrontImg);
        this.setParamSimple(map, prefix + "IdCardBackImg", this.IdCardBackImg);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "SigningOrganization", this.SigningOrganization);
        this.setParamSimple(map, prefix + "OtherIdNum", this.OtherIdNum);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "PersonalNumber", this.PersonalNumber);
        this.setParamSimple(map, prefix + "CheckMRTD", this.CheckMRTD);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

