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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateSource extends AbstractModel{

    /**
    * 迁移源实例的ID，MigrateType=1(TencentDB for SQLServers)时使用，格式如：mssql-si2823jyl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 迁移源Cvm的ID，MigrateType=2(云服务器自建SQLServer数据库)时使用
    */
    @SerializedName("CvmId")
    @Expose
    private String CvmId;

    /**
    * 迁移源Cvm的Vpc网络标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：vpc-6ys9ont9
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 迁移源Cvm的Vpc下的子网标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：subnet-h9extioi
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 用户名，MigrateType=1或MigrateType=2使用
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 密码，MigrateType=1或MigrateType=2使用
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 迁移源Cvm自建库的内网IP，MigrateType=2(云服务器自建SQLServer数据库)时使用
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 迁移源Cvm自建库的端口号，MigrateType=2(云服务器自建SQLServer数据库)时使用
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 离线迁移的源备份地址，MigrateType=4或MigrateType=5使用
    */
    @SerializedName("Url")
    @Expose
    private String [] Url;

    /**
    * 离线迁移的源备份密码，MigrateType=4或MigrateType=5使用
    */
    @SerializedName("UrlPassword")
    @Expose
    private String UrlPassword;

    /**
     * Get 迁移源实例的ID，MigrateType=1(TencentDB for SQLServers)时使用，格式如：mssql-si2823jyl 
     * @return InstanceId 迁移源实例的ID，MigrateType=1(TencentDB for SQLServers)时使用，格式如：mssql-si2823jyl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 迁移源实例的ID，MigrateType=1(TencentDB for SQLServers)时使用，格式如：mssql-si2823jyl
     * @param InstanceId 迁移源实例的ID，MigrateType=1(TencentDB for SQLServers)时使用，格式如：mssql-si2823jyl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 迁移源Cvm的ID，MigrateType=2(云服务器自建SQLServer数据库)时使用 
     * @return CvmId 迁移源Cvm的ID，MigrateType=2(云服务器自建SQLServer数据库)时使用
     */
    public String getCvmId() {
        return this.CvmId;
    }

    /**
     * Set 迁移源Cvm的ID，MigrateType=2(云服务器自建SQLServer数据库)时使用
     * @param CvmId 迁移源Cvm的ID，MigrateType=2(云服务器自建SQLServer数据库)时使用
     */
    public void setCvmId(String CvmId) {
        this.CvmId = CvmId;
    }

    /**
     * Get 迁移源Cvm的Vpc网络标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：vpc-6ys9ont9 
     * @return VpcId 迁移源Cvm的Vpc网络标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：vpc-6ys9ont9
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 迁移源Cvm的Vpc网络标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：vpc-6ys9ont9
     * @param VpcId 迁移源Cvm的Vpc网络标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：vpc-6ys9ont9
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 迁移源Cvm的Vpc下的子网标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：subnet-h9extioi 
     * @return SubnetId 迁移源Cvm的Vpc下的子网标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：subnet-h9extioi
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 迁移源Cvm的Vpc下的子网标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：subnet-h9extioi
     * @param SubnetId 迁移源Cvm的Vpc下的子网标识，MigrateType=2(云服务器自建SQLServer数据库)时使用，格式如：subnet-h9extioi
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 用户名，MigrateType=1或MigrateType=2使用 
     * @return UserName 用户名，MigrateType=1或MigrateType=2使用
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名，MigrateType=1或MigrateType=2使用
     * @param UserName 用户名，MigrateType=1或MigrateType=2使用
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 密码，MigrateType=1或MigrateType=2使用 
     * @return Password 密码，MigrateType=1或MigrateType=2使用
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，MigrateType=1或MigrateType=2使用
     * @param Password 密码，MigrateType=1或MigrateType=2使用
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 迁移源Cvm自建库的内网IP，MigrateType=2(云服务器自建SQLServer数据库)时使用 
     * @return Ip 迁移源Cvm自建库的内网IP，MigrateType=2(云服务器自建SQLServer数据库)时使用
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 迁移源Cvm自建库的内网IP，MigrateType=2(云服务器自建SQLServer数据库)时使用
     * @param Ip 迁移源Cvm自建库的内网IP，MigrateType=2(云服务器自建SQLServer数据库)时使用
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 迁移源Cvm自建库的端口号，MigrateType=2(云服务器自建SQLServer数据库)时使用 
     * @return Port 迁移源Cvm自建库的端口号，MigrateType=2(云服务器自建SQLServer数据库)时使用
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 迁移源Cvm自建库的端口号，MigrateType=2(云服务器自建SQLServer数据库)时使用
     * @param Port 迁移源Cvm自建库的端口号，MigrateType=2(云服务器自建SQLServer数据库)时使用
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 离线迁移的源备份地址，MigrateType=4或MigrateType=5使用 
     * @return Url 离线迁移的源备份地址，MigrateType=4或MigrateType=5使用
     */
    public String [] getUrl() {
        return this.Url;
    }

    /**
     * Set 离线迁移的源备份地址，MigrateType=4或MigrateType=5使用
     * @param Url 离线迁移的源备份地址，MigrateType=4或MigrateType=5使用
     */
    public void setUrl(String [] Url) {
        this.Url = Url;
    }

    /**
     * Get 离线迁移的源备份密码，MigrateType=4或MigrateType=5使用 
     * @return UrlPassword 离线迁移的源备份密码，MigrateType=4或MigrateType=5使用
     */
    public String getUrlPassword() {
        return this.UrlPassword;
    }

    /**
     * Set 离线迁移的源备份密码，MigrateType=4或MigrateType=5使用
     * @param UrlPassword 离线迁移的源备份密码，MigrateType=4或MigrateType=5使用
     */
    public void setUrlPassword(String UrlPassword) {
        this.UrlPassword = UrlPassword;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CvmId", this.CvmId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "Url.", this.Url);
        this.setParamSimple(map, prefix + "UrlPassword", this.UrlPassword);

    }
}

