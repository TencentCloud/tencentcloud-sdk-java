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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorPageReference extends AbstractModel {

    /**
    * 引用的业务 ID，如自定义拦截规则 ID。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
     * Get 引用的业务 ID，如自定义拦截规则 ID。 
     * @return BusinessId 引用的业务 ID，如自定义拦截规则 ID。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 引用的业务 ID，如自定义拦截规则 ID。
     * @param BusinessId 引用的业务 ID，如自定义拦截规则 ID。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    public ErrorPageReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorPageReference(ErrorPageReference source) {
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);

    }
}

