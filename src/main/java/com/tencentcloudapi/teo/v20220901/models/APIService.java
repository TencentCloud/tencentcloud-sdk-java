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

public class APIService extends AbstractModel {

    /**
    * API 服务 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * API 服务名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 基础路径。
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
     * Get API 服务 ID。 
     * @return Id API 服务 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set API 服务 ID。
     * @param Id API 服务 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get API 服务名称。 
     * @return Name API 服务名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API 服务名称。
     * @param Name API 服务名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 基础路径。 
     * @return BasePath 基础路径。
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set 基础路径。
     * @param BasePath 基础路径。
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    public APIService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIService(APIService source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);

    }
}

