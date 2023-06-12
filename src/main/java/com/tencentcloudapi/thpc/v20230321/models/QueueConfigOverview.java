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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueConfigOverview extends AbstractModel{

    /**
    * 队列名称。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 队列中弹性节点数量最小值。取值范围0～200。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 队列中弹性节点数量最大值。取值范围0～200。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 是否开启自动扩容。
    */
    @SerializedName("EnableAutoExpansion")
    @Expose
    private Boolean EnableAutoExpansion;

    /**
    * 是否开启自动缩容。
    */
    @SerializedName("EnableAutoShrink")
    @Expose
    private Boolean EnableAutoShrink;

    /**
    * 扩容节点配置信息。
    */
    @SerializedName("ExpansionNodeConfigs")
    @Expose
    private ExpansionNodeConfigOverview [] ExpansionNodeConfigs;

    /**
    * 队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DesiredIdleNodeCapacity")
    @Expose
    private Long DesiredIdleNodeCapacity;

    /**
    * 扩容比例。默认值：100。取值范围：1～100。
如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleOutRatio")
    @Expose
    private Long ScaleOutRatio;

    /**
    * 比例扩容阈值。默认值：0。取值范围：0～200。
当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。
此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleOutNodeThreshold")
    @Expose
    private Long ScaleOutNodeThreshold;

    /**
    * 每轮扩容最大节点个数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxNodesPerCycle")
    @Expose
    private Long MaxNodesPerCycle;

    /**
     * Get 队列名称。 
     * @return QueueName 队列名称。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称。
     * @param QueueName 队列名称。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 队列中弹性节点数量最小值。取值范围0～200。 
     * @return MinSize 队列中弹性节点数量最小值。取值范围0～200。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 队列中弹性节点数量最小值。取值范围0～200。
     * @param MinSize 队列中弹性节点数量最小值。取值范围0～200。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 队列中弹性节点数量最大值。取值范围0～200。 
     * @return MaxSize 队列中弹性节点数量最大值。取值范围0～200。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 队列中弹性节点数量最大值。取值范围0～200。
     * @param MaxSize 队列中弹性节点数量最大值。取值范围0～200。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 是否开启自动扩容。 
     * @return EnableAutoExpansion 是否开启自动扩容。
     */
    public Boolean getEnableAutoExpansion() {
        return this.EnableAutoExpansion;
    }

    /**
     * Set 是否开启自动扩容。
     * @param EnableAutoExpansion 是否开启自动扩容。
     */
    public void setEnableAutoExpansion(Boolean EnableAutoExpansion) {
        this.EnableAutoExpansion = EnableAutoExpansion;
    }

    /**
     * Get 是否开启自动缩容。 
     * @return EnableAutoShrink 是否开启自动缩容。
     */
    public Boolean getEnableAutoShrink() {
        return this.EnableAutoShrink;
    }

    /**
     * Set 是否开启自动缩容。
     * @param EnableAutoShrink 是否开启自动缩容。
     */
    public void setEnableAutoShrink(Boolean EnableAutoShrink) {
        this.EnableAutoShrink = EnableAutoShrink;
    }

    /**
     * Get 扩容节点配置信息。 
     * @return ExpansionNodeConfigs 扩容节点配置信息。
     */
    public ExpansionNodeConfigOverview [] getExpansionNodeConfigs() {
        return this.ExpansionNodeConfigs;
    }

    /**
     * Set 扩容节点配置信息。
     * @param ExpansionNodeConfigs 扩容节点配置信息。
     */
    public void setExpansionNodeConfigs(ExpansionNodeConfigOverview [] ExpansionNodeConfigs) {
        this.ExpansionNodeConfigs = ExpansionNodeConfigs;
    }

    /**
     * Get 队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DesiredIdleNodeCapacity 队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDesiredIdleNodeCapacity() {
        return this.DesiredIdleNodeCapacity;
    }

    /**
     * Set 队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DesiredIdleNodeCapacity 队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesiredIdleNodeCapacity(Long DesiredIdleNodeCapacity) {
        this.DesiredIdleNodeCapacity = DesiredIdleNodeCapacity;
    }

    /**
     * Get 扩容比例。默认值：100。取值范围：1～100。
如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleOutRatio 扩容比例。默认值：100。取值范围：1～100。
如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleOutRatio() {
        return this.ScaleOutRatio;
    }

    /**
     * Set 扩容比例。默认值：100。取值范围：1～100。
如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleOutRatio 扩容比例。默认值：100。取值范围：1～100。
如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleOutRatio(Long ScaleOutRatio) {
        this.ScaleOutRatio = ScaleOutRatio;
    }

    /**
     * Get 比例扩容阈值。默认值：0。取值范围：0～200。
当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。
此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleOutNodeThreshold 比例扩容阈值。默认值：0。取值范围：0～200。
当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。
此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleOutNodeThreshold() {
        return this.ScaleOutNodeThreshold;
    }

    /**
     * Set 比例扩容阈值。默认值：0。取值范围：0～200。
当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。
此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleOutNodeThreshold 比例扩容阈值。默认值：0。取值范围：0～200。
当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。
此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleOutNodeThreshold(Long ScaleOutNodeThreshold) {
        this.ScaleOutNodeThreshold = ScaleOutNodeThreshold;
    }

    /**
     * Get 每轮扩容最大节点个数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxNodesPerCycle 每轮扩容最大节点个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxNodesPerCycle() {
        return this.MaxNodesPerCycle;
    }

    /**
     * Set 每轮扩容最大节点个数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxNodesPerCycle 每轮扩容最大节点个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxNodesPerCycle(Long MaxNodesPerCycle) {
        this.MaxNodesPerCycle = MaxNodesPerCycle;
    }

    public QueueConfigOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueConfigOverview(QueueConfigOverview source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.EnableAutoExpansion != null) {
            this.EnableAutoExpansion = new Boolean(source.EnableAutoExpansion);
        }
        if (source.EnableAutoShrink != null) {
            this.EnableAutoShrink = new Boolean(source.EnableAutoShrink);
        }
        if (source.ExpansionNodeConfigs != null) {
            this.ExpansionNodeConfigs = new ExpansionNodeConfigOverview[source.ExpansionNodeConfigs.length];
            for (int i = 0; i < source.ExpansionNodeConfigs.length; i++) {
                this.ExpansionNodeConfigs[i] = new ExpansionNodeConfigOverview(source.ExpansionNodeConfigs[i]);
            }
        }
        if (source.DesiredIdleNodeCapacity != null) {
            this.DesiredIdleNodeCapacity = new Long(source.DesiredIdleNodeCapacity);
        }
        if (source.ScaleOutRatio != null) {
            this.ScaleOutRatio = new Long(source.ScaleOutRatio);
        }
        if (source.ScaleOutNodeThreshold != null) {
            this.ScaleOutNodeThreshold = new Long(source.ScaleOutNodeThreshold);
        }
        if (source.MaxNodesPerCycle != null) {
            this.MaxNodesPerCycle = new Long(source.MaxNodesPerCycle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "EnableAutoExpansion", this.EnableAutoExpansion);
        this.setParamSimple(map, prefix + "EnableAutoShrink", this.EnableAutoShrink);
        this.setParamArrayObj(map, prefix + "ExpansionNodeConfigs.", this.ExpansionNodeConfigs);
        this.setParamSimple(map, prefix + "DesiredIdleNodeCapacity", this.DesiredIdleNodeCapacity);
        this.setParamSimple(map, prefix + "ScaleOutRatio", this.ScaleOutRatio);
        this.setParamSimple(map, prefix + "ScaleOutNodeThreshold", this.ScaleOutNodeThreshold);
        this.setParamSimple(map, prefix + "MaxNodesPerCycle", this.MaxNodesPerCycle);

    }
}

