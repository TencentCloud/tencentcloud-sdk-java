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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudRunServerDetailResponse extends AbstractModel{

    /**
    * 服务基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseInfo")
    @Expose
    private ServerBaseInfo BaseInfo;

    /**
    * 服务配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerConfig")
    @Expose
    private ServerBaseConfig ServerConfig;

    /**
    * 在线版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineVersionInfos")
    @Expose
    private OnlineVersionInfo [] OnlineVersionInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseInfo 服务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 服务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseInfo 服务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseInfo(ServerBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 服务配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerConfig 服务配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerBaseConfig getServerConfig() {
        return this.ServerConfig;
    }

    /**
     * Set 服务配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerConfig 服务配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerConfig(ServerBaseConfig ServerConfig) {
        this.ServerConfig = ServerConfig;
    }

    /**
     * Get 在线版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineVersionInfos 在线版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OnlineVersionInfo [] getOnlineVersionInfos() {
        return this.OnlineVersionInfos;
    }

    /**
     * Set 在线版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineVersionInfos 在线版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineVersionInfos(OnlineVersionInfo [] OnlineVersionInfos) {
        this.OnlineVersionInfos = OnlineVersionInfos;
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

    public DescribeCloudRunServerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudRunServerDetailResponse(DescribeCloudRunServerDetailResponse source) {
        if (source.BaseInfo != null) {
            this.BaseInfo = new ServerBaseInfo(source.BaseInfo);
        }
        if (source.ServerConfig != null) {
            this.ServerConfig = new ServerBaseConfig(source.ServerConfig);
        }
        if (source.OnlineVersionInfos != null) {
            this.OnlineVersionInfos = new OnlineVersionInfo[source.OnlineVersionInfos.length];
            for (int i = 0; i < source.OnlineVersionInfos.length; i++) {
                this.OnlineVersionInfos[i] = new OnlineVersionInfo(source.OnlineVersionInfos[i]);
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
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamObj(map, prefix + "ServerConfig.", this.ServerConfig);
        this.setParamArrayObj(map, prefix + "OnlineVersionInfos.", this.OnlineVersionInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

