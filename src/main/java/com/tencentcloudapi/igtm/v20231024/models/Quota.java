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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel {

    /**
    * 探测任务配额
    */
    @SerializedName("TaskQuota")
    @Expose
    private Long TaskQuota;

    /**
    * 地址池配额
    */
    @SerializedName("PoolQuota")
    @Expose
    private Long PoolQuota;

    /**
    * 地址配额
    */
    @SerializedName("AddressQuota")
    @Expose
    private Long AddressQuota;

    /**
    * 探点资源数
    */
    @SerializedName("MonitorQuota")
    @Expose
    private Long MonitorQuota;

    /**
    * 消息资源数
    */
    @SerializedName("MessageQuota")
    @Expose
    private Long MessageQuota;

    /**
    * 已使用探测任务数
    */
    @SerializedName("UsedTaskQuota")
    @Expose
    private Long UsedTaskQuota;

    /**
    * 已使用体验实例数
    */
    @SerializedName("UsedFreeInstanceNum")
    @Expose
    private Long UsedFreeInstanceNum;

    /**
    * 已使用付费实例
    */
    @SerializedName("UsedBillInstanceNum")
    @Expose
    private Long UsedBillInstanceNum;

    /**
    * 体验套餐总数
    */
    @SerializedName("FreePackageNum")
    @Expose
    private Long FreePackageNum;

    /**
    * 已使用付费套餐数
    */
    @SerializedName("UsedBillPackageNum")
    @Expose
    private Long UsedBillPackageNum;

    /**
    * 付费套餐总数
    */
    @SerializedName("BillPackageNum")
    @Expose
    private Long BillPackageNum;

    /**
     * Get 探测任务配额 
     * @return TaskQuota 探测任务配额
     */
    public Long getTaskQuota() {
        return this.TaskQuota;
    }

    /**
     * Set 探测任务配额
     * @param TaskQuota 探测任务配额
     */
    public void setTaskQuota(Long TaskQuota) {
        this.TaskQuota = TaskQuota;
    }

    /**
     * Get 地址池配额 
     * @return PoolQuota 地址池配额
     */
    public Long getPoolQuota() {
        return this.PoolQuota;
    }

    /**
     * Set 地址池配额
     * @param PoolQuota 地址池配额
     */
    public void setPoolQuota(Long PoolQuota) {
        this.PoolQuota = PoolQuota;
    }

    /**
     * Get 地址配额 
     * @return AddressQuota 地址配额
     */
    public Long getAddressQuota() {
        return this.AddressQuota;
    }

    /**
     * Set 地址配额
     * @param AddressQuota 地址配额
     */
    public void setAddressQuota(Long AddressQuota) {
        this.AddressQuota = AddressQuota;
    }

    /**
     * Get 探点资源数 
     * @return MonitorQuota 探点资源数
     */
    public Long getMonitorQuota() {
        return this.MonitorQuota;
    }

    /**
     * Set 探点资源数
     * @param MonitorQuota 探点资源数
     */
    public void setMonitorQuota(Long MonitorQuota) {
        this.MonitorQuota = MonitorQuota;
    }

    /**
     * Get 消息资源数 
     * @return MessageQuota 消息资源数
     */
    public Long getMessageQuota() {
        return this.MessageQuota;
    }

    /**
     * Set 消息资源数
     * @param MessageQuota 消息资源数
     */
    public void setMessageQuota(Long MessageQuota) {
        this.MessageQuota = MessageQuota;
    }

    /**
     * Get 已使用探测任务数 
     * @return UsedTaskQuota 已使用探测任务数
     */
    public Long getUsedTaskQuota() {
        return this.UsedTaskQuota;
    }

    /**
     * Set 已使用探测任务数
     * @param UsedTaskQuota 已使用探测任务数
     */
    public void setUsedTaskQuota(Long UsedTaskQuota) {
        this.UsedTaskQuota = UsedTaskQuota;
    }

    /**
     * Get 已使用体验实例数 
     * @return UsedFreeInstanceNum 已使用体验实例数
     */
    public Long getUsedFreeInstanceNum() {
        return this.UsedFreeInstanceNum;
    }

    /**
     * Set 已使用体验实例数
     * @param UsedFreeInstanceNum 已使用体验实例数
     */
    public void setUsedFreeInstanceNum(Long UsedFreeInstanceNum) {
        this.UsedFreeInstanceNum = UsedFreeInstanceNum;
    }

    /**
     * Get 已使用付费实例 
     * @return UsedBillInstanceNum 已使用付费实例
     */
    public Long getUsedBillInstanceNum() {
        return this.UsedBillInstanceNum;
    }

    /**
     * Set 已使用付费实例
     * @param UsedBillInstanceNum 已使用付费实例
     */
    public void setUsedBillInstanceNum(Long UsedBillInstanceNum) {
        this.UsedBillInstanceNum = UsedBillInstanceNum;
    }

    /**
     * Get 体验套餐总数 
     * @return FreePackageNum 体验套餐总数
     */
    public Long getFreePackageNum() {
        return this.FreePackageNum;
    }

    /**
     * Set 体验套餐总数
     * @param FreePackageNum 体验套餐总数
     */
    public void setFreePackageNum(Long FreePackageNum) {
        this.FreePackageNum = FreePackageNum;
    }

    /**
     * Get 已使用付费套餐数 
     * @return UsedBillPackageNum 已使用付费套餐数
     */
    public Long getUsedBillPackageNum() {
        return this.UsedBillPackageNum;
    }

    /**
     * Set 已使用付费套餐数
     * @param UsedBillPackageNum 已使用付费套餐数
     */
    public void setUsedBillPackageNum(Long UsedBillPackageNum) {
        this.UsedBillPackageNum = UsedBillPackageNum;
    }

    /**
     * Get 付费套餐总数 
     * @return BillPackageNum 付费套餐总数
     */
    public Long getBillPackageNum() {
        return this.BillPackageNum;
    }

    /**
     * Set 付费套餐总数
     * @param BillPackageNum 付费套餐总数
     */
    public void setBillPackageNum(Long BillPackageNum) {
        this.BillPackageNum = BillPackageNum;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.TaskQuota != null) {
            this.TaskQuota = new Long(source.TaskQuota);
        }
        if (source.PoolQuota != null) {
            this.PoolQuota = new Long(source.PoolQuota);
        }
        if (source.AddressQuota != null) {
            this.AddressQuota = new Long(source.AddressQuota);
        }
        if (source.MonitorQuota != null) {
            this.MonitorQuota = new Long(source.MonitorQuota);
        }
        if (source.MessageQuota != null) {
            this.MessageQuota = new Long(source.MessageQuota);
        }
        if (source.UsedTaskQuota != null) {
            this.UsedTaskQuota = new Long(source.UsedTaskQuota);
        }
        if (source.UsedFreeInstanceNum != null) {
            this.UsedFreeInstanceNum = new Long(source.UsedFreeInstanceNum);
        }
        if (source.UsedBillInstanceNum != null) {
            this.UsedBillInstanceNum = new Long(source.UsedBillInstanceNum);
        }
        if (source.FreePackageNum != null) {
            this.FreePackageNum = new Long(source.FreePackageNum);
        }
        if (source.UsedBillPackageNum != null) {
            this.UsedBillPackageNum = new Long(source.UsedBillPackageNum);
        }
        if (source.BillPackageNum != null) {
            this.BillPackageNum = new Long(source.BillPackageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskQuota", this.TaskQuota);
        this.setParamSimple(map, prefix + "PoolQuota", this.PoolQuota);
        this.setParamSimple(map, prefix + "AddressQuota", this.AddressQuota);
        this.setParamSimple(map, prefix + "MonitorQuota", this.MonitorQuota);
        this.setParamSimple(map, prefix + "MessageQuota", this.MessageQuota);
        this.setParamSimple(map, prefix + "UsedTaskQuota", this.UsedTaskQuota);
        this.setParamSimple(map, prefix + "UsedFreeInstanceNum", this.UsedFreeInstanceNum);
        this.setParamSimple(map, prefix + "UsedBillInstanceNum", this.UsedBillInstanceNum);
        this.setParamSimple(map, prefix + "FreePackageNum", this.FreePackageNum);
        this.setParamSimple(map, prefix + "UsedBillPackageNum", this.UsedBillPackageNum);
        this.setParamSimple(map, prefix + "BillPackageNum", this.BillPackageNum);

    }
}

