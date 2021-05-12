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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AmsDetailInfo extends AbstractModel{

    /**
    * 标签
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * 时长(秒/s)
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务ID，创建任务后返回的TaskId字段
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 插入时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 数据来源 0机审，其他为自主审核
    */
    @SerializedName("DataForm")
    @Expose
    private Long DataForm;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 原始命中标签
    */
    @SerializedName("OriginalLabel")
    @Expose
    private String [] OriginalLabel;

    /**
    * 操作时间
    */
    @SerializedName("OperateTime")
    @Expose
    private String OperateTime;

    /**
    * 视频原始地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 封面图地址
    */
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;

    /**
    * 短音频内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 短音频个数
    */
    @SerializedName("DetailCount")
    @Expose
    private Long DetailCount;

    /**
    * 音频审核的请求 id
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 音频机审状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 标签 
     * @return Label 标签
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
     * @param Label 标签
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get 时长(秒/s) 
     * @return Duration 时长(秒/s)
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 时长(秒/s)
     * @param Duration 时长(秒/s)
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 任务名 
     * @return Name 任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
     * @param Name 任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务ID，创建任务后返回的TaskId字段 
     * @return TaskID 任务ID，创建任务后返回的TaskId字段
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务ID，创建任务后返回的TaskId字段
     * @param TaskID 任务ID，创建任务后返回的TaskId字段
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 插入时间 
     * @return InsertTime 插入时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
     * @param InsertTime 插入时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 数据来源 0机审，其他为自主审核 
     * @return DataForm 数据来源 0机审，其他为自主审核
     */
    public Long getDataForm() {
        return this.DataForm;
    }

    /**
     * Set 数据来源 0机审，其他为自主审核
     * @param DataForm 数据来源 0机审，其他为自主审核
     */
    public void setDataForm(Long DataForm) {
        this.DataForm = DataForm;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 原始命中标签 
     * @return OriginalLabel 原始命中标签
     */
    public String [] getOriginalLabel() {
        return this.OriginalLabel;
    }

    /**
     * Set 原始命中标签
     * @param OriginalLabel 原始命中标签
     */
    public void setOriginalLabel(String [] OriginalLabel) {
        this.OriginalLabel = OriginalLabel;
    }

    /**
     * Get 操作时间 
     * @return OperateTime 操作时间
     */
    public String getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set 操作时间
     * @param OperateTime 操作时间
     */
    public void setOperateTime(String OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get 视频原始地址 
     * @return Url 视频原始地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 视频原始地址
     * @param Url 视频原始地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 封面图地址 
     * @return Thumbnail 封面图地址
     */
    public String getThumbnail() {
        return this.Thumbnail;
    }

    /**
     * Set 封面图地址
     * @param Thumbnail 封面图地址
     */
    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    /**
     * Get 短音频内容 
     * @return Content 短音频内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 短音频内容
     * @param Content 短音频内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 短音频个数 
     * @return DetailCount 短音频个数
     */
    public Long getDetailCount() {
        return this.DetailCount;
    }

    /**
     * Set 短音频个数
     * @param DetailCount 短音频个数
     */
    public void setDetailCount(Long DetailCount) {
        this.DetailCount = DetailCount;
    }

    /**
     * Get 音频审核的请求 id 
     * @return RequestId 音频审核的请求 id
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 音频审核的请求 id
     * @param RequestId 音频审核的请求 id
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 音频机审状态 
     * @return Status 音频机审状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 音频机审状态
     * @param Status 音频机审状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AmsDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AmsDetailInfo(AmsDetailInfo source) {
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.DataForm != null) {
            this.DataForm = new Long(source.DataForm);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.OriginalLabel != null) {
            this.OriginalLabel = new String[source.OriginalLabel.length];
            for (int i = 0; i < source.OriginalLabel.length; i++) {
                this.OriginalLabel[i] = new String(source.OriginalLabel[i]);
            }
        }
        if (source.OperateTime != null) {
            this.OperateTime = new String(source.OperateTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Thumbnail != null) {
            this.Thumbnail = new String(source.Thumbnail);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DetailCount != null) {
            this.DetailCount = new Long(source.DetailCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "DataForm", this.DataForm);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "OriginalLabel.", this.OriginalLabel);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Thumbnail", this.Thumbnail);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DetailCount", this.DetailCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

