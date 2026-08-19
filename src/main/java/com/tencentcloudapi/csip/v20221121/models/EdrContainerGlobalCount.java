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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrContainerGlobalCount extends AbstractModel {

    /**
    * <p>总告警条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>存在告警的集群数量（COUNT(DISTINCT cluster_id)，排除空 cluster_id）</p>
    */
    @SerializedName("ClustersCount")
    @Expose
    private Long ClustersCount;

    /**
     * Get <p>总告警条数</p> 
     * @return TotalCount <p>总告警条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总告警条数</p>
     * @param TotalCount <p>总告警条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>存在告警的集群数量（COUNT(DISTINCT cluster_id)，排除空 cluster_id）</p> 
     * @return ClustersCount <p>存在告警的集群数量（COUNT(DISTINCT cluster_id)，排除空 cluster_id）</p>
     */
    public Long getClustersCount() {
        return this.ClustersCount;
    }

    /**
     * Set <p>存在告警的集群数量（COUNT(DISTINCT cluster_id)，排除空 cluster_id）</p>
     * @param ClustersCount <p>存在告警的集群数量（COUNT(DISTINCT cluster_id)，排除空 cluster_id）</p>
     */
    public void setClustersCount(Long ClustersCount) {
        this.ClustersCount = ClustersCount;
    }

    public EdrContainerGlobalCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrContainerGlobalCount(EdrContainerGlobalCount source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ClustersCount != null) {
            this.ClustersCount = new Long(source.ClustersCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ClustersCount", this.ClustersCount);

    }
}

