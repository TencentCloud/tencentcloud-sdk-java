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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayerLatencyPolicy extends AbstractModel{

    /**
    * 任意player允许的最大延迟，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaximumIndividualPlayerLatencyMilliseconds")
    @Expose
    private Long MaximumIndividualPlayerLatencyMilliseconds;

    /**
    * 放置新GameServerSession时强制实施策略的时间长度，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyDurationSeconds")
    @Expose
    private Long PolicyDurationSeconds;

    /**
     * Get 任意player允许的最大延迟，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaximumIndividualPlayerLatencyMilliseconds 任意player允许的最大延迟，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaximumIndividualPlayerLatencyMilliseconds() {
        return this.MaximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * Set 任意player允许的最大延迟，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaximumIndividualPlayerLatencyMilliseconds 任意player允许的最大延迟，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaximumIndividualPlayerLatencyMilliseconds(Long MaximumIndividualPlayerLatencyMilliseconds) {
        this.MaximumIndividualPlayerLatencyMilliseconds = MaximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * Get 放置新GameServerSession时强制实施策略的时间长度，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyDurationSeconds 放置新GameServerSession时强制实施策略的时间长度，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyDurationSeconds() {
        return this.PolicyDurationSeconds;
    }

    /**
     * Set 放置新GameServerSession时强制实施策略的时间长度，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyDurationSeconds 放置新GameServerSession时强制实施策略的时间长度，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyDurationSeconds(Long PolicyDurationSeconds) {
        this.PolicyDurationSeconds = PolicyDurationSeconds;
    }

    public PlayerLatencyPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayerLatencyPolicy(PlayerLatencyPolicy source) {
        if (source.MaximumIndividualPlayerLatencyMilliseconds != null) {
            this.MaximumIndividualPlayerLatencyMilliseconds = new Long(source.MaximumIndividualPlayerLatencyMilliseconds);
        }
        if (source.PolicyDurationSeconds != null) {
            this.PolicyDurationSeconds = new Long(source.PolicyDurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaximumIndividualPlayerLatencyMilliseconds", this.MaximumIndividualPlayerLatencyMilliseconds);
        this.setParamSimple(map, prefix + "PolicyDurationSeconds", this.PolicyDurationSeconds);

    }
}

