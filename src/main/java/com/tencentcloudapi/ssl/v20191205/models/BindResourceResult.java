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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindResourceResult extends AbstractModel {

    /**
    * 资源类型：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 绑定资源地域结果
    */
    @SerializedName("BindResourceRegionResult")
    @Expose
    private BindResourceRegionResult [] BindResourceRegionResult;

    /**
     * Get 资源类型：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne） 
     * @return ResourceType 资源类型：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）
     * @param ResourceType 资源类型：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 绑定资源地域结果 
     * @return BindResourceRegionResult 绑定资源地域结果
     */
    public BindResourceRegionResult [] getBindResourceRegionResult() {
        return this.BindResourceRegionResult;
    }

    /**
     * Set 绑定资源地域结果
     * @param BindResourceRegionResult 绑定资源地域结果
     */
    public void setBindResourceRegionResult(BindResourceRegionResult [] BindResourceRegionResult) {
        this.BindResourceRegionResult = BindResourceRegionResult;
    }

    public BindResourceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindResourceResult(BindResourceResult source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.BindResourceRegionResult != null) {
            this.BindResourceRegionResult = new BindResourceRegionResult[source.BindResourceRegionResult.length];
            for (int i = 0; i < source.BindResourceRegionResult.length; i++) {
                this.BindResourceRegionResult[i] = new BindResourceRegionResult(source.BindResourceRegionResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "BindResourceRegionResult.", this.BindResourceRegionResult);

    }
}

