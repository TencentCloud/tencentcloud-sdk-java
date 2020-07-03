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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceNetInfo extends AbstractModel{

    /**
    * tcp连接数
    */
    @SerializedName("Conn")
    @Expose
    private Long [] Conn;

    /**
    * 网卡入包量，单位：个/秒
    */
    @SerializedName("PackageIn")
    @Expose
    private Long [] PackageIn;

    /**
    * 网卡出包量，单位：个/秒
    */
    @SerializedName("PackageOut")
    @Expose
    private Long [] PackageOut;

    /**
    * 入流量，单位：kbps
    */
    @SerializedName("FlowIn")
    @Expose
    private Long [] FlowIn;

    /**
    * 出流量，单位：kbps
    */
    @SerializedName("FlowOut")
    @Expose
    private Long [] FlowOut;

    /**
     * Get tcp连接数 
     * @return Conn tcp连接数
     */
    public Long [] getConn() {
        return this.Conn;
    }

    /**
     * Set tcp连接数
     * @param Conn tcp连接数
     */
    public void setConn(Long [] Conn) {
        this.Conn = Conn;
    }

    /**
     * Get 网卡入包量，单位：个/秒 
     * @return PackageIn 网卡入包量，单位：个/秒
     */
    public Long [] getPackageIn() {
        return this.PackageIn;
    }

    /**
     * Set 网卡入包量，单位：个/秒
     * @param PackageIn 网卡入包量，单位：个/秒
     */
    public void setPackageIn(Long [] PackageIn) {
        this.PackageIn = PackageIn;
    }

    /**
     * Get 网卡出包量，单位：个/秒 
     * @return PackageOut 网卡出包量，单位：个/秒
     */
    public Long [] getPackageOut() {
        return this.PackageOut;
    }

    /**
     * Set 网卡出包量，单位：个/秒
     * @param PackageOut 网卡出包量，单位：个/秒
     */
    public void setPackageOut(Long [] PackageOut) {
        this.PackageOut = PackageOut;
    }

    /**
     * Get 入流量，单位：kbps 
     * @return FlowIn 入流量，单位：kbps
     */
    public Long [] getFlowIn() {
        return this.FlowIn;
    }

    /**
     * Set 入流量，单位：kbps
     * @param FlowIn 入流量，单位：kbps
     */
    public void setFlowIn(Long [] FlowIn) {
        this.FlowIn = FlowIn;
    }

    /**
     * Get 出流量，单位：kbps 
     * @return FlowOut 出流量，单位：kbps
     */
    public Long [] getFlowOut() {
        return this.FlowOut;
    }

    /**
     * Set 出流量，单位：kbps
     * @param FlowOut 出流量，单位：kbps
     */
    public void setFlowOut(Long [] FlowOut) {
        this.FlowOut = FlowOut;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Conn.", this.Conn);
        this.setParamArraySimple(map, prefix + "PackageIn.", this.PackageIn);
        this.setParamArraySimple(map, prefix + "PackageOut.", this.PackageOut);
        this.setParamArraySimple(map, prefix + "FlowIn.", this.FlowIn);
        this.setParamArraySimple(map, prefix + "FlowOut.", this.FlowOut);

    }
}

