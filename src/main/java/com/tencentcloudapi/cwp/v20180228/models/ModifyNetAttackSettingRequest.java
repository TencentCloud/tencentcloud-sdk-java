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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetAttackSettingRequest extends AbstractModel {

    /**
    * <p>0 关闭网络攻击检测，1开启网络攻击检测</p>
    */
    @SerializedName("NetAttackEnable")
    @Expose
    private Long NetAttackEnable;

    /**
    * <p>0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略</p>
    */
    @SerializedName("NetAttackAlarmStatus")
    @Expose
    private Long NetAttackAlarmStatus;

    /**
    * <p>1 全部旗舰版主机，0 Quuids列表主机</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>自选主机</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>自选排除的主机</p>
    */
    @SerializedName("ExcludeInstanceIds")
    @Expose
    private String [] ExcludeInstanceIds;

    /**
    * <p>新增资产自动包含 0 不包含 1包含</p>
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
    * <p>产品类型 0-主机安全 1-安全中心</p>
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
     * Get <p>0 关闭网络攻击检测，1开启网络攻击检测</p> 
     * @return NetAttackEnable <p>0 关闭网络攻击检测，1开启网络攻击检测</p>
     */
    public Long getNetAttackEnable() {
        return this.NetAttackEnable;
    }

    /**
     * Set <p>0 关闭网络攻击检测，1开启网络攻击检测</p>
     * @param NetAttackEnable <p>0 关闭网络攻击检测，1开启网络攻击检测</p>
     */
    public void setNetAttackEnable(Long NetAttackEnable) {
        this.NetAttackEnable = NetAttackEnable;
    }

    /**
     * Get <p>0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略</p> 
     * @return NetAttackAlarmStatus <p>0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略</p>
     */
    public Long getNetAttackAlarmStatus() {
        return this.NetAttackAlarmStatus;
    }

    /**
     * Set <p>0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略</p>
     * @param NetAttackAlarmStatus <p>0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略</p>
     */
    public void setNetAttackAlarmStatus(Long NetAttackAlarmStatus) {
        this.NetAttackAlarmStatus = NetAttackAlarmStatus;
    }

    /**
     * Get <p>1 全部旗舰版主机，0 Quuids列表主机</p> 
     * @return Scope <p>1 全部旗舰版主机，0 Quuids列表主机</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>1 全部旗舰版主机，0 Quuids列表主机</p>
     * @param Scope <p>1 全部旗舰版主机，0 Quuids列表主机</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>自选主机</p> 
     * @return InstanceIds <p>自选主机</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>自选主机</p>
     * @param InstanceIds <p>自选主机</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>自选排除的主机</p> 
     * @return ExcludeInstanceIds <p>自选排除的主机</p>
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set <p>自选排除的主机</p>
     * @param ExcludeInstanceIds <p>自选排除的主机</p>
     */
    public void setExcludeInstanceIds(String [] ExcludeInstanceIds) {
        this.ExcludeInstanceIds = ExcludeInstanceIds;
    }

    /**
     * Get <p>新增资产自动包含 0 不包含 1包含</p> 
     * @return AutoInclude <p>新增资产自动包含 0 不包含 1包含</p>
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set <p>新增资产自动包含 0 不包含 1包含</p>
     * @param AutoInclude <p>新增资产自动包含 0 不包含 1包含</p>
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    /**
     * Get <p>产品类型 0-主机安全 1-安全中心</p> 
     * @return ProductType <p>产品类型 0-主机安全 1-安全中心</p>
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型 0-主机安全 1-安全中心</p>
     * @param ProductType <p>产品类型 0-主机安全 1-安全中心</p>
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    public ModifyNetAttackSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetAttackSettingRequest(ModifyNetAttackSettingRequest source) {
        if (source.NetAttackEnable != null) {
            this.NetAttackEnable = new Long(source.NetAttackEnable);
        }
        if (source.NetAttackAlarmStatus != null) {
            this.NetAttackAlarmStatus = new Long(source.NetAttackAlarmStatus);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludeInstanceIds != null) {
            this.ExcludeInstanceIds = new String[source.ExcludeInstanceIds.length];
            for (int i = 0; i < source.ExcludeInstanceIds.length; i++) {
                this.ExcludeInstanceIds[i] = new String(source.ExcludeInstanceIds[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetAttackEnable", this.NetAttackEnable);
        this.setParamSimple(map, prefix + "NetAttackAlarmStatus", this.NetAttackAlarmStatus);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}

