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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbTargetItem extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>内网IP地址</p>
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String PrivateIpAddresses;

    /**
    * <p>网卡ID</p>
    */
    @SerializedName("EniID")
    @Expose
    private String EniID;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>内网IP地址</p> 
     * @return PrivateIpAddresses <p>内网IP地址</p>
     */
    public String getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set <p>内网IP地址</p>
     * @param PrivateIpAddresses <p>内网IP地址</p>
     */
    public void setPrivateIpAddresses(String PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get <p>网卡ID</p> 
     * @return EniID <p>网卡ID</p>
     */
    public String getEniID() {
        return this.EniID;
    }

    /**
     * Set <p>网卡ID</p>
     * @param EniID <p>网卡ID</p>
     */
    public void setEniID(String EniID) {
        this.EniID = EniID;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public ClbTargetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbTargetItem(ClbTargetItem source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String(source.PrivateIpAddresses);
        }
        if (source.EniID != null) {
            this.EniID = new String(source.EniID);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PrivateIpAddresses", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "EniID", this.EniID);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

