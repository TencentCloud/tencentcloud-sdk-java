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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanResult extends AbstractModel{

    /**
    * 业务返回码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 数据唯一 ID
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 检测完成的时间戳
    */
    @SerializedName("ScanFinishTime")
    @Expose
    private Long ScanFinishTime;

    /**
    * 是否违规
    */
    @SerializedName("HitFlag")
    @Expose
    private Boolean HitFlag;

    /**
    * 是否为流
    */
    @SerializedName("Live")
    @Expose
    private Boolean Live;

    /**
    * 业务返回描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 检测结果，Code 为 0 时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanPiece")
    @Expose
    private ScanPiece [] ScanPiece;

    /**
    * 提交检测的时间戳
    */
    @SerializedName("ScanStartTime")
    @Expose
    private Long ScanStartTime;

    /**
    * 语音检测场景，对应请求时的 Scene
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * 语音检测任务 ID，由后台分配
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 文件或接流地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 检测任务执行结果状态，分别为：
<li>Start: 任务开始</li>
<li>Success: 成功结束</li>
<li>Error: 异常</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 业务返回码 
     * @return Code 业务返回码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 业务返回码
     * @param Code 业务返回码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 数据唯一 ID 
     * @return DataId 数据唯一 ID
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 数据唯一 ID
     * @param DataId 数据唯一 ID
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 检测完成的时间戳 
     * @return ScanFinishTime 检测完成的时间戳
     */
    public Long getScanFinishTime() {
        return this.ScanFinishTime;
    }

    /**
     * Set 检测完成的时间戳
     * @param ScanFinishTime 检测完成的时间戳
     */
    public void setScanFinishTime(Long ScanFinishTime) {
        this.ScanFinishTime = ScanFinishTime;
    }

    /**
     * Get 是否违规 
     * @return HitFlag 是否违规
     */
    public Boolean getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 是否违规
     * @param HitFlag 是否违规
     */
    public void setHitFlag(Boolean HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 是否为流 
     * @return Live 是否为流
     */
    public Boolean getLive() {
        return this.Live;
    }

    /**
     * Set 是否为流
     * @param Live 是否为流
     */
    public void setLive(Boolean Live) {
        this.Live = Live;
    }

    /**
     * Get 业务返回描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 业务返回描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 业务返回描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 业务返回描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 检测结果，Code 为 0 时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanPiece 检测结果，Code 为 0 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScanPiece [] getScanPiece() {
        return this.ScanPiece;
    }

    /**
     * Set 检测结果，Code 为 0 时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanPiece 检测结果，Code 为 0 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanPiece(ScanPiece [] ScanPiece) {
        this.ScanPiece = ScanPiece;
    }

    /**
     * Get 提交检测的时间戳 
     * @return ScanStartTime 提交检测的时间戳
     */
    public Long getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set 提交检测的时间戳
     * @param ScanStartTime 提交检测的时间戳
     */
    public void setScanStartTime(Long ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get 语音检测场景，对应请求时的 Scene 
     * @return Scenes 语音检测场景，对应请求时的 Scene
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set 语音检测场景，对应请求时的 Scene
     * @param Scenes 语音检测场景，对应请求时的 Scene
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get 语音检测任务 ID，由后台分配 
     * @return TaskId 语音检测任务 ID，由后台分配
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 语音检测任务 ID，由后台分配
     * @param TaskId 语音检测任务 ID，由后台分配
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 文件或接流地址 
     * @return Url 文件或接流地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件或接流地址
     * @param Url 文件或接流地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 检测任务执行结果状态，分别为：
<li>Start: 任务开始</li>
<li>Success: 成功结束</li>
<li>Error: 异常</li> 
     * @return Status 检测任务执行结果状态，分别为：
<li>Start: 任务开始</li>
<li>Success: 成功结束</li>
<li>Error: 异常</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 检测任务执行结果状态，分别为：
<li>Start: 任务开始</li>
<li>Success: 成功结束</li>
<li>Error: 异常</li>
     * @param Status 检测任务执行结果状态，分别为：
<li>Start: 任务开始</li>
<li>Success: 成功结束</li>
<li>Error: 异常</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "ScanFinishTime", this.ScanFinishTime);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Live", this.Live);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamArrayObj(map, prefix + "ScanPiece.", this.ScanPiece);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

