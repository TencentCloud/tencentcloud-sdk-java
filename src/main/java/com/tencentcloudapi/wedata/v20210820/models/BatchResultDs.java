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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchResultDs extends AbstractModel {

    /**
    * 成功数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * 失败数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * 总计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 成功数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Success 成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set 成功数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Success 成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get 失败数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Failed 失败数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set 失败数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Failed 失败数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get 总计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public BatchResultDs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchResultDs(BatchResultDs source) {
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

