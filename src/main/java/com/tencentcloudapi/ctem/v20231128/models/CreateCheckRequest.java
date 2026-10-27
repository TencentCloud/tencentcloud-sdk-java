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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCheckRequest extends AbstractModel {

    /**
    * <p>漏洞情报ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private String VulId;

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
     * Get <p>漏洞情报ID</p> 
     * @return VulId <p>漏洞情报ID</p>
     */
    public String getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>漏洞情报ID</p>
     * @param VulId <p>漏洞情报ID</p>
     */
    public void setVulId(String VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>企业ID</p> 
     * @return CustomerId <p>企业ID</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CustomerId <p>企业ID</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public CreateCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCheckRequest(CreateCheckRequest source) {
        if (source.VulId != null) {
            this.VulId = new String(source.VulId);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);

    }
}

