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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MicroService extends AbstractModel{

    /**
    * 微服务集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 微服务命名空间ID。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 微服务名称。
    */
    @SerializedName("MicroServiceName")
    @Expose
    private String MicroServiceName;

    /**
     * Get 微服务集群ID。 
     * @return ClusterId 微服务集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 微服务集群ID。
     * @param ClusterId 微服务集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 微服务命名空间ID。 
     * @return NamespaceId 微服务命名空间ID。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 微服务命名空间ID。
     * @param NamespaceId 微服务命名空间ID。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 微服务名称。 
     * @return MicroServiceName 微服务名称。
     */
    public String getMicroServiceName() {
        return this.MicroServiceName;
    }

    /**
     * Set 微服务名称。
     * @param MicroServiceName 微服务名称。
     */
    public void setMicroServiceName(String MicroServiceName) {
        this.MicroServiceName = MicroServiceName;
    }

    public MicroService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MicroService(MicroService source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.MicroServiceName != null) {
            this.MicroServiceName = new String(source.MicroServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "MicroServiceName", this.MicroServiceName);

    }
}

