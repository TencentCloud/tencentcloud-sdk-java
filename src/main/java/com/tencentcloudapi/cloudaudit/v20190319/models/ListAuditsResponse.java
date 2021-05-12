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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAuditsResponse extends AbstractModel{

    /**
    * 查询跟踪集概要集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditSummarys")
    @Expose
    private AuditSummary [] AuditSummarys;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询跟踪集概要集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditSummarys 查询跟踪集概要集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuditSummary [] getAuditSummarys() {
        return this.AuditSummarys;
    }

    /**
     * Set 查询跟踪集概要集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditSummarys 查询跟踪集概要集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditSummarys(AuditSummary [] AuditSummarys) {
        this.AuditSummarys = AuditSummarys;
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

    public ListAuditsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAuditsResponse(ListAuditsResponse source) {
        if (source.AuditSummarys != null) {
            this.AuditSummarys = new AuditSummary[source.AuditSummarys.length];
            for (int i = 0; i < source.AuditSummarys.length; i++) {
                this.AuditSummarys[i] = new AuditSummary(source.AuditSummarys[i]);
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
        this.setParamArrayObj(map, prefix + "AuditSummarys.", this.AuditSummarys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

