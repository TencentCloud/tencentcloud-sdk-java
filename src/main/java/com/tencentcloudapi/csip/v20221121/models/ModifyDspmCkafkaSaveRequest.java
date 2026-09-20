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
    * <p>接入类型，当前支持 1和7</p><p>枚举值：</p><ul><li>1： 外网TGW</li><li>2： 基础网络</li><li>3： VPC网络</li><li>4： idc环境-支撑网络</li><li>5： SSL外网访问方式访问</li><li>6： 黑石环境vpc</li><li>7： cvm环境-支撑网络</li></ul>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>实例的地域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>实例的id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例的接入信息</p>
    */
    @SerializedName("RouteInfo")
    @Expose
    private RouteInfo RouteInfo;

    /**
    * <p>接入为域名的时候，有效</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>接入为域名的时候，有效</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>日志投递的主题配置</p>
    */
    @SerializedName("LogDeliveryInfo")
    @Expose
    private LogDeliveryInfo [] LogDeliveryInfo;

    /**
    * <p>已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）</p>
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
     * Get <p>接入类型，当前支持 1和7</p><p>枚举值：</p><ul><li>1： 外网TGW</li><li>2： 基础网络</li><li>3： VPC网络</li><li>4： idc环境-支撑网络</li><li>5： SSL外网访问方式访问</li><li>6： 黑石环境vpc</li><li>7： cvm环境-支撑网络</li></ul> 
     * @return VipType <p>接入类型，当前支持 1和7</p><p>枚举值：</p><ul><li>1： 外网TGW</li><li>2： 基础网络</li><li>3： VPC网络</li><li>4： idc环境-支撑网络</li><li>5： SSL外网访问方式访问</li><li>6： 黑石环境vpc</li><li>7： cvm环境-支撑网络</li></ul>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>接入类型，当前支持 1和7</p><p>枚举值：</p><ul><li>1： 外网TGW</li><li>2： 基础网络</li><li>3： VPC网络</li><li>4： idc环境-支撑网络</li><li>5： SSL外网访问方式访问</li><li>6： 黑石环境vpc</li><li>7： cvm环境-支撑网络</li></ul>
     * @param VipType <p>接入类型，当前支持 1和7</p><p>枚举值：</p><ul><li>1： 外网TGW</li><li>2： 基础网络</li><li>3： VPC网络</li><li>4： idc环境-支撑网络</li><li>5： SSL外网访问方式访问</li><li>6： 黑石环境vpc</li><li>7： cvm环境-支撑网络</li></ul>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>实例的地域</p> 
     * @return RegionId <p>实例的地域</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>实例的地域</p>
     * @param RegionId <p>实例的地域</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>实例的id</p> 
     * @return InstanceId <p>实例的id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例的id</p>
     * @param InstanceId <p>实例的id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例的接入信息</p> 
     * @return RouteInfo <p>实例的接入信息</p>
     */
    public RouteInfo getRouteInfo() {
        return this.RouteInfo;
    }

    /**
     * Set <p>实例的接入信息</p>
     * @param RouteInfo <p>实例的接入信息</p>
     */
    public void setRouteInfo(RouteInfo RouteInfo) {
        this.RouteInfo = RouteInfo;
    }

    /**
     * Get <p>接入为域名的时候，有效</p> 
     * @return Username <p>接入为域名的时候，有效</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>接入为域名的时候，有效</p>
     * @param Username <p>接入为域名的时候，有效</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>接入为域名的时候，有效</p> 
     * @return Password <p>接入为域名的时候，有效</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>接入为域名的时候，有效</p>
     * @param Password <p>接入为域名的时候，有效</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>日志投递的主题配置</p> 
     * @return LogDeliveryInfo <p>日志投递的主题配置</p>
     */
    public LogDeliveryInfo [] getLogDeliveryInfo() {
        return this.LogDeliveryInfo;
    }

    /**
     * Set <p>日志投递的主题配置</p>
     * @param LogDeliveryInfo <p>日志投递的主题配置</p>
     */
    public void setLogDeliveryInfo(LogDeliveryInfo [] LogDeliveryInfo) {
        this.LogDeliveryInfo = LogDeliveryInfo;
    }

    /**
     * Get <p>已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）</p> 
     * @return IsOverwrite <p>已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）</p>
     * @param IsOverwrite <p>已存在配置时是否覆盖，默认 false（不覆盖，保持兼容）</p>
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

