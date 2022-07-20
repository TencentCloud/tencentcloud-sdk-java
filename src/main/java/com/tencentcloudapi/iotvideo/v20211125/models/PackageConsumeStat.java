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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageConsumeStat extends AbstractModel{

    /**
    * 云存套餐包id
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 云存套餐包名称
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 消耗个数
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
    * 套餐包单价，单位分
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 消耗来源，1预付费
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
     * Get 云存套餐包id 
     * @return PackageId 云存套餐包id
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 云存套餐包id
     * @param PackageId 云存套餐包id
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 云存套餐包名称 
     * @return PackageName 云存套餐包名称
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 云存套餐包名称
     * @param PackageName 云存套餐包名称
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 消耗个数 
     * @return Cnt 消耗个数
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set 消耗个数
     * @param Cnt 消耗个数
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    /**
     * Get 套餐包单价，单位分 
     * @return Price 套餐包单价，单位分
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 套餐包单价，单位分
     * @param Price 套餐包单价，单位分
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 消耗来源，1预付费 
     * @return Source 消耗来源，1预付费
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 消耗来源，1预付费
     * @param Source 消耗来源，1预付费
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    public PackageConsumeStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageConsumeStat(PackageConsumeStat source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

