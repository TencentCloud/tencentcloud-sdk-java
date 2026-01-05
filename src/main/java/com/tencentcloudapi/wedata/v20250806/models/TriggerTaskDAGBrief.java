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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskDAGBrief extends AbstractModel {

    /**
    * 任务信息合集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerTasks")
    @Expose
    private TriggerTaskBrief [] TriggerTasks;

    /**
    * 任务连接信息合集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerTaskLinks")
    @Expose
    private TriggerTaskLinkBrief [] TriggerTaskLinks;

    /**
     * Get 任务信息合集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerTasks 任务信息合集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerTaskBrief [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set 任务信息合集
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerTasks 任务信息合集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerTasks(TriggerTaskBrief [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get 任务连接信息合集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerTaskLinks 任务连接信息合集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerTaskLinkBrief [] getTriggerTaskLinks() {
        return this.TriggerTaskLinks;
    }

    /**
     * Set 任务连接信息合集
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerTaskLinks 任务连接信息合集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerTaskLinks(TriggerTaskLinkBrief [] TriggerTaskLinks) {
        this.TriggerTaskLinks = TriggerTaskLinks;
    }

    public TriggerTaskDAGBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskDAGBrief(TriggerTaskDAGBrief source) {
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new TriggerTaskBrief[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new TriggerTaskBrief(source.TriggerTasks[i]);
            }
        }
        if (source.TriggerTaskLinks != null) {
            this.TriggerTaskLinks = new TriggerTaskLinkBrief[source.TriggerTaskLinks.length];
            for (int i = 0; i < source.TriggerTaskLinks.length; i++) {
                this.TriggerTaskLinks[i] = new TriggerTaskLinkBrief(source.TriggerTaskLinks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamArrayObj(map, prefix + "TriggerTaskLinks.", this.TriggerTaskLinks);

    }
}

