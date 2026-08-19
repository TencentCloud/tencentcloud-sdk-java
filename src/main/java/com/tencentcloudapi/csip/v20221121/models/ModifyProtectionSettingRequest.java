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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProtectionSettingRequest extends AbstractModel {

    /**
    * 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 防护配置
    */
    @SerializedName("Config")
    @Expose
    private ModifyProtectionSetting [] Config;

    /**
    * 是否全部,这里需要配合筛选条件Filters
    */
    @SerializedName("IsALL")
    @Expose
    private Boolean IsALL;

    /**
    * 过滤参数,这里IsALL=true生效,结果作用到Config里
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点 
     * @return AssetType 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
     * @param AssetType 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 防护配置 
     * @return Config 防护配置
     */
    public ModifyProtectionSetting [] getConfig() {
        return this.Config;
    }

    /**
     * Set 防护配置
     * @param Config 防护配置
     */
    public void setConfig(ModifyProtectionSetting [] Config) {
        this.Config = Config;
    }

    /**
     * Get 是否全部,这里需要配合筛选条件Filters 
     * @return IsALL 是否全部,这里需要配合筛选条件Filters
     */
    public Boolean getIsALL() {
        return this.IsALL;
    }

    /**
     * Set 是否全部,这里需要配合筛选条件Filters
     * @param IsALL 是否全部,这里需要配合筛选条件Filters
     */
    public void setIsALL(Boolean IsALL) {
        this.IsALL = IsALL;
    }

    /**
     * Get 过滤参数,这里IsALL=true生效,结果作用到Config里 
     * @return Filters 过滤参数,这里IsALL=true生效,结果作用到Config里
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数,这里IsALL=true生效,结果作用到Config里
     * @param Filters 过滤参数,这里IsALL=true生效,结果作用到Config里
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ModifyProtectionSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectionSettingRequest(ModifyProtectionSettingRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Config != null) {
            this.Config = new ModifyProtectionSetting[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new ModifyProtectionSetting(source.Config[i]);
            }
        }
        if (source.IsALL != null) {
            this.IsALL = new Boolean(source.IsALL);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "IsALL", this.IsALL);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

