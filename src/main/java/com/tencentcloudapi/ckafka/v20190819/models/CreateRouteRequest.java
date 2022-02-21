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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRouteRequest extends AbstractModel{

    /**
    * 实例唯一id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 路由网络类型(3:vpc路由;4:标准版支撑路由;7:专业版支撑路由)
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * vpc网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 访问类型
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 是否需要权限管理
    */
    @SerializedName("AuthFlag")
    @Expose
    private Long AuthFlag;

    /**
    * 调用方appId
    */
    @SerializedName("CallerAppid")
    @Expose
    private Long CallerAppid;

    /**
    * 公网带宽
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * vip地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get 实例唯一id 
     * @return InstanceId 实例唯一id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一id
     * @param InstanceId 实例唯一id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 路由网络类型(3:vpc路由;4:标准版支撑路由;7:专业版支撑路由) 
     * @return VipType 路由网络类型(3:vpc路由;4:标准版支撑路由;7:专业版支撑路由)
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set 路由网络类型(3:vpc路由;4:标准版支撑路由;7:专业版支撑路由)
     * @param VipType 路由网络类型(3:vpc路由;4:标准版支撑路由;7:专业版支撑路由)
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get vpc网络Id 
     * @return VpcId vpc网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc网络Id
     * @param VpcId vpc网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc子网id 
     * @return SubnetId vpc子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc子网id
     * @param SubnetId vpc子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 访问类型 
     * @return AccessType 访问类型
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问类型
     * @param AccessType 访问类型
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 是否需要权限管理 
     * @return AuthFlag 是否需要权限管理
     */
    public Long getAuthFlag() {
        return this.AuthFlag;
    }

    /**
     * Set 是否需要权限管理
     * @param AuthFlag 是否需要权限管理
     */
    public void setAuthFlag(Long AuthFlag) {
        this.AuthFlag = AuthFlag;
    }

    /**
     * Get 调用方appId 
     * @return CallerAppid 调用方appId
     */
    public Long getCallerAppid() {
        return this.CallerAppid;
    }

    /**
     * Set 调用方appId
     * @param CallerAppid 调用方appId
     */
    public void setCallerAppid(Long CallerAppid) {
        this.CallerAppid = CallerAppid;
    }

    /**
     * Get 公网带宽 
     * @return PublicNetwork 公网带宽
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 公网带宽
     * @param PublicNetwork 公网带宽
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get vip地址 
     * @return Ip vip地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set vip地址
     * @param Ip vip地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public CreateRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRouteRequest(CreateRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AuthFlag != null) {
            this.AuthFlag = new Long(source.AuthFlag);
        }
        if (source.CallerAppid != null) {
            this.CallerAppid = new Long(source.CallerAppid);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AuthFlag", this.AuthFlag);
        this.setParamSimple(map, prefix + "CallerAppid", this.CallerAppid);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

