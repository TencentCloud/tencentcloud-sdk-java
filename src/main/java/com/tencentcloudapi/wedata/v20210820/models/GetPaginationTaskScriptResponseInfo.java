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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPaginationTaskScriptResponseInfo extends AbstractModel {

    /**
    * 项目编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 页内尺寸
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageTotal")
    @Expose
    private Long PageTotal;

    /**
    * 分页内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Base64ScriptContent")
    @Expose
    private String Base64ScriptContent;

    /**
     * Get 项目编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 页内尺寸
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 页内尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页内尺寸
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 页内尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNum 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNum 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageTotal 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageTotal() {
        return this.PageTotal;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageTotal 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageTotal(Long PageTotal) {
        this.PageTotal = PageTotal;
    }

    /**
     * Get 分页内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Base64ScriptContent 分页内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBase64ScriptContent() {
        return this.Base64ScriptContent;
    }

    /**
     * Set 分页内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Base64ScriptContent 分页内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBase64ScriptContent(String Base64ScriptContent) {
        this.Base64ScriptContent = Base64ScriptContent;
    }

    public GetPaginationTaskScriptResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPaginationTaskScriptResponseInfo(GetPaginationTaskScriptResponseInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageTotal != null) {
            this.PageTotal = new Long(source.PageTotal);
        }
        if (source.Base64ScriptContent != null) {
            this.Base64ScriptContent = new String(source.Base64ScriptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageTotal", this.PageTotal);
        this.setParamSimple(map, prefix + "Base64ScriptContent", this.Base64ScriptContent);

    }
}

