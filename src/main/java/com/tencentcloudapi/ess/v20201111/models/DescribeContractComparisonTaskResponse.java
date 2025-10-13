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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContractComparisonTaskResponse extends AbstractModel {

    /**
    * 合同对比任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 合同对比任务状态。
状态如下：
<ul><li> **0**：待创建（未执行）</li>
<li> **1**：对比中</li>
<li> **2**：对比成功</li>
<li> **3**：对比失败</li>
</ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 对比失败的具体原因描述，仅当状态为失败时返回此字段。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 原版文件ID，对比基准的旧版本文件唯一标识。
    */
    @SerializedName("OriginalFileResourceId")
    @Expose
    private String OriginalFileResourceId;

    /**
    * 新版文件ID，与旧版进行对比的新版本文件唯一标识。
    */
    @SerializedName("DiffFileResourceId")
    @Expose
    private String DiffFileResourceId;

    /**
    * 对比任务备注，长度不能超过50个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 合同对比差异点总数。
    */
    @SerializedName("TotalDiffCount")
    @Expose
    private Long TotalDiffCount;

    /**
    * 合同对比新增点数量。
    */
    @SerializedName("AddDiffCount")
    @Expose
    private Long AddDiffCount;

    /**
    * 合同对比修改点数量。
    */
    @SerializedName("ChangeDiffCount")
    @Expose
    private Long ChangeDiffCount;

    /**
    * 合同对比删除点数量。
    */
    @SerializedName("DeleteDiffCount")
    @Expose
    private Long DeleteDiffCount;

    /**
    * 提交人，提交此任务或请求的用户唯一标识。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 合同对比任务创建时间，时间戳。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同对比任务ID。 
     * @return TaskId 合同对比任务ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 合同对比任务ID。
     * @param TaskId 合同对比任务ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 合同对比任务状态。
状态如下：
<ul><li> **0**：待创建（未执行）</li>
<li> **1**：对比中</li>
<li> **2**：对比成功</li>
<li> **3**：对比失败</li>
</ul> 
     * @return Status 合同对比任务状态。
状态如下：
<ul><li> **0**：待创建（未执行）</li>
<li> **1**：对比中</li>
<li> **2**：对比成功</li>
<li> **3**：对比失败</li>
</ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 合同对比任务状态。
状态如下：
<ul><li> **0**：待创建（未执行）</li>
<li> **1**：对比中</li>
<li> **2**：对比成功</li>
<li> **3**：对比失败</li>
</ul>
     * @param Status 合同对比任务状态。
状态如下：
<ul><li> **0**：待创建（未执行）</li>
<li> **1**：对比中</li>
<li> **2**：对比成功</li>
<li> **3**：对比失败</li>
</ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 对比失败的具体原因描述，仅当状态为失败时返回此字段。 
     * @return Message 对比失败的具体原因描述，仅当状态为失败时返回此字段。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 对比失败的具体原因描述，仅当状态为失败时返回此字段。
     * @param Message 对比失败的具体原因描述，仅当状态为失败时返回此字段。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 原版文件ID，对比基准的旧版本文件唯一标识。 
     * @return OriginalFileResourceId 原版文件ID，对比基准的旧版本文件唯一标识。
     */
    public String getOriginalFileResourceId() {
        return this.OriginalFileResourceId;
    }

    /**
     * Set 原版文件ID，对比基准的旧版本文件唯一标识。
     * @param OriginalFileResourceId 原版文件ID，对比基准的旧版本文件唯一标识。
     */
    public void setOriginalFileResourceId(String OriginalFileResourceId) {
        this.OriginalFileResourceId = OriginalFileResourceId;
    }

    /**
     * Get 新版文件ID，与旧版进行对比的新版本文件唯一标识。 
     * @return DiffFileResourceId 新版文件ID，与旧版进行对比的新版本文件唯一标识。
     */
    public String getDiffFileResourceId() {
        return this.DiffFileResourceId;
    }

    /**
     * Set 新版文件ID，与旧版进行对比的新版本文件唯一标识。
     * @param DiffFileResourceId 新版文件ID，与旧版进行对比的新版本文件唯一标识。
     */
    public void setDiffFileResourceId(String DiffFileResourceId) {
        this.DiffFileResourceId = DiffFileResourceId;
    }

    /**
     * Get 对比任务备注，长度不能超过50个字符。 
     * @return Comment 对比任务备注，长度不能超过50个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 对比任务备注，长度不能超过50个字符。
     * @param Comment 对比任务备注，长度不能超过50个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 合同对比差异点总数。 
     * @return TotalDiffCount 合同对比差异点总数。
     */
    public Long getTotalDiffCount() {
        return this.TotalDiffCount;
    }

    /**
     * Set 合同对比差异点总数。
     * @param TotalDiffCount 合同对比差异点总数。
     */
    public void setTotalDiffCount(Long TotalDiffCount) {
        this.TotalDiffCount = TotalDiffCount;
    }

    /**
     * Get 合同对比新增点数量。 
     * @return AddDiffCount 合同对比新增点数量。
     */
    public Long getAddDiffCount() {
        return this.AddDiffCount;
    }

    /**
     * Set 合同对比新增点数量。
     * @param AddDiffCount 合同对比新增点数量。
     */
    public void setAddDiffCount(Long AddDiffCount) {
        this.AddDiffCount = AddDiffCount;
    }

    /**
     * Get 合同对比修改点数量。 
     * @return ChangeDiffCount 合同对比修改点数量。
     */
    public Long getChangeDiffCount() {
        return this.ChangeDiffCount;
    }

    /**
     * Set 合同对比修改点数量。
     * @param ChangeDiffCount 合同对比修改点数量。
     */
    public void setChangeDiffCount(Long ChangeDiffCount) {
        this.ChangeDiffCount = ChangeDiffCount;
    }

    /**
     * Get 合同对比删除点数量。 
     * @return DeleteDiffCount 合同对比删除点数量。
     */
    public Long getDeleteDiffCount() {
        return this.DeleteDiffCount;
    }

    /**
     * Set 合同对比删除点数量。
     * @param DeleteDiffCount 合同对比删除点数量。
     */
    public void setDeleteDiffCount(Long DeleteDiffCount) {
        this.DeleteDiffCount = DeleteDiffCount;
    }

    /**
     * Get 提交人，提交此任务或请求的用户唯一标识。 
     * @return Operator 提交人，提交此任务或请求的用户唯一标识。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 提交人，提交此任务或请求的用户唯一标识。
     * @param Operator 提交人，提交此任务或请求的用户唯一标识。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同对比任务创建时间，时间戳。 
     * @return CreateTime 合同对比任务创建时间，时间戳。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 合同对比任务创建时间，时间戳。
     * @param CreateTime 合同对比任务创建时间，时间戳。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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

    public DescribeContractComparisonTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContractComparisonTaskResponse(DescribeContractComparisonTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.OriginalFileResourceId != null) {
            this.OriginalFileResourceId = new String(source.OriginalFileResourceId);
        }
        if (source.DiffFileResourceId != null) {
            this.DiffFileResourceId = new String(source.DiffFileResourceId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.TotalDiffCount != null) {
            this.TotalDiffCount = new Long(source.TotalDiffCount);
        }
        if (source.AddDiffCount != null) {
            this.AddDiffCount = new Long(source.AddDiffCount);
        }
        if (source.ChangeDiffCount != null) {
            this.ChangeDiffCount = new Long(source.ChangeDiffCount);
        }
        if (source.DeleteDiffCount != null) {
            this.DeleteDiffCount = new Long(source.DeleteDiffCount);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "OriginalFileResourceId", this.OriginalFileResourceId);
        this.setParamSimple(map, prefix + "DiffFileResourceId", this.DiffFileResourceId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "TotalDiffCount", this.TotalDiffCount);
        this.setParamSimple(map, prefix + "AddDiffCount", this.AddDiffCount);
        this.setParamSimple(map, prefix + "ChangeDiffCount", this.ChangeDiffCount);
        this.setParamSimple(map, prefix + "DeleteDiffCount", this.DeleteDiffCount);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

