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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMicroserviceWithDetailRespRequest extends AbstractModel {

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 微服务名称
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * 微服务描述信息
    */
    @SerializedName("MicroserviceDesc")
    @Expose
    private String MicroserviceDesc;

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 微服务名称 
     * @return MicroserviceName 微服务名称
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set 微服务名称
     * @param MicroserviceName 微服务名称
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get 微服务描述信息 
     * @return MicroserviceDesc 微服务描述信息
     */
    public String getMicroserviceDesc() {
        return this.MicroserviceDesc;
    }

    /**
     * Set 微服务描述信息
     * @param MicroserviceDesc 微服务描述信息
     */
    public void setMicroserviceDesc(String MicroserviceDesc) {
        this.MicroserviceDesc = MicroserviceDesc;
    }

    public CreateMicroserviceWithDetailRespRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMicroserviceWithDetailRespRequest(CreateMicroserviceWithDetailRespRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.MicroserviceName != null) {
            this.MicroserviceName = new String(source.MicroserviceName);
        }
        if (source.MicroserviceDesc != null) {
            this.MicroserviceDesc = new String(source.MicroserviceDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "MicroserviceName", this.MicroserviceName);
        this.setParamSimple(map, prefix + "MicroserviceDesc", this.MicroserviceDesc);

    }
}

