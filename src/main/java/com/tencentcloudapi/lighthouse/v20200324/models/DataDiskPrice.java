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

public class DataDiskPrice extends AbstractModel {

    /**
    * <p>云硬盘ID。</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>云硬盘单价。</p><p>单位：元</p>
    */
    @SerializedName("OriginalDiskPrice")
    @Expose
    private Float OriginalDiskPrice;

    /**
    * <p>云硬盘总价。</p><p>单位：元</p>
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * <p>折扣。</p>
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * <p>折后总价。</p><p>单位：元</p>
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * <p>数据盘挂载的实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>云硬盘ID。</p> 
     * @return DiskId <p>云硬盘ID。</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>云硬盘ID。</p>
     * @param DiskId <p>云硬盘ID。</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>云硬盘单价。</p><p>单位：元</p> 
     * @return OriginalDiskPrice <p>云硬盘单价。</p><p>单位：元</p>
     */
    public Float getOriginalDiskPrice() {
        return this.OriginalDiskPrice;
    }

    /**
     * Set <p>云硬盘单价。</p><p>单位：元</p>
     * @param OriginalDiskPrice <p>云硬盘单价。</p><p>单位：元</p>
     */
    public void setOriginalDiskPrice(Float OriginalDiskPrice) {
        this.OriginalDiskPrice = OriginalDiskPrice;
    }

    /**
     * Get <p>云硬盘总价。</p><p>单位：元</p> 
     * @return OriginalPrice <p>云硬盘总价。</p><p>单位：元</p>
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set <p>云硬盘总价。</p><p>单位：元</p>
     * @param OriginalPrice <p>云硬盘总价。</p><p>单位：元</p>
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get <p>折扣。</p> 
     * @return Discount <p>折扣。</p>
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set <p>折扣。</p>
     * @param Discount <p>折扣。</p>
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get <p>折后总价。</p><p>单位：元</p> 
     * @return DiscountPrice <p>折后总价。</p><p>单位：元</p>
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set <p>折后总价。</p><p>单位：元</p>
     * @param DiscountPrice <p>折后总价。</p><p>单位：元</p>
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get <p>数据盘挂载的实例ID。</p> 
     * @return InstanceId <p>数据盘挂载的实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>数据盘挂载的实例ID。</p>
     * @param InstanceId <p>数据盘挂载的实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DataDiskPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDiskPrice(DataDiskPrice source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.OriginalDiskPrice != null) {
            this.OriginalDiskPrice = new Float(source.OriginalDiskPrice);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "OriginalDiskPrice", this.OriginalDiskPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

