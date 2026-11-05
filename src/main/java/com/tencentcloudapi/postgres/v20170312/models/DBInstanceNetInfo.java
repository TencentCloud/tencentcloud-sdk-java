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
    * <p>DNS域名</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>IP地址</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>连接Port地址</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
     * Get <p>DNS域名</p> 
     * @return Address <p>DNS域名</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>DNS域名</p>
     * @param Address <p>DNS域名</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>IP地址</p> 
     * @return Ip <p>IP地址</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP地址</p>
     * @param Ip <p>IP地址</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>连接Port地址</p> 
     * @return Port <p>连接Port地址</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>连接Port地址</p>
     * @param Port <p>连接Port地址</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；</p> 
     * @return NetType <p>网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；</p>
     * @param NetType <p>网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；</p> 
     * @return Status <p>网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；</p>
     * @param Status <p>网络连接状态，1、initing（未开通）；2、opened（已开通）；3、closed（已关闭）；4、opening（开通中）；5、closing（关闭中）；</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return VpcId <p>私有网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param VpcId <p>私有网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）</p> 
     * @return ProtocolType <p>连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）</p>
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）</p>
     * @param ProtocolType <p>连接数据库的协议类型，当前支持：postgresql、mssql（MSSQL兼容语法）</p>
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

