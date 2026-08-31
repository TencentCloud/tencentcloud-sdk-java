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

public class MediaProcessTaskAdaptiveDynamicStreamingResult extends AbstractModel {

    /**
    * <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * <p>错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>对视频转自适应码流任务的输入。</p>
    */
    @SerializedName("Input")
    @Expose
    private AdaptiveDynamicStreamingTaskInput Input;

    /**
    * <p>对视频转自适应码流任务的输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private AdaptiveDynamicStreamingInfoItem Output;

    /**
    * <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p> 
     * @return Status <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p>
     * @param Status <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p> 
     * @return ErrCodeExt <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     * @param ErrCodeExt <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get <p>错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。</p> 
     * @return ErrCode <p>错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。</p>
     * @param ErrCode <p>错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
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
     * Get <p>对视频转自适应码流任务的输入。</p> 
     * @return Input <p>对视频转自适应码流任务的输入。</p>
     */
    public AdaptiveDynamicStreamingTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>对视频转自适应码流任务的输入。</p>
     * @param Input <p>对视频转自适应码流任务的输入。</p>
     */
    public void setInput(AdaptiveDynamicStreamingTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>对视频转自适应码流任务的输出。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output <p>对视频转自适应码流任务的输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdaptiveDynamicStreamingInfoItem getOutput() {
        return this.Output;
    }

    /**
     * Set <p>对视频转自适应码流任务的输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output <p>对视频转自适应码流任务的输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(AdaptiveDynamicStreamingInfoItem Output) {
        this.Output = Output;
    }

    /**
     * Get <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginProcessTime <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginProcessTime <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public MediaProcessTaskAdaptiveDynamicStreamingResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult(MediaProcessTaskAdaptiveDynamicStreamingResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AdaptiveDynamicStreamingTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AdaptiveDynamicStreamingInfoItem(source.Output);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

