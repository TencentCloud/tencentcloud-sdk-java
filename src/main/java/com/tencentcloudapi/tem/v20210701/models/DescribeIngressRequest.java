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

public class DescribeIngressRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境namespace
    */
    @SerializedName("ClusterNamespace")
    @Expose
    private String ClusterNamespace;

    /**
    * ingress 规则名
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get 环境ID 
     * @return EnvironmentId 环境ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
     * @param EnvironmentId 环境ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 环境namespace 
     * @return ClusterNamespace 环境namespace
     */
    public String getClusterNamespace() {
        return this.ClusterNamespace;
    }

    /**
     * Set 环境namespace
     * @param ClusterNamespace 环境namespace
     */
    public void setClusterNamespace(String ClusterNamespace) {
        this.ClusterNamespace = ClusterNamespace;
    }

    /**
     * Get ingress 规则名 
     * @return IngressName ingress 规则名
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set ingress 规则名
     * @param IngressName ingress 规则名
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
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

    public DescribeIngressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIngressRequest(DescribeIngressRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ClusterNamespace != null) {
            this.ClusterNamespace = new String(source.ClusterNamespace);
        }
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ClusterNamespace", this.ClusterNamespace);
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

