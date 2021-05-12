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

public class DescribeInstanceRenewNodesResponse extends AbstractModel{

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
    private RenewInstancesInfo [] NodeList;

    /**
    * 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaInfo")
    @Expose
    private String [] MetaInfo;

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
    public RenewInstancesInfo [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeList 节点详细信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeList(RenewInstancesInfo [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaInfo 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetaInfo() {
        return this.MetaInfo;
    }

    /**
     * Set 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaInfo 用户所有的标签键列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaInfo(String [] MetaInfo) {
        this.MetaInfo = MetaInfo;
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

    public DescribeInstanceRenewNodesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceRenewNodesResponse(DescribeInstanceRenewNodesResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.NodeList != null) {
            this.NodeList = new RenewInstancesInfo[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new RenewInstancesInfo(source.NodeList[i]);
            }
        }
        if (source.MetaInfo != null) {
            this.MetaInfo = new String[source.MetaInfo.length];
            for (int i = 0; i < source.MetaInfo.length; i++) {
                this.MetaInfo[i] = new String(source.MetaInfo[i]);
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
        this.setParamArraySimple(map, prefix + "MetaInfo.", this.MetaInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

