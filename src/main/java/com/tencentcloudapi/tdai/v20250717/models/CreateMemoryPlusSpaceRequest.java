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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMemoryPlusSpaceRequest extends AbstractModel {

    /**
    * <p>Memory 实例的自定义名称，用于唯一标识和管理实例。支持 60 个字符内的中英文、数字、中划线（-）及下划线（_）。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>emory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。长度限制为 0-200 个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>以键值对（Key-Value）形式为 Memory 实例绑定的标签，用于项目管理、成本分摊、环境隔离等场景。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>单次批量创建 Memory 实例的数量。取值范围为 1-50。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>计费模式。</p><p>枚举值：</p><ul><li>0： 按量计费。</li><li>1： 包年包月。</li></ul>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>包年包月周期</p>
    */
    @SerializedName("PayPeriod")
    @Expose
    private Long PayPeriod;

    /**
    * <p>是否自动续费</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
     * Get <p>Memory 实例的自定义名称，用于唯一标识和管理实例。支持 60 个字符内的中英文、数字、中划线（-）及下划线（_）。</p> 
     * @return Name <p>Memory 实例的自定义名称，用于唯一标识和管理实例。支持 60 个字符内的中英文、数字、中划线（-）及下划线（_）。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Memory 实例的自定义名称，用于唯一标识和管理实例。支持 60 个字符内的中英文、数字、中划线（-）及下划线（_）。</p>
     * @param Name <p>Memory 实例的自定义名称，用于唯一标识和管理实例。支持 60 个字符内的中英文、数字、中划线（-）及下划线（_）。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>emory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。长度限制为 0-200 个字符。</p> 
     * @return Description <p>emory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。长度限制为 0-200 个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>emory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。长度限制为 0-200 个字符。</p>
     * @param Description <p>emory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。长度限制为 0-200 个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>以键值对（Key-Value）形式为 Memory 实例绑定的标签，用于项目管理、成本分摊、环境隔离等场景。</p> 
     * @return ResourceTags <p>以键值对（Key-Value）形式为 Memory 实例绑定的标签，用于项目管理、成本分摊、环境隔离等场景。</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>以键值对（Key-Value）形式为 Memory 实例绑定的标签，用于项目管理、成本分摊、环境隔离等场景。</p>
     * @param ResourceTags <p>以键值对（Key-Value）形式为 Memory 实例绑定的标签，用于项目管理、成本分摊、环境隔离等场景。</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>单次批量创建 Memory 实例的数量。取值范围为 1-50。</p> 
     * @return GoodsNum <p>单次批量创建 Memory 实例的数量。取值范围为 1-50。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>单次批量创建 Memory 实例的数量。取值范围为 1-50。</p>
     * @param GoodsNum <p>单次批量创建 Memory 实例的数量。取值范围为 1-50。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>计费模式。</p><p>枚举值：</p><ul><li>0： 按量计费。</li><li>1： 包年包月。</li></ul> 
     * @return PayMode <p>计费模式。</p><p>枚举值：</p><ul><li>0： 按量计费。</li><li>1： 包年包月。</li></ul>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式。</p><p>枚举值：</p><ul><li>0： 按量计费。</li><li>1： 包年包月。</li></ul>
     * @param PayMode <p>计费模式。</p><p>枚举值：</p><ul><li>0： 按量计费。</li><li>1： 包年包月。</li></ul>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>包年包月周期</p> 
     * @return PayPeriod <p>包年包月周期</p>
     */
    public Long getPayPeriod() {
        return this.PayPeriod;
    }

    /**
     * Set <p>包年包月周期</p>
     * @param PayPeriod <p>包年包月周期</p>
     */
    public void setPayPeriod(Long PayPeriod) {
        this.PayPeriod = PayPeriod;
    }

    /**
     * Get <p>是否自动续费</p> 
     * @return AutoRenew <p>是否自动续费</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>是否自动续费</p>
     * @param AutoRenew <p>是否自动续费</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    public CreateMemoryPlusSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMemoryPlusSpaceRequest(CreateMemoryPlusSpaceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PayPeriod != null) {
            this.PayPeriod = new Long(source.PayPeriod);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayPeriod", this.PayPeriod);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

