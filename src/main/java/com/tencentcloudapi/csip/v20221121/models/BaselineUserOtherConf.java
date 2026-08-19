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

public class BaselineUserOtherConf extends AbstractModel {

    /**
    * <p>是否允许集团管理员将基线配置同步到本账号。true 允许，false 不允许。</p>
    */
    @SerializedName("AllowSync")
    @Expose
    private Boolean AllowSync;

    /**
    * <p>资产离线时是否自动清除其历史风险结果。true 清除，false 保留。</p>
    */
    @SerializedName("CleanRiskWhenOffline")
    @Expose
    private Boolean CleanRiskWhenOffline;

    /**
    * <p>Agent 单次扫描的超时时间，单位秒。取值范围 [60, 86400]，默认 1800。</p>
    */
    @SerializedName("AgentScanTimeout")
    @Expose
    private Long AgentScanTimeout;

    /**
     * Get <p>是否允许集团管理员将基线配置同步到本账号。true 允许，false 不允许。</p> 
     * @return AllowSync <p>是否允许集团管理员将基线配置同步到本账号。true 允许，false 不允许。</p>
     */
    public Boolean getAllowSync() {
        return this.AllowSync;
    }

    /**
     * Set <p>是否允许集团管理员将基线配置同步到本账号。true 允许，false 不允许。</p>
     * @param AllowSync <p>是否允许集团管理员将基线配置同步到本账号。true 允许，false 不允许。</p>
     */
    public void setAllowSync(Boolean AllowSync) {
        this.AllowSync = AllowSync;
    }

    /**
     * Get <p>资产离线时是否自动清除其历史风险结果。true 清除，false 保留。</p> 
     * @return CleanRiskWhenOffline <p>资产离线时是否自动清除其历史风险结果。true 清除，false 保留。</p>
     */
    public Boolean getCleanRiskWhenOffline() {
        return this.CleanRiskWhenOffline;
    }

    /**
     * Set <p>资产离线时是否自动清除其历史风险结果。true 清除，false 保留。</p>
     * @param CleanRiskWhenOffline <p>资产离线时是否自动清除其历史风险结果。true 清除，false 保留。</p>
     */
    public void setCleanRiskWhenOffline(Boolean CleanRiskWhenOffline) {
        this.CleanRiskWhenOffline = CleanRiskWhenOffline;
    }

    /**
     * Get <p>Agent 单次扫描的超时时间，单位秒。取值范围 [60, 86400]，默认 1800。</p> 
     * @return AgentScanTimeout <p>Agent 单次扫描的超时时间，单位秒。取值范围 [60, 86400]，默认 1800。</p>
     */
    public Long getAgentScanTimeout() {
        return this.AgentScanTimeout;
    }

    /**
     * Set <p>Agent 单次扫描的超时时间，单位秒。取值范围 [60, 86400]，默认 1800。</p>
     * @param AgentScanTimeout <p>Agent 单次扫描的超时时间，单位秒。取值范围 [60, 86400]，默认 1800。</p>
     */
    public void setAgentScanTimeout(Long AgentScanTimeout) {
        this.AgentScanTimeout = AgentScanTimeout;
    }

    public BaselineUserOtherConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineUserOtherConf(BaselineUserOtherConf source) {
        if (source.AllowSync != null) {
            this.AllowSync = new Boolean(source.AllowSync);
        }
        if (source.CleanRiskWhenOffline != null) {
            this.CleanRiskWhenOffline = new Boolean(source.CleanRiskWhenOffline);
        }
        if (source.AgentScanTimeout != null) {
            this.AgentScanTimeout = new Long(source.AgentScanTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowSync", this.AllowSync);
        this.setParamSimple(map, prefix + "CleanRiskWhenOffline", this.CleanRiskWhenOffline);
        this.setParamSimple(map, prefix + "AgentScanTimeout", this.AgentScanTimeout);

    }
}

