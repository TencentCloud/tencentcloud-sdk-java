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

public class RideHailingTransportLicenseOCRResponse extends AbstractModel{

    /**
    * 交运管许可字号。
    */
    @SerializedName("OperationLicenseNumber")
    @Expose
    private String OperationLicenseNumber;

    /**
    * 车辆所有人，对应网约车运输证字段：车辆所有人/车主名称/业户名称。
    */
    @SerializedName("VehicleOwner")
    @Expose
    private String VehicleOwner;

    /**
    * 车牌号码，对应网约车运输证字段：车牌号码/车辆号牌。
    */
    @SerializedName("VehicleNumber")
    @Expose
    private String VehicleNumber;

    /**
    * 有效起始日期。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 有效期截止时间，对应网约车运输证字段：有效期至/营运期限止。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 初始发证日期，对应网约车运输证字段：初始领证日期/发证日期。
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
     * Get 交运管许可字号。 
     * @return OperationLicenseNumber 交运管许可字号。
     */
    public String getOperationLicenseNumber() {
        return this.OperationLicenseNumber;
    }

    /**
     * Set 交运管许可字号。
     * @param OperationLicenseNumber 交运管许可字号。
     */
    public void setOperationLicenseNumber(String OperationLicenseNumber) {
        this.OperationLicenseNumber = OperationLicenseNumber;
    }

    /**
     * Get 车辆所有人，对应网约车运输证字段：车辆所有人/车主名称/业户名称。 
     * @return VehicleOwner 车辆所有人，对应网约车运输证字段：车辆所有人/车主名称/业户名称。
     */
    public String getVehicleOwner() {
        return this.VehicleOwner;
    }

    /**
     * Set 车辆所有人，对应网约车运输证字段：车辆所有人/车主名称/业户名称。
     * @param VehicleOwner 车辆所有人，对应网约车运输证字段：车辆所有人/车主名称/业户名称。
     */
    public void setVehicleOwner(String VehicleOwner) {
        this.VehicleOwner = VehicleOwner;
    }

    /**
     * Get 车牌号码，对应网约车运输证字段：车牌号码/车辆号牌。 
     * @return VehicleNumber 车牌号码，对应网约车运输证字段：车牌号码/车辆号牌。
     */
    public String getVehicleNumber() {
        return this.VehicleNumber;
    }

    /**
     * Set 车牌号码，对应网约车运输证字段：车牌号码/车辆号牌。
     * @param VehicleNumber 车牌号码，对应网约车运输证字段：车牌号码/车辆号牌。
     */
    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    /**
     * Get 有效起始日期。 
     * @return StartDate 有效起始日期。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 有效起始日期。
     * @param StartDate 有效起始日期。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 有效期截止时间，对应网约车运输证字段：有效期至/营运期限止。 
     * @return EndDate 有效期截止时间，对应网约车运输证字段：有效期至/营运期限止。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 有效期截止时间，对应网约车运输证字段：有效期至/营运期限止。
     * @param EndDate 有效期截止时间，对应网约车运输证字段：有效期至/营运期限止。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 初始发证日期，对应网约车运输证字段：初始领证日期/发证日期。 
     * @return ReleaseDate 初始发证日期，对应网约车运输证字段：初始领证日期/发证日期。
     */
    public String getReleaseDate() {
        return this.ReleaseDate;
    }

    /**
     * Set 初始发证日期，对应网约车运输证字段：初始领证日期/发证日期。
     * @param ReleaseDate 初始发证日期，对应网约车运输证字段：初始领证日期/发证日期。
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
        this.setParamSimple(map, prefix + "OperationLicenseNumber", this.OperationLicenseNumber);
        this.setParamSimple(map, prefix + "VehicleOwner", this.VehicleOwner);
        this.setParamSimple(map, prefix + "VehicleNumber", this.VehicleNumber);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ReleaseDate", this.ReleaseDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

