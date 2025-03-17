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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTaskListInfo extends AbstractModel {

    /**
    * 任务列表详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private TaskInfoVo [] Rows;

    /**
    * 页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
     * Get 任务列表详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows 任务列表详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskInfoVo [] getRows() {
        return this.Rows;
    }

    /**
     * Set 任务列表详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows 任务列表详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(TaskInfoVo [] Rows) {
        this.Rows = Rows;
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
     * Get 每页条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 每页条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 每页条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPageNumber 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPageNumber 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    public ReportTaskListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTaskListInfo(ReportTaskListInfo source) {
        if (source.Rows != null) {
            this.Rows = new TaskInfoVo[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new TaskInfoVo(source.Rows[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);

    }
}

