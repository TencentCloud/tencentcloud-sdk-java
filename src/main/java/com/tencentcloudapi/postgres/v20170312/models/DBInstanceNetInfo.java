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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstanceNetInfo extends AbstractModel {

    /**
    * DNS域名
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 连接Port地址
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
     * Get DNS域名 
     * @return Address DNS域名
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set DNS域名
     * @param Address DNS域名
     */
    public void setAddress(String Address) {
        this.Address = Address;
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
     * Get 连接Port地址 
     * @return Port 连接Port地址
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 连接Port地址
     * @param Port 连接Port地址
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）； 
     * @return NetType 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
     * @param NetType 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）； 
     * @return Status 网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；
     * @param Status 网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法） 
     * @return ProtocolType 连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）
     * @param ProtocolType 连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    public DBInstanceNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstanceNetInfo(DBInstanceNetInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);

    }
}

