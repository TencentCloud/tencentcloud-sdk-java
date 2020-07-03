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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogsResponse extends AbstractModel{

    /**
    * 慢日志总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 慢日志详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowLogs")
    @Expose
    private String [] SlowLogs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 慢日志总数 
     * @return Count 慢日志总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 慢日志总数
     * @param Count 慢日志总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 慢日志详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowLogs 慢日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSlowLogs() {
        return this.SlowLogs;
    }

    /**
     * Set 慢日志详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowLogs 慢日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowLogs(String [] SlowLogs) {
        this.SlowLogs = SlowLogs;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "SlowLogs.", this.SlowLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

