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

public class AddImageRegistryRequest extends AbstractModel {

    /**
    * <p>镜像仓库名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>镜像仓库账号</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>镜像仓库密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>镜像仓库url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>镜像仓库类型</p><p>枚举值：</p><ul><li>tcr： tcr类型仓库</li><li>ccr： ccr类型仓库</li><li>harbor： harbor类型仓库</li><li>jfrog： jfrog类型仓库</li><li>quay： quay类型仓库</li><li>aws： aws类型仓库</li><li>azure： azure类型仓库</li></ul>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>网络类型</p><p>枚举值：</p><ul><li>public： 公网</li><li>空： 内网，默认值</li></ul>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>api版本</p>
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * <p>镜像仓库所在region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>访问限速值</p>
    */
    @SerializedName("SpeedLimit")
    @Expose
    private Long SpeedLimit;

    /**
    * <p>是否忽略证书</p><p>枚举值：</p><ul><li>0： 验证证书</li><li>1： 忽略证书</li></ul>
    */
    @SerializedName("Insecure")
    @Expose
    private Long Insecure;

    /**
    * <p>是否立即同步</p>
    */
    @SerializedName("NeedScan")
    @Expose
    private Boolean NeedScan;

    /**
    * <p>同步模式，0-全量同步</p>
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * <p>镜像仓库实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>扫描使用的链接配置</p>
    */
    @SerializedName("ConnectivityDetectConfig")
    @Expose
    private ConnectivityDetectConfig [] ConnectivityDetectConfig;

    /**
     * Get <p>镜像仓库名</p> 
     * @return Name <p>镜像仓库名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>镜像仓库名</p>
     * @param Name <p>镜像仓库名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>镜像仓库账号</p> 
     * @return Username <p>镜像仓库账号</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>镜像仓库账号</p>
     * @param Username <p>镜像仓库账号</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>镜像仓库密码</p> 
     * @return Password <p>镜像仓库密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>镜像仓库密码</p>
     * @param Password <p>镜像仓库密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>镜像仓库url</p> 
     * @return Url <p>镜像仓库url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>镜像仓库url</p>
     * @param Url <p>镜像仓库url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>镜像仓库类型</p><p>枚举值：</p><ul><li>tcr： tcr类型仓库</li><li>ccr： ccr类型仓库</li><li>harbor： harbor类型仓库</li><li>jfrog： jfrog类型仓库</li><li>quay： quay类型仓库</li><li>aws： aws类型仓库</li><li>azure： azure类型仓库</li></ul> 
     * @return RegistryType <p>镜像仓库类型</p><p>枚举值：</p><ul><li>tcr： tcr类型仓库</li><li>ccr： ccr类型仓库</li><li>harbor： harbor类型仓库</li><li>jfrog： jfrog类型仓库</li><li>quay： quay类型仓库</li><li>aws： aws类型仓库</li><li>azure： azure类型仓库</li></ul>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>镜像仓库类型</p><p>枚举值：</p><ul><li>tcr： tcr类型仓库</li><li>ccr： ccr类型仓库</li><li>harbor： harbor类型仓库</li><li>jfrog： jfrog类型仓库</li><li>quay： quay类型仓库</li><li>aws： aws类型仓库</li><li>azure： azure类型仓库</li></ul>
     * @param RegistryType <p>镜像仓库类型</p><p>枚举值：</p><ul><li>tcr： tcr类型仓库</li><li>ccr： ccr类型仓库</li><li>harbor： harbor类型仓库</li><li>jfrog： jfrog类型仓库</li><li>quay： quay类型仓库</li><li>aws： aws类型仓库</li><li>azure： azure类型仓库</li></ul>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>网络类型</p><p>枚举值：</p><ul><li>public： 公网</li><li>空： 内网，默认值</li></ul> 
     * @return NetType <p>网络类型</p><p>枚举值：</p><ul><li>public： 公网</li><li>空： 内网，默认值</li></ul>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型</p><p>枚举值：</p><ul><li>public： 公网</li><li>空： 内网，默认值</li></ul>
     * @param NetType <p>网络类型</p><p>枚举值：</p><ul><li>public： 公网</li><li>空： 内网，默认值</li></ul>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>api版本</p> 
     * @return RegistryVersion <p>api版本</p>
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set <p>api版本</p>
     * @param RegistryVersion <p>api版本</p>
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get <p>镜像仓库所在region</p> 
     * @return RegistryRegion <p>镜像仓库所在region</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>镜像仓库所在region</p>
     * @param RegistryRegion <p>镜像仓库所在region</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>访问限速值</p> 
     * @return SpeedLimit <p>访问限速值</p>
     */
    public Long getSpeedLimit() {
        return this.SpeedLimit;
    }

