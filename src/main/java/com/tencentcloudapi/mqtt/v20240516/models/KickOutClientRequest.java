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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KickOutClientRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 客户端id
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 是否清理session，默认false
    */
    @SerializedName("DeleteSession")
    @Expose
    private Boolean DeleteSession;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 客户端id 
     * @return ClientId 客户端id
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id
     * @param ClientId 客户端id
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 是否清理session，默认false 
     * @return DeleteSession 是否清理session，默认false
     */
    public Boolean getDeleteSession() {
        return this.DeleteSession;
    }

    /**
     * Set 是否清理session，默认false
     * @param DeleteSession 是否清理session，默认false
     */
    public void setDeleteSession(Boolean DeleteSession) {
        this.DeleteSession = DeleteSession;
    }

    public KickOutClientRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KickOutClientRequest(KickOutClientRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.DeleteSession != null) {
            this.DeleteSession = new Boolean(source.DeleteSession);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "DeleteSession", this.DeleteSession);

    }
}

