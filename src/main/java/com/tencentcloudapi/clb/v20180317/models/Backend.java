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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backend  extends AbstractModel{

    /**
    * 转发目标的类型，目前仅可取值为 CVM
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 后端云服务器监听端口
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 后端云服务器的转发权重，取值范围：0~100，默认为 10。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
    * 云服务器的外网 IP
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 云服务器的内网 IP
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 云服务器实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 云服务器被绑定到监听器的时间
    */
    @SerializedName("RegisteredTime")
    @Expose
    private String RegisteredTime;

    /**
     * 获取转发目标的类型，目前仅可取值为 CVM
     * @return Type 转发目标的类型，目前仅可取值为 CVM
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置转发目标的类型，目前仅可取值为 CVM
     * @param Type 转发目标的类型，目前仅可取值为 CVM
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
     * @return InstanceId 云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
     * @param InstanceId 云服务器的唯一 ID，可通过 DescribeInstances 接口返回字段中的 unInstanceId 字段获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取后端云服务器监听端口
     * @return Port 后端云服务器监听端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置后端云服务器监听端口
     * @param Port 后端云服务器监听端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取后端云服务器的转发权重，取值范围：0~100，默认为 10。
     * @return Weight 后端云服务器的转发权重，取值范围：0~100，默认为 10。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置后端云服务器的转发权重，取值范围：0~100，默认为 10。
     * @param Weight 后端云服务器的转发权重，取值范围：0~100，默认为 10。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取云服务器的外网 IP
     * @return PublicIpAddresses 云服务器的外网 IP
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * 设置云服务器的外网 IP
     * @param PublicIpAddresses 云服务器的外网 IP
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * 获取云服务器的内网 IP
     * @return PrivateIpAddresses 云服务器的内网 IP
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * 设置云服务器的内网 IP
     * @param PrivateIpAddresses 云服务器的内网 IP
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * 获取云服务器实例名称
     * @return InstanceName 云服务器实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置云服务器实例名称
     * @param InstanceName 云服务器实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取云服务器被绑定到监听器的时间
     * @return RegisteredTime 云服务器被绑定到监听器的时间
     */
    public String getRegisteredTime() {
        return this.RegisteredTime;
    }

    /**
     * 设置云服务器被绑定到监听器的时间
     * @param RegisteredTime 云服务器被绑定到监听器的时间
     */
    public void setRegisteredTime(String RegisteredTime) {
        this.RegisteredTime = RegisteredTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);

    }
}

