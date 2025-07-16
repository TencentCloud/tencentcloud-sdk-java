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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMultiPathGatewayRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 网关 ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关名称，16 个字符以内，可用字符（a-z,A-Z,0-9,-,_）。
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 网关地址，GatewayType 取值为 private（自有网关）可填入进行修改，使用该地址时，请确保该地址已录入腾讯云多通道安全加速网关系统。如未录入，需要在本接口调用前通过工单或者联系架构师把网关 IP 地址提前录入腾讯云多通道安全加速网关系统。
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
    * 网关端口，范围 1～65535（除去 8888 ），只支持修改 GatewayType 取值为 private 的自有网关。
    */
    @SerializedName("GatewayPort")
    @Expose
    private Long GatewayPort;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 网关 ID。 
     * @return GatewayId 网关 ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关 ID。
     * @param GatewayId 网关 ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关名称，16 个字符以内，可用字符（a-z,A-Z,0-9,-,_）。 
     * @return GatewayName 网关名称，16 个字符以内，可用字符（a-z,A-Z,0-9,-,_）。
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关名称，16 个字符以内，可用字符（a-z,A-Z,0-9,-,_）。
     * @param GatewayName 网关名称，16 个字符以内，可用字符（a-z,A-Z,0-9,-,_）。
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 网关地址，GatewayType 取值为 private（自有网关）可填入进行修改，使用该地址时，请确保该地址已录入腾讯云多通道安全加速网关系统。如未录入，需要在本接口调用前通过工单或者联系架构师把网关 IP 地址提前录入腾讯云多通道安全加速网关系统。 
     * @return GatewayIP 网关地址，GatewayType 取值为 private（自有网关）可填入进行修改，使用该地址时，请确保该地址已录入腾讯云多通道安全加速网关系统。如未录入，需要在本接口调用前通过工单或者联系架构师把网关 IP 地址提前录入腾讯云多通道安全加速网关系统。
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set 网关地址，GatewayType 取值为 private（自有网关）可填入进行修改，使用该地址时，请确保该地址已录入腾讯云多通道安全加速网关系统。如未录入，需要在本接口调用前通过工单或者联系架构师把网关 IP 地址提前录入腾讯云多通道安全加速网关系统。
     * @param GatewayIP 网关地址，GatewayType 取值为 private（自有网关）可填入进行修改，使用该地址时，请确保该地址已录入腾讯云多通道安全加速网关系统。如未录入，需要在本接口调用前通过工单或者联系架构师把网关 IP 地址提前录入腾讯云多通道安全加速网关系统。
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    /**
     * Get 网关端口，范围 1～65535（除去 8888 ），只支持修改 GatewayType 取值为 private 的自有网关。 
     * @return GatewayPort 网关端口，范围 1～65535（除去 8888 ），只支持修改 GatewayType 取值为 private 的自有网关。
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set 网关端口，范围 1～65535（除去 8888 ），只支持修改 GatewayType 取值为 private 的自有网关。
     * @param GatewayPort 网关端口，范围 1～65535（除去 8888 ），只支持修改 GatewayType 取值为 private 的自有网关。
     */
    public void setGatewayPort(Long GatewayPort) {
        this.GatewayPort = GatewayPort;
    }

    public ModifyMultiPathGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMultiPathGatewayRequest(ModifyMultiPathGatewayRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayIP != null) {
            this.GatewayIP = new String(source.GatewayIP);
        }
        if (source.GatewayPort != null) {
            this.GatewayPort = new Long(source.GatewayPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayIP", this.GatewayIP);
        this.setParamSimple(map, prefix + "GatewayPort", this.GatewayPort);

    }
}

