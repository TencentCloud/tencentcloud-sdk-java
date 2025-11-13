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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * 根据filter做过滤，支持ClusterId（取值示例：cls-xxxx）、TaskType（任务类型，取值示例：add_cluster_cidr、node_upgrade、node_upgrade_ctl等）其中任务类型必传
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
    * 表示最新的任务条目，此值为true的话，输出任务列表中只会有最新的一条
    */
    @SerializedName("Latest")
    @Expose
    private Boolean Latest;

    /**
     * Get 根据filter做过滤，支持ClusterId（取值示例：cls-xxxx）、TaskType（任务类型，取值示例：add_cluster_cidr、node_upgrade、node_upgrade_ctl等）其中任务类型必传 
     * @return Filter 根据filter做过滤，支持ClusterId（取值示例：cls-xxxx）、TaskType（任务类型，取值示例：add_cluster_cidr、node_upgrade、node_upgrade_ctl等）其中任务类型必传
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 根据filter做过滤，支持ClusterId（取值示例：cls-xxxx）、TaskType（任务类型，取值示例：add_cluster_cidr、node_upgrade、node_upgrade_ctl等）其中任务类型必传
     * @param Filter 根据filter做过滤，支持ClusterId（取值示例：cls-xxxx）、TaskType（任务类型，取值示例：add_cluster_cidr、node_upgrade、node_upgrade_ctl等）其中任务类型必传
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 表示最新的任务条目，此值为true的话，输出任务列表中只会有最新的一条 
     * @return Latest 表示最新的任务条目，此值为true的话，输出任务列表中只会有最新的一条
     */
    public Boolean getLatest() {
        return this.Latest;
    }

    /**
     * Set 表示最新的任务条目，此值为true的话，输出任务列表中只会有最新的一条
     * @param Latest 表示最新的任务条目，此值为true的话，输出任务列表中只会有最新的一条
     */
    public void setLatest(Boolean Latest) {
        this.Latest = Latest;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
        if (source.Latest != null) {
            this.Latest = new Boolean(source.Latest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Latest", this.Latest);

    }
}

