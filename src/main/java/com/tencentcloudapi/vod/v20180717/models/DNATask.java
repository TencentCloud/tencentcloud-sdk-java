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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNATask extends AbstractModel {

    /**
    * <p>任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态。</p><p>枚举值：</p><ul><li>WAITING： 等待中</li><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码，0 表示成功，其他值表示失败：</p><p>40000：输入参数不合法，请检查输入参数；<br>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；<br>70000：内部服务错误，建议重试。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">视频处理类错误码</a> 列表。</p>
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>被检测的媒资 FileId。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>查重命中列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private DNATaskOutput [] Output;

    /**
     * Get <p>任务 ID。</p> 
     * @return TaskId <p>任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID。</p>
     * @param TaskId <p>任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态。</p><p>枚举值：</p><ul><li>WAITING： 等待中</li><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul> 
     * @return Status <p>任务状态。</p><p>枚举值：</p><ul><li>WAITING： 等待中</li><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p><p>枚举值：</p><ul><li>WAITING： 等待中</li><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
     * @param Status <p>任务状态。</p><p>枚举值：</p><ul><li>WAITING： 等待中</li><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码，0 表示成功，其他值表示失败：</p><p>40000：输入参数不合法，请检查输入参数；<br>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；<br>70000：内部服务错误，建议重试。</p> 
     * @return ErrCode <p>错误码，0 表示成功，其他值表示失败：</p><p>40000：输入参数不合法，请检查输入参数；<br>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；<br>70000：内部服务错误，建议重试。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码，0 表示成功，其他值表示失败：</p><p>40000：输入参数不合法，请检查输入参数；<br>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；<br>70000：内部服务错误，建议重试。</p>
     * @param ErrCode <p>错误码，0 表示成功，其他值表示失败：</p><p>40000：输入参数不合法，请检查输入参数；<br>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；<br>70000：内部服务错误，建议重试。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">视频处理类错误码</a> 列表。</p> 
     * @return ErrCodeExt <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">视频处理类错误码</a> 列表。</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">视频处理类错误码</a> 列表。</p>
     * @param ErrCodeExt <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">视频处理类错误码</a> 列表。</p>
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>被检测的媒资 FileId。</p> 
     * @return FileId <p>被检测的媒资 FileId。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>被检测的媒资 FileId。</p>
     * @param FileId <p>被检测的媒资 FileId。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>查重命中列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output <p>查重命中列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DNATaskOutput [] getOutput() {
        return this.Output;
    }

    /**
     * Set <p>查重命中列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output <p>查重命中列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(DNATaskOutput [] Output) {
        this.Output = Output;
    }

    public DNATask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNATask(DNATask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Output != null) {
            this.Output = new DNATaskOutput[source.Output.length];
            for (int i = 0; i < source.Output.length; i++) {
                this.Output[i] = new DNATaskOutput(source.Output[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamArrayObj(map, prefix + "Output.", this.Output);

    }
}

