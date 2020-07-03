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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel{

    /**
    * 资源所属地域。
当前支持ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 桶名，存储资源的唯一标识
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cdn 域名
    */
    @SerializedName("CdnDomain")
    @Expose
    private String CdnDomain;

    /**
    * 资源所属用户的腾讯云appId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get 资源所属地域。
当前支持ap-shanghai 
     * @return Region 资源所属地域。
当前支持ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源所属地域。
当前支持ap-shanghai
     * @param Region 资源所属地域。
当前支持ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 桶名，存储资源的唯一标识 
     * @return Bucket 桶名，存储资源的唯一标识
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶名，存储资源的唯一标识
     * @param Bucket 桶名，存储资源的唯一标识
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cdn 域名 
     * @return CdnDomain cdn 域名
     */
    public String getCdnDomain() {
        return this.CdnDomain;
    }

    /**
     * Set cdn 域名
     * @param CdnDomain cdn 域名
     */
    public void setCdnDomain(String CdnDomain) {
        this.CdnDomain = CdnDomain;
    }

    /**
     * Get 资源所属用户的腾讯云appId 
     * @return AppId 资源所属用户的腾讯云appId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 资源所属用户的腾讯云appId
     * @param AppId 资源所属用户的腾讯云appId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "CdnDomain", this.CdnDomain);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

