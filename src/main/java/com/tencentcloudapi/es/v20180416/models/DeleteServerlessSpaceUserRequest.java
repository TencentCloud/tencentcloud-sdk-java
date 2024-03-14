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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteServerlessSpaceUserRequest extends AbstractModel {

    /**
    * 空间的ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 创建索引的用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get 空间的ID 
     * @return SpaceId 空间的ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间的ID
     * @param SpaceId 空间的ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 创建索引的用户名 
     * @return Username 创建索引的用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 创建索引的用户名
     * @param Username 创建索引的用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public DeleteServerlessSpaceUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServerlessSpaceUserRequest(DeleteServerlessSpaceUserRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

