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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNormalLogsResponse extends AbstractModel{

    /**
    * 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalLogs")
    @Expose
    private NormalLog [] NormalLogs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Context 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param Context 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalLogs 日志数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NormalLog [] getNormalLogs() {
        return this.NormalLogs;
    }

    /**
     * Set 日志数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalLogs 日志数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalLogs(NormalLog [] NormalLogs) {
        this.NormalLogs = NormalLogs;
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

    public DescribeNormalLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNormalLogsResponse(DescribeNormalLogsResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.NormalLogs != null) {
            this.NormalLogs = new NormalLog[source.NormalLogs.length];
            for (int i = 0; i < source.NormalLogs.length; i++) {
                this.NormalLogs[i] = new NormalLog(source.NormalLogs[i]);
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
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArrayObj(map, prefix + "NormalLogs.", this.NormalLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

