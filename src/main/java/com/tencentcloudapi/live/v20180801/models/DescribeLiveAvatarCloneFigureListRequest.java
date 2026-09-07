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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveAvatarCloneFigureListRequest extends AbstractModel {

    /**
    * <p>待查询的克隆形象的TaskId</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>根据状态查询克隆形象</p><p>枚举值：</p><ul><li>SUBMITTING： 已受理</li><li>CHECKING： 检查中</li><li>QUEUE： 排队中</li><li>MAKING： 训练中</li><li>CONFIRMING： 效果确认</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>期望返回克隆形象的个数（最多20个）</p>
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * <p>期望返回克隆形象的起始偏移位置（默认为0）</p>
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
     * Get <p>待查询的克隆形象的TaskId</p> 
     * @return TaskId <p>待查询的克隆形象的TaskId</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>待查询的克隆形象的TaskId</p>
     * @param TaskId <p>待查询的克隆形象的TaskId</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>根据状态查询克隆形象</p><p>枚举值：</p><ul><li>SUBMITTING： 已受理</li><li>CHECKING： 检查中</li><li>QUEUE： 排队中</li><li>MAKING： 训练中</li><li>CONFIRMING： 效果确认</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul> 
     * @return Status <p>根据状态查询克隆形象</p><p>枚举值：</p><ul><li>SUBMITTING： 已受理</li><li>CHECKING： 检查中</li><li>QUEUE： 排队中</li><li>MAKING： 训练中</li><li>CONFIRMING： 效果确认</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>根据状态查询克隆形象</p><p>枚举值：</p><ul><li>SUBMITTING： 已受理</li><li>CHECKING： 检查中</li><li>QUEUE： 排队中</li><li>MAKING： 训练中</li><li>CONFIRMING： 效果确认</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
     * @param Status <p>根据状态查询克隆形象</p><p>枚举值：</p><ul><li>SUBMITTING： 已受理</li><li>CHECKING： 检查中</li><li>QUEUE： 排队中</li><li>MAKING： 训练中</li><li>CONFIRMING： 效果确认</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>期望返回克隆形象的个数（最多20个）</p> 
     * @return Limit <p>期望返回克隆形象的个数（最多20个）</p>
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>期望返回克隆形象的个数（最多20个）</p>
     * @param Limit <p>期望返回克隆形象的个数（最多20个）</p>
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>期望返回克隆形象的起始偏移位置（默认为0）</p> 
     * @return Offset <p>期望返回克隆形象的起始偏移位置（默认为0）</p>
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>期望返回克隆形象的起始偏移位置（默认为0）</p>
     * @param Offset <p>期望返回克隆形象的起始偏移位置（默认为0）</p>
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    public DescribeLiveAvatarCloneFigureListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveAvatarCloneFigureListRequest(DescribeLiveAvatarCloneFigureListRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

