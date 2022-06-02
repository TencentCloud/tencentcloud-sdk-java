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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationProxyResponse extends AbstractModel{

    /**
    * 数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private ApplicationProxy [] Data;

    /**
    * 记录总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 当ZoneId不为空时，表示当前站点允许创建的实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicationProxy [] getData() {
        return this.Data;
    }

    /**
     * Set 数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(ApplicationProxy [] Data) {
        this.Data = Data;
    }

    /**
     * Get 记录总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 当ZoneId不为空时，表示当前站点允许创建的实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quota 当ZoneId不为空时，表示当前站点允许创建的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 当ZoneId不为空时，表示当前站点允许创建的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quota 当ZoneId不为空时，表示当前站点允许创建的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
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

    public DescribeApplicationProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationProxyResponse(DescribeApplicationProxyResponse source) {
        if (source.Data != null) {
            this.Data = new ApplicationProxy[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ApplicationProxy(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

