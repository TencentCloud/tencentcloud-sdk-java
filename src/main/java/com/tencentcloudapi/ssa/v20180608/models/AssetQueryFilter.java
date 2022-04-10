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

public class AssetQueryFilter extends AbstractModel{

    /**
    * 查询参数
    */
    @SerializedName("Filter")
    @Expose
    private QueryFilter [] Filter;

    /**
    * 查询连接符，1 and  ，2 or
    */
    @SerializedName("Logic")
    @Expose
    private Long Logic;

    /**
     * Get 查询参数 
     * @return Filter 查询参数
     */
    public QueryFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询参数
     * @param Filter 查询参数
     */
    public void setFilter(QueryFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 查询连接符，1 and  ，2 or 
     * @return Logic 查询连接符，1 and  ，2 or
     */
    public Long getLogic() {
        return this.Logic;
    }

    /**
     * Set 查询连接符，1 and  ，2 or
     * @param Logic 查询连接符，1 and  ，2 or
     */
    public void setLogic(Long Logic) {
        this.Logic = Logic;
    }

    public AssetQueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetQueryFilter(AssetQueryFilter source) {
        if (source.Filter != null) {
            this.Filter = new QueryFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new QueryFilter(source.Filter[i]);
            }
        }
        if (source.Logic != null) {
            this.Logic = new Long(source.Logic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Logic", this.Logic);

    }
}

