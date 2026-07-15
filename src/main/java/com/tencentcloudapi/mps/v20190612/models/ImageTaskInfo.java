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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTaskInfo extends AbstractModel {

    /**
    * <p>图片处理任务TaskId。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态。</p><p>枚举值：</p><ul><li>FINISH： 任务结束</li><li>PROCESSING： 任务处理中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>输入文件。</p>
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * <p>创建时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>开始处理时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>结束时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>子任务失败标识。</p>
    */
    @SerializedName("SubTaskHasFailed")
    @Expose
    private Boolean SubTaskHasFailed;

    /**
     * Get <p>图片处理任务TaskId。</p> 
     * @return TaskId <p>图片处理任务TaskId。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>图片处理任务TaskId。</p>
     * @param TaskId <p>图片处理任务TaskId。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态。</p><p>枚举值：</p><ul><li>FINISH： 任务结束</li><li>PROCESSING： 任务处理中</li></ul> 
     * @return Status <p>任务状态。</p><p>枚举值：</p><ul><li>FINISH： 任务结束</li><li>PROCESSING： 任务处理中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p><p>枚举值：</p><ul><li>FINISH： 任务结束</li><li>PROCESSING： 任务处理中</li></ul>
     * @param Status <p>任务状态。</p><p>枚举值：</p><ul><li>FINISH： 任务结束</li><li>PROCESSING： 任务处理中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>输入文件。</p> 
     * @return Input <p>输入文件。</p>
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set <p>输入文件。</p>
     * @param Input <p>输入文件。</p>
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get <p>创建时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return CreateTime <p>创建时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param CreateTime <p>创建时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>开始处理时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return BeginProcessTime <p>开始处理时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>开始处理时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param BeginProcessTime <p>开始处理时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>结束时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return FinishTime <p>结束时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>结束时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param FinishTime <p>结束时间。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>子任务失败标识。</p> 
     * @return SubTaskHasFailed <p>子任务失败标识。</p>
     */
    public Boolean getSubTaskHasFailed() {
        return this.SubTaskHasFailed;
    }

    /**
     * Set <p>子任务失败标识。</p>
     * @param SubTaskHasFailed <p>子任务失败标识。</p>
     */
    public void setSubTaskHasFailed(Boolean SubTaskHasFailed) {
        this.SubTaskHasFailed = SubTaskHasFailed;
    }

    public ImageTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTaskInfo(ImageTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.SubTaskHasFailed != null) {
            this.SubTaskHasFailed = new Boolean(source.SubTaskHasFailed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "SubTaskHasFailed", this.SubTaskHasFailed);

    }
}

