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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeNodeResponse extends AbstractModel{

    /**
    * 节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点状态 （1健康｜2异常｜3离线｜4未激活）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuArchitecture")
    @Expose
    private String CpuArchitecture;

    /**
    * AI处理器体系结构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiChipArchitecture")
    @Expose
    private String AiChipArchitecture;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点标签列表
    */
    @SerializedName("Labels")
    @Expose
    private EdgeNodeLabel [] Labels;

    /**
    * 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private EdgeNodeResourceInfo Resource;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get 节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点状态 （1健康｜2异常｜3离线｜4未激活）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 节点状态 （1健康｜2异常｜3离线｜4未激活）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态 （1健康｜2异常｜3离线｜4未激活）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 节点状态 （1健康｜2异常｜3离线｜4未激活）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuArchitecture CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuArchitecture() {
        return this.CpuArchitecture;
    }

    /**
     * Set CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuArchitecture CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuArchitecture(String CpuArchitecture) {
        this.CpuArchitecture = CpuArchitecture;
    }

    /**
     * Get AI处理器体系结构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiChipArchitecture AI处理器体系结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAiChipArchitecture() {
        return this.AiChipArchitecture;
    }

    /**
     * Set AI处理器体系结构
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiChipArchitecture AI处理器体系结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiChipArchitecture(String AiChipArchitecture) {
        this.AiChipArchitecture = AiChipArchitecture;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点标签列表 
     * @return Labels 节点标签列表
     */
    public EdgeNodeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 节点标签列表
     * @param Labels 节点标签列表
     */
    public void setLabels(EdgeNodeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeNodeResourceInfo getResource() {
        return this.Resource;
    }

    /**
     * Set 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(EdgeNodeResourceInfo Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEdgeNodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeNodeResponse(DescribeEdgeNodeResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CpuArchitecture != null) {
            this.CpuArchitecture = new String(source.CpuArchitecture);
        }
        if (source.AiChipArchitecture != null) {
            this.AiChipArchitecture = new String(source.AiChipArchitecture);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Labels != null) {
            this.Labels = new EdgeNodeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new EdgeNodeLabel(source.Labels[i]);
            }
        }
        if (source.Resource != null) {
            this.Resource = new EdgeNodeResourceInfo(source.Resource);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CpuArchitecture", this.CpuArchitecture);
        this.setParamSimple(map, prefix + "AiChipArchitecture", this.AiChipArchitecture);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

