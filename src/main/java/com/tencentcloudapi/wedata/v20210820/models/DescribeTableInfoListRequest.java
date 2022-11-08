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

public class DescribeTableInfoListRequest extends AbstractModel{

    /**
    * 表名
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
    * 数据库源类型
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
     * Get 表名 
     * @return Filters 表名
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 表名
     * @param Filters 表名
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

    /**
     * Get 数据库源类型 
     * @return Catalog 数据库源类型
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 数据库源类型
     * @param Catalog 数据库源类型
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    public DescribeTableInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableInfoListRequest(DescribeTableInfoListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);

    }
}

