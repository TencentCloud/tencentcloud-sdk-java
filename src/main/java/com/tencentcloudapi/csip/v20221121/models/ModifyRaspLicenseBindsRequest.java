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

public class ModifyRaspLicenseBindsRequest extends AbstractModel {

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
    * 资源ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * 计费项类型
- sv_yunjing_vas_small 小型包
- sv_yunjing_vas_medium 中型包
- sv_yunjing_vas_large 大型包
- sv_yunjing_vas_expansion 扩展包
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * 实例ID数组
    */
    @SerializedName("QUUID")
    @Expose
    private String [] QUUID;

    /**
    * 是否全部机器实例
    */
    @SerializedName("IsALL")
    @Expose
    private Boolean IsALL;

    /**
    * 过滤参数,该参数需要IsALL=true时生效,表示筛选的结果作用到QUUID里
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
     * Get 资源ID 
     * @return ResourceID 资源ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源ID
     * @param ResourceID 资源ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 计费项类型
- sv_yunjing_vas_small 小型包
- sv_yunjing_vas_medium 中型包
- sv_yunjing_vas_large 大型包
- sv_yunjing_vas_expansion 扩展包 
     * @return InquireKey 计费项类型
- sv_yunjing_vas_small 小型包
- sv_yunjing_vas_medium 中型包
- sv_yunjing_vas_large 大型包
- sv_yunjing_vas_expansion 扩展包
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set 计费项类型
- sv_yunjing_vas_small 小型包
- sv_yunjing_vas_medium 中型包
- sv_yunjing_vas_large 大型包
- sv_yunjing_vas_expansion 扩展包
     * @param InquireKey 计费项类型
- sv_yunjing_vas_small 小型包
- sv_yunjing_vas_medium 中型包
- sv_yunjing_vas_large 大型包
- sv_yunjing_vas_expansion 扩展包
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get 实例ID数组 
     * @return QUUID 实例ID数组
     */
    public String [] getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 实例ID数组
     * @param QUUID 实例ID数组
     */
    public void setQUUID(String [] QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 是否全部机器实例 
     * @return IsALL 是否全部机器实例
     */
    public Boolean getIsALL() {
        return this.IsALL;
    }

    /**
     * Set 是否全部机器实例
     * @param IsALL 是否全部机器实例
     */
    public void setIsALL(Boolean IsALL) {
        this.IsALL = IsALL;
    }

    /**
     * Get 过滤参数,该参数需要IsALL=true时生效,表示筛选的结果作用到QUUID里 
     * @return Filters 过滤参数,该参数需要IsALL=true时生效,表示筛选的结果作用到QUUID里
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数,该参数需要IsALL=true时生效,表示筛选的结果作用到QUUID里
     * @param Filters 过滤参数,该参数需要IsALL=true时生效,表示筛选的结果作用到QUUID里
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ModifyRaspLicenseBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRaspLicenseBindsRequest(ModifyRaspLicenseBindsRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.QUUID != null) {
            this.QUUID = new String[source.QUUID.length];
            for (int i = 0; i < source.QUUID.length; i++) {
                this.QUUID[i] = new String(source.QUUID[i]);
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
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamArraySimple(map, prefix + "QUUID.", this.QUUID);
        this.setParamSimple(map, prefix + "IsALL", this.IsALL);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

