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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseInfoListRequest extends AbstractModel{

    /**
    * 过滤参数
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 如果是hive这里写rpc，如果是其他类型不传
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
     * Get 过滤参数 
     * @return Filters 过滤参数
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数
     * @param Filters 过滤参数
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 如果是hive这里写rpc，如果是其他类型不传 
     * @return ConnectionType 如果是hive这里写rpc，如果是其他类型不传
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 如果是hive这里写rpc，如果是其他类型不传
     * @param ConnectionType 如果是hive这里写rpc，如果是其他类型不传
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    public DescribeDatabaseInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseInfoListRequest(DescribeDatabaseInfoListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);

    }
}

