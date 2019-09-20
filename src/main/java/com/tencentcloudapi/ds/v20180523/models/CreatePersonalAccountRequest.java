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

public class CreatePersonalAccountRequest  extends AbstractModel{

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
    private Integer IdentType;

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
     * 获取模块名AccountMng
     * @return Module 模块名AccountMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名AccountMng
     * @param Module 模块名AccountMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名CreatePersonalAccount
     * @return Operation 操作名CreatePersonalAccount
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名CreatePersonalAccount
     * @param Operation 操作名CreatePersonalAccount
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取个人用户姓名
     * @return Name 个人用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置个人用户姓名
     * @param Name 个人用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取个人用户证件类型，0代表身份证，详情请见常见问题
     * @return IdentType 个人用户证件类型，0代表身份证，详情请见常见问题
     */
    public Integer getIdentType() {
        return this.IdentType;
    }

    /**
     * 设置个人用户证件类型，0代表身份证，详情请见常见问题
     * @param IdentType 个人用户证件类型，0代表身份证，详情请见常见问题
     */
    public void setIdentType(Integer IdentType) {
        this.IdentType = IdentType;
    }

    /**
     * 获取个人用户证件号码
     * @return IdentNo 个人用户证件号码
     */
    public String getIdentNo() {
        return this.IdentNo;
    }

    /**
     * 设置个人用户证件号码
     * @param IdentNo 个人用户证件号码
     */
    public void setIdentNo(String IdentNo) {
        this.IdentNo = IdentNo;
    }

    /**
     * 获取个人用户手机号
     * @return MobilePhone 个人用户手机号
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * 设置个人用户手机号
     * @param MobilePhone 个人用户手机号
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * 内部实现，用户禁止调用
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

