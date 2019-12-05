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

public class ResidenceBookletOCRResponse  extends AbstractModel{

    /**
    * 户号
    */
    @SerializedName("HouseholdNumber")
    @Expose
    private String HouseholdNumber;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 出生地
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 民族
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 籍贯
    */
    @SerializedName("NativePlace")
    @Expose
    private String NativePlace;

    /**
    * 出生日期
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * 公民身份证件编号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 文化程度
    */
    @SerializedName("EducationDegree")
    @Expose
    private String EducationDegree;

    /**
    * 服务处所
    */
    @SerializedName("ServicePlace")
    @Expose
    private String ServicePlace;

    /**
    * 户别
    */
    @SerializedName("Household")
    @Expose
    private String Household;

    /**
    * 住址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取户号
     * @return HouseholdNumber 户号
     */
    public String getHouseholdNumber() {
        return this.HouseholdNumber;
    }

    /**
     * 设置户号
     * @param HouseholdNumber 户号
     */
    public void setHouseholdNumber(String HouseholdNumber) {
        this.HouseholdNumber = HouseholdNumber;
    }

    /**
     * 获取姓名
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取性别
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * 设置性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * 获取出生地
     * @return BirthPlace 出生地
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * 设置出生地
     * @param BirthPlace 出生地
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * 获取民族
     * @return Nation 民族
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * 设置民族
     * @param Nation 民族
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * 获取籍贯
     * @return NativePlace 籍贯
     */
    public String getNativePlace() {
        return this.NativePlace;
    }

    /**
     * 设置籍贯
     * @param NativePlace 籍贯
     */
    public void setNativePlace(String NativePlace) {
        this.NativePlace = NativePlace;
    }

    /**
     * 获取出生日期
     * @return BirthDate 出生日期
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * 设置出生日期
     * @param BirthDate 出生日期
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * 获取公民身份证件编号
     * @return IdCardNumber 公民身份证件编号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * 设置公民身份证件编号
     * @param IdCardNumber 公民身份证件编号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * 获取文化程度
     * @return EducationDegree 文化程度
     */
    public String getEducationDegree() {
        return this.EducationDegree;
    }

    /**
     * 设置文化程度
     * @param EducationDegree 文化程度
     */
    public void setEducationDegree(String EducationDegree) {
        this.EducationDegree = EducationDegree;
    }

    /**
     * 获取服务处所
     * @return ServicePlace 服务处所
     */
    public String getServicePlace() {
        return this.ServicePlace;
    }

    /**
     * 设置服务处所
     * @param ServicePlace 服务处所
     */
    public void setServicePlace(String ServicePlace) {
        this.ServicePlace = ServicePlace;
    }

    /**
     * 获取户别
     * @return Household 户别
     */
    public String getHousehold() {
        return this.Household;
    }

    /**
     * 设置户别
     * @param Household 户别
     */
    public void setHousehold(String Household) {
        this.Household = Household;
    }

    /**
     * 获取住址
     * @return Address 住址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * 设置住址
     * @param Address 住址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HouseholdNumber", this.HouseholdNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "NativePlace", this.NativePlace);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "EducationDegree", this.EducationDegree);
        this.setParamSimple(map, prefix + "ServicePlace", this.ServicePlace);
        this.setParamSimple(map, prefix + "Household", this.Household);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

