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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTreeJobsRequest extends AbstractModel {

    /**
    * <p>筛选条件字段，使用了筛选字段后不支持分页，最多返回2000条记录</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>工作空间 Serialid</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get <p>筛选条件字段，使用了筛选字段后不支持分页，最多返回2000条记录</p> 
     * @return Filters <p>筛选条件字段，使用了筛选字段后不支持分页，最多返回2000条记录</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件字段，使用了筛选字段后不支持分页，最多返回2000条记录</p>
     * @param Filters <p>筛选条件字段，使用了筛选字段后不支持分页，最多返回2000条记录</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>工作空间 Serialid</p> 
     * @return WorkSpaceId <p>工作空间 Serialid</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 Serialid</p>
     * @param WorkSpaceId <p>工作空间 Serialid</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public DescribeTreeJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTreeJobsRequest(DescribeTreeJobsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

