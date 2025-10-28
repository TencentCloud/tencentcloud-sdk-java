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
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * CLS日志集ID，可以通过cls接口或者控制台获取
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * CLS日志主题ID，可以通过cls接口或者控制台获取
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * topic所在region，默认为集群当前region
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get CLS日志集ID，可以通过cls接口或者控制台获取 
     * @return LogsetId CLS日志集ID，可以通过cls接口或者控制台获取
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set CLS日志集ID，可以通过cls接口或者控制台获取
     * @param LogsetId CLS日志集ID，可以通过cls接口或者控制台获取
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get CLS日志主题ID，可以通过cls接口或者控制台获取 
     * @return TopicId CLS日志主题ID，可以通过cls接口或者控制台获取
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set CLS日志主题ID，可以通过cls接口或者控制台获取
     * @param TopicId CLS日志主题ID，可以通过cls接口或者控制台获取
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get topic所在region，默认为集群当前region 
     * @return TopicRegion topic所在region，默认为集群当前region
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set topic所在region，默认为集群当前region
     * @param TopicRegion topic所在region，默认为集群当前region
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);

    }
}

