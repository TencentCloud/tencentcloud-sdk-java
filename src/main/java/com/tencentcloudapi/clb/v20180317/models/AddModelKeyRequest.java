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

public class AddModelKeyRequest extends AbstractModel {

    /**
    * <p>服务提供商ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>Key 列表，至少 1 个，最多 10 个</p>
    */
    @SerializedName("Keys")
    @Expose
    private KeyItem [] Keys;

    /**
     * Get <p>服务提供商ID</p> 
     * @return ServiceProviderId <p>服务提供商ID</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>服务提供商ID</p>
     * @param ServiceProviderId <p>服务提供商ID</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>Key 列表，至少 1 个，最多 10 个</p> 
     * @return Keys <p>Key 列表，至少 1 个，最多 10 个</p>
     */
    public KeyItem [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>Key 列表，至少 1 个，最多 10 个</p>
     * @param Keys <p>Key 列表，至少 1 个，最多 10 个</p>
     */
    public void setKeys(KeyItem [] Keys) {
        this.Keys = Keys;
    }

    public AddModelKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddModelKeyRequest(AddModelKeyRequest source) {
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.Keys != null) {
            this.Keys = new KeyItem[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new KeyItem(source.Keys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);

    }
}

