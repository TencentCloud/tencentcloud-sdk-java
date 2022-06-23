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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDealResponse extends AbstractModel{

    /**
    * 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 子订单列表
    */
    @SerializedName("DealList")
    @Expose
    private Deals [] DealList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单 
     * @return BigDealId 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单
     * @param BigDealId 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get 子订单列表 
     * @return DealList 子订单列表
     */
    public Deals [] getDealList() {
        return this.DealList;
    }

    /**
     * Set 子订单列表
     * @param DealList 子订单列表
     */
    public void setDealList(Deals [] DealList) {
        this.DealList = DealList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDealResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDealResponse(CreateDealResponse source) {
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.DealList != null) {
            this.DealList = new Deals[source.DealList.length];
            for (int i = 0; i < source.DealList.length; i++) {
                this.DealList[i] = new Deals(source.DealList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamArrayObj(map, prefix + "DealList.", this.DealList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

