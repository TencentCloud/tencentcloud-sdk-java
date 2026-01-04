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

public class PermanentResidencePermitInfo extends AbstractModel {

    /**
    * 姓名（人像面）
    */
    @SerializedName("Name")
    @Expose
    private ContentInfo Name;

    /**
    * 性别（人像面）
    */
    @SerializedName("Sex")
    @Expose
    private ContentInfo Sex;

    /**
    * 民族（人像面）
    */
    @SerializedName("Nation")
    @Expose
    private ContentInfo Nation;

    /**
    * 出生日期（人像面）
    */
    @SerializedName("Birth")
    @Expose
    private ContentInfo Birth;

    /**
    * 地址（人像面）
    */
    @SerializedName("Address")
    @Expose
    private ContentInfo Address;

    /**
    * 公民身份号码（人像面）
    */
    @SerializedName("IdNum")
    @Expose
    private ContentInfo IdNum;

    /**
    * 发证机关（国徽面）
    */
    @SerializedName("Authority")
    @Expose
    private ContentInfo Authority;

    /**
    * 证件有效期（国徽面）
    */
    @SerializedName("ValidDate")
    @Expose
    private ContentInfo ValidDate;

    /**
    * WarnInfos，告警信息
    */
    @SerializedName("WarnInfos")
    @Expose
    private CardWarnInfo WarnInfos;

    /**
    * IdCard，裁剪后身份证照片的base64编码，请求 EnableCropImage 时返回；
    */
    @SerializedName("CardImage")
    @Expose
    private ContentInfo CardImage;

    /**
    * Portrait，身份证头像照片的base64编码，请求 EnablePortrait 时返回；
    */
    @SerializedName("PortraitImage")
    @Expose
    private ContentInfo PortraitImage;

    /**
    * 持证人持有号码，外国人永久居留证 返回该字段
    */
    @SerializedName("HolderNum")
    @Expose
    private ContentInfo HolderNum;

    /**
    * 国籍，外国人永久居留证 返回该字段
    */
    @SerializedName("Nationality")
    @Expose
    private ContentInfo Nationality;

    /**
    * 英文名
示例值：Ming Li
    */
    @SerializedName("EnName")
    @Expose
    private ContentInfo EnName;

    /**
     * Get 姓名（人像面） 
     * @return Name 姓名（人像面）
     */
    public ContentInfo getName() {
        return this.Name;
    }

    /**
     * Set 姓名（人像面）
     * @param Name 姓名（人像面）
     */
    public void setName(ContentInfo Name) {
        this.Name = Name;
    }

    /**
     * Get 性别（人像面） 
     * @return Sex 性别（人像面）
     */
    public ContentInfo getSex() {
        return this.Sex;
    }

