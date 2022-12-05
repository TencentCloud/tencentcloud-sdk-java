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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchClusterDatabasesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 是否精确搜索。
0: 模糊搜索 1:精确搜索 
默认为0
    */
    @SerializedName("MatchType")
    @Expose
    private Long MatchType;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 数据库名 
     * @return Database 数据库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名
     * @param Database 数据库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 是否精确搜索。
0: 模糊搜索 1:精确搜索 
默认为0 
     * @return MatchType 是否精确搜索。
0: 模糊搜索 1:精确搜索 
默认为0
     */
    public Long getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 是否精确搜索。
0: 模糊搜索 1:精确搜索 
默认为0
     * @param MatchType 是否精确搜索。
0: 模糊搜索 1:精确搜索 
默认为0
     */
    public void setMatchType(Long MatchType) {
        this.MatchType = MatchType;
    }

    public SearchClusterDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchClusterDatabasesRequest(SearchClusterDatabasesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.MatchType != null) {
            this.MatchType = new Long(source.MatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);

    }
}

