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

public class InquirePriceRenewInstancesRequest extends AbstractModel{

    /**
    * 待续费的实例。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 是否续费数据盘
    */
    @SerializedName("RenewDataDisk")
    @Expose
    private Boolean RenewDataDisk;

    /**
    * 数据盘是否对齐实例到期时间
    */
    @SerializedName("AlignInstanceExpiredTime")
    @Expose
    private Boolean AlignInstanceExpiredTime;

    /**
     * Get 待续费的实例。 
     * @return InstanceIds 待续费的实例。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待续费的实例。
     * @param InstanceIds 待续费的实例。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 是否续费数据盘 
     * @return RenewDataDisk 是否续费数据盘
     */
    public Boolean getRenewDataDisk() {
        return this.RenewDataDisk;
    }

    /**
     * Set 是否续费数据盘
     * @param RenewDataDisk 是否续费数据盘
     */
    public void setRenewDataDisk(Boolean RenewDataDisk) {
        this.RenewDataDisk = RenewDataDisk;
    }

    /**
     * Get 数据盘是否对齐实例到期时间 
     * @return AlignInstanceExpiredTime 数据盘是否对齐实例到期时间
     */
    public Boolean getAlignInstanceExpiredTime() {
        return this.AlignInstanceExpiredTime;
    }

    /**
     * Set 数据盘是否对齐实例到期时间
     * @param AlignInstanceExpiredTime 数据盘是否对齐实例到期时间
     */
    public void setAlignInstanceExpiredTime(Boolean AlignInstanceExpiredTime) {
        this.AlignInstanceExpiredTime = AlignInstanceExpiredTime;
    }

    public InquirePriceRenewInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewInstancesRequest(InquirePriceRenewInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.RenewDataDisk != null) {
            this.RenewDataDisk = new Boolean(source.RenewDataDisk);
        }
        if (source.AlignInstanceExpiredTime != null) {
            this.AlignInstanceExpiredTime = new Boolean(source.AlignInstanceExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "RenewDataDisk", this.RenewDataDisk);
        this.setParamSimple(map, prefix + "AlignInstanceExpiredTime", this.AlignInstanceExpiredTime);

    }
}

