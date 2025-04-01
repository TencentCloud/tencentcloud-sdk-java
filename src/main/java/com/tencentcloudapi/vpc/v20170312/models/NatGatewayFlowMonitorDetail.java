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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayFlowMonitorDetail extends AbstractModel {

    /**
    * 来源`IP`。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 入包量。
    */
    @SerializedName("InPkg")
    @Expose
    private Long InPkg;

    /**
    * 出包量。
    */
    @SerializedName("OutPkg")
    @Expose
    private Long OutPkg;

    /**
    * 入流量，单位：`Byte`。
    */
    @SerializedName("InTraffic")
    @Expose
    private Long InTraffic;

    /**
    * 出流量，单位：`Byte`。
    */
    @SerializedName("OutTraffic")
    @Expose
    private Long OutTraffic;

    /**
    * 并发连接数。仅标准型nat支持此参数。
    */
    @SerializedName("ConcurrentConnectionCount")
    @Expose
    private Long ConcurrentConnectionCount;

    /**
    * 新建连接速率。仅标准型nat支持此参数。
    */
    @SerializedName("NewConnectionRate")
    @Expose
    private Long NewConnectionRate;

    /**
     * Get 来源`IP`。 
     * @return PrivateIpAddress 来源`IP`。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 来源`IP`。
     * @param PrivateIpAddress 来源`IP`。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 入包量。 
     * @return InPkg 入包量。
     */
    public Long getInPkg() {
        return this.InPkg;
    }

    /**
     * Set 入包量。
     * @param InPkg 入包量。
     */
    public void setInPkg(Long InPkg) {
        this.InPkg = InPkg;
    }

    /**
     * Get 出包量。 
     * @return OutPkg 出包量。
     */
    public Long getOutPkg() {
        return this.OutPkg;
    }

    /**
     * Set 出包量。
     * @param OutPkg 出包量。
     */
    public void setOutPkg(Long OutPkg) {
        this.OutPkg = OutPkg;
    }

    /**
     * Get 入流量，单位：`Byte`。 
     * @return InTraffic 入流量，单位：`Byte`。
     */
    public Long getInTraffic() {
        return this.InTraffic;
    }

    /**
     * Set 入流量，单位：`Byte`。
     * @param InTraffic 入流量，单位：`Byte`。
     */
    public void setInTraffic(Long InTraffic) {
        this.InTraffic = InTraffic;
    }

    /**
     * Get 出流量，单位：`Byte`。 
     * @return OutTraffic 出流量，单位：`Byte`。
     */
    public Long getOutTraffic() {
        return this.OutTraffic;
    }

    /**
     * Set 出流量，单位：`Byte`。
     * @param OutTraffic 出流量，单位：`Byte`。
     */
    public void setOutTraffic(Long OutTraffic) {
        this.OutTraffic = OutTraffic;
    }

    /**
     * Get 并发连接数。仅标准型nat支持此参数。 
     * @return ConcurrentConnectionCount 并发连接数。仅标准型nat支持此参数。
     */
    public Long getConcurrentConnectionCount() {
        return this.ConcurrentConnectionCount;
    }

    /**
     * Set 并发连接数。仅标准型nat支持此参数。
     * @param ConcurrentConnectionCount 并发连接数。仅标准型nat支持此参数。
     */
    public void setConcurrentConnectionCount(Long ConcurrentConnectionCount) {
        this.ConcurrentConnectionCount = ConcurrentConnectionCount;
    }

    /**
     * Get 新建连接速率。仅标准型nat支持此参数。 
     * @return NewConnectionRate 新建连接速率。仅标准型nat支持此参数。
     */
    public Long getNewConnectionRate() {
        return this.NewConnectionRate;
    }

    /**
     * Set 新建连接速率。仅标准型nat支持此参数。
     * @param NewConnectionRate 新建连接速率。仅标准型nat支持此参数。
     */
    public void setNewConnectionRate(Long NewConnectionRate) {
        this.NewConnectionRate = NewConnectionRate;
    }

    public NatGatewayFlowMonitorDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGatewayFlowMonitorDetail(NatGatewayFlowMonitorDetail source) {
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.InPkg != null) {
            this.InPkg = new Long(source.InPkg);
        }
        if (source.OutPkg != null) {
            this.OutPkg = new Long(source.OutPkg);
        }
        if (source.InTraffic != null) {
            this.InTraffic = new Long(source.InTraffic);
        }
        if (source.OutTraffic != null) {
            this.OutTraffic = new Long(source.OutTraffic);
        }
        if (source.ConcurrentConnectionCount != null) {
            this.ConcurrentConnectionCount = new Long(source.ConcurrentConnectionCount);
        }
        if (source.NewConnectionRate != null) {
            this.NewConnectionRate = new Long(source.NewConnectionRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "InPkg", this.InPkg);
        this.setParamSimple(map, prefix + "OutPkg", this.OutPkg);
        this.setParamSimple(map, prefix + "InTraffic", this.InTraffic);
        this.setParamSimple(map, prefix + "OutTraffic", this.OutTraffic);
        this.setParamSimple(map, prefix + "ConcurrentConnectionCount", this.ConcurrentConnectionCount);
        this.setParamSimple(map, prefix + "NewConnectionRate", this.NewConnectionRate);

    }
}

