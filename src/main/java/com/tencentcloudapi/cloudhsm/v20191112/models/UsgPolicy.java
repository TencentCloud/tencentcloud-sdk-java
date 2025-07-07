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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsgPolicy extends AbstractModel {

    /**
    * cidr格式地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 安全组id代表的地址集合
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 地址组id代表的地址集合
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * 协议
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 服务组id代表的协议和端口集合
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * 备注
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 匹配后行为:ACCEPT/DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get cidr格式地址 
     * @return Ip cidr格式地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set cidr格式地址
     * @param Ip cidr格式地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 安全组id代表的地址集合 
     * @return Id 安全组id代表的地址集合
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 安全组id代表的地址集合
     * @param Id 安全组id代表的地址集合
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 地址组id代表的地址集合 
     * @return AddressModule 地址组id代表的地址集合
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set 地址组id代表的地址集合
     * @param AddressModule 地址组id代表的地址集合
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get 协议 
     * @return Proto 协议
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 协议
     * @param Proto 协议
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
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
     * Get 服务组id代表的协议和端口集合 
     * @return ServiceModule 服务组id代表的协议和端口集合
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set 服务组id代表的协议和端口集合
     * @param ServiceModule 服务组id代表的协议和端口集合
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get 备注 
     * @return Desc 备注
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 备注
     * @param Desc 备注
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 匹配后行为:ACCEPT/DROP 
     * @return Action 匹配后行为:ACCEPT/DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 匹配后行为:ACCEPT/DROP
     * @param Action 匹配后行为:ACCEPT/DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public UsgPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsgPolicy(UsgPolicy source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ServiceModule != null) {
            this.ServiceModule = new String(source.ServiceModule);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

