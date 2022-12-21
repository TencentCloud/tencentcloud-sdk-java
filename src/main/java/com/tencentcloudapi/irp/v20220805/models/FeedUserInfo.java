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
package com.tencentcloudapi.irp.v20220805.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeedUserInfo extends AbstractModel{

    /**
    * 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
    */
    @SerializedName("UserIdList")
    @Expose
    private UserIdInfo [] UserIdList;

    /**
    * 用户标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 过滤列表，<b>会在推荐结果里过滤掉这类内容</b>
    */
    @SerializedName("DislikeInfoList")
    @Expose
    private DislikeInfo [] DislikeInfoList;

    /**
    * 用户年龄
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 用户性别： 0 - 未知 1 - 男 2 - 女
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
    * 用户职业
    */
    @SerializedName("Occupation")
    @Expose
    private String Occupation;

    /**
    * 用户所属行业
    */
    @SerializedName("Industry")
    @Expose
    private String Industry;

    /**
    * 用户常驻国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”
    */
    @SerializedName("ResidentCountry")
    @Expose
    private String ResidentCountry;

    /**
    * 用户常驻省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”
    */
    @SerializedName("ResidentProvince")
    @Expose
    private String ResidentProvince;

    /**
    * 用户常驻城市，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，
    */
    @SerializedName("ResidentCity")
    @Expose
    private String ResidentCity;

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
    * json字符串，用于画像数据的扩展，需要base64加密
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识 
     * @return UserId 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
     * @param UserId 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b> 
     * @return UserIdList 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     */
    public UserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     * @param UserIdList 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     */
    public void setUserIdList(UserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 用户标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b> 
     * @return Tags 用户标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 用户标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     * @param Tags 用户标签，多个标签用英文冒号联接，<b>用作特征，强烈建议</b>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 过滤列表，<b>会在推荐结果里过滤掉这类内容</b> 
     * @return DislikeInfoList 过滤列表，<b>会在推荐结果里过滤掉这类内容</b>
     */
    public DislikeInfo [] getDislikeInfoList() {
        return this.DislikeInfoList;
    }

    /**
     * Set 过滤列表，<b>会在推荐结果里过滤掉这类内容</b>
     * @param DislikeInfoList 过滤列表，<b>会在推荐结果里过滤掉这类内容</b>
     */
    public void setDislikeInfoList(DislikeInfo [] DislikeInfoList) {
        this.DislikeInfoList = DislikeInfoList;
    }

    /**
     * Get 用户年龄 
     * @return Age 用户年龄
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 用户年龄
     * @param Age 用户年龄
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 用户性别： 0 - 未知 1 - 男 2 - 女 
     * @return Gender 用户性别： 0 - 未知 1 - 男 2 - 女
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 用户性别： 0 - 未知 1 - 男 2 - 女
     * @param Gender 用户性别： 0 - 未知 1 - 男 2 - 女
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
     * Get 用户职业 
     * @return Occupation 用户职业
     */
    public String getOccupation() {
        return this.Occupation;
    }

    /**
     * Set 用户职业
     * @param Occupation 用户职业
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    /**
     * Get 用户所属行业 
     * @return Industry 用户所属行业
     */
    public String getIndustry() {
        return this.Industry;
    }

    /**
     * Set 用户所属行业
     * @param Industry 用户所属行业
     */
    public void setIndustry(String Industry) {
        this.Industry = Industry;
    }

    /**
     * Get 用户常驻国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN” 
     * @return ResidentCountry 用户常驻国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”
     */
    public String getResidentCountry() {
        return this.ResidentCountry;
    }

    /**
     * Set 用户常驻国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”
     * @param ResidentCountry 用户常驻国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”
     */
    public void setResidentCountry(String ResidentCountry) {
        this.ResidentCountry = ResidentCountry;
    }

    /**
     * Get 用户常驻省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD” 
     * @return ResidentProvince 用户常驻省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”
     */
    public String getResidentProvince() {
        return this.ResidentProvince;
    }

    /**
     * Set 用户常驻省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”
     * @param ResidentProvince 用户常驻省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”
     */
    public void setResidentProvince(String ResidentProvince) {
        this.ResidentProvince = ResidentProvince;
    }

    /**
     * Get 用户常驻城市，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>， 
     * @return ResidentCity 用户常驻城市，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，
     */
    public String getResidentCity() {
        return this.ResidentCity;
    }

    /**
     * Set 用户常驻城市，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，
     * @param ResidentCity 用户常驻城市，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，
     */
    public void setResidentCity(String ResidentCity) {
        this.ResidentCity = ResidentCity;
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
     * Get json字符串，用于画像数据的扩展，需要base64加密 
     * @return Extension json字符串，用于画像数据的扩展，需要base64加密
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，用于画像数据的扩展，需要base64加密
     * @param Extension json字符串，用于画像数据的扩展，需要base64加密
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public FeedUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeedUserInfo(FeedUserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new UserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new UserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.DislikeInfoList != null) {
            this.DislikeInfoList = new DislikeInfo[source.DislikeInfoList.length];
            for (int i = 0; i < source.DislikeInfoList.length; i++) {
                this.DislikeInfoList[i] = new DislikeInfo(source.DislikeInfoList[i]);
            }
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
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamArrayObj(map, prefix + "DislikeInfoList.", this.DislikeInfoList);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Degree", this.Degree);
        this.setParamSimple(map, prefix + "School", this.School);
        this.setParamSimple(map, prefix + "Occupation", this.Occupation);
        this.setParamSimple(map, prefix + "Industry", this.Industry);
        this.setParamSimple(map, prefix + "ResidentCountry", this.ResidentCountry);
        this.setParamSimple(map, prefix + "ResidentProvince", this.ResidentProvince);
        this.setParamSimple(map, prefix + "ResidentCity", this.ResidentCity);
        this.setParamSimple(map, prefix + "RegisterTimestamp", this.RegisterTimestamp);
        this.setParamSimple(map, prefix + "MembershipLevel", this.MembershipLevel);
        this.setParamSimple(map, prefix + "LastLoginTimestamp", this.LastLoginTimestamp);
        this.setParamSimple(map, prefix + "LastLoginIp", this.LastLoginIp);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

