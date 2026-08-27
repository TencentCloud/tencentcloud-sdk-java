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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTEndpointItem extends AbstractModel {

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>接入点</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>vpc信息</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网信息</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>主机</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>接入点ip</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>端口是否打开</p>
    */
    @SerializedName("PortEnable")
    @Expose
    private Boolean PortEnable;

    /**
    * <p>vpce唯一id</p>
    */
    @SerializedName("VpcEndpointId")
    @Expose
    private String VpcEndpointId;

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>接入点</p> 
     * @return Url <p>接入点</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>接入点</p>
     * @param Url <p>接入点</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>vpc信息</p> 
     * @return VpcId <p>vpc信息</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc信息</p>
     * @param VpcId <p>vpc信息</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网信息</p> 
     * @return SubnetId <p>子网信息</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网信息</p>
     * @param SubnetId <p>子网信息</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>主机</p> 
     * @return Host <p>主机</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机</p>
     * @param Host <p>主机</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
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

    /**
     * Get <p>接入点ip</p> 
     * @return Ip <p>接入点ip</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>接入点ip</p>
     * @param Ip <p>接入点ip</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>端口是否打开</p> 
     * @return PortEnable <p>端口是否打开</p>
     */
    public Boolean getPortEnable() {
        return this.PortEnable;
    }

    /**
     * Set <p>端口是否打开</p>
     * @param PortEnable <p>端口是否打开</p>
     */
    public void setPortEnable(Boolean PortEnable) {
        this.PortEnable = PortEnable;
    }

    /**
     * Get <p>vpce唯一id</p> 
     * @return VpcEndpointId <p>vpce唯一id</p>
     */
    public String getVpcEndpointId() {
        return this.VpcEndpointId;
    }

    /**
     * Set <p>vpce唯一id</p>
     * @param VpcEndpointId <p>vpce唯一id</p>
     */
    public void setVpcEndpointId(String VpcEndpointId) {
        this.VpcEndpointId = VpcEndpointId;
    }

    public MQTTEndpointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTEndpointItem(MQTTEndpointItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.PortEnable != null) {
            this.PortEnable = new Boolean(source.PortEnable);
        }
        if (source.VpcEndpointId != null) {
            this.VpcEndpointId = new String(source.VpcEndpointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "PortEnable", this.PortEnable);
        this.setParamSimple(map, prefix + "VpcEndpointId", this.VpcEndpointId);

    }
}

