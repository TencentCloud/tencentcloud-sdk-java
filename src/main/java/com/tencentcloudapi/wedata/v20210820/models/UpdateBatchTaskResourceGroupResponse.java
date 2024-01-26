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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBatchTaskResourceGroupResponse extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNumber")
    @Expose
    private Long TotalNumber;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessNumber")
    @Expose
    private Long SuccessNumber;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailNumber")
    @Expose
    private Long FailNumber;

    /**
    * 批量操作返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private BatchTaskOperateNew Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNumber 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNumber() {
        return this.TotalNumber;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNumber 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNumber(Long TotalNumber) {
        this.TotalNumber = TotalNumber;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessNumber 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessNumber() {
        return this.SuccessNumber;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessNumber 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessNumber(Long SuccessNumber) {
        this.SuccessNumber = SuccessNumber;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailNumber 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailNumber() {
        return this.FailNumber;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailNumber 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailNumber(Long FailNumber) {
        this.FailNumber = FailNumber;
    }

    /**
     * Get 批量操作返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 批量操作返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BatchTaskOperateNew getData() {
        return this.Data;
    }

    /**
     * Set 批量操作返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 批量操作返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(BatchTaskOperateNew Data) {
        this.Data = Data;
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

    public UpdateBatchTaskResourceGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBatchTaskResourceGroupResponse(UpdateBatchTaskResourceGroupResponse source) {
        if (source.TotalNumber != null) {
            this.TotalNumber = new Long(source.TotalNumber);
        }
        if (source.SuccessNumber != null) {
            this.SuccessNumber = new Long(source.SuccessNumber);
        }
        if (source.FailNumber != null) {
            this.FailNumber = new Long(source.FailNumber);
        }
        if (source.Data != null) {
            this.Data = new BatchTaskOperateNew(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNumber", this.TotalNumber);
        this.setParamSimple(map, prefix + "SuccessNumber", this.SuccessNumber);
        this.setParamSimple(map, prefix + "FailNumber", this.FailNumber);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

