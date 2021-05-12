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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InboundPermissionAuthorization extends AbstractModel{

    /**
    * 起始端口号
    */
    @SerializedName("FromPort")
    @Expose
    private Long FromPort;

    /**
    * IP 端范围，CIDR方式划分
    */
    @SerializedName("IpRange")
    @Expose
    private String IpRange;

    /**
    * 协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 终止端口号
    */
    @SerializedName("ToPort")
    @Expose
    private Long ToPort;

    /**
     * Get 起始端口号 
     * @return FromPort 起始端口号
     */
    public Long getFromPort() {
        return this.FromPort;
    }

    /**
     * Set 起始端口号
     * @param FromPort 起始端口号
     */
    public void setFromPort(Long FromPort) {
        this.FromPort = FromPort;
    }

    /**
     * Get IP 端范围，CIDR方式划分 
     * @return IpRange IP 端范围，CIDR方式划分
     */
    public String getIpRange() {
        return this.IpRange;
    }

    /**
     * Set IP 端范围，CIDR方式划分
     * @param IpRange IP 端范围，CIDR方式划分
     */
    public void setIpRange(String IpRange) {
        this.IpRange = IpRange;
    }

    /**
     * Get 协议类型 
     * @return Protocol 协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型
     * @param Protocol 协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 终止端口号 
     * @return ToPort 终止端口号
     */
    public Long getToPort() {
        return this.ToPort;
    }

    /**
     * Set 终止端口号
     * @param ToPort 终止端口号
     */
    public void setToPort(Long ToPort) {
        this.ToPort = ToPort;
    }

    public InboundPermissionAuthorization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InboundPermissionAuthorization(InboundPermissionAuthorization source) {
        if (source.FromPort != null) {
            this.FromPort = new Long(source.FromPort);
        }
        if (source.IpRange != null) {
            this.IpRange = new String(source.IpRange);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ToPort != null) {
            this.ToPort = new Long(source.ToPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromPort", this.FromPort);
        this.setParamSimple(map, prefix + "IpRange", this.IpRange);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ToPort", this.ToPort);

    }
}

