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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkInterfaceAttributeRequest extends AbstractModel{

    /**
    * 弹性网卡实例ID，例如：eni-pxir56ns。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 弹性网卡名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * 弹性网卡描述，可任意命名，但不得超过60个字符。
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * 指定绑定的安全组，例如:['sg-1dd51d']。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。
    */
    @SerializedName("TrunkingFlag")
    @Expose
    private String TrunkingFlag;

    /**
     * Get 弹性网卡实例ID，例如：eni-pxir56ns。 
     * @return NetworkInterfaceId 弹性网卡实例ID，例如：eni-pxir56ns。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 弹性网卡实例ID，例如：eni-pxir56ns。
     * @param NetworkInterfaceId 弹性网卡实例ID，例如：eni-pxir56ns。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 弹性网卡名称，最大长度不能超过60个字节。 
     * @return NetworkInterfaceName 弹性网卡名称，最大长度不能超过60个字节。
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set 弹性网卡名称，最大长度不能超过60个字节。
     * @param NetworkInterfaceName 弹性网卡名称，最大长度不能超过60个字节。
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get 弹性网卡描述，可任意命名，但不得超过60个字符。 
     * @return NetworkInterfaceDescription 弹性网卡描述，可任意命名，但不得超过60个字符。
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set 弹性网卡描述，可任意命名，但不得超过60个字符。
     * @param NetworkInterfaceDescription 弹性网卡描述，可任意命名，但不得超过60个字符。
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get 指定绑定的安全组，例如:['sg-1dd51d']。 
     * @return SecurityGroupIds 指定绑定的安全组，例如:['sg-1dd51d']。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 指定绑定的安全组，例如:['sg-1dd51d']。
     * @param SecurityGroupIds 指定绑定的安全组，例如:['sg-1dd51d']。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。 
     * @return TrunkingFlag 网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。
     */
    public String getTrunkingFlag() {
        return this.TrunkingFlag;
    }

    /**
     * Set 网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。
     * @param TrunkingFlag 网卡trunking模式设置，Enable-开启，Disable--关闭，默认关闭。
     */
    public void setTrunkingFlag(String TrunkingFlag) {
        this.TrunkingFlag = TrunkingFlag;
    }

    public ModifyNetworkInterfaceAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkInterfaceAttributeRequest(ModifyNetworkInterfaceAttributeRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.TrunkingFlag != null) {
            this.TrunkingFlag = new String(source.TrunkingFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "TrunkingFlag", this.TrunkingFlag);

    }
}

