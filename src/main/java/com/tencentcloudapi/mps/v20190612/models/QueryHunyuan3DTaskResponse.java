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

public class QueryHunyuan3DTaskResponse extends AbstractModel {

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>仅 Status=FAIL 时有值，详细文案</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>仅 Status=DONE 时有值，产物文件列表</p>
    */
    @SerializedName("ResultFile3Ds")
    @Expose
    private File3D [] ResultFile3Ds;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务类型</p><p>枚举值：</p><ul><li>text_to_3d： 文生3D</li><li>image_to_3d： 图生3D</li><li>multiview_to_3d： 多视图生3D</li><li>mesh_to_texture： 网格生纹理</li><li>mesh_to_geometry： 网格生几何</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>输入的Prompt</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>图生3D场景下输入的图片URL</p>
    */
    @SerializedName("RefImage")
    @Expose
    private String RefImage;

    /**
    * <p>多图生3D场景下输入的图片信息</p>
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>提交任务的目标面数</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>任务在队列中的位置，数值越小越靠前；</p>
    */
    @SerializedName("QueuePosition")
    @Expose
    private Long QueuePosition;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p> 
     * @return Progress <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
     * @param Progress <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p> 
     * @return ErrorCode <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
     * @param ErrorCode <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>仅 Status=FAIL 时有值，详细文案</p> 
     * @return ErrorMessage <p>仅 Status=FAIL 时有值，详细文案</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>仅 Status=FAIL 时有值，详细文案</p>
     * @param ErrorMessage <p>仅 Status=FAIL 时有值，详细文案</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>仅 Status=DONE 时有值，产物文件列表</p> 
     * @return ResultFile3Ds <p>仅 Status=DONE 时有值，产物文件列表</p>
     */
    public File3D [] getResultFile3Ds() {
        return this.ResultFile3Ds;
    }

    /**
     * Set <p>仅 Status=DONE 时有值，产物文件列表</p>
     * @param ResultFile3Ds <p>仅 Status=DONE 时有值，产物文件列表</p>
     */
    public void setResultFile3Ds(File3D [] ResultFile3Ds) {
        this.ResultFile3Ds = ResultFile3Ds;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务类型</p><p>枚举值：</p><ul><li>text_to_3d： 文生3D</li><li>image_to_3d： 图生3D</li><li>multiview_to_3d： 多视图生3D</li><li>mesh_to_texture： 网格生纹理</li><li>mesh_to_geometry： 网格生几何</li></ul> 
     * @return TaskType <p>任务类型</p><p>枚举值：</p><ul><li>text_to_3d： 文生3D</li><li>image_to_3d： 图生3D</li><li>multiview_to_3d： 多视图生3D</li><li>mesh_to_texture： 网格生纹理</li><li>mesh_to_geometry： 网格生几何</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p><p>枚举值：</p><ul><li>text_to_3d： 文生3D</li><li>image_to_3d： 图生3D</li><li>multiview_to_3d： 多视图生3D</li><li>mesh_to_texture： 网格生纹理</li><li>mesh_to_geometry： 网格生几何</li></ul>
     * @param TaskType <p>任务类型</p><p>枚举值：</p><ul><li>text_to_3d： 文生3D</li><li>image_to_3d： 图生3D</li><li>multiview_to_3d： 多视图生3D</li><li>mesh_to_texture： 网格生纹理</li><li>mesh_to_geometry： 网格生几何</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>输入的Prompt</p> 
     * @return Prompt <p>输入的Prompt</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>输入的Prompt</p>
     * @param Prompt <p>输入的Prompt</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>图生3D场景下输入的图片URL</p> 
     * @return RefImage <p>图生3D场景下输入的图片URL</p>
     */
    public String getRefImage() {
        return this.RefImage;
    }

    /**
     * Set <p>图生3D场景下输入的图片URL</p>
     * @param RefImage <p>图生3D场景下输入的图片URL</p>
     */
    public void setRefImage(String RefImage) {
        this.RefImage = RefImage;
    }

    /**
     * Get <p>多图生3D场景下输入的图片信息</p> 
     * @return MultiViewImages <p>多图生3D场景下输入的图片信息</p>
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set <p>多图生3D场景下输入的图片信息</p>
     * @param MultiViewImages <p>多图生3D场景下输入的图片信息</p>
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务更新时间</p> 
     * @return UpdateTime <p>任务更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务更新时间</p>
     * @param UpdateTime <p>任务更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>提交任务的目标面数</p> 
     * @return FaceCount <p>提交任务的目标面数</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>提交任务的目标面数</p>
     * @param FaceCount <p>提交任务的目标面数</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p> 
     * @return GenerateType <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
     * @param GenerateType <p>生成类型</p><p>枚举值：</p><ul><li>Normal： 生成完整 3D 资产（几何 + 纹理）</li><li>Geometry： 只生成几何体（无纹理，输出速度更快）</li><li>Texture： 只生成纹理（需要传 MeshUrl）</li></ul><p>默认值：Normal</p>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>任务在队列中的位置，数值越小越靠前；</p> 
     * @return QueuePosition <p>任务在队列中的位置，数值越小越靠前；</p>
     */
    public Long getQueuePosition() {
        return this.QueuePosition;
    }

    /**
     * Set <p>任务在队列中的位置，数值越小越靠前；</p>
     * @param QueuePosition <p>任务在队列中的位置，数值越小越靠前；</p>
     */
    public void setQueuePosition(Long QueuePosition) {
        this.QueuePosition = QueuePosition;
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

    public QueryHunyuan3DTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryHunyuan3DTaskResponse(QueryHunyuan3DTaskResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultFile3Ds != null) {
            this.ResultFile3Ds = new File3D[source.ResultFile3Ds.length];
            for (int i = 0; i < source.ResultFile3Ds.length; i++) {
                this.ResultFile3Ds[i] = new File3D(source.ResultFile3Ds[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.RefImage != null) {
            this.RefImage = new String(source.RefImage);
        }
        if (source.MultiViewImages != null) {
            this.MultiViewImages = new ViewImage[source.MultiViewImages.length];
            for (int i = 0; i < source.MultiViewImages.length; i++) {
                this.MultiViewImages[i] = new ViewImage(source.MultiViewImages[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.QueuePosition != null) {
            this.QueuePosition = new Long(source.QueuePosition);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "ResultFile3Ds.", this.ResultFile3Ds);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "RefImage", this.RefImage);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "QueuePosition", this.QueuePosition);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

