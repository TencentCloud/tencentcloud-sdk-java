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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologyNode extends AbstractModel {

    /**
    * 错误率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrRate")
    @Expose
    private Float ErrRate;

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 节点名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * 节点颜色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 响应时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Float Qps;

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 节点大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 节点是否为组件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsModule")
    @Expose
    private Boolean IsModule;

    /**
    * 节点位置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * 节点标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 节点是否可以下钻
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanDrillDown")
    @Expose
    private Boolean CanDrillDown;

    /**
    * 资源层信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 拓扑节点视图名字
    */
    @SerializedName("NodeView")
    @Expose
    private String NodeView;

    /**
    * MQ 消费者视角的响应时间 ms
    */
    @SerializedName("ConsumerDuration")
    @Expose
    private Float ConsumerDuration;

    /**
    * MQ 消费者视角的错误率 %
    */
    @SerializedName("ConsumerErrRate")
    @Expose
    private Float ConsumerErrRate;

    /**
    * MQ 消费者视角的吞吐量
    */
    @SerializedName("ConsumerQps")
    @Expose
    private Float ConsumerQps;

    /**
    * 应用 ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get 错误率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrRate 错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getErrRate() {
        return this.ErrRate;
    }

    /**
     * Set 错误率
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrRate 错误率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrRate(Float ErrRate) {
        this.ErrRate = ErrRate;
    }

    /**
     * Get 节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 节点名 
     * @return Name 节点名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名
     * @param Name 节点名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 节点权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set 节点权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 节点权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 节点颜色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Color 节点颜色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 节点颜色
注意：此字段可能返回 null，表示取不到有效值。
     * @param Color 节点颜色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 响应时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 响应时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 吞吐量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getQps() {
        return this.Qps;
    }

    /**
     * Set 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps 吞吐量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Float Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 节点ID 
     * @return Id 节点ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 节点ID
     * @param Id 节点ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 节点大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 节点大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 节点大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 节点大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 节点是否为组件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsModule 节点是否为组件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsModule() {
        return this.IsModule;
    }

    /**
     * Set 节点是否为组件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsModule 节点是否为组件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsModule(Boolean IsModule) {
        this.IsModule = IsModule;
    }

    /**
     * Get 节点位置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 节点位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set 节点位置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 节点位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get 节点标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 节点标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 节点标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 节点标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 节点是否可以下钻
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanDrillDown 节点是否可以下钻
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanDrillDown() {
        return this.CanDrillDown;
    }

    /**
     * Set 节点是否可以下钻
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanDrillDown 节点是否可以下钻
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanDrillDown(Boolean CanDrillDown) {
        this.CanDrillDown = CanDrillDown;
    }

    /**
     * Get 资源层信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 资源层信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set 资源层信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 资源层信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 拓扑节点视图名字 
     * @return NodeView 拓扑节点视图名字
     */
    public String getNodeView() {
        return this.NodeView;
    }

    /**
     * Set 拓扑节点视图名字
     * @param NodeView 拓扑节点视图名字
     */
    public void setNodeView(String NodeView) {
        this.NodeView = NodeView;
    }

    /**
     * Get MQ 消费者视角的响应时间 ms 
     * @return ConsumerDuration MQ 消费者视角的响应时间 ms
     */
    public Float getConsumerDuration() {
        return this.ConsumerDuration;
    }

    /**
     * Set MQ 消费者视角的响应时间 ms
     * @param ConsumerDuration MQ 消费者视角的响应时间 ms
     */
    public void setConsumerDuration(Float ConsumerDuration) {
        this.ConsumerDuration = ConsumerDuration;
    }

    /**
     * Get MQ 消费者视角的错误率 % 
     * @return ConsumerErrRate MQ 消费者视角的错误率 %
     */
    public Float getConsumerErrRate() {
        return this.ConsumerErrRate;
    }

    /**
     * Set MQ 消费者视角的错误率 %
     * @param ConsumerErrRate MQ 消费者视角的错误率 %
     */
    public void setConsumerErrRate(Float ConsumerErrRate) {
        this.ConsumerErrRate = ConsumerErrRate;
    }

    /**
     * Get MQ 消费者视角的吞吐量 
     * @return ConsumerQps MQ 消费者视角的吞吐量
     */
    public Float getConsumerQps() {
        return this.ConsumerQps;
    }

    /**
     * Set MQ 消费者视角的吞吐量
     * @param ConsumerQps MQ 消费者视角的吞吐量
     */
    public void setConsumerQps(Float ConsumerQps) {
        this.ConsumerQps = ConsumerQps;
    }

    /**
     * Get 应用 ID 
     * @return ServiceId 应用 ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 应用 ID
     * @param ServiceId 应用 ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public TopologyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyNode(TopologyNode source) {
        if (source.ErrRate != null) {
            this.ErrRate = new Float(source.ErrRate);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Qps != null) {
            this.Qps = new Float(source.Qps);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.IsModule != null) {
            this.IsModule = new Boolean(source.IsModule);
        }
        if (source.Position != null) {
            this.Position = new Position(source.Position);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.CanDrillDown != null) {
            this.CanDrillDown = new Boolean(source.CanDrillDown);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.NodeView != null) {
            this.NodeView = new String(source.NodeView);
        }
        if (source.ConsumerDuration != null) {
            this.ConsumerDuration = new Float(source.ConsumerDuration);
        }
        if (source.ConsumerErrRate != null) {
            this.ConsumerErrRate = new Float(source.ConsumerErrRate);
        }
        if (source.ConsumerQps != null) {
            this.ConsumerQps = new Float(source.ConsumerQps);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrRate", this.ErrRate);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "IsModule", this.IsModule);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CanDrillDown", this.CanDrillDown);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "NodeView", this.NodeView);
        this.setParamSimple(map, prefix + "ConsumerDuration", this.ConsumerDuration);
        this.setParamSimple(map, prefix + "ConsumerErrRate", this.ConsumerErrRate);
        this.setParamSimple(map, prefix + "ConsumerQps", this.ConsumerQps);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

