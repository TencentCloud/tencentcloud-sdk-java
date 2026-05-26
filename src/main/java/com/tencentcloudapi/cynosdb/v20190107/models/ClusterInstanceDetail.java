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

public class ClusterInstanceDetail extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>引擎类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>实例状态描述</p>
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * <p>cpu核数</p>
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * <p>内存</p>
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * <p>硬盘</p>
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * <p>实例角色</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>执行开始时间(距离0点的秒数)</p>
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * <p>持续的时间(单位：秒)</p>
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * <p>serverless实例子状态</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>实例任务信息</p>
    */
    @SerializedName("InstanceTasks")
    @Expose
    private ObjectTask [] InstanceTasks;

    /**
    * <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * <p>数据库类型</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * <p>AI优化器状态</p>
    */
    @SerializedName("AIOptimizerStatus")
    @Expose
    private AIOptimizerStatus AIOptimizerStatus;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>引擎类型</p> 
     * @return InstanceType <p>引擎类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>引擎类型</p>
     * @param InstanceType <p>引擎类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例状态</p> 
     * @return InstanceStatus <p>实例状态</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态</p>
     * @param InstanceStatus <p>实例状态</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>实例状态描述</p> 
     * @return InstanceStatusDesc <p>实例状态描述</p>
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set <p>实例状态描述</p>
     * @param InstanceStatusDesc <p>实例状态描述</p>
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get <p>cpu核数</p> 
     * @return InstanceCpu <p>cpu核数</p>
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set <p>cpu核数</p>
     * @param InstanceCpu <p>cpu核数</p>
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get <p>内存</p> 
     * @return InstanceMemory <p>内存</p>
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set <p>内存</p>
     * @param InstanceMemory <p>内存</p>
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get <p>硬盘</p> 
     * @return InstanceStorage <p>硬盘</p>
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set <p>硬盘</p>
     * @param InstanceStorage <p>硬盘</p>
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get <p>实例角色</p> 
     * @return InstanceRole <p>实例角色</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例角色</p>
     * @param InstanceRole <p>实例角色</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>执行开始时间(距离0点的秒数)</p> 
     * @return MaintainStartTime <p>执行开始时间(距离0点的秒数)</p>
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set <p>执行开始时间(距离0点的秒数)</p>
     * @param MaintainStartTime <p>执行开始时间(距离0点的秒数)</p>
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get <p>持续的时间(单位：秒)</p> 
     * @return MaintainDuration <p>持续的时间(单位：秒)</p>
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set <p>持续的时间(单位：秒)</p>
     * @param MaintainDuration <p>持续的时间(单位：秒)</p>
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p> 
     * @return MaintainWeekDays <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
     * @param MaintainWeekDays <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get <p>serverless实例子状态</p> 
     * @return ServerlessStatus <p>serverless实例子状态</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>serverless实例子状态</p>
     * @param ServerlessStatus <p>serverless实例子状态</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>实例任务信息</p> 
     * @return InstanceTasks <p>实例任务信息</p>
     */
    public ObjectTask [] getInstanceTasks() {
        return this.InstanceTasks;
    }

    /**
     * Set <p>实例任务信息</p>
     * @param InstanceTasks <p>实例任务信息</p>
     */
    public void setInstanceTasks(ObjectTask [] InstanceTasks) {
        this.InstanceTasks = InstanceTasks;
    }

    /**
     * Get <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol> 
     * @return InstanceDeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     * @param InstanceDeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p> 
     * @return InstanceStorageType <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     * @param InstanceStorageType <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get <p>数据库类型</p> 
     * @return DbMode <p>数据库类型</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>数据库类型</p>
     * @param DbMode <p>数据库类型</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p> 
     * @return NodeList <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     * @param NodeList <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>AI优化器状态</p> 
     * @return AIOptimizerStatus <p>AI优化器状态</p>
     */
    public AIOptimizerStatus getAIOptimizerStatus() {
        return this.AIOptimizerStatus;
    }

    /**
     * Set <p>AI优化器状态</p>
     * @param AIOptimizerStatus <p>AI优化器状态</p>
     */
    public void setAIOptimizerStatus(AIOptimizerStatus AIOptimizerStatus) {
        this.AIOptimizerStatus = AIOptimizerStatus;
    }

    public ClusterInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstanceDetail(ClusterInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.InstanceTasks != null) {
            this.InstanceTasks = new ObjectTask[source.InstanceTasks.length];
            for (int i = 0; i < source.InstanceTasks.length; i++) {
                this.InstanceTasks[i] = new ObjectTask(source.InstanceTasks[i]);
            }
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.AIOptimizerStatus != null) {
            this.AIOptimizerStatus = new AIOptimizerStatus(source.AIOptimizerStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamArrayObj(map, prefix + "InstanceTasks.", this.InstanceTasks);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamObj(map, prefix + "AIOptimizerStatus.", this.AIOptimizerStatus);

    }
}

