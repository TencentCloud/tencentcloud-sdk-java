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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingResourceInstanceRunningJobsRequest extends AbstractModel {

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组节点id
    */
    @SerializedName("ResourceInstanceId")
    @Expose
    private String ResourceInstanceId;

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组节点id 
     * @return ResourceInstanceId 资源组节点id
     */
    public String getResourceInstanceId() {
        return this.ResourceInstanceId;
    }

    /**
     * Set 资源组节点id
     * @param ResourceInstanceId 资源组节点id
     */
    public void setResourceInstanceId(String ResourceInstanceId) {
        this.ResourceInstanceId = ResourceInstanceId;
    }

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    public DescribeBillingResourceInstanceRunningJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingResourceInstanceRunningJobsRequest(DescribeBillingResourceInstanceRunningJobsRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceInstanceId != null) {
            this.ResourceInstanceId = new String(source.ResourceInstanceId);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceInstanceId", this.ResourceInstanceId);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);

    }
}

