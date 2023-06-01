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

public class RecognizePhilippinesUMIDOCRResponse extends AbstractModel{

    /**
    * 姓
    */
    @SerializedName("Surname")
    @Expose
    private TextDetectionResult Surname;

    /**
    * 中间名
    */
    @SerializedName("MiddleName")
    @Expose
    private TextDetectionResult MiddleName;

    /**
    * 名
    */
    @SerializedName("GivenName")
    @Expose
    private TextDetectionResult GivenName;

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
    * crn码
    */
    @SerializedName("CRN")
    @Expose
    private TextDetectionResult CRN;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private TextDetectionResult Sex;

    /**
    * 人像照片Base64后的结果
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 姓 
     * @return Surname 姓
     */
    public TextDetectionResult getSurname() {
        return this.Surname;
    }

    /**
     * Set 姓
     * @param Surname 姓
     */
    public void setSurname(TextDetectionResult Surname) {
        this.Surname = Surname;
    }

    /**
     * Get 中间名 
     * @return MiddleName 中间名
     */
    public TextDetectionResult getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set 中间名
     * @param MiddleName 中间名
     */
    public void setMiddleName(TextDetectionResult MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get 名 
     * @return GivenName 名
     */
    public TextDetectionResult getGivenName() {
        return this.GivenName;
    }

    /**
     * Set 名
     * @param GivenName 名
     */
    public void setGivenName(TextDetectionResult GivenName) {
        this.GivenName = GivenName;
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
     * Get crn码 
     * @return CRN crn码
     */
    public TextDetectionResult getCRN() {
        return this.CRN;
    }

    /**
     * Set crn码
     * @param CRN crn码
     */
    public void setCRN(TextDetectionResult CRN) {
        this.CRN = CRN;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public TextDetectionResult getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(TextDetectionResult Sex) {
        this.Sex = Sex;
    }

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

    public RecognizePhilippinesUMIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesUMIDOCRResponse(RecognizePhilippinesUMIDOCRResponse source) {
        if (source.Surname != null) {
            this.Surname = new TextDetectionResult(source.Surname);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new TextDetectionResult(source.MiddleName);
        }
        if (source.GivenName != null) {
            this.GivenName = new TextDetectionResult(source.GivenName);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.CRN != null) {
            this.CRN = new TextDetectionResult(source.CRN);
        }
        if (source.Sex != null) {
            this.Sex = new TextDetectionResult(source.Sex);
        }
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Surname.", this.Surname);
        this.setParamObj(map, prefix + "MiddleName.", this.MiddleName);
        this.setParamObj(map, prefix + "GivenName.", this.GivenName);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamObj(map, prefix + "CRN.", this.CRN);
        this.setParamObj(map, prefix + "Sex.", this.Sex);
        this.setParamObj(map, prefix + "HeadPortrait.", this.HeadPortrait);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

