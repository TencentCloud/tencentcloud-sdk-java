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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelServiceAuthTokenRequest extends AbstractModel {

    /**
    * 服务组 id
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * token 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 服务组 id 
     * @return ServiceGroupId 服务组 id
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 服务组 id
     * @param ServiceGroupId 服务组 id
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get token 名称 
     * @return Name token 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set token 名称
     * @param Name token 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description 描述 
     * @return Description Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description 描述
     * @param Description Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateModelServiceAuthTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelServiceAuthTokenRequest(CreateModelServiceAuthTokenRequest source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

