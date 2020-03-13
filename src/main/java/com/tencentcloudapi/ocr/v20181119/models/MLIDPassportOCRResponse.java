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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MLIDPassportOCRResponse extends AbstractModel{

    /**
    * 护照ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 出生日期
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 性别（F女，M男）
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 有效期
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * 发行国
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * 国籍
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
    */
    @SerializedName("Warn")
    @Expose
    private Long [] Warn;

    /**
    * 证件图片
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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 护照ID 
     * @return ID 护照ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 护照ID
     * @param ID 护照ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 出生日期 
     * @return DateOfBirth 出生日期
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 出生日期
     * @param DateOfBirth 出生日期
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get 性别（F女，M男） 
     * @return Sex 性别（F女，M男）
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别（F女，M男）
     * @param Sex 性别（F女，M男）
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 有效期 
     * @return DateOfExpiration 有效期
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set 有效期
     * @param DateOfExpiration 有效期
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get 发行国 
     * @return IssuingCountry 发行国
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set 发行国
     * @param IssuingCountry 发行国
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get 国籍 
     * @return Nationality 国籍
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍
     * @param Nationality 国籍
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警 
     * @return Warn 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
     */
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
     * @param Warn 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
     */
    public void setWarn(Long [] Warn) {
        this.Warn = Warn;
    }

    /**
     * Get 证件图片 
     * @return Image 证件图片
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 证件图片
     * @param Image 证件图片
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

