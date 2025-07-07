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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDocResponse extends AbstractModel {

    /**
    * 文档ID
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * cos路径
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功 7-审核中 8-审核失败 9-审核成功 10-待发布 11-发布中 12-已发布 13-学习中 14-学习失败 15-更新中 16-更新失败 17-解析中 18-解析失败 19-导入失败 20-已过期 21-超量失效 22-超量失效恢复
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 文档状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 生成失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 答案中是否引用
    */
    @SerializedName("IsRefer")
    @Expose
    private Boolean IsRefer;

    /**
    * 问答对数量
    */
    @SerializedName("QaNum")
    @Expose
    private Long QaNum;

    /**
    * 是否删除
    */
    @SerializedName("IsDeleted")
    @Expose
    private Boolean IsDeleted;

    /**
    * 文档来源
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 文档来源描述
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * 是否允许重新生成
    */
    @SerializedName("IsAllowRestart")
    @Expose
    private Boolean IsAllowRestart;

    /**
    * qa是否已删除
    */
    @SerializedName("IsDeletedQa")
    @Expose
    private Boolean IsDeletedQa;

    /**
    * 问答是否生成中
    */
    @SerializedName("IsCreatingQa")
    @Expose
    private Boolean IsCreatingQa;

    /**
    * 是否允许删除
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * 是否允许操作引用开关
    */
    @SerializedName("IsAllowRefer")
    @Expose
    private Boolean IsAllowRefer;

    /**
    * 是否生成过问答
    */
    @SerializedName("IsCreatedQa")
    @Expose
    private Boolean IsCreatedQa;

    /**
    * 文档字符量
    */
    @SerializedName("DocCharSize")
    @Expose
    private String DocCharSize;

    /**
    * 是否允许编辑
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * 标签适用范围 1：全部，2：按条件范围
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * 标签
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabel [] AttrLabels;

    /**
    * 分类ID
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 文档是否停用，false:未停用，true:已停用
    */
    @SerializedName("IsDisabled")
    @Expose
    private Boolean IsDisabled;

    /**
    * 是否支持下载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDownload")
    @Expose
    private Boolean IsDownload;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文档ID 
     * @return DocBizId 文档ID
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档ID
     * @param DocBizId 文档ID
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get cos路径 
     * @return CosUrl cos路径
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set cos路径
     * @param CosUrl cos路径
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功 7-审核中 8-审核失败 9-审核成功 10-待发布 11-发布中 12-已发布 13-学习中 14-学习失败 15-更新中 16-更新失败 17-解析中 18-解析失败 19-导入失败 20-已过期 21-超量失效 22-超量失效恢复 
     * @return Status 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功 7-审核中 8-审核失败 9-审核成功 10-待发布 11-发布中 12-已发布 13-学习中 14-学习失败 15-更新中 16-更新失败 17-解析中 18-解析失败 19-导入失败 20-已过期 21-超量失效 22-超量失效恢复
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功 7-审核中 8-审核失败 9-审核成功 10-待发布 11-发布中 12-已发布 13-学习中 14-学习失败 15-更新中 16-更新失败 17-解析中 18-解析失败 19-导入失败 20-已过期 21-超量失效 22-超量失效恢复
     * @param Status 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功 7-审核中 8-审核失败 9-审核成功 10-待发布 11-发布中 12-已发布 13-学习中 14-学习失败 15-更新中 16-更新失败 17-解析中 18-解析失败 19-导入失败 20-已过期 21-超量失效 22-超量失效恢复
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 文档状态描述 
     * @return StatusDesc 文档状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 文档状态描述
     * @param StatusDesc 文档状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 生成失败原因 
     * @return Reason 生成失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 生成失败原因
     * @param Reason 生成失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 答案中是否引用 
     * @return IsRefer 答案中是否引用
     */
    public Boolean getIsRefer() {
        return this.IsRefer;
    }

    /**
     * Set 答案中是否引用
     * @param IsRefer 答案中是否引用
     */
    public void setIsRefer(Boolean IsRefer) {
        this.IsRefer = IsRefer;
    }

    /**
     * Get 问答对数量 
     * @return QaNum 问答对数量
     */
    public Long getQaNum() {
        return this.QaNum;
    }

    /**
     * Set 问答对数量
     * @param QaNum 问答对数量
     */
    public void setQaNum(Long QaNum) {
        this.QaNum = QaNum;
    }

    /**
     * Get 是否删除 
     * @return IsDeleted 是否删除
     */
    public Boolean getIsDeleted() {
        return this.IsDeleted;
    }

    /**
     * Set 是否删除
     * @param IsDeleted 是否删除
     */
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    /**
     * Get 文档来源 
     * @return Source 文档来源
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 文档来源
     * @param Source 文档来源
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 文档来源描述 
     * @return SourceDesc 文档来源描述
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set 文档来源描述
     * @param SourceDesc 文档来源描述
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get 是否允许重新生成 
     * @return IsAllowRestart 是否允许重新生成
     */
    public Boolean getIsAllowRestart() {
        return this.IsAllowRestart;
    }

    /**
     * Set 是否允许重新生成
     * @param IsAllowRestart 是否允许重新生成
     */
    public void setIsAllowRestart(Boolean IsAllowRestart) {
        this.IsAllowRestart = IsAllowRestart;
    }

    /**
     * Get qa是否已删除 
     * @return IsDeletedQa qa是否已删除
     */
    public Boolean getIsDeletedQa() {
        return this.IsDeletedQa;
    }

    /**
     * Set qa是否已删除
     * @param IsDeletedQa qa是否已删除
     */
    public void setIsDeletedQa(Boolean IsDeletedQa) {
        this.IsDeletedQa = IsDeletedQa;
    }

    /**
     * Get 问答是否生成中 
     * @return IsCreatingQa 问答是否生成中
     */
    public Boolean getIsCreatingQa() {
        return this.IsCreatingQa;
    }

    /**
     * Set 问答是否生成中
     * @param IsCreatingQa 问答是否生成中
     */
    public void setIsCreatingQa(Boolean IsCreatingQa) {
        this.IsCreatingQa = IsCreatingQa;
    }

    /**
     * Get 是否允许删除 
     * @return IsAllowDelete 是否允许删除
     */
    public Boolean getIsAllowDelete() {
        return this.IsAllowDelete;
    }

    /**
     * Set 是否允许删除
     * @param IsAllowDelete 是否允许删除
     */
    public void setIsAllowDelete(Boolean IsAllowDelete) {
        this.IsAllowDelete = IsAllowDelete;
    }

    /**
     * Get 是否允许操作引用开关 
     * @return IsAllowRefer 是否允许操作引用开关
     */
    public Boolean getIsAllowRefer() {
        return this.IsAllowRefer;
    }

    /**
     * Set 是否允许操作引用开关
     * @param IsAllowRefer 是否允许操作引用开关
     */
    public void setIsAllowRefer(Boolean IsAllowRefer) {
        this.IsAllowRefer = IsAllowRefer;
    }

    /**
     * Get 是否生成过问答 
     * @return IsCreatedQa 是否生成过问答
     */
    public Boolean getIsCreatedQa() {
        return this.IsCreatedQa;
    }

    /**
     * Set 是否生成过问答
     * @param IsCreatedQa 是否生成过问答
     */
    public void setIsCreatedQa(Boolean IsCreatedQa) {
        this.IsCreatedQa = IsCreatedQa;
    }

    /**
     * Get 文档字符量 
     * @return DocCharSize 文档字符量
     */
    public String getDocCharSize() {
        return this.DocCharSize;
    }

    /**
     * Set 文档字符量
     * @param DocCharSize 文档字符量
     */
    public void setDocCharSize(String DocCharSize) {
        this.DocCharSize = DocCharSize;
    }

    /**
     * Get 是否允许编辑 
     * @return IsAllowEdit 是否允许编辑
     */
    public Boolean getIsAllowEdit() {
        return this.IsAllowEdit;
    }

    /**
     * Set 是否允许编辑
     * @param IsAllowEdit 是否允许编辑
     */
    public void setIsAllowEdit(Boolean IsAllowEdit) {
        this.IsAllowEdit = IsAllowEdit;
    }

    /**
     * Get 标签适用范围 1：全部，2：按条件范围 
     * @return AttrRange 标签适用范围 1：全部，2：按条件范围
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set 标签适用范围 1：全部，2：按条件范围
     * @param AttrRange 标签适用范围 1：全部，2：按条件范围
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get 标签 
     * @return AttrLabels 标签
     */
    public AttrLabel [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set 标签
     * @param AttrLabels 标签
     */
    public void setAttrLabels(AttrLabel [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get 分类ID 
     * @return CateBizId 分类ID
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID
     * @param CateBizId 分类ID
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get 文档是否停用，false:未停用，true:已停用 
     * @return IsDisabled 文档是否停用，false:未停用，true:已停用
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set 文档是否停用，false:未停用，true:已停用
     * @param IsDisabled 文档是否停用，false:未停用，true:已停用
     */
    public void setIsDisabled(Boolean IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get 是否支持下载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDownload 是否支持下载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDownload() {
        return this.IsDownload;
    }

    /**
     * Set 是否支持下载
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDownload 是否支持下载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDownload(Boolean IsDownload) {
        this.IsDownload = IsDownload;
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

    public DescribeDocResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocResponse(DescribeDocResponse source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.IsRefer != null) {
            this.IsRefer = new Boolean(source.IsRefer);
        }
        if (source.QaNum != null) {
            this.QaNum = new Long(source.QaNum);
        }
        if (source.IsDeleted != null) {
            this.IsDeleted = new Boolean(source.IsDeleted);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.IsAllowRestart != null) {
            this.IsAllowRestart = new Boolean(source.IsAllowRestart);
        }
        if (source.IsDeletedQa != null) {
            this.IsDeletedQa = new Boolean(source.IsDeletedQa);
        }
        if (source.IsCreatingQa != null) {
            this.IsCreatingQa = new Boolean(source.IsCreatingQa);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowRefer != null) {
            this.IsAllowRefer = new Boolean(source.IsAllowRefer);
        }
        if (source.IsCreatedQa != null) {
            this.IsCreatedQa = new Boolean(source.IsCreatedQa);
        }
        if (source.DocCharSize != null) {
            this.DocCharSize = new String(source.DocCharSize);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabel[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabel(source.AttrLabels[i]);
            }
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Boolean(source.IsDisabled);
        }
        if (source.IsDownload != null) {
            this.IsDownload = new Boolean(source.IsDownload);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "IsRefer", this.IsRefer);
        this.setParamSimple(map, prefix + "QaNum", this.QaNum);
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "IsAllowRestart", this.IsAllowRestart);
        this.setParamSimple(map, prefix + "IsDeletedQa", this.IsDeletedQa);
        this.setParamSimple(map, prefix + "IsCreatingQa", this.IsCreatingQa);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowRefer", this.IsAllowRefer);
        this.setParamSimple(map, prefix + "IsCreatedQa", this.IsCreatedQa);
        this.setParamSimple(map, prefix + "DocCharSize", this.DocCharSize);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);
        this.setParamSimple(map, prefix + "IsDownload", this.IsDownload);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

