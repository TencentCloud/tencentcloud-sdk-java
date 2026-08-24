/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmCkafkaSaveRequest extends AbstractModel {

    /**
    * 接入类型，当前支持 1和7, 类型vip网络类型（1:外网TGW 2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * 实例的地域
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 实例的id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例的接入信息
    */
    @SerializedName("RouteInfo")
    @Expose
    private RouteInfo RouteInfo;

    /**
    * 接入为域名的时候，有效
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 接入为域名的时候，有效
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 日志投递的主题配置
    */
    @SerializedName("LogDeliveryInfo")
    @Expose
    private LogDeliveryInfo [] LogDeliveryInfo;

    /**
    * 已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 接入类型，当前支持 1和7, 类型vip网络类型（1:外网TGW 2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境） 
     * @return VipType 接入类型，当前支持 1和7, 类型vip网络类型（1:外网TGW 2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set 接入类型，当前支持 1和7, 类型vip网络类型（1:外网TGW 2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
     * @param VipType 接入类型，当前支持 1和7, 类型vip网络类型（1:外网TGW 2:基础网络 3:VPC网络 4:支撑网络(idc 环境) 5:SSL外网访问方式访问 6:黑石环境vpc 7:支撑网络(cvm 环境）
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get 实例的地域 
     * @return RegionId 实例的地域
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例的地域
     * @param RegionId 实例的地域
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例的id 
     * @return InstanceId 实例的id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例的id
     * @param InstanceId 实例的id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例的接入信息 
     * @return RouteInfo 实例的接入信息
     */
    public RouteInfo getRouteInfo() {
        return this.RouteInfo;
    }

    /**
     * Set 实例的接入信息
     * @param RouteInfo 实例的接入信息
     */
    public void setRouteInfo(RouteInfo RouteInfo) {
        this.RouteInfo = RouteInfo;
    }

    /**
     * Get 接入为域名的时候，有效 
     * @return Username 接入为域名的时候，有效
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 接入为域名的时候，有效
     * @param Username 接入为域名的时候，有效
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 接入为域名的时候，有效 
     * @return Password 接入为域名的时候，有效
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 接入为域名的时候，有效
     * @param Password 接入为域名的时候，有效
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 日志投递的主题配置 
     * @return LogDeliveryInfo 日志投递的主题配置
     */
    public LogDeliveryInfo [] getLogDeliveryInfo() {
        return this.LogDeliveryInfo;
    }

    /**
     * Set 日志投递的主题配置
     * @param LogDeliveryInfo 日志投递的主题配置
     */
    public void setLogDeliveryInfo(LogDeliveryInfo [] LogDeliveryInfo) {
        this.LogDeliveryInfo = LogDeliveryInfo;
    }

    /**
     * Get 已存在配置时是否覆盖，默认 false（不覆盖，保持兼容） 
     * @return IsOverwrite 已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set 已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）
     * @param IsOverwrite 已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyDspmCkafkaSaveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmCkafkaSaveRequest(ModifyDspmCkafkaSaveRequest source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RouteInfo != null) {
            this.RouteInfo = new RouteInfo(source.RouteInfo);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.LogDeliveryInfo != null) {
            this.LogDeliveryInfo = new LogDeliveryInfo[source.LogDeliveryInfo.length];
            for (int i = 0; i < source.LogDeliveryInfo.length; i++) {
                this.LogDeliveryInfo[i] = new LogDeliveryInfo(source.LogDeliveryInfo[i]);
            }
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "RouteInfo.", this.RouteInfo);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "LogDeliveryInfo.", this.LogDeliveryInfo);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

