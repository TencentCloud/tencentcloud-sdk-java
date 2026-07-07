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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerOperationLocksItem extends AbstractModel {

    /**
    * 锁定的原因。在**LoadBalancerStatus**为**Abnormal**时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockReason")
    @Expose
    private String LockReason;

    /**
    * 锁定的类型。取值 ：

- **SecurityLocked**：安全锁定。

- **RelatedResourceLocked**：关联锁定。

- **FinancialLocked**：欠费锁定。

- **ResidualLocked**：残留锁定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockType")
    @Expose
    private String LockType;

    /**
     * Get 锁定的原因。在**LoadBalancerStatus**为**Abnormal**时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockReason 锁定的原因。在**LoadBalancerStatus**为**Abnormal**时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLockReason() {
        return this.LockReason;
    }

    /**
     * Set 锁定的原因。在**LoadBalancerStatus**为**Abnormal**时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockReason 锁定的原因。在**LoadBalancerStatus**为**Abnormal**时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockReason(String LockReason) {
        this.LockReason = LockReason;
    }

    /**
     * Get 锁定的类型。取值 ：

- **SecurityLocked**：安全锁定。

- **RelatedResourceLocked**：关联锁定。

- **FinancialLocked**：欠费锁定。

- **ResidualLocked**：残留锁定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockType 锁定的类型。取值 ：

- **SecurityLocked**：安全锁定。

- **RelatedResourceLocked**：关联锁定。

- **FinancialLocked**：欠费锁定。

- **ResidualLocked**：残留锁定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLockType() {
        return this.LockType;
    }

    /**
     * Set 锁定的类型。取值 ：

- **SecurityLocked**：安全锁定。

- **RelatedResourceLocked**：关联锁定。

- **FinancialLocked**：欠费锁定。

- **ResidualLocked**：残留锁定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockType 锁定的类型。取值 ：

- **SecurityLocked**：安全锁定。

- **RelatedResourceLocked**：关联锁定。

- **FinancialLocked**：欠费锁定。

- **ResidualLocked**：残留锁定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockType(String LockType) {
        this.LockType = LockType;
    }

    public LoadBalancerOperationLocksItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerOperationLocksItem(LoadBalancerOperationLocksItem source) {
        if (source.LockReason != null) {
            this.LockReason = new String(source.LockReason);
        }
        if (source.LockType != null) {
            this.LockType = new String(source.LockType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LockReason", this.LockReason);
        this.setParamSimple(map, prefix + "LockType", this.LockType);

    }
}

