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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditStorageParams extends AbstractModel {

    /**
    * 腾讯云对象存储COS以及第三方云存储的账号信息
    */
    @SerializedName("CloudAuditStorage")
    @Expose
    private CloudAuditStorage CloudAuditStorage;

    /**
     * Get 腾讯云对象存储COS以及第三方云存储的账号信息 
     * @return CloudAuditStorage 腾讯云对象存储COS以及第三方云存储的账号信息
     */
    public CloudAuditStorage getCloudAuditStorage() {
        return this.CloudAuditStorage;
    }

    /**
     * Set 腾讯云对象存储COS以及第三方云存储的账号信息
     * @param CloudAuditStorage 腾讯云对象存储COS以及第三方云存储的账号信息
     */
    public void setCloudAuditStorage(CloudAuditStorage CloudAuditStorage) {
        this.CloudAuditStorage = CloudAuditStorage;
    }

    public AuditStorageParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditStorageParams(AuditStorageParams source) {
        if (source.CloudAuditStorage != null) {
            this.CloudAuditStorage = new CloudAuditStorage(source.CloudAuditStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CloudAuditStorage.", this.CloudAuditStorage);

    }
}

