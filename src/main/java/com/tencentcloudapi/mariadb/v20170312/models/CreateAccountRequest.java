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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest  extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 登录用户名，由字幕、数字、下划线和连字符组成，长度为1~32位。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 账号密码，由字母、数字或常见符号组成，不能包含分号、单引号和双引号，长度为6~32位。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否创建为只读账号，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Integer ReadOnly;

    /**
    * 账号备注，可以包含中文、英文字符、常见符号和数字，长度为0~256字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 根据传入时间判断备机不可用
    */
    @SerializedName("DelayThresh")
    @Expose
    private Integer DelayThresh;

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取登录用户名，由字幕、数字、下划线和连字符组成，长度为1~32位。
     * @return UserName 登录用户名，由字幕、数字、下划线和连字符组成，长度为1~32位。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置登录用户名，由字幕、数字、下划线和连字符组成，长度为1~32位。
     * @param UserName 登录用户名，由字幕、数字、下划线和连字符组成，长度为1~32位。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     * @return Host 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     * @param Host 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 获取账号密码，由字母、数字或常见符号组成，不能包含分号、单引号和双引号，长度为6~32位。
     * @return Password 账号密码，由字母、数字或常见符号组成，不能包含分号、单引号和双引号，长度为6~32位。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置账号密码，由字母、数字或常见符号组成，不能包含分号、单引号和双引号，长度为6~32位。
     * @param Password 账号密码，由字母、数字或常见符号组成，不能包含分号、单引号和双引号，长度为6~32位。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取是否创建为只读账号，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     * @return ReadOnly 是否创建为只读账号，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     */
    public Integer getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * 设置是否创建为只读账号，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     * @param ReadOnly 是否创建为只读账号，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     */
    public void setReadOnly(Integer ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * 获取账号备注，可以包含中文、英文字符、常见符号和数字，长度为0~256字符
     * @return Description 账号备注，可以包含中文、英文字符、常见符号和数字，长度为0~256字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置账号备注，可以包含中文、英文字符、常见符号和数字，长度为0~256字符
     * @param Description 账号备注，可以包含中文、英文字符、常见符号和数字，长度为0~256字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取根据传入时间判断备机不可用
     * @return DelayThresh 根据传入时间判断备机不可用
     */
    public Integer getDelayThresh() {
        return this.DelayThresh;
    }

    /**
     * 设置根据传入时间判断备机不可用
     * @param DelayThresh 根据传入时间判断备机不可用
     */
    public void setDelayThresh(Integer DelayThresh) {
        this.DelayThresh = DelayThresh;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DelayThresh", this.DelayThresh);

    }
}

