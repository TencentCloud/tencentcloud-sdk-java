/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraDBClusterSrcInfo extends AbstractModel {

    /**
    * 源端类型
    */
    @SerializedName("SrcInstanceType")
    @Expose
    private String SrcInstanceType;

    /**
    * 网络类型
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 源端实例ID
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 源端集群ID
    */
    @SerializedName("SrcClusterId")
    @Expose
    private String SrcClusterId;

    /**
    * 地址
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 源端sql_mode
    */
    @SerializedName("SqlMode")
    @Expose
    private String SqlMode;

    /**
    * 源端应用id
    */
    @SerializedName("SrcAppId")
    @Expose
    private Long SrcAppId;

    /**
    * 源端账号
    */
    @SerializedName("SrcUin")
    @Expose
    private String SrcUin;

    /**
    * 源端子账号
    */
    @SerializedName("SrcSubAccountUin")
    @Expose
    private String SrcSubAccountUin;

    /**
    * 账号
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * 源端实例地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 对源端实例的操作
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 源端类型 
     * @return SrcInstanceType 源端类型
     */
    public String getSrcInstanceType() {
        return this.SrcInstanceType;
    }

    /**
     * Set 源端类型
     * @param SrcInstanceType 源端类型
     */
    public void setSrcInstanceType(String SrcInstanceType) {
        this.SrcInstanceType = SrcInstanceType;
    }

    /**
     * Get 网络类型 
     * @return AccessType 网络类型
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 网络类型
     * @param AccessType 网络类型
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 源端实例ID 
     * @return SrcInstanceId 源端实例ID
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源端实例ID
     * @param SrcInstanceId 源端实例ID
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 源端集群ID 
     * @return SrcClusterId 源端集群ID
     */
    public String getSrcClusterId() {
        return this.SrcClusterId;
    }

    /**
     * Set 源端集群ID
     * @param SrcClusterId 源端集群ID
     */
    public void setSrcClusterId(String SrcClusterId) {
        this.SrcClusterId = SrcClusterId;
    }

    /**
     * Get 地址 
     * @return IP 地址
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 地址
     * @param IP 地址
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 用户名 
     * @return User 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
     * @param User 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 源端sql_mode 
     * @return SqlMode 源端sql_mode
     */
    public String getSqlMode() {
        return this.SqlMode;
    }

    /**
     * Set 源端sql_mode
     * @param SqlMode 源端sql_mode
     */
    public void setSqlMode(String SqlMode) {
        this.SqlMode = SqlMode;
    }

    /**
     * Get 源端应用id 
     * @return SrcAppId 源端应用id
     */
    public Long getSrcAppId() {
        return this.SrcAppId;
    }

    /**
     * Set 源端应用id
     * @param SrcAppId 源端应用id
     */
    public void setSrcAppId(Long SrcAppId) {
        this.SrcAppId = SrcAppId;
    }

    /**
     * Get 源端账号 
     * @return SrcUin 源端账号
     */
    public String getSrcUin() {
        return this.SrcUin;
    }

    /**
     * Set 源端账号
     * @param SrcUin 源端账号
     */
    public void setSrcUin(String SrcUin) {
        this.SrcUin = SrcUin;
    }

    /**
     * Get 源端子账号 
     * @return SrcSubAccountUin 源端子账号
     */
    public String getSrcSubAccountUin() {
        return this.SrcSubAccountUin;
    }

    /**
     * Set 源端子账号
     * @param SrcSubAccountUin 源端子账号
     */
    public void setSrcSubAccountUin(String SrcSubAccountUin) {
        this.SrcSubAccountUin = SrcSubAccountUin;
    }

    /**
     * Get 账号 
     * @return AccountMode 账号
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set 账号
     * @param AccountMode 账号
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get 源端实例地域 
     * @return Region 源端实例地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 源端实例地域
     * @param Region 源端实例地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 对源端实例的操作 
     * @return Operation 对源端实例的操作
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 对源端实例的操作
     * @param Operation 对源端实例的操作
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public LibraDBClusterSrcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBClusterSrcInfo(LibraDBClusterSrcInfo source) {
        if (source.SrcInstanceType != null) {
            this.SrcInstanceType = new String(source.SrcInstanceType);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.SrcClusterId != null) {
            this.SrcClusterId = new String(source.SrcClusterId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SqlMode != null) {
            this.SqlMode = new String(source.SqlMode);
        }
        if (source.SrcAppId != null) {
            this.SrcAppId = new Long(source.SrcAppId);
        }
        if (source.SrcUin != null) {
            this.SrcUin = new String(source.SrcUin);
        }
        if (source.SrcSubAccountUin != null) {
            this.SrcSubAccountUin = new String(source.SrcSubAccountUin);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceType", this.SrcInstanceType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "SrcClusterId", this.SrcClusterId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SqlMode", this.SqlMode);
        this.setParamSimple(map, prefix + "SrcAppId", this.SrcAppId);
        this.setParamSimple(map, prefix + "SrcUin", this.SrcUin);
        this.setParamSimple(map, prefix + "SrcSubAccountUin", this.SrcSubAccountUin);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

