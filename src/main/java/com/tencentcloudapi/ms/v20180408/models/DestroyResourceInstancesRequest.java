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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestroyResourceInstancesRequest extends AbstractModel {

    /**
    * ResourceId 资源id，在创建订单时，返回的resourceId
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源绑定的包名，为了防止误删除，需要指定绑定时的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
     * Get ResourceId 资源id，在创建订单时，返回的resourceId 
     * @return ResourceId ResourceId 资源id，在创建订单时，返回的resourceId
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set ResourceId 资源id，在创建订单时，返回的resourceId
     * @param ResourceId ResourceId 资源id，在创建订单时，返回的resourceId
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源绑定的包名，为了防止误删除，需要指定绑定时的包名 
     * @return AppPkgName 资源绑定的包名，为了防止误删除，需要指定绑定时的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set 资源绑定的包名，为了防止误删除，需要指定绑定时的包名
     * @param AppPkgName 资源绑定的包名，为了防止误删除，需要指定绑定时的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    public DestroyResourceInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestroyResourceInstancesRequest(DestroyResourceInstancesRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);

    }
}

