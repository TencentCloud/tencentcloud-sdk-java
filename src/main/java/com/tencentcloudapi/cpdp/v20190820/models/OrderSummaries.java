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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderSummaries extends AbstractModel{

    /**
    * 汇总列表
    */
    @SerializedName("List")
    @Expose
    private OrderSummaryResult [] List;

    /**
    * 总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 汇总列表 
     * @return List 汇总列表
     */
    public OrderSummaryResult [] getList() {
        return this.List;
    }

    /**
     * Set 汇总列表
     * @param List 汇总列表
     */
    public void setList(OrderSummaryResult [] List) {
        this.List = List;
    }

    /**
     * Get 总数 
     * @return Count 总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 总数
     * @param Count 总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public OrderSummaries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderSummaries(OrderSummaries source) {
        if (source.List != null) {
            this.List = new OrderSummaryResult[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new OrderSummaryResult(source.List[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

