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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesBundleRequest extends AbstractModel{

    /**
    * 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求批量实例的上限为15。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 待变更的套餐Id。可通过[DescribeBundles](https://cloud.tencent.com/document/api/1207/47575)接口返回值中的BundleId获取。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 是否自动抵扣代金券。取值范围：
true：表示自动抵扣代金券
false：表示不自动抵扣代金券
默认取值：false。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
     * Get 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求批量实例的上限为15。 
     * @return InstanceIds 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求批量实例的上限为15。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求批量实例的上限为15。
     * @param InstanceIds 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求批量实例的上限为15。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 待变更的套餐Id。可通过[DescribeBundles](https://cloud.tencent.com/document/api/1207/47575)接口返回值中的BundleId获取。 
     * @return BundleId 待变更的套餐Id。可通过[DescribeBundles](https://cloud.tencent.com/document/api/1207/47575)接口返回值中的BundleId获取。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 待变更的套餐Id。可通过[DescribeBundles](https://cloud.tencent.com/document/api/1207/47575)接口返回值中的BundleId获取。
     * @param BundleId 待变更的套餐Id。可通过[DescribeBundles](https://cloud.tencent.com/document/api/1207/47575)接口返回值中的BundleId获取。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 是否自动抵扣代金券。取值范围：
true：表示自动抵扣代金券
false：表示不自动抵扣代金券
默认取值：false。 
     * @return AutoVoucher 是否自动抵扣代金券。取值范围：
true：表示自动抵扣代金券
false：表示不自动抵扣代金券
默认取值：false。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动抵扣代金券。取值范围：
true：表示自动抵扣代金券
false：表示不自动抵扣代金券
默认取值：false。
     * @param AutoVoucher 是否自动抵扣代金券。取值范围：
true：表示自动抵扣代金券
false：表示不自动抵扣代金券
默认取值：false。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public ModifyInstancesBundleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesBundleRequest(ModifyInstancesBundleRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

