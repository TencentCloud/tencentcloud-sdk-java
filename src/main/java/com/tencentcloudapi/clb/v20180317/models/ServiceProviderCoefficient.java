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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceProviderCoefficient extends AbstractModel {

    /**
    * <p>该 BYOK 实例（ServiceProvider）维度的积分系数。</p><p>可选字段：仅当该实例单独配置了 ServiceProvider 维度系数时返回，返回值即该实例的生效系数；未返回时表示该实例继承所属 ModelAlias 的 <code>Coefficient</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coefficient")
    @Expose
    private Coefficient Coefficient;

    /**
    * <p>BYOK 实例（ServiceProvider）ID。</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>BYOK 实例（ServiceProvider）名称。</p>
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>分级积分系数设置</p>
    */
    @SerializedName("CoefficientTiers")
    @Expose
    private CoefficientTier [] CoefficientTiers;

    /**
    * <p>峰谷积分系数设置</p>
    */
    @SerializedName("CoefficientSchedule")
    @Expose
    private CoefficientScheduleRule [] CoefficientSchedule;

    /**
     * Get <p>该 BYOK 实例（ServiceProvider）维度的积分系数。</p><p>可选字段：仅当该实例单独配置了 ServiceProvider 维度系数时返回，返回值即该实例的生效系数；未返回时表示该实例继承所属 ModelAlias 的 <code>Coefficient</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coefficient <p>该 BYOK 实例（ServiceProvider）维度的积分系数。</p><p>可选字段：仅当该实例单独配置了 ServiceProvider 维度系数时返回，返回值即该实例的生效系数；未返回时表示该实例继承所属 ModelAlias 的 <code>Coefficient</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coefficient getCoefficient() {
        return this.Coefficient;
    }

    /**
     * Set <p>该 BYOK 实例（ServiceProvider）维度的积分系数。</p><p>可选字段：仅当该实例单独配置了 ServiceProvider 维度系数时返回，返回值即该实例的生效系数；未返回时表示该实例继承所属 ModelAlias 的 <code>Coefficient</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coefficient <p>该 BYOK 实例（ServiceProvider）维度的积分系数。</p><p>可选字段：仅当该实例单独配置了 ServiceProvider 维度系数时返回，返回值即该实例的生效系数；未返回时表示该实例继承所属 ModelAlias 的 <code>Coefficient</code>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoefficient(Coefficient Coefficient) {
        this.Coefficient = Coefficient;
    }

    /**
     * Get <p>BYOK 实例（ServiceProvider）ID。</p> 
     * @return ServiceProviderId <p>BYOK 实例（ServiceProvider）ID。</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK 实例（ServiceProvider）ID。</p>
     * @param ServiceProviderId <p>BYOK 实例（ServiceProvider）ID。</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>BYOK 实例（ServiceProvider）名称。</p> 
     * @return ServiceProviderName <p>BYOK 实例（ServiceProvider）名称。</p>
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>BYOK 实例（ServiceProvider）名称。</p>
     * @param ServiceProviderName <p>BYOK 实例（ServiceProvider）名称。</p>
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>分级积分系数设置</p> 
     * @return CoefficientTiers <p>分级积分系数设置</p>
     */
    public CoefficientTier [] getCoefficientTiers() {
        return this.CoefficientTiers;
    }

    /**
     * Set <p>分级积分系数设置</p>
     * @param CoefficientTiers <p>分级积分系数设置</p>
     */
    public void setCoefficientTiers(CoefficientTier [] CoefficientTiers) {
        this.CoefficientTiers = CoefficientTiers;
    }

    /**
     * Get <p>峰谷积分系数设置</p> 
     * @return CoefficientSchedule <p>峰谷积分系数设置</p>
     */
    public CoefficientScheduleRule [] getCoefficientSchedule() {
        return this.CoefficientSchedule;
    }

    /**
     * Set <p>峰谷积分系数设置</p>
     * @param CoefficientSchedule <p>峰谷积分系数设置</p>
     */
    public void setCoefficientSchedule(CoefficientScheduleRule [] CoefficientSchedule) {
        this.CoefficientSchedule = CoefficientSchedule;
    }

    public ServiceProviderCoefficient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProviderCoefficient(ServiceProviderCoefficient source) {
        if (source.Coefficient != null) {
            this.Coefficient = new Coefficient(source.Coefficient);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.CoefficientTiers != null) {
            this.CoefficientTiers = new CoefficientTier[source.CoefficientTiers.length];
            for (int i = 0; i < source.CoefficientTiers.length; i++) {
                this.CoefficientTiers[i] = new CoefficientTier(source.CoefficientTiers[i]);
            }
        }
        if (source.CoefficientSchedule != null) {
            this.CoefficientSchedule = new CoefficientScheduleRule[source.CoefficientSchedule.length];
            for (int i = 0; i < source.CoefficientSchedule.length; i++) {
                this.CoefficientSchedule[i] = new CoefficientScheduleRule(source.CoefficientSchedule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Coefficient.", this.Coefficient);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamArrayObj(map, prefix + "CoefficientTiers.", this.CoefficientTiers);
        this.setParamArrayObj(map, prefix + "CoefficientSchedule.", this.CoefficientSchedule);

    }
}

