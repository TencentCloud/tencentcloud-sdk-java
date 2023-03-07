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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherListByUinItem extends AbstractModel{

    /**
    * 子客uin
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * 券总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 券详情
    */
    @SerializedName("Data")
    @Expose
    private QueryVoucherListByUinVoucherItem [] Data;

    /**
     * Get 子客uin 
     * @return ClientUin 子客uin
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 子客uin
     * @param ClientUin 子客uin
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 券总数量 
     * @return TotalCount 券总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 券总数量
     * @param TotalCount 券总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 券详情 
     * @return Data 券详情
     */
    public QueryVoucherListByUinVoucherItem [] getData() {
        return this.Data;
    }

    /**
     * Set 券详情
     * @param Data 券详情
     */
    public void setData(QueryVoucherListByUinVoucherItem [] Data) {
        this.Data = Data;
    }

    public QueryVoucherListByUinItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherListByUinItem(QueryVoucherListByUinItem source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new QueryVoucherListByUinVoucherItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new QueryVoucherListByUinVoucherItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

