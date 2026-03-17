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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInjectRiskyServiceSwitchResponse extends AbstractModel {

    /**
    * 内存马是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JavaShellInjectRiskyServiceStatus")
    @Expose
    private Long JavaShellInjectRiskyServiceStatus;

    /**
    * 主机rasp是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RaspInjectRiskyServiceStatus")
    @Expose
    private Long RaspInjectRiskyServiceStatus;

    /**
    * 风险服务总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 风险服务列表
    */
    @SerializedName("List")
    @Expose
    private RiskMainClass [] List;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 内存马是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JavaShellInjectRiskyServiceStatus 内存马是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJavaShellInjectRiskyServiceStatus() {
        return this.JavaShellInjectRiskyServiceStatus;
    }

    /**
     * Set 内存马是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
     * @param JavaShellInjectRiskyServiceStatus 内存马是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJavaShellInjectRiskyServiceStatus(Long JavaShellInjectRiskyServiceStatus) {
        this.JavaShellInjectRiskyServiceStatus = JavaShellInjectRiskyServiceStatus;
    }

    /**
     * Get 主机rasp是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RaspInjectRiskyServiceStatus 主机rasp是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRaspInjectRiskyServiceStatus() {
        return this.RaspInjectRiskyServiceStatus;
    }

    /**
     * Set 主机rasp是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
     * @param RaspInjectRiskyServiceStatus 主机rasp是否注入风险服务配置，0: 用户没有操作过，默认不注入 1: 注入,2:用户指定不注入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRaspInjectRiskyServiceStatus(Long RaspInjectRiskyServiceStatus) {
        this.RaspInjectRiskyServiceStatus = RaspInjectRiskyServiceStatus;
    }

    /**
     * Get 风险服务总条数 
     * @return TotalCount 风险服务总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 风险服务总条数
     * @param TotalCount 风险服务总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 风险服务列表 
     * @return List 风险服务列表
     */
    public RiskMainClass [] getList() {
        return this.List;
    }

    /**
     * Set 风险服务列表
     * @param List 风险服务列表
     */
    public void setList(RiskMainClass [] List) {
        this.List = List;
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

    public DescribeInjectRiskyServiceSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInjectRiskyServiceSwitchResponse(DescribeInjectRiskyServiceSwitchResponse source) {
        if (source.JavaShellInjectRiskyServiceStatus != null) {
            this.JavaShellInjectRiskyServiceStatus = new Long(source.JavaShellInjectRiskyServiceStatus);
        }
        if (source.RaspInjectRiskyServiceStatus != null) {
            this.RaspInjectRiskyServiceStatus = new Long(source.RaspInjectRiskyServiceStatus);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new RiskMainClass[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new RiskMainClass(source.List[i]);
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
        this.setParamSimple(map, prefix + "JavaShellInjectRiskyServiceStatus", this.JavaShellInjectRiskyServiceStatus);
        this.setParamSimple(map, prefix + "RaspInjectRiskyServiceStatus", this.RaspInjectRiskyServiceStatus);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

