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

public class CloudResourceItem extends AbstractModel {

    /**
    * 资源所处地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 	云上资源列表。
    */
    @SerializedName("Items")
    @Expose
    private DspaCloudResourceMeta [] Items;

    /**
     * Get 资源所处地域。 
     * @return Region 资源所处地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源所处地域。
     * @param Region 资源所处地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 	云上资源列表。 
     * @return Items 	云上资源列表。
     */
    public DspaCloudResourceMeta [] getItems() {
        return this.Items;
    }

    /**
     * Set 	云上资源列表。
     * @param Items 	云上资源列表。
     */
    public void setItems(DspaCloudResourceMeta [] Items) {
        this.Items = Items;
    }

    public CloudResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudResourceItem(CloudResourceItem source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Items != null) {
            this.Items = new DspaCloudResourceMeta[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DspaCloudResourceMeta(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

