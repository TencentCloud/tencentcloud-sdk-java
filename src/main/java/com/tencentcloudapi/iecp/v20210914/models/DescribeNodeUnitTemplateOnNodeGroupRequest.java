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

public class DescribeNodeUnitTemplateOnNodeGroupRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * NodeGroup名称
    */
    @SerializedName("NodeGroupName")
    @Expose
    private String NodeGroupName;

    /**
    * 命名空间，默认default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 名称模糊匹配
    */
    @SerializedName("NodeUnitNamePattern")
    @Expose
    private String NodeUnitNamePattern;

    /**
    * 分页查询offset，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询limit，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序，默认DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get NodeGroup名称 
     * @return NodeGroupName NodeGroup名称
     */
    public String getNodeGroupName() {
        return this.NodeGroupName;
    }

    /**
     * Set NodeGroup名称
     * @param NodeGroupName NodeGroup名称
     */
    public void setNodeGroupName(String NodeGroupName) {
        this.NodeGroupName = NodeGroupName;
    }

    /**
     * Get 命名空间，默认default 
     * @return Namespace 命名空间，默认default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认default
     * @param Namespace 命名空间，默认default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 名称模糊匹配 
     * @return NodeUnitNamePattern 名称模糊匹配
     */
    public String getNodeUnitNamePattern() {
        return this.NodeUnitNamePattern;
    }

    /**
     * Set 名称模糊匹配
     * @param NodeUnitNamePattern 名称模糊匹配
     */
    public void setNodeUnitNamePattern(String NodeUnitNamePattern) {
        this.NodeUnitNamePattern = NodeUnitNamePattern;
    }

    /**
     * Get 分页查询offset，默认0 
     * @return Offset 分页查询offset，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询offset，默认0
     * @param Offset 分页查询offset，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询limit，默认20 
     * @return Limit 分页查询limit，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询limit，默认20
     * @param Limit 分页查询limit，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序，默认DESC 
     * @return Order 排序，默认DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，默认DESC
     * @param Order 排序，默认DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeNodeUnitTemplateOnNodeGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeUnitTemplateOnNodeGroupRequest(DescribeNodeUnitTemplateOnNodeGroupRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NodeGroupName != null) {
            this.NodeGroupName = new String(source.NodeGroupName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NodeUnitNamePattern != null) {
            this.NodeUnitNamePattern = new String(source.NodeUnitNamePattern);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NodeGroupName", this.NodeGroupName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NodeUnitNamePattern", this.NodeUnitNamePattern);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

