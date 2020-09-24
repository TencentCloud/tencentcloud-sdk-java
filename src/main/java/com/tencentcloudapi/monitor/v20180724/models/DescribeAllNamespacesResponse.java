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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllNamespacesResponse extends AbstractModel{

    /**
    * 云产品的名字空间
    */
    @SerializedName("QceNamespaces")
    @Expose
    private CommonNamespace QceNamespaces;

    /**
    * 自定义监控的命名空间
    */
    @SerializedName("CustomNamespaces")
    @Expose
    private CommonNamespace CustomNamespaces;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云产品的名字空间 
     * @return QceNamespaces 云产品的名字空间
     */
    public CommonNamespace getQceNamespaces() {
        return this.QceNamespaces;
    }

    /**
     * Set 云产品的名字空间
     * @param QceNamespaces 云产品的名字空间
     */
    public void setQceNamespaces(CommonNamespace QceNamespaces) {
        this.QceNamespaces = QceNamespaces;
    }

    /**
     * Get 自定义监控的命名空间 
     * @return CustomNamespaces 自定义监控的命名空间
     */
    public CommonNamespace getCustomNamespaces() {
        return this.CustomNamespaces;
    }

    /**
     * Set 自定义监控的命名空间
     * @param CustomNamespaces 自定义监控的命名空间
     */
    public void setCustomNamespaces(CommonNamespace CustomNamespaces) {
        this.CustomNamespaces = CustomNamespaces;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QceNamespaces.", this.QceNamespaces);
        this.setParamObj(map, prefix + "CustomNamespaces.", this.CustomNamespaces);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

