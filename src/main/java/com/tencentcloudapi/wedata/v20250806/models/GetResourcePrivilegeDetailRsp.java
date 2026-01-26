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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourcePrivilegeDetailRsp extends AbstractModel {

    /**
    * 权限详情列表
    */
    @SerializedName("Details")
    @Expose
    private ResourcePrivilegeDetail [] Details;

    /**
    * 总计
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 权限详情列表 
     * @return Details 权限详情列表
     */
    public ResourcePrivilegeDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 权限详情列表
     * @param Details 权限详情列表
     */
    public void setDetails(ResourcePrivilegeDetail [] Details) {
        this.Details = Details;
    }

    /**
     * Get 总计 
     * @return TotalCount 总计
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总计
     * @param TotalCount 总计
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public GetResourcePrivilegeDetailRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourcePrivilegeDetailRsp(GetResourcePrivilegeDetailRsp source) {
        if (source.Details != null) {
            this.Details = new ResourcePrivilegeDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ResourcePrivilegeDetail(source.Details[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

