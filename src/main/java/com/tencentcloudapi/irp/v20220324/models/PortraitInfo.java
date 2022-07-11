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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortraitInfo extends AbstractModel{

    /**
    * 用户id列表
    */
    @SerializedName("UserIdList")
    @Expose
    private UserIdInfo [] UserIdList;

    /**
    * 如果"userIdType"是10则必传，在微信开放平台上查看appId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户年龄，值域在 0-200
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 用户性别：0-未知，1-男， 2-女
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 用户学历 ：小学，初中，高中，大专，本科，硕士，博士
    */
    @SerializedName("Degree")
    @Expose
    private String Degree;

    /**
    * 用户毕业学校全称
    */
    @SerializedName("School")
    @Expose
    private String School;

    /**
    * 用户职业，保证业务的唯一性
    */
    @SerializedName("Occupation")
    @Expose
    private String Occupation;

    /**
    * 用户所属行业，保证业务的唯一性
    */
    @SerializedName("Industry")
    @Expose
    private String Industry;

    /**
    * 用户常驻国家，统一用简写，比如中国则填写CN
    */
    @SerializedName("ResidentCountry")
    @Expose
    private String ResidentCountry;

    /**
    * 用户常驻省份
    */
    @SerializedName("ResidentProvince")
    @Expose
    private String ResidentProvince;

    /**
    * 用户常驻城市
    */
    @SerializedName("ResidentCity")
    @Expose
    private String ResidentCity;

    /**
    * 用户常驻区县
    */
    @SerializedName("ResidentDistrict")
    @Expose
    private String ResidentDistrict;

    /**
    * 用户手机的MD5值
    */
    @SerializedName("PhoneMd5")
    @Expose
    private String PhoneMd5;

    /**
    * 用户手机的IMEI号
    */
    @SerializedName("PhoneImei")
    @Expose
    private String PhoneImei;

    /**
    * 设备idfa信息
    */
    @SerializedName("Idfa")
    @Expose
    private String Idfa;

    /**
    * 用户注册时间，秒级时间戳（1639624786）
    */
    @SerializedName("RegisterTimestamp")
    @Expose
    private Long RegisterTimestamp;

    /**
    * 用户会员等级
    */
    @SerializedName("MembershipLevel")
    @Expose
    private String MembershipLevel;

    /**
    * 用户上一次登录时间，秒级时间戳（1639624786）
    */
    @SerializedName("LastLoginTimestamp")
    @Expose
    private Long LastLoginTimestamp;

    /**
    * 用户上一次登录的ip
    */
    @SerializedName("LastLoginIp")
    @Expose
    private String LastLoginIp;

    /**
    * 用户信息的最后修改时间戳，秒级时间戳（1639624786）
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
    * 用户标签
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * 用户关注作者列表
    */
    @SerializedName("AuthorInfoList")
    @Expose
    private AuthorInfo [] AuthorInfoList;

    /**
    * 用户不喜欢列表
    */
    @SerializedName("DislikeInfoList")
    @Expose
    private DislikeInfo [] DislikeInfoList;

    /**
    * json字符串，用于画像数据的扩展
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
    * 设备oaid信息
    */
    @SerializedName("Oaid")
    @Expose
    private String Oaid;

    /**
    * 设备AndroidId信息
    */
    @SerializedName("AndroidId")
    @Expose
    private String AndroidId;

    /**
     * Get 用户id列表 
     * @return UserIdList 用户id列表
     */
    public UserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户id列表
     * @param UserIdList 用户id列表
     */
    public void setUserIdList(UserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 如果"userIdType"是10则必传，在微信开放平台上查看appId 
     * @return AppId 如果"userIdType"是10则必传，在微信开放平台上查看appId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 如果"userIdType"是10则必传，在微信开放平台上查看appId
     * @param AppId 如果"userIdType"是10则必传，在微信开放平台上查看appId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户年龄，值域在 0-200 
     * @return Age 用户年龄，值域在 0-200
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 用户年龄，值域在 0-200
     * @param Age 用户年龄，值域在 0-200
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 用户性别：0-未知，1-男， 2-女 
     * @return Gender 用户性别：0-未知，1-男， 2-女
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 用户性别：0-未知，1-男， 2-女
     * @param Gender 用户性别：0-未知，1-男， 2-女
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 用户学历 ：小学，初中，高中，大专，本科，硕士，博士 
     * @return Degree 用户学历 ：小学，初中，高中，大专，本科，硕士，博士
     */
    public String getDegree() {
        return this.Degree;
    }

    /**
     * Set 用户学历 ：小学，初中，高中，大专，本科，硕士，博士
     * @param Degree 用户学历 ：小学，初中，高中，大专，本科，硕士，博士
     */
    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    /**
     * Get 用户毕业学校全称 
     * @return School 用户毕业学校全称
     */
    public String getSchool() {
        return this.School;
    }

    /**
     * Set 用户毕业学校全称
     * @param School 用户毕业学校全称
     */
    public void setSchool(String School) {
        this.School = School;
    }

    /**
     * Get 用户职业，保证业务的唯一性 
     * @return Occupation 用户职业，保证业务的唯一性
     */
    public String getOccupation() {
        return this.Occupation;
    }

    /**
     * Set 用户职业，保证业务的唯一性
     * @param Occupation 用户职业，保证业务的唯一性
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    /**
     * Get 用户所属行业，保证业务的唯一性 
     * @return Industry 用户所属行业，保证业务的唯一性
     */
    public String getIndustry() {
        return this.Industry;
    }

    /**
     * Set 用户所属行业，保证业务的唯一性
     * @param Industry 用户所属行业，保证业务的唯一性
     */
    public void setIndustry(String Industry) {
        this.Industry = Industry;
    }

    /**
     * Get 用户常驻国家，统一用简写，比如中国则填写CN 
     * @return ResidentCountry 用户常驻国家，统一用简写，比如中国则填写CN
     */
    public String getResidentCountry() {
        return this.ResidentCountry;
    }

    /**
     * Set 用户常驻国家，统一用简写，比如中国则填写CN
     * @param ResidentCountry 用户常驻国家，统一用简写，比如中国则填写CN
     */
    public void setResidentCountry(String ResidentCountry) {
        this.ResidentCountry = ResidentCountry;
    }

    /**
     * Get 用户常驻省份 
     * @return ResidentProvince 用户常驻省份
     */
    public String getResidentProvince() {
        return this.ResidentProvince;
    }

    /**
     * Set 用户常驻省份
     * @param ResidentProvince 用户常驻省份
     */
    public void setResidentProvince(String ResidentProvince) {
        this.ResidentProvince = ResidentProvince;
    }

    /**
     * Get 用户常驻城市 
     * @return ResidentCity 用户常驻城市
     */
    public String getResidentCity() {
        return this.ResidentCity;
    }

    /**
     * Set 用户常驻城市
     * @param ResidentCity 用户常驻城市
     */
    public void setResidentCity(String ResidentCity) {
        this.ResidentCity = ResidentCity;
    }

    /**
     * Get 用户常驻区县 
     * @return ResidentDistrict 用户常驻区县
     */
    public String getResidentDistrict() {
        return this.ResidentDistrict;
    }

    /**
     * Set 用户常驻区县
     * @param ResidentDistrict 用户常驻区县
     */
    public void setResidentDistrict(String ResidentDistrict) {
        this.ResidentDistrict = ResidentDistrict;
    }

    /**
     * Get 用户手机的MD5值 
     * @return PhoneMd5 用户手机的MD5值
     */
    public String getPhoneMd5() {
        return this.PhoneMd5;
    }

    /**
     * Set 用户手机的MD5值
     * @param PhoneMd5 用户手机的MD5值
     */
    public void setPhoneMd5(String PhoneMd5) {
        this.PhoneMd5 = PhoneMd5;
    }

    /**
     * Get 用户手机的IMEI号 
     * @return PhoneImei 用户手机的IMEI号
     */
    public String getPhoneImei() {
        return this.PhoneImei;
    }

    /**
     * Set 用户手机的IMEI号
     * @param PhoneImei 用户手机的IMEI号
     */
    public void setPhoneImei(String PhoneImei) {
        this.PhoneImei = PhoneImei;
    }

    /**
     * Get 设备idfa信息 
     * @return Idfa 设备idfa信息
     */
    public String getIdfa() {
        return this.Idfa;
    }

    /**
     * Set 设备idfa信息
     * @param Idfa 设备idfa信息
     */
    public void setIdfa(String Idfa) {
        this.Idfa = Idfa;
    }

    /**
     * Get 用户注册时间，秒级时间戳（1639624786） 
     * @return RegisterTimestamp 用户注册时间，秒级时间戳（1639624786）
     */
    public Long getRegisterTimestamp() {
        return this.RegisterTimestamp;
    }

    /**
     * Set 用户注册时间，秒级时间戳（1639624786）
     * @param RegisterTimestamp 用户注册时间，秒级时间戳（1639624786）
     */
    public void setRegisterTimestamp(Long RegisterTimestamp) {
        this.RegisterTimestamp = RegisterTimestamp;
    }

    /**
     * Get 用户会员等级 
     * @return MembershipLevel 用户会员等级
     */
    public String getMembershipLevel() {
        return this.MembershipLevel;
    }

    /**
     * Set 用户会员等级
     * @param MembershipLevel 用户会员等级
     */
    public void setMembershipLevel(String MembershipLevel) {
        this.MembershipLevel = MembershipLevel;
    }

    /**
     * Get 用户上一次登录时间，秒级时间戳（1639624786） 
     * @return LastLoginTimestamp 用户上一次登录时间，秒级时间戳（1639624786）
     */
    public Long getLastLoginTimestamp() {
        return this.LastLoginTimestamp;
    }

    /**
     * Set 用户上一次登录时间，秒级时间戳（1639624786）
     * @param LastLoginTimestamp 用户上一次登录时间，秒级时间戳（1639624786）
     */
    public void setLastLoginTimestamp(Long LastLoginTimestamp) {
        this.LastLoginTimestamp = LastLoginTimestamp;
    }

    /**
     * Get 用户上一次登录的ip 
     * @return LastLoginIp 用户上一次登录的ip
     */
    public String getLastLoginIp() {
        return this.LastLoginIp;
    }

    /**
     * Set 用户上一次登录的ip
     * @param LastLoginIp 用户上一次登录的ip
     */
    public void setLastLoginIp(String LastLoginIp) {
        this.LastLoginIp = LastLoginIp;
    }

    /**
     * Get 用户信息的最后修改时间戳，秒级时间戳（1639624786） 
     * @return LastModifyTimestamp 用户信息的最后修改时间戳，秒级时间戳（1639624786）
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set 用户信息的最后修改时间戳，秒级时间戳（1639624786）
     * @param LastModifyTimestamp 用户信息的最后修改时间戳，秒级时间戳（1639624786）
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    /**
     * Get 用户标签 
     * @return TagInfoList 用户标签
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set 用户标签
     * @param TagInfoList 用户标签
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get 用户关注作者列表 
     * @return AuthorInfoList 用户关注作者列表
     */
    public AuthorInfo [] getAuthorInfoList() {
        return this.AuthorInfoList;
    }

    /**
     * Set 用户关注作者列表
     * @param AuthorInfoList 用户关注作者列表
     */
    public void setAuthorInfoList(AuthorInfo [] AuthorInfoList) {
        this.AuthorInfoList = AuthorInfoList;
    }

    /**
     * Get 用户不喜欢列表 
     * @return DislikeInfoList 用户不喜欢列表
     */
    public DislikeInfo [] getDislikeInfoList() {
        return this.DislikeInfoList;
    }

    /**
     * Set 用户不喜欢列表
     * @param DislikeInfoList 用户不喜欢列表
     */
    public void setDislikeInfoList(DislikeInfo [] DislikeInfoList) {
        this.DislikeInfoList = DislikeInfoList;
    }

    /**
     * Get json字符串，用于画像数据的扩展 
     * @return Extension json字符串，用于画像数据的扩展
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，用于画像数据的扩展
     * @param Extension json字符串，用于画像数据的扩展
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    /**
     * Get 设备oaid信息 
     * @return Oaid 设备oaid信息
     */
    public String getOaid() {
        return this.Oaid;
    }

    /**
     * Set 设备oaid信息
     * @param Oaid 设备oaid信息
     */
    public void setOaid(String Oaid) {
        this.Oaid = Oaid;
    }

    /**
     * Get 设备AndroidId信息 
     * @return AndroidId 设备AndroidId信息
     */
    public String getAndroidId() {
        return this.AndroidId;
    }

    /**
     * Set 设备AndroidId信息
     * @param AndroidId 设备AndroidId信息
     */
    public void setAndroidId(String AndroidId) {
        this.AndroidId = AndroidId;
    }

    public PortraitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortraitInfo(PortraitInfo source) {
        if (source.UserIdList != null) {
            this.UserIdList = new UserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new UserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.Degree != null) {
            this.Degree = new String(source.Degree);
        }
        if (source.School != null) {
            this.School = new String(source.School);
        }
        if (source.Occupation != null) {
            this.Occupation = new String(source.Occupation);
        }
        if (source.Industry != null) {
            this.Industry = new String(source.Industry);
        }
        if (source.ResidentCountry != null) {
            this.ResidentCountry = new String(source.ResidentCountry);
        }
        if (source.ResidentProvince != null) {
            this.ResidentProvince = new String(source.ResidentProvince);
        }
        if (source.ResidentCity != null) {
            this.ResidentCity = new String(source.ResidentCity);
        }
        if (source.ResidentDistrict != null) {
            this.ResidentDistrict = new String(source.ResidentDistrict);
        }
        if (source.PhoneMd5 != null) {
            this.PhoneMd5 = new String(source.PhoneMd5);
        }
        if (source.PhoneImei != null) {
            this.PhoneImei = new String(source.PhoneImei);
        }
        if (source.Idfa != null) {
            this.Idfa = new String(source.Idfa);
        }
        if (source.RegisterTimestamp != null) {
            this.RegisterTimestamp = new Long(source.RegisterTimestamp);
        }
        if (source.MembershipLevel != null) {
            this.MembershipLevel = new String(source.MembershipLevel);
        }
        if (source.LastLoginTimestamp != null) {
            this.LastLoginTimestamp = new Long(source.LastLoginTimestamp);
        }
        if (source.LastLoginIp != null) {
            this.LastLoginIp = new String(source.LastLoginIp);
        }
        if (source.LastModifyTimestamp != null) {
            this.LastModifyTimestamp = new Long(source.LastModifyTimestamp);
        }
        if (source.TagInfoList != null) {
            this.TagInfoList = new TagInfo[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new TagInfo(source.TagInfoList[i]);
            }
        }
        if (source.AuthorInfoList != null) {
            this.AuthorInfoList = new AuthorInfo[source.AuthorInfoList.length];
            for (int i = 0; i < source.AuthorInfoList.length; i++) {
                this.AuthorInfoList[i] = new AuthorInfo(source.AuthorInfoList[i]);
            }
        }
        if (source.DislikeInfoList != null) {
            this.DislikeInfoList = new DislikeInfo[source.DislikeInfoList.length];
            for (int i = 0; i < source.DislikeInfoList.length; i++) {
                this.DislikeInfoList[i] = new DislikeInfo(source.DislikeInfoList[i]);
            }
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
        if (source.Oaid != null) {
            this.Oaid = new String(source.Oaid);
        }
        if (source.AndroidId != null) {
            this.AndroidId = new String(source.AndroidId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Degree", this.Degree);
        this.setParamSimple(map, prefix + "School", this.School);
        this.setParamSimple(map, prefix + "Occupation", this.Occupation);
        this.setParamSimple(map, prefix + "Industry", this.Industry);
        this.setParamSimple(map, prefix + "ResidentCountry", this.ResidentCountry);
        this.setParamSimple(map, prefix + "ResidentProvince", this.ResidentProvince);
        this.setParamSimple(map, prefix + "ResidentCity", this.ResidentCity);
        this.setParamSimple(map, prefix + "ResidentDistrict", this.ResidentDistrict);
        this.setParamSimple(map, prefix + "PhoneMd5", this.PhoneMd5);
        this.setParamSimple(map, prefix + "PhoneImei", this.PhoneImei);
        this.setParamSimple(map, prefix + "Idfa", this.Idfa);
        this.setParamSimple(map, prefix + "RegisterTimestamp", this.RegisterTimestamp);
        this.setParamSimple(map, prefix + "MembershipLevel", this.MembershipLevel);
        this.setParamSimple(map, prefix + "LastLoginTimestamp", this.LastLoginTimestamp);
        this.setParamSimple(map, prefix + "LastLoginIp", this.LastLoginIp);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamArrayObj(map, prefix + "AuthorInfoList.", this.AuthorInfoList);
        this.setParamArrayObj(map, prefix + "DislikeInfoList.", this.DislikeInfoList);
        this.setParamSimple(map, prefix + "Extension", this.Extension);
        this.setParamSimple(map, prefix + "Oaid", this.Oaid);
        this.setParamSimple(map, prefix + "AndroidId", this.AndroidId);

    }
}

