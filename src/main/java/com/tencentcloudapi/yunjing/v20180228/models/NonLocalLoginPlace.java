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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NonLocalLoginPlace  extends AbstractModel{

    /**
    * 事件ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 登录状态
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>NORMAL_LOGIN：正常登录</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 城市ID。
    */
    @SerializedName("City")
    @Expose
    private Integer City;

    /**
    * 国家ID。
    */
    @SerializedName("Country")
    @Expose
    private Integer Country;

    /**
    * 省份ID。
    */
    @SerializedName("Province")
    @Expose
    private Integer Province;

    /**
    * 登录IP。
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 机器名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 登录时间。
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * 云镜客户端唯一标识Uuid。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * 获取事件ID。
     * @return Id 事件ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * 设置事件ID。
     * @param Id 事件ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * 获取主机IP。
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取登录状态
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>NORMAL_LOGIN：正常登录</li>
     * @return Status 登录状态
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>NORMAL_LOGIN：正常登录</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置登录状态
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>NORMAL_LOGIN：正常登录</li>
     * @param Status 登录状态
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>NORMAL_LOGIN：正常登录</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取用户名。
     * @return UserName 用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名。
     * @param UserName 用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取城市ID。
     * @return City 城市ID。
     */
    public Integer getCity() {
        return this.City;
    }

    /**
     * 设置城市ID。
     * @param City 城市ID。
     */
    public void setCity(Integer City) {
        this.City = City;
    }

    /**
     * 获取国家ID。
     * @return Country 国家ID。
     */
    public Integer getCountry() {
        return this.Country;
    }

    /**
     * 设置国家ID。
     * @param Country 国家ID。
     */
    public void setCountry(Integer Country) {
        this.Country = Country;
    }

    /**
     * 获取省份ID。
     * @return Province 省份ID。
     */
    public Integer getProvince() {
        return this.Province;
    }

    /**
     * 设置省份ID。
     * @param Province 省份ID。
     */
    public void setProvince(Integer Province) {
        this.Province = Province;
    }

    /**
     * 获取登录IP。
     * @return SrcIp 登录IP。
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * 设置登录IP。
     * @param SrcIp 登录IP。
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * 获取机器名称。
     * @return MachineName 机器名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置机器名称。
     * @param MachineName 机器名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取登录时间。
     * @return LoginTime 登录时间。
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * 设置登录时间。
     * @param LoginTime 登录时间。
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * 获取云镜客户端唯一标识Uuid。
     * @return Uuid 云镜客户端唯一标识Uuid。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一标识Uuid。
     * @param Uuid 云镜客户端唯一标识Uuid。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

