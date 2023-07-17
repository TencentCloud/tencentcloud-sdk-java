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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobSubmissionLogResponse extends AbstractModel{

    /**
    * 日志搜索的游标，需要搜索更多时透传这个值
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 是否返回了所有的日志记录
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 作业启动的requestId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobRequestId")
    @Expose
    private String JobRequestId;

    /**
    * 该时间段内符合关键字的所有的作业实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobInstanceList")
    @Expose
    private JobInstanceForSubmissionLog [] JobInstanceList;

    /**
    * 废弃，请使用LogContentList
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogList")
    @Expose
    private String [] LogList;

    /**
    * 日志列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogContentList")
    @Expose
    private LogContent [] LogContentList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志搜索的游标，需要搜索更多时透传这个值 
     * @return Cursor 日志搜索的游标，需要搜索更多时透传这个值
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 日志搜索的游标，需要搜索更多时透传这个值
     * @param Cursor 日志搜索的游标，需要搜索更多时透传这个值
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 是否返回了所有的日志记录 
     * @return ListOver 是否返回了所有的日志记录
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 是否返回了所有的日志记录
     * @param ListOver 是否返回了所有的日志记录
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 作业启动的requestId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobRequestId 作业启动的requestId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobRequestId() {
        return this.JobRequestId;
    }

    /**
     * Set 作业启动的requestId
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobRequestId 作业启动的requestId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobRequestId(String JobRequestId) {
        this.JobRequestId = JobRequestId;
    }

    /**
     * Get 该时间段内符合关键字的所有的作业实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobInstanceList 该时间段内符合关键字的所有的作业实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobInstanceForSubmissionLog [] getJobInstanceList() {
        return this.JobInstanceList;
    }

    /**
     * Set 该时间段内符合关键字的所有的作业实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobInstanceList 该时间段内符合关键字的所有的作业实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobInstanceList(JobInstanceForSubmissionLog [] JobInstanceList) {
        this.JobInstanceList = JobInstanceList;
    }

    /**
     * Get 废弃，请使用LogContentList
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogList 废弃，请使用LogContentList
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogList() {
        return this.LogList;
    }

    /**
     * Set 废弃，请使用LogContentList
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogList 废弃，请使用LogContentList
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogList(String [] LogList) {
        this.LogList = LogList;
    }

    /**
     * Get 日志列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogContentList 日志列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogContent [] getLogContentList() {
        return this.LogContentList;
    }

    /**
     * Set 日志列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogContentList 日志列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogContentList(LogContent [] LogContentList) {
        this.LogContentList = LogContentList;
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

    public DescribeJobSubmissionLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobSubmissionLogResponse(DescribeJobSubmissionLogResponse source) {
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.JobRequestId != null) {
            this.JobRequestId = new String(source.JobRequestId);
        }
        if (source.JobInstanceList != null) {
            this.JobInstanceList = new JobInstanceForSubmissionLog[source.JobInstanceList.length];
            for (int i = 0; i < source.JobInstanceList.length; i++) {
                this.JobInstanceList[i] = new JobInstanceForSubmissionLog(source.JobInstanceList[i]);
            }
        }
        if (source.LogList != null) {
            this.LogList = new String[source.LogList.length];
            for (int i = 0; i < source.LogList.length; i++) {
                this.LogList[i] = new String(source.LogList[i]);
            }
        }
        if (source.LogContentList != null) {
            this.LogContentList = new LogContent[source.LogContentList.length];
            for (int i = 0; i < source.LogContentList.length; i++) {
                this.LogContentList[i] = new LogContent(source.LogContentList[i]);
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
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "JobRequestId", this.JobRequestId);
        this.setParamArrayObj(map, prefix + "JobInstanceList.", this.JobInstanceList);
        this.setParamArraySimple(map, prefix + "LogList.", this.LogList);
        this.setParamArrayObj(map, prefix + "LogContentList.", this.LogContentList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

