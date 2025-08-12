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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCreateGatewayApiStatusRequest extends AbstractModel {

    /**
    * 网关分组ID。该参数可以通过调用 [DescribeApiGroups](https://cloud.tencent.com/document/product/649/50636) 的返回值中的 GroupId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/app?tab=middleware&subTab=app)-网关应用详情-Java网关实例-实例详情-分组管理页查看；也可以调用[CreateApiGroup](https://cloud.tencent.com/document/product/649/50641)创建新的网关分组。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 微服务ID。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
     * Get 网关分组ID。该参数可以通过调用 [DescribeApiGroups](https://cloud.tencent.com/document/product/649/50636) 的返回值中的 GroupId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/app?tab=middleware&subTab=app)-网关应用详情-Java网关实例-实例详情-分组管理页查看；也可以调用[CreateApiGroup](https://cloud.tencent.com/document/product/649/50641)创建新的网关分组。 
     * @return GroupId 网关分组ID。该参数可以通过调用 [DescribeApiGroups](https://cloud.tencent.com/document/product/649/50636) 的返回值中的 GroupId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/app?tab=middleware&subTab=app)-网关应用详情-Java网关实例-实例详情-分组管理页查看；也可以调用[CreateApiGroup](https://cloud.tencent.com/document/product/649/50641)创建新的网关分组。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 网关分组ID。该参数可以通过调用 [DescribeApiGroups](https://cloud.tencent.com/document/product/649/50636) 的返回值中的 GroupId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/app?tab=middleware&subTab=app)-网关应用详情-Java网关实例-实例详情-分组管理页查看；也可以调用[CreateApiGroup](https://cloud.tencent.com/document/product/649/50641)创建新的网关分组。
     * @param GroupId 网关分组ID。该参数可以通过调用 [DescribeApiGroups](https://cloud.tencent.com/document/product/649/50636) 的返回值中的 GroupId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/app?tab=middleware&subTab=app)-网关应用详情-Java网关实例-实例详情-分组管理页查看；也可以调用[CreateApiGroup](https://cloud.tencent.com/document/product/649/50641)创建新的网关分组。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 微服务ID。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。 
     * @return MicroserviceId 微服务ID。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 微服务ID。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     * @param MicroserviceId 微服务ID。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    public DescribeCreateGatewayApiStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreateGatewayApiStatusRequest(DescribeCreateGatewayApiStatusRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);

    }
}

