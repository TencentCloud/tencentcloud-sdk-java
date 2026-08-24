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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceCreateCopyPairsRequest extends AbstractModel {

    /**
    * 每个复制对的容量列表，长度 1~10。数组长度即为询价的复制对个数，每个元素对应一个复制对的容量
    */
    @SerializedName("DataCapacities")
    @Expose
    private Long [] DataCapacities;

    /**
     * Get 每个复制对的容量列表，长度 1~10。数组长度即为询价的复制对个数，每个元素对应一个复制对的容量 
     * @return DataCapacities 每个复制对的容量列表，长度 1~10。数组长度即为询价的复制对个数，每个元素对应一个复制对的容量
     */
    public Long [] getDataCapacities() {
        return this.DataCapacities;
    }

    /**
     * Set 每个复制对的容量列表，长度 1~10。数组长度即为询价的复制对个数，每个元素对应一个复制对的容量
     * @param DataCapacities 每个复制对的容量列表，长度 1~10。数组长度即为询价的复制对个数，每个元素对应一个复制对的容量
     */
    public void setDataCapacities(Long [] DataCapacities) {
        this.DataCapacities = DataCapacities;
    }

    public DescribePriceCreateCopyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceCreateCopyPairsRequest(DescribePriceCreateCopyPairsRequest source) {
        if (source.DataCapacities != null) {
            this.DataCapacities = new Long[source.DataCapacities.length];
            for (int i = 0; i < source.DataCapacities.length; i++) {
                this.DataCapacities[i] = new Long(source.DataCapacities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataCapacities.", this.DataCapacities);

    }
}

