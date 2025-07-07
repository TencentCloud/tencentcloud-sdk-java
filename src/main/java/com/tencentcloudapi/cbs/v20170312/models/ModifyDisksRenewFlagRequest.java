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

public class ModifyDisksRenewFlagRequest extends AbstractModel {

    /**
    * 一个或多个待操作的云硬盘ID，该参数可以通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 云硬盘的自动续费标识。取值范围：<ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li></ul>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 该参数支持设置云硬盘的自动续费周期，单位为月。取值范围：[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
    */
    @SerializedName("AutoRenewPeriod")
    @Expose
    private Long AutoRenewPeriod;

    /**
     * Get 一个或多个待操作的云硬盘ID，该参数可以通过[DescribeDisks](/document/product/362/16315)接口查询。 
     * @return DiskIds 一个或多个待操作的云硬盘ID，该参数可以通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 一个或多个待操作的云硬盘ID，该参数可以通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @param DiskIds 一个或多个待操作的云硬盘ID，该参数可以通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 云硬盘的自动续费标识。取值范围：<ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li></ul> 
     * @return RenewFlag 云硬盘的自动续费标识。取值范围：<ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li></ul>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 云硬盘的自动续费标识。取值范围：<ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li></ul>
     * @param RenewFlag 云硬盘的自动续费标识。取值范围：<ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li></ul>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 该参数支持设置云硬盘的自动续费周期，单位为月。取值范围：[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36] 
     * @return AutoRenewPeriod 该参数支持设置云硬盘的自动续费周期，单位为月。取值范围：[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     */
    public Long getAutoRenewPeriod() {
        return this.AutoRenewPeriod;
    }

    /**
     * Set 该参数支持设置云硬盘的自动续费周期，单位为月。取值范围：[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     * @param AutoRenewPeriod 该参数支持设置云硬盘的自动续费周期，单位为月。取值范围：[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     */
    public void setAutoRenewPeriod(Long AutoRenewPeriod) {
        this.AutoRenewPeriod = AutoRenewPeriod;
    }

    public ModifyDisksRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDisksRenewFlagRequest(ModifyDisksRenewFlagRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.AutoRenewPeriod != null) {
            this.AutoRenewPeriod = new Long(source.AutoRenewPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "AutoRenewPeriod", this.AutoRenewPeriod);

    }
}

