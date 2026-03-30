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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurchaseResourcePoolPacksRequest extends AbstractModel {

    /**
    * 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例资源池预扣包的数量。1个数量代表1个半整机/整机资源池。取值范围：1-100。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 实例资源池预扣包的时长，单位：月。取值范围：1-60。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 实例资源池类型。取值范围：
<li>EXCLUSIVE：独享（默认值）</li>
<li>SHARED：共享</li>
注意：第一期仅支持EXCLUSIVE类型。
    */
    @SerializedName("ResourcePoolPackType")
    @Expose
    private String ResourcePoolPackType;

    /**
    * 自动放置开关，默认开启（true）。
<li>开启：在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。</li>
<li>关闭：在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。</li>
    */
    @SerializedName("AutoPlacement")
    @Expose
    private Boolean AutoPlacement;

    /**
    * 实例资源池的名称。长度限制：1-60个字符，支持中文、英文、数字、连接线"-"、下划线"_"。
    */
    @SerializedName("DedicatedResourcePoolPackName")
    @Expose
    private String DedicatedResourcePoolPackName;

    /**
    * 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（默认值）</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 试运行，用于校验请求参数是否正确。默认为false。
<li>true：发送检查请求，不会创建实例资源池。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId。</li>
<li>false（默认值）：发送正常请求，通过检查后直接创建实例资源池。</li>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。 
     * @return Zone 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
     * @param Zone 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。 
     * @return InstanceType 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
     * @param InstanceType 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例资源池预扣包的数量。1个数量代表1个半整机/整机资源池。取值范围：1-100。 
     * @return InstanceCount 实例资源池预扣包的数量。1个数量代表1个半整机/整机资源池。取值范围：1-100。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例资源池预扣包的数量。1个数量代表1个半整机/整机资源池。取值范围：1-100。
     * @param InstanceCount 实例资源池预扣包的数量。1个数量代表1个半整机/整机资源池。取值范围：1-100。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 实例资源池预扣包的时长，单位：月。取值范围：1-60。 
     * @return Period 实例资源池预扣包的时长，单位：月。取值范围：1-60。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 实例资源池预扣包的时长，单位：月。取值范围：1-60。
     * @param Period 实例资源池预扣包的时长，单位：月。取值范围：1-60。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 实例资源池类型。取值范围：
<li>EXCLUSIVE：独享（默认值）</li>
<li>SHARED：共享</li>
注意：第一期仅支持EXCLUSIVE类型。 
     * @return ResourcePoolPackType 实例资源池类型。取值范围：
<li>EXCLUSIVE：独享（默认值）</li>
<li>SHARED：共享</li>
注意：第一期仅支持EXCLUSIVE类型。
     */
    public String getResourcePoolPackType() {
        return this.ResourcePoolPackType;
    }

    /**
     * Set 实例资源池类型。取值范围：
<li>EXCLUSIVE：独享（默认值）</li>
<li>SHARED：共享</li>
注意：第一期仅支持EXCLUSIVE类型。
     * @param ResourcePoolPackType 实例资源池类型。取值范围：
<li>EXCLUSIVE：独享（默认值）</li>
<li>SHARED：共享</li>
注意：第一期仅支持EXCLUSIVE类型。
     */
    public void setResourcePoolPackType(String ResourcePoolPackType) {
        this.ResourcePoolPackType = ResourcePoolPackType;
    }

    /**
     * Get 自动放置开关，默认开启（true）。
<li>开启：在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。</li>
<li>关闭：在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。</li> 
     * @return AutoPlacement 自动放置开关，默认开启（true）。
<li>开启：在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。</li>
<li>关闭：在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。</li>
     */
    public Boolean getAutoPlacement() {
        return this.AutoPlacement;
    }

    /**
     * Set 自动放置开关，默认开启（true）。
<li>开启：在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。</li>
<li>关闭：在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。</li>
     * @param AutoPlacement 自动放置开关，默认开启（true）。
<li>开启：在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。</li>
<li>关闭：在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。</li>
     */
    public void setAutoPlacement(Boolean AutoPlacement) {
        this.AutoPlacement = AutoPlacement;
    }

    /**
     * Get 实例资源池的名称。长度限制：1-60个字符，支持中文、英文、数字、连接线"-"、下划线"_"。 
     * @return DedicatedResourcePoolPackName 实例资源池的名称。长度限制：1-60个字符，支持中文、英文、数字、连接线"-"、下划线"_"。
     */
    public String getDedicatedResourcePoolPackName() {
        return this.DedicatedResourcePoolPackName;
    }

    /**
     * Set 实例资源池的名称。长度限制：1-60个字符，支持中文、英文、数字、连接线"-"、下划线"_"。
     * @param DedicatedResourcePoolPackName 实例资源池的名称。长度限制：1-60个字符，支持中文、英文、数字、连接线"-"、下划线"_"。
     */
    public void setDedicatedResourcePoolPackName(String DedicatedResourcePoolPackName) {
        this.DedicatedResourcePoolPackName = DedicatedResourcePoolPackName;
    }

    /**
     * Get 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（默认值）</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li> 
     * @return RenewFlag 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（默认值）</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（默认值）</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
     * @param RenewFlag 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（默认值）</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 试运行，用于校验请求参数是否正确。默认为false。
<li>true：发送检查请求，不会创建实例资源池。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId。</li>
<li>false（默认值）：发送正常请求，通过检查后直接创建实例资源池。</li> 
     * @return DryRun 试运行，用于校验请求参数是否正确。默认为false。
<li>true：发送检查请求，不会创建实例资源池。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId。</li>
<li>false（默认值）：发送正常请求，通过检查后直接创建实例资源池。</li>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 试运行，用于校验请求参数是否正确。默认为false。
<li>true：发送检查请求，不会创建实例资源池。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId。</li>
<li>false（默认值）：发送正常请求，通过检查后直接创建实例资源池。</li>
     * @param DryRun 试运行，用于校验请求参数是否正确。默认为false。
<li>true：发送检查请求，不会创建实例资源池。检查项包括是否填写了必需参数，请求格式，业务限制等。如果检查不通过，则返回对应错误码；如果检查通过，则返回RequestId。</li>
<li>false（默认值）：发送正常请求，通过检查后直接创建实例资源池。</li>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public PurchaseResourcePoolPacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurchaseResourcePoolPacksRequest(PurchaseResourcePoolPacksRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ResourcePoolPackType != null) {
            this.ResourcePoolPackType = new String(source.ResourcePoolPackType);
        }
        if (source.AutoPlacement != null) {
            this.AutoPlacement = new Boolean(source.AutoPlacement);
        }
        if (source.DedicatedResourcePoolPackName != null) {
            this.DedicatedResourcePoolPackName = new String(source.DedicatedResourcePoolPackName);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ResourcePoolPackType", this.ResourcePoolPackType);
        this.setParamSimple(map, prefix + "AutoPlacement", this.AutoPlacement);
        this.setParamSimple(map, prefix + "DedicatedResourcePoolPackName", this.DedicatedResourcePoolPackName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

