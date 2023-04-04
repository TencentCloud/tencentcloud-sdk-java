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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPolicyResponse extends AbstractModel{

    /**
    * 添加关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedInsertIds")
    @Expose
    private String [] FailedInsertIds;

    /**
    * 解除关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedDeleteIds")
    @Expose
    private String [] FailedDeleteIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 添加关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedInsertIds 添加关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedInsertIds() {
        return this.FailedInsertIds;
    }

    /**
     * Set 添加关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedInsertIds 添加关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedInsertIds(String [] FailedInsertIds) {
        this.FailedInsertIds = FailedInsertIds;
    }

    /**
     * Get 解除关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedDeleteIds 解除关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedDeleteIds() {
        return this.FailedDeleteIds;
    }

    /**
     * Set 解除关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedDeleteIds 解除关联失败的现场设备ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedDeleteIds(String [] FailedDeleteIds) {
        this.FailedDeleteIds = FailedDeleteIds;
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

    public ModifyPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPolicyResponse(ModifyPolicyResponse source) {
        if (source.FailedInsertIds != null) {
            this.FailedInsertIds = new String[source.FailedInsertIds.length];
            for (int i = 0; i < source.FailedInsertIds.length; i++) {
                this.FailedInsertIds[i] = new String(source.FailedInsertIds[i]);
            }
        }
        if (source.FailedDeleteIds != null) {
            this.FailedDeleteIds = new String[source.FailedDeleteIds.length];
            for (int i = 0; i < source.FailedDeleteIds.length; i++) {
                this.FailedDeleteIds[i] = new String(source.FailedDeleteIds[i]);
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
        this.setParamArraySimple(map, prefix + "FailedInsertIds.", this.FailedInsertIds);
        this.setParamArraySimple(map, prefix + "FailedDeleteIds.", this.FailedDeleteIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

