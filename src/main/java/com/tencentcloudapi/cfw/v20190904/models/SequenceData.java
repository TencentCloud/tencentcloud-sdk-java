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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SequenceData extends AbstractModel{

    /**
    * 规则Id值
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 修改前执行顺序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 修改后执行顺序
    */
    @SerializedName("NewOrderIndex")
    @Expose
    private Long NewOrderIndex;

    /**
     * Get 规则Id值 
     * @return Id 规则Id值
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则Id值
     * @param Id 规则Id值
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 修改前执行顺序 
     * @return OrderIndex 修改前执行顺序
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 修改前执行顺序
     * @param OrderIndex 修改前执行顺序
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 修改后执行顺序 
     * @return NewOrderIndex 修改后执行顺序
     */
    public Long getNewOrderIndex() {
        return this.NewOrderIndex;
    }

    /**
     * Set 修改后执行顺序
     * @param NewOrderIndex 修改后执行顺序
     */
    public void setNewOrderIndex(Long NewOrderIndex) {
        this.NewOrderIndex = NewOrderIndex;
    }

    public SequenceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SequenceData(SequenceData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.NewOrderIndex != null) {
            this.NewOrderIndex = new Long(source.NewOrderIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "NewOrderIndex", this.NewOrderIndex);

    }
}

