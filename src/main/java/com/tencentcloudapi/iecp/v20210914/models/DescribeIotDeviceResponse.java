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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIotDeviceResponse extends AbstractModel{

    /**
    * 设备id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * ssl证书
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * ssl私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * psk认证密钥
    */
    @SerializedName("Psk")
    @Expose
    private String Psk;

    /**
    * 设备是否打开
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 设备日志
    */
    @SerializedName("LogSetting")
    @Expose
    private Long LogSetting;

    /**
    * 设备日志级别
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
    * mqtt参数
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * mqtt参数
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * mqtt参数
    */
    @SerializedName("ClientID")
    @Expose
    private String ClientID;

    /**
    * 16进制的psk格式
    */
    @SerializedName("PskHex")
    @Expose
    private String PskHex;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备在线状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 无
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 无
    */
    @SerializedName("UnitID")
    @Expose
    private Long UnitID;

    /**
    * 无
    */
    @SerializedName("UnitName")
    @Expose
    private String UnitName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备id 
     * @return Id 设备id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 设备id
     * @param Id 设备id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备名称 
     * @return Name 设备名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称
     * @param Name 设备名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get ssl证书 
     * @return Cert ssl证书
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set ssl证书
     * @param Cert ssl证书
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get ssl私钥 
     * @return PrivateKey ssl私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set ssl私钥
     * @param PrivateKey ssl私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get psk认证密钥 
     * @return Psk psk认证密钥
     */
    public String getPsk() {
        return this.Psk;
    }

    /**
     * Set psk认证密钥
     * @param Psk psk认证密钥
     */
    public void setPsk(String Psk) {
        this.Psk = Psk;
    }

    /**
     * Get 设备是否打开 
     * @return Disabled 设备是否打开
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 设备是否打开
     * @param Disabled 设备是否打开
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 设备日志 
     * @return LogSetting 设备日志
     */
    public Long getLogSetting() {
        return this.LogSetting;
    }

    /**
     * Set 设备日志
     * @param LogSetting 设备日志
     */
    public void setLogSetting(Long LogSetting) {
        this.LogSetting = LogSetting;
    }

    /**
     * Get 设备日志级别 
     * @return LogLevel 设备日志级别
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 设备日志级别
     * @param LogLevel 设备日志级别
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get mqtt参数 
     * @return UserName mqtt参数
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set mqtt参数
     * @param UserName mqtt参数
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get mqtt参数 
     * @return Password mqtt参数
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set mqtt参数
     * @param Password mqtt参数
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get mqtt参数 
     * @return ClientID mqtt参数
     */
    public String getClientID() {
        return this.ClientID;
    }

    /**
     * Set mqtt参数
     * @param ClientID mqtt参数
     */
    public void setClientID(String ClientID) {
        this.ClientID = ClientID;
    }

    /**
     * Get 16进制的psk格式 
     * @return PskHex 16进制的psk格式
     */
    public String getPskHex() {
        return this.PskHex;
    }

    /**
     * Set 16进制的psk格式
     * @param PskHex 16进制的psk格式
     */
    public void setPskHex(String PskHex) {
        this.PskHex = PskHex;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备在线状态 
     * @return Status 设备在线状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备在线状态
     * @param Status 设备在线状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 无 
     * @return Region 无
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 无
     * @param Region 无
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 无 
     * @return UnitID 无
     */
    public Long getUnitID() {
        return this.UnitID;
    }

    /**
     * Set 无
     * @param UnitID 无
     */
    public void setUnitID(Long UnitID) {
        this.UnitID = UnitID;
    }

    /**
     * Get 无 
     * @return UnitName 无
     */
    public String getUnitName() {
        return this.UnitName;
    }

    /**
     * Set 无
     * @param UnitName 无
     */
    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIotDeviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIotDeviceResponse(DescribeIotDeviceResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.Psk != null) {
            this.Psk = new String(source.Psk);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.LogSetting != null) {
            this.LogSetting = new Long(source.LogSetting);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ClientID != null) {
            this.ClientID = new String(source.ClientID);
        }
        if (source.PskHex != null) {
            this.PskHex = new String(source.PskHex);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.UnitID != null) {
            this.UnitID = new Long(source.UnitID);
        }
        if (source.UnitName != null) {
            this.UnitName = new String(source.UnitName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "Psk", this.Psk);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "LogSetting", this.LogSetting);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ClientID", this.ClientID);
        this.setParamSimple(map, prefix + "PskHex", this.PskHex);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "UnitID", this.UnitID);
        this.setParamSimple(map, prefix + "UnitName", this.UnitName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

