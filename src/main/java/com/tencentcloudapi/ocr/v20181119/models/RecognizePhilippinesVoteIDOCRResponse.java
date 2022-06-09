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

public class RecognizePhilippinesVoteIDOCRResponse extends AbstractModel{

    /**
    * 人像照片Base64后的结果
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * 菲律宾VoteID的VIN
    */
    @SerializedName("VIN")
    @Expose
    private TextDetectionResult VIN;

    /**
    * 姓名
    */
    @SerializedName("FirstName")
    @Expose
    private TextDetectionResult FirstName;

    /**
    * 姓氏
    */
    @SerializedName("LastName")
    @Expose
    private TextDetectionResult LastName;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * 婚姻状况
    */
    @SerializedName("CivilStatus")
    @Expose
    private TextDetectionResult CivilStatus;

    /**
    * 国籍
    */
    @SerializedName("Citizenship")
    @Expose
    private TextDetectionResult Citizenship;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * 地区
    */
    @SerializedName("PrecinctNo")
    @Expose
    private TextDetectionResult PrecinctNo;

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
     * Get 菲律宾VoteID的VIN 
     * @return VIN 菲律宾VoteID的VIN
     */
    public TextDetectionResult getVIN() {
        return this.VIN;
    }

    /**
     * Set 菲律宾VoteID的VIN
     * @param VIN 菲律宾VoteID的VIN
     */
    public void setVIN(TextDetectionResult VIN) {
        this.VIN = VIN;
    }

    /**
     * Get 姓名 
     * @return FirstName 姓名
     */
    public TextDetectionResult getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 姓名
     * @param FirstName 姓名
     */
    public void setFirstName(TextDetectionResult FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get 姓氏 
     * @return LastName 姓氏
     */
    public TextDetectionResult getLastName() {
        return this.LastName;
    }

    /**
     * Set 姓氏
     * @param LastName 姓氏
     */
    public void setLastName(TextDetectionResult LastName) {
        this.LastName = LastName;
    }

    /**
     * Get 出生日期 
     * @return Birthday 出生日期
     */
    public TextDetectionResult getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期
     * @param Birthday 出生日期
     */
    public void setBirthday(TextDetectionResult Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 婚姻状况 
     * @return CivilStatus 婚姻状况
     */
    public TextDetectionResult getCivilStatus() {
        return this.CivilStatus;
    }

    /**
     * Set 婚姻状况
     * @param CivilStatus 婚姻状况
     */
    public void setCivilStatus(TextDetectionResult CivilStatus) {
        this.CivilStatus = CivilStatus;
    }

    /**
     * Get 国籍 
     * @return Citizenship 国籍
     */
    public TextDetectionResult getCitizenship() {
        return this.Citizenship;
    }

    /**
     * Set 国籍
     * @param Citizenship 国籍
     */
    public void setCitizenship(TextDetectionResult Citizenship) {
        this.Citizenship = Citizenship;
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
     * Get 地区 
     * @return PrecinctNo 地区
     */
    public TextDetectionResult getPrecinctNo() {
        return this.PrecinctNo;
    }

    /**
     * Set 地区
     * @param PrecinctNo 地区
     */
    public void setPrecinctNo(TextDetectionResult PrecinctNo) {
        this.PrecinctNo = PrecinctNo;
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

    public RecognizePhilippinesVoteIDOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesVoteIDOCRResponse(RecognizePhilippinesVoteIDOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.VIN != null) {
            this.VIN = new TextDetectionResult(source.VIN);
        }
        if (source.FirstName != null) {
            this.FirstName = new TextDetectionResult(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new TextDetectionResult(source.LastName);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.CivilStatus != null) {
            this.CivilStatus = new TextDetectionResult(source.CivilStatus);
        }
        if (source.Citizenship != null) {
            this.Citizenship = new TextDetectionResult(source.Citizenship);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.PrecinctNo != null) {
            this.PrecinctNo = new TextDetectionResult(source.PrecinctNo);
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
        this.setParamObj(map, prefix + "VIN.", this.VIN);
        this.setParamObj(map, prefix + "FirstName.", this.FirstName);
        this.setParamObj(map, prefix + "LastName.", this.LastName);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamObj(map, prefix + "CivilStatus.", this.CivilStatus);
        this.setParamObj(map, prefix + "Citizenship.", this.Citizenship);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "PrecinctNo.", this.PrecinctNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

