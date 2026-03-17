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

public class DescribeTableContentPreviewResponse extends AbstractModel {

    /**
    * 表的列名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnNames")
    @Expose
    private String [] ColumnNames;

    /**
    * 表的行数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableRecordSet")
    @Expose
    private TableRecord [] TableRecordSet;

    /**
    * 异步预览任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 异步预览结果状态: 0 初始化， 1 执行中， 2 执行成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsyncState")
    @Expose
    private Long AsyncState;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表的列名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnNames 表的列名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumnNames() {
        return this.ColumnNames;
    }

    /**
     * Set 表的列名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnNames 表的列名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnNames(String [] ColumnNames) {
        this.ColumnNames = ColumnNames;
    }

    /**
     * Get 表的行数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableRecordSet 表的行数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableRecord [] getTableRecordSet() {
        return this.TableRecordSet;
    }

    /**
     * Set 表的行数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableRecordSet 表的行数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableRecordSet(TableRecord [] TableRecordSet) {
        this.TableRecordSet = TableRecordSet;
    }

    /**
     * Get 异步预览任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 异步预览任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 异步预览任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 异步预览任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 异步预览结果状态: 0 初始化， 1 执行中， 2 执行成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsyncState 异步预览结果状态: 0 初始化， 1 执行中， 2 执行成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAsyncState() {
        return this.AsyncState;
    }

    /**
     * Set 异步预览结果状态: 0 初始化， 1 执行中， 2 执行成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsyncState 异步预览结果状态: 0 初始化， 1 执行中， 2 执行成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsyncState(Long AsyncState) {
        this.AsyncState = AsyncState;
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

    public DescribeTableContentPreviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableContentPreviewResponse(DescribeTableContentPreviewResponse source) {
        if (source.ColumnNames != null) {
            this.ColumnNames = new String[source.ColumnNames.length];
            for (int i = 0; i < source.ColumnNames.length; i++) {
                this.ColumnNames[i] = new String(source.ColumnNames[i]);
            }
        }
        if (source.TableRecordSet != null) {
            this.TableRecordSet = new TableRecord[source.TableRecordSet.length];
            for (int i = 0; i < source.TableRecordSet.length; i++) {
                this.TableRecordSet[i] = new TableRecord(source.TableRecordSet[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AsyncState != null) {
            this.AsyncState = new Long(source.AsyncState);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ColumnNames.", this.ColumnNames);
        this.setParamArrayObj(map, prefix + "TableRecordSet.", this.TableRecordSet);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AsyncState", this.AsyncState);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

