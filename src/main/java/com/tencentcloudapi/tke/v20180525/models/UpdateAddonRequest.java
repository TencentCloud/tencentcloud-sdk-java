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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAddonRequest extends AbstractModel {

    /**
    * 集群ID，请从容器服务控制台集群列表中获取（https://console.cloud.tencent.com/tke2/cluster）。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * addon名称，请从容器服务控制台进入集群详情页后，在组件管理页面中获取。
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * addon版本（不传默认不更新，不传AddonVersion时RawValues必传）
    */
    @SerializedName("AddonVersion")
    @Expose
    private String AddonVersion;

    /**
    * addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取，不传RawValues时AddonVersion必传）。
    */
    @SerializedName("RawValues")
    @Expose
    private String RawValues;

    /**
    * addon参数的更新策略，支持replace和merge两种策略，默认值为merge，兼容旧版本API。replace：使用新RawValues全量替换addon原RawValues，merge：根据新RawValues新增或更新addon原RawValues中对应参数。
    */
    @SerializedName("UpdateStrategy")
    @Expose
    private String UpdateStrategy;

    /**
    * 是否仅做更新检查，设置为true时仅做检查，不会更新组件。默认值为 false。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 集群ID，请从容器服务控制台集群列表中获取（https://console.cloud.tencent.com/tke2/cluster）。 
     * @return ClusterId 集群ID，请从容器服务控制台集群列表中获取（https://console.cloud.tencent.com/tke2/cluster）。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，请从容器服务控制台集群列表中获取（https://console.cloud.tencent.com/tke2/cluster）。
     * @param ClusterId 集群ID，请从容器服务控制台集群列表中获取（https://console.cloud.tencent.com/tke2/cluster）。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get addon名称，请从容器服务控制台进入集群详情页后，在组件管理页面中获取。 
     * @return AddonName addon名称，请从容器服务控制台进入集群详情页后，在组件管理页面中获取。
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set addon名称，请从容器服务控制台进入集群详情页后，在组件管理页面中获取。
     * @param AddonName addon名称，请从容器服务控制台进入集群详情页后，在组件管理页面中获取。
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get addon版本（不传默认不更新，不传AddonVersion时RawValues必传） 
     * @return AddonVersion addon版本（不传默认不更新，不传AddonVersion时RawValues必传）
     */
    public String getAddonVersion() {
        return this.AddonVersion;
    }

    /**
     * Set addon版本（不传默认不更新，不传AddonVersion时RawValues必传）
     * @param AddonVersion addon版本（不传默认不更新，不传AddonVersion时RawValues必传）
     */
    public void setAddonVersion(String AddonVersion) {
        this.AddonVersion = AddonVersion;
    }

    /**
     * Get addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取，不传RawValues时AddonVersion必传）。 
     * @return RawValues addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取，不传RawValues时AddonVersion必传）。
     */
    public String getRawValues() {
        return this.RawValues;
    }

    /**
     * Set addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取，不传RawValues时AddonVersion必传）。
     * @param RawValues addon的参数，是一个json格式的base64转码后的字符串（addon参数由DescribeAddonValues获取，不传RawValues时AddonVersion必传）。
     */
    public void setRawValues(String RawValues) {
        this.RawValues = RawValues;
    }

    /**
     * Get addon参数的更新策略，支持replace和merge两种策略，默认值为merge，兼容旧版本API。replace：使用新RawValues全量替换addon原RawValues，merge：根据新RawValues新增或更新addon原RawValues中对应参数。 
     * @return UpdateStrategy addon参数的更新策略，支持replace和merge两种策略，默认值为merge，兼容旧版本API。replace：使用新RawValues全量替换addon原RawValues，merge：根据新RawValues新增或更新addon原RawValues中对应参数。
     */
    public String getUpdateStrategy() {
        return this.UpdateStrategy;
    }

    /**
     * Set addon参数的更新策略，支持replace和merge两种策略，默认值为merge，兼容旧版本API。replace：使用新RawValues全量替换addon原RawValues，merge：根据新RawValues新增或更新addon原RawValues中对应参数。
     * @param UpdateStrategy addon参数的更新策略，支持replace和merge两种策略，默认值为merge，兼容旧版本API。replace：使用新RawValues全量替换addon原RawValues，merge：根据新RawValues新增或更新addon原RawValues中对应参数。
     */
    public void setUpdateStrategy(String UpdateStrategy) {
        this.UpdateStrategy = UpdateStrategy;
    }

    /**
     * Get 是否仅做更新检查，设置为true时仅做检查，不会更新组件。默认值为 false。 
     * @return DryRun 是否仅做更新检查，设置为true时仅做检查，不会更新组件。默认值为 false。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否仅做更新检查，设置为true时仅做检查，不会更新组件。默认值为 false。
     * @param DryRun 是否仅做更新检查，设置为true时仅做检查，不会更新组件。默认值为 false。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public UpdateAddonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAddonRequest(UpdateAddonRequest source) {
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
        if (source.UpdateStrategy != null) {
            this.UpdateStrategy = new String(source.UpdateStrategy);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
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
        this.setParamSimple(map, prefix + "UpdateStrategy", this.UpdateStrategy);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

