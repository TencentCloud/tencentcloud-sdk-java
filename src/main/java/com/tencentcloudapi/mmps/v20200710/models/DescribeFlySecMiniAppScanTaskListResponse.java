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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlySecMiniAppScanTaskListResponse extends AbstractModel{

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Ret")
    @Expose
    private Long Ret;

    /**
    * 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private FlySecMiniAppTaskData [] Data;

    /**
    * 诊断任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Ret 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getRet() {
        return this.Ret;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Ret 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setRet(Long Ret) {
        this.Ret = Ret;
    }

    /**
     * Get 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlySecMiniAppTaskData [] getData() {
        return this.Data;
    }

    /**
     * Set 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(FlySecMiniAppTaskData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 诊断任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 诊断任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 诊断任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 诊断任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeFlySecMiniAppScanTaskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlySecMiniAppScanTaskListResponse(DescribeFlySecMiniAppScanTaskListResponse source) {
        if (source.Ret != null) {
            this.Ret = new Long(source.Ret);
        }
        if (source.Data != null) {
            this.Data = new FlySecMiniAppTaskData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new FlySecMiniAppTaskData(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ret", this.Ret);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

