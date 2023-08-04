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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListOrganizationChannelNumbersRequest extends AbstractModel{

    /**
    * 组织ID，json数组格式，最多一次支持10个组织
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
     * Get 组织ID，json数组格式，最多一次支持10个组织 
     * @return OrganizationId 组织ID，json数组格式，最多一次支持10个组织
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 组织ID，json数组格式，最多一次支持10个组织
     * @param OrganizationId 组织ID，json数组格式，最多一次支持10个组织
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    public ListOrganizationChannelNumbersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrganizationChannelNumbersRequest(ListOrganizationChannelNumbersRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String[source.OrganizationId.length];
            for (int i = 0; i < source.OrganizationId.length; i++) {
                this.OrganizationId[i] = new String(source.OrganizationId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);

    }
}

