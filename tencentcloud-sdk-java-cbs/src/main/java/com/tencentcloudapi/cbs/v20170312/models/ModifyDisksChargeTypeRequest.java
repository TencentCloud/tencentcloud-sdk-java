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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisksChargeTypeRequest extends AbstractModel{

    /**
    * 一个或多个待操作的云硬盘ID。每次请求批量云盘上限为100。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
     * Get 一个或多个待操作的云硬盘ID。每次请求批量云盘上限为100。 
     * @return DiskIds 一个或多个待操作的云硬盘ID。每次请求批量云盘上限为100。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 一个或多个待操作的云硬盘ID。每次请求批量云盘上限为100。
     * @param DiskIds 一个或多个待操作的云硬盘ID。每次请求批量云盘上限为100。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。 
     * @return DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
     * @param DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);

    }
}

