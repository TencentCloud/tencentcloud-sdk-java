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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel {

    /**
    * 存储桶 ID。
    */
    @SerializedName("BucketId")
    @Expose
    private String BucketId;

    /**
    * 存储名称。
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * 存储所在区域。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 存储公网源站访问域名的状态，取值有：
<li>ONLINE：已生效；</li>
<li>DEPLOYING： 部署中。</li>
    */
    @SerializedName("InternetAccessDomainStatus")
    @Expose
    private String InternetAccessDomainStatus;

    /**
    * 存储公网源站访问域名。
    */
    @SerializedName("InternetAccessDomain")
    @Expose
    private String InternetAccessDomain;

    /**
    * 存储的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 存储桶 ID。 
     * @return BucketId 存储桶 ID。
     */
    public String getBucketId() {
        return this.BucketId;
    }

    /**
     * Set 存储桶 ID。
     * @param BucketId 存储桶 ID。
     */
    public void setBucketId(String BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get 存储名称。 
     * @return StorageName 存储名称。
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set 存储名称。
     * @param StorageName 存储名称。
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get 存储所在区域。 
     * @return StorageRegion 存储所在区域。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 存储所在区域。
     * @param StorageRegion 存储所在区域。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 存储公网源站访问域名的状态，取值有：
<li>ONLINE：已生效；</li>
<li>DEPLOYING： 部署中。</li> 
     * @return InternetAccessDomainStatus 存储公网源站访问域名的状态，取值有：
<li>ONLINE：已生效；</li>
<li>DEPLOYING： 部署中。</li>
     */
    public String getInternetAccessDomainStatus() {
        return this.InternetAccessDomainStatus;
    }

    /**
     * Set 存储公网源站访问域名的状态，取值有：
<li>ONLINE：已生效；</li>
<li>DEPLOYING： 部署中。</li>
     * @param InternetAccessDomainStatus 存储公网源站访问域名的状态，取值有：
<li>ONLINE：已生效；</li>
<li>DEPLOYING： 部署中。</li>
     */
    public void setInternetAccessDomainStatus(String InternetAccessDomainStatus) {
        this.InternetAccessDomainStatus = InternetAccessDomainStatus;
    }

    /**
     * Get 存储公网源站访问域名。 
     * @return InternetAccessDomain 存储公网源站访问域名。
     */
    public String getInternetAccessDomain() {
        return this.InternetAccessDomain;
    }

    /**
     * Set 存储公网源站访问域名。
     * @param InternetAccessDomain 存储公网源站访问域名。
     */
    public void setInternetAccessDomain(String InternetAccessDomain) {
        this.InternetAccessDomain = InternetAccessDomain;
    }

    /**
     * Get 存储的创建时间。 
     * @return CreateTime 存储的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 存储的创建时间。
     * @param CreateTime 存储的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.InternetAccessDomainStatus != null) {
            this.InternetAccessDomainStatus = new String(source.InternetAccessDomainStatus);
        }
        if (source.InternetAccessDomain != null) {
            this.InternetAccessDomain = new String(source.InternetAccessDomain);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "InternetAccessDomainStatus", this.InternetAccessDomainStatus);
        this.setParamSimple(map, prefix + "InternetAccessDomain", this.InternetAccessDomain);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

