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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalDevice extends AbstractModel {

    /**
    * 操作系统名称，只能是Linux、Windows或MySQL
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 管理端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 主机名，可为空
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资产所属的部门ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 资产多节点：字段ip和端口
    */
    @SerializedName("IpPortSet")
    @Expose
    private String [] IpPortSet;

    /**
    * 是否启用SSL,1:启用 0：禁用，仅支持Redis资产
    */
    @SerializedName("EnableSSL")
    @Expose
    private Long EnableSSL;

    /**
    * SSL证书，EnableSSL时必填
    */
    @SerializedName("SSLCert")
    @Expose
    private String SSLCert;

    /**
    * SSL证书名称，EnableSSL时必填
    */
    @SerializedName("SSLCertName")
    @Expose
    private String SSLCertName;

    /**
     * Get 操作系统名称，只能是Linux、Windows或MySQL 
     * @return OsName 操作系统名称，只能是Linux、Windows或MySQL
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称，只能是Linux、Windows或MySQL
     * @param OsName 操作系统名称，只能是Linux、Windows或MySQL
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 管理端口 
     * @return Port 管理端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 管理端口
     * @param Port 管理端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 主机名，可为空 
     * @return Name 主机名，可为空
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主机名，可为空
     * @param Name 主机名，可为空
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资产所属的部门ID 
     * @return DepartmentId 资产所属的部门ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 资产所属的部门ID
     * @param DepartmentId 资产所属的部门ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 资产多节点：字段ip和端口 
     * @return IpPortSet 资产多节点：字段ip和端口
     */
    public String [] getIpPortSet() {
        return this.IpPortSet;
    }

    /**
     * Set 资产多节点：字段ip和端口
     * @param IpPortSet 资产多节点：字段ip和端口
     */
    public void setIpPortSet(String [] IpPortSet) {
        this.IpPortSet = IpPortSet;
    }

    /**
     * Get 是否启用SSL,1:启用 0：禁用，仅支持Redis资产 
     * @return EnableSSL 是否启用SSL,1:启用 0：禁用，仅支持Redis资产
     */
    public Long getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set 是否启用SSL,1:启用 0：禁用，仅支持Redis资产
     * @param EnableSSL 是否启用SSL,1:启用 0：禁用，仅支持Redis资产
     */
    public void setEnableSSL(Long EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get SSL证书，EnableSSL时必填 
     * @return SSLCert SSL证书，EnableSSL时必填
     */
    public String getSSLCert() {
        return this.SSLCert;
    }

    /**
     * Set SSL证书，EnableSSL时必填
     * @param SSLCert SSL证书，EnableSSL时必填
     */
    public void setSSLCert(String SSLCert) {
        this.SSLCert = SSLCert;
    }

    /**
     * Get SSL证书名称，EnableSSL时必填 
     * @return SSLCertName SSL证书名称，EnableSSL时必填
     */
    public String getSSLCertName() {
        return this.SSLCertName;
    }

    /**
     * Set SSL证书名称，EnableSSL时必填
     * @param SSLCertName SSL证书名称，EnableSSL时必填
     */
    public void setSSLCertName(String SSLCertName) {
        this.SSLCertName = SSLCertName;
    }

    public ExternalDevice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalDevice(ExternalDevice source) {
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.IpPortSet != null) {
            this.IpPortSet = new String[source.IpPortSet.length];
            for (int i = 0; i < source.IpPortSet.length; i++) {
                this.IpPortSet[i] = new String(source.IpPortSet[i]);
            }
        }
        if (source.EnableSSL != null) {
            this.EnableSSL = new Long(source.EnableSSL);
        }
        if (source.SSLCert != null) {
            this.SSLCert = new String(source.SSLCert);
        }
        if (source.SSLCertName != null) {
            this.SSLCertName = new String(source.SSLCertName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamArraySimple(map, prefix + "IpPortSet.", this.IpPortSet);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "SSLCert", this.SSLCert);
        this.setParamSimple(map, prefix + "SSLCertName", this.SSLCertName);

    }
}

