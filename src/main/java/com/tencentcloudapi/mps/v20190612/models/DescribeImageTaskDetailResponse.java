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

public class DescribeImageTaskDetailResponse extends AbstractModel {

    /**
    * <p>任务类型，目前取值有：</p><li>WorkflowTask：工作流处理任务。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务失败时的错误码。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>任务异常Message。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>图片处理任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageProcessTaskResultSet")
    @Expose
    private ImageProcessTaskResult [] ImageProcessTaskResultSet;

    /**
    * <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>任务发起参数。</p>
    */
    @SerializedName("ImageTask")
    @Expose
    private ImageTaskInput ImageTask;

    /**
    * <p>图片任务输入信息。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务类型，目前取值有：</p><li>WorkflowTask：工作流处理任务。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务类型，目前取值有：</p><li>WorkflowTask：工作流处理任务。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，目前取值有：</p><li>WorkflowTask：工作流处理任务。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型，目前取值有：</p><li>WorkflowTask：工作流处理任务。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务失败时的错误码。</p> 
     * @return ErrCode <p>任务失败时的错误码。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>任务失败时的错误码。</p>
     * @param ErrCode <p>任务失败时的错误码。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p> 
     * @return ErrMsg <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     * @param ErrMsg <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>任务异常Message。</p> 
     * @return Message <p>任务异常Message。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>任务异常Message。</p>
     * @param Message <p>任务异常Message。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>图片处理任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageProcessTaskResultSet <p>图片处理任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageProcessTaskResult [] getImageProcessTaskResultSet() {
        return this.ImageProcessTaskResultSet;
    }

    /**
     * Set <p>图片处理任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageProcessTaskResultSet <p>图片处理任务的执行状态与结果。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageProcessTaskResultSet(ImageProcessTaskResult [] ImageProcessTaskResultSet) {
        this.ImageProcessTaskResultSet = ImageProcessTaskResultSet;
    }

    /**
     * Get <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    /**
     * Get <p>模板唯一标识。</p> 
     * @return Definition <p>模板唯一标识。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>模板唯一标识。</p>
     * @param Definition <p>模板唯一标识。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>任务发起参数。</p> 
     * @return ImageTask <p>任务发起参数。</p>
     */
    public ImageTaskInput getImageTask() {
        return this.ImageTask;
    }

    /**
     * Set <p>任务发起参数。</p>
     * @param ImageTask <p>任务发起参数。</p>
     */
    public void setImageTask(ImageTaskInput ImageTask) {
        this.ImageTask = ImageTask;
    }

    /**
     * Get <p>图片任务输入信息。</p> 
     * @return InputInfo <p>图片任务输入信息。</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>图片任务输入信息。</p>
     * @param InputInfo <p>图片任务输入信息。</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageTaskDetailResponse(DescribeImageTaskDetailResponse source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ImageProcessTaskResultSet != null) {
            this.ImageProcessTaskResultSet = new ImageProcessTaskResult[source.ImageProcessTaskResultSet.length];
            for (int i = 0; i < source.ImageProcessTaskResultSet.length; i++) {
                this.ImageProcessTaskResultSet[i] = new ImageProcessTaskResult(source.ImageProcessTaskResultSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ImageTask != null) {
            this.ImageTask = new ImageTaskInput(source.ImageTask);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "ImageProcessTaskResultSet.", this.ImageProcessTaskResultSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "ImageTask.", this.ImageTask);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

