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

public class DescribePersonResponse extends AbstractModel{

    /**
    * 人员人脸列表
    */
    @SerializedName("FaceSet")
    @Expose
    private Face [] FaceSet;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 工作号码
    */
    @SerializedName("JobNumber")
    @Expose
    private String JobNumber;

    /**
    * 人员库唯一标识符
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 性别
    */
    @SerializedName("Male")
    @Expose
    private Long Male;

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人员名称
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 电话号码
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 学生号码
    */
    @SerializedName("StudentNumber")
    @Expose
    private String StudentNumber;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员人脸列表 
     * @return FaceSet 人员人脸列表
     */
    public Face [] getFaceSet() {
        return this.FaceSet;
    }

    /**
     * Set 人员人脸列表
     * @param FaceSet 人员人脸列表
     */
    public void setFaceSet(Face [] FaceSet) {
        this.FaceSet = FaceSet;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 工作号码 
     * @return JobNumber 工作号码
     */
    public String getJobNumber() {
        return this.JobNumber;
    }

    /**
     * Set 工作号码
     * @param JobNumber 工作号码
     */
    public void setJobNumber(String JobNumber) {
        this.JobNumber = JobNumber;
    }

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
     * Get 邮箱 
     * @return Mail 邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 邮箱
     * @param Mail 邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 性别 
     * @return Male 性别
     */
    public Long getMale() {
        return this.Male;
    }

    /**
     * Set 性别
     * @param Male 性别
     */
    public void setMale(Long Male) {
        this.Male = Male;
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
     * Get 电话号码 
     * @return PhoneNumber 电话号码
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 电话号码
     * @param PhoneNumber 电话号码
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 学生号码 
     * @return StudentNumber 学生号码
     */
    public String getStudentNumber() {
        return this.StudentNumber;
    }

    /**
     * Set 学生号码
     * @param StudentNumber 学生号码
     */
    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
        this.setParamArrayObj(map, prefix + "FaceSet.", this.FaceSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "JobNumber", this.JobNumber);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Male", this.Male);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "StudentNumber", this.StudentNumber);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

