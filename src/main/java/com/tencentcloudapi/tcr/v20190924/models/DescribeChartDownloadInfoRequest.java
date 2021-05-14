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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChartDownloadInfoRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Chart包的名称
    */
    @SerializedName("ChartName")
    @Expose
    private String ChartName;

    /**
    * Chart包的版本
    */
    @SerializedName("ChartVersion")
    @Expose
    private String ChartVersion;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间 
     * @return NamespaceName 命名空间
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间
     * @param NamespaceName 命名空间
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Chart包的名称 
     * @return ChartName Chart包的名称
     */
    public String getChartName() {
        return this.ChartName;
    }

    /**
     * Set Chart包的名称
     * @param ChartName Chart包的名称
     */
    public void setChartName(String ChartName) {
        this.ChartName = ChartName;
    }

    /**
     * Get Chart包的版本 
     * @return ChartVersion Chart包的版本
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set Chart包的版本
     * @param ChartVersion Chart包的版本
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    public DescribeChartDownloadInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChartDownloadInfoRequest(DescribeChartDownloadInfoRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ChartName != null) {
            this.ChartName = new String(source.ChartName);
        }
        if (source.ChartVersion != null) {
            this.ChartVersion = new String(source.ChartVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ChartName", this.ChartName);
        this.setParamSimple(map, prefix + "ChartVersion", this.ChartVersion);

    }
}

