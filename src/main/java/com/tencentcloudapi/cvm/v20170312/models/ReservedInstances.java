/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstances extends AbstractModel{

    /**
    * （此字段已废弃，建议使用字段：ReservedInstanceId）已购买的预留实例计费ID。形如：ri-rtbh4han。
    */
    @SerializedName("ReservedInstancesId")
    @Expose
    private String ReservedInstancesId;

    /**
    * 预留实例计费的规格。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费规格列表</a>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 预留实例计费开始时间。形如：1949-10-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 预留实例计费到期时间。形如：1949-10-01 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 已购买的预留实例计费个数。形如：10。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * 预留实例计费的类型。形如：S3。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 已购买的预留实例计费ID。形如：ri-rtbh4han。
    */
    @SerializedName("ReservedInstanceId")
    @Expose
    private String ReservedInstanceId;

    /**
    * 预留实例显示名称。形如：riname-01
    */
    @SerializedName("ReservedInstanceName")
    @Expose
    private String ReservedInstanceName;

    /**
     * Get （此字段已废弃，建议使用字段：ReservedInstanceId）已购买的预留实例计费ID。形如：ri-rtbh4han。 
     * @return ReservedInstancesId （此字段已废弃，建议使用字段：ReservedInstanceId）已购买的预留实例计费ID。形如：ri-rtbh4han。
     */
    public String getReservedInstancesId() {
        return this.ReservedInstancesId;
    }

    /**
     * Set （此字段已废弃，建议使用字段：ReservedInstanceId）已购买的预留实例计费ID。形如：ri-rtbh4han。
     * @param ReservedInstancesId （此字段已废弃，建议使用字段：ReservedInstanceId）已购买的预留实例计费ID。形如：ri-rtbh4han。
     */
    public void setReservedInstancesId(String ReservedInstancesId) {
        this.ReservedInstancesId = ReservedInstancesId;
    }

    /**
     * Get 预留实例计费的规格。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费规格列表</a> 
     * @return InstanceType 预留实例计费的规格。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费规格列表</a>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 预留实例计费的规格。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费规格列表</a>
     * @param InstanceType 预留实例计费的规格。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费规格列表</a>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a> 
     * @return Zone 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     * @param Zone 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 预留实例计费开始时间。形如：1949-10-01 00:00:00 
     * @return StartTime 预留实例计费开始时间。形如：1949-10-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预留实例计费开始时间。形如：1949-10-01 00:00:00
     * @param StartTime 预留实例计费开始时间。形如：1949-10-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预留实例计费到期时间。形如：1949-10-01 00:00:00 
     * @return EndTime 预留实例计费到期时间。形如：1949-10-01 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预留实例计费到期时间。形如：1949-10-01 00:00:00
     * @param EndTime 预留实例计费到期时间。形如：1949-10-01 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。 
     * @return Duration 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     * @param Duration 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 已购买的预留实例计费个数。形如：10。 
     * @return InstanceCount 已购买的预留实例计费个数。形如：10。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 已购买的预留实例计费个数。形如：10。
     * @param InstanceCount 已购买的预留实例计费个数。形如：10。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。 
     * @return ProductDescription 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     * @param ProductDescription 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。 
     * @return State 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     * @param State 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。 
     * @return CurrencyCode 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     * @param CurrencyCode 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    /**
     * Get 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。 
     * @return OfferingType 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     * @param OfferingType 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get 预留实例计费的类型。形如：S3。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a> 
     * @return InstanceFamily 预留实例计费的类型。形如：S3。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 预留实例计费的类型。形如：S3。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     * @param InstanceFamily 预留实例计费的类型。形如：S3。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 已购买的预留实例计费ID。形如：ri-rtbh4han。 
     * @return ReservedInstanceId 已购买的预留实例计费ID。形如：ri-rtbh4han。
     */
    public String getReservedInstanceId() {
        return this.ReservedInstanceId;
    }

    /**
     * Set 已购买的预留实例计费ID。形如：ri-rtbh4han。
     * @param ReservedInstanceId 已购买的预留实例计费ID。形如：ri-rtbh4han。
     */
    public void setReservedInstanceId(String ReservedInstanceId) {
        this.ReservedInstanceId = ReservedInstanceId;
    }

    /**
     * Get 预留实例显示名称。形如：riname-01 
     * @return ReservedInstanceName 预留实例显示名称。形如：riname-01
     */
    public String getReservedInstanceName() {
        return this.ReservedInstanceName;
    }

    /**
     * Set 预留实例显示名称。形如：riname-01
     * @param ReservedInstanceName 预留实例显示名称。形如：riname-01
     */
    public void setReservedInstanceName(String ReservedInstanceName) {
        this.ReservedInstanceName = ReservedInstanceName;
    }

    public ReservedInstances() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstances(ReservedInstances source) {
        if (source.ReservedInstancesId != null) {
            this.ReservedInstancesId = new String(source.ReservedInstancesId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CurrencyCode != null) {
            this.CurrencyCode = new String(source.CurrencyCode);
        }
        if (source.OfferingType != null) {
            this.OfferingType = new String(source.OfferingType);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.ReservedInstanceId != null) {
            this.ReservedInstanceId = new String(source.ReservedInstanceId);
        }
        if (source.ReservedInstanceName != null) {
            this.ReservedInstanceName = new String(source.ReservedInstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservedInstancesId", this.ReservedInstancesId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "ReservedInstanceId", this.ReservedInstanceId);
        this.setParamSimple(map, prefix + "ReservedInstanceName", this.ReservedInstanceName);

    }
}

