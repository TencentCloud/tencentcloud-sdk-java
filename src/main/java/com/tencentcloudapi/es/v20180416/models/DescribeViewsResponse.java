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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeViewsResponse extends AbstractModel{

    /**
    * 集群维度视图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterView")
    @Expose
    private ClusterView ClusterView;

    /**
    * 节点维度视图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodesView")
    @Expose
    private NodeView [] NodesView;

    /**
    * Kibana维度视图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanasView")
    @Expose
    private KibanaView [] KibanasView;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群维度视图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterView 集群维度视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterView getClusterView() {
        return this.ClusterView;
    }

    /**
     * Set 集群维度视图
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterView 集群维度视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterView(ClusterView ClusterView) {
        this.ClusterView = ClusterView;
    }

    /**
     * Get 节点维度视图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodesView 节点维度视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeView [] getNodesView() {
        return this.NodesView;
    }

    /**
     * Set 节点维度视图
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodesView 节点维度视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodesView(NodeView [] NodesView) {
        this.NodesView = NodesView;
    }

    /**
     * Get Kibana维度视图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanasView Kibana维度视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KibanaView [] getKibanasView() {
        return this.KibanasView;
    }

    /**
     * Set Kibana维度视图
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanasView Kibana维度视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanasView(KibanaView [] KibanasView) {
        this.KibanasView = KibanasView;
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

    public DescribeViewsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeViewsResponse(DescribeViewsResponse source) {
        if (source.ClusterView != null) {
            this.ClusterView = new ClusterView(source.ClusterView);
        }
        if (source.NodesView != null) {
            this.NodesView = new NodeView[source.NodesView.length];
            for (int i = 0; i < source.NodesView.length; i++) {
                this.NodesView[i] = new NodeView(source.NodesView[i]);
            }
        }
        if (source.KibanasView != null) {
            this.KibanasView = new KibanaView[source.KibanasView.length];
            for (int i = 0; i < source.KibanasView.length; i++) {
                this.KibanasView[i] = new KibanaView(source.KibanasView[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterView.", this.ClusterView);
        this.setParamArrayObj(map, prefix + "NodesView.", this.NodesView);
        this.setParamArrayObj(map, prefix + "KibanasView.", this.KibanasView);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

