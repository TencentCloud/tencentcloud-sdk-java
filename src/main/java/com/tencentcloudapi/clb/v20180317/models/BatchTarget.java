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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTarget  extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 绑定端口
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 子机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 弹性网卡ip
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
    * 七层规则ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * 获取监听器ID
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取绑定端口
     * @return Port 绑定端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置绑定端口
     * @param Port 绑定端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取子机ID
     * @return InstanceId 子机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置子机ID
     * @param InstanceId 子机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取弹性网卡ip
     * @return EniIp 弹性网卡ip
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * 设置弹性网卡ip
     * @param EniIp 弹性网卡ip
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * 获取子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     * @return Weight 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     * @param Weight 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取七层规则ID
     * @return LocationId 七层规则ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * 设置七层规则ID
     * @param LocationId 七层规则ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}

