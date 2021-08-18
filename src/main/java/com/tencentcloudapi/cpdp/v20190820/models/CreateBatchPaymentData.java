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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchPaymentData extends AbstractModel{

    /**
    * 批次号
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 批次列表详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchInfoList")
    @Expose
    private CreateBatchPaymentBatchData [] BatchInfoList;

    /**
     * Get 批次号 
     * @return BatchId 批次号
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次号
     * @param BatchId 批次号
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 批次列表详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchInfoList 批次列表详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateBatchPaymentBatchData [] getBatchInfoList() {
        return this.BatchInfoList;
    }

    /**
     * Set 批次列表详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchInfoList 批次列表详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchInfoList(CreateBatchPaymentBatchData [] BatchInfoList) {
        this.BatchInfoList = BatchInfoList;
    }

    public CreateBatchPaymentData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchPaymentData(CreateBatchPaymentData source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.BatchInfoList != null) {
            this.BatchInfoList = new CreateBatchPaymentBatchData[source.BatchInfoList.length];
            for (int i = 0; i < source.BatchInfoList.length; i++) {
                this.BatchInfoList[i] = new CreateBatchPaymentBatchData(source.BatchInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamArrayObj(map, prefix + "BatchInfoList.", this.BatchInfoList);

    }
}

