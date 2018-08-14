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

public class RoVipInfo  extends AbstractModel{

    /**
    * 只读vip状态
    */
    @SerializedName("RoVipStatus")
    @Expose
    private Integer RoVipStatus;

    /**
    * 只读vip的子网
    */
    @SerializedName("RoSubnetId")
    @Expose
    private Integer RoSubnetId;

    /**
    * 只读vip的私有网络
    */
    @SerializedName("RoVpcId")
    @Expose
    private Integer RoVpcId;

    /**
    * 只读vip的端口号
    */
    @SerializedName("RoVport")
    @Expose
    private Integer RoVport;

    /**
    * 只读vip
    */
    @SerializedName("RoVip")
    @Expose
    private String RoVip;

    /**
     * 获取只读vip状态
     * @return RoVipStatus 只读vip状态
     */
    public Integer getRoVipStatus() {
        return this.RoVipStatus;
    }

    /**
     * 设置只读vip状态
     * @param RoVipStatus 只读vip状态
     */
    public void setRoVipStatus(Integer RoVipStatus) {
        this.RoVipStatus = RoVipStatus;
    }

    /**
     * 获取只读vip的子网
     * @return RoSubnetId 只读vip的子网
     */
    public Integer getRoSubnetId() {
        return this.RoSubnetId;
    }

    /**
     * 设置只读vip的子网
     * @param RoSubnetId 只读vip的子网
     */
    public void setRoSubnetId(Integer RoSubnetId) {
        this.RoSubnetId = RoSubnetId;
    }

    /**
     * 获取只读vip的私有网络
     * @return RoVpcId 只读vip的私有网络
     */
    public Integer getRoVpcId() {
        return this.RoVpcId;
    }

    /**
     * 设置只读vip的私有网络
     * @param RoVpcId 只读vip的私有网络
     */
    public void setRoVpcId(Integer RoVpcId) {
        this.RoVpcId = RoVpcId;
    }

    /**
     * 获取只读vip的端口号
     * @return RoVport 只读vip的端口号
     */
    public Integer getRoVport() {
        return this.RoVport;
    }

    /**
     * 设置只读vip的端口号
     * @param RoVport 只读vip的端口号
     */
    public void setRoVport(Integer RoVport) {
        this.RoVport = RoVport;
    }

    /**
     * 获取只读vip
     * @return RoVip 只读vip
     */
    public String getRoVip() {
        return this.RoVip;
    }

    /**
     * 设置只读vip
     * @param RoVip 只读vip
     */
    public void setRoVip(String RoVip) {
        this.RoVip = RoVip;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoVipStatus", this.RoVipStatus);
        this.setParamSimple(map, prefix + "RoSubnetId", this.RoSubnetId);
        this.setParamSimple(map, prefix + "RoVpcId", this.RoVpcId);
        this.setParamSimple(map, prefix + "RoVport", this.RoVport);
        this.setParamSimple(map, prefix + "RoVip", this.RoVip);

    }
}

