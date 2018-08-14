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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DstInfo  extends AbstractModel{

    /**
    * 目标实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标实例vip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 目标实例vport
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 目标实例Id
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 只读开关
    */
    @SerializedName("ReadOnly")
    @Expose
    private Integer ReadOnly;

    /**
     * 获取目标实例Id
     * @return InstanceId 目标实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置目标实例Id
     * @param InstanceId 目标实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取目标实例vip
     * @return Ip 目标实例vip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置目标实例vip
     * @param Ip 目标实例vip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取目标实例vport
     * @return Port 目标实例vport
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置目标实例vport
     * @param Port 目标实例vport
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取目标实例Id
     * @return Region 目标实例Id
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置目标实例Id
     * @param Region 目标实例Id
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取只读开关
     * @return ReadOnly 只读开关
     */
    public Integer getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * 设置只读开关
     * @param ReadOnly 只读开关
     */
    public void setReadOnly(Integer ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

