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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDiskRequest extends AbstractModel {

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云硬盘的续费时长。<br>在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时云硬盘会按对齐到实例续费后的到期时间来续费。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云硬盘的续费时长。<br>在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时云硬盘会按对齐到实例续费后的到期时间来续费。 
     * @return DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云硬盘的续费时长。<br>在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时云硬盘会按对齐到实例续费后的到期时间来续费。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云硬盘的续费时长。<br>在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时云硬盘会按对齐到实例续费后的到期时间来续费。
     * @param DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云硬盘的续费时长。<br>在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时云硬盘会按对齐到实例续费后的到期时间来续费。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。 
     * @return DiskId 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @param DiskId 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public RenewDiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDiskRequest(RenewDiskRequest source) {
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

