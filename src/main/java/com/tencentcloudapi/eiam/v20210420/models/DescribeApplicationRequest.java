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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationRequest extends AbstractModel{

    /**
    * 应用id，是应用的全局唯一标识，与ClientId参数不能同时为空。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 客户端id，与ApplicationId参数不能同时为空。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
     * Get 应用id，是应用的全局唯一标识，与ClientId参数不能同时为空。 
     * @return ApplicationId 应用id，是应用的全局唯一标识，与ClientId参数不能同时为空。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id，是应用的全局唯一标识，与ClientId参数不能同时为空。
     * @param ApplicationId 应用id，是应用的全局唯一标识，与ClientId参数不能同时为空。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 客户端id，与ApplicationId参数不能同时为空。 
     * @return ClientId 客户端id，与ApplicationId参数不能同时为空。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id，与ApplicationId参数不能同时为空。
     * @param ClientId 客户端id，与ApplicationId参数不能同时为空。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public DescribeApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationRequest(DescribeApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);

    }
}

