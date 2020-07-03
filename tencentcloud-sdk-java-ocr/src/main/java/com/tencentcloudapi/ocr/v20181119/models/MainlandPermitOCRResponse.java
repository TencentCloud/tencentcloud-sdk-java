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

public class MainlandPermitOCRResponse extends AbstractModel{

    /**
    * 中文姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 英文姓名
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 签发机关
    */
    @SerializedName("IssueAuthority")
    @Expose
    private String IssueAuthority;

    /**
    * 有效期限
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 证件号
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 签发地点
    */
    @SerializedName("IssueAddress")
    @Expose
    private String IssueAddress;

    /**
    * 签发次数
    */
    @SerializedName("IssueNumber")
    @Expose
    private String IssueNumber;

    /**
    * 证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * RetProfile为True时返回头像字段， Base64编码
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 中文姓名 
     * @return Name 中文姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 中文姓名
     * @param Name 中文姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 英文姓名 
     * @return EnglishName 英文姓名
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set 英文姓名
     * @param EnglishName 英文姓名
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 出生日期 
     * @return Birthday 出生日期
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期
     * @param Birthday 出生日期
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 签发机关 
     * @return IssueAuthority 签发机关
     */
    public String getIssueAuthority() {
        return this.IssueAuthority;
    }

    /**
     * Set 签发机关
     * @param IssueAuthority 签发机关
     */
    public void setIssueAuthority(String IssueAuthority) {
        this.IssueAuthority = IssueAuthority;
    }

    /**
     * Get 有效期限 
     * @return ValidDate 有效期限
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 有效期限
     * @param ValidDate 有效期限
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 证件号 
     * @return Number 证件号
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 证件号
     * @param Number 证件号
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 签发地点 
     * @return IssueAddress 签发地点
     */
    public String getIssueAddress() {
        return this.IssueAddress;
    }

    /**
     * Set 签发地点
     * @param IssueAddress 签发地点
     */
    public void setIssueAddress(String IssueAddress) {
        this.IssueAddress = IssueAddress;
    }

    /**
     * Get 签发次数 
     * @return IssueNumber 签发次数
     */
    public String getIssueNumber() {
        return this.IssueNumber;
    }

    /**
     * Set 签发次数
     * @param IssueNumber 签发次数
     */
    public void setIssueNumber(String IssueNumber) {
        this.IssueNumber = IssueNumber;
    }

    /**
     * Get 证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。 
     * @return Type 证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
     * @param Type 证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get RetProfile为True时返回头像字段， Base64编码 
     * @return Profile RetProfile为True时返回头像字段， Base64编码
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set RetProfile为True时返回头像字段， Base64编码
     * @param Profile RetProfile为True时返回头像字段， Base64编码
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssueAuthority", this.IssueAuthority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "IssueAddress", this.IssueAddress);
        this.setParamSimple(map, prefix + "IssueNumber", this.IssueNumber);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

