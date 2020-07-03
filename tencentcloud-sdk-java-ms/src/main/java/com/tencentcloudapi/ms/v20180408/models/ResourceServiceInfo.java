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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceServiceInfo extends AbstractModel{

    /**
    * 创建时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 到期时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 资源名称，如应用加固，源码混淆
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get 创建时间戳 
     * @return CreateTime 创建时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳
     * @param CreateTime 创建时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 到期时间戳 
     * @return ExpireTime 到期时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间戳
     * @param ExpireTime 到期时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源名称，如应用加固，源码混淆 
     * @return ResourceName 资源名称，如应用加固，源码混淆
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，如应用加固，源码混淆
     * @param ResourceName 资源名称，如应用加固，源码混淆
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

