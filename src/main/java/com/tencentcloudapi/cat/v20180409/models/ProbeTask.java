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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeTask extends AbstractModel {

    /**
    * <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即时拨测只支持页面浏览，网络质量，文件下载</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>拨测节点列表</p>
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
    * <p>拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIpType")
    @Expose
    private Long NodeIpType;

    /**
    * <p>拨测间隔，单位为分钟</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>拨测参数</p>
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * <p>任务状态</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>目标地址</p>
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * <p>付费模式</p><li>1 = 试用版本</li><li> 2 = 付费版本 </li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>订单状态</p><li>1 = 正常</li><li> 2 = 欠费 </li>
    */
    @SerializedName("OrderState")
    @Expose
    private Long OrderState;

    /**
    * <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>定时任务cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * <p>定时任务启动状态</p><li>1 = 定时任务表达式生效</li><li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronState")
    @Expose
    private Long CronState;

    /**
    * <p>任务当前绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInfoList")
    @Expose
    private KeyValuePair [] TagInfoList;

    /**
    * <p>是否为同步账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubSyncFlag")
    @Expose
    private Long SubSyncFlag;

    /**
     * Get <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即时拨测只支持页面浏览，网络质量，文件下载</p> 
     * @return TaskType <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即时拨测只支持页面浏览，网络质量，文件下载</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即时拨测只支持页面浏览，网络质量，文件下载</p>
     * @param TaskType <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即时拨测只支持页面浏览，网络质量，文件下载</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>拨测节点列表</p> 
     * @return Nodes <p>拨测节点列表</p>
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>拨测节点列表</p>
     * @param Nodes <p>拨测节点列表</p>
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIpType <p>拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeIpType() {
        return this.NodeIpType;
    }

    /**
     * Set <p>拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIpType <p>拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIpType(Long NodeIpType) {
        this.NodeIpType = NodeIpType;
    }

    /**
     * Get <p>拨测间隔，单位为分钟</p> 
     * @return Interval <p>拨测间隔，单位为分钟</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>拨测间隔，单位为分钟</p>
     * @param Interval <p>拨测间隔，单位为分钟</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>拨测参数</p> 
     * @return Parameters <p>拨测参数</p>
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>拨测参数</p>
     * @param Parameters <p>拨测参数</p>
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get <p>任务状态</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li> 
     * @return Status <p>任务状态</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
     * @param Status <p>任务状态</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>目标地址</p> 
     * @return TargetAddress <p>目标地址</p>
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set <p>目标地址</p>
     * @param TargetAddress <p>目标地址</p>
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get <p>付费模式</p><li>1 = 试用版本</li><li> 2 = 付费版本 </li> 
     * @return PayMode <p>付费模式</p><li>1 = 试用版本</li><li> 2 = 付费版本 </li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p><li>1 = 试用版本</li><li> 2 = 付费版本 </li>
     * @param PayMode <p>付费模式</p><li>1 = 试用版本</li><li> 2 = 付费版本 </li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>订单状态</p><li>1 = 正常</li><li> 2 = 欠费 </li> 
     * @return OrderState <p>订单状态</p><li>1 = 正常</li><li> 2 = 欠费 </li>
     */
    public Long getOrderState() {
        return this.OrderState;
    }

    /**
     * Set <p>订单状态</p><li>1 = 正常</li><li> 2 = 欠费 </li>
     * @param OrderState <p>订单状态</p><li>1 = 正常</li><li> 2 = 欠费 </li>
     */
    public void setOrderState(Long OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li> 
     * @return TaskCategory <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
     * @param TaskCategory <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>定时任务cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cron <p>定时任务cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set <p>定时任务cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cron <p>定时任务cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get <p>定时任务启动状态</p><li>1 = 定时任务表达式生效</li><li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronState <p>定时任务启动状态</p><li>1 = 定时任务表达式生效</li><li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCronState() {
        return this.CronState;
    }

    /**
     * Set <p>定时任务启动状态</p><li>1 = 定时任务表达式生效</li><li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronState <p>定时任务启动状态</p><li>1 = 定时任务表达式生效</li><li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronState(Long CronState) {
        this.CronState = CronState;
    }

    /**
     * Get <p>任务当前绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInfoList <p>任务当前绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValuePair [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set <p>任务当前绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInfoList <p>任务当前绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInfoList(KeyValuePair [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get <p>是否为同步账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubSyncFlag <p>是否为同步账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubSyncFlag() {
        return this.SubSyncFlag;
    }

    /**
     * Set <p>是否为同步账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubSyncFlag <p>是否为同步账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubSyncFlag(Long SubSyncFlag) {
        this.SubSyncFlag = SubSyncFlag;
    }

    public ProbeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeTask(ProbeTask source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Nodes != null) {
            this.Nodes = new String[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new String(source.Nodes[i]);
            }
        }
        if (source.NodeIpType != null) {
            this.NodeIpType = new Long(source.NodeIpType);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.OrderState != null) {
            this.OrderState = new Long(source.OrderState);
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long(source.TaskCategory);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.CronState != null) {
            this.CronState = new Long(source.CronState);
        }
        if (source.TagInfoList != null) {
            this.TagInfoList = new KeyValuePair[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new KeyValuePair(source.TagInfoList[i]);
            }
        }
        if (source.SubSyncFlag != null) {
            this.SubSyncFlag = new Long(source.SubSyncFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "NodeIpType", this.NodeIpType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamSimple(map, prefix + "TaskCategory", this.TaskCategory);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamSimple(map, prefix + "CronState", this.CronState);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamSimple(map, prefix + "SubSyncFlag", this.SubSyncFlag);

    }
}

