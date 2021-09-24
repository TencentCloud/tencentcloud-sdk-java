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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExternalClusterSpecResponse extends AbstractModel{

    /**
    * 导入第三方集群YAML定义
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * agent.yaml文件过期时间字符串，时区UTC
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 导入第三方集群YAML定义 
     * @return Spec 导入第三方集群YAML定义
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 导入第三方集群YAML定义
     * @param Spec 导入第三方集群YAML定义
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get agent.yaml文件过期时间字符串，时区UTC 
     * @return Expiration agent.yaml文件过期时间字符串，时区UTC
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set agent.yaml文件过期时间字符串，时区UTC
     * @param Expiration agent.yaml文件过期时间字符串，时区UTC
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
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

    public DescribeExternalClusterSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalClusterSpecResponse(DescribeExternalClusterSpecResponse source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

