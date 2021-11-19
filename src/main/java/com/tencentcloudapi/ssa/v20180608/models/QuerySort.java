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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuerySort extends AbstractModel{

    /**
    * 排序字段
    */
    @SerializedName("SortKey")
    @Expose
    private String SortKey;

    /**
    * 顺序，1升序2降序
    */
    @SerializedName("SortType")
    @Expose
    private Long SortType;

    /**
     * Get 排序字段 
     * @return SortKey 排序字段
     */
    public String getSortKey() {
        return this.SortKey;
    }

    /**
     * Set 排序字段
     * @param SortKey 排序字段
     */
    public void setSortKey(String SortKey) {
        this.SortKey = SortKey;
    }

    /**
     * Get 顺序，1升序2降序 
     * @return SortType 顺序，1升序2降序
     */
    public Long getSortType() {
        return this.SortType;
    }

    /**
     * Set 顺序，1升序2降序
     * @param SortType 顺序，1升序2降序
     */
    public void setSortType(Long SortType) {
        this.SortType = SortType;
    }

    public QuerySort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySort(QuerySort source) {
        if (source.SortKey != null) {
            this.SortKey = new String(source.SortKey);
        }
        if (source.SortType != null) {
            this.SortType = new Long(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SortKey", this.SortKey);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

