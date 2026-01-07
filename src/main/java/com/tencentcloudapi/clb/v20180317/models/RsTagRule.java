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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsTagRule extends AbstractModel {

    /**
    * <p>负载均衡监听器 ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>要修改标签的后端机器列表。</p>
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * <p>转发规则的ID，七层规则时需要此参数，4层规则不需要。</p>
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * <p>后端服务修改后的标签。此参数的优先级低于前述<a href="https://cloud.tencent.com/document/api/214/30694#Target">Target</a>中的Tag参数，即最终的标签以Target中的Tag参数值为准，仅当Target中的Tag参数为空时，才以RsTagRule中的Tag参数为准。</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get <p>负载均衡监听器 ID。</p> 
     * @return ListenerId <p>负载均衡监听器 ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>负载均衡监听器 ID。</p>
     * @param ListenerId <p>负载均衡监听器 ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>要修改标签的后端机器列表。</p> 
     * @return Targets <p>要修改标签的后端机器列表。</p>
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>要修改标签的后端机器列表。</p>
     * @param Targets <p>要修改标签的后端机器列表。</p>
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>转发规则的ID，七层规则时需要此参数，4层规则不需要。</p> 
     * @return LocationId <p>转发规则的ID，七层规则时需要此参数，4层规则不需要。</p>
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set <p>转发规则的ID，七层规则时需要此参数，4层规则不需要。</p>
     * @param LocationId <p>转发规则的ID，七层规则时需要此参数，4层规则不需要。</p>
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get <p>后端服务修改后的标签。此参数的优先级低于前述<a href="https://cloud.tencent.com/document/api/214/30694#Target">Target</a>中的Tag参数，即最终的标签以Target中的Tag参数值为准，仅当Target中的Tag参数为空时，才以RsTagRule中的Tag参数为准。</p> 
     * @return Tag <p>后端服务修改后的标签。此参数的优先级低于前述<a href="https://cloud.tencent.com/document/api/214/30694#Target">Target</a>中的Tag参数，即最终的标签以Target中的Tag参数值为准，仅当Target中的Tag参数为空时，才以RsTagRule中的Tag参数为准。</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>后端服务修改后的标签。此参数的优先级低于前述<a href="https://cloud.tencent.com/document/api/214/30694#Target">Target</a>中的Tag参数，即最终的标签以Target中的Tag参数值为准，仅当Target中的Tag参数为空时，才以RsTagRule中的Tag参数为准。</p>
     * @param Tag <p>后端服务修改后的标签。此参数的优先级低于前述<a href="https://cloud.tencent.com/document/api/214/30694#Target">Target</a>中的Tag参数，即最终的标签以Target中的Tag参数值为准，仅当Target中的Tag参数为空时，才以RsTagRule中的Tag参数为准。</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public RsTagRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RsTagRule(RsTagRule source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

