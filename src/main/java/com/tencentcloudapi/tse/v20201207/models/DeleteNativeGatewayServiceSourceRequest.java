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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNativeGatewayServiceSourceRequest extends AbstractModel {

    /**
    * 网关实例 ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * 服务来源实例 ID
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
     * Get 网关实例 ID 
     * @return GatewayID 网关实例 ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set 网关实例 ID
     * @param GatewayID 网关实例 ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get 服务来源实例 ID 
     * @return SourceID 服务来源实例 ID
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set 服务来源实例 ID
     * @param SourceID 服务来源实例 ID
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    public DeleteNativeGatewayServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNativeGatewayServiceSourceRequest(DeleteNativeGatewayServiceSourceRequest source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);

    }
}

