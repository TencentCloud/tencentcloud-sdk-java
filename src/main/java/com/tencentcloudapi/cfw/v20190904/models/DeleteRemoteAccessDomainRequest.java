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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRemoteAccessDomainRequest extends AbstractModel {

    /**
    * 域名列表
    */
    @SerializedName("AccessDomainList")
    @Expose
    private String [] AccessDomainList;

    /**
     * Get 域名列表 
     * @return AccessDomainList 域名列表
     */
    public String [] getAccessDomainList() {
        return this.AccessDomainList;
    }

    /**
     * Set 域名列表
     * @param AccessDomainList 域名列表
     */
    public void setAccessDomainList(String [] AccessDomainList) {
        this.AccessDomainList = AccessDomainList;
    }

    public DeleteRemoteAccessDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRemoteAccessDomainRequest(DeleteRemoteAccessDomainRequest source) {
        if (source.AccessDomainList != null) {
            this.AccessDomainList = new String[source.AccessDomainList.length];
            for (int i = 0; i < source.AccessDomainList.length; i++) {
                this.AccessDomainList[i] = new String(source.AccessDomainList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AccessDomainList.", this.AccessDomainList);

    }
}

