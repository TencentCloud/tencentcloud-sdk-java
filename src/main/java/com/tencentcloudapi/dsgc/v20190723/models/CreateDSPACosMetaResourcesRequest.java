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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPACosMetaResourcesRequest extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 资源所处地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * COS桶列表
    */
    @SerializedName("Buckets")
    @Expose
    private String [] Buckets;

    /**
    * 必填，COS资源列表
    */
    @SerializedName("CosBucketItems")
    @Expose
    private CosBucketItem [] CosBucketItems;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 资源所处地域。 
     * @return ResourceRegion 资源所处地域。
     * @deprecated
     */
    @Deprecated
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所处地域。
     * @param ResourceRegion 资源所处地域。
     * @deprecated
     */
    @Deprecated
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get COS桶列表 
     * @return Buckets COS桶列表
     * @deprecated
     */
    @Deprecated
    public String [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set COS桶列表
     * @param Buckets COS桶列表
     * @deprecated
     */
    @Deprecated
    public void setBuckets(String [] Buckets) {
        this.Buckets = Buckets;
    }

    /**
     * Get 必填，COS资源列表 
     * @return CosBucketItems 必填，COS资源列表
     */
    public CosBucketItem [] getCosBucketItems() {
        return this.CosBucketItems;
    }

    /**
     * Set 必填，COS资源列表
     * @param CosBucketItems 必填，COS资源列表
     */
    public void setCosBucketItems(CosBucketItem [] CosBucketItems) {
        this.CosBucketItems = CosBucketItems;
    }

    public CreateDSPACosMetaResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPACosMetaResourcesRequest(CreateDSPACosMetaResourcesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.Buckets != null) {
            this.Buckets = new String[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new String(source.Buckets[i]);
            }
        }
        if (source.CosBucketItems != null) {
            this.CosBucketItems = new CosBucketItem[source.CosBucketItems.length];
            for (int i = 0; i < source.CosBucketItems.length; i++) {
                this.CosBucketItems[i] = new CosBucketItem(source.CosBucketItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArraySimple(map, prefix + "Buckets.", this.Buckets);
        this.setParamArrayObj(map, prefix + "CosBucketItems.", this.CosBucketItems);

    }
}

