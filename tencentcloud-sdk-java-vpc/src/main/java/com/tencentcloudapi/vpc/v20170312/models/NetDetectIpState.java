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

public class NetDetectIpState extends AbstractModel{

    /**
    * 探测目的IPv4地址。
    */
    @SerializedName("DetectDestinationIp")
    @Expose
    private String DetectDestinationIp;

    /**
    * 探测结果。
0：成功；
-1：查询不到路由丢包；
-2：外出ACL丢包；
-3：IN ACL丢包；
-4：其他错误；
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 时延，单位毫秒
    */
    @SerializedName("Delay")
    @Expose
    private Long Delay;

    /**
    * 丢包率
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Long PacketLossRate;

    /**
     * Get 探测目的IPv4地址。 
     * @return DetectDestinationIp 探测目的IPv4地址。
     */
    public String getDetectDestinationIp() {
        return this.DetectDestinationIp;
    }

    /**
     * Set 探测目的IPv4地址。
     * @param DetectDestinationIp 探测目的IPv4地址。
     */
    public void setDetectDestinationIp(String DetectDestinationIp) {
        this.DetectDestinationIp = DetectDestinationIp;
    }

    /**
     * Get 探测结果。
0：成功；
-1：查询不到路由丢包；
-2：外出ACL丢包；
-3：IN ACL丢包；
-4：其他错误； 
     * @return State 探测结果。
0：成功；
-1：查询不到路由丢包；
-2：外出ACL丢包；
-3：IN ACL丢包；
-4：其他错误；
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 探测结果。
0：成功；
-1：查询不到路由丢包；
-2：外出ACL丢包；
-3：IN ACL丢包；
-4：其他错误；
     * @param State 探测结果。
0：成功；
-1：查询不到路由丢包；
-2：外出ACL丢包；
-3：IN ACL丢包；
-4：其他错误；
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 时延，单位毫秒 
     * @return Delay 时延，单位毫秒
     */
    public Long getDelay() {
        return this.Delay;
    }

    /**
     * Set 时延，单位毫秒
     * @param Delay 时延，单位毫秒
     */
    public void setDelay(Long Delay) {
        this.Delay = Delay;
    }

    /**
     * Get 丢包率 
     * @return PacketLossRate 丢包率
     */
    public Long getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set 丢包率
     * @param PacketLossRate 丢包率
     */
    public void setPacketLossRate(Long PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectDestinationIp", this.DetectDestinationIp);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Delay", this.Delay);
        this.setParamSimple(map, prefix + "PacketLossRate", this.PacketLossRate);

    }
}

