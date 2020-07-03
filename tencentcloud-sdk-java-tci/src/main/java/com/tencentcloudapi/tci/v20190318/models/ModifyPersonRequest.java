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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonRequest extends AbstractModel{

    /**
    * 人员库唯一标识符
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人员工作号码
    */
    @SerializedName("JobNumber")
    @Expose
    private String JobNumber;

    /**
    * 人员邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 人员性别
    */
    @SerializedName("Male")
    @Expose
    private Long Male;

    /**
    * 人员名称
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 人员电话号码
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 人员学生号码
    */
    @SerializedName("StudentNumber")
    @Expose
    private String StudentNumber;

    /**
     * Get 人员库唯一标识符 
     * @return LibraryId 人员库唯一标识符
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 人员库唯一标识符
     * @param LibraryId 人员库唯一标识符
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 人员唯一标识符 
     * @return PersonId 人员唯一标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员唯一标识符
     * @param PersonId 人员唯一标识符
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人员工作号码 
     * @return JobNumber 人员工作号码
     */
    public String getJobNumber() {
        return this.JobNumber;
    }

    /**
     * Set 人员工作号码
     * @param JobNumber 人员工作号码
     */
    public void setJobNumber(String JobNumber) {
        this.JobNumber = JobNumber;
    }

    /**
     * Get 人员邮箱 
     * @return Mail 人员邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 人员邮箱
     * @param Mail 人员邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 人员性别 
     * @return Male 人员性别
     */
    public Long getMale() {
        return this.Male;
    }

    /**
     * Set 人员性别
     * @param Male 人员性别
     */
    public void setMale(Long Male) {
        this.Male = Male;
    }

    /**
     * Get 人员名称 
     * @return PersonName 人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称
     * @param PersonName 人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员电话号码 
     * @return PhoneNumber 人员电话号码
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 人员电话号码
     * @param PhoneNumber 人员电话号码
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 人员学生号码 
     * @return StudentNumber 人员学生号码
     */
    public String getStudentNumber() {
        return this.StudentNumber;
    }

    /**
     * Set 人员学生号码
     * @param StudentNumber 人员学生号码
     */
    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "JobNumber", this.JobNumber);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Male", this.Male);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "StudentNumber", this.StudentNumber);

    }
}

