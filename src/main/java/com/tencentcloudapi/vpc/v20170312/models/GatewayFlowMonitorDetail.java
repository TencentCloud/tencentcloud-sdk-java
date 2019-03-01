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

public class GatewayFlowMonitorDetail  extends AbstractModel{

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
    private Integer InPkg;

    /**
    * 出包量。
    */
    @SerializedName("OutPkg")
    @Expose
    private Integer OutPkg;

    /**
    * 入带宽，单位：`Byte`。
    */
    @SerializedName("InTraffic")
    @Expose
    private Integer InTraffic;

    /**
    * 出带宽，单位：`Byte`。
    */
    @SerializedName("OutTraffic")
    @Expose
    private Integer OutTraffic;

    /**
     * 获取来源`IP`。
     * @return PrivateIpAddress 来源`IP`。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * 设置来源`IP`。
     * @param PrivateIpAddress 来源`IP`。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * 获取入包量。
     * @return InPkg 入包量。
     */
    public Integer getInPkg() {
        return this.InPkg;
    }

    /**
     * 设置入包量。
     * @param InPkg 入包量。
     */
    public void setInPkg(Integer InPkg) {
        this.InPkg = InPkg;
    }

    /**
     * 获取出包量。
     * @return OutPkg 出包量。
     */
    public Integer getOutPkg() {
        return this.OutPkg;
    }

    /**
     * 设置出包量。
     * @param OutPkg 出包量。
     */
    public void setOutPkg(Integer OutPkg) {
        this.OutPkg = OutPkg;
    }

    /**
     * 获取入带宽，单位：`Byte`。
     * @return InTraffic 入带宽，单位：`Byte`。
     */
    public Integer getInTraffic() {
        return this.InTraffic;
    }

    /**
     * 设置入带宽，单位：`Byte`。
     * @param InTraffic 入带宽，单位：`Byte`。
     */
    public void setInTraffic(Integer InTraffic) {
        this.InTraffic = InTraffic;
    }

    /**
     * 获取出带宽，单位：`Byte`。
     * @return OutTraffic 出带宽，单位：`Byte`。
     */
    public Integer getOutTraffic() {
        return this.OutTraffic;
    }

    /**
     * 设置出带宽，单位：`Byte`。
     * @param OutTraffic 出带宽，单位：`Byte`。
     */
    public void setOutTraffic(Integer OutTraffic) {
        this.OutTraffic = OutTraffic;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "InPkg", this.InPkg);
        this.setParamSimple(map, prefix + "OutPkg", this.OutPkg);
        this.setParamSimple(map, prefix + "InTraffic", this.InTraffic);
        this.setParamSimple(map, prefix + "OutTraffic", this.OutTraffic);

    }
}

