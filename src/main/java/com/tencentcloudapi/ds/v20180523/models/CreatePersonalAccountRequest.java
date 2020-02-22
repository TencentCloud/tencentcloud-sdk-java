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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonalAccountRequest extends AbstractModel{

    /**
    * 模块名AccountMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名CreatePersonalAccount
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 个人用户姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 个人用户证件类型，0代表身份证，详情请见常见问题
    */
    @SerializedName("IdentType")
    @Expose
    private Long IdentType;

    /**
    * 个人用户证件号码
    */
    @SerializedName("IdentNo")
    @Expose
    private String IdentNo;

    /**
    * 个人用户手机号
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
     * Get 模块名AccountMng 
     * @return Module 模块名AccountMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名AccountMng
     * @param Module 模块名AccountMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名CreatePersonalAccount 
     * @return Operation 操作名CreatePersonalAccount
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名CreatePersonalAccount
     * @param Operation 操作名CreatePersonalAccount
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 个人用户姓名 
     * @return Name 个人用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 个人用户姓名
     * @param Name 个人用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 个人用户证件类型，0代表身份证，详情请见常见问题 
     * @return IdentType 个人用户证件类型，0代表身份证，详情请见常见问题
     */
    public Long getIdentType() {
        return this.IdentType;
    }

    /**
     * Set 个人用户证件类型，0代表身份证，详情请见常见问题
     * @param IdentType 个人用户证件类型，0代表身份证，详情请见常见问题
     */
    public void setIdentType(Long IdentType) {
        this.IdentType = IdentType;
    }

    /**
     * Get 个人用户证件号码 
     * @return IdentNo 个人用户证件号码
     */
    public String getIdentNo() {
        return this.IdentNo;
    }

    /**
     * Set 个人用户证件号码
     * @param IdentNo 个人用户证件号码
     */
    public void setIdentNo(String IdentNo) {
        this.IdentNo = IdentNo;
    }

    /**
     * Get 个人用户手机号 
     * @return MobilePhone 个人用户手机号
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * Set 个人用户手机号
     * @param MobilePhone 个人用户手机号
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdentType", this.IdentType);
        this.setParamSimple(map, prefix + "IdentNo", this.IdentNo);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);

    }
}

