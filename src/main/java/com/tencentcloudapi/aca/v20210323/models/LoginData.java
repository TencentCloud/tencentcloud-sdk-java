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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginData extends AbstractModel {

    /**
    * 医生ID
    */
    @SerializedName("DoctorId")
    @Expose
    private String DoctorId;

    /**
    * 医生名称
    */
    @SerializedName("DoctorName")
    @Expose
    private String DoctorName;

    /**
    * 医生职级 主治医师、副主任医师、主任医师
    */
    @SerializedName("DoctorLevel")
    @Expose
    private String DoctorLevel;

    /**
    * 医生科室 当前登录科室
    */
    @SerializedName("DoctorDepartment")
    @Expose
    private String DoctorDepartment;

    /**
    * 科室ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

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
     * Get 医生名称 
     * @return DoctorName 医生名称
     */
    public String getDoctorName() {
        return this.DoctorName;
    }

    /**
     * Set 医生名称
     * @param DoctorName 医生名称
     */
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    /**
     * Get 医生职级 主治医师、副主任医师、主任医师 
     * @return DoctorLevel 医生职级 主治医师、副主任医师、主任医师
     */
    public String getDoctorLevel() {
        return this.DoctorLevel;
    }

    /**
     * Set 医生职级 主治医师、副主任医师、主任医师
     * @param DoctorLevel 医生职级 主治医师、副主任医师、主任医师
     */
    public void setDoctorLevel(String DoctorLevel) {
        this.DoctorLevel = DoctorLevel;
    }

    /**
     * Get 医生科室 当前登录科室 
     * @return DoctorDepartment 医生科室 当前登录科室
     */
    public String getDoctorDepartment() {
        return this.DoctorDepartment;
    }

    /**
     * Set 医生科室 当前登录科室
     * @param DoctorDepartment 医生科室 当前登录科室
     */
    public void setDoctorDepartment(String DoctorDepartment) {
        this.DoctorDepartment = DoctorDepartment;
    }

    /**
     * Get 科室ID 
     * @return DepartmentId 科室ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 科室ID
     * @param DepartmentId 科室ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public LoginData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginData(LoginData source) {
        if (source.DoctorId != null) {
            this.DoctorId = new String(source.DoctorId);
        }
        if (source.DoctorName != null) {
            this.DoctorName = new String(source.DoctorName);
        }
        if (source.DoctorLevel != null) {
            this.DoctorLevel = new String(source.DoctorLevel);
        }
        if (source.DoctorDepartment != null) {
            this.DoctorDepartment = new String(source.DoctorDepartment);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DoctorId", this.DoctorId);
        this.setParamSimple(map, prefix + "DoctorName", this.DoctorName);
        this.setParamSimple(map, prefix + "DoctorLevel", this.DoctorLevel);
        this.setParamSimple(map, prefix + "DoctorDepartment", this.DoctorDepartment);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);

    }
}

