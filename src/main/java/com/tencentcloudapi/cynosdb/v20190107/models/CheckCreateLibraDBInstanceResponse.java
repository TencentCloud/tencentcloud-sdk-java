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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckCreateLibraDBInstanceResponse extends AbstractModel {

    /**
    * 整体校验状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 校验项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckItem")
    @Expose
    private CheckItem [] CheckItem;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 整体校验状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 整体校验状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 整体校验状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 整体校验状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 校验项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckItem 校验项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CheckItem [] getCheckItem() {
        return this.CheckItem;
    }

    /**
     * Set 校验项
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckItem 校验项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckItem(CheckItem [] CheckItem) {
        this.CheckItem = CheckItem;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckCreateLibraDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckCreateLibraDBInstanceResponse(CheckCreateLibraDBInstanceResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CheckItem != null) {
            this.CheckItem = new CheckItem[source.CheckItem.length];
            for (int i = 0; i < source.CheckItem.length; i++) {
                this.CheckItem[i] = new CheckItem(source.CheckItem[i]);
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
        this.setParamArrayObj(map, prefix + "CheckItem.", this.CheckItem);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

