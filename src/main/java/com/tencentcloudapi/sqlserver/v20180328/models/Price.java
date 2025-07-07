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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * 包年包月参考价格，单位-分
    */
    @SerializedName("PrepaidPrice")
    @Expose
    private Long PrepaidPrice;

    /**
    * 包年包月价格单位，M-月
    */
    @SerializedName("PrepaidPriceUnit")
    @Expose
    private String PrepaidPriceUnit;

    /**
    * 按量付费价格，单位-分
    */
    @SerializedName("PostpaidPrice")
    @Expose
    private Long PostpaidPrice;

    /**
    * 按量付费价格单位，H-小时
    */
    @SerializedName("PostpaidPriceUnit")
    @Expose
    private String PostpaidPriceUnit;

    /**
     * Get 包年包月参考价格，单位-分 
     * @return PrepaidPrice 包年包月参考价格，单位-分
     */
    public Long getPrepaidPrice() {
        return this.PrepaidPrice;
    }

    /**
     * Set 包年包月参考价格，单位-分
     * @param PrepaidPrice 包年包月参考价格，单位-分
     */
    public void setPrepaidPrice(Long PrepaidPrice) {
        this.PrepaidPrice = PrepaidPrice;
    }

    /**
     * Get 包年包月价格单位，M-月 
     * @return PrepaidPriceUnit 包年包月价格单位，M-月
     */
    public String getPrepaidPriceUnit() {
        return this.PrepaidPriceUnit;
    }

    /**
     * Set 包年包月价格单位，M-月
     * @param PrepaidPriceUnit 包年包月价格单位，M-月
     */
    public void setPrepaidPriceUnit(String PrepaidPriceUnit) {
        this.PrepaidPriceUnit = PrepaidPriceUnit;
    }

    /**
     * Get 按量付费价格，单位-分 
     * @return PostpaidPrice 按量付费价格，单位-分
     */
    public Long getPostpaidPrice() {
        return this.PostpaidPrice;
    }

    /**
     * Set 按量付费价格，单位-分
     * @param PostpaidPrice 按量付费价格，单位-分
     */
    public void setPostpaidPrice(Long PostpaidPrice) {
        this.PostpaidPrice = PostpaidPrice;
    }

    /**
     * Get 按量付费价格单位，H-小时 
     * @return PostpaidPriceUnit 按量付费价格单位，H-小时
     */
    public String getPostpaidPriceUnit() {
        return this.PostpaidPriceUnit;
    }

    /**
     * Set 按量付费价格单位，H-小时
     * @param PostpaidPriceUnit 按量付费价格单位，H-小时
     */
    public void setPostpaidPriceUnit(String PostpaidPriceUnit) {
        this.PostpaidPriceUnit = PostpaidPriceUnit;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.PrepaidPrice != null) {
            this.PrepaidPrice = new Long(source.PrepaidPrice);
        }
        if (source.PrepaidPriceUnit != null) {
            this.PrepaidPriceUnit = new String(source.PrepaidPriceUnit);
        }
        if (source.PostpaidPrice != null) {
            this.PostpaidPrice = new Long(source.PostpaidPrice);
        }
        if (source.PostpaidPriceUnit != null) {
            this.PostpaidPriceUnit = new String(source.PostpaidPriceUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrepaidPrice", this.PrepaidPrice);
        this.setParamSimple(map, prefix + "PrepaidPriceUnit", this.PrepaidPriceUnit);
        this.setParamSimple(map, prefix + "PostpaidPrice", this.PostpaidPrice);
        this.setParamSimple(map, prefix + "PostpaidPriceUnit", this.PostpaidPriceUnit);

    }
}

