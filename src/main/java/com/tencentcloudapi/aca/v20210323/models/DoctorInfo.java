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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DoctorInfo extends AbstractModel {

    /**
    * 医生ID
    */
    @SerializedName("DoctorId")
    @Expose
    private String DoctorId;

    /**
    * 医生姓名
    */
    @SerializedName("DoctorName")
    @Expose
    private String DoctorName;

    /**
    * 医生电话
    */
    @SerializedName("DoctorPhone")
    @Expose
    private String DoctorPhone;

    /**
     * Get 医生ID 
     * @return DoctorId 医生ID
     */
    public String getDoctorId() {
        return this.DoctorId;
    }

    /**
     * Set 医生ID
     * @param DoctorId 医生ID
     */
    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    /**
     * Get 医生姓名 
     * @return DoctorName 医生姓名
     */
    public String getDoctorName() {
        return this.DoctorName;
    }

    /**
     * Set 医生姓名
     * @param DoctorName 医生姓名
     */
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    /**
     * Get 医生电话 
     * @return DoctorPhone 医生电话
     */
    public String getDoctorPhone() {
        return this.DoctorPhone;
    }

    /**
     * Set 医生电话
     * @param DoctorPhone 医生电话
     */
    public void setDoctorPhone(String DoctorPhone) {
        this.DoctorPhone = DoctorPhone;
    }

    public DoctorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoctorInfo(DoctorInfo source) {
        if (source.DoctorId != null) {
            this.DoctorId = new String(source.DoctorId);
        }
        if (source.DoctorName != null) {
            this.DoctorName = new String(source.DoctorName);
        }
        if (source.DoctorPhone != null) {
            this.DoctorPhone = new String(source.DoctorPhone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DoctorId", this.DoctorId);
        this.setParamSimple(map, prefix + "DoctorName", this.DoctorName);
        this.setParamSimple(map, prefix + "DoctorPhone", this.DoctorPhone);

    }
}

