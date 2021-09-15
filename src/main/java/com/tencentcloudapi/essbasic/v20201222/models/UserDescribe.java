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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDescribe extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 手机号，隐藏中间4位数字，用*代替
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 注册时间点 (UNIX时间戳)
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 实名认证状态：
0 - 未实名；
1 - 通过实名
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

    /**
    * 真实姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实名认证通过时间 (UNIX时间戳)
    */
    @SerializedName("VerifiedOn")
    @Expose
    private Long VerifiedOn;

    /**
    * 身份证件类型; 
ID_CARD - 居民身份证；
PASSPORT - 护照；
MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证；
MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证；
HOUSEHOLD_REGISTER - 户口本；
TEMP_ID_CARD - 临时居民身份证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 身份证件号码 (脱敏)
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 手机号，隐藏中间4位数字，用*代替 
     * @return Mobile 手机号，隐藏中间4位数字，用*代替
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号，隐藏中间4位数字，用*代替
     * @param Mobile 手机号，隐藏中间4位数字，用*代替
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 注册时间点 (UNIX时间戳) 
     * @return CreatedOn 注册时间点 (UNIX时间戳)
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 注册时间点 (UNIX时间戳)
     * @param CreatedOn 注册时间点 (UNIX时间戳)
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 实名认证状态：
0 - 未实名；
1 - 通过实名 
     * @return VerifyStatus 实名认证状态：
0 - 未实名；
1 - 通过实名
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set 实名认证状态：
0 - 未实名；
1 - 通过实名
     * @param VerifyStatus 实名认证状态：
0 - 未实名；
1 - 通过实名
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * Get 真实姓名 
     * @return Name 真实姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 真实姓名
     * @param Name 真实姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实名认证通过时间 (UNIX时间戳) 
     * @return VerifiedOn 实名认证通过时间 (UNIX时间戳)
     */
    public Long getVerifiedOn() {
        return this.VerifiedOn;
    }

    /**
     * Set 实名认证通过时间 (UNIX时间戳)
     * @param VerifiedOn 实名认证通过时间 (UNIX时间戳)
     */
    public void setVerifiedOn(Long VerifiedOn) {
        this.VerifiedOn = VerifiedOn;
    }

    /**
     * Get 身份证件类型; 
ID_CARD - 居民身份证；
PASSPORT - 护照；
MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证；
MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证；
HOUSEHOLD_REGISTER - 户口本；
TEMP_ID_CARD - 临时居民身份证 
     * @return IdCardType 身份证件类型; 
ID_CARD - 居民身份证；
PASSPORT - 护照；
MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证；
MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证；
HOUSEHOLD_REGISTER - 户口本；
TEMP_ID_CARD - 临时居民身份证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型; 
ID_CARD - 居民身份证；
PASSPORT - 护照；
MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证；
MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证；
HOUSEHOLD_REGISTER - 户口本；
TEMP_ID_CARD - 临时居民身份证
     * @param IdCardType 身份证件类型; 
ID_CARD - 居民身份证；
PASSPORT - 护照；
MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证；
MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证；
HOUSEHOLD_REGISTER - 户口本；
TEMP_ID_CARD - 临时居民身份证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 身份证件号码 (脱敏) 
     * @return IdCardNumber 身份证件号码 (脱敏)
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证件号码 (脱敏)
     * @param IdCardNumber 身份证件号码 (脱敏)
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    public UserDescribe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDescribe(UserDescribe source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VerifiedOn != null) {
            this.VerifiedOn = new Long(source.VerifiedOn);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VerifiedOn", this.VerifiedOn);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);

    }
}

