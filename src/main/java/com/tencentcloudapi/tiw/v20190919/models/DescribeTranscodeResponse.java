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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTranscodeResponse extends AbstractModel {

    /**
    * 文档的总页数
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 转码的当前进度,取值范围为0~100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 文档的分辨率
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 转码完成后结果的URL
动态转码：PPT转动态H5的链接
静态转码：文档每一页的图片URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/`，那么文档第1页的图片URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 转码任务的唯一标识Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 文档的文件名
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 缩略图URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/ `，那么动态PPT第1页的缩略图URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
    */
    @SerializedName("ThumbnailUrl")
    @Expose
    private String ThumbnailUrl;

    /**
    * 动态转码缩略图生成分辨率
    */
    @SerializedName("ThumbnailResolution")
    @Expose
    private String ThumbnailResolution;

    /**
    * 转码压缩文件下载的URL，如果发起文档转码请求参数中`CompressFileType`为空或者不是支持的压缩格式，该参数为空字符串
    */
    @SerializedName("CompressFileUrl")
    @Expose
    private String CompressFileUrl;

    /**
    * 资源清单文件下载URL(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceListUrl")
    @Expose
    private String ResourceListUrl;

    /**
    * 文档制作方式(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
    * 文档转码任务创建时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 文档转码任务分配时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssignTime")
    @Expose
    private Long AssignTime;

    /**
    * 文档转码任务完成时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedTime")
    @Expose
    private Long FinishedTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文档的总页数 
     * @return Pages 文档的总页数
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 文档的总页数
     * @param Pages 文档的总页数
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 转码的当前进度,取值范围为0~100 
     * @return Progress 转码的当前进度,取值范围为0~100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 转码的当前进度,取值范围为0~100
     * @param Progress 转码的当前进度,取值范围为0~100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 文档的分辨率 
     * @return Resolution 文档的分辨率
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 文档的分辨率
     * @param Resolution 文档的分辨率
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 转码完成后结果的URL
动态转码：PPT转动态H5的链接
静态转码：文档每一页的图片URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/`，那么文档第1页的图片URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推 
     * @return ResultUrl 转码完成后结果的URL
动态转码：PPT转动态H5的链接
静态转码：文档每一页的图片URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/`，那么文档第1页的图片URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set 转码完成后结果的URL
动态转码：PPT转动态H5的链接
静态转码：文档每一页的图片URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/`，那么文档第1页的图片URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推
     * @param ResultUrl 转码完成后结果的URL
动态转码：PPT转动态H5的链接
静态转码：文档每一页的图片URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/`，那么文档第1页的图片URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
    }

    /**
     * Get 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成 
     * @return Status 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
     * @param Status 任务的当前状态
- QUEUED: 正在排队等待转换
- PROCESSING: 转换中
- FINISHED: 转换完成
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 转码任务的唯一标识Id 
     * @return TaskId 转码任务的唯一标识Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 转码任务的唯一标识Id
     * @param TaskId 转码任务的唯一标识Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 文档的文件名 
     * @return Title 文档的文件名
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 文档的文件名
     * @param Title 文档的文件名
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 缩略图URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/ `，那么动态PPT第1页的缩略图URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串 
     * @return ThumbnailUrl 缩略图URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/ `，那么动态PPT第1页的缩略图URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
     */
    public String getThumbnailUrl() {
        return this.ThumbnailUrl;
    }

    /**
     * Set 缩略图URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/ `，那么动态PPT第1页的缩略图URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
     * @param ThumbnailUrl 缩略图URL前缀，比如，该URL前缀为`http://example.com/g0jb42ps49vtebjshilb/ `，那么动态PPT第1页的缩略图URL为
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
     */
    public void setThumbnailUrl(String ThumbnailUrl) {
        this.ThumbnailUrl = ThumbnailUrl;
    }

    /**
     * Get 动态转码缩略图生成分辨率 
     * @return ThumbnailResolution 动态转码缩略图生成分辨率
     */
    public String getThumbnailResolution() {
        return this.ThumbnailResolution;
    }

    /**
     * Set 动态转码缩略图生成分辨率
     * @param ThumbnailResolution 动态转码缩略图生成分辨率
     */
    public void setThumbnailResolution(String ThumbnailResolution) {
        this.ThumbnailResolution = ThumbnailResolution;
    }

    /**
     * Get 转码压缩文件下载的URL，如果发起文档转码请求参数中`CompressFileType`为空或者不是支持的压缩格式，该参数为空字符串 
     * @return CompressFileUrl 转码压缩文件下载的URL，如果发起文档转码请求参数中`CompressFileType`为空或者不是支持的压缩格式，该参数为空字符串
     */
    public String getCompressFileUrl() {
        return this.CompressFileUrl;
    }

    /**
     * Set 转码压缩文件下载的URL，如果发起文档转码请求参数中`CompressFileType`为空或者不是支持的压缩格式，该参数为空字符串
     * @param CompressFileUrl 转码压缩文件下载的URL，如果发起文档转码请求参数中`CompressFileType`为空或者不是支持的压缩格式，该参数为空字符串
     */
    public void setCompressFileUrl(String CompressFileUrl) {
        this.CompressFileUrl = CompressFileUrl;
    }

    /**
     * Get 资源清单文件下载URL(内测体验)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceListUrl 资源清单文件下载URL(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceListUrl() {
        return this.ResourceListUrl;
    }

    /**
     * Set 资源清单文件下载URL(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceListUrl 资源清单文件下载URL(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceListUrl(String ResourceListUrl) {
        this.ResourceListUrl = ResourceListUrl;
    }

    /**
     * Get 文档制作方式(内测体验)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 文档制作方式(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set 文档制作方式(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 文档制作方式(内测体验)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 文档转码任务创建时间，单位s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 文档转码任务创建时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 文档转码任务创建时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 文档转码任务创建时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文档转码任务分配时间，单位s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssignTime 文档转码任务分配时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssignTime() {
        return this.AssignTime;
    }

    /**
     * Set 文档转码任务分配时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssignTime 文档转码任务分配时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssignTime(Long AssignTime) {
        this.AssignTime = AssignTime;
    }

    /**
     * Get 文档转码任务完成时间，单位s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedTime 文档转码任务完成时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set 文档转码任务完成时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedTime 文档转码任务完成时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedTime(Long FinishedTime) {
        this.FinishedTime = FinishedTime;
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

    public DescribeTranscodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeResponse(DescribeTranscodeResponse source) {
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ThumbnailUrl != null) {
            this.ThumbnailUrl = new String(source.ThumbnailUrl);
        }
        if (source.ThumbnailResolution != null) {
            this.ThumbnailResolution = new String(source.ThumbnailResolution);
        }
        if (source.CompressFileUrl != null) {
            this.CompressFileUrl = new String(source.CompressFileUrl);
        }
        if (source.ResourceListUrl != null) {
            this.ResourceListUrl = new String(source.ResourceListUrl);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.AssignTime != null) {
            this.AssignTime = new Long(source.AssignTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new Long(source.FinishedTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "ThumbnailUrl", this.ThumbnailUrl);
        this.setParamSimple(map, prefix + "ThumbnailResolution", this.ThumbnailResolution);
        this.setParamSimple(map, prefix + "CompressFileUrl", this.CompressFileUrl);
        this.setParamSimple(map, prefix + "ResourceListUrl", this.ResourceListUrl);
        this.setParamSimple(map, prefix + "Ext", this.Ext);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AssignTime", this.AssignTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

