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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallAddonRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * addon名称
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * addon版本（不传默认安装最新版本）
    */
    @SerializedName("AddonVersion")
    @Expose
    private String AddonVersion;

    /**
    * addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取）
    */
    @SerializedName("RawValues")
    @Expose
    private String RawValues;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get addon名称 
     * @return AddonName addon名称
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set addon名称
     * @param AddonName addon名称
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get addon版本（不传默认安装最新版本） 
     * @return AddonVersion addon版本（不传默认安装最新版本）
     */
    public String getAddonVersion() {
        return this.AddonVersion;
    }

    /**
     * Set addon版本（不传默认安装最新版本）
     * @param AddonVersion addon版本（不传默认安装最新版本）
     */
    public void setAddonVersion(String AddonVersion) {
        this.AddonVersion = AddonVersion;
    }

    /**
     * Get addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取） 
     * @return RawValues addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取）
     */
    public String getRawValues() {
        return this.RawValues;
    }

    /**
     * Set addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取）
     * @param RawValues addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取）
     */
    public void setRawValues(String RawValues) {
        this.RawValues = RawValues;
    }

    public InstallAddonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallAddonRequest(InstallAddonRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AddonName != null) {
            this.AddonName = new String(source.AddonName);
        }
        if (source.AddonVersion != null) {
            this.AddonVersion = new String(source.AddonVersion);
        }
        if (source.RawValues != null) {
            this.RawValues = new String(source.RawValues);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonVersion", this.AddonVersion);
        this.setParamSimple(map, prefix + "RawValues", this.RawValues);

    }
}

