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

public class DescribeYeheResourceLimitResponse extends AbstractModel{

    /**
    * 用户父账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 允许创建的节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateNodeLimit")
    @Expose
    private Long CreateNodeLimit;

    /**
    * 允许创建的集群数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateClusterLimit")
    @Expose
    private Long CreateClusterLimit;

    /**
    * 是否有监控开启权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnablePermMonitor")
    @Expose
    private Boolean EnablePermMonitor;

    /**
    * 节点是否有admin的所有权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnablePermAdminNode")
    @Expose
    private Boolean EnablePermAdminNode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户父账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户父账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户父账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户父账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 允许创建的节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateNodeLimit 允许创建的节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateNodeLimit() {
        return this.CreateNodeLimit;
    }

    /**
     * Set 允许创建的节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateNodeLimit 允许创建的节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateNodeLimit(Long CreateNodeLimit) {
        this.CreateNodeLimit = CreateNodeLimit;
    }

    /**
     * Get 允许创建的集群数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateClusterLimit 允许创建的集群数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateClusterLimit() {
        return this.CreateClusterLimit;
    }

    /**
     * Set 允许创建的集群数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateClusterLimit 允许创建的集群数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateClusterLimit(Long CreateClusterLimit) {
        this.CreateClusterLimit = CreateClusterLimit;
    }

    /**
     * Get 是否有监控开启权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnablePermMonitor 是否有监控开启权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnablePermMonitor() {
        return this.EnablePermMonitor;
    }

    /**
     * Set 是否有监控开启权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnablePermMonitor 是否有监控开启权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnablePermMonitor(Boolean EnablePermMonitor) {
        this.EnablePermMonitor = EnablePermMonitor;
    }

    /**
     * Get 节点是否有admin的所有权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnablePermAdminNode 节点是否有admin的所有权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnablePermAdminNode() {
        return this.EnablePermAdminNode;
    }

    /**
     * Set 节点是否有admin的所有权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnablePermAdminNode 节点是否有admin的所有权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnablePermAdminNode(Boolean EnablePermAdminNode) {
        this.EnablePermAdminNode = EnablePermAdminNode;
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

    public DescribeYeheResourceLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeYeheResourceLimitResponse(DescribeYeheResourceLimitResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateNodeLimit != null) {
            this.CreateNodeLimit = new Long(source.CreateNodeLimit);
        }
        if (source.CreateClusterLimit != null) {
            this.CreateClusterLimit = new Long(source.CreateClusterLimit);
        }
        if (source.EnablePermMonitor != null) {
            this.EnablePermMonitor = new Boolean(source.EnablePermMonitor);
        }
        if (source.EnablePermAdminNode != null) {
            this.EnablePermAdminNode = new Boolean(source.EnablePermAdminNode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateNodeLimit", this.CreateNodeLimit);
        this.setParamSimple(map, prefix + "CreateClusterLimit", this.CreateClusterLimit);
        this.setParamSimple(map, prefix + "EnablePermMonitor", this.EnablePermMonitor);
        this.setParamSimple(map, prefix + "EnablePermAdminNode", this.EnablePermAdminNode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

