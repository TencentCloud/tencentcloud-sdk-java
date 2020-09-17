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

public class RecognizeThaiIDCardOCRResponse extends AbstractModel{

    /**
    * 身份证号码
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 泰文姓名
    */
    @SerializedName("ThaiName")
    @Expose
    private String ThaiName;

    /**
    * 英文姓名
    */
    @SerializedName("EnFirstName")
    @Expose
    private String EnFirstName;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 首次领用日期
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 签发日期
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 英文姓名
    */
    @SerializedName("EnLastName")
    @Expose
    private String EnLastName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份证号码 
     * @return ID 身份证号码
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 身份证号码
     * @param ID 身份证号码
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 泰文姓名 
     * @return ThaiName 泰文姓名
     */
    public String getThaiName() {
        return this.ThaiName;
    }

    /**
     * Set 泰文姓名
     * @param ThaiName 泰文姓名
     */
    public void setThaiName(String ThaiName) {
        this.ThaiName = ThaiName;
    }

    /**
     * Get 英文姓名 
     * @return EnFirstName 英文姓名
     */
    public String getEnFirstName() {
        return this.EnFirstName;
    }

    /**
     * Set 英文姓名
     * @param EnFirstName 英文姓名
     */
    public void setEnFirstName(String EnFirstName) {
        this.EnFirstName = EnFirstName;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
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
     * Get 首次领用日期 
     * @return IssueDate 首次领用日期
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 首次领用日期
     * @param IssueDate 首次领用日期
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 签发日期 
     * @return ExpirationDate 签发日期
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 签发日期
     * @param ExpirationDate 签发日期
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 英文姓名 
     * @return EnLastName 英文姓名
     */
    public String getEnLastName() {
        return this.EnLastName;
    }

    /**
     * Set 英文姓名
     * @param EnLastName 英文姓名
     */
    public void setEnLastName(String EnLastName) {
        this.EnLastName = EnLastName;
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
        this.setParamSimple(map, prefix + "ThaiName", this.ThaiName);
        this.setParamSimple(map, prefix + "EnFirstName", this.EnFirstName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "EnLastName", this.EnLastName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

