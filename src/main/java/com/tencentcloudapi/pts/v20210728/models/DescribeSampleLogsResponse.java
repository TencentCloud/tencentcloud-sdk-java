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

public class DescribeSampleLogsResponse extends AbstractModel{

    /**
    * 日志总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 日志上下文，加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容。过期时间1小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 采样日志数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleLogs")
    @Expose
    private SampleLog [] SampleLogs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志总数 
     * @return Total 日志总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 日志总数
     * @param Total 日志总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

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
     * Get 采样日志数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleLogs 采样日志数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SampleLog [] getSampleLogs() {
        return this.SampleLogs;
    }

    /**
     * Set 采样日志数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleLogs 采样日志数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleLogs(SampleLog [] SampleLogs) {
        this.SampleLogs = SampleLogs;
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

    public DescribeSampleLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleLogsResponse(DescribeSampleLogsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.SampleLogs != null) {
            this.SampleLogs = new SampleLog[source.SampleLogs.length];
            for (int i = 0; i < source.SampleLogs.length; i++) {
                this.SampleLogs[i] = new SampleLog(source.SampleLogs[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArrayObj(map, prefix + "SampleLogs.", this.SampleLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

