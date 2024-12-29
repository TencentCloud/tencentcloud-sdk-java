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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterConfigsResponse extends AbstractModel {

    /**
    * 返回实例的配置文件相关的信息
    */
    @SerializedName("ClusterConfList")
    @Expose
    private ClusterConfigsInfoFromEMR [] ClusterConfList;

    /**
    * 返回当前内核版本 如果不存在则返回空字符串
    */
    @SerializedName("BuildVersion")
    @Expose
    private String BuildVersion;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 是否包含CN节点
    */
    @SerializedName("HasCN")
    @Expose
    private Boolean HasCN;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回实例的配置文件相关的信息 
     * @return ClusterConfList 返回实例的配置文件相关的信息
     */
    public ClusterConfigsInfoFromEMR [] getClusterConfList() {
        return this.ClusterConfList;
    }

    /**
     * Set 返回实例的配置文件相关的信息
     * @param ClusterConfList 返回实例的配置文件相关的信息
     */
    public void setClusterConfList(ClusterConfigsInfoFromEMR [] ClusterConfList) {
        this.ClusterConfList = ClusterConfList;
    }

    /**
     * Get 返回当前内核版本 如果不存在则返回空字符串 
     * @return BuildVersion 返回当前内核版本 如果不存在则返回空字符串
     */
    public String getBuildVersion() {
        return this.BuildVersion;
    }

    /**
     * Set 返回当前内核版本 如果不存在则返回空字符串
     * @param BuildVersion 返回当前内核版本 如果不存在则返回空字符串
     */
    public void setBuildVersion(String BuildVersion) {
        this.BuildVersion = BuildVersion;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 是否包含CN节点 
     * @return HasCN 是否包含CN节点
     */
    public Boolean getHasCN() {
        return this.HasCN;
    }

    /**
     * Set 是否包含CN节点
     * @param HasCN 是否包含CN节点
     */
    public void setHasCN(Boolean HasCN) {
        this.HasCN = HasCN;
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

    public DescribeClusterConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterConfigsResponse(DescribeClusterConfigsResponse source) {
        if (source.ClusterConfList != null) {
            this.ClusterConfList = new ClusterConfigsInfoFromEMR[source.ClusterConfList.length];
            for (int i = 0; i < source.ClusterConfList.length; i++) {
                this.ClusterConfList[i] = new ClusterConfigsInfoFromEMR(source.ClusterConfList[i]);
            }
        }
        if (source.BuildVersion != null) {
            this.BuildVersion = new String(source.BuildVersion);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.HasCN != null) {
            this.HasCN = new Boolean(source.HasCN);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClusterConfList.", this.ClusterConfList);
        this.setParamSimple(map, prefix + "BuildVersion", this.BuildVersion);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "HasCN", this.HasCN);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

