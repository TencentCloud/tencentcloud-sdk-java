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

public class DescribeResourcePermissionResult extends AbstractModel {

    /**
    * 查询到的资源总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资源权限列表
    */
    @SerializedName("PermissionList")
    @Expose
    private ResourcePermission [] PermissionList;

    /**
     * Get 查询到的资源总数 
     * @return TotalCount 查询到的资源总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询到的资源总数
     * @param TotalCount 查询到的资源总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资源权限列表 
     * @return PermissionList 资源权限列表
     */
    public ResourcePermission [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set 资源权限列表
     * @param PermissionList 资源权限列表
     */
    public void setPermissionList(ResourcePermission [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    public DescribeResourcePermissionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePermissionResult(DescribeResourcePermissionResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PermissionList != null) {
            this.PermissionList = new ResourcePermission[source.PermissionList.length];
            for (int i = 0; i < source.PermissionList.length; i++) {
                this.PermissionList[i] = new ResourcePermission(source.PermissionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PermissionList.", this.PermissionList);

    }
}

