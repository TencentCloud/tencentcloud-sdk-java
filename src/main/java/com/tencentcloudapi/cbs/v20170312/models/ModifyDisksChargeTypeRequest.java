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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisksChargeTypeRequest extends AbstractModel {

    /**
    * 一个或多个待操作的云硬盘ID,可以通过[DescribeDisks](/document/product/362/16315)接口查询。每次请求批量云硬盘上限为100。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 设置为预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * 设置为后付费模式
    */
    @SerializedName("DiskChargePostpaid")
    @Expose
    private Boolean DiskChargePostpaid;

    /**
     * Get 一个或多个待操作的云硬盘ID,可以通过[DescribeDisks](/document/product/362/16315)接口查询。每次请求批量云硬盘上限为100。 
     * @return DiskIds 一个或多个待操作的云硬盘ID,可以通过[DescribeDisks](/document/product/362/16315)接口查询。每次请求批量云硬盘上限为100。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 一个或多个待操作的云硬盘ID,可以通过[DescribeDisks](/document/product/362/16315)接口查询。每次请求批量云硬盘上限为100。
     * @param DiskIds 一个或多个待操作的云硬盘ID,可以通过[DescribeDisks](/document/product/362/16315)接口查询。每次请求批量云硬盘上限为100。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 设置为预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。 
     * @return DiskChargePrepaid 设置为预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 设置为预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
     * @param DiskChargePrepaid 设置为预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get 设置为后付费模式 
     * @return DiskChargePostpaid 设置为后付费模式
     */
    public Boolean getDiskChargePostpaid() {
        return this.DiskChargePostpaid;
    }

    /**
     * Set 设置为后付费模式
     * @param DiskChargePostpaid 设置为后付费模式
     */
    public void setDiskChargePostpaid(Boolean DiskChargePostpaid) {
        this.DiskChargePostpaid = DiskChargePostpaid;
    }

    public ModifyDisksChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDisksChargeTypeRequest(ModifyDisksChargeTypeRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskChargePostpaid != null) {
            this.DiskChargePostpaid = new Boolean(source.DiskChargePostpaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskChargePostpaid", this.DiskChargePostpaid);

    }
}

