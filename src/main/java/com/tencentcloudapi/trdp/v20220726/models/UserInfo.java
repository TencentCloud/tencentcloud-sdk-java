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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel{

    /**
    * 用户外网IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 来源渠道编码
    */
    @SerializedName("ChannelSource")
    @Expose
    private String ChannelSource;

    /**
    * 用户登录平台。1：Android 2：iOS 3：H5 4：小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 性别：
male（男）
female（女）
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 身份证号
    */
    @SerializedName("ResidentIdentityCard")
    @Expose
    private String ResidentIdentityCard;

    /**
    * 邮箱地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 用户昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
     * Get 用户外网IP地址 
     * @return Ip 用户外网IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 用户外网IP地址
     * @param Ip 用户外网IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 来源渠道编码 
     * @return ChannelSource 来源渠道编码
     */
    public String getChannelSource() {
        return this.ChannelSource;
    }

    /**
     * Set 来源渠道编码
     * @param ChannelSource 来源渠道编码
     */
    public void setChannelSource(String ChannelSource) {
        this.ChannelSource = ChannelSource;
    }

    /**
     * Get 用户登录平台。1：Android 2：iOS 3：H5 4：小程序 
     * @return Platform 用户登录平台。1：Android 2：iOS 3：H5 4：小程序
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 用户登录平台。1：Android 2：iOS 3：H5 4：小程序
     * @param Platform 用户登录平台。1：Android 2：iOS 3：H5 4：小程序
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
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
     * Get 年龄 
     * @return Age 年龄
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
     * @param Age 年龄
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 性别：
male（男）
female（女） 
     * @return Gender 性别：
male（男）
female（女）
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 性别：
male（男）
female（女）
     * @param Gender 性别：
male（男）
female（女）
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 身份证号 
     * @return ResidentIdentityCard 身份证号
     */
    public String getResidentIdentityCard() {
        return this.ResidentIdentityCard;
    }

    /**
     * Set 身份证号
     * @param ResidentIdentityCard 身份证号
     */
    public void setResidentIdentityCard(String ResidentIdentityCard) {
        this.ResidentIdentityCard = ResidentIdentityCard;
    }

    /**
     * Get 邮箱地址 
     * @return Email 邮箱地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址
     * @param Email 邮箱地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户地址 
     * @return Address 用户地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 用户地址
     * @param Address 用户地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 用户昵称 
     * @return Nickname 用户昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 用户昵称
     * @param Nickname 用户昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ChannelSource != null) {
            this.ChannelSource = new String(source.ChannelSource);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.ResidentIdentityCard != null) {
            this.ResidentIdentityCard = new String(source.ResidentIdentityCard);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ChannelSource", this.ChannelSource);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "ResidentIdentityCard", this.ResidentIdentityCard);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);

    }
}

