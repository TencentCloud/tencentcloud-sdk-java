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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEtcdConfigurationRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自动压缩设置
    */
    @SerializedName("AutoCompactionSettings")
    @Expose
    private EtcdAutoCompactionSettings AutoCompactionSettings;

    /**
    * 监控设置
    */
    @SerializedName("MonitorSettings")
    @Expose
    private EtcdMonitorSettings MonitorSettings;

    /**
    * 计费类型
PREPAID：预付费
POSTPAID_BY_HOUR：后付费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 实例配置信息
    */
    @SerializedName("InstanceConfig")
    @Expose
    private InstanceConfig InstanceConfig;

    /**
    * 预付费配置信息
    */
    @SerializedName("PrepaidConfig")
    @Expose
    private ChargePrepaidConfig PrepaidConfig;

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
     * Get 自动压缩设置 
     * @return AutoCompactionSettings 自动压缩设置
     */
    public EtcdAutoCompactionSettings getAutoCompactionSettings() {
        return this.AutoCompactionSettings;
    }

    /**
     * Set 自动压缩设置
     * @param AutoCompactionSettings 自动压缩设置
     */
    public void setAutoCompactionSettings(EtcdAutoCompactionSettings AutoCompactionSettings) {
        this.AutoCompactionSettings = AutoCompactionSettings;
    }

    /**
     * Get 监控设置 
     * @return MonitorSettings 监控设置
     */
    public EtcdMonitorSettings getMonitorSettings() {
        return this.MonitorSettings;
    }

    /**
     * Set 监控设置
     * @param MonitorSettings 监控设置
     */
    public void setMonitorSettings(EtcdMonitorSettings MonitorSettings) {
        this.MonitorSettings = MonitorSettings;
    }

    /**
     * Get 计费类型
PREPAID：预付费
POSTPAID_BY_HOUR：后付费 
     * @return ChargeType 计费类型
PREPAID：预付费
POSTPAID_BY_HOUR：后付费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型
PREPAID：预付费
POSTPAID_BY_HOUR：后付费
     * @param ChargeType 计费类型
PREPAID：预付费
POSTPAID_BY_HOUR：后付费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 实例配置信息 
     * @return InstanceConfig 实例配置信息
     */
    public InstanceConfig getInstanceConfig() {
        return this.InstanceConfig;
    }

    /**
     * Set 实例配置信息
     * @param InstanceConfig 实例配置信息
     */
    public void setInstanceConfig(InstanceConfig InstanceConfig) {
        this.InstanceConfig = InstanceConfig;
    }

    /**
     * Get 预付费配置信息 
     * @return PrepaidConfig 预付费配置信息
     */
    public ChargePrepaidConfig getPrepaidConfig() {
        return this.PrepaidConfig;
    }

    /**
     * Set 预付费配置信息
     * @param PrepaidConfig 预付费配置信息
     */
    public void setPrepaidConfig(ChargePrepaidConfig PrepaidConfig) {
        this.PrepaidConfig = PrepaidConfig;
    }

    public ModifyEtcdConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEtcdConfigurationRequest(ModifyEtcdConfigurationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AutoCompactionSettings != null) {
            this.AutoCompactionSettings = new EtcdAutoCompactionSettings(source.AutoCompactionSettings);
        }
        if (source.MonitorSettings != null) {
            this.MonitorSettings = new EtcdMonitorSettings(source.MonitorSettings);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.InstanceConfig != null) {
            this.InstanceConfig = new InstanceConfig(source.InstanceConfig);
        }
        if (source.PrepaidConfig != null) {
            this.PrepaidConfig = new ChargePrepaidConfig(source.PrepaidConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "AutoCompactionSettings.", this.AutoCompactionSettings);
        this.setParamObj(map, prefix + "MonitorSettings.", this.MonitorSettings);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "InstanceConfig.", this.InstanceConfig);
        this.setParamObj(map, prefix + "PrepaidConfig.", this.PrepaidConfig);

    }
}

