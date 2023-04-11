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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunningTaskItem extends AbstractModel{

    /**
    * 应用SdkAppID
    */
    @SerializedName("SdkAppID")
    @Expose
    private Long SdkAppID;

    /**
    * 任务ID
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 任务类型
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CancelTime")
    @Expose
    private String CancelTime;

    /**
    * 任务状态
- QUEUED: 任务正在排队等待执行中
- PROCESSING: 任务正在执行中 
- FINISHED: 任务已完成
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务当前进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 转码任务中转码文件的原始URL
此参数只有任务类型为TranscodeH5、TranscodeJPG类型时才会有有效值。其他任务类型为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
    * 房间号

当任务类型为TranscodeH5、TranscodeJPG时，房间号为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomID")
    @Expose
    private Long RoomID;

    /**
     * Get 应用SdkAppID 
     * @return SdkAppID 应用SdkAppID
     */
    public Long getSdkAppID() {
        return this.SdkAppID;
    }

    /**
     * Set 应用SdkAppID
     * @param SdkAppID 应用SdkAppID
     */
    public void setSdkAppID(Long SdkAppID) {
        this.SdkAppID = SdkAppID;
    }

    /**
     * Get 任务ID 
     * @return TaskID 任务ID
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务ID
     * @param TaskID 任务ID
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 任务类型
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务 
     * @return TaskType 任务类型
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
     * @param TaskType 任务类型
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CancelTime 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCancelTime() {
        return this.CancelTime;
    }

    /**
     * Set 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CancelTime 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancelTime(String CancelTime) {
        this.CancelTime = CancelTime;
    }

    /**
     * Get 任务状态
- QUEUED: 任务正在排队等待执行中
- PROCESSING: 任务正在执行中 
- FINISHED: 任务已完成 
     * @return Status 任务状态
- QUEUED: 任务正在排队等待执行中
- PROCESSING: 任务正在执行中 
- FINISHED: 任务已完成
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
- QUEUED: 任务正在排队等待执行中
- PROCESSING: 任务正在执行中 
- FINISHED: 任务已完成
     * @param Status 任务状态
- QUEUED: 任务正在排队等待执行中
- PROCESSING: 任务正在执行中 
- FINISHED: 任务已完成
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务当前进度 
     * @return Progress 任务当前进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务当前进度
     * @param Progress 任务当前进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 转码任务中转码文件的原始URL
此参数只有任务类型为TranscodeH5、TranscodeJPG类型时才会有有效值。其他任务类型为空字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileURL 转码任务中转码文件的原始URL
此参数只有任务类型为TranscodeH5、TranscodeJPG类型时才会有有效值。其他任务类型为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set 转码任务中转码文件的原始URL
此参数只有任务类型为TranscodeH5、TranscodeJPG类型时才会有有效值。其他任务类型为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileURL 转码任务中转码文件的原始URL
此参数只有任务类型为TranscodeH5、TranscodeJPG类型时才会有有效值。其他任务类型为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    /**
     * Get 房间号

当任务类型为TranscodeH5、TranscodeJPG时，房间号为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomID 房间号

当任务类型为TranscodeH5、TranscodeJPG时，房间号为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomID() {
        return this.RoomID;
    }

    /**
     * Set 房间号

当任务类型为TranscodeH5、TranscodeJPG时，房间号为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomID 房间号

当任务类型为TranscodeH5、TranscodeJPG时，房间号为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomID(Long RoomID) {
        this.RoomID = RoomID;
    }

    public RunningTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunningTaskItem(RunningTaskItem source) {
        if (source.SdkAppID != null) {
            this.SdkAppID = new Long(source.SdkAppID);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CancelTime != null) {
            this.CancelTime = new String(source.CancelTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
        if (source.RoomID != null) {
            this.RoomID = new Long(source.RoomID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppID", this.SdkAppID);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CancelTime", this.CancelTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);
        this.setParamSimple(map, prefix + "RoomID", this.RoomID);

    }
}

