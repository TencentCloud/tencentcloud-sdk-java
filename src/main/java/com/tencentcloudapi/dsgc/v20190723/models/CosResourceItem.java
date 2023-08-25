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

public class CosResourceItem extends AbstractModel{

    /**
    * cos数据源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 桶所在地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 桶名称。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get cos数据源ID。 
     * @return ResourceId cos数据源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set cos数据源ID。
     * @param ResourceId cos数据源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 桶所在地域。 
     * @return ResourceRegion 桶所在地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 桶所在地域。
     * @param ResourceRegion 桶所在地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 桶名称。 
     * @return ResourceName 桶名称。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 桶名称。
     * @param ResourceName 桶名称。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public CosResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosResourceItem(CosResourceItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

