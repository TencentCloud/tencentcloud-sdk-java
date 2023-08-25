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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPACosMetaResourcesRequest extends AbstractModel{

    /**
    * 资源所处地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * COS桶列表
    */
    @SerializedName("Buckets")
    @Expose
    private String [] Buckets;

    /**
     * Get 资源所处地域。 
     * @return ResourceRegion 资源所处地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所处地域。
     * @param ResourceRegion 资源所处地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

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
     * Get COS桶列表 
     * @return Buckets COS桶列表
     */
    public String [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set COS桶列表
     * @param Buckets COS桶列表
     */
    public void setBuckets(String [] Buckets) {
        this.Buckets = Buckets;
    }

    public CreateDSPACosMetaResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPACosMetaResourcesRequest(CreateDSPACosMetaResourcesRequest source) {
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Buckets != null) {
            this.Buckets = new String[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new String(source.Buckets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamArraySimple(map, prefix + "Buckets.", this.Buckets);

    }
}

