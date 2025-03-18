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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * 套餐ID。可以通过调用 [DescribeBundles](https://cloud.tencent.com/document/api/1207/47575) 接口获取。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 镜像ID。可以通过调用 [DescribeBlueprints](https://cloud.tencent.com/document/api/1207/47689) 接口获取。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 当前实例仅支持预付费模式，即包年包月相关参数设置，单位（月）。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 实例显示名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 购买实例数量。包年包月实例取值范围：[1，30]。默认取值：1。指定购买实例的数量不能超过用户所能购买的剩余配额数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 可用区列表。
不填此参数，表示为随机可用区。
可通过 <a href="https://cloud.tencent.com/document/product/1207/57513" target="_blank">DescribeZones</a>接口获取指定地域下的可用区列表信息
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 实例登录密码信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码。
    */
    @SerializedName("LoginConfiguration")
    @Expose
    private LoginConfiguration LoginConfiguration;

    /**
    * 要创建的容器配置列表。
    */
    @SerializedName("Containers")
    @Expose
    private DockerContainerConfiguration [] Containers;

    /**
    * 是否自动使用代金券。默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 防火墙模板ID。若不指定该参数，则使用默认防火墙策略。
    */
    @SerializedName("FirewallTemplateId")
    @Expose
    private String FirewallTemplateId;

    /**
    * 标签键和标签值。
如果指定多个标签，则会为指定资源同时创建并绑定该多个标签。
同一个资源上的同一个标签键只能对应一个标签值。如果您尝试添加已有标签键，则对应的标签值会更新为新值。
如果标签不存在会为您自动创建标签。
数组最多支持10个元素。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 创建实例后自动执行的命令。
    */
    @SerializedName("InitCommand")
    @Expose
    private Command InitCommand;

    /**
    * 主域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 子域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
     * Get 套餐ID。可以通过调用 [DescribeBundles](https://cloud.tencent.com/document/api/1207/47575) 接口获取。 
     * @return BundleId 套餐ID。可以通过调用 [DescribeBundles](https://cloud.tencent.com/document/api/1207/47575) 接口获取。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 套餐ID。可以通过调用 [DescribeBundles](https://cloud.tencent.com/document/api/1207/47575) 接口获取。
     * @param BundleId 套餐ID。可以通过调用 [DescribeBundles](https://cloud.tencent.com/document/api/1207/47575) 接口获取。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 镜像ID。可以通过调用 [DescribeBlueprints](https://cloud.tencent.com/document/api/1207/47689) 接口获取。 
     * @return BlueprintId 镜像ID。可以通过调用 [DescribeBlueprints](https://cloud.tencent.com/document/api/1207/47689) 接口获取。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像ID。可以通过调用 [DescribeBlueprints](https://cloud.tencent.com/document/api/1207/47689) 接口获取。
     * @param BlueprintId 镜像ID。可以通过调用 [DescribeBlueprints](https://cloud.tencent.com/document/api/1207/47689) 接口获取。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 当前实例仅支持预付费模式，即包年包月相关参数设置，单位（月）。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。该参数必传。 
     * @return InstanceChargePrepaid 当前实例仅支持预付费模式，即包年包月相关参数设置，单位（月）。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 当前实例仅支持预付费模式，即包年包月相关参数设置，单位（月）。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。该参数必传。
     * @param InstanceChargePrepaid 当前实例仅支持预付费模式，即包年包月相关参数设置，单位（月）。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 实例显示名称。 
     * @return InstanceName 实例显示名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称。
     * @param InstanceName 实例显示名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 购买实例数量。包年包月实例取值范围：[1，30]。默认取值：1。指定购买实例的数量不能超过用户所能购买的剩余配额数量 
     * @return InstanceCount 购买实例数量。包年包月实例取值范围：[1，30]。默认取值：1。指定购买实例的数量不能超过用户所能购买的剩余配额数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买实例数量。包年包月实例取值范围：[1，30]。默认取值：1。指定购买实例的数量不能超过用户所能购买的剩余配额数量
     * @param InstanceCount 购买实例数量。包年包月实例取值范围：[1，30]。默认取值：1。指定购买实例的数量不能超过用户所能购买的剩余配额数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 可用区列表。
不填此参数，表示为随机可用区。
可通过 <a href="https://cloud.tencent.com/document/product/1207/57513" target="_blank">DescribeZones</a>接口获取指定地域下的可用区列表信息 
     * @return Zones 可用区列表。
不填此参数，表示为随机可用区。
可通过 <a href="https://cloud.tencent.com/document/product/1207/57513" target="_blank">DescribeZones</a>接口获取指定地域下的可用区列表信息
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区列表。
不填此参数，表示为随机可用区。
可通过 <a href="https://cloud.tencent.com/document/product/1207/57513" target="_blank">DescribeZones</a>接口获取指定地域下的可用区列表信息
     * @param Zones 可用区列表。
不填此参数，表示为随机可用区。
可通过 <a href="https://cloud.tencent.com/document/product/1207/57513" target="_blank">DescribeZones</a>接口获取指定地域下的可用区列表信息
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例 
     * @return DryRun 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
     * @param DryRun 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 实例登录密码信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码。 
     * @return LoginConfiguration 实例登录密码信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码。
     */
    public LoginConfiguration getLoginConfiguration() {
        return this.LoginConfiguration;
    }

    /**
     * Set 实例登录密码信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码。
     * @param LoginConfiguration 实例登录密码信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码。
     */
    public void setLoginConfiguration(LoginConfiguration LoginConfiguration) {
        this.LoginConfiguration = LoginConfiguration;
    }

    /**
     * Get 要创建的容器配置列表。 
     * @return Containers 要创建的容器配置列表。
     */
    public DockerContainerConfiguration [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 要创建的容器配置列表。
     * @param Containers 要创建的容器配置列表。
     */
    public void setContainers(DockerContainerConfiguration [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 是否自动使用代金券。默认不使用。 
     * @return AutoVoucher 是否自动使用代金券。默认不使用。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券。默认不使用。
     * @param AutoVoucher 是否自动使用代金券。默认不使用。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 防火墙模板ID。若不指定该参数，则使用默认防火墙策略。 
     * @return FirewallTemplateId 防火墙模板ID。若不指定该参数，则使用默认防火墙策略。
     */
    public String getFirewallTemplateId() {
        return this.FirewallTemplateId;
    }

    /**
     * Set 防火墙模板ID。若不指定该参数，则使用默认防火墙策略。
     * @param FirewallTemplateId 防火墙模板ID。若不指定该参数，则使用默认防火墙策略。
     */
    public void setFirewallTemplateId(String FirewallTemplateId) {
        this.FirewallTemplateId = FirewallTemplateId;
    }

    /**
     * Get 标签键和标签值。
如果指定多个标签，则会为指定资源同时创建并绑定该多个标签。
同一个资源上的同一个标签键只能对应一个标签值。如果您尝试添加已有标签键，则对应的标签值会更新为新值。
如果标签不存在会为您自动创建标签。
数组最多支持10个元素。 
     * @return Tags 标签键和标签值。
如果指定多个标签，则会为指定资源同时创建并绑定该多个标签。
同一个资源上的同一个标签键只能对应一个标签值。如果您尝试添加已有标签键，则对应的标签值会更新为新值。
如果标签不存在会为您自动创建标签。
数组最多支持10个元素。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签键和标签值。
如果指定多个标签，则会为指定资源同时创建并绑定该多个标签。
同一个资源上的同一个标签键只能对应一个标签值。如果您尝试添加已有标签键，则对应的标签值会更新为新值。
如果标签不存在会为您自动创建标签。
数组最多支持10个元素。
     * @param Tags 标签键和标签值。
如果指定多个标签，则会为指定资源同时创建并绑定该多个标签。
同一个资源上的同一个标签键只能对应一个标签值。如果您尝试添加已有标签键，则对应的标签值会更新为新值。
如果标签不存在会为您自动创建标签。
数组最多支持10个元素。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 创建实例后自动执行的命令。 
     * @return InitCommand 创建实例后自动执行的命令。
     */
    public Command getInitCommand() {
        return this.InitCommand;
    }

    /**
     * Set 创建实例后自动执行的命令。
     * @param InitCommand 创建实例后自动执行的命令。
     */
    public void setInitCommand(Command InitCommand) {
        this.InitCommand = InitCommand;
    }

    /**
     * Get 主域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。 
     * @return DomainName 主域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 主域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
     * @param DomainName 主域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 子域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。 
     * @return Subdomain 子域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 子域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
     * @param Subdomain 子域名。
注意：域名指定后，仅支持购买一台实例（参数InstanceCount=1）。
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.LoginConfiguration != null) {
            this.LoginConfiguration = new LoginConfiguration(source.LoginConfiguration);
        }
        if (source.Containers != null) {
            this.Containers = new DockerContainerConfiguration[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new DockerContainerConfiguration(source.Containers[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.FirewallTemplateId != null) {
            this.FirewallTemplateId = new String(source.FirewallTemplateId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InitCommand != null) {
            this.InitCommand = new Command(source.InitCommand);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "LoginConfiguration.", this.LoginConfiguration);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "FirewallTemplateId", this.FirewallTemplateId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "InitCommand.", this.InitCommand);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);

    }
}

