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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLibraDBClusterTableMappingRequest extends AbstractModel {

    /**
    * 分析集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 分析引擎实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页面记录限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 源端schema列表
    */
    @SerializedName("SrcSchemas")
    @Expose
    private String [] SrcSchemas;

    /**
    * 源端表列表
    */
    @SerializedName("SrcTableName")
    @Expose
    private String [] SrcTableName;

    /**
    * 状态列表
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
    * 映射数据库名称
    */
    @SerializedName("MapSchemas")
    @Expose
    private String [] MapSchemas;

    /**
    * 映射表名
    */
    @SerializedName("MapTableName")
    @Expose
    private String [] MapTableName;

    /**
    * 是否查询映射数据库名称不为空的记录
    */
    @SerializedName("MapSchemaNotEmpty")
    @Expose
    private Boolean MapSchemaNotEmpty;

    /**
    * 是否查询映射表名不为空的记录
    */
    @SerializedName("MapTableNameNotEmpty")
    @Expose
    private Boolean MapTableNameNotEmpty;

    /**
     * Get 分析集群ID 
     * @return ClusterId 分析集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群ID
     * @param ClusterId 分析集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 分析引擎实例ID 
     * @return InstanceId 分析引擎实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 分析引擎实例ID
     * @param InstanceId 分析引擎实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点ID 
     * @return NodeId 节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
     * @param NodeId 节点ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页面记录限制 
     * @return Limit 页面记录限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页面记录限制
     * @param Limit 页面记录限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 源端schema列表 
     * @return SrcSchemas 源端schema列表
     */
    public String [] getSrcSchemas() {
        return this.SrcSchemas;
    }

    /**
     * Set 源端schema列表
     * @param SrcSchemas 源端schema列表
     */
    public void setSrcSchemas(String [] SrcSchemas) {
        this.SrcSchemas = SrcSchemas;
    }

    /**
     * Get 源端表列表 
     * @return SrcTableName 源端表列表
     */
    public String [] getSrcTableName() {
        return this.SrcTableName;
    }

    /**
     * Set 源端表列表
     * @param SrcTableName 源端表列表
     */
    public void setSrcTableName(String [] SrcTableName) {
        this.SrcTableName = SrcTableName;
    }

    /**
     * Get 状态列表 
     * @return StatusList 状态列表
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 状态列表
     * @param StatusList 状态列表
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get 映射数据库名称 
     * @return MapSchemas 映射数据库名称
     */
    public String [] getMapSchemas() {
        return this.MapSchemas;
    }

    /**
     * Set 映射数据库名称
     * @param MapSchemas 映射数据库名称
     */
    public void setMapSchemas(String [] MapSchemas) {
        this.MapSchemas = MapSchemas;
    }

    /**
     * Get 映射表名 
     * @return MapTableName 映射表名
     */
    public String [] getMapTableName() {
        return this.MapTableName;
    }

    /**
     * Set 映射表名
     * @param MapTableName 映射表名
     */
    public void setMapTableName(String [] MapTableName) {
        this.MapTableName = MapTableName;
    }

    /**
     * Get 是否查询映射数据库名称不为空的记录 
     * @return MapSchemaNotEmpty 是否查询映射数据库名称不为空的记录
     */
    public Boolean getMapSchemaNotEmpty() {
        return this.MapSchemaNotEmpty;
    }

    /**
     * Set 是否查询映射数据库名称不为空的记录
     * @param MapSchemaNotEmpty 是否查询映射数据库名称不为空的记录
     */
    public void setMapSchemaNotEmpty(Boolean MapSchemaNotEmpty) {
        this.MapSchemaNotEmpty = MapSchemaNotEmpty;
    }

    /**
     * Get 是否查询映射表名不为空的记录 
     * @return MapTableNameNotEmpty 是否查询映射表名不为空的记录
     */
    public Boolean getMapTableNameNotEmpty() {
        return this.MapTableNameNotEmpty;
    }

    /**
     * Set 是否查询映射表名不为空的记录
     * @param MapTableNameNotEmpty 是否查询映射表名不为空的记录
     */
    public void setMapTableNameNotEmpty(Boolean MapTableNameNotEmpty) {
        this.MapTableNameNotEmpty = MapTableNameNotEmpty;
    }

    public DescribeLibraDBClusterTableMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterTableMappingRequest(DescribeLibraDBClusterTableMappingRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SrcSchemas != null) {
            this.SrcSchemas = new String[source.SrcSchemas.length];
            for (int i = 0; i < source.SrcSchemas.length; i++) {
                this.SrcSchemas[i] = new String(source.SrcSchemas[i]);
            }
        }
        if (source.SrcTableName != null) {
            this.SrcTableName = new String[source.SrcTableName.length];
            for (int i = 0; i < source.SrcTableName.length; i++) {
                this.SrcTableName[i] = new String(source.SrcTableName[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
        if (source.MapSchemas != null) {
            this.MapSchemas = new String[source.MapSchemas.length];
            for (int i = 0; i < source.MapSchemas.length; i++) {
                this.MapSchemas[i] = new String(source.MapSchemas[i]);
            }
        }
        if (source.MapTableName != null) {
            this.MapTableName = new String[source.MapTableName.length];
            for (int i = 0; i < source.MapTableName.length; i++) {
                this.MapTableName[i] = new String(source.MapTableName[i]);
            }
        }
        if (source.MapSchemaNotEmpty != null) {
            this.MapSchemaNotEmpty = new Boolean(source.MapSchemaNotEmpty);
        }
        if (source.MapTableNameNotEmpty != null) {
            this.MapTableNameNotEmpty = new Boolean(source.MapTableNameNotEmpty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SrcSchemas.", this.SrcSchemas);
        this.setParamArraySimple(map, prefix + "SrcTableName.", this.SrcTableName);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArraySimple(map, prefix + "MapSchemas.", this.MapSchemas);
        this.setParamArraySimple(map, prefix + "MapTableName.", this.MapTableName);
        this.setParamSimple(map, prefix + "MapSchemaNotEmpty", this.MapSchemaNotEmpty);
        this.setParamSimple(map, prefix + "MapTableNameNotEmpty", this.MapTableNameNotEmpty);

    }
}

