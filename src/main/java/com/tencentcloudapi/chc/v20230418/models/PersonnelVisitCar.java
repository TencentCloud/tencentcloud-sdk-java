/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonnelVisitCar extends AbstractModel {

    /**
    * 车牌号
    */
    @SerializedName("CarNumber")
    @Expose
    private String CarNumber;

    /**
    * 驾驶人姓名
    */
    @SerializedName("DriverName")
    @Expose
    private String DriverName;

    /**
    * 驾驶人身份证号
    */
    @SerializedName("DriverNumber")
    @Expose
    private String DriverNumber;

    /**
     * Get 车牌号 
     * @return CarNumber 车牌号
     */
    public String getCarNumber() {
        return this.CarNumber;
    }

    /**
     * Set 车牌号
     * @param CarNumber 车牌号
     */
    public void setCarNumber(String CarNumber) {
        this.CarNumber = CarNumber;
    }

    /**
     * Get 驾驶人姓名 
     * @return DriverName 驾驶人姓名
     */
    public String getDriverName() {
        return this.DriverName;
    }

    /**
     * Set 驾驶人姓名
     * @param DriverName 驾驶人姓名
     */
    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    /**
     * Get 驾驶人身份证号 
     * @return DriverNumber 驾驶人身份证号
     */
    public String getDriverNumber() {
        return this.DriverNumber;
    }

    /**
     * Set 驾驶人身份证号
     * @param DriverNumber 驾驶人身份证号
     */
    public void setDriverNumber(String DriverNumber) {
        this.DriverNumber = DriverNumber;
    }

    public PersonnelVisitCar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonnelVisitCar(PersonnelVisitCar source) {
        if (source.CarNumber != null) {
            this.CarNumber = new String(source.CarNumber);
        }
        if (source.DriverName != null) {
            this.DriverName = new String(source.DriverName);
        }
        if (source.DriverNumber != null) {
            this.DriverNumber = new String(source.DriverNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CarNumber", this.CarNumber);
        this.setParamSimple(map, prefix + "DriverName", this.DriverName);
        this.setParamSimple(map, prefix + "DriverNumber", this.DriverNumber);

    }
}

