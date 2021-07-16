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

public class ModifyApiAppRequest extends AbstractModel{

    /**
    * 应用唯一 ID。
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * 修改的应用名称
    */
    @SerializedName("ApiAppName")
    @Expose
    private String ApiAppName;

    /**
    * 修改的应用描述
    */
    @SerializedName("ApiAppDesc")
    @Expose
    private String ApiAppDesc;

    /**
     * Get 应用唯一 ID。 
     * @return ApiAppId 应用唯一 ID。
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set 应用唯一 ID。
     * @param ApiAppId 应用唯一 ID。
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get 修改的应用名称 
     * @return ApiAppName 修改的应用名称
     */
    public String getApiAppName() {
        return this.ApiAppName;
    }

    /**
     * Set 修改的应用名称
     * @param ApiAppName 修改的应用名称
     */
    public void setApiAppName(String ApiAppName) {
        this.ApiAppName = ApiAppName;
    }

    /**
     * Get 修改的应用描述 
     * @return ApiAppDesc 修改的应用描述
     */
    public String getApiAppDesc() {
        return this.ApiAppDesc;
    }

    /**
     * Set 修改的应用描述
     * @param ApiAppDesc 修改的应用描述
     */
    public void setApiAppDesc(String ApiAppDesc) {
        this.ApiAppDesc = ApiAppDesc;
    }

    public ModifyApiAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiAppRequest(ModifyApiAppRequest source) {
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiAppName != null) {
            this.ApiAppName = new String(source.ApiAppName);
        }
        if (source.ApiAppDesc != null) {
            this.ApiAppDesc = new String(source.ApiAppDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiAppName", this.ApiAppName);
        this.setParamSimple(map, prefix + "ApiAppDesc", this.ApiAppDesc);

    }
}

