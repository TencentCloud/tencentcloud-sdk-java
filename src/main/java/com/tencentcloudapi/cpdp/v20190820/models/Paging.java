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

public class Paging extends AbstractModel{

    /**
    * 页码
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 页长
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 页码 
     * @return Index 页码
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 页码
     * @param Index 页码
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 页长 
     * @return Count 页长
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 页长
     * @param Count 页长
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Paging() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Paging(Paging source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

