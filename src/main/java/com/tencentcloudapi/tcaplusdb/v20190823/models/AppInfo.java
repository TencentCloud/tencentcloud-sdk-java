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

public class AppInfo  extends AbstractModel{

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据描述语言类型，如：`PROTO`,`TDR`或`MIX`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * 网络类型
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 关联的用户私有网络实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 关联的用户子网实例ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 应用密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 密码状态
    */
    @SerializedName("PasswordStatus")
    @Expose
    private String PasswordStatus;

    /**
    * TcaplusDB SDK连接参数，接入ID
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * TcaplusDB SDK连接参数，接入地址
    */
    @SerializedName("ApiAccessIp")
    @Expose
    private String ApiAccessIp;

    /**
    * TcaplusDB SDK连接参数，接入端口
    */
    @SerializedName("ApiAccessPort")
    @Expose
    private Long ApiAccessPort;

    /**
    * 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
     * 获取应用名称
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取应用实例ID
     * @return ApplicationId 应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用实例ID
     * @param ApplicationId 应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取所在地域
     * @return Region 所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置所在地域
     * @param Region 所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取数据描述语言类型，如：`PROTO`,`TDR`或`MIX`
     * @return IdlType 数据描述语言类型，如：`PROTO`,`TDR`或`MIX`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * 设置数据描述语言类型，如：`PROTO`,`TDR`或`MIX`
     * @param IdlType 数据描述语言类型，如：`PROTO`,`TDR`或`MIX`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * 获取网络类型
     * @return NetworkType 网络类型
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * 设置网络类型
     * @param NetworkType 网络类型
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * 获取关联的用户私有网络实例ID
     * @return VpcId 关联的用户私有网络实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置关联的用户私有网络实例ID
     * @param VpcId 关联的用户私有网络实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取关联的用户子网实例ID
     * @return SubnetId 关联的用户子网实例ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置关联的用户子网实例ID
     * @param SubnetId 关联的用户子网实例ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取创建时间
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取应用密码
     * @return Password 应用密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置应用密码
     * @param Password 应用密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取密码状态
     * @return PasswordStatus 密码状态
     */
    public String getPasswordStatus() {
        return this.PasswordStatus;
    }

    /**
     * 设置密码状态
     * @param PasswordStatus 密码状态
     */
    public void setPasswordStatus(String PasswordStatus) {
        this.PasswordStatus = PasswordStatus;
    }

    /**
     * 获取TcaplusDB SDK连接参数，接入ID
     * @return ApiAccessId TcaplusDB SDK连接参数，接入ID
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * 设置TcaplusDB SDK连接参数，接入ID
     * @param ApiAccessId TcaplusDB SDK连接参数，接入ID
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * 获取TcaplusDB SDK连接参数，接入地址
     * @return ApiAccessIp TcaplusDB SDK连接参数，接入地址
     */
    public String getApiAccessIp() {
        return this.ApiAccessIp;
    }

    /**
     * 设置TcaplusDB SDK连接参数，接入地址
     * @param ApiAccessIp TcaplusDB SDK连接参数，接入地址
     */
    public void setApiAccessIp(String ApiAccessIp) {
        this.ApiAccessIp = ApiAccessIp;
    }

    /**
     * 获取TcaplusDB SDK连接参数，接入端口
     * @return ApiAccessPort TcaplusDB SDK连接参数，接入端口
     */
    public Long getApiAccessPort() {
        return this.ApiAccessPort;
    }

    /**
     * 设置TcaplusDB SDK连接参数，接入端口
     * @param ApiAccessPort TcaplusDB SDK连接参数，接入端口
     */
    public void setApiAccessPort(Long ApiAccessPort) {
        this.ApiAccessPort = ApiAccessPort;
    }

    /**
     * 获取如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @return OldPasswordExpireTime 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * 设置如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldPasswordExpireTime 如果PasswordStatus是unmodifiable说明有旧密码还未过期，此字段将显示旧密码过期的时间，否则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordStatus", this.PasswordStatus);
        this.setParamSimple(map, prefix + "ApiAccessId", this.ApiAccessId);
        this.setParamSimple(map, prefix + "ApiAccessIp", this.ApiAccessIp);
        this.setParamSimple(map, prefix + "ApiAccessPort", this.ApiAccessPort);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);

    }
}

