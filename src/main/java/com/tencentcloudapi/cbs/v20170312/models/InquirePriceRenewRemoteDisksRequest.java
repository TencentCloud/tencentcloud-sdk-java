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

public class InquirePriceRenewRemoteDisksRequest extends AbstractModel {

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
    */
    @SerializedName("DiskChargePrepaidSet")
    @Expose
    private RemoteDiskChargePrepaid [] DiskChargePrepaidSet;

    /**
    * <p>一个或多个单副本SSD硬盘ID。</p>
    */
    @SerializedName("RemoteDiskIds")
    @Expose
    private String [] RemoteDiskIds;

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p> 
     * @return DiskChargePrepaidSet <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
     */
    public RemoteDiskChargePrepaid [] getDiskChargePrepaidSet() {
        return this.DiskChargePrepaidSet;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
     * @param DiskChargePrepaidSet <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月云盘的购买时长。如果在该参数中指定CurInstanceDeadline，则会按对齐到子机到期时间来续费。如果是批量续费询价，该参数与Disks参数一一对应，元素数量需保持一致。</p>
     */
    public void setDiskChargePrepaidSet(RemoteDiskChargePrepaid [] DiskChargePrepaidSet) {
        this.DiskChargePrepaidSet = DiskChargePrepaidSet;
    }

    /**
     * Get <p>一个或多个单副本SSD硬盘ID。</p> 
     * @return RemoteDiskIds <p>一个或多个单副本SSD硬盘ID。</p>
     */
    public String [] getRemoteDiskIds() {
        return this.RemoteDiskIds;
    }

    /**
     * Set <p>一个或多个单副本SSD硬盘ID。</p>
     * @param RemoteDiskIds <p>一个或多个单副本SSD硬盘ID。</p>
     */
    public void setRemoteDiskIds(String [] RemoteDiskIds) {
        this.RemoteDiskIds = RemoteDiskIds;
    }

    public InquirePriceRenewRemoteDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewRemoteDisksRequest(InquirePriceRenewRemoteDisksRequest source) {
        if (source.DiskChargePrepaidSet != null) {
            this.DiskChargePrepaidSet = new RemoteDiskChargePrepaid[source.DiskChargePrepaidSet.length];
            for (int i = 0; i < source.DiskChargePrepaidSet.length; i++) {
                this.DiskChargePrepaidSet[i] = new RemoteDiskChargePrepaid(source.DiskChargePrepaidSet[i]);
            }
        }
        if (source.RemoteDiskIds != null) {
            this.RemoteDiskIds = new String[source.RemoteDiskIds.length];
            for (int i = 0; i < source.RemoteDiskIds.length; i++) {
                this.RemoteDiskIds[i] = new String(source.RemoteDiskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DiskChargePrepaidSet.", this.DiskChargePrepaidSet);
        this.setParamArraySimple(map, prefix + "RemoteDiskIds.", this.RemoteDiskIds);

    }
}

