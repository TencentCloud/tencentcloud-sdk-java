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

public class ModifyModelAliasAttributesRequest extends AbstractModel {

    /**
    * <p>模型别名</p>
    */
    @SerializedName("ModelAliasNames")
    @Expose
    private String [] ModelAliasNames;

    /**
    * <p>基础积分系数配置，选填。不传时保留原配置。各系数字段均为选填，取值范围为 [0, 5000]，最多支持 6 位小数，0 表示零价。传入本参数时，至少填写一项有效系数，不能传空对象。</p>
    */
    @SerializedName("Coefficient")
    @Expose
    private Coefficient Coefficient;

    /**
    * <p>BYOK 实例（ServiceProvider）ID 列表。</p><p>可选，数组。传入时按 ServiceProvider 维度修改：把同一份 Coefficient 批量应用到数组内每一个实例（覆盖配置，仅作用于这些实例），此时 <code>ModelAliasNames</code> 只能传 1 个别名（即 1 别名 × N ServiceProvider）；数组需去重、非空、上限 100，任一实例不归属/不存在/该实例下无该别名将整批返回错误。不传时按 ModelAlias（账号）维度修改，作用于该别名下未单独配置覆盖的全部实例。</p>
    */
    @SerializedName("ServiceProviderIds")
    @Expose
    private String [] ServiceProviderIds;

    /**
    * <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
    */
    @SerializedName("Capability")
    @Expose
    private String Capability;

    /**
    * <p>积分梯度设置</p>
    */
    @SerializedName("CoefficientTiers")
    @Expose
    private CoefficientTier [] CoefficientTiers;

    /**
    * <p>积分峰谷设置</p>
    */
    @SerializedName("CoefficientSchedule")
    @Expose
    private CoefficientScheduleRule [] CoefficientSchedule;

    /**
     * Get <p>模型别名</p> 
     * @return ModelAliasNames <p>模型别名</p>
     */
    public String [] getModelAliasNames() {
        return this.ModelAliasNames;
    }

    /**
     * Set <p>模型别名</p>
     * @param ModelAliasNames <p>模型别名</p>
     */
    public void setModelAliasNames(String [] ModelAliasNames) {
        this.ModelAliasNames = ModelAliasNames;
    }

    /**
     * Get <p>基础积分系数配置，选填。不传时保留原配置。各系数字段均为选填，取值范围为 [0, 5000]，最多支持 6 位小数，0 表示零价。传入本参数时，至少填写一项有效系数，不能传空对象。</p> 
     * @return Coefficient <p>基础积分系数配置，选填。不传时保留原配置。各系数字段均为选填，取值范围为 [0, 5000]，最多支持 6 位小数，0 表示零价。传入本参数时，至少填写一项有效系数，不能传空对象。</p>
     */
    public Coefficient getCoefficient() {
        return this.Coefficient;
    }

    /**
     * Set <p>基础积分系数配置，选填。不传时保留原配置。各系数字段均为选填，取值范围为 [0, 5000]，最多支持 6 位小数，0 表示零价。传入本参数时，至少填写一项有效系数，不能传空对象。</p>
     * @param Coefficient <p>基础积分系数配置，选填。不传时保留原配置。各系数字段均为选填，取值范围为 [0, 5000]，最多支持 6 位小数，0 表示零价。传入本参数时，至少填写一项有效系数，不能传空对象。</p>
     */
    public void setCoefficient(Coefficient Coefficient) {
        this.Coefficient = Coefficient;
    }

    /**
     * Get <p>BYOK 实例（ServiceProvider）ID 列表。</p><p>可选，数组。传入时按 ServiceProvider 维度修改：把同一份 Coefficient 批量应用到数组内每一个实例（覆盖配置，仅作用于这些实例），此时 <code>ModelAliasNames</code> 只能传 1 个别名（即 1 别名 × N ServiceProvider）；数组需去重、非空、上限 100，任一实例不归属/不存在/该实例下无该别名将整批返回错误。不传时按 ModelAlias（账号）维度修改，作用于该别名下未单独配置覆盖的全部实例。</p> 
     * @return ServiceProviderIds <p>BYOK 实例（ServiceProvider）ID 列表。</p><p>可选，数组。传入时按 ServiceProvider 维度修改：把同一份 Coefficient 批量应用到数组内每一个实例（覆盖配置，仅作用于这些实例），此时 <code>ModelAliasNames</code> 只能传 1 个别名（即 1 别名 × N ServiceProvider）；数组需去重、非空、上限 100，任一实例不归属/不存在/该实例下无该别名将整批返回错误。不传时按 ModelAlias（账号）维度修改，作用于该别名下未单独配置覆盖的全部实例。</p>
     */
    public String [] getServiceProviderIds() {
        return this.ServiceProviderIds;
    }

