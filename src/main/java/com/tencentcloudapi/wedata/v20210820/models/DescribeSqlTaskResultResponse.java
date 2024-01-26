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

public class DescribeSqlTaskResultResponse extends AbstractModel {

    /**
    * 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 子任务执行记录Id
    */
    @SerializedName("DetailId")
    @Expose
    private Long DetailId;

    /**
    * 是否是结果集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultSet")
    @Expose
    private Boolean ResultSet;

    /**
    * 结果内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultContent")
    @Expose
    private String ResultContent;

    /**
    * 字段集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldList")
    @Expose
    private String [] FieldList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 子任务执行记录Id 
     * @return DetailId 子任务执行记录Id
     */
    public Long getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 子任务执行记录Id
     * @param DetailId 子任务执行记录Id
     */
    public void setDetailId(Long DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 是否是结果集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultSet 是否是结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set 是否是结果集
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultSet 是否是结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultSet(Boolean ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get 结果内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultContent 结果内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultContent() {
        return this.ResultContent;
    }

    /**
     * Set 结果内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultContent 结果内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultContent(String ResultContent) {
        this.ResultContent = ResultContent;
    }

    /**
     * Get 字段集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldList 字段集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFieldList() {
        return this.FieldList;
    }

    /**
     * Set 字段集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldList 字段集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldList(String [] FieldList) {
        this.FieldList = FieldList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSqlTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlTaskResultResponse(DescribeSqlTaskResultResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.DetailId != null) {
            this.DetailId = new Long(source.DetailId);
        }
        if (source.ResultSet != null) {
            this.ResultSet = new Boolean(source.ResultSet);
        }
        if (source.ResultContent != null) {
            this.ResultContent = new String(source.ResultContent);
        }
        if (source.FieldList != null) {
            this.FieldList = new String[source.FieldList.length];
            for (int i = 0; i < source.FieldList.length; i++) {
                this.FieldList[i] = new String(source.FieldList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "ResultSet", this.ResultSet);
        this.setParamSimple(map, prefix + "ResultContent", this.ResultContent);
        this.setParamArraySimple(map, prefix + "FieldList.", this.FieldList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