    /**
     * Set <p>访问限速值</p>
     * @param SpeedLimit <p>访问限速值</p>
     */
    public void setSpeedLimit(Long SpeedLimit) {
        this.SpeedLimit = SpeedLimit;
    }

    /**
     * Get <p>是否忽略证书</p><p>枚举值：</p><ul><li>0： 验证证书</li><li>1： 忽略证书</li></ul> 
     * @return Insecure <p>是否忽略证书</p><p>枚举值：</p><ul><li>0： 验证证书</li><li>1： 忽略证书</li></ul>
     */
    public Long getInsecure() {
        return this.Insecure;
    }

    /**
     * Set <p>是否忽略证书</p><p>枚举值：</p><ul><li>0： 验证证书</li><li>1： 忽略证书</li></ul>
     * @param Insecure <p>是否忽略证书</p><p>枚举值：</p><ul><li>0： 验证证书</li><li>1： 忽略证书</li></ul>
     */
    public void setInsecure(Long Insecure) {
        this.Insecure = Insecure;
    }

    /**
     * Get <p>是否立即同步</p> 
     * @return NeedScan <p>是否立即同步</p>
     */
    public Boolean getNeedScan() {
        return this.NeedScan;
    }

    /**
     * Set <p>是否立即同步</p>
     * @param NeedScan <p>是否立即同步</p>
     */
    public void setNeedScan(Boolean NeedScan) {
        this.NeedScan = NeedScan;
    }

    /**
     * Get <p>同步模式，0-全量同步</p> 
     * @return SyncMode <p>同步模式，0-全量同步</p>
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>同步模式，0-全量同步</p>
     * @param SyncMode <p>同步模式，0-全量同步</p>
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>镜像仓库实例id</p> 
     * @return InstanceId <p>镜像仓库实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>镜像仓库实例id</p>
     * @param InstanceId <p>镜像仓库实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>扫描使用的链接配置</p> 
     * @return ConnectivityDetectConfig <p>扫描使用的链接配置</p>
     */
    public ConnectivityDetectConfig [] getConnectivityDetectConfig() {
        return this.ConnectivityDetectConfig;
    }

    /**
     * Set <p>扫描使用的链接配置</p>
     * @param ConnectivityDetectConfig <p>扫描使用的链接配置</p>
     */
    public void setConnectivityDetectConfig(ConnectivityDetectConfig [] ConnectivityDetectConfig) {
        this.ConnectivityDetectConfig = ConnectivityDetectConfig;
    }

    public AddImageRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddImageRegistryRequest(AddImageRegistryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegistryVersion != null) {
            this.RegistryVersion = new String(source.RegistryVersion);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.SpeedLimit != null) {
            this.SpeedLimit = new Long(source.SpeedLimit);
        }
        if (source.Insecure != null) {
            this.Insecure = new Long(source.Insecure);
        }
        if (source.NeedScan != null) {
            this.NeedScan = new Boolean(source.NeedScan);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConnectivityDetectConfig != null) {
            this.ConnectivityDetectConfig = new ConnectivityDetectConfig[source.ConnectivityDetectConfig.length];
            for (int i = 0; i < source.ConnectivityDetectConfig.length; i++) {
                this.ConnectivityDetectConfig[i] = new ConnectivityDetectConfig(source.ConnectivityDetectConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegistryVersion", this.RegistryVersion);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "SpeedLimit", this.SpeedLimit);
        this.setParamSimple(map, prefix + "Insecure", this.Insecure);
        this.setParamSimple(map, prefix + "NeedScan", this.NeedScan);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ConnectivityDetectConfig.", this.ConnectivityDetectConfig);

    }
}

