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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonInfo  extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
    * 人脸图片Base64内容，已弃用，返回默认空值
    */
    @SerializedName("PersonPicture")
    @Expose
    private String PersonPicture;

    /**
    * 性别：0男1女
    */
    @SerializedName("Gender")
    @Expose
    private Integer Gender;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Integer Age;

    /**
    * 身份类型（0表示普通顾客，1 白名单，2 表示黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Integer PersonType;

    /**
    * 人脸图片Url，在有效期内可以访问下载
    */
    @SerializedName("PersonPictureUrl")
    @Expose
    private String PersonPictureUrl;

    /**
    * 身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册用户，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
    */
    @SerializedName("PersonSubType")
    @Expose
    private Integer PersonSubType;

    /**
    * 到访次数，-1表示未知
    */
    @SerializedName("VisitTimes")
    @Expose
    private Integer VisitTimes;

    /**
    * 到访天数，-1表示未知
    */
    @SerializedName("VisitDays")
    @Expose
    private Integer VisitDays;

    /**
     * 获取用户ID
     * @return PersonId 用户ID
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置用户ID
     * @param PersonId 用户ID
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取人脸图片Base64内容，已弃用，返回默认空值
     * @return PersonPicture 人脸图片Base64内容，已弃用，返回默认空值
     */
    public String getPersonPicture() {
        return this.PersonPicture;
    }

    /**
     * 设置人脸图片Base64内容，已弃用，返回默认空值
     * @param PersonPicture 人脸图片Base64内容，已弃用，返回默认空值
     */
    public void setPersonPicture(String PersonPicture) {
        this.PersonPicture = PersonPicture;
    }

    /**
     * 获取性别：0男1女
     * @return Gender 性别：0男1女
     */
    public Integer getGender() {
        return this.Gender;
    }

    /**
     * 设置性别：0男1女
     * @param Gender 性别：0男1女
     */
    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    /**
     * 获取年龄
     * @return Age 年龄
     */
    public Integer getAge() {
        return this.Age;
    }

    /**
     * 设置年龄
     * @param Age 年龄
     */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    /**
     * 获取身份类型（0表示普通顾客，1 白名单，2 表示黑名单）
     * @return PersonType 身份类型（0表示普通顾客，1 白名单，2 表示黑名单）
     */
    public Integer getPersonType() {
        return this.PersonType;
    }

    /**
     * 设置身份类型（0表示普通顾客，1 白名单，2 表示黑名单）
     * @param PersonType 身份类型（0表示普通顾客，1 白名单，2 表示黑名单）
     */
    public void setPersonType(Integer PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * 获取人脸图片Url，在有效期内可以访问下载
     * @return PersonPictureUrl 人脸图片Url，在有效期内可以访问下载
     */
    public String getPersonPictureUrl() {
        return this.PersonPictureUrl;
    }

    /**
     * 设置人脸图片Url，在有效期内可以访问下载
     * @param PersonPictureUrl 人脸图片Url，在有效期内可以访问下载
     */
    public void setPersonPictureUrl(String PersonPictureUrl) {
        this.PersonPictureUrl = PersonPictureUrl;
    }

    /**
     * 获取身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册用户，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     * @return PersonSubType 身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册用户，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     */
    public Integer getPersonSubType() {
        return this.PersonSubType;
    }

    /**
     * 设置身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册用户，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     * @param PersonSubType 身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册用户，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     */
    public void setPersonSubType(Integer PersonSubType) {
        this.PersonSubType = PersonSubType;
    }

    /**
     * 获取到访次数，-1表示未知
     * @return VisitTimes 到访次数，-1表示未知
     */
    public Integer getVisitTimes() {
        return this.VisitTimes;
    }

    /**
     * 设置到访次数，-1表示未知
     * @param VisitTimes 到访次数，-1表示未知
     */
    public void setVisitTimes(Integer VisitTimes) {
        this.VisitTimes = VisitTimes;
    }

    /**
     * 获取到访天数，-1表示未知
     * @return VisitDays 到访天数，-1表示未知
     */
    public Integer getVisitDays() {
        return this.VisitDays;
    }

    /**
     * 设置到访天数，-1表示未知
     * @param VisitDays 到访天数，-1表示未知
     */
    public void setVisitDays(Integer VisitDays) {
        this.VisitDays = VisitDays;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonPicture", this.PersonPicture);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "PersonPictureUrl", this.PersonPictureUrl);
        this.setParamSimple(map, prefix + "PersonSubType", this.PersonSubType);
        this.setParamSimple(map, prefix + "VisitTimes", this.VisitTimes);
        this.setParamSimple(map, prefix + "VisitDays", this.VisitDays);

    }
}

