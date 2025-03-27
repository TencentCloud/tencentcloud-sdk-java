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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkippedDetail extends AbstractModel {

    /**
    * 跳过的表数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 跳过校验的表详情
    */
    @SerializedName("Items")
    @Expose
    private SkippedItem [] Items;

    /**
     * Get 跳过的表数量 
     * @return TotalCount 跳过的表数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 跳过的表数量
     * @param TotalCount 跳过的表数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 跳过校验的表详情 
     * @return Items 跳过校验的表详情
     */
    public SkippedItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 跳过校验的表详情
     * @param Items 跳过校验的表详情
     */
    public void setItems(SkippedItem [] Items) {
        this.Items = Items;
    }

    public SkippedDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkippedDetail(SkippedDetail source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new SkippedItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SkippedItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

