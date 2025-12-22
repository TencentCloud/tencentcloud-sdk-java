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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseMetricCollectConfig extends AbstractModel {

    /**
    * 机器组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 基础监控采集配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configs")
    @Expose
    private MetricCollectConfig [] Configs;

    /**
     * Get 机器组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 机器组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 机器组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 机器组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 基础监控采集配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configs 基础监控采集配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricCollectConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set 基础监控采集配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configs 基础监控采集配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigs(MetricCollectConfig [] Configs) {
        this.Configs = Configs;
    }

    public BaseMetricCollectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseMetricCollectConfig(BaseMetricCollectConfig source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Configs != null) {
            this.Configs = new MetricCollectConfig[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new MetricCollectConfig(source.Configs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