    /**
     * Set 性别（人像面）
     * @param Sex 性别（人像面）
     */
    public void setSex(ContentInfo Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 民族（人像面） 
     * @return Nation 民族（人像面）
     */
    public ContentInfo getNation() {
        return this.Nation;
    }

    /**
     * Set 民族（人像面）
     * @param Nation 民族（人像面）
     */
    public void setNation(ContentInfo Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 出生日期（人像面） 
     * @return Birth 出生日期（人像面）
     */
    public ContentInfo getBirth() {
        return this.Birth;
    }

    /**
     * Set 出生日期（人像面）
     * @param Birth 出生日期（人像面）
     */
    public void setBirth(ContentInfo Birth) {
        this.Birth = Birth;
    }

    /**
     * Get 地址（人像面） 
     * @return Address 地址（人像面）
     */
    public ContentInfo getAddress() {
        return this.Address;
    }

    /**
     * Set 地址（人像面）
     * @param Address 地址（人像面）
     */
    public void setAddress(ContentInfo Address) {
        this.Address = Address;
    }

    /**
     * Get 公民身份号码（人像面） 
     * @return IdNum 公民身份号码（人像面）
     */
    public ContentInfo getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 公民身份号码（人像面）
     * @param IdNum 公民身份号码（人像面）
     */
    public void setIdNum(ContentInfo IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 发证机关（国徽面） 
     * @return Authority 发证机关（国徽面）
     */
    public ContentInfo getAuthority() {
        return this.Authority;
    }

    /**
     * Set 发证机关（国徽面）
     * @param Authority 发证机关（国徽面）
     */
    public void setAuthority(ContentInfo Authority) {
        this.Authority = Authority;
    }

    /**
     * Get 证件有效期（国徽面） 
     * @return ValidDate 证件有效期（国徽面）
     */
    public ContentInfo getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 证件有效期（国徽面）
     * @param ValidDate 证件有效期（国徽面）
     */
    public void setValidDate(ContentInfo ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get WarnInfos，告警信息 
     * @return WarnInfos WarnInfos，告警信息
     */
    public CardWarnInfo getWarnInfos() {
        return this.WarnInfos;
    }

    /**
     * Set WarnInfos，告警信息
     * @param WarnInfos WarnInfos，告警信息
     */
    public void setWarnInfos(CardWarnInfo WarnInfos) {
        this.WarnInfos = WarnInfos;
    }

    /**
     * Get IdCard，裁剪后身份证照片的base64编码，请求 EnableCropImage 时返回； 
     * @return CardImage IdCard，裁剪后身份证照片的base64编码，请求 EnableCropImage 时返回；
     */
    public ContentInfo getCardImage() {
        return this.CardImage;
    }

    /**
     * Set IdCard，裁剪后身份证照片的base64编码，请求 EnableCropImage 时返回；
     * @param CardImage IdCard，裁剪后身份证照片的base64编码，请求 EnableCropImage 时返回；
     */
    public void setCardImage(ContentInfo CardImage) {
        this.CardImage = CardImage;
    }

    /**
     * Get Portrait，身份证头像照片的base64编码，请求 EnablePortrait 时返回； 
     * @return PortraitImage Portrait，身份证头像照片的base64编码，请求 EnablePortrait 时返回；
     */
    public ContentInfo getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Portrait，身份证头像照片的base64编码，请求 EnablePortrait 时返回；
     * @param PortraitImage Portrait，身份证头像照片的base64编码，请求 EnablePortrait 时返回；
     */
    public void setPortraitImage(ContentInfo PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get 持证人持有号码，外国人永久居留证 返回该字段 
     * @return HolderNum 持证人持有号码，外国人永久居留证 返回该字段
     */
    public ContentInfo getHolderNum() {
        return this.HolderNum;
    }

    /**
     * Set 持证人持有号码，外国人永久居留证 返回该字段
     * @param HolderNum 持证人持有号码，外国人永久居留证 返回该字段
     */
    public void setHolderNum(ContentInfo HolderNum) {
        this.HolderNum = HolderNum;
    }

    /**
     * Get 国籍，外国人永久居留证 返回该字段 
     * @return Nationality 国籍，外国人永久居留证 返回该字段
     */
    public ContentInfo getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍，外国人永久居留证 返回该字段
     * @param Nationality 国籍，外国人永久居留证 返回该字段
     */
    public void setNationality(ContentInfo Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 英文名
示例值：Ming Li 
     * @return EnName 英文名
示例值：Ming Li
     */
    public ContentInfo getEnName() {
        return this.EnName;
    }

    /**
     * Set 英文名
示例值：Ming Li
     * @param EnName 英文名
示例值：Ming Li
     */
    public void setEnName(ContentInfo EnName) {
        this.EnName = EnName;
    }

    public PermanentResidencePermitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermanentResidencePermitInfo(PermanentResidencePermitInfo source) {
        if (source.Name != null) {
            this.Name = new ContentInfo(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new ContentInfo(source.Sex);
        }
        if (source.Nation != null) {
            this.Nation = new ContentInfo(source.Nation);
        }
        if (source.Birth != null) {
            this.Birth = new ContentInfo(source.Birth);
        }
        if (source.Address != null) {
            this.Address = new ContentInfo(source.Address);
        }
        if (source.IdNum != null) {
            this.IdNum = new ContentInfo(source.IdNum);
        }
        if (source.Authority != null) {
            this.Authority = new ContentInfo(source.Authority);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new ContentInfo(source.ValidDate);
        }
        if (source.WarnInfos != null) {
            this.WarnInfos = new CardWarnInfo(source.WarnInfos);
        }
        if (source.CardImage != null) {
            this.CardImage = new ContentInfo(source.CardImage);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new ContentInfo(source.PortraitImage);
        }
        if (source.HolderNum != null) {
            this.HolderNum = new ContentInfo(source.HolderNum);
        }
        if (source.Nationality != null) {
            this.Nationality = new ContentInfo(source.Nationality);
        }
        if (source.EnName != null) {
            this.EnName = new ContentInfo(source.EnName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "Sex.", this.Sex);
        this.setParamObj(map, prefix + "Nation.", this.Nation);
        this.setParamObj(map, prefix + "Birth.", this.Birth);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "IdNum.", this.IdNum);
        this.setParamObj(map, prefix + "Authority.", this.Authority);
        this.setParamObj(map, prefix + "ValidDate.", this.ValidDate);
        this.setParamObj(map, prefix + "WarnInfos.", this.WarnInfos);
        this.setParamObj(map, prefix + "CardImage.", this.CardImage);
        this.setParamObj(map, prefix + "PortraitImage.", this.PortraitImage);
        this.setParamObj(map, prefix + "HolderNum.", this.HolderNum);
        this.setParamObj(map, prefix + "Nationality.", this.Nationality);
        this.setParamObj(map, prefix + "EnName.", this.EnName);

    }
}