    /**
     * Set <p>BYOK 实例（ServiceProvider）ID 列表。</p><p>可选，数组。传入时按 ServiceProvider 维度修改：把同一份 Coefficient 批量应用到数组内每一个实例（覆盖配置，仅作用于这些实例），此时 <code>ModelAliasNames</code> 只能传 1 个别名（即 1 别名 × N ServiceProvider）；数组需去重、非空、上限 100，任一实例不归属/不存在/该实例下无该别名将整批返回错误。不传时按 ModelAlias（账号）维度修改，作用于该别名下未单独配置覆盖的全部实例。</p>
     * @param ServiceProviderIds <p>BYOK 实例（ServiceProvider）ID 列表。</p><p>可选，数组。传入时按 ServiceProvider 维度修改：把同一份 Coefficient 批量应用到数组内每一个实例（覆盖配置，仅作用于这些实例），此时 <code>ModelAliasNames</code> 只能传 1 个别名（即 1 别名 × N ServiceProvider）；数组需去重、非空、上限 100，任一实例不归属/不存在/该实例下无该别名将整批返回错误。不传时按 ModelAlias（账号）维度修改，作用于该别名下未单独配置覆盖的全部实例。</p>
     */
    public void setServiceProviderIds(String [] ServiceProviderIds) {
        this.ServiceProviderIds = ServiceProviderIds;
    }

    /**
     * Get <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul> 
     * @return Capability <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
     */
    public String getCapability() {
        return this.Capability;
    }

    /**
     * Set <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
     * @param Capability <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
     */
    public void setCapability(String Capability) {
        this.Capability = Capability;
    }

    /**
     * Get <p>积分梯度设置</p> 
     * @return CoefficientTiers <p>积分梯度设置</p>
     */
    public CoefficientTier [] getCoefficientTiers() {
        return this.CoefficientTiers;
    }

    /**
     * Set <p>积分梯度设置</p>
     * @param CoefficientTiers <p>积分梯度设置</p>
     */
    public void setCoefficientTiers(CoefficientTier [] CoefficientTiers) {
        this.CoefficientTiers = CoefficientTiers;
    }

    /**
     * Get <p>积分峰谷设置</p> 
     * @return CoefficientSchedule <p>积分峰谷设置</p>
     */
    public CoefficientScheduleRule [] getCoefficientSchedule() {
        return this.CoefficientSchedule;
    }

    /**
     * Set <p>积分峰谷设置</p>
     * @param CoefficientSchedule <p>积分峰谷设置</p>
     */
    public void setCoefficientSchedule(CoefficientScheduleRule [] CoefficientSchedule) {
        this.CoefficientSchedule = CoefficientSchedule;
    }

    public ModifyModelAliasAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelAliasAttributesRequest(ModifyModelAliasAttributesRequest source) {
        if (source.ModelAliasNames != null) {
            this.ModelAliasNames = new String[source.ModelAliasNames.length];
            for (int i = 0; i < source.ModelAliasNames.length; i++) {
                this.ModelAliasNames[i] = new String(source.ModelAliasNames[i]);
            }
        }
        if (source.Coefficient != null) {
            this.Coefficient = new Coefficient(source.Coefficient);
        }
        if (source.ServiceProviderIds != null) {
            this.ServiceProviderIds = new String[source.ServiceProviderIds.length];
            for (int i = 0; i < source.ServiceProviderIds.length; i++) {
                this.ServiceProviderIds[i] = new String(source.ServiceProviderIds[i]);
            }
        }
        if (source.Capability != null) {
            this.Capability = new String(source.Capability);
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
        this.setParamArraySimple(map, prefix + "ModelAliasNames.", this.ModelAliasNames);
        this.setParamObj(map, prefix + "Coefficient.", this.Coefficient);
        this.setParamArraySimple(map, prefix + "ServiceProviderIds.", this.ServiceProviderIds);
        this.setParamSimple(map, prefix + "Capability", this.Capability);
        this.setParamArrayObj(map, prefix + "CoefficientTiers.", this.CoefficientTiers);
        this.setParamArrayObj(map, prefix + "CoefficientSchedule.", this.CoefficientSchedule);

    }
}

