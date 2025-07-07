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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPackageAutoRenewRequest extends AbstractModel {

    /**
    * 资源ID。可以在控制台查看所有的资源
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * enable 开启自动续费；disable 关闭自动续费
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 资源ID。可以在控制台查看所有的资源 
     * @return ResourceId 资源ID。可以在控制台查看所有的资源
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID。可以在控制台查看所有的资源
     * @param ResourceId 资源ID。可以在控制台查看所有的资源
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get enable 开启自动续费；disable 关闭自动续费 
     * @return Status enable 开启自动续费；disable 关闭自动续费
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set enable 开启自动续费；disable 关闭自动续费
     * @param Status enable 开启自动续费；disable 关闭自动续费
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyPackageAutoRenewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPackageAutoRenewRequest(ModifyPackageAutoRenewRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

