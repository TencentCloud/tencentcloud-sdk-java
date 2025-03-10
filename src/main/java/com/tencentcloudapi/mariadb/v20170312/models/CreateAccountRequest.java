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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel {

    /**
    * 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号名，账号名需要1-32个字符，由字母、数字或特殊字符组成；以字母开头；特殊字符为_-
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
    * 账号密码，密码需要 8\~32 个字符，不能以 '/' 开头，并且至少包含字母、数字和特殊字符 ()~!@#$%^&*-+=_|{}[]:<>,.?/ 中的两项
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否创建为只读账号，0：否； 1：只读账号，该账号的sql请求优先选择备机执行，备机延迟时选择主机执行；2：只读账号，优先选择备机执行，备机延迟时操作报错；3：只读账号，优先选择备机执行，忽略备机延迟只读备机；
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * 账号备注，可以包含中文、英文字符、常见符号和数字，最多256个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 根据传入时间判断备机不可用
    */
    @SerializedName("DelayThresh")
    @Expose
    private Long DelayThresh;

    /**
    * 针对只读账号，设置策略是否固定备机，0：不固定备机，即备机不满足条件与客户端不断开连接，Proxy选择其他可用备机，1：备机不满足条件断开连接，确保一个连接固定备机。
    */
    @SerializedName("SlaveConst")
    @Expose
    private Long SlaveConst;

    /**
    * 用户最大连接数限制参数。不传或者传0表示为不限制，对应max_user_connections参数，目前10.1内核版本不支持设置。
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
    * 使用GetPublicKey返回的RSA2048公钥加密后的密码
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 账号名，账号名需要1-32个字符，由字母、数字或特殊字符组成；以字母开头；特殊字符为_- 
     * @return UserName 账号名，账号名需要1-32个字符，由字母、数字或特殊字符组成；以字母开头；特殊字符为_-
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账号名，账号名需要1-32个字符，由字母、数字或特殊字符组成；以字母开头；特殊字符为_-
     * @param UserName 账号名，账号名需要1-32个字符，由字母、数字或特殊字符组成；以字母开头；特殊字符为_-
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。 
     * @return Host 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     * @param Host 可以登录的主机，与mysql 账号的 host 格式一致，可以支持通配符，例如 %，10.%，10.20.%。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 账号密码，密码需要 8\~32 个字符，不能以 '/' 开头，并且至少包含字母、数字和特殊字符 ()~!@#$%^&*-+=_|{}[]:<>,.?/ 中的两项 
     * @return Password 账号密码，密码需要 8\~32 个字符，不能以 '/' 开头，并且至少包含字母、数字和特殊字符 ()~!@#$%^&*-+=_|{}[]:<>,.?/ 中的两项
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账号密码，密码需要 8\~32 个字符，不能以 '/' 开头，并且至少包含字母、数字和特殊字符 ()~!@#$%^&*-+=_|{}[]:<>,.?/ 中的两项
     * @param Password 账号密码，密码需要 8\~32 个字符，不能以 '/' 开头，并且至少包含字母、数字和特殊字符 ()~!@#$%^&*-+=_|{}[]:<>,.?/ 中的两项
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否创建为只读账号，0：否； 1：只读账号，该账号的sql请求优先选择备机执行，备机延迟时选择主机执行；2：只读账号，优先选择备机执行，备机延迟时操作报错；3：只读账号，优先选择备机执行，忽略备机延迟只读备机； 
     * @return ReadOnly 是否创建为只读账号，0：否； 1：只读账号，该账号的sql请求优先选择备机执行，备机延迟时选择主机执行；2：只读账号，优先选择备机执行，备机延迟时操作报错；3：只读账号，优先选择备机执行，忽略备机延迟只读备机；
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否创建为只读账号，0：否； 1：只读账号，该账号的sql请求优先选择备机执行，备机延迟时选择主机执行；2：只读账号，优先选择备机执行，备机延迟时操作报错；3：只读账号，优先选择备机执行，忽略备机延迟只读备机；
     * @param ReadOnly 是否创建为只读账号，0：否； 1：只读账号，该账号的sql请求优先选择备机执行，备机延迟时选择主机执行；2：只读账号，优先选择备机执行，备机延迟时操作报错；3：只读账号，优先选择备机执行，忽略备机延迟只读备机；
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 账号备注，可以包含中文、英文字符、常见符号和数字，最多256个字符 
     * @return Description 账号备注，可以包含中文、英文字符、常见符号和数字，最多256个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 账号备注，可以包含中文、英文字符、常见符号和数字，最多256个字符
     * @param Description 账号备注，可以包含中文、英文字符、常见符号和数字，最多256个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 根据传入时间判断备机不可用 
     * @return DelayThresh 根据传入时间判断备机不可用
     */
    public Long getDelayThresh() {
        return this.DelayThresh;
    }

    /**
     * Set 根据传入时间判断备机不可用
     * @param DelayThresh 根据传入时间判断备机不可用
     */
    public void setDelayThresh(Long DelayThresh) {
        this.DelayThresh = DelayThresh;
    }

    /**
     * Get 针对只读账号，设置策略是否固定备机，0：不固定备机，即备机不满足条件与客户端不断开连接，Proxy选择其他可用备机，1：备机不满足条件断开连接，确保一个连接固定备机。 
     * @return SlaveConst 针对只读账号，设置策略是否固定备机，0：不固定备机，即备机不满足条件与客户端不断开连接，Proxy选择其他可用备机，1：备机不满足条件断开连接，确保一个连接固定备机。
     */
    public Long getSlaveConst() {
        return this.SlaveConst;
    }

    /**
     * Set 针对只读账号，设置策略是否固定备机，0：不固定备机，即备机不满足条件与客户端不断开连接，Proxy选择其他可用备机，1：备机不满足条件断开连接，确保一个连接固定备机。
     * @param SlaveConst 针对只读账号，设置策略是否固定备机，0：不固定备机，即备机不满足条件与客户端不断开连接，Proxy选择其他可用备机，1：备机不满足条件断开连接，确保一个连接固定备机。
     */
    public void setSlaveConst(Long SlaveConst) {
        this.SlaveConst = SlaveConst;
    }

    /**
     * Get 用户最大连接数限制参数。不传或者传0表示为不限制，对应max_user_connections参数，目前10.1内核版本不支持设置。 
     * @return MaxUserConnections 用户最大连接数限制参数。不传或者传0表示为不限制，对应max_user_connections参数，目前10.1内核版本不支持设置。
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set 用户最大连接数限制参数。不传或者传0表示为不限制，对应max_user_connections参数，目前10.1内核版本不支持设置。
     * @param MaxUserConnections 用户最大连接数限制参数。不传或者传0表示为不限制，对应max_user_connections参数，目前10.1内核版本不支持设置。
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    /**
     * Get 使用GetPublicKey返回的RSA2048公钥加密后的密码 
     * @return EncryptedPassword 使用GetPublicKey返回的RSA2048公钥加密后的密码
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set 使用GetPublicKey返回的RSA2048公钥加密后的密码
     * @param EncryptedPassword 使用GetPublicKey返回的RSA2048公钥加密后的密码
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    public CreateAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountRequest(CreateAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DelayThresh != null) {
            this.DelayThresh = new Long(source.DelayThresh);
        }
        if (source.SlaveConst != null) {
            this.SlaveConst = new Long(source.SlaveConst);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DelayThresh", this.DelayThresh);
        this.setParamSimple(map, prefix + "SlaveConst", this.SlaveConst);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);

    }
}

