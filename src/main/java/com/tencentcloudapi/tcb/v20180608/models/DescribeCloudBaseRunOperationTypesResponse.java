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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunOperationTypesResponse extends AbstractModel{

    /**
    * 操作类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String [] Action;

    /**
    * 服务名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerName")
    @Expose
    private String [] ServerName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAction() {
        return this.Action;
    }

    /**
     * Set 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String [] Action) {
        this.Action = Action;
    }

    /**
     * Get 服务名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerName 服务名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerName 服务名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerName(String [] ServerName) {
        this.ServerName = ServerName;
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

    public DescribeCloudBaseRunOperationTypesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunOperationTypesResponse(DescribeCloudBaseRunOperationTypesResponse source) {
        if (source.Action != null) {
            this.Action = new String[source.Action.length];
            for (int i = 0; i < source.Action.length; i++) {
                this.Action[i] = new String(source.Action[i]);
            }
        }
        if (source.ServerName != null) {
            this.ServerName = new String[source.ServerName.length];
            for (int i = 0; i < source.ServerName.length; i++) {
                this.ServerName[i] = new String(source.ServerName[i]);
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
        this.setParamArraySimple(map, prefix + "Action.", this.Action);
        this.setParamArraySimple(map, prefix + "ServerName.", this.ServerName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

