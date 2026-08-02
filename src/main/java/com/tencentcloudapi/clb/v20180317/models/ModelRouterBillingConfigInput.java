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

public class ModelRouterBillingConfigInput extends AbstractModel {

    /**
    * <p>模型路由计费模式</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 按量计费</li><li>RESOURCE_PACKAGE： 按资源包抵扣</li></ul>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>实例规格</p><p>枚举值：</p><ul><li>t1.nano-01： 入门版</li><li>t1.nano-02： 轻量版</li><li>t1.nano-03： 轻量增强版</li><li>t1.micro-01： 微型版</li><li>t1.micro-02： 基础版</li><li>t1.small-01： 标准版</li><li>t1.small-02： 标准增强版</li><li>t1.medium-01： 进阶版</li><li>t1.medium-02： 进阶增强版</li><li>t1.large-01： 专业版</li><li>t1.large-02： 专业增强版</li><li>t1.xlarge-01： 旗舰版</li><li>t1.xlarge-02： 至尊版</li></ul>
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * <p>是否关联资源包抵扣</p><p>枚举值：</p><ul><li>true： 关联</li><li>false： 不关联</li></ul>
    */
    @SerializedName("AssociateResourcePackage")
    @Expose
    private Boolean AssociateResourcePackage;

    /**
     * Get <p>模型路由计费模式</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 按量计费</li><li>RESOURCE_PACKAGE： 按资源包抵扣</li></ul> 
     * @return ChargeType <p>模型路由计费模式</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 按量计费</li><li>RESOURCE_PACKAGE： 按资源包抵扣</li></ul>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>模型路由计费模式</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 按量计费</li><li>RESOURCE_PACKAGE： 按资源包抵扣</li></ul>
     * @param ChargeType <p>模型路由计费模式</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 按量计费</li><li>RESOURCE_PACKAGE： 按资源包抵扣</li></ul>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>实例规格</p><p>枚举值：</p><ul><li>t1.nano-01： 入门版</li><li>t1.nano-02： 轻量版</li><li>t1.nano-03： 轻量增强版</li><li>t1.micro-01： 微型版</li><li>t1.micro-02： 基础版</li><li>t1.small-01： 标准版</li><li>t1.small-02： 标准增强版</li><li>t1.medium-01： 进阶版</li><li>t1.medium-02： 进阶增强版</li><li>t1.large-01： 专业版</li><li>t1.large-02： 专业增强版</li><li>t1.xlarge-01： 旗舰版</li><li>t1.xlarge-02： 至尊版</li></ul> 
     * @return SlaType <p>实例规格</p><p>枚举值：</p><ul><li>t1.nano-01： 入门版</li><li>t1.nano-02： 轻量版</li><li>t1.nano-03： 轻量增强版</li><li>t1.micro-01： 微型版</li><li>t1.micro-02： 基础版</li><li>t1.small-01： 标准版</li><li>t1.small-02： 标准增强版</li><li>t1.medium-01： 进阶版</li><li>t1.medium-02： 进阶增强版</li><li>t1.large-01： 专业版</li><li>t1.large-02： 专业增强版</li><li>t1.xlarge-01： 旗舰版</li><li>t1.xlarge-02： 至尊版</li></ul>
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set <p>实例规格</p><p>枚举值：</p><ul><li>t1.nano-01： 入门版</li><li>t1.nano-02： 轻量版</li><li>t1.nano-03： 轻量增强版</li><li>t1.micro-01： 微型版</li><li>t1.micro-02： 基础版</li><li>t1.small-01： 标准版</li><li>t1.small-02： 标准增强版</li><li>t1.medium-01： 进阶版</li><li>t1.medium-02： 进阶增强版</li><li>t1.large-01： 专业版</li><li>t1.large-02： 专业增强版</li><li>t1.xlarge-01： 旗舰版</li><li>t1.xlarge-02： 至尊版</li></ul>
     * @param SlaType <p>实例规格</p><p>枚举值：</p><ul><li>t1.nano-01： 入门版</li><li>t1.nano-02： 轻量版</li><li>t1.nano-03： 轻量增强版</li><li>t1.micro-01： 微型版</li><li>t1.micro-02： 基础版</li><li>t1.small-01： 标准版</li><li>t1.small-02： 标准增强版</li><li>t1.medium-01： 进阶版</li><li>t1.medium-02： 进阶增强版</li><li>t1.large-01： 专业版</li><li>t1.large-02： 专业增强版</li><li>t1.xlarge-01： 旗舰版</li><li>t1.xlarge-02： 至尊版</li></ul>
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get <p>是否关联资源包抵扣</p><p>枚举值：</p><ul><li>true： 关联</li><li>false： 不关联</li></ul> 
     * @return AssociateResourcePackage <p>是否关联资源包抵扣</p><p>枚举值：</p><ul><li>true： 关联</li><li>false： 不关联</li></ul>
     */
    public Boolean getAssociateResourcePackage() {
        return this.AssociateResourcePackage;
    }

    /**
     * Set <p>是否关联资源包抵扣</p><p>枚举值：</p><ul><li>true： 关联</li><li>false： 不关联</li></ul>
     * @param AssociateResourcePackage <p>是否关联资源包抵扣</p><p>枚举值：</p><ul><li>true： 关联</li><li>false： 不关联</li></ul>
     */
    public void setAssociateResourcePackage(Boolean AssociateResourcePackage) {
        this.AssociateResourcePackage = AssociateResourcePackage;
    }

    public ModelRouterBillingConfigInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterBillingConfigInput(ModelRouterBillingConfigInput source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.AssociateResourcePackage != null) {
            this.AssociateResourcePackage = new Boolean(source.AssociateResourcePackage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "AssociateResourcePackage", this.AssociateResourcePackage);

    }
}

