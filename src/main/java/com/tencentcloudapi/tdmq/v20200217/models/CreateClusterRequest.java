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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel{

    /**
    * 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 用户专享物理集群ID，如果不传，则默认在公共集群上创建用户集群资源。
    */
    @SerializedName("BindClusterId")
    @Expose
    private Long BindClusterId;

    /**
    * 说明，128个字符以内。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 集群的标签列表(已废弃)
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启公网访问，不填时默认开启
    */
    @SerializedName("PublicAccessEnabled")
    @Expose
    private Boolean PublicAccessEnabled;

    /**
     * Get 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。 
     * @return ClusterName 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
     * @param ClusterName 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 用户专享物理集群ID，如果不传，则默认在公共集群上创建用户集群资源。 
     * @return BindClusterId 用户专享物理集群ID，如果不传，则默认在公共集群上创建用户集群资源。
     */
    public Long getBindClusterId() {
        return this.BindClusterId;
    }

    /**
     * Set 用户专享物理集群ID，如果不传，则默认在公共集群上创建用户集群资源。
     * @param BindClusterId 用户专享物理集群ID，如果不传，则默认在公共集群上创建用户集群资源。
     */
    public void setBindClusterId(Long BindClusterId) {
        this.BindClusterId = BindClusterId;
    }

    /**
     * Get 说明，128个字符以内。 
     * @return Remark 说明，128个字符以内。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，128个字符以内。
     * @param Remark 说明，128个字符以内。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 集群的标签列表(已废弃) 
     * @return Tags 集群的标签列表(已废弃)
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 集群的标签列表(已废弃)
     * @param Tags 集群的标签列表(已废弃)
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启公网访问，不填时默认开启 
     * @return PublicAccessEnabled 是否开启公网访问，不填时默认开启
     */
    public Boolean getPublicAccessEnabled() {
        return this.PublicAccessEnabled;
    }

    /**
     * Set 是否开启公网访问，不填时默认开启
     * @param PublicAccessEnabled 是否开启公网访问，不填时默认开启
     */
    public void setPublicAccessEnabled(Boolean PublicAccessEnabled) {
        this.PublicAccessEnabled = PublicAccessEnabled;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.BindClusterId != null) {
            this.BindClusterId = new Long(source.BindClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PublicAccessEnabled != null) {
            this.PublicAccessEnabled = new Boolean(source.PublicAccessEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "BindClusterId", this.BindClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PublicAccessEnabled", this.PublicAccessEnabled);

    }
}

