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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTrafficMirrorFilterRulesRequest extends AbstractModel {

    /**
    * 流量镜像实例唯一ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像入站过滤唯一ID列表。
    */
    @SerializedName("IngressFilterRuleIds")
    @Expose
    private String [] IngressFilterRuleIds;

    /**
    * 流量镜像出站过滤唯一ID列表。
    */
    @SerializedName("EgressFilterRuleIds")
    @Expose
    private String [] EgressFilterRuleIds;

    /**
     * Get 流量镜像实例唯一ID。 
     * @return TrafficMirrorId 流量镜像实例唯一ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例唯一ID。
     * @param TrafficMirrorId 流量镜像实例唯一ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像入站过滤唯一ID列表。 
     * @return IngressFilterRuleIds 流量镜像入站过滤唯一ID列表。
     */
    public String [] getIngressFilterRuleIds() {
        return this.IngressFilterRuleIds;
    }

    /**
     * Set 流量镜像入站过滤唯一ID列表。
     * @param IngressFilterRuleIds 流量镜像入站过滤唯一ID列表。
     */
    public void setIngressFilterRuleIds(String [] IngressFilterRuleIds) {
        this.IngressFilterRuleIds = IngressFilterRuleIds;
    }

    /**
     * Get 流量镜像出站过滤唯一ID列表。 
     * @return EgressFilterRuleIds 流量镜像出站过滤唯一ID列表。
     */
    public String [] getEgressFilterRuleIds() {
        return this.EgressFilterRuleIds;
    }

    /**
     * Set 流量镜像出站过滤唯一ID列表。
     * @param EgressFilterRuleIds 流量镜像出站过滤唯一ID列表。
     */
    public void setEgressFilterRuleIds(String [] EgressFilterRuleIds) {
        this.EgressFilterRuleIds = EgressFilterRuleIds;
    }

    public DeleteTrafficMirrorFilterRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTrafficMirrorFilterRulesRequest(DeleteTrafficMirrorFilterRulesRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.IngressFilterRuleIds != null) {
            this.IngressFilterRuleIds = new String[source.IngressFilterRuleIds.length];
            for (int i = 0; i < source.IngressFilterRuleIds.length; i++) {
                this.IngressFilterRuleIds[i] = new String(source.IngressFilterRuleIds[i]);
            }
        }
        if (source.EgressFilterRuleIds != null) {
            this.EgressFilterRuleIds = new String[source.EgressFilterRuleIds.length];
            for (int i = 0; i < source.EgressFilterRuleIds.length; i++) {
                this.EgressFilterRuleIds[i] = new String(source.EgressFilterRuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "IngressFilterRuleIds.", this.IngressFilterRuleIds);
        this.setParamArraySimple(map, prefix + "EgressFilterRuleIds.", this.EgressFilterRuleIds);

    }
}

