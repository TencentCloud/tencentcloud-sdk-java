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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityInfo extends AbstractModel {

    /**
    * 是否是免费赠送：yes-是；no-不是
    */
    @SerializedName("IsDefendFree")
    @Expose
    private String IsDefendFree;

    /**
    * 防护类型
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 资源 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 是否是免费赠送：yes-是；no-不是 
     * @return IsDefendFree 是否是免费赠送：yes-是；no-不是
     */
    public String getIsDefendFree() {
        return this.IsDefendFree;
    }

    /**
     * Set 是否是免费赠送：yes-是；no-不是
     * @param IsDefendFree 是否是免费赠送：yes-是；no-不是
     */
    public void setIsDefendFree(String IsDefendFree) {
        this.IsDefendFree = IsDefendFree;
    }

    /**
     * Get 防护类型 
     * @return Key 防护类型
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 防护类型
     * @param Key 防护类型
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 资源 ID 
     * @return ResourceId 资源 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID
     * @param ResourceId 资源 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public SecurityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityInfo(SecurityInfo source) {
        if (source.IsDefendFree != null) {
            this.IsDefendFree = new String(source.IsDefendFree);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefendFree", this.IsDefendFree);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

