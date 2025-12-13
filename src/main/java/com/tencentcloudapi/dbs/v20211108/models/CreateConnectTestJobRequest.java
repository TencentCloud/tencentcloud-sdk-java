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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConnectTestJobRequest extends AbstractModel {

    /**
    * 备份源实例信息。
    */
    @SerializedName("Endpoint")
    @Expose
    private BackupEndpoint Endpoint;

    /**
     * Get 备份源实例信息。 
     * @return Endpoint 备份源实例信息。
     */
    public BackupEndpoint getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 备份源实例信息。
     * @param Endpoint 备份源实例信息。
     */
    public void setEndpoint(BackupEndpoint Endpoint) {
        this.Endpoint = Endpoint;
    }

    public CreateConnectTestJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConnectTestJobRequest(CreateConnectTestJobRequest source) {
        if (source.Endpoint != null) {
            this.Endpoint = new BackupEndpoint(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Endpoint.", this.Endpoint);

    }
}

