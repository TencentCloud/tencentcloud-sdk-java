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
    private Integer [] Conn;

    /**
    * 网卡入包量
    */
    @SerializedName("PackageIn")
    @Expose
    private Integer [] PackageIn;

    /**
    * 网卡出包量
    */
    @SerializedName("PackageOut")
    @Expose
    private Integer [] PackageOut;

    /**
    * 入流量，单位：KB
    */
    @SerializedName("FlowIn")
    @Expose
    private Integer [] FlowIn;

    /**
    * 出流量，单位：KB
    */
    @SerializedName("FlowOut")
    @Expose
    private Integer [] FlowOut;

    /**
     * Get tcp连接数 
     * @return Conn tcp连接数
     */
    public Integer [] getConn() {
        return this.Conn;
    }

    /**
     * Set tcp连接数
     * @param Conn tcp连接数
     */
    public void setConn(Integer [] Conn) {
        this.Conn = Conn;
    }

    /**
     * Get 网卡入包量 
     * @return PackageIn 网卡入包量
     */
    public Integer [] getPackageIn() {
        return this.PackageIn;
    }

    /**
     * Set 网卡入包量
     * @param PackageIn 网卡入包量
     */
    public void setPackageIn(Integer [] PackageIn) {
        this.PackageIn = PackageIn;
    }

    /**
     * Get 网卡出包量 
     * @return PackageOut 网卡出包量
     */
    public Integer [] getPackageOut() {
        return this.PackageOut;
    }

    /**
     * Set 网卡出包量
     * @param PackageOut 网卡出包量
     */
    public void setPackageOut(Integer [] PackageOut) {
        this.PackageOut = PackageOut;
    }

    /**
     * Get 入流量，单位：KB 
     * @return FlowIn 入流量，单位：KB
     */
    public Integer [] getFlowIn() {
        return this.FlowIn;
    }

    /**
     * Set 入流量，单位：KB
     * @param FlowIn 入流量，单位：KB
     */
    public void setFlowIn(Integer [] FlowIn) {
        this.FlowIn = FlowIn;
    }

    /**
     * Get 出流量，单位：KB 
     * @return FlowOut 出流量，单位：KB
     */
    public Integer [] getFlowOut() {
        return this.FlowOut;
    }

    /**
     * Set 出流量，单位：KB
     * @param FlowOut 出流量，单位：KB
     */
    public void setFlowOut(Integer [] FlowOut) {
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

