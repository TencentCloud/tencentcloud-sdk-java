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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModelAttributesRequest extends AbstractModel {

    /**
    * <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>BYOK的自定义名字</p><p>入参限制：1～256个字符</p>
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
     * Get <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p> 
     * @return ServiceProviderId <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
     * @param ServiceProviderId <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>BYOK的自定义名字</p><p>入参限制：1～256个字符</p> 
     * @return ServiceProviderName <p>BYOK的自定义名字</p><p>入参限制：1～256个字符</p>
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>BYOK的自定义名字</p><p>入参限制：1～256个字符</p>
     * @param ServiceProviderName <p>BYOK的自定义名字</p><p>入参限制：1～256个字符</p>
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    public ModifyModelAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelAttributesRequest(ModifyModelAttributesRequest source) {
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);

    }
}

