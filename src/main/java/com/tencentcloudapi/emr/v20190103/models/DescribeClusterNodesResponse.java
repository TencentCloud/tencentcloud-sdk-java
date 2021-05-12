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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNodesResponse extends AbstractModel{

    /**
    * 查询到的节点总数
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeList")
    @Expose
    private NodeHardwareInfo [] NodeList;

    /**
    * 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * 资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HardwareResourceTypeList")
    @Expose
    private String [] HardwareResourceTypeList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询到的节点总数 
     * @return TotalCnt 查询到的节点总数
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 查询到的节点总数
     * @param TotalCnt 查询到的节点总数
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeList 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeHardwareInfo [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeList 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeList(NodeHardwareInfo [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagKeys 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagKeys 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get 资源类型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HardwareResourceTypeList 资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHardwareResourceTypeList() {
        return this.HardwareResourceTypeList;
    }

    /**
     * Set 资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param HardwareResourceTypeList 资源类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHardwareResourceTypeList(String [] HardwareResourceTypeList) {
        this.HardwareResourceTypeList = HardwareResourceTypeList;
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

    public DescribeClusterNodesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNodesResponse(DescribeClusterNodesResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.NodeList != null) {
            this.NodeList = new NodeHardwareInfo[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new NodeHardwareInfo(source.NodeList[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.HardwareResourceTypeList != null) {
            this.HardwareResourceTypeList = new String[source.HardwareResourceTypeList.length];
            for (int i = 0; i < source.HardwareResourceTypeList.length; i++) {
                this.HardwareResourceTypeList[i] = new String(source.HardwareResourceTypeList[i]);
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
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamArraySimple(map, prefix + "HardwareResourceTypeList.", this.HardwareResourceTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

