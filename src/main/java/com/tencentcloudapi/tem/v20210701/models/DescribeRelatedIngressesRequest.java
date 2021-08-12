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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelatedIngressesRequest extends AbstractModel{

    /**
    * 环境 id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境 namespace
    */
    @SerializedName("ClusterNamespace")
    @Expose
    private String ClusterNamespace;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 应用 ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get 环境 id 
     * @return EnvironmentId 环境 id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境 id
     * @param EnvironmentId 环境 id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 环境 namespace 
     * @return ClusterNamespace 环境 namespace
     */
    public String getClusterNamespace() {
        return this.ClusterNamespace;
    }

    /**
     * Set 环境 namespace
     * @param ClusterNamespace 环境 namespace
     */
    public void setClusterNamespace(String ClusterNamespace) {
        this.ClusterNamespace = ClusterNamespace;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 应用 ID 
     * @return ApplicationId 应用 ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用 ID
     * @param ApplicationId 应用 ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public DescribeRelatedIngressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedIngressesRequest(DescribeRelatedIngressesRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ClusterNamespace != null) {
            this.ClusterNamespace = new String(source.ClusterNamespace);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ClusterNamespace", this.ClusterNamespace);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

