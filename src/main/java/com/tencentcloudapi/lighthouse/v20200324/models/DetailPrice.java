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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailPrice extends AbstractModel {

    /**
    * <p>描述计费项目名称，目前取值</p><li>"DiskSpace"代表云硬盘空间收费项。</li><li>"DiskBackupQuota"代表数据盘备份点配额收费项。</li><li>"Instance"代表实例收费项。</li><li>"SystemDiskBackupQuota"代表系统盘备份点配额收费项。</li>
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * <p>计费项维度单价。</p><p>单位：元</p>
    */
    @SerializedName("OriginUnitPrice")
    @Expose
    private Float OriginUnitPrice;

    /**
    * <p>计费项维度总价。</p><p>单位：元</p>
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * <p>计费项维度折扣。</p>
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * <p>计费项维度折后总价。</p><p>单位：元</p>
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get <p>描述计费项目名称，目前取值</p><li>"DiskSpace"代表云硬盘空间收费项。</li><li>"DiskBackupQuota"代表数据盘备份点配额收费项。</li><li>"Instance"代表实例收费项。</li><li>"SystemDiskBackupQuota"代表系统盘备份点配额收费项。</li> 
     * @return PriceName <p>描述计费项目名称，目前取值</p><li>"DiskSpace"代表云硬盘空间收费项。</li><li>"DiskBackupQuota"代表数据盘备份点配额收费项。</li><li>"Instance"代表实例收费项。</li><li>"SystemDiskBackupQuota"代表系统盘备份点配额收费项。</li>
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set <p>描述计费项目名称，目前取值</p><li>"DiskSpace"代表云硬盘空间收费项。</li><li>"DiskBackupQuota"代表数据盘备份点配额收费项。</li><li>"Instance"代表实例收费项。</li><li>"SystemDiskBackupQuota"代表系统盘备份点配额收费项。</li>
     * @param PriceName <p>描述计费项目名称，目前取值</p><li>"DiskSpace"代表云硬盘空间收费项。</li><li>"DiskBackupQuota"代表数据盘备份点配额收费项。</li><li>"Instance"代表实例收费项。</li><li>"SystemDiskBackupQuota"代表系统盘备份点配额收费项。</li>
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get <p>计费项维度单价。</p><p>单位：元</p> 
     * @return OriginUnitPrice <p>计费项维度单价。</p><p>单位：元</p>
     */
    public Float getOriginUnitPrice() {
        return this.OriginUnitPrice;
    }

    /**
     * Set <p>计费项维度单价。</p><p>单位：元</p>
     * @param OriginUnitPrice <p>计费项维度单价。</p><p>单位：元</p>
     */
    public void setOriginUnitPrice(Float OriginUnitPrice) {
        this.OriginUnitPrice = OriginUnitPrice;
    }

    /**
     * Get <p>计费项维度总价。</p><p>单位：元</p> 
     * @return OriginalPrice <p>计费项维度总价。</p><p>单位：元</p>
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set <p>计费项维度总价。</p><p>单位：元</p>
     * @param OriginalPrice <p>计费项维度总价。</p><p>单位：元</p>
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get <p>计费项维度折扣。</p> 
     * @return Discount <p>计费项维度折扣。</p>
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set <p>计费项维度折扣。</p>
     * @param Discount <p>计费项维度折扣。</p>
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get <p>计费项维度折后总价。</p><p>单位：元</p> 
     * @return DiscountPrice <p>计费项维度折后总价。</p><p>单位：元</p>
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set <p>计费项维度折后总价。</p><p>单位：元</p>
     * @param DiscountPrice <p>计费项维度折后总价。</p><p>单位：元</p>
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    public DetailPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailPrice(DetailPrice source) {
        if (source.PriceName != null) {
            this.PriceName = new String(source.PriceName);
        }
        if (source.OriginUnitPrice != null) {
            this.OriginUnitPrice = new Float(source.OriginUnitPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PriceName", this.PriceName);
        this.setParamSimple(map, prefix + "OriginUnitPrice", this.OriginUnitPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

