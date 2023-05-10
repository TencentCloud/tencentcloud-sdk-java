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

public class RenewDisksRequest extends AbstractModel{

    /**
    * 云硬盘ID列表。一个或多个待操作的云硬盘ID。可通过[DescribeDisks](https://cloud.tencent.com/document/product/1207/66093)接口返回值中的DiskId获取。每次请求续费数据盘数量总计上限为50。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 续费云硬盘包年包月相关参数设置。
    */
    @SerializedName("RenewDiskChargePrepaid")
    @Expose
    private RenewDiskChargePrepaid RenewDiskChargePrepaid;

    /**
    * 是否自动使用代金券。默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
     * Get 云硬盘ID列表。一个或多个待操作的云硬盘ID。可通过[DescribeDisks](https://cloud.tencent.com/document/product/1207/66093)接口返回值中的DiskId获取。每次请求续费数据盘数量总计上限为50。 
     * @return DiskIds 云硬盘ID列表。一个或多个待操作的云硬盘ID。可通过[DescribeDisks](https://cloud.tencent.com/document/product/1207/66093)接口返回值中的DiskId获取。每次请求续费数据盘数量总计上限为50。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 云硬盘ID列表。一个或多个待操作的云硬盘ID。可通过[DescribeDisks](https://cloud.tencent.com/document/product/1207/66093)接口返回值中的DiskId获取。每次请求续费数据盘数量总计上限为50。
     * @param DiskIds 云硬盘ID列表。一个或多个待操作的云硬盘ID。可通过[DescribeDisks](https://cloud.tencent.com/document/product/1207/66093)接口返回值中的DiskId获取。每次请求续费数据盘数量总计上限为50。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 续费云硬盘包年包月相关参数设置。 
     * @return RenewDiskChargePrepaid 续费云硬盘包年包月相关参数设置。
     */
    public RenewDiskChargePrepaid getRenewDiskChargePrepaid() {
        return this.RenewDiskChargePrepaid;
    }

    /**
     * Set 续费云硬盘包年包月相关参数设置。
     * @param RenewDiskChargePrepaid 续费云硬盘包年包月相关参数设置。
     */
    public void setRenewDiskChargePrepaid(RenewDiskChargePrepaid RenewDiskChargePrepaid) {
        this.RenewDiskChargePrepaid = RenewDiskChargePrepaid;
    }

    /**
     * Get 是否自动使用代金券。默认不使用。 
     * @return AutoVoucher 是否自动使用代金券。默认不使用。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券。默认不使用。
     * @param AutoVoucher 是否自动使用代金券。默认不使用。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public RenewDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDisksRequest(RenewDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.RenewDiskChargePrepaid != null) {
            this.RenewDiskChargePrepaid = new RenewDiskChargePrepaid(source.RenewDiskChargePrepaid);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamObj(map, prefix + "RenewDiskChargePrepaid.", this.RenewDiskChargePrepaid);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

