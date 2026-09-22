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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatEndpoint extends AbstractModel {

    /**
    * 接入点类型：PUBLIC（公网）/ PRIVATE（私网，预留）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointType")
    @Expose
    private String EndpointType;

    /**
    * 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 接入点类型：PUBLIC（公网）/ PRIVATE（私网，预留）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointType 接入点类型：PUBLIC（公网）/ PRIVATE（私网，预留）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpointType() {
        return this.EndpointType;
    }

    /**
     * Set 接入点类型：PUBLIC（公网）/ PRIVATE（私网，预留）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointType 接入点类型：PUBLIC（公网）/ PRIVATE（私网，预留）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointType(String EndpointType) {
        this.EndpointType = EndpointType;
    }

    /**
     * Get 接入点地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ChatEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatEndpoint(ChatEndpoint source) {
        if (source.EndpointType != null) {
            this.EndpointType = new String(source.EndpointType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointType", this.EndpointType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

