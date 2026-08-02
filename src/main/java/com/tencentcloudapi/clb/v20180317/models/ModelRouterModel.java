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

public class ModelRouterModel extends AbstractModel {

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>所属厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>模型类型。</p><p>枚举值：</p><ul><li>BYOK： BYOK类型</li><li>Platform： 平台类型</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>BYOK实例ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>当前 CMR、当前绑定模型下该 BYOK实例的调度优先级。</p><p>取值范围：[0, 2]</p><p>默认值：0</p>
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * <p>当前CMR、当前绑定模型的同一有效Order层内，BYOK实例之间的相对选择权重。</p><p>取值范围：[0, 100]</p><p>默认值：10</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>所属厂商</p> 
     * @return Provider <p>所属厂商</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>所属厂商</p>
     * @param Provider <p>所属厂商</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>模型类型。</p><p>枚举值：</p><ul><li>BYOK： BYOK类型</li><li>Platform： 平台类型</li></ul> 
     * @return Type <p>模型类型。</p><p>枚举值：</p><ul><li>BYOK： BYOK类型</li><li>Platform： 平台类型</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模型类型。</p><p>枚举值：</p><ul><li>BYOK： BYOK类型</li><li>Platform： 平台类型</li></ul>
     * @param Type <p>模型类型。</p><p>枚举值：</p><ul><li>BYOK： BYOK类型</li><li>Platform： 平台类型</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>BYOK实例ID</p> 
     * @return ServiceProviderId <p>BYOK实例ID</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK实例ID</p>
     * @param ServiceProviderId <p>BYOK实例ID</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>当前 CMR、当前绑定模型下该 BYOK实例的调度优先级。</p><p>取值范围：[0, 2]</p><p>默认值：0</p> 
     * @return Order <p>当前 CMR、当前绑定模型下该 BYOK实例的调度优先级。</p><p>取值范围：[0, 2]</p><p>默认值：0</p>
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>当前 CMR、当前绑定模型下该 BYOK实例的调度优先级。</p><p>取值范围：[0, 2]</p><p>默认值：0</p>
     * @param Order <p>当前 CMR、当前绑定模型下该 BYOK实例的调度优先级。</p><p>取值范围：[0, 2]</p><p>默认值：0</p>
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get <p>当前CMR、当前绑定模型的同一有效Order层内，BYOK实例之间的相对选择权重。</p><p>取值范围：[0, 100]</p><p>默认值：10</p> 
     * @return Weight <p>当前CMR、当前绑定模型的同一有效Order层内，BYOK实例之间的相对选择权重。</p><p>取值范围：[0, 100]</p><p>默认值：10</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>当前CMR、当前绑定模型的同一有效Order层内，BYOK实例之间的相对选择权重。</p><p>取值范围：[0, 100]</p><p>默认值：10</p>
     * @param Weight <p>当前CMR、当前绑定模型的同一有效Order层内，BYOK实例之间的相对选择权重。</p><p>取值范围：[0, 100]</p><p>默认值：10</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public ModelRouterModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterModel(ModelRouterModel source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

