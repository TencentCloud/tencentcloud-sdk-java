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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailSyncFailure extends AbstractModel {

    /**
    * <p>资源类型；策略级错误时为 policy</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>底层 Kong Route ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>错误摘要</p>
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get <p>资源类型；策略级错误时为 policy</p> 
     * @return ResourceType <p>资源类型；策略级错误时为 policy</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型；策略级错误时为 policy</p>
     * @param ResourceType <p>资源类型；策略级错误时为 policy</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源 ID</p> 
     * @return ResourceId <p>资源 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 ID</p>
     * @param ResourceId <p>资源 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>底层 Kong Route ID</p> 
     * @return RouteId <p>底层 Kong Route ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>底层 Kong Route ID</p>
     * @param RouteId <p>底层 Kong Route ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>错误摘要</p> 
     * @return Error <p>错误摘要</p>
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set <p>错误摘要</p>
     * @param Error <p>错误摘要</p>
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public CustomGuardrailSyncFailure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailSyncFailure(CustomGuardrailSyncFailure source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

