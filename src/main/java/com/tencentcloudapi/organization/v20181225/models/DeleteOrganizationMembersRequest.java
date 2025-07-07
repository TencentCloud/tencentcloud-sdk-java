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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrganizationMembersRequest extends AbstractModel {

    /**
    * 被删除成员的UIN列表
    */
    @SerializedName("Uins")
    @Expose
    private Long [] Uins;

    /**
     * Get 被删除成员的UIN列表 
     * @return Uins 被删除成员的UIN列表
     */
    public Long [] getUins() {
        return this.Uins;
    }

    /**
     * Set 被删除成员的UIN列表
     * @param Uins 被删除成员的UIN列表
     */
    public void setUins(Long [] Uins) {
        this.Uins = Uins;
    }

    public DeleteOrganizationMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrganizationMembersRequest(DeleteOrganizationMembersRequest source) {
        if (source.Uins != null) {
            this.Uins = new Long[source.Uins.length];
            for (int i = 0; i < source.Uins.length; i++) {
                this.Uins[i] = new Long(source.Uins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);

    }
}

