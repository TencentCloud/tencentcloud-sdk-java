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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpertModeConfiguration extends AbstractModel{

    /**
    * Job graph
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobGraph")
    @Expose
    private JobGraph JobGraph;

    /**
    * Node configuration
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeConfig")
    @Expose
    private NodeConfig [] NodeConfig;

    /**
    * Slot sharing groups
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotSharingGroups")
    @Expose
    private SlotSharingGroup [] SlotSharingGroups;

    /**
     * Get Job graph
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobGraph Job graph
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobGraph getJobGraph() {
        return this.JobGraph;
    }

    /**
     * Set Job graph
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobGraph Job graph
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobGraph(JobGraph JobGraph) {
        this.JobGraph = JobGraph;
    }

    /**
     * Get Node configuration
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeConfig Node configuration
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeConfig [] getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Node configuration
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeConfig Node configuration
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeConfig(NodeConfig [] NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get Slot sharing groups
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotSharingGroups Slot sharing groups
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlotSharingGroup [] getSlotSharingGroups() {
        return this.SlotSharingGroups;
    }

    /**
     * Set Slot sharing groups
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotSharingGroups Slot sharing groups
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotSharingGroups(SlotSharingGroup [] SlotSharingGroups) {
        this.SlotSharingGroups = SlotSharingGroups;
    }

    public ExpertModeConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpertModeConfiguration(ExpertModeConfiguration source) {
        if (source.JobGraph != null) {
            this.JobGraph = new JobGraph(source.JobGraph);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new NodeConfig[source.NodeConfig.length];
            for (int i = 0; i < source.NodeConfig.length; i++) {
                this.NodeConfig[i] = new NodeConfig(source.NodeConfig[i]);
            }
        }
        if (source.SlotSharingGroups != null) {
            this.SlotSharingGroups = new SlotSharingGroup[source.SlotSharingGroups.length];
            for (int i = 0; i < source.SlotSharingGroups.length; i++) {
                this.SlotSharingGroups[i] = new SlotSharingGroup(source.SlotSharingGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "JobGraph.", this.JobGraph);
        this.setParamArrayObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamArrayObj(map, prefix + "SlotSharingGroups.", this.SlotSharingGroups);

    }
}

