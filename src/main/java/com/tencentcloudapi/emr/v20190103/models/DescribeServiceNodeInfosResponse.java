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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceNodeInfosResponse extends AbstractModel {

    /**
    * 总数量
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 进程信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceNodeList")
    @Expose
    private ServiceNodeDetailInfo [] ServiceNodeList;

    /**
    * 集群所有节点的别名序列化
    */
    @SerializedName("AliasInfo")
    @Expose
    private String AliasInfo;

    /**
    * 支持的FlagNode列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportNodeFlagFilterList")
    @Expose
    private String [] SupportNodeFlagFilterList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数量 
     * @return TotalCnt 总数量
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 总数量
     * @param TotalCnt 总数量
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 进程信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceNodeList 进程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceNodeDetailInfo [] getServiceNodeList() {
        return this.ServiceNodeList;
    }

    /**
     * Set 进程信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceNodeList 进程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceNodeList(ServiceNodeDetailInfo [] ServiceNodeList) {
        this.ServiceNodeList = ServiceNodeList;
    }

    /**
     * Get 集群所有节点的别名序列化 
     * @return AliasInfo 集群所有节点的别名序列化
     */
    public String getAliasInfo() {
        return this.AliasInfo;
    }

    /**
     * Set 集群所有节点的别名序列化
     * @param AliasInfo 集群所有节点的别名序列化
     */
    public void setAliasInfo(String AliasInfo) {
        this.AliasInfo = AliasInfo;
    }

    /**
     * Get 支持的FlagNode列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportNodeFlagFilterList 支持的FlagNode列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportNodeFlagFilterList() {
        return this.SupportNodeFlagFilterList;
    }

    /**
     * Set 支持的FlagNode列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportNodeFlagFilterList 支持的FlagNode列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportNodeFlagFilterList(String [] SupportNodeFlagFilterList) {
        this.SupportNodeFlagFilterList = SupportNodeFlagFilterList;
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

    public DescribeServiceNodeInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceNodeInfosResponse(DescribeServiceNodeInfosResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.ServiceNodeList != null) {
            this.ServiceNodeList = new ServiceNodeDetailInfo[source.ServiceNodeList.length];
            for (int i = 0; i < source.ServiceNodeList.length; i++) {
                this.ServiceNodeList[i] = new ServiceNodeDetailInfo(source.ServiceNodeList[i]);
            }
        }
        if (source.AliasInfo != null) {
            this.AliasInfo = new String(source.AliasInfo);
        }
        if (source.SupportNodeFlagFilterList != null) {
            this.SupportNodeFlagFilterList = new String[source.SupportNodeFlagFilterList.length];
            for (int i = 0; i < source.SupportNodeFlagFilterList.length; i++) {
                this.SupportNodeFlagFilterList[i] = new String(source.SupportNodeFlagFilterList[i]);
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
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "ServiceNodeList.", this.ServiceNodeList);
        this.setParamSimple(map, prefix + "AliasInfo", this.AliasInfo);
        this.setParamArraySimple(map, prefix + "SupportNodeFlagFilterList.", this.SupportNodeFlagFilterList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

