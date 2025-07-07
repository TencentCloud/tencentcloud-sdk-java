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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDealsRequest extends AbstractModel {

    /**
    * 计费下单入参
    */
    @SerializedName("Goods")
    @Expose
    private CreateDealsGoods [] Goods;

    /**
     * Get 计费下单入参 
     * @return Goods 计费下单入参
     */
    public CreateDealsGoods [] getGoods() {
        return this.Goods;
    }

    /**
     * Set 计费下单入参
     * @param Goods 计费下单入参
     */
    public void setGoods(CreateDealsGoods [] Goods) {
        this.Goods = Goods;
    }

    public CreateDealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDealsRequest(CreateDealsRequest source) {
        if (source.Goods != null) {
            this.Goods = new CreateDealsGoods[source.Goods.length];
            for (int i = 0; i < source.Goods.length; i++) {
                this.Goods[i] = new CreateDealsGoods(source.Goods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Goods.", this.Goods);

    }
}

