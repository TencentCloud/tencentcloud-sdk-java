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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEngineInternetAccessRequest extends AbstractModel{

    /**
    * 引擎ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 引擎类型
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 是否开启客户端公网访问，true开 false关
    */
    @SerializedName("EnableClientInternetAccess")
    @Expose
    private Boolean EnableClientInternetAccess;

    /**
     * Get 引擎ID 
     * @return InstanceId 引擎ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 引擎ID
     * @param InstanceId 引擎ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 引擎类型 
     * @return EngineType 引擎类型
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型
     * @param EngineType 引擎类型
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 是否开启客户端公网访问，true开 false关 
     * @return EnableClientInternetAccess 是否开启客户端公网访问，true开 false关
     */
    public Boolean getEnableClientInternetAccess() {
        return this.EnableClientInternetAccess;
    }

    /**
     * Set 是否开启客户端公网访问，true开 false关
     * @param EnableClientInternetAccess 是否开启客户端公网访问，true开 false关
     */
    public void setEnableClientInternetAccess(Boolean EnableClientInternetAccess) {
        this.EnableClientInternetAccess = EnableClientInternetAccess;
    }

    public UpdateEngineInternetAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEngineInternetAccessRequest(UpdateEngineInternetAccessRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.EnableClientInternetAccess != null) {
            this.EnableClientInternetAccess = new Boolean(source.EnableClientInternetAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "EnableClientInternetAccess", this.EnableClientInternetAccess);

    }
}

