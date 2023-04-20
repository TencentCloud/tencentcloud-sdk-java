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

public class RecognizePhilippinesTinIDOCRResponse extends AbstractModel{

    /**
    * 人像照片Base64后的结果
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * 编码
    */
    @SerializedName("LicenseNumber")
    @Expose
    private TextDetectionResult LicenseNumber;

    /**
    * 姓名
    */
    @SerializedName("FullName")
    @Expose
    private TextDetectionResult FullName;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * 生日
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * 发证日期
    */
    @SerializedName("IssueDate")
    @Expose
    private TextDetectionResult IssueDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人像照片Base64后的结果 
     * @return HeadPortrait 人像照片Base64后的结果
     */
    public TextDetectionResult getHeadPortrait() {
        return this.HeadPortrait;
    }

    /**
     * Set 人像照片Base64后的结果
     * @param HeadPortrait 人像照片Base64后的结果
     */
    public void setHeadPortrait(TextDetectionResult HeadPortrait) {
        this.HeadPortrait = HeadPortrait;
    }

    /**
     * Get 编码 
     * @return LicenseNumber 编码
     */
    public TextDetectionResult getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set 编码
     * @param LicenseNumber 编码
     */
    public void setLicenseNumber(TextDetectionResult LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get 姓名 
     * @return FullName 姓名
     */
    public TextDetectionResult getFullName() {
        return this.FullName;
    }

    /**
     * Set 姓名
     * @param FullName 姓名
     */
    public void setFullName(TextDetectionResult FullName) {
        this.FullName = FullName;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public TextDetectionResult getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(TextDetectionResult Address) {
        this.Address = Address;
    }

    /**
     * Get 生日 
     * @return Birthday 生日
     */
    public TextDetectionResult getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 生日
     * @param Birthday 生日
     */
    public void setBirthday(TextDetectionResult Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 发证日期 
     * @return IssueDate 发证日期
     */
    public TextDetectionResult getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 发证日期
     * @param IssueDate 发证日期
     */
    public void setIssueDate(TextDetectionResult IssueDate) {
        this.IssueDate = IssueDate;
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

    public RecognizePhilippinesTinIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesTinIDOCRResponse(RecognizePhilippinesTinIDOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new TextDetectionResult(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new TextDetectionResult(source.FullName);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new TextDetectionResult(source.IssueDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadPortrait.", this.HeadPortrait);
        this.setParamObj(map, prefix + "LicenseNumber.", this.LicenseNumber);
        this.setParamObj(map, prefix + "FullName.", this.FullName);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamObj(map, prefix + "IssueDate.", this.IssueDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

