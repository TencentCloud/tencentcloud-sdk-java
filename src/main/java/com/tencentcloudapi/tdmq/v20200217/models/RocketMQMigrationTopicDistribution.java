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

public class RocketMQMigrationTopicDistribution extends AbstractModel {

    /**
    * 迁移主题阶段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 迁移主题阶段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stage 迁移主题阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 迁移主题阶段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stage 迁移主题阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public RocketMQMigrationTopicDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQMigrationTopicDistribution(RocketMQMigrationTopicDistribution source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

