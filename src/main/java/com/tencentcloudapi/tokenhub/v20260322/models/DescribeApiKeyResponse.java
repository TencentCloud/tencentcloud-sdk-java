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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiKeyResponse extends AbstractModel {

    /**
    * API 密钥 ID。
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * 名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API 密钥值（明文）。
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 平台类型。枚举：maas
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 主账号。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 状态。取值：enable（启用）、disable（禁用）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 绑定类型。取值：all（全部模型和接入点）、model_all_endpoint_custom（全部模型+自定义接入点）、model_custom_endpoint_all（自定义模型+全部接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * 创建时间。格式：YYYY-MM-DD HH:mm:ss。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。格式：YYYY-MM-DD HH:mm:ss。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 应用 ID。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 是否可编辑。true 表示可编辑，false 表示不可编辑。
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * 绑定资源列表，区分 endpoint 和 model 类型。
    */
    @SerializedName("BindingItems")
    @Expose
    private BindingItem [] BindingItems;

    /**
    * IP 白名单列表。支持 IPv4和 CIDR 格式。空数组表示不限制 IP。
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
    * 当Platform为maas时该字段为空
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get API 密钥 ID。 
     * @return ApiKeyId API 密钥 ID。
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set API 密钥 ID。
     * @param ApiKeyId API 密钥 ID。
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get 名称。 
     * @return Name 名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。
     * @param Name 名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API 密钥值（明文）。 
     * @return ApiKey API 密钥值（明文）。
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API 密钥值（明文）。
     * @param ApiKey API 密钥值（明文）。
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 平台类型。枚举：maas 
     * @return Platform 平台类型。枚举：maas
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台类型。枚举：maas
     * @param Platform 平台类型。枚举：maas
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 主账号。 
     * @return Uin 主账号。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号。
     * @param Uin 主账号。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号。 
     * @return SubUin 子账号。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号。
     * @param SubUin 子账号。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 状态。取值：enable（启用）、disable（禁用）。 
     * @return Status 状态。取值：enable（启用）、disable（禁用）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。取值：enable（启用）、disable（禁用）。
     * @param Status 状态。取值：enable（启用）、disable（禁用）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 绑定类型。取值：all（全部模型和接入点）、model_all_endpoint_custom（全部模型+自定义接入点）、model_custom_endpoint_all（自定义模型+全部接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。 
     * @return BindType 绑定类型。取值：all（全部模型和接入点）、model_all_endpoint_custom（全部模型+自定义接入点）、model_custom_endpoint_all（自定义模型+全部接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型。取值：all（全部模型和接入点）、model_all_endpoint_custom（全部模型+自定义接入点）、model_custom_endpoint_all（自定义模型+全部接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。
     * @param BindType 绑定类型。取值：all（全部模型和接入点）、model_all_endpoint_custom（全部模型+自定义接入点）、model_custom_endpoint_all（自定义模型+全部接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 创建时间。格式：YYYY-MM-DD HH:mm:ss。 
     * @return CreateTime 创建时间。格式：YYYY-MM-DD HH:mm:ss。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。格式：YYYY-MM-DD HH:mm:ss。
     * @param CreateTime 创建时间。格式：YYYY-MM-DD HH:mm:ss。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。格式：YYYY-MM-DD HH:mm:ss。 
     * @return UpdateTime 更新时间。格式：YYYY-MM-DD HH:mm:ss。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。格式：YYYY-MM-DD HH:mm:ss。
     * @param UpdateTime 更新时间。格式：YYYY-MM-DD HH:mm:ss。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 应用 ID。 
     * @return AppId 应用 ID。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用 ID。
     * @param AppId 应用 ID。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 是否可编辑。true 表示可编辑，false 表示不可编辑。 
     * @return Editable 是否可编辑。true 表示可编辑，false 表示不可编辑。
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set 是否可编辑。true 表示可编辑，false 表示不可编辑。
     * @param Editable 是否可编辑。true 表示可编辑，false 表示不可编辑。
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get 绑定资源列表，区分 endpoint 和 model 类型。 
     * @return BindingItems 绑定资源列表，区分 endpoint 和 model 类型。
     */
    public BindingItem [] getBindingItems() {
        return this.BindingItems;
    }

    /**
     * Set 绑定资源列表，区分 endpoint 和 model 类型。
     * @param BindingItems 绑定资源列表，区分 endpoint 和 model 类型。
     */
    public void setBindingItems(BindingItem [] BindingItems) {
        this.BindingItems = BindingItems;
    }

    /**
     * Get IP 白名单列表。支持 IPv4和 CIDR 格式。空数组表示不限制 IP。 
     * @return IpWhitelist IP 白名单列表。支持 IPv4和 CIDR 格式。空数组表示不限制 IP。
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set IP 白名单列表。支持 IPv4和 CIDR 格式。空数组表示不限制 IP。
     * @param IpWhitelist IP 白名单列表。支持 IPv4和 CIDR 格式。空数组表示不限制 IP。
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    /**
     * Get 当Platform为maas时该字段为空 
     * @return Creator 当Platform为maas时该字段为空
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 当Platform为maas时该字段为空
     * @param Creator 当Platform为maas时该字段为空
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApiKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiKeyResponse(DescribeApiKeyResponse source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.BindingItems != null) {
            this.BindingItems = new BindingItem[source.BindingItems.length];
            for (int i = 0; i < source.BindingItems.length; i++) {
                this.BindingItems[i] = new BindingItem(source.BindingItems[i]);
            }
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamArrayObj(map, prefix + "BindingItems.", this.BindingItems);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

