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

public class InquiryPriceModifyInstancesChargeTypeRequest extends AbstractModel {

    /**
    * 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 修改后的实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量付费。</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<dx-alert infotype="explain" title="">若指定修改后实例的付费模式为预付费则该参数必传。</dx-alert>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 是否同时切换弹性数据云盘计费模式。取值范围：<br><li>true：表示切换弹性数据云盘计费模式</li><li>false：表示不切换弹性数据云盘计费模式</li><br>默认取值：false。
    */
    @SerializedName("ModifyPortableDataDisk")
    @Expose
    private Boolean ModifyPortableDataDisk;

    /**
     * Get 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。 
     * @return InstanceIds 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     * @param InstanceIds 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 修改后的实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量付费。</li> 
     * @return InstanceChargeType 修改后的实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量付费。</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 修改后的实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量付费。</li>
     * @param InstanceChargeType 修改后的实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量付费。</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<dx-alert infotype="explain" title="">若指定修改后实例的付费模式为预付费则该参数必传。</dx-alert> 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<dx-alert infotype="explain" title="">若指定修改后实例的付费模式为预付费则该参数必传。</dx-alert>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<dx-alert infotype="explain" title="">若指定修改后实例的付费模式为预付费则该参数必传。</dx-alert>
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。<dx-alert infotype="explain" title="">若指定修改后实例的付费模式为预付费则该参数必传。</dx-alert>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 是否同时切换弹性数据云盘计费模式。取值范围：<br><li>true：表示切换弹性数据云盘计费模式</li><li>false：表示不切换弹性数据云盘计费模式</li><br>默认取值：false。 
     * @return ModifyPortableDataDisk 是否同时切换弹性数据云盘计费模式。取值范围：<br><li>true：表示切换弹性数据云盘计费模式</li><li>false：表示不切换弹性数据云盘计费模式</li><br>默认取值：false。
     */
    public Boolean getModifyPortableDataDisk() {
        return this.ModifyPortableDataDisk;
    }

    /**
     * Set 是否同时切换弹性数据云盘计费模式。取值范围：<br><li>true：表示切换弹性数据云盘计费模式</li><li>false：表示不切换弹性数据云盘计费模式</li><br>默认取值：false。
     * @param ModifyPortableDataDisk 是否同时切换弹性数据云盘计费模式。取值范围：<br><li>true：表示切换弹性数据云盘计费模式</li><li>false：表示不切换弹性数据云盘计费模式</li><br>默认取值：false。
     */
    public void setModifyPortableDataDisk(Boolean ModifyPortableDataDisk) {
        this.ModifyPortableDataDisk = ModifyPortableDataDisk;
    }

    public InquiryPriceModifyInstancesChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceModifyInstancesChargeTypeRequest(InquiryPriceModifyInstancesChargeTypeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.ModifyPortableDataDisk != null) {
            this.ModifyPortableDataDisk = new Boolean(source.ModifyPortableDataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "ModifyPortableDataDisk", this.ModifyPortableDataDisk);

    }
}

