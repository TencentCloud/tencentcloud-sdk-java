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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRocketMQClusterRequest extends AbstractModel {

    /**
    * RocketMQ集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 3-64个字符，只能包含字母、数字、“-”及“_”
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 说明信息，不超过128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否开启HTTP公网访问
    */
    @SerializedName("PublicAccessEnabled")
    @Expose
    private Boolean PublicAccessEnabled;

    /**
     * Get RocketMQ集群ID 
     * @return ClusterId RocketMQ集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set RocketMQ集群ID
     * @param ClusterId RocketMQ集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 3-64个字符，只能包含字母、数字、“-”及“_” 
     * @return ClusterName 3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 3-64个字符，只能包含字母、数字、“-”及“_”
     * @param ClusterName 3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 说明信息，不超过128个字符 
     * @return Remark 说明信息，不超过128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息，不超过128个字符
     * @param Remark 说明信息，不超过128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否开启HTTP公网访问 
     * @return PublicAccessEnabled 是否开启HTTP公网访问
     */
    public Boolean getPublicAccessEnabled() {
        return this.PublicAccessEnabled;
    }

    /**
     * Set 是否开启HTTP公网访问
     * @param PublicAccessEnabled 是否开启HTTP公网访问
     */
    public void setPublicAccessEnabled(Boolean PublicAccessEnabled) {
        this.PublicAccessEnabled = PublicAccessEnabled;
    }

    public ModifyRocketMQClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQClusterRequest(ModifyRocketMQClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicAccessEnabled != null) {
            this.PublicAccessEnabled = new Boolean(source.PublicAccessEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicAccessEnabled", this.PublicAccessEnabled);

    }
}

