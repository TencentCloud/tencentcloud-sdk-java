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

public class BatchOpsDTO extends AbstractModel {

    /**
    * 总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 成功数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMessageList")
    @Expose
    private FailMessage [] FailMessageList;

    /**
     * Get 总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 成功数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 成功数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 成功数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailCount 失败数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailCount 失败数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMessageList 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailMessage [] getFailMessageList() {
        return this.FailMessageList;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMessageList 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMessageList(FailMessage [] FailMessageList) {
        this.FailMessageList = FailMessageList;
    }

    public BatchOpsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOpsDTO(BatchOpsDTO source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.FailMessageList != null) {
            this.FailMessageList = new FailMessage[source.FailMessageList.length];
            for (int i = 0; i < source.FailMessageList.length; i++) {
                this.FailMessageList[i] = new FailMessage(source.FailMessageList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamArrayObj(map, prefix + "FailMessageList.", this.FailMessageList);

    }
}

