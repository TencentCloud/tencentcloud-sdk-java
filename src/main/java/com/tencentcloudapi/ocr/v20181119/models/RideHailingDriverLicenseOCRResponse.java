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

public class RideHailingDriverLicenseOCRResponse extends AbstractModel{

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 证号，对应网约车驾驶证字段：证号/从业资格证号/驾驶员证号/身份证号
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * 有效起始日期
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 有效期截止时间，对应网约车驾驶证字段：有效期至/营运期限止
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 初始发证日期，对应网约车驾驶证字段：初始领证日期/发证日期
    */
    @SerializedName("ReleaseDate")
    @Expose
    private String ReleaseDate;

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
     * Get 证号，对应网约车驾驶证字段：证号/从业资格证号/驾驶员证号/身份证号 
     * @return LicenseNumber 证号，对应网约车驾驶证字段：证号/从业资格证号/驾驶员证号/身份证号
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set 证号，对应网约车驾驶证字段：证号/从业资格证号/驾驶员证号/身份证号
     * @param LicenseNumber 证号，对应网约车驾驶证字段：证号/从业资格证号/驾驶员证号/身份证号
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get 有效起始日期 
     * @return StartDate 有效起始日期
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 有效起始日期
     * @param StartDate 有效起始日期
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 有效期截止时间，对应网约车驾驶证字段：有效期至/营运期限止 
     * @return EndDate 有效期截止时间，对应网约车驾驶证字段：有效期至/营运期限止
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 有效期截止时间，对应网约车驾驶证字段：有效期至/营运期限止
     * @param EndDate 有效期截止时间，对应网约车驾驶证字段：有效期至/营运期限止
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 初始发证日期，对应网约车驾驶证字段：初始领证日期/发证日期 
     * @return ReleaseDate 初始发证日期，对应网约车驾驶证字段：初始领证日期/发证日期
     */
    public String getReleaseDate() {
        return this.ReleaseDate;
    }

    /**
     * Set 初始发证日期，对应网约车驾驶证字段：初始领证日期/发证日期
     * @param ReleaseDate 初始发证日期，对应网约车驾驶证字段：初始领证日期/发证日期
     */
    public void setReleaseDate(String ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
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
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ReleaseDate", this.ReleaseDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

