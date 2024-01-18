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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareResource extends AbstractModel {

    /**
    * 共享资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 产品资源ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductResourceId")
    @Expose
    private String ProductResourceId;

    /**
     * Get 共享资源ID。 
     * @return ResourceId 共享资源ID。
     * @deprecated
     */
    @Deprecated
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 共享资源ID。
     * @param ResourceId 共享资源ID。
     * @deprecated
     */
    @Deprecated
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 产品资源ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductResourceId 产品资源ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductResourceId() {
        return this.ProductResourceId;
    }

    /**
     * Set 产品资源ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductResourceId 产品资源ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductResourceId(String ProductResourceId) {
        this.ProductResourceId = ProductResourceId;
    }

    public ShareResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareResource(ShareResource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ProductResourceId != null) {
            this.ProductResourceId = new String(source.ProductResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ProductResourceId", this.ProductResourceId);

    }
}

