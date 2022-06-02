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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParseNfcDataResponse extends AbstractModel{

    /**
    * 0为首次查询成功，-1为查询失败。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * 身份证号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 照片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * 出生日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * 有效期起始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 住址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 民族
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 性别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 身份证 01 中国护照 03 军官证 04 武警证 05 港澳通行证 06 台胞证 07 外国护照 08 士兵证 09 临时身份证 10 户口本 11 警官证 12 外国人永久居留证 13 港澳台居民居住证 14 回乡证 15 大陆居民来往台湾通行证 16 其他证件 99
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * 英文姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 签发机关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SigningOrganization")
    @Expose
    private String SigningOrganization;

    /**
    * 港澳台居民居住证，通行证号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherIdNum")
    @Expose
    private String OtherIdNum;

    /**
    * 旅行证件国籍
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 旅行证件机读区第二行 29~42 位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * 旅行证件类的核验结果。JSON格式如下：
{"result_issuer ":"签发者证书合法性验证结果 ","result_pape r":"证件安全对象合法性验证 结果 ","result_data" :"防数据篡改验证结果 ","result_chip" :"防证书件芯片被复制验证结果"} 
 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckMRTD")
    @Expose
    private String CheckMRTD;

    /**
    * 身份证照片面合成图片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageA")
    @Expose
    private String ImageA;

    /**
    * 身份证国徽面合成图片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageB")
    @Expose
    private String ImageB;

    /**
    * 对result code的结果描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultDescription")
    @Expose
    private String ResultDescription;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0为首次查询成功，-1为查询失败。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultCode 0为首次查询成功，-1为查询失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 0为首次查询成功，-1为查询失败。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultCode 0为首次查询成功，-1为查询失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 身份证号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdNum 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdNum 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 照片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Picture 照片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set 照片
注意：此字段可能返回 null，表示取不到有效值。
     * @param Picture 照片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get 出生日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BirthDate 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * Set 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param BirthDate 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Get 有效期起始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 有效期起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 有效期起始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 有效期起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 住址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 住址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 民族
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nation 民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 民族
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nation 民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 性别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 身份证 01 中国护照 03 军官证 04 武警证 05 港澳通行证 06 台胞证 07 外国护照 08 士兵证 09 临时身份证 10 户口本 11 警官证 12 外国人永久居留证 13 港澳台居民居住证 14 回乡证 15 大陆居民来往台湾通行证 16 其他证件 99
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdType 身份证 01 中国护照 03 军官证 04 武警证 05 港澳通行证 06 台胞证 07 外国护照 08 士兵证 09 临时身份证 10 户口本 11 警官证 12 外国人永久居留证 13 港澳台居民居住证 14 回乡证 15 大陆居民来往台湾通行证 16 其他证件 99
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set 身份证 01 中国护照 03 军官证 04 武警证 05 港澳通行证 06 台胞证 07 外国护照 08 士兵证 09 临时身份证 10 户口本 11 警官证 12 外国人永久居留证 13 港澳台居民居住证 14 回乡证 15 大陆居民来往台湾通行证 16 其他证件 99
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdType 身份证 01 中国护照 03 军官证 04 武警证 05 港澳通行证 06 台胞证 07 外国护照 08 士兵证 09 临时身份证 10 户口本 11 警官证 12 外国人永久居留证 13 港澳台居民居住证 14 回乡证 15 大陆居民来往台湾通行证 16 其他证件 99
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 英文姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnName 英文姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 英文姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnName 英文姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 签发机关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SigningOrganization 签发机关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSigningOrganization() {
        return this.SigningOrganization;
    }

    /**
     * Set 签发机关
注意：此字段可能返回 null，表示取不到有效值。
     * @param SigningOrganization 签发机关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSigningOrganization(String SigningOrganization) {
        this.SigningOrganization = SigningOrganization;
    }

    /**
     * Get 港澳台居民居住证，通行证号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherIdNum 港澳台居民居住证，通行证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherIdNum() {
        return this.OtherIdNum;
    }

    /**
     * Set 港澳台居民居住证，通行证号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherIdNum 港澳台居民居住证，通行证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherIdNum(String OtherIdNum) {
        this.OtherIdNum = OtherIdNum;
    }

    /**
     * Get 旅行证件国籍
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nationality 旅行证件国籍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 旅行证件国籍
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nationality 旅行证件国籍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 旅行证件机读区第二行 29~42 位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalNumber 旅行证件机读区第二行 29~42 位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set 旅行证件机读区第二行 29~42 位
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalNumber 旅行证件机读区第二行 29~42 位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get 旅行证件类的核验结果。JSON格式如下：
{"result_issuer ":"签发者证书合法性验证结果 ","result_pape r":"证件安全对象合法性验证 结果 ","result_data" :"防数据篡改验证结果 ","result_chip" :"防证书件芯片被复制验证结果"} 
 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckMRTD 旅行证件类的核验结果。JSON格式如下：
{"result_issuer ":"签发者证书合法性验证结果 ","result_pape r":"证件安全对象合法性验证 结果 ","result_data" :"防数据篡改验证结果 ","result_chip" :"防证书件芯片被复制验证结果"} 
 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckMRTD() {
        return this.CheckMRTD;
    }

    /**
     * Set 旅行证件类的核验结果。JSON格式如下：
{"result_issuer ":"签发者证书合法性验证结果 ","result_pape r":"证件安全对象合法性验证 结果 ","result_data" :"防数据篡改验证结果 ","result_chip" :"防证书件芯片被复制验证结果"} 
 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckMRTD 旅行证件类的核验结果。JSON格式如下：
{"result_issuer ":"签发者证书合法性验证结果 ","result_pape r":"证件安全对象合法性验证 结果 ","result_data" :"防数据篡改验证结果 ","result_chip" :"防证书件芯片被复制验证结果"} 
 0:验证通过，1: 验证不通过，2: 未验证，3:部分通过，当4项核验结果都为0时，表示证件为真
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckMRTD(String CheckMRTD) {
        this.CheckMRTD = CheckMRTD;
    }

    /**
     * Get 身份证照片面合成图片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageA 身份证照片面合成图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageA() {
        return this.ImageA;
    }

    /**
     * Set 身份证照片面合成图片
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageA 身份证照片面合成图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageA(String ImageA) {
        this.ImageA = ImageA;
    }

    /**
     * Get 身份证国徽面合成图片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageB 身份证国徽面合成图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageB() {
        return this.ImageB;
    }

    /**
     * Set 身份证国徽面合成图片
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageB 身份证国徽面合成图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageB(String ImageB) {
        this.ImageB = ImageB;
    }

    /**
     * Get 对result code的结果描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultDescription 对result code的结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultDescription() {
        return this.ResultDescription;
    }

    /**
     * Set 对result code的结果描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultDescription 对result code的结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultDescription(String ResultDescription) {
        this.ResultDescription = ResultDescription;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ParseNfcDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseNfcDataResponse(ParseNfcDataResponse source) {
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
        if (source.ImageA != null) {
            this.ImageA = new String(source.ImageA);
        }
        if (source.ImageB != null) {
            this.ImageB = new String(source.ImageB);
        }
        if (source.ResultDescription != null) {
            this.ResultDescription = new String(source.ResultDescription);
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
        this.setParamSimple(map, prefix + "ImageA", this.ImageA);
        this.setParamSimple(map, prefix + "ImageB", this.ImageB);
        this.setParamSimple(map, prefix + "ResultDescription", this.ResultDescription);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

