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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceKeyValConfigsRequest extends AbstractModel {

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 搜索的配置项名称
    */
    @SerializedName("SearchConfigName")
    @Expose
    private String SearchConfigName;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 搜索的配置项名称 
     * @return SearchConfigName 搜索的配置项名称
     */
    public String getSearchConfigName() {
        return this.SearchConfigName;
    }

    /**
     * Set 搜索的配置项名称
     * @param SearchConfigName 搜索的配置项名称
     */
    public void setSearchConfigName(String SearchConfigName) {
        this.SearchConfigName = SearchConfigName;
    }

    public DescribeInstanceKeyValConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceKeyValConfigsRequest(DescribeInstanceKeyValConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchConfigName != null) {
            this.SearchConfigName = new String(source.SearchConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchConfigName", this.SearchConfigName);

    }
}

