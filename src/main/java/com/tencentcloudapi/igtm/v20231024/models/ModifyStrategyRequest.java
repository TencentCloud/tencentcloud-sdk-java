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
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 解析线路，需要全量传参
    */
    @SerializedName("Source")
    @Expose
    private Source [] Source;

    /**
    * 主力地址池集合，需要全量传参
    */
    @SerializedName("MainAddressPoolSet")
    @Expose
    private MainAddressPool [] MainAddressPoolSet;

    /**
    * 兜底地址池集合，需要全量传参
    */
    @SerializedName("FallbackAddressPoolSet")
    @Expose
    private MainAddressPool [] FallbackAddressPoolSet;

    /**
    * 策略名称，不允许重复
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略开启状态：ENABLED开启；DISABLED关闭
    */
    @SerializedName("IsEnabled")
    @Expose
    private String IsEnabled;

    /**
    * 是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启
    */
    @SerializedName("KeepDomainRecords")
    @Expose
    private String KeepDomainRecords;

    /**
    * 调度模式：AUTO默认；STOP仅暂停不切换
    */
    @SerializedName("SwitchPoolType")
    @Expose
    private String SwitchPoolType;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 解析线路，需要全量传参 
     * @return Source 解析线路，需要全量传参
     */
    public Source [] getSource() {
        return this.Source;
    }

    /**
     * Set 解析线路，需要全量传参
     * @param Source 解析线路，需要全量传参
     */
    public void setSource(Source [] Source) {
        this.Source = Source;
    }

    /**
     * Get 主力地址池集合，需要全量传参 
     * @return MainAddressPoolSet 主力地址池集合，需要全量传参
     */
    public MainAddressPool [] getMainAddressPoolSet() {
        return this.MainAddressPoolSet;
    }

    /**
     * Set 主力地址池集合，需要全量传参
     * @param MainAddressPoolSet 主力地址池集合，需要全量传参
     */
    public void setMainAddressPoolSet(MainAddressPool [] MainAddressPoolSet) {
        this.MainAddressPoolSet = MainAddressPoolSet;
    }

    /**
     * Get 兜底地址池集合，需要全量传参 
     * @return FallbackAddressPoolSet 兜底地址池集合，需要全量传参
     */
    public MainAddressPool [] getFallbackAddressPoolSet() {
        return this.FallbackAddressPoolSet;
    }

    /**
     * Set 兜底地址池集合，需要全量传参
     * @param FallbackAddressPoolSet 兜底地址池集合，需要全量传参
     */
    public void setFallbackAddressPoolSet(MainAddressPool [] FallbackAddressPoolSet) {
        this.FallbackAddressPoolSet = FallbackAddressPoolSet;
    }

    /**
     * Get 策略名称，不允许重复 
     * @return StrategyName 策略名称，不允许重复
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称，不允许重复
     * @param StrategyName 策略名称，不允许重复
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略开启状态：ENABLED开启；DISABLED关闭 
     * @return IsEnabled 策略开启状态：ENABLED开启；DISABLED关闭
     */
    public String getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 策略开启状态：ENABLED开启；DISABLED关闭
     * @param IsEnabled 策略开启状态：ENABLED开启；DISABLED关闭
     */
    public void setIsEnabled(String IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启 
     * @return KeepDomainRecords 是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启
     */
    public String getKeepDomainRecords() {
        return this.KeepDomainRecords;
    }

    /**
     * Set 是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启
     * @param KeepDomainRecords 是否开启策略强制保留默认线路 disabled, enabled，默认不开启且只有一个策略能开启
     */
    public void setKeepDomainRecords(String KeepDomainRecords) {
        this.KeepDomainRecords = KeepDomainRecords;
    }

    /**
     * Get 调度模式：AUTO默认；STOP仅暂停不切换 
     * @return SwitchPoolType 调度模式：AUTO默认；STOP仅暂停不切换
     */
    public String getSwitchPoolType() {
        return this.SwitchPoolType;
    }

    /**
     * Set 调度模式：AUTO默认；STOP仅暂停不切换
     * @param SwitchPoolType 调度模式：AUTO默认；STOP仅暂停不切换
     */
    public void setSwitchPoolType(String SwitchPoolType) {
        this.SwitchPoolType = SwitchPoolType;
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

    }
}

