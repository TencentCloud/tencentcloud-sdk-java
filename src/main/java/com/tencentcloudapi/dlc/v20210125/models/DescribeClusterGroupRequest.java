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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterGroupRequest extends AbstractModel {

    /**
    * <p>集群组 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>是否包含已软删除的记录（默认 false，仅返回活跃记录；true 时允许返回 deleted=1 的记录，用于悬挂 cluster 回显场景）</p>
    */
    @SerializedName("IncludeDeleted")
    @Expose
    private Boolean IncludeDeleted;

    /**
     * Get <p>集群组 ID</p> 
     * @return Id <p>集群组 ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>集群组 ID</p>
     * @param Id <p>集群组 ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>是否包含已软删除的记录（默认 false，仅返回活跃记录；true 时允许返回 deleted=1 的记录，用于悬挂 cluster 回显场景）</p> 
     * @return IncludeDeleted <p>是否包含已软删除的记录（默认 false，仅返回活跃记录；true 时允许返回 deleted=1 的记录，用于悬挂 cluster 回显场景）</p>
     */
    public Boolean getIncludeDeleted() {
        return this.IncludeDeleted;
    }

    /**
     * Set <p>是否包含已软删除的记录（默认 false，仅返回活跃记录；true 时允许返回 deleted=1 的记录，用于悬挂 cluster 回显场景）</p>
     * @param IncludeDeleted <p>是否包含已软删除的记录（默认 false，仅返回活跃记录；true 时允许返回 deleted=1 的记录，用于悬挂 cluster 回显场景）</p>
     */
    public void setIncludeDeleted(Boolean IncludeDeleted) {
        this.IncludeDeleted = IncludeDeleted;
    }

    public DescribeClusterGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterGroupRequest(DescribeClusterGroupRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.IncludeDeleted != null) {
            this.IncludeDeleted = new Boolean(source.IncludeDeleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IncludeDeleted", this.IncludeDeleted);

    }
}

