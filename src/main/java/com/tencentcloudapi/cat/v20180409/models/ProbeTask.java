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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeTask extends AbstractModel {

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 拨测类型
<li>1 = 页面浏览</li>
<li> 2 =文件上传 </li>
<li> 3 = 文件下载</li>
<li> 4 = 端口性能 </li>
<li> 5 = 网络质量 </li>
<li> 6 =流媒体 </li>

即时拨测只支持页面浏览，网络质量，文件下载
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 拨测节点列表
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
    * 拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIpType")
    @Expose
    private Long NodeIpType;

    /**
    * 拨测间隔，单位为分钟
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 拨测参数
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 任务状态
<li>1 = 创建中</li>
<li> 2 = 运行中 </li>
<li> 3 = 运行异常 </li>
<li> 4 = 暂停中 </li>
<li> 5 = 暂停异常 </li>
<li> 6 = 任务暂停 </li>
<li> 7 = 任务删除中 </li>
<li> 8 = 任务删除异常 </li>
<li> 9 = 任务删除</li>
<li> 10 = 定时任务暂停中 </li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 目标地址
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
    */
    @SerializedName("OrderState")
    @Expose
    private Long OrderState;

    /**
    * 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 定时任务cron表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * 定时任务启动状态
<li>1 = 定时任务表达式生效</li>
<li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronState")
    @Expose
    private Long CronState;

    /**
    * 任务当前绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInfoList")
    @Expose
    private KeyValuePair [] TagInfoList;

    /**
    * 是否为同步账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubSyncFlag")
    @Expose
    private Long SubSyncFlag;

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务 ID 
     * @return TaskId 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID
     * @param TaskId 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 拨测类型
<li>1 = 页面浏览</li>
<li> 2 =文件上传 </li>
<li> 3 = 文件下载</li>
<li> 4 = 端口性能 </li>
<li> 5 = 网络质量 </li>
<li> 6 =流媒体 </li>

即时拨测只支持页面浏览，网络质量，文件下载 
     * @return TaskType 拨测类型
<li>1 = 页面浏览</li>
<li> 2 =文件上传 </li>
<li> 3 = 文件下载</li>
<li> 4 = 端口性能 </li>
<li> 5 = 网络质量 </li>
<li> 6 =流媒体 </li>

即时拨测只支持页面浏览，网络质量，文件下载
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 拨测类型
<li>1 = 页面浏览</li>
<li> 2 =文件上传 </li>
<li> 3 = 文件下载</li>
<li> 4 = 端口性能 </li>
<li> 5 = 网络质量 </li>
<li> 6 =流媒体 </li>

即时拨测只支持页面浏览，网络质量，文件下载
     * @param TaskType 拨测类型
<li>1 = 页面浏览</li>
<li> 2 =文件上传 </li>
<li> 3 = 文件下载</li>
<li> 4 = 端口性能 </li>
<li> 5 = 网络质量 </li>
<li> 6 =流媒体 </li>

即时拨测只支持页面浏览，网络质量，文件下载
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 拨测节点列表 
     * @return Nodes 拨测节点列表
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 拨测节点列表
     * @param Nodes 拨测节点列表
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIpType 拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeIpType() {
        return this.NodeIpType;
    }

    /**
     * Set 拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIpType 拨测任务所选的拨测点IP类型，0-不限，1-IPv4，2-IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIpType(Long NodeIpType) {
        this.NodeIpType = NodeIpType;
    }

    /**
     * Get 拨测间隔，单位为分钟 
     * @return Interval 拨测间隔，单位为分钟
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 拨测间隔，单位为分钟
     * @param Interval 拨测间隔，单位为分钟
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 拨测参数 
     * @return Parameters 拨测参数
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 拨测参数
     * @param Parameters 拨测参数
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 任务状态
<li>1 = 创建中</li>
<li> 2 = 运行中 </li>
<li> 3 = 运行异常 </li>
<li> 4 = 暂停中 </li>
<li> 5 = 暂停异常 </li>
<li> 6 = 任务暂停 </li>
<li> 7 = 任务删除中 </li>
<li> 8 = 任务删除异常 </li>
<li> 9 = 任务删除</li>
<li> 10 = 定时任务暂停中 </li> 
     * @return Status 任务状态
<li>1 = 创建中</li>
<li> 2 = 运行中 </li>
<li> 3 = 运行异常 </li>
<li> 4 = 暂停中 </li>
<li> 5 = 暂停异常 </li>
<li> 6 = 任务暂停 </li>
<li> 7 = 任务删除中 </li>
<li> 8 = 任务删除异常 </li>
<li> 9 = 任务删除</li>
<li> 10 = 定时任务暂停中 </li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
<li>1 = 创建中</li>
<li> 2 = 运行中 </li>
<li> 3 = 运行异常 </li>
<li> 4 = 暂停中 </li>
<li> 5 = 暂停异常 </li>
<li> 6 = 任务暂停 </li>
<li> 7 = 任务删除中 </li>
<li> 8 = 任务删除异常 </li>
<li> 9 = 任务删除</li>
<li> 10 = 定时任务暂停中 </li>
     * @param Status 任务状态
<li>1 = 创建中</li>
<li> 2 = 运行中 </li>
<li> 3 = 运行异常 </li>
<li> 4 = 暂停中 </li>
<li> 5 = 暂停异常 </li>
<li> 6 = 任务暂停 </li>
<li> 7 = 任务删除中 </li>
<li> 8 = 任务删除异常 </li>
<li> 9 = 任务删除</li>
<li> 10 = 定时任务暂停中 </li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 目标地址 
     * @return TargetAddress 目标地址
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set 目标地址
     * @param TargetAddress 目标地址
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li> 
     * @return PayMode 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     * @param PayMode 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li> 
     * @return OrderState 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
     */
    public Long getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
     * @param OrderState 订单状态
<li>1 = 正常</li>
<li> 2 = 欠费 </li>
     */
    public void setOrderState(Long OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li> 
     * @return TaskCategory 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
     * @param TaskCategory 任务分类
<li>1 = PC</li>
<li> 2 = Mobile </li>
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 定时任务cron表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cron 定时任务cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set 定时任务cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cron 定时任务cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get 定时任务启动状态
<li>1 = 定时任务表达式生效</li>
<li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronState 定时任务启动状态
<li>1 = 定时任务表达式生效</li>
<li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCronState() {
        return this.CronState;
    }

    /**
     * Set 定时任务启动状态
<li>1 = 定时任务表达式生效</li>
<li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronState 定时任务启动状态
<li>1 = 定时任务表达式生效</li>
<li> 2 = 定时任务表达式未生效（一般为任务手动暂停）</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronState(Long CronState) {
        this.CronState = CronState;
    }

    /**
     * Get 任务当前绑定的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInfoList 任务当前绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValuePair [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set 任务当前绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInfoList 任务当前绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInfoList(KeyValuePair [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get 是否为同步账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubSyncFlag 是否为同步账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubSyncFlag() {
        return this.SubSyncFlag;
    }

    /**
     * Set 是否为同步账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubSyncFlag 是否为同步账号
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

