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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStrategyRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>策略id</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * <p>解析线路，需要全量传参</p>
    */
    @SerializedName("Source")
    @Expose
    private Source [] Source;

    /**
    * <p>主力地址池集合，需要全量传参</p>
    */
    @SerializedName("MainAddressPoolSet")
    @Expose
    private MainAddressPool [] MainAddressPoolSet;

    /**
    * <p>兜底地址池集合，需要全量传参</p>
    */
    @SerializedName("FallbackAddressPoolSet")
    @Expose
    private MainAddressPool [] FallbackAddressPoolSet;

    /**
    * <p>策略名称，不允许重复</p>
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>策略开启状态：ENABLED开启；DISABLED关闭</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private String IsEnabled;

    /**
    * <p>是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启</p>
    */
    @SerializedName("KeepDomainRecords")
    @Expose
    private String KeepDomainRecords;

    /**
    * <p>调度模式：AUTO默认；STOP仅暂停不切换</p>
    */
    @SerializedName("SwitchPoolType")
    @Expose
    private String SwitchPoolType;

    /**
    * <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
    */
    @SerializedName("KeepResource")
    @Expose
    private Boolean KeepResource;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>策略id</p> 
     * @return StrategyId <p>策略id</p>
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>策略id</p>
     * @param StrategyId <p>策略id</p>
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get <p>解析线路，需要全量传参</p> 
     * @return Source <p>解析线路，需要全量传参</p>
     */
    public Source [] getSource() {
        return this.Source;
    }

    /**
     * Set <p>解析线路，需要全量传参</p>
     * @param Source <p>解析线路，需要全量传参</p>
     */
    public void setSource(Source [] Source) {
        this.Source = Source;
    }

    /**
     * Get <p>主力地址池集合，需要全量传参</p> 
     * @return MainAddressPoolSet <p>主力地址池集合，需要全量传参</p>
     */
    public MainAddressPool [] getMainAddressPoolSet() {
        return this.MainAddressPoolSet;
    }

    /**
     * Set <p>主力地址池集合，需要全量传参</p>
     * @param MainAddressPoolSet <p>主力地址池集合，需要全量传参</p>
     */
    public void setMainAddressPoolSet(MainAddressPool [] MainAddressPoolSet) {
        this.MainAddressPoolSet = MainAddressPoolSet;
    }

    /**
     * Get <p>兜底地址池集合，需要全量传参</p> 
     * @return FallbackAddressPoolSet <p>兜底地址池集合，需要全量传参</p>
     */
    public MainAddressPool [] getFallbackAddressPoolSet() {
        return this.FallbackAddressPoolSet;
    }

    /**
     * Set <p>兜底地址池集合，需要全量传参</p>
     * @param FallbackAddressPoolSet <p>兜底地址池集合，需要全量传参</p>
     */
    public void setFallbackAddressPoolSet(MainAddressPool [] FallbackAddressPoolSet) {
        this.FallbackAddressPoolSet = FallbackAddressPoolSet;
    }

    /**
     * Get <p>策略名称，不允许重复</p> 
     * @return StrategyName <p>策略名称，不允许重复</p>
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>策略名称，不允许重复</p>
     * @param StrategyName <p>策略名称，不允许重复</p>
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>策略开启状态：ENABLED开启；DISABLED关闭</p> 
     * @return IsEnabled <p>策略开启状态：ENABLED开启；DISABLED关闭</p>
     */
    public String getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>策略开启状态：ENABLED开启；DISABLED关闭</p>
     * @param IsEnabled <p>策略开启状态：ENABLED开启；DISABLED关闭</p>
     */
    public void setIsEnabled(String IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启</p> 
     * @return KeepDomainRecords <p>是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启</p>
     */
    public String getKeepDomainRecords() {
        return this.KeepDomainRecords;
    }

    /**
     * Set <p>是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启</p>
     * @param KeepDomainRecords <p>是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启</p>
     */
    public void setKeepDomainRecords(String KeepDomainRecords) {
        this.KeepDomainRecords = KeepDomainRecords;
    }

    /**
     * Get <p>调度模式：AUTO默认；STOP仅暂停不切换</p> 
     * @return SwitchPoolType <p>调度模式：AUTO默认；STOP仅暂停不切换</p>
     */
    public String getSwitchPoolType() {
        return this.SwitchPoolType;
    }

    /**
     * Set <p>调度模式：AUTO默认；STOP仅暂停不切换</p>
     * @param SwitchPoolType <p>调度模式：AUTO默认；STOP仅暂停不切换</p>
     */
    public void setSwitchPoolType(String SwitchPoolType) {
        this.SwitchPoolType = SwitchPoolType;
    }

    /**
     * Get <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul> 
     * @return KeepResource <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
     */
    public Boolean getKeepResource() {
        return this.KeepResource;
    }

    /**
     * Set <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
     * @param KeepResource <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
     */
    public void setKeepResource(Boolean KeepResource) {
        this.KeepResource = KeepResource;
    }

    public ModifyStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStrategyRequest(ModifyStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Source != null) {
            this.Source = new Source[source.Source.length];
            for (int i = 0; i < source.Source.length; i++) {
                this.Source[i] = new Source(source.Source[i]);
            }
        }
        if (source.MainAddressPoolSet != null) {
            this.MainAddressPoolSet = new MainAddressPool[source.MainAddressPoolSet.length];
            for (int i = 0; i < source.MainAddressPoolSet.length; i++) {
                this.MainAddressPoolSet[i] = new MainAddressPool(source.MainAddressPoolSet[i]);
            }
        }
        if (source.FallbackAddressPoolSet != null) {
            this.FallbackAddressPoolSet = new MainAddressPool[source.FallbackAddressPoolSet.length];
            for (int i = 0; i < source.FallbackAddressPoolSet.length; i++) {
                this.FallbackAddressPoolSet[i] = new MainAddressPool(source.FallbackAddressPoolSet[i]);
            }
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new String(source.IsEnabled);
        }
        if (source.KeepDomainRecords != null) {
            this.KeepDomainRecords = new String(source.KeepDomainRecords);
        }
        if (source.SwitchPoolType != null) {
            this.SwitchPoolType = new String(source.SwitchPoolType);
        }
        if (source.KeepResource != null) {
            this.KeepResource = new Boolean(source.KeepResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArrayObj(map, prefix + "Source.", this.Source);
        this.setParamArrayObj(map, prefix + "MainAddressPoolSet.", this.MainAddressPoolSet);
        this.setParamArrayObj(map, prefix + "FallbackAddressPoolSet.", this.FallbackAddressPoolSet);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "KeepDomainRecords", this.KeepDomainRecords);
        this.setParamSimple(map, prefix + "SwitchPoolType", this.SwitchPoolType);
        this.setParamSimple(map, prefix + "KeepResource", this.KeepResource);

    }
}

