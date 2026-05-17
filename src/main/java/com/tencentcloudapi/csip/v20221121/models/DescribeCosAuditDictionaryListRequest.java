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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosAuditDictionaryListRequest extends AbstractModel {

    /**
    * <p>字典类型（RootCategory：一级分类，IdentifyRule:敏感识别数据项）</p>
    */
    @SerializedName("DictType")
    @Expose
    private String DictType;

    /**
    * <p>筛选条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private WhereFilter [] Filters;

    /**
     * Get <p>字典类型（RootCategory：一级分类，IdentifyRule:敏感识别数据项）</p> 
     * @return DictType <p>字典类型（RootCategory：一级分类，IdentifyRule:敏感识别数据项）</p>
     */
    public String getDictType() {
        return this.DictType;
    }

    /**
     * Set <p>字典类型（RootCategory：一级分类，IdentifyRule:敏感识别数据项）</p>
     * @param DictType <p>字典类型（RootCategory：一级分类，IdentifyRule:敏感识别数据项）</p>
     */
    public void setDictType(String DictType) {
        this.DictType = DictType;
    }

    /**
     * Get <p>筛选条件</p> 
     * @return Filters <p>筛选条件</p>
     */
    public WhereFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件</p>
     * @param Filters <p>筛选条件</p>
     */
    public void setFilters(WhereFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCosAuditDictionaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosAuditDictionaryListRequest(DescribeCosAuditDictionaryListRequest source) {
        if (source.DictType != null) {
            this.DictType = new String(source.DictType);
        }
        if (source.Filters != null) {
            this.Filters = new WhereFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new WhereFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DictType", this.DictType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

