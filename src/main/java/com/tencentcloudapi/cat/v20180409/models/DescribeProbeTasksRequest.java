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

public class DescribeProbeTasksRequest extends AbstractModel {

    /**
    * <p>任务 ID  列表</p>
    */
    @SerializedName("TaskIDs")
    @Expose
    private String [] TaskIDs;

    /**
    * <p>任务名</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>拨测目标</p>
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * <p>任务状态列表</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
    * <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即使拨测只支持页面浏览，网络质量，文件下载</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long [] TaskType;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long [] TaskCategory;

    /**
    * <p>排序的列</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>是否正序</p>
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * <p>资源标签值</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private KeyValuePair [] TagFilters;

    /**
     * Get <p>任务 ID  列表</p> 
     * @return TaskIDs <p>任务 ID  列表</p>
     */
    public String [] getTaskIDs() {
        return this.TaskIDs;
    }

    /**
     * Set <p>任务 ID  列表</p>
     * @param TaskIDs <p>任务 ID  列表</p>
     */
    public void setTaskIDs(String [] TaskIDs) {
        this.TaskIDs = TaskIDs;
    }

    /**
     * Get <p>任务名</p> 
     * @return TaskName <p>任务名</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名</p>
     * @param TaskName <p>任务名</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>拨测目标</p> 
     * @return TargetAddress <p>拨测目标</p>
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set <p>拨测目标</p>
     * @param TargetAddress <p>拨测目标</p>
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get <p>任务状态列表</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li> 
     * @return TaskStatus <p>任务状态列表</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态列表</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
     * @param TaskStatus <p>任务状态列表</p><li>1 = 创建中</li><li> 2 = 运行中 </li><li> 3 = 运行异常 </li><li> 4 = 暂停中 </li><li> 5 = 暂停异常 </li><li> 6 = 任务暂停 </li><li> 7 = 任务删除中 </li><li> 8 = 任务删除异常 </li><li> 9 = 任务删除</li><li> 10 = 定时任务暂停中 </li>
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100</p>
     * @param Limit <p>返回数量，默认为20，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即使拨测只支持页面浏览，网络质量，文件下载</p> 
     * @return TaskType <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即使拨测只支持页面浏览，网络质量，文件下载</p>
     */
    public Long [] getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即使拨测只支持页面浏览，网络质量，文件下载</p>
     * @param TaskType <p>拨测类型</p><li>1 = 页面浏览</li><li> 2 =文件上传 </li><li> 3 = 文件下载</li><li> 4 = 端口性能 </li><li> 5 = 网络质量 </li><li> 6 =流媒体 </li><p>即使拨测只支持页面浏览，网络质量，文件下载</p>
     */
    public void setTaskType(Long [] TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>节点类型</p> 
     * @return TaskCategory <p>节点类型</p>
     */
    public Long [] getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set <p>节点类型</p>
     * @param TaskCategory <p>节点类型</p>
     */
    public void setTaskCategory(Long [] TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get <p>排序的列</p> 
     * @return OrderBy <p>排序的列</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序的列</p>
     * @param OrderBy <p>排序的列</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>是否正序</p> 
     * @return Ascend <p>是否正序</p>
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set <p>是否正序</p>
     * @param Ascend <p>是否正序</p>
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get <p>资源标签值</p> 
     * @return TagFilters <p>资源标签值</p>
     */
    public KeyValuePair [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>资源标签值</p>
     * @param TagFilters <p>资源标签值</p>
     */
    public void setTagFilters(KeyValuePair [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeProbeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProbeTasksRequest(DescribeProbeTasksRequest source) {
        if (source.TaskIDs != null) {
            this.TaskIDs = new String[source.TaskIDs.length];
            for (int i = 0; i < source.TaskIDs.length; i++) {
                this.TaskIDs[i] = new String(source.TaskIDs[i]);
            }
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.OrderState != null) {
            this.OrderState = new Long(source.OrderState);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long[source.TaskType.length];
            for (int i = 0; i < source.TaskType.length; i++) {
                this.TaskType[i] = new Long(source.TaskType[i]);
            }
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long[source.TaskCategory.length];
            for (int i = 0; i < source.TaskCategory.length; i++) {
                this.TaskCategory[i] = new Long(source.TaskCategory[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new KeyValuePair[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new KeyValuePair(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIDs.", this.TaskIDs);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamArraySimple(map, prefix + "TaskType.", this.TaskType);
        this.setParamArraySimple(map, prefix + "TaskCategory.", this.TaskCategory);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

