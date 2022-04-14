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

public class SaDivulgeDataQueryPubList extends AbstractModel{

    /**
    * 数据条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 自定义泄露事件列表
    */
    @SerializedName("List")
    @Expose
    private SaDivulgeDataQueryPub [] List;

    /**
     * Get 数据条数 
     * @return Count 数据条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数据条数
     * @param Count 数据条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 自定义泄露事件列表 
     * @return List 自定义泄露事件列表
     */
    public SaDivulgeDataQueryPub [] getList() {
        return this.List;
    }

    /**
     * Set 自定义泄露事件列表
     * @param List 自定义泄露事件列表
     */
    public void setList(SaDivulgeDataQueryPub [] List) {
        this.List = List;
    }

    public SaDivulgeDataQueryPubList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaDivulgeDataQueryPubList(SaDivulgeDataQueryPubList source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.List != null) {
            this.List = new SaDivulgeDataQueryPub[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new SaDivulgeDataQueryPub(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

