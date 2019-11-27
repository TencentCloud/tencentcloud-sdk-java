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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppRequest  extends AbstractModel{

    /**
    * 应用数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * 应用名称，可使用中文或英文字符，长度在30个字符以内
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用所绑定的私有网络实例ID，形如：vpc-f49l6u0z
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 应用所绑定的子网实例ID，形如：subnet-pxir56ns
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 应用访问密码，可使用英文和数字字符，长度为12~16个字符
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * 获取应用数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     * @return IdlType 应用数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * 设置应用数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     * @param IdlType 应用数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * 获取应用名称，可使用中文或英文字符，长度在30个字符以内
     * @return AppName 应用名称，可使用中文或英文字符，长度在30个字符以内
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置应用名称，可使用中文或英文字符，长度在30个字符以内
     * @param AppName 应用名称，可使用中文或英文字符，长度在30个字符以内
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取应用所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     * @return VpcId 应用所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置应用所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     * @param VpcId 应用所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取应用所绑定的子网实例ID，形如：subnet-pxir56ns
     * @return SubnetId 应用所绑定的子网实例ID，形如：subnet-pxir56ns
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置应用所绑定的子网实例ID，形如：subnet-pxir56ns
     * @param SubnetId 应用所绑定的子网实例ID，形如：subnet-pxir56ns
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取应用访问密码，可使用英文和数字字符，长度为12~16个字符
     * @return Password 应用访问密码，可使用英文和数字字符，长度为12~16个字符
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置应用访问密码，可使用英文和数字字符，长度为12~16个字符
     * @param Password 应用访问密码，可使用英文和数字字符，长度为12~16个字符
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

