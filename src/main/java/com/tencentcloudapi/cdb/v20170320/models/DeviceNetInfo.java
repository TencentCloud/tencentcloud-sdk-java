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

public class DeviceNetInfo  extends AbstractModel{

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
     * 获取tcp连接数
     * @return Conn tcp连接数
     */
    public Integer [] getConn() {
        return this.Conn;
    }

    /**
     * 设置tcp连接数
     * @param Conn tcp连接数
     */
    public void setConn(Integer [] Conn) {
        this.Conn = Conn;
    }

    /**
     * 获取网卡入包量
     * @return PackageIn 网卡入包量
     */
    public Integer [] getPackageIn() {
        return this.PackageIn;
    }

    /**
     * 设置网卡入包量
     * @param PackageIn 网卡入包量
     */
    public void setPackageIn(Integer [] PackageIn) {
        this.PackageIn = PackageIn;
    }

    /**
     * 获取网卡出包量
     * @return PackageOut 网卡出包量
     */
    public Integer [] getPackageOut() {
        return this.PackageOut;
    }

    /**
     * 设置网卡出包量
     * @param PackageOut 网卡出包量
     */
    public void setPackageOut(Integer [] PackageOut) {
        this.PackageOut = PackageOut;
    }

    /**
     * 获取入流量，单位：KB
     * @return FlowIn 入流量，单位：KB
     */
    public Integer [] getFlowIn() {
        return this.FlowIn;
    }

    /**
     * 设置入流量，单位：KB
     * @param FlowIn 入流量，单位：KB
     */
    public void setFlowIn(Integer [] FlowIn) {
        this.FlowIn = FlowIn;
    }

    /**
     * 获取出流量，单位：KB
     * @return FlowOut 出流量，单位：KB
     */
    public Integer [] getFlowOut() {
        return this.FlowOut;
    }

    /**
     * 设置出流量，单位：KB
     * @param FlowOut 出流量，单位：KB
     */
    public void setFlowOut(Integer [] FlowOut) {
        this.FlowOut = FlowOut;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Conn.", this.Conn);
        this.setParamArraySimple(map, prefix + "PackageIn.", this.PackageIn);
        this.setParamArraySimple(map, prefix + "PackageOut.", this.PackageOut);
        this.setParamArraySimple(map, prefix + "FlowIn.", this.FlowIn);
        this.setParamArraySimple(map, prefix + "FlowOut.", this.FlowOut);

    }
}

