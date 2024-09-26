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

public class MLIDPassportOCRResponse extends AbstractModel {

    /**
    * 护照ID（机读码区的解析结果）
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 姓名（机读码区的解析结果）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 出生日期（机读码区的解析结果）
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 性别（F女，M男）（机读码区的解析结果）
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 有效期（机读码区的解析结果）
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * 发行国（机读码区的解析结果）
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * 国家地区代码（机读码区的解析结果）
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 告警码：
-9103	证照翻拍告警
-9102	证照复印件告警（包括黑白复印件、彩色复印件）
-9106       证件遮挡告警
    */
    @SerializedName("Warn")
    @Expose
    private Long [] Warn;

    /**
    * 证件中的人像图片base64
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 扩展字段:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 最下方第一行 MRZ Code 序列
    */
    @SerializedName("CodeSet")
    @Expose
    private String CodeSet;

    /**
    * 最下方第二行 MRZ Code 序列
    */
    @SerializedName("CodeCrc")
    @Expose
    private String CodeCrc;

    /**
    * 姓（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * 名（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * 类型（机读码区的解析结果）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 信息区证件内容
    */
    @SerializedName("PassportRecognizeInfos")
    @Expose
    private PassportRecognizeInfos PassportRecognizeInfos;

    /**
    * 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 护照ID（机读码区的解析结果） 
     * @return ID 护照ID（机读码区的解析结果）
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 护照ID（机读码区的解析结果）
     * @param ID 护照ID（机读码区的解析结果）
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 姓名（机读码区的解析结果） 
     * @return Name 姓名（机读码区的解析结果）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名（机读码区的解析结果）
     * @param Name 姓名（机读码区的解析结果）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 出生日期（机读码区的解析结果） 
     * @return DateOfBirth 出生日期（机读码区的解析结果）
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 出生日期（机读码区的解析结果）
     * @param DateOfBirth 出生日期（机读码区的解析结果）
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get 性别（F女，M男）（机读码区的解析结果） 
     * @return Sex 性别（F女，M男）（机读码区的解析结果）
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别（F女，M男）（机读码区的解析结果）
     * @param Sex 性别（F女，M男）（机读码区的解析结果）
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 有效期（机读码区的解析结果） 
     * @return DateOfExpiration 有效期（机读码区的解析结果）
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set 有效期（机读码区的解析结果）
     * @param DateOfExpiration 有效期（机读码区的解析结果）
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get 发行国（机读码区的解析结果） 
     * @return IssuingCountry 发行国（机读码区的解析结果）
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set 发行国（机读码区的解析结果）
     * @param IssuingCountry 发行国（机读码区的解析结果）
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get 国家地区代码（机读码区的解析结果） 
     * @return Nationality 国家地区代码（机读码区的解析结果）
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国家地区代码（机读码区的解析结果）
     * @param Nationality 国家地区代码（机读码区的解析结果）
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 告警码：
-9103	证照翻拍告警
-9102	证照复印件告警（包括黑白复印件、彩色复印件）
-9106       证件遮挡告警 
     * @return Warn 告警码：
-9103	证照翻拍告警
-9102	证照复印件告警（包括黑白复印件、彩色复印件）
-9106       证件遮挡告警
     */
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set 告警码：
-9103	证照翻拍告警
-9102	证照复印件告警（包括黑白复印件、彩色复印件）
-9106       证件遮挡告警
     * @param Warn 告警码：
-9103	证照翻拍告警
-9102	证照复印件告警（包括黑白复印件、彩色复印件）
-9106       证件遮挡告警
     */
    public void setWarn(Long [] Warn) {
        this.Warn = Warn;
    }

    /**
     * Get 证件中的人像图片base64 
     * @return Image 证件中的人像图片base64
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 证件中的人像图片base64
     * @param Image 证件中的人像图片base64
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 扩展字段:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
} 
     * @return AdvancedInfo 扩展字段:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 扩展字段:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
     * @param AdvancedInfo 扩展字段:
{
    ID:{
        Confidence:0.9999
    },
    Name:{
        Confidence:0.9996
    }
}
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 最下方第一行 MRZ Code 序列 
     * @return CodeSet 最下方第一行 MRZ Code 序列
     */
    public String getCodeSet() {
        return this.CodeSet;
    }

    /**
     * Set 最下方第一行 MRZ Code 序列
     * @param CodeSet 最下方第一行 MRZ Code 序列
     */
    public void setCodeSet(String CodeSet) {
        this.CodeSet = CodeSet;
    }

    /**
     * Get 最下方第二行 MRZ Code 序列 
     * @return CodeCrc 最下方第二行 MRZ Code 序列
     */
    public String getCodeCrc() {
        return this.CodeCrc;
    }

    /**
     * Set 最下方第二行 MRZ Code 序列
     * @param CodeCrc 最下方第二行 MRZ Code 序列
     */
    public void setCodeCrc(String CodeCrc) {
        this.CodeCrc = CodeCrc;
    }

    /**
     * Get 姓（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Surname 姓（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set 姓（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Surname 姓（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get 名（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GivenName 名（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set 名（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
     * @param GivenName 名（机读码区的解析结果）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get 类型（机读码区的解析结果） 
     * @return Type 类型（机读码区的解析结果）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型（机读码区的解析结果）
     * @param Type 类型（机读码区的解析结果）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 信息区证件内容 
     * @return PassportRecognizeInfos 信息区证件内容
     */
    public PassportRecognizeInfos getPassportRecognizeInfos() {
        return this.PassportRecognizeInfos;
    }

    /**
     * Set 信息区证件内容
     * @param PassportRecognizeInfos 信息区证件内容
     */
    public void setPassportRecognizeInfos(PassportRecognizeInfos PassportRecognizeInfos) {
        this.PassportRecognizeInfos = PassportRecognizeInfos;
    }

    /**
     * Get 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通 
     * @return WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     * @param WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
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

    public MLIDPassportOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MLIDPassportOCRResponse(MLIDPassportOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.DateOfExpiration != null) {
            this.DateOfExpiration = new String(source.DateOfExpiration);
        }
        if (source.IssuingCountry != null) {
            this.IssuingCountry = new String(source.IssuingCountry);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Warn != null) {
            this.Warn = new Long[source.Warn.length];
            for (int i = 0; i < source.Warn.length; i++) {
                this.Warn[i] = new Long(source.Warn[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.CodeSet != null) {
            this.CodeSet = new String(source.CodeSet);
        }
        if (source.CodeCrc != null) {
            this.CodeCrc = new String(source.CodeCrc);
        }
        if (source.Surname != null) {
            this.Surname = new String(source.Surname);
        }
        if (source.GivenName != null) {
            this.GivenName = new String(source.GivenName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PassportRecognizeInfos != null) {
            this.PassportRecognizeInfos = new PassportRecognizeInfos(source.PassportRecognizeInfos);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "IssuingCountry", this.IssuingCountry);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamArraySimple(map, prefix + "Warn.", this.Warn);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "CodeSet", this.CodeSet);
        this.setParamSimple(map, prefix + "CodeCrc", this.CodeCrc);
        this.setParamSimple(map, prefix + "Surname", this.Surname);
        this.setParamSimple(map, prefix + "GivenName", this.GivenName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PassportRecognizeInfos.", this.PassportRecognizeInfos);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

