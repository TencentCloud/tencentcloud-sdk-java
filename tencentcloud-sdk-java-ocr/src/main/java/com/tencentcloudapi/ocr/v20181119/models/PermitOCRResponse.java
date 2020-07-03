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

public class PermitOCRResponse extends AbstractModel{

    /**
    * 姓名
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
    * 证件号
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 有效期限
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 签发机关
    */
    @SerializedName("IssueAuthority")
    @Expose
    private String IssueAuthority;

    /**
    * 签发地点
    */
    @SerializedName("IssueAddress")
    @Expose
    private String IssueAddress;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "IssueAuthority", this.IssueAuthority);
        this.setParamSimple(map, prefix + "IssueAddress", this.IssueAddress);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

