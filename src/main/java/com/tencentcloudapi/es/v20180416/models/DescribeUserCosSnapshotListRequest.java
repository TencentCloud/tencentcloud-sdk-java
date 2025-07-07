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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserCosSnapshotListRequest extends AbstractModel {

    /**
    * cos桶名
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * bucket 桶下的备份路径
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * 云上集群迁移集群名
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
     * Get cos桶名 
     * @return CosBucket cos桶名
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set cos桶名
     * @param CosBucket cos桶名
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get bucket 桶下的备份路径 
     * @return BasePath bucket 桶下的备份路径
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set bucket 桶下的备份路径
     * @param BasePath bucket 桶下的备份路径
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get 云上集群迁移集群名 
     * @return ClusterInstanceId 云上集群迁移集群名
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set 云上集群迁移集群名
     * @param ClusterInstanceId 云上集群迁移集群名
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    public DescribeUserCosSnapshotListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserCosSnapshotListRequest(DescribeUserCosSnapshotListRequest source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.ClusterInstanceId != null) {
            this.ClusterInstanceId = new String(source.ClusterInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);

    }
}

