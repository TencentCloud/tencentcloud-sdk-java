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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSearchExportListRequest extends AbstractModel {

    /**
    * ES查询条件JSON
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志类型列表
    */
    @SerializedName("LogTypes")
    @Expose
    private String [] LogTypes;

    /**
     * Get ES查询条件JSON 
     * @return Query ES查询条件JSON
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set ES查询条件JSON
     * @param Query ES查询条件JSON
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 日志类型列表 
     * @return LogTypes 日志类型列表
     */
    public String [] getLogTypes() {
        return this.LogTypes;
    }

    /**
     * Set 日志类型列表
     * @param LogTypes 日志类型列表
     */
    public void setLogTypes(String [] LogTypes) {
        this.LogTypes = LogTypes;
    }

    public DescribeSearchExportListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSearchExportListRequest(DescribeSearchExportListRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.LogTypes != null) {
            this.LogTypes = new String[source.LogTypes.length];
            for (int i = 0; i < source.LogTypes.length; i++) {
                this.LogTypes[i] = new String(source.LogTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "LogTypes.", this.LogTypes);

    }
}

