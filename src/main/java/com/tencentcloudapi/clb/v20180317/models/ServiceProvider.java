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

public class ServiceProvider extends AbstractModel {

    /**
    * <p>BYOK类型</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>单个byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
    */
    @SerializedName("InputModalities")
    @Expose
    private String [] InputModalities;

    /**
    * <p>模型协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>BYOK的所属厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>BYOK实例ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>BYOK名称</p>
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>绑定的指定模型组内BYOK实例的调度优先级</p><p>取值范围[0,2]，优先级随数值增大而降低。</p>
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * <p>绑定的指定模型组Order相同层级内BYOK实例的调度权重</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>CMR实例-BYOK实例的模型调度绑定关系状态</p><p>枚举值：</p><ul><li>Configuring： 变配中</li><li>ConfigureFailed： 变配失败</li><li>Deleting： 删除中</li><li>Provisioning： 创建中</li><li>Active： 正常可用</li><li>ProvisionFailed： 创建失败</li><li>DeletionFailed： 删除失败</li></ul>
    */
    @SerializedName("AssociationStatus")
    @Expose
    private String AssociationStatus;

    /**
     * Get <p>BYOK类型</p> 
     * @return AccessType <p>BYOK类型</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>BYOK类型</p>
     * @param AccessType <p>BYOK类型</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>单个byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul> 
     * @return InputModalities <p>单个byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
     */
    public String [] getInputModalities() {
        return this.InputModalities;
    }

    /**
     * Set <p>单个byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
     * @param InputModalities <p>单个byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
     */
    public void setInputModalities(String [] InputModalities) {
        this.InputModalities = InputModalities;
    }

    /**
     * Get <p>模型协议</p> 
     * @return Protocol <p>模型协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>模型协议</p>
     * @param Protocol <p>模型协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>BYOK的所属厂商</p> 
     * @return Provider <p>BYOK的所属厂商</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>BYOK的所属厂商</p>
     * @param Provider <p>BYOK的所属厂商</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
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
     * Get <p>BYOK名称</p> 
     * @return ServiceProviderName <p>BYOK名称</p>
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>BYOK名称</p>
     * @param ServiceProviderName <p>BYOK名称</p>
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>绑定的指定模型组内BYOK实例的调度优先级</p><p>取值范围[0,2]，优先级随数值增大而降低。</p> 
     * @return Order <p>绑定的指定模型组内BYOK实例的调度优先级</p><p>取值范围[0,2]，优先级随数值增大而降低。</p>
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>绑定的指定模型组内BYOK实例的调度优先级</p><p>取值范围[0,2]，优先级随数值增大而降低。</p>
     * @param Order <p>绑定的指定模型组内BYOK实例的调度优先级</p><p>取值范围[0,2]，优先级随数值增大而降低。</p>
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get <p>绑定的指定模型组Order相同层级内BYOK实例的调度权重</p> 
     * @return Weight <p>绑定的指定模型组Order相同层级内BYOK实例的调度权重</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>绑定的指定模型组Order相同层级内BYOK实例的调度权重</p>
     * @param Weight <p>绑定的指定模型组Order相同层级内BYOK实例的调度权重</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>CMR实例-BYOK实例的模型调度绑定关系状态</p><p>枚举值：</p><ul><li>Configuring： 变配中</li><li>ConfigureFailed： 变配失败</li><li>Deleting： 删除中</li><li>Provisioning： 创建中</li><li>Active： 正常可用</li><li>ProvisionFailed： 创建失败</li><li>DeletionFailed： 删除失败</li></ul> 
     * @return AssociationStatus <p>CMR实例-BYOK实例的模型调度绑定关系状态</p><p>枚举值：</p><ul><li>Configuring： 变配中</li><li>ConfigureFailed： 变配失败</li><li>Deleting： 删除中</li><li>Provisioning： 创建中</li><li>Active： 正常可用</li><li>ProvisionFailed： 创建失败</li><li>DeletionFailed： 删除失败</li></ul>
     */
    public String getAssociationStatus() {
        return this.AssociationStatus;
    }

    /**
     * Set <p>CMR实例-BYOK实例的模型调度绑定关系状态</p><p>枚举值：</p><ul><li>Configuring： 变配中</li><li>ConfigureFailed： 变配失败</li><li>Deleting： 删除中</li><li>Provisioning： 创建中</li><li>Active： 正常可用</li><li>ProvisionFailed： 创建失败</li><li>DeletionFailed： 删除失败</li></ul>
     * @param AssociationStatus <p>CMR实例-BYOK实例的模型调度绑定关系状态</p><p>枚举值：</p><ul><li>Configuring： 变配中</li><li>ConfigureFailed： 变配失败</li><li>Deleting： 删除中</li><li>Provisioning： 创建中</li><li>Active： 正常可用</li><li>ProvisionFailed： 创建失败</li><li>DeletionFailed： 删除失败</li></ul>
     */
    public void setAssociationStatus(String AssociationStatus) {
        this.AssociationStatus = AssociationStatus;
    }

    public ServiceProvider() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProvider(ServiceProvider source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.InputModalities != null) {
            this.InputModalities = new String[source.InputModalities.length];
            for (int i = 0; i < source.InputModalities.length; i++) {
                this.InputModalities[i] = new String(source.InputModalities[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.AssociationStatus != null) {
            this.AssociationStatus = new String(source.AssociationStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArraySimple(map, prefix + "InputModalities.", this.InputModalities);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "AssociationStatus", this.AssociationStatus);

    }
}

