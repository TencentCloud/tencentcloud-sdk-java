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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCreateMySQLResult extends AbstractModel {

    /**
    * 状态 notexist | init | doing | success | fail
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 是否已被冻结（只在 Status=success时有效）
    */
    @SerializedName("FreezeStatus")
    @Expose
    private Boolean FreezeStatus;

    /**
     * Get 状态 notexist | init | doing | success | fail 
     * @return Status 状态 notexist | init | doing | success | fail
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 notexist | init | doing | success | fail
     * @param Status 状态 notexist | init | doing | success | fail
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 是否已被冻结（只在 Status=success时有效） 
     * @return FreezeStatus 是否已被冻结（只在 Status=success时有效）
     */
    public Boolean getFreezeStatus() {
        return this.FreezeStatus;
    }

    /**
     * Set 是否已被冻结（只在 Status=success时有效）
     * @param FreezeStatus 是否已被冻结（只在 Status=success时有效）
     */
    public void setFreezeStatus(Boolean FreezeStatus) {
        this.FreezeStatus = FreezeStatus;
    }

    public DescribeCreateMySQLResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreateMySQLResult(DescribeCreateMySQLResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FreezeStatus != null) {
            this.FreezeStatus = new Boolean(source.FreezeStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FreezeStatus", this.FreezeStatus);

    }
}

