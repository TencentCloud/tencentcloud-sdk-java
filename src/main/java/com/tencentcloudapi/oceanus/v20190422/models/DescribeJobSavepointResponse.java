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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobSavepointResponse extends AbstractModel{

    /**
    * 快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNumber")
    @Expose
    private Long TotalNumber;

    /**
    * 快照列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Savepoint")
    @Expose
    private Savepoint [] Savepoint;

    /**
    * 进行中的快照列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningSavepoint")
    @Expose
    private Savepoint [] RunningSavepoint;

    /**
    * 进行中的快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningTotalNumber")
    @Expose
    private Long RunningTotalNumber;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 快照列表总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNumber 快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNumber() {
        return this.TotalNumber;
    }

    /**
     * Set 快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNumber 快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNumber(Long TotalNumber) {
        this.TotalNumber = TotalNumber;
    }

    /**
     * Get 快照列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Savepoint 快照列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Savepoint [] getSavepoint() {
        return this.Savepoint;
    }

    /**
     * Set 快照列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Savepoint 快照列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSavepoint(Savepoint [] Savepoint) {
        this.Savepoint = Savepoint;
    }

    /**
     * Get 进行中的快照列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningSavepoint 进行中的快照列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Savepoint [] getRunningSavepoint() {
        return this.RunningSavepoint;
    }

    /**
     * Set 进行中的快照列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningSavepoint 进行中的快照列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningSavepoint(Savepoint [] RunningSavepoint) {
        this.RunningSavepoint = RunningSavepoint;
    }

    /**
     * Get 进行中的快照列表总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningTotalNumber 进行中的快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningTotalNumber() {
        return this.RunningTotalNumber;
    }

    /**
     * Set 进行中的快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningTotalNumber 进行中的快照列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningTotalNumber(Long RunningTotalNumber) {
        this.RunningTotalNumber = RunningTotalNumber;
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

    public DescribeJobSavepointResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobSavepointResponse(DescribeJobSavepointResponse source) {
        if (source.TotalNumber != null) {
            this.TotalNumber = new Long(source.TotalNumber);
        }
        if (source.Savepoint != null) {
            this.Savepoint = new Savepoint[source.Savepoint.length];
            for (int i = 0; i < source.Savepoint.length; i++) {
                this.Savepoint[i] = new Savepoint(source.Savepoint[i]);
            }
        }
        if (source.RunningSavepoint != null) {
            this.RunningSavepoint = new Savepoint[source.RunningSavepoint.length];
            for (int i = 0; i < source.RunningSavepoint.length; i++) {
                this.RunningSavepoint[i] = new Savepoint(source.RunningSavepoint[i]);
            }
        }
        if (source.RunningTotalNumber != null) {
            this.RunningTotalNumber = new Long(source.RunningTotalNumber);
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
        this.setParamArrayObj(map, prefix + "Savepoint.", this.Savepoint);
        this.setParamArrayObj(map, prefix + "RunningSavepoint.", this.RunningSavepoint);
        this.setParamSimple(map, prefix + "RunningTotalNumber", this.RunningTotalNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

