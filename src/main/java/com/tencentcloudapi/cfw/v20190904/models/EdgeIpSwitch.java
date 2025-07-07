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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeIpSwitch extends AbstractModel {

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * vpc 中第一个EIP开关打开，需要指定子网创建私有连接
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建私有连接指定IP
    */
    @SerializedName("EndpointIp")
    @Expose
    private String EndpointIp;

    /**
    * 0 : 旁路 1 : 串行
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get vpc 中第一个EIP开关打开，需要指定子网创建私有连接 
     * @return SubnetId vpc 中第一个EIP开关打开，需要指定子网创建私有连接
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc 中第一个EIP开关打开，需要指定子网创建私有连接
     * @param SubnetId vpc 中第一个EIP开关打开，需要指定子网创建私有连接
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 创建私有连接指定IP 
     * @return EndpointIp 创建私有连接指定IP
     */
    public String getEndpointIp() {
        return this.EndpointIp;
    }

    /**
     * Set 创建私有连接指定IP
     * @param EndpointIp 创建私有连接指定IP
     */
    public void setEndpointIp(String EndpointIp) {
        this.EndpointIp = EndpointIp;
    }

    /**
     * Get 0 : 旁路 1 : 串行 
     * @return SwitchMode 0 : 旁路 1 : 串行
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 0 : 旁路 1 : 串行
     * @param SwitchMode 0 : 旁路 1 : 串行
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    public EdgeIpSwitch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeIpSwitch(EdgeIpSwitch source) {
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EndpointIp != null) {
            this.EndpointIp = new String(source.EndpointIp);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EndpointIp", this.EndpointIp);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);

    }
}

