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

public class CardVerifyResult extends AbstractModel{

    /**
    * 鉴伪或OCR是否成功
    */
    @SerializedName("IsPass")
    @Expose
    private Boolean IsPass;

    /**
    * 身份证鉴伪视频，仅开启证件视频鉴伪功能时返回，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CardVideo")
    @Expose
    private FileInfo CardVideo;

    /**
    * 证件照图片，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CardImage")
    @Expose
    private FileInfo CardImage;

    /**
    * 证件照的文字识别结果，如果鉴伪失败或者ocr失败则该参数为空。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string 生日
- ID string 证号
- Name string 名字
- Address string 地址
- Type string 证件类型

IdCardType为PhilippinesVoteID时：
- Birthday  string 生日
- Address string 地址
- LastName string 姓氏
- FirstName string 姓名
- VIN string VIN号
- CivilStatus string 婚姻状况
- Citizenship string 国籍
- PrecinctNo string 地区

IdCardType为PhilippinesDrivingLicense时：
- Sex string 性别
- Birthday  string 生日
- Name string 姓名
- Address string 地址
- LastName string 姓氏
- FirstName string 首姓名
- MiddleName string 中间姓名
- Nationality string 国籍
- LicenseNo string 证号
- ExpiresDate string 有效期
- AgencyCode string 机构代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CardInfoOcrJson")
    @Expose
    private FileInfo CardInfoOcrJson;

    /**
    * 单次流程请求标示。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 鉴伪或OCR是否成功 
     * @return IsPass 鉴伪或OCR是否成功
     */
    public Boolean getIsPass() {
        return this.IsPass;
    }

