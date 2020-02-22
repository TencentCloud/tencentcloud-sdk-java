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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostedDeviceOutBandInfo extends AbstractModel{

    /**
    * 物理机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 带外IP
    */
    @SerializedName("OutBandIp")
    @Expose
    private String OutBandIp;

    /**
    * VPN的IP
    */
    @SerializedName("VpnIp")
    @Expose
    private String VpnIp;

    /**
    * VPN的端口
    */
    @SerializedName("VpnPort")
    @Expose
    private Long VpnPort;

    /**
     * Get 物理机ID 
     * @return InstanceId 物理机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 物理机ID
     * @param InstanceId 物理机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 带外IP 
     * @return OutBandIp 带外IP
     */
    public String getOutBandIp() {
        return this.OutBandIp;
    }

    /**
     * Set 带外IP
     * @param OutBandIp 带外IP
     */
    public void setOutBandIp(String OutBandIp) {
        this.OutBandIp = OutBandIp;
    }

    /**
     * Get VPN的IP 
     * @return VpnIp VPN的IP
     */
    public String getVpnIp() {
        return this.VpnIp;
    }

    /**
     * Set VPN的IP
     * @param VpnIp VPN的IP
     */
    public void setVpnIp(String VpnIp) {
        this.VpnIp = VpnIp;
    }

    /**
     * Get VPN的端口 
     * @return VpnPort VPN的端口
     */
    public Long getVpnPort() {
        return this.VpnPort;
    }

    /**
     * Set VPN的端口
     * @param VpnPort VPN的端口
     */
    public void setVpnPort(Long VpnPort) {
        this.VpnPort = VpnPort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OutBandIp", this.OutBandIp);
        this.setParamSimple(map, prefix + "VpnIp", this.VpnIp);
        this.setParamSimple(map, prefix + "VpnPort", this.VpnPort);

    }
}

