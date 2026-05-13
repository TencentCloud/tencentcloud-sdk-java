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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteResourceConfigsRequest extends AbstractModel {

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源版本数组</p>
    */
    @SerializedName("ResourceConfigVersions")
    @Expose
    private Long [] ResourceConfigVersions;

    /**
    * <p>工作空间 SerialId</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源版本数组</p> 
     * @return ResourceConfigVersions <p>资源版本数组</p>
     */
    public Long [] getResourceConfigVersions() {
        return this.ResourceConfigVersions;
    }

    /**
     * Set <p>资源版本数组</p>
     * @param ResourceConfigVersions <p>资源版本数组</p>
     */
    public void setResourceConfigVersions(Long [] ResourceConfigVersions) {
        this.ResourceConfigVersions = ResourceConfigVersions;
    }

    /**
     * Get <p>工作空间 SerialId</p> 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
     * @param WorkSpaceId <p>工作空间 SerialId</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public DeleteResourceConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteResourceConfigsRequest(DeleteResourceConfigsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceConfigVersions != null) {
            this.ResourceConfigVersions = new Long[source.ResourceConfigVersions.length];
            for (int i = 0; i < source.ResourceConfigVersions.length; i++) {
                this.ResourceConfigVersions[i] = new Long(source.ResourceConfigVersions[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "ResourceConfigVersions.", this.ResourceConfigVersions);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

