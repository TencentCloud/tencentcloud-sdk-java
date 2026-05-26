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
    * <p>项目编号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>任务编号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>页内尺寸</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>页码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>总页数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageTotal")
    @Expose
    private Long PageTotal;

    /**
    * <p>分页内容</p><p>分页拉取全部代码内容后，先拼接，再Base64解码获取完整脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Base64ScriptContent")
    @Expose
    private String Base64ScriptContent;

    /**
     * Get <p>项目编号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>任务编号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>页内尺寸</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize <p>页内尺寸</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>页内尺寸</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize <p>页内尺寸</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>页码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNum <p>页码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>页码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNum <p>页码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>总页数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageTotal <p>总页数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageTotal() {
        return this.PageTotal;
    }

    /**
     * Set <p>总页数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageTotal <p>总页数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageTotal(Long PageTotal) {
        this.PageTotal = PageTotal;
    }

    /**
     * Get <p>分页内容</p><p>分页拉取全部代码内容后，先拼接，再Base64解码获取完整脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Base64ScriptContent <p>分页内容</p><p>分页拉取全部代码内容后，先拼接，再Base64解码获取完整脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBase64ScriptContent() {
        return this.Base64ScriptContent;
    }

    /**
     * Set <p>分页内容</p><p>分页拉取全部代码内容后，先拼接，再Base64解码获取完整脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Base64ScriptContent <p>分页内容</p><p>分页拉取全部代码内容后，先拼接，再Base64解码获取完整脚本内容</p>
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

