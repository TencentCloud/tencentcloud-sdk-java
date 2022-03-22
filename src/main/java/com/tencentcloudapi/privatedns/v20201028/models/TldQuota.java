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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TldQuota extends AbstractModel{

    /**
    * 总共额度
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已使用额度
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * 库存
    */
    @SerializedName("Stock")
    @Expose
    private Long Stock;

    /**
    * 用户限额
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get 总共额度 
     * @return Total 总共额度
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总共额度
     * @param Total 总共额度
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已使用额度 
     * @return Used 已使用额度
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用额度
     * @param Used 已使用额度
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get 库存 
     * @return Stock 库存
     */
    public Long getStock() {
        return this.Stock;
    }

    /**
     * Set 库存
     * @param Stock 库存
     */
    public void setStock(Long Stock) {
        this.Stock = Stock;
    }

    /**
     * Get 用户限额 
     * @return Quota 用户限额
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 用户限额
     * @param Quota 用户限额
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public TldQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TldQuota(TldQuota source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.Stock != null) {
            this.Stock = new Long(source.Stock);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Stock", this.Stock);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

