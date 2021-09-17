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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncProxyOrganizationOperatorsResponse extends AbstractModel{

    /**
    * Status 同步状态,全部同步失败接口会直接报错
1-成功 
2-部分成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 同步失败经办人及其失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedList")
    @Expose
    private SyncFailReason [] FailedList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Status 同步状态,全部同步失败接口会直接报错
1-成功 
2-部分成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status Status 同步状态,全部同步失败接口会直接报错
1-成功 
2-部分成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status 同步状态,全部同步失败接口会直接报错
1-成功 
2-部分成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status Status 同步状态,全部同步失败接口会直接报错
1-成功 
2-部分成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 同步失败经办人及其失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedList 同步失败经办人及其失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SyncFailReason [] getFailedList() {
        return this.FailedList;
    }

    /**
     * Set 同步失败经办人及其失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedList 同步失败经办人及其失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedList(SyncFailReason [] FailedList) {
        this.FailedList = FailedList;
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

    public SyncProxyOrganizationOperatorsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncProxyOrganizationOperatorsResponse(SyncProxyOrganizationOperatorsResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailedList != null) {
            this.FailedList = new SyncFailReason[source.FailedList.length];
            for (int i = 0; i < source.FailedList.length; i++) {
                this.FailedList[i] = new SyncFailReason(source.FailedList[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "FailedList.", this.FailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

