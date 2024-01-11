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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTDidByHostRequest extends AbstractModel {

    /**
    * DID应用ID
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 自定义DID文档json属性
    */
    @SerializedName("CustomAttribute")
    @Expose
    private String CustomAttribute;

    /**
     * Get DID应用ID 
     * @return DAPId DID应用ID
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用ID
     * @param DAPId DID应用ID
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 自定义DID文档json属性 
     * @return CustomAttribute 自定义DID文档json属性
     */
    public String getCustomAttribute() {
        return this.CustomAttribute;
    }

    /**
     * Set 自定义DID文档json属性
     * @param CustomAttribute 自定义DID文档json属性
     */
    public void setCustomAttribute(String CustomAttribute) {
        this.CustomAttribute = CustomAttribute;
    }

    public CreateTDidByHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTDidByHostRequest(CreateTDidByHostRequest source) {
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.CustomAttribute != null) {
            this.CustomAttribute = new String(source.CustomAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "CustomAttribute", this.CustomAttribute);

    }
}

