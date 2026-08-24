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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDrillPairsRequest extends AbstractModel {

    /**
    * 要删除演练对的类型，其类型枚举跟复制对保持一致。枚举值：DISK / INSTANCE / CFS。
    */
    @SerializedName("DrillPairType")
    @Expose
    private String DrillPairType;

    /**
    * 要删除的演练对列表。长度范围 [1, 10]。
    */
    @SerializedName("DrillPairIds")
    @Expose
    private String [] DrillPairIds;

    /**
    * 要删除的演练组id列表。
    */
    @SerializedName("DrillGroupIds")
    @Expose
    private String [] DrillGroupIds;

    /**
    * 是否一并删除演练CFS/CVM/DISK演练资源。
    */
    @SerializedName("DeleteDrillResource")
    @Expose
    private Boolean DeleteDrillResource;

    /**
     * Get 要删除演练对的类型，其类型枚举跟复制对保持一致。枚举值：DISK / INSTANCE / CFS。 
     * @return DrillPairType 要删除演练对的类型，其类型枚举跟复制对保持一致。枚举值：DISK / INSTANCE / CFS。
     */
    public String getDrillPairType() {
        return this.DrillPairType;
    }

    /**
     * Set 要删除演练对的类型，其类型枚举跟复制对保持一致。枚举值：DISK / INSTANCE / CFS。
     * @param DrillPairType 要删除演练对的类型，其类型枚举跟复制对保持一致。枚举值：DISK / INSTANCE / CFS。
     */
    public void setDrillPairType(String DrillPairType) {
        this.DrillPairType = DrillPairType;
    }

    /**
     * Get 要删除的演练对列表。长度范围 [1, 10]。 
     * @return DrillPairIds 要删除的演练对列表。长度范围 [1, 10]。
     */
    public String [] getDrillPairIds() {
        return this.DrillPairIds;
    }

    /**
     * Set 要删除的演练对列表。长度范围 [1, 10]。
     * @param DrillPairIds 要删除的演练对列表。长度范围 [1, 10]。
     */
    public void setDrillPairIds(String [] DrillPairIds) {
        this.DrillPairIds = DrillPairIds;
    }

    /**
     * Get 要删除的演练组id列表。 
     * @return DrillGroupIds 要删除的演练组id列表。
     */
    public String [] getDrillGroupIds() {
        return this.DrillGroupIds;
    }

    /**
     * Set 要删除的演练组id列表。
     * @param DrillGroupIds 要删除的演练组id列表。
     */
    public void setDrillGroupIds(String [] DrillGroupIds) {
        this.DrillGroupIds = DrillGroupIds;
    }

    /**
     * Get 是否一并删除演练CFS/CVM/DISK演练资源。 
     * @return DeleteDrillResource 是否一并删除演练CFS/CVM/DISK演练资源。
     */
    public Boolean getDeleteDrillResource() {
        return this.DeleteDrillResource;
    }

    /**
     * Set 是否一并删除演练CFS/CVM/DISK演练资源。
     * @param DeleteDrillResource 是否一并删除演练CFS/CVM/DISK演练资源。
     */
    public void setDeleteDrillResource(Boolean DeleteDrillResource) {
        this.DeleteDrillResource = DeleteDrillResource;
    }

    public DeleteDrillPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDrillPairsRequest(DeleteDrillPairsRequest source) {
        if (source.DrillPairType != null) {
            this.DrillPairType = new String(source.DrillPairType);
        }
        if (source.DrillPairIds != null) {
            this.DrillPairIds = new String[source.DrillPairIds.length];
            for (int i = 0; i < source.DrillPairIds.length; i++) {
                this.DrillPairIds[i] = new String(source.DrillPairIds[i]);
            }
        }
        if (source.DrillGroupIds != null) {
            this.DrillGroupIds = new String[source.DrillGroupIds.length];
            for (int i = 0; i < source.DrillGroupIds.length; i++) {
                this.DrillGroupIds[i] = new String(source.DrillGroupIds[i]);
            }
        }
        if (source.DeleteDrillResource != null) {
            this.DeleteDrillResource = new Boolean(source.DeleteDrillResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrillPairType", this.DrillPairType);
        this.setParamArraySimple(map, prefix + "DrillPairIds.", this.DrillPairIds);
        this.setParamArraySimple(map, prefix + "DrillGroupIds.", this.DrillGroupIds);
        this.setParamSimple(map, prefix + "DeleteDrillResource", this.DeleteDrillResource);

    }
}

