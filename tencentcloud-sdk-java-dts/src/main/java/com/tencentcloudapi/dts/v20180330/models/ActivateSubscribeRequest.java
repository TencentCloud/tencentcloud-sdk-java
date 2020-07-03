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

public class ActivateSubscribeRequest extends AbstractModel{

    /**
    * 订阅实例ID。
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 数据库实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据订阅类型0-全实例订阅，1数据订阅，2结构订阅，3数据订阅与结构订阅
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * 订阅对象
    */
    @SerializedName("Objects")
    @Expose
    private SubscribeObject Objects;

    /**
    * 数据订阅服务所在子网。默认为数据库实例所在的子网内。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 订阅服务端口；默认为7507
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get 订阅实例ID。 
     * @return SubscribeId 订阅实例ID。
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例ID。
     * @param SubscribeId 订阅实例ID。
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 数据库实例ID 
     * @return InstanceId 数据库实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID
     * @param InstanceId 数据库实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据订阅类型0-全实例订阅，1数据订阅，2结构订阅，3数据订阅与结构订阅 
     * @return SubscribeObjectType 数据订阅类型0-全实例订阅，1数据订阅，2结构订阅，3数据订阅与结构订阅
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set 数据订阅类型0-全实例订阅，1数据订阅，2结构订阅，3数据订阅与结构订阅
     * @param SubscribeObjectType 数据订阅类型0-全实例订阅，1数据订阅，2结构订阅，3数据订阅与结构订阅
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get 订阅对象 
     * @return Objects 订阅对象
     */
    public SubscribeObject getObjects() {
        return this.Objects;
    }

    /**
     * Set 订阅对象
     * @param Objects 订阅对象
     */
    public void setObjects(SubscribeObject Objects) {
        this.Objects = Objects;
    }

    /**
     * Get 数据订阅服务所在子网。默认为数据库实例所在的子网内。 
     * @return UniqSubnetId 数据订阅服务所在子网。默认为数据库实例所在的子网内。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 数据订阅服务所在子网。默认为数据库实例所在的子网内。
     * @param UniqSubnetId 数据订阅服务所在子网。默认为数据库实例所在的子网内。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 订阅服务端口；默认为7507 
     * @return Vport 订阅服务端口；默认为7507
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 订阅服务端口；默认为7507
     * @param Vport 订阅服务端口；默认为7507
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

