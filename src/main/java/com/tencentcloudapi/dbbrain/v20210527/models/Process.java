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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Process extends AbstractModel{

    /**
    * 会话 ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 访问来源，IP 地址和端口号。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 文件描述符。
    */
    @SerializedName("FileDescriptor")
    @Expose
    private Long FileDescriptor;

    /**
    * 会话名称，使用 CLIENT SETNAME 命令设置。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 最后一次执行的命令。
    */
    @SerializedName("LastCommand")
    @Expose
    private String LastCommand;

    /**
    * 会话存活时间，单位：秒。
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 最后一次执行命令后空闲的时间，单位：秒。
    */
    @SerializedName("Idle")
    @Expose
    private Long Idle;

    /**
    * 会话所属的 Proxy节点 ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get 会话 ID。 
     * @return Id 会话 ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 会话 ID。
     * @param Id 会话 ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 访问来源，IP 地址和端口号。 
     * @return Address 访问来源，IP 地址和端口号。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 访问来源，IP 地址和端口号。
     * @param Address 访问来源，IP 地址和端口号。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 文件描述符。 
     * @return FileDescriptor 文件描述符。
     */
    public Long getFileDescriptor() {
        return this.FileDescriptor;
    }

    /**
     * Set 文件描述符。
     * @param FileDescriptor 文件描述符。
     */
    public void setFileDescriptor(Long FileDescriptor) {
        this.FileDescriptor = FileDescriptor;
    }

    /**
     * Get 会话名称，使用 CLIENT SETNAME 命令设置。 
     * @return Name 会话名称，使用 CLIENT SETNAME 命令设置。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 会话名称，使用 CLIENT SETNAME 命令设置。
     * @param Name 会话名称，使用 CLIENT SETNAME 命令设置。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 最后一次执行的命令。 
     * @return LastCommand 最后一次执行的命令。
     */
    public String getLastCommand() {
        return this.LastCommand;
    }

    /**
     * Set 最后一次执行的命令。
     * @param LastCommand 最后一次执行的命令。
     */
    public void setLastCommand(String LastCommand) {
        this.LastCommand = LastCommand;
    }

    /**
     * Get 会话存活时间，单位：秒。 
     * @return Age 会话存活时间，单位：秒。
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 会话存活时间，单位：秒。
     * @param Age 会话存活时间，单位：秒。
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 最后一次执行命令后空闲的时间，单位：秒。 
     * @return Idle 最后一次执行命令后空闲的时间，单位：秒。
     */
    public Long getIdle() {
        return this.Idle;
    }

    /**
     * Set 最后一次执行命令后空闲的时间，单位：秒。
     * @param Idle 最后一次执行命令后空闲的时间，单位：秒。
     */
    public void setIdle(Long Idle) {
        this.Idle = Idle;
    }

    /**
     * Get 会话所属的 Proxy节点 ID。 
     * @return ProxyId 会话所属的 Proxy节点 ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 会话所属的 Proxy节点 ID。
     * @param ProxyId 会话所属的 Proxy节点 ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    public Process() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Process(Process source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.FileDescriptor != null) {
            this.FileDescriptor = new Long(source.FileDescriptor);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LastCommand != null) {
            this.LastCommand = new String(source.LastCommand);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Idle != null) {
            this.Idle = new Long(source.Idle);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "FileDescriptor", this.FileDescriptor);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LastCommand", this.LastCommand);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Idle", this.Idle);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

