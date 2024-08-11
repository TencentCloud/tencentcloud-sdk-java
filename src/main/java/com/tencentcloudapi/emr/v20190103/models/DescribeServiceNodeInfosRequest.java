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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceNodeInfosRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索字段
    */
    @SerializedName("SearchText")
    @Expose
    private String SearchText;

    /**
    * '配置状态，-2：配置失败，-1:配置过期，1：已同步', -99 '全部'
    */
    @SerializedName("ConfStatus")
    @Expose
    private Long ConfStatus;

    /**
    * 过滤条件：维护状态
0代表所有状态
1代表正常模式
2代表维护模式

    */
    @SerializedName("MaintainStateId")
    @Expose
    private Long MaintainStateId;

    /**
    * 过滤条件：操作状态
0代表所有状态
1代表已启动
2代表已停止
    */
    @SerializedName("OperatorStateId")
    @Expose
    private Long OperatorStateId;

    /**
    * 过滤条件：健康状态
"0"代表不可用
"1"代表良好
"-2"代表未知
"-99"代表所有
"-3"代表存在隐患
"-4"代表未探测
    */
    @SerializedName("HealthStateId")
    @Expose
    private String HealthStateId;

    /**
    * 服务组件名称，都是大写比如YARN
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 节点名称
master
core
task
common
router

    */
    @SerializedName("NodeTypeName")
    @Expose
    private String NodeTypeName;

    /**
    * 过滤条件：dn是否处于维护状态
0代表所有状态
1代表处于维护状态
    */
    @SerializedName("DataNodeMaintenanceId")
    @Expose
    private Long DataNodeMaintenanceId;

    /**
    * 支持搜索的字段
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索字段 
     * @return SearchText 搜索字段
     */
    public String getSearchText() {
        return this.SearchText;
    }

    /**
     * Set 搜索字段
     * @param SearchText 搜索字段
     */
    public void setSearchText(String SearchText) {
        this.SearchText = SearchText;
    }

    /**
     * Get '配置状态，-2：配置失败，-1:配置过期，1：已同步', -99 '全部' 
     * @return ConfStatus '配置状态，-2：配置失败，-1:配置过期，1：已同步', -99 '全部'
     */
    public Long getConfStatus() {
        return this.ConfStatus;
    }

    /**
     * Set '配置状态，-2：配置失败，-1:配置过期，1：已同步', -99 '全部'
     * @param ConfStatus '配置状态，-2：配置失败，-1:配置过期，1：已同步', -99 '全部'
     */
    public void setConfStatus(Long ConfStatus) {
        this.ConfStatus = ConfStatus;
    }

    /**
     * Get 过滤条件：维护状态
0代表所有状态
1代表正常模式
2代表维护模式
 
     * @return MaintainStateId 过滤条件：维护状态
0代表所有状态
1代表正常模式
2代表维护模式

     */
    public Long getMaintainStateId() {
        return this.MaintainStateId;
    }

    /**
     * Set 过滤条件：维护状态
0代表所有状态
1代表正常模式
2代表维护模式

     * @param MaintainStateId 过滤条件：维护状态
0代表所有状态
1代表正常模式
2代表维护模式

     */
    public void setMaintainStateId(Long MaintainStateId) {
        this.MaintainStateId = MaintainStateId;
    }

    /**
     * Get 过滤条件：操作状态
0代表所有状态
1代表已启动
2代表已停止 
     * @return OperatorStateId 过滤条件：操作状态
0代表所有状态
1代表已启动
2代表已停止
     */
    public Long getOperatorStateId() {
        return this.OperatorStateId;
    }

    /**
     * Set 过滤条件：操作状态
0代表所有状态
1代表已启动
2代表已停止
     * @param OperatorStateId 过滤条件：操作状态
0代表所有状态
1代表已启动
2代表已停止
     */
    public void setOperatorStateId(Long OperatorStateId) {
        this.OperatorStateId = OperatorStateId;
    }

    /**
     * Get 过滤条件：健康状态
"0"代表不可用
"1"代表良好
"-2"代表未知
"-99"代表所有
"-3"代表存在隐患
"-4"代表未探测 
     * @return HealthStateId 过滤条件：健康状态
"0"代表不可用
"1"代表良好
"-2"代表未知
"-99"代表所有
"-3"代表存在隐患
"-4"代表未探测
     */
    public String getHealthStateId() {
        return this.HealthStateId;
    }

    /**
     * Set 过滤条件：健康状态
"0"代表不可用
"1"代表良好
"-2"代表未知
"-99"代表所有
"-3"代表存在隐患
"-4"代表未探测
     * @param HealthStateId 过滤条件：健康状态
"0"代表不可用
"1"代表良好
"-2"代表未知
"-99"代表所有
"-3"代表存在隐患
"-4"代表未探测
     */
    public void setHealthStateId(String HealthStateId) {
        this.HealthStateId = HealthStateId;
    }

    /**
     * Get 服务组件名称，都是大写比如YARN 
     * @return ServiceName 服务组件名称，都是大写比如YARN
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务组件名称，都是大写比如YARN
     * @param ServiceName 服务组件名称，都是大写比如YARN
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 节点名称
master
core
task
common
router
 
     * @return NodeTypeName 节点名称
master
core
task
common
router

     */
    public String getNodeTypeName() {
        return this.NodeTypeName;
    }

    /**
     * Set 节点名称
master
core
task
common
router

     * @param NodeTypeName 节点名称
master
core
task
common
router

     */
    public void setNodeTypeName(String NodeTypeName) {
        this.NodeTypeName = NodeTypeName;
    }

    /**
     * Get 过滤条件：dn是否处于维护状态
0代表所有状态
1代表处于维护状态 
     * @return DataNodeMaintenanceId 过滤条件：dn是否处于维护状态
0代表所有状态
1代表处于维护状态
     */
    public Long getDataNodeMaintenanceId() {
        return this.DataNodeMaintenanceId;
    }

    /**
     * Set 过滤条件：dn是否处于维护状态
0代表所有状态
1代表处于维护状态
     * @param DataNodeMaintenanceId 过滤条件：dn是否处于维护状态
0代表所有状态
1代表处于维护状态
     */
    public void setDataNodeMaintenanceId(Long DataNodeMaintenanceId) {
        this.DataNodeMaintenanceId = DataNodeMaintenanceId;
    }

    /**
     * Get 支持搜索的字段 
     * @return SearchFields 支持搜索的字段
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set 支持搜索的字段
     * @param SearchFields 支持搜索的字段
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    public DescribeServiceNodeInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceNodeInfosRequest(DescribeServiceNodeInfosRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchText != null) {
            this.SearchText = new String(source.SearchText);
        }
        if (source.ConfStatus != null) {
            this.ConfStatus = new Long(source.ConfStatus);
        }
        if (source.MaintainStateId != null) {
            this.MaintainStateId = new Long(source.MaintainStateId);
        }
        if (source.OperatorStateId != null) {
            this.OperatorStateId = new Long(source.OperatorStateId);
        }
        if (source.HealthStateId != null) {
            this.HealthStateId = new String(source.HealthStateId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.NodeTypeName != null) {
            this.NodeTypeName = new String(source.NodeTypeName);
        }
        if (source.DataNodeMaintenanceId != null) {
            this.DataNodeMaintenanceId = new Long(source.DataNodeMaintenanceId);
        }
        if (source.SearchFields != null) {
            this.SearchFields = new SearchItem[source.SearchFields.length];
            for (int i = 0; i < source.SearchFields.length; i++) {
                this.SearchFields[i] = new SearchItem(source.SearchFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchText", this.SearchText);
        this.setParamSimple(map, prefix + "ConfStatus", this.ConfStatus);
        this.setParamSimple(map, prefix + "MaintainStateId", this.MaintainStateId);
        this.setParamSimple(map, prefix + "OperatorStateId", this.OperatorStateId);
        this.setParamSimple(map, prefix + "HealthStateId", this.HealthStateId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "NodeTypeName", this.NodeTypeName);
        this.setParamSimple(map, prefix + "DataNodeMaintenanceId", this.DataNodeMaintenanceId);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);

    }
}

