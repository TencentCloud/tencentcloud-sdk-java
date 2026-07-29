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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagReportUrlItem extends AbstractModel {

    /**
    * 异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 报告下载地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * 链接过期时间，Unix时间戳（秒），-1表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsyncRequestId 异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsyncRequestId 异步任务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 报告下载地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportUrl 报告下载地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set 报告下载地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportUrl 报告下载地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
    }

    /**
     * Get 链接过期时间，Unix时间戳（秒），-1表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 链接过期时间，Unix时间戳（秒），-1表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 链接过期时间，Unix时间戳（秒），-1表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 链接过期时间，Unix时间戳（秒），-1表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public DiagReportUrlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagReportUrlItem(DiagReportUrlItem source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

