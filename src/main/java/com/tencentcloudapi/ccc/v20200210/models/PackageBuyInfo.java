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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageBuyInfo extends AbstractModel{

    /**
    * 套餐包Id
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 套餐包类型，0-外呼套餐包|1-400呼入套餐包
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 套餐包总量
    */
    @SerializedName("CapacitySize")
    @Expose
    private Long CapacitySize;

    /**
    * 套餐包剩余量
    */
    @SerializedName("CapacityRemain")
    @Expose
    private Long CapacityRemain;

    /**
    * 购买时间戳
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * 截至时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 套餐包Id 
     * @return PackageId 套餐包Id
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 套餐包Id
     * @param PackageId 套餐包Id
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 套餐包类型，0-外呼套餐包|1-400呼入套餐包 
     * @return Type 套餐包类型，0-外呼套餐包|1-400呼入套餐包
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 套餐包类型，0-外呼套餐包|1-400呼入套餐包
     * @param Type 套餐包类型，0-外呼套餐包|1-400呼入套餐包
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 套餐包总量 
     * @return CapacitySize 套餐包总量
     */
    public Long getCapacitySize() {
        return this.CapacitySize;
    }

    /**
     * Set 套餐包总量
     * @param CapacitySize 套餐包总量
     */
    public void setCapacitySize(Long CapacitySize) {
        this.CapacitySize = CapacitySize;
    }

    /**
     * Get 套餐包剩余量 
     * @return CapacityRemain 套餐包剩余量
     */
    public Long getCapacityRemain() {
        return this.CapacityRemain;
    }

    /**
     * Set 套餐包剩余量
     * @param CapacityRemain 套餐包剩余量
     */
    public void setCapacityRemain(Long CapacityRemain) {
        this.CapacityRemain = CapacityRemain;
    }

    /**
     * Get 购买时间戳 
     * @return BuyTime 购买时间戳
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间戳
     * @param BuyTime 购买时间戳
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 截至时间戳 
     * @return EndTime 截至时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截至时间戳
     * @param EndTime 截至时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public PackageBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageBuyInfo(PackageBuyInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CapacitySize != null) {
            this.CapacitySize = new Long(source.CapacitySize);
        }
        if (source.CapacityRemain != null) {
            this.CapacityRemain = new Long(source.CapacityRemain);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CapacitySize", this.CapacitySize);
        this.setParamSimple(map, prefix + "CapacityRemain", this.CapacityRemain);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

