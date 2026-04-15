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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel {

    /**
    * <p>资源所属地域。<br>当前支持ap-shanghai</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>桶名，存储资源的唯一标识</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>cdn 域名</p>
    */
    @SerializedName("CdnDomain")
    @Expose
    private String CdnDomain;

    /**
    * <p>资源所属用户的腾讯云appId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>外部存储介质相关信息。</p>
    */
    @SerializedName("ExternalStorage")
    @Expose
    private ExternalStorage ExternalStorage;

    /**
     * Get <p>资源所属地域。<br>当前支持ap-shanghai</p> 
     * @return Region <p>资源所属地域。<br>当前支持ap-shanghai</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>资源所属地域。<br>当前支持ap-shanghai</p>
     * @param Region <p>资源所属地域。<br>当前支持ap-shanghai</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>桶名，存储资源的唯一标识</p> 
     * @return Bucket <p>桶名，存储资源的唯一标识</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>桶名，存储资源的唯一标识</p>
     * @param Bucket <p>桶名，存储资源的唯一标识</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>cdn 域名</p> 
     * @return CdnDomain <p>cdn 域名</p>
     */
    public String getCdnDomain() {
        return this.CdnDomain;
    }

    /**
     * Set <p>cdn 域名</p>
     * @param CdnDomain <p>cdn 域名</p>
     */
    public void setCdnDomain(String CdnDomain) {
        this.CdnDomain = CdnDomain;
    }

    /**
     * Get <p>资源所属用户的腾讯云appId</p> 
     * @return AppId <p>资源所属用户的腾讯云appId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>资源所属用户的腾讯云appId</p>
     * @param AppId <p>资源所属用户的腾讯云appId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>外部存储介质相关信息。</p> 
     * @return ExternalStorage <p>外部存储介质相关信息。</p>
     */
    public ExternalStorage getExternalStorage() {
        return this.ExternalStorage;
    }

    /**
     * Set <p>外部存储介质相关信息。</p>
     * @param ExternalStorage <p>外部存储介质相关信息。</p>
     */
    public void setExternalStorage(ExternalStorage ExternalStorage) {
        this.ExternalStorage = ExternalStorage;
    }

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.CdnDomain != null) {
            this.CdnDomain = new String(source.CdnDomain);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ExternalStorage != null) {
            this.ExternalStorage = new ExternalStorage(source.ExternalStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "CdnDomain", this.CdnDomain);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "ExternalStorage.", this.ExternalStorage);

    }
}

