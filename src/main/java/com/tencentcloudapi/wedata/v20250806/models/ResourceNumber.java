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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceNumber extends AbstractModel {

    /**
    * 增加/减少枚举

- ADD -- 增加
- DELETE -- 减少
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 增加/减少资源包的数量
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
     * Get 增加/减少枚举

- ADD -- 增加
- DELETE -- 减少 
     * @return Type 增加/减少枚举

- ADD -- 增加
- DELETE -- 减少
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 增加/减少枚举

- ADD -- 增加
- DELETE -- 减少
     * @param Type 增加/减少枚举

- ADD -- 增加
- DELETE -- 减少
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 增加/减少资源包的数量 
     * @return Quantity 增加/减少资源包的数量
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 增加/减少资源包的数量
     * @param Quantity 增加/减少资源包的数量
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    public ResourceNumber() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceNumber(ResourceNumber source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);

    }
}