    /**
     * Set 鉴伪或OCR是否成功
     * @param IsPass 鉴伪或OCR是否成功
     */
    public void setIsPass(Boolean IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get 身份证鉴伪视频，仅开启证件视频鉴伪功能时返回，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CardVideo 身份证鉴伪视频，仅开启证件视频鉴伪功能时返回，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo getCardVideo() {
        return this.CardVideo;
    }

    /**
     * Set 身份证鉴伪视频，仅开启证件视频鉴伪功能时返回，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CardVideo 身份证鉴伪视频，仅开启证件视频鉴伪功能时返回，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCardVideo(FileInfo CardVideo) {
        this.CardVideo = CardVideo;
    }

    /**
     * Get 证件照图片，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CardImage 证件照图片，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo getCardImage() {
        return this.CardImage;
    }

    /**
     * Set 证件照图片，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CardImage 证件照图片，url链接有效期10分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCardImage(FileInfo CardImage) {
        this.CardImage = CardImage;
    }

    /**
     * Get 证件照的文字识别结果，如果鉴伪失败或者ocr失败则该参数为空。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string 生日
- ID string 证号
- Name string 名字
- Address string 地址
- Type string 证件类型

IdCardType为PhilippinesVoteID时：
- Birthday  string 生日
- Address string 地址
- LastName string 姓氏
- FirstName string 姓名
- VIN string VIN号
- CivilStatus string 婚姻状况
- Citizenship string 国籍
- PrecinctNo string 地区

IdCardType为PhilippinesDrivingLicense时：
- Sex string 性别
- Birthday  string 生日
- Name string 姓名
- Address string 地址
- LastName string 姓氏
- FirstName string 首姓名
- MiddleName string 中间姓名
- Nationality string 国籍
- LicenseNo string 证号
- ExpiresDate string 有效期
- AgencyCode string 机构代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CardInfoOcrJson 证件照的文字识别结果，如果鉴伪失败或者ocr失败则该参数为空。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string 生日
- ID string 证号
- Name string 名字
- Address string 地址
- Type string 证件类型

IdCardType为PhilippinesVoteID时：
- Birthday  string 生日
- Address string 地址
- LastName string 姓氏
- FirstName string 姓名
- VIN string VIN号
- CivilStatus string 婚姻状况
- Citizenship string 国籍
- PrecinctNo string 地区

IdCardType为PhilippinesDrivingLicense时：
- Sex string 性别
- Birthday  string 生日
- Name string 姓名
- Address string 地址
- LastName string 姓氏
- FirstName string 首姓名
- MiddleName string 中间姓名
- Nationality string 国籍
- LicenseNo string 证号
- ExpiresDate string 有效期
- AgencyCode string 机构代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo getCardInfoOcrJson() {
        return this.CardInfoOcrJson;
    }

    /**
     * Set 证件照的文字识别结果，如果鉴伪失败或者ocr失败则该参数为空。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string 生日
- ID string 证号
- Name string 名字
- Address string 地址
- Type string 证件类型

IdCardType为PhilippinesVoteID时：
- Birthday  string 生日
- Address string 地址
- LastName string 姓氏
- FirstName string 姓名
- VIN string VIN号
- CivilStatus string 婚姻状况
- Citizenship string 国籍
- PrecinctNo string 地区

IdCardType为PhilippinesDrivingLicense时：
- Sex string 性别
- Birthday  string 生日
- Name string 姓名
- Address string 地址
- LastName string 姓氏
- FirstName string 首姓名
- MiddleName string 中间姓名
- Nationality string 国籍
- LicenseNo string 证号
- ExpiresDate string 有效期
- AgencyCode string 机构代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CardInfoOcrJson 证件照的文字识别结果，如果鉴伪失败或者ocr失败则该参数为空。url链接有效期10分钟。格式为json文本信息。
IdCardType为HK时：
- CnName string 中文姓名
- EnName string 英文姓名
- TelexCode string 中文姓名对应电码
- Sex string 性别 ：“男M”或“女F”
- Birthday string 出生日期
- Permanent int 永久性居民身份证。0：非永久； 1：永久； -1：未知。
- IdNum string 身份证号码
- Symbol string 证件符号，出生日期下的符号，例如"***AZ"
- FirstIssueDate string 首次签发日期
- CurrentIssueDate string 最近领用日期

IdCardType为ML时：
- Sex string 男：LELAKI 女：PEREMPUAN
- Birthday  string 生日
- ID string 证号
- Name string 名字
- Address string 地址
- Type string 证件类型

IdCardType为PhilippinesVoteID时：
- Birthday  string 生日
- Address string 地址
- LastName string 姓氏
- FirstName string 姓名
- VIN string VIN号
- CivilStatus string 婚姻状况
- Citizenship string 国籍
- PrecinctNo string 地区

IdCardType为PhilippinesDrivingLicense时：
- Sex string 性别
- Birthday  string 生日
- Name string 姓名
- Address string 地址
- LastName string 姓氏
- FirstName string 首姓名
- MiddleName string 中间姓名
- Nationality string 国籍
- LicenseNo string 证号
- ExpiresDate string 有效期
- AgencyCode string 机构代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCardInfoOcrJson(FileInfo CardInfoOcrJson) {
        this.CardInfoOcrJson = CardInfoOcrJson;
    }

    /**
     * Get 单次流程请求标示。 
     * @return RequestId 单次流程请求标示。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 单次流程请求标示。
     * @param RequestId 单次流程请求标示。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CardVerifyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CardVerifyResult(CardVerifyResult source) {
        if (source.IsPass != null) {
            this.IsPass = new Boolean(source.IsPass);
        }
        if (source.CardVideo != null) {
            this.CardVideo = new FileInfo(source.CardVideo);
        }
        if (source.CardImage != null) {
            this.CardImage = new FileInfo(source.CardImage);
        }
        if (source.CardInfoOcrJson != null) {
            this.CardInfoOcrJson = new FileInfo(source.CardInfoOcrJson);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamObj(map, prefix + "CardVideo.", this.CardVideo);
        this.setParamObj(map, prefix + "CardImage.", this.CardImage);
        this.setParamObj(map, prefix + "CardInfoOcrJson.", this.CardInfoOcrJson);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

