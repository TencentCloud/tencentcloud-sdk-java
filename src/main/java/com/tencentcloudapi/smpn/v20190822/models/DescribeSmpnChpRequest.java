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
package com.tencentcloudapi.smpn.v20190822.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmpnChpRequest extends AbstractModel {

    /**
    * 客户用于计费的资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 终端骚扰保护请求
    */
    @SerializedName("RequestData")
    @Expose
    private CHPRequest RequestData;

    /**
     * Get 客户用于计费的资源Id 
     * @return ResourceId 客户用于计费的资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 客户用于计费的资源Id
     * @param ResourceId 客户用于计费的资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 终端骚扰保护请求 
     * @return RequestData 终端骚扰保护请求
     */
    public CHPRequest getRequestData() {
        return this.RequestData;
    }

    /**
     * Set 终端骚扰保护请求
     * @param RequestData 终端骚扰保护请求
     */
    public void setRequestData(CHPRequest RequestData) {
        this.RequestData = RequestData;
    }

    public DescribeSmpnChpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmpnChpRequest(DescribeSmpnChpRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RequestData != null) {
            this.RequestData = new CHPRequest(source.RequestData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "RequestData.", this.RequestData);

    }
}

