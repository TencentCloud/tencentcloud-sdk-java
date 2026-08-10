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
    * <p>cos桶名</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>bucket 桶下的备份路径</p>
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * <p>云上集群迁移集群名</p>
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
    * <p>es 集群仓库</p>
    */
    @SerializedName("PaasEsRepository")
    @Expose
    private String PaasEsRepository;

    /**
     * Get <p>cos桶名</p> 
     * @return CosBucket <p>cos桶名</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>cos桶名</p>
     * @param CosBucket <p>cos桶名</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>bucket 桶下的备份路径</p> 
     * @return BasePath <p>bucket 桶下的备份路径</p>
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set <p>bucket 桶下的备份路径</p>
     * @param BasePath <p>bucket 桶下的备份路径</p>
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get <p>云上集群迁移集群名</p> 
     * @return ClusterInstanceId <p>云上集群迁移集群名</p>
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set <p>云上集群迁移集群名</p>
     * @param ClusterInstanceId <p>云上集群迁移集群名</p>
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    /**
     * Get <p>es 集群仓库</p> 
     * @return PaasEsRepository <p>es 集群仓库</p>
     */
    public String getPaasEsRepository() {
        return this.PaasEsRepository;
    }

    /**
     * Set <p>es 集群仓库</p>
     * @param PaasEsRepository <p>es 集群仓库</p>
     */
    public void setPaasEsRepository(String PaasEsRepository) {
        this.PaasEsRepository = PaasEsRepository;
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
        if (source.PaasEsRepository != null) {
            this.PaasEsRepository = new String(source.PaasEsRepository);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);
        this.setParamSimple(map, prefix + "PaasEsRepository", this.PaasEsRepository);

    }
}

