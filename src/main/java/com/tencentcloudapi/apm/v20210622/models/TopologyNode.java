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
    * <p>错误率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrRate")
    @Expose
    private Float ErrRate;

    /**
    * <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>节点名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>节点权重</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * <p>节点颜色</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>响应时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>吞吐量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Float Qps;

    /**
    * <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>节点ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>节点大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * <p>节点是否为组件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsModule")
    @Expose
    private Boolean IsModule;

    /**
    * <p>节点位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * <p>节点标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>节点是否可以下钻</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanDrillDown")
    @Expose
    private Boolean CanDrillDown;

    /**
    * <p>资源层信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * <p>拓扑节点视图名字</p>
    */
    @SerializedName("NodeView")
    @Expose
    private String NodeView;

    /**
    * <p>MQ 消费者视角的响应时间 ms</p>
    */
    @SerializedName("ConsumerDuration")
    @Expose
    private Float ConsumerDuration;

    /**
    * <p>MQ 消费者视角的错误率 %</p>
    */
    @SerializedName("ConsumerErrRate")
    @Expose
    private Float ConsumerErrRate;

    /**
    * <p>MQ 消费者视角的吞吐量</p>
    */
    @SerializedName("ConsumerQps")
    @Expose
    private Float ConsumerQps;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>调用次数</p>
    */
    @SerializedName("ReqCnt")
    @Expose
    private Long ReqCnt;

    /**
    * <p>消息队列消费者视角的调用次数</p>
    */
    @SerializedName("ConsumerReqCnt")
    @Expose
    private Long ConsumerReqCnt;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
     * Get <p>错误率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrRate <p>错误率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getErrRate() {
        return this.ErrRate;
    }

    /**
     * Set <p>错误率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrRate <p>错误率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrRate(Float ErrRate) {
        this.ErrRate = ErrRate;
    }

    /**
     * Get <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>节点名</p> 
     * @return Name <p>节点名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>节点名</p>
     * @param Name <p>节点名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>节点权重</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight <p>节点权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>节点权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight <p>节点权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>节点颜色</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Color <p>节点颜色</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>节点颜色</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Color <p>节点颜色</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>响应时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration <p>响应时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>响应时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration <p>响应时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>吞吐量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps <p>吞吐量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getQps() {
        return this.Qps;
    }

    /**
     * Set <p>吞吐量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps <p>吞吐量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Float Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>节点类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>节点ID</p> 
     * @return Id <p>节点ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>节点ID</p>
     * @param Id <p>节点ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>节点大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size <p>节点大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set <p>节点大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size <p>节点大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get <p>节点是否为组件类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsModule <p>节点是否为组件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsModule() {
        return this.IsModule;
    }

    /**
     * Set <p>节点是否为组件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsModule <p>节点是否为组件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsModule(Boolean IsModule) {
        this.IsModule = IsModule;
    }

    /**
     * Get <p>节点位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position <p>节点位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set <p>节点位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position <p>节点位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get <p>节点标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>节点标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>节点标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>节点标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>节点是否可以下钻</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanDrillDown <p>节点是否可以下钻</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanDrillDown() {
        return this.CanDrillDown;
    }

    /**
     * Set <p>节点是否可以下钻</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanDrillDown <p>节点是否可以下钻</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanDrillDown(Boolean CanDrillDown) {
        this.CanDrillDown = CanDrillDown;
    }

    /**
     * Get <p>资源层信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource <p>资源层信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>资源层信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource <p>资源层信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>拓扑节点视图名字</p> 
     * @return NodeView <p>拓扑节点视图名字</p>
     */
    public String getNodeView() {
        return this.NodeView;
    }

    /**
     * Set <p>拓扑节点视图名字</p>
     * @param NodeView <p>拓扑节点视图名字</p>
     */
    public void setNodeView(String NodeView) {
        this.NodeView = NodeView;
    }

    /**
     * Get <p>MQ 消费者视角的响应时间 ms</p> 
     * @return ConsumerDuration <p>MQ 消费者视角的响应时间 ms</p>
     */
    public Float getConsumerDuration() {
        return this.ConsumerDuration;
    }

    /**
     * Set <p>MQ 消费者视角的响应时间 ms</p>
     * @param ConsumerDuration <p>MQ 消费者视角的响应时间 ms</p>
     */
    public void setConsumerDuration(Float ConsumerDuration) {
        this.ConsumerDuration = ConsumerDuration;
    }

    /**
     * Get <p>MQ 消费者视角的错误率 %</p> 
     * @return ConsumerErrRate <p>MQ 消费者视角的错误率 %</p>
     */
    public Float getConsumerErrRate() {
        return this.ConsumerErrRate;
    }

    /**
     * Set <p>MQ 消费者视角的错误率 %</p>
     * @param ConsumerErrRate <p>MQ 消费者视角的错误率 %</p>
     */
    public void setConsumerErrRate(Float ConsumerErrRate) {
        this.ConsumerErrRate = ConsumerErrRate;
    }

    /**
     * Get <p>MQ 消费者视角的吞吐量</p> 
     * @return ConsumerQps <p>MQ 消费者视角的吞吐量</p>
     */
    public Float getConsumerQps() {
        return this.ConsumerQps;
    }

    /**
     * Set <p>MQ 消费者视角的吞吐量</p>
     * @param ConsumerQps <p>MQ 消费者视角的吞吐量</p>
     */
    public void setConsumerQps(Float ConsumerQps) {
        this.ConsumerQps = ConsumerQps;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return ServiceId <p>应用 ID</p>
     * @deprecated
     */
    @Deprecated
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param ServiceId <p>应用 ID</p>
     * @deprecated
     */
    @Deprecated
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>调用次数</p> 
     * @return ReqCnt <p>调用次数</p>
     */
    public Long getReqCnt() {
        return this.ReqCnt;
    }

    /**
     * Set <p>调用次数</p>
     * @param ReqCnt <p>调用次数</p>
     */
    public void setReqCnt(Long ReqCnt) {
        this.ReqCnt = ReqCnt;
    }

    /**
     * Get <p>消息队列消费者视角的调用次数</p> 
     * @return ConsumerReqCnt <p>消息队列消费者视角的调用次数</p>
     */
    public Long getConsumerReqCnt() {
        return this.ConsumerReqCnt;
    }

    /**
     * Set <p>消息队列消费者视角的调用次数</p>
     * @param ConsumerReqCnt <p>消息队列消费者视角的调用次数</p>
     */
    public void setConsumerReqCnt(Long ConsumerReqCnt) {
        this.ConsumerReqCnt = ConsumerReqCnt;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return ServiceID <p>应用 ID</p>
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>应用 ID</p>
     * @param ServiceID <p>应用 ID</p>
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
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
        if (source.ReqCnt != null) {
            this.ReqCnt = new Long(source.ReqCnt);
        }
        if (source.ConsumerReqCnt != null) {
            this.ConsumerReqCnt = new Long(source.ConsumerReqCnt);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
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
        this.setParamSimple(map, prefix + "ReqCnt", this.ReqCnt);
        this.setParamSimple(map, prefix + "ConsumerReqCnt", this.ConsumerReqCnt);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);

    }
}

