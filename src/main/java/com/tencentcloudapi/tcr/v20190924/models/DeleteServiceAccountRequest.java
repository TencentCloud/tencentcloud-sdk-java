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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteServiceAccountRequest extends AbstractModel {

    /**
    * 实例Id	
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 服务级账号名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 实例Id	 
     * @return RegistryId 实例Id	
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id	
     * @param RegistryId 实例Id	
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 服务级账号名 
     * @return Name 服务级账号名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务级账号名
     * @param Name 服务级账号名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeleteServiceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServiceAccountRequest(DeleteServiceAccountRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

