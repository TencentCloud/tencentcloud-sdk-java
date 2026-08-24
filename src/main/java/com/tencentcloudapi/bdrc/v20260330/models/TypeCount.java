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

public class TypeCount extends AbstractModel {

    /**
    * 备份库类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 备份库数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 备份库类型 
     * @return Type 备份库类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 备份库类型
     * @param Type 备份库类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 备份库数量 
     * @return Count 备份库数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 备份库数量
     * @param Count 备份库数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public TypeCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TypeCount(TypeCount source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

