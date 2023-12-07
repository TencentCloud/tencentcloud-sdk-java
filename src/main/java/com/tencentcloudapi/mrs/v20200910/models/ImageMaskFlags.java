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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageMaskFlags extends AbstractModel {

    /**
    * 是否对医院信息进行脱敏
    */
    @SerializedName("HospitalFlag")
    @Expose
    private Boolean HospitalFlag;

    /**
    * 是否对医生信息进行脱敏
    */
    @SerializedName("DoctorFlag")
    @Expose
    private Boolean DoctorFlag;

    /**
    * 是否对患者信息进行脱敏
    */
    @SerializedName("PatientFlag")
    @Expose
    private Boolean PatientFlag;

    /**
    * 是否对二维码信息进行脱敏
    */
    @SerializedName("BarFlag")
    @Expose
    private Boolean BarFlag;

    /**
     * Get 是否对医院信息进行脱敏 
     * @return HospitalFlag 是否对医院信息进行脱敏
     */
    public Boolean getHospitalFlag() {
        return this.HospitalFlag;
    }

    /**
     * Set 是否对医院信息进行脱敏
     * @param HospitalFlag 是否对医院信息进行脱敏
     */
    public void setHospitalFlag(Boolean HospitalFlag) {
        this.HospitalFlag = HospitalFlag;
    }

    /**
     * Get 是否对医生信息进行脱敏 
     * @return DoctorFlag 是否对医生信息进行脱敏
     */
    public Boolean getDoctorFlag() {
        return this.DoctorFlag;
    }

    /**
     * Set 是否对医生信息进行脱敏
     * @param DoctorFlag 是否对医生信息进行脱敏
     */
    public void setDoctorFlag(Boolean DoctorFlag) {
        this.DoctorFlag = DoctorFlag;
    }

    /**
     * Get 是否对患者信息进行脱敏 
     * @return PatientFlag 是否对患者信息进行脱敏
     */
    public Boolean getPatientFlag() {
        return this.PatientFlag;
    }

    /**
     * Set 是否对患者信息进行脱敏
     * @param PatientFlag 是否对患者信息进行脱敏
     */
    public void setPatientFlag(Boolean PatientFlag) {
        this.PatientFlag = PatientFlag;
    }

    /**
     * Get 是否对二维码信息进行脱敏 
     * @return BarFlag 是否对二维码信息进行脱敏
     */
    public Boolean getBarFlag() {
        return this.BarFlag;
    }

    /**
     * Set 是否对二维码信息进行脱敏
     * @param BarFlag 是否对二维码信息进行脱敏
     */
    public void setBarFlag(Boolean BarFlag) {
        this.BarFlag = BarFlag;
    }

    public ImageMaskFlags() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageMaskFlags(ImageMaskFlags source) {
        if (source.HospitalFlag != null) {
            this.HospitalFlag = new Boolean(source.HospitalFlag);
        }
        if (source.DoctorFlag != null) {
            this.DoctorFlag = new Boolean(source.DoctorFlag);
        }
        if (source.PatientFlag != null) {
            this.PatientFlag = new Boolean(source.PatientFlag);
        }
        if (source.BarFlag != null) {
            this.BarFlag = new Boolean(source.BarFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HospitalFlag", this.HospitalFlag);
        this.setParamSimple(map, prefix + "DoctorFlag", this.DoctorFlag);
        this.setParamSimple(map, prefix + "PatientFlag", this.PatientFlag);
        this.setParamSimple(map, prefix + "BarFlag", this.BarFlag);

    }
}

