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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamTaskLogListResponse extends AbstractModel{

    /**
    * 是否是全量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 日志集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogContentList")
    @Expose
    private LogContentInfo [] LogContentList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否是全量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListOver 是否是全量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 是否是全量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListOver 是否是全量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 日志集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogContentList 日志集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogContentInfo [] getLogContentList() {
        return this.LogContentList;
    }

    /**
     * Set 日志集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogContentList 日志集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogContentList(LogContentInfo [] LogContentList) {
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

    public DescribeStreamTaskLogListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamTaskLogListResponse(DescribeStreamTaskLogListResponse source) {
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.LogContentList != null) {
            this.LogContentList = new LogContentInfo[source.LogContentList.length];
            for (int i = 0; i < source.LogContentList.length; i++) {
                this.LogContentList[i] = new LogContentInfo(source.LogContentList[i]);
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
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamArrayObj(map, prefix + "LogContentList.", this.LogContentList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

