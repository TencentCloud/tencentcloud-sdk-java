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

public class AssetList extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资产数组
    */
    @SerializedName("List")
    @Expose
    private Asset [] List;

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 资产数组 
     * @return List 资产数组
     */
    public Asset [] getList() {
        return this.List;
    }

    /**
     * Set 资产数组
     * @param List 资产数组
     */
    public void setList(Asset [] List) {
        this.List = List;
    }

    public AssetList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetList(AssetList source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new Asset[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new Asset(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

