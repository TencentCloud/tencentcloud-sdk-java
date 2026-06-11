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

public class InquirePriceCreateRemoteDisksRequest extends AbstractModel {

    /**
    * <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费，即包年包月</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * <p>单副本SSD硬盘大小，单位为GiB。</p><p>取值范围：[2000, 7000]</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。 创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。</p>
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private RemoteDiskChargePrepaid DiskChargePrepaid;

    /**
    * <p>购买单副本SSD硬盘的数量。不填则默认为1。</p>
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
     * Get <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费，即包年包月</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul> 
     * @return DiskChargeType <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费，即包年包月</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费，即包年包月</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     * @param DiskChargeType <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费，即包年包月</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get <p>单副本SSD硬盘大小，单位为GiB。</p><p>取值范围：[2000, 7000]</p> 
     * @return DiskSize <p>单副本SSD硬盘大小，单位为GiB。</p><p>取值范围：[2000, 7000]</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>单副本SSD硬盘大小，单位为GiB。</p><p>取值范围：[2000, 7000]</p>
     * @param DiskSize <p>单副本SSD硬盘大小，单位为GiB。</p><p>取值范围：[2000, 7000]</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。 创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。</p> 
     * @return DiskChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。 创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。</p>
     */
    public RemoteDiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。 创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。</p>
     * @param DiskChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。 创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。</p>
     */
    public void setDiskChargePrepaid(RemoteDiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get <p>购买单副本SSD硬盘的数量。不填则默认为1。</p> 
     * @return DiskCount <p>购买单副本SSD硬盘的数量。不填则默认为1。</p>
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set <p>购买单副本SSD硬盘的数量。不填则默认为1。</p>
     * @param DiskCount <p>购买单副本SSD硬盘的数量。不填则默认为1。</p>
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    public InquirePriceCreateRemoteDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateRemoteDisksRequest(InquirePriceCreateRemoteDisksRequest source) {
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new RemoteDiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);

    }
}

