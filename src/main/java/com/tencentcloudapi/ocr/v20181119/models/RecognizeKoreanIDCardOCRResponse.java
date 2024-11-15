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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeKoreanIDCardOCRResponse extends AbstractModel {

    /**
    * 身份证号码
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 发证日期
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
    * 人像截图Base64后的结果
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 生日，格式为dd/mm/yyyy
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
     * Get 发证日期 
     * @return DateOfIssue 发证日期
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set 发证日期
     * @param DateOfIssue 发证日期
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    /**
     * Get 人像截图Base64后的结果 
     * @return Photo 人像截图Base64后的结果
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set 人像截图Base64后的结果
     * @param Photo 人像截图Base64后的结果
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
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
     * Get 生日，格式为dd/mm/yyyy 
     * @return Birthday 生日，格式为dd/mm/yyyy
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 生日，格式为dd/mm/yyyy
     * @param Birthday 生日，格式为dd/mm/yyyy
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeKoreanIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeKoreanIDCardOCRResponse(RecognizeKoreanIDCardOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
        }
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

