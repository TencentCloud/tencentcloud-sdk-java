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

public class EnableClusterAuditRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>CLS日志集ID，可以通过cls接口或者控制台获取</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>CLS日志主题ID，可以通过cls接口或者控制台获取</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>topic所在region，默认为集群当前region</p>
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
    * <p>集群类型 tke/eks</p><p>默认值：tke</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>CLS日志集ID，可以通过cls接口或者控制台获取</p> 
     * @return LogsetId <p>CLS日志集ID，可以通过cls接口或者控制台获取</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>CLS日志集ID，可以通过cls接口或者控制台获取</p>
     * @param LogsetId <p>CLS日志集ID，可以通过cls接口或者控制台获取</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>CLS日志主题ID，可以通过cls接口或者控制台获取</p> 
     * @return TopicId <p>CLS日志主题ID，可以通过cls接口或者控制台获取</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>CLS日志主题ID，可以通过cls接口或者控制台获取</p>
     * @param TopicId <p>CLS日志主题ID，可以通过cls接口或者控制台获取</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>topic所在region，默认为集群当前region</p> 
     * @return TopicRegion <p>topic所在region，默认为集群当前region</p>
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set <p>topic所在region，默认为集群当前region</p>
     * @param TopicRegion <p>topic所在region，默认为集群当前region</p>
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
    }

    /**
     * Get <p>集群类型 tke/eks</p><p>默认值：tke</p> 
     * @return ClusterType <p>集群类型 tke/eks</p><p>默认值：tke</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型 tke/eks</p><p>默认值：tke</p>
     * @param ClusterType <p>集群类型 tke/eks</p><p>默认值：tke</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public EnableClusterAuditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableClusterAuditRequest(EnableClusterAuditRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

