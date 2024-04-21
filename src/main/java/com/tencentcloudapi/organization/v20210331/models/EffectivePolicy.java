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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EffectivePolicy extends AbstractModel {

    /**
    * 目标ID。
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

    /**
    * 有效策略内容。
    */
    @SerializedName("PolicyContent")
    @Expose
    private String PolicyContent;

    /**
    * 有效策略更新时间。
    */
    @SerializedName("LastUpdatedTimestamp")
    @Expose
    private Long LastUpdatedTimestamp;

    /**
     * Get 目标ID。 
     * @return TargetId 目标ID。
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 目标ID。
     * @param TargetId 目标ID。
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 有效策略内容。 
     * @return PolicyContent 有效策略内容。
     */
    public String getPolicyContent() {
        return this.PolicyContent;
    }

    /**
     * Set 有效策略内容。
     * @param PolicyContent 有效策略内容。
     */
    public void setPolicyContent(String PolicyContent) {
        this.PolicyContent = PolicyContent;
    }

    /**
     * Get 有效策略更新时间。 
     * @return LastUpdatedTimestamp 有效策略更新时间。
     */
    public Long getLastUpdatedTimestamp() {
        return this.LastUpdatedTimestamp;
    }

    /**
     * Set 有效策略更新时间。
     * @param LastUpdatedTimestamp 有效策略更新时间。
     */
    public void setLastUpdatedTimestamp(Long LastUpdatedTimestamp) {
        this.LastUpdatedTimestamp = LastUpdatedTimestamp;
    }

    public EffectivePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectivePolicy(EffectivePolicy source) {
        if (source.TargetId != null) {
            this.TargetId = new Long(source.TargetId);
        }
        if (source.PolicyContent != null) {
            this.PolicyContent = new String(source.PolicyContent);
        }
        if (source.LastUpdatedTimestamp != null) {
            this.LastUpdatedTimestamp = new Long(source.LastUpdatedTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "PolicyContent", this.PolicyContent);
        this.setParamSimple(map, prefix + "LastUpdatedTimestamp", this.LastUpdatedTimestamp);

    }
}

