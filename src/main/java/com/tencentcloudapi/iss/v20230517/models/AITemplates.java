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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITemplates extends AbstractModel{

    /**
    * AI 类别。可选值 AI(AI 分析)和 Snapshot(截图)，Templates 列表中只能出现一种类型。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * AI 分析配置。和"SnapshotConfig"二选一。
    */
    @SerializedName("AIConfig")
    @Expose
    private AIConfig AIConfig;

    /**
    * 截图配置。和"AIConfig"二选一。
    */
    @SerializedName("SnapshotConfig")
    @Expose
    private SnapshotConfig SnapshotConfig;

    /**
     * Get AI 类别。可选值 AI(AI 分析)和 Snapshot(截图)，Templates 列表中只能出现一种类型。 
     * @return Tag AI 类别。可选值 AI(AI 分析)和 Snapshot(截图)，Templates 列表中只能出现一种类型。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set AI 类别。可选值 AI(AI 分析)和 Snapshot(截图)，Templates 列表中只能出现一种类型。
     * @param Tag AI 类别。可选值 AI(AI 分析)和 Snapshot(截图)，Templates 列表中只能出现一种类型。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get AI 分析配置。和"SnapshotConfig"二选一。 
     * @return AIConfig AI 分析配置。和"SnapshotConfig"二选一。
     */
    public AIConfig getAIConfig() {
        return this.AIConfig;
    }

    /**
     * Set AI 分析配置。和"SnapshotConfig"二选一。
     * @param AIConfig AI 分析配置。和"SnapshotConfig"二选一。
     */
    public void setAIConfig(AIConfig AIConfig) {
        this.AIConfig = AIConfig;
    }

    /**
     * Get 截图配置。和"AIConfig"二选一。 
     * @return SnapshotConfig 截图配置。和"AIConfig"二选一。
     */
    public SnapshotConfig getSnapshotConfig() {
        return this.SnapshotConfig;
    }

    /**
     * Set 截图配置。和"AIConfig"二选一。
     * @param SnapshotConfig 截图配置。和"AIConfig"二选一。
     */
    public void setSnapshotConfig(SnapshotConfig SnapshotConfig) {
        this.SnapshotConfig = SnapshotConfig;
    }

    public AITemplates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AITemplates(AITemplates source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.AIConfig != null) {
            this.AIConfig = new AIConfig(source.AIConfig);
        }
        if (source.SnapshotConfig != null) {
            this.SnapshotConfig = new SnapshotConfig(source.SnapshotConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamObj(map, prefix + "AIConfig.", this.AIConfig);
        this.setParamObj(map, prefix + "SnapshotConfig.", this.SnapshotConfig);

    }
}

