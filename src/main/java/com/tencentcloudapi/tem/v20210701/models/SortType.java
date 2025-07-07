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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortType extends AbstractModel {

    /**
    * 排序字段名称
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 0：升序，1：倒序
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 排序字段名称 
     * @return Key 排序字段名称
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 排序字段名称
     * @param Key 排序字段名称
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 0：升序，1：倒序 
     * @return Type 0：升序，1：倒序
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0：升序，1：倒序
     * @param Type 0：升序，1：倒序
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public SortType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SortType(SortType source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

