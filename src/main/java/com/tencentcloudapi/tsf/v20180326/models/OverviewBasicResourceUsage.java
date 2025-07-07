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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewBasicResourceUsage extends AbstractModel {

    /**
    * 应用总数
    */
    @SerializedName("ApplicationCount")
    @Expose
    private Long ApplicationCount;

    /**
    * 命名空间总数
    */
    @SerializedName("NamespaceCount")
    @Expose
    private Long NamespaceCount;

    /**
    * 部署组个数
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * 程序包存储空间用量，单位字节
    */
    @SerializedName("PackageSpaceUsed")
    @Expose
    private Long PackageSpaceUsed;

    /**
    * 已注册实例数
    */
    @SerializedName("ConsulInstanceCount")
    @Expose
    private Long ConsulInstanceCount;

    /**
     * Get 应用总数 
     * @return ApplicationCount 应用总数
     */
    public Long getApplicationCount() {
        return this.ApplicationCount;
    }

    /**
     * Set 应用总数
     * @param ApplicationCount 应用总数
     */
    public void setApplicationCount(Long ApplicationCount) {
        this.ApplicationCount = ApplicationCount;
    }

    /**
     * Get 命名空间总数 
     * @return NamespaceCount 命名空间总数
     */
    public Long getNamespaceCount() {
        return this.NamespaceCount;
    }

    /**
     * Set 命名空间总数
     * @param NamespaceCount 命名空间总数
     */
    public void setNamespaceCount(Long NamespaceCount) {
        this.NamespaceCount = NamespaceCount;
    }

    /**
     * Get 部署组个数 
     * @return GroupCount 部署组个数
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set 部署组个数
     * @param GroupCount 部署组个数
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get 程序包存储空间用量，单位字节 
     * @return PackageSpaceUsed 程序包存储空间用量，单位字节
     */
    public Long getPackageSpaceUsed() {
        return this.PackageSpaceUsed;
    }

    /**
     * Set 程序包存储空间用量，单位字节
     * @param PackageSpaceUsed 程序包存储空间用量，单位字节
     */
    public void setPackageSpaceUsed(Long PackageSpaceUsed) {
        this.PackageSpaceUsed = PackageSpaceUsed;
    }

    /**
     * Get 已注册实例数 
     * @return ConsulInstanceCount 已注册实例数
     */
    public Long getConsulInstanceCount() {
        return this.ConsulInstanceCount;
    }

    /**
     * Set 已注册实例数
     * @param ConsulInstanceCount 已注册实例数
     */
    public void setConsulInstanceCount(Long ConsulInstanceCount) {
        this.ConsulInstanceCount = ConsulInstanceCount;
    }

    public OverviewBasicResourceUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewBasicResourceUsage(OverviewBasicResourceUsage source) {
        if (source.ApplicationCount != null) {
            this.ApplicationCount = new Long(source.ApplicationCount);
        }
        if (source.NamespaceCount != null) {
            this.NamespaceCount = new Long(source.NamespaceCount);
        }
        if (source.GroupCount != null) {
            this.GroupCount = new Long(source.GroupCount);
        }
        if (source.PackageSpaceUsed != null) {
            this.PackageSpaceUsed = new Long(source.PackageSpaceUsed);
        }
        if (source.ConsulInstanceCount != null) {
            this.ConsulInstanceCount = new Long(source.ConsulInstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationCount", this.ApplicationCount);
        this.setParamSimple(map, prefix + "NamespaceCount", this.NamespaceCount);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "PackageSpaceUsed", this.PackageSpaceUsed);
        this.setParamSimple(map, prefix + "ConsulInstanceCount", this.ConsulInstanceCount);

    }
}

