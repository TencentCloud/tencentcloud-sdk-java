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

public class UpgradeClusterReleaseRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 自定义的应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 制品名称或从第三方repo 安装chart时，制品压缩包下载地址, 不支持重定向类型chart 地址，结尾为*.tgz
    */
    @SerializedName("Chart")
    @Expose
    private String Chart;

    /**
    * 自定义参数，覆盖chart 中values.yaml 中的参数
    */
    @SerializedName("Values")
    @Expose
    private ReleaseValues Values;

    /**
    * 制品来源，范围：tke-market 或 other
    */
    @SerializedName("ChartFrom")
    @Expose
    private String ChartFrom;

    /**
    * 制品版本( 从第三安装时，不传这个参数）
    */
    @SerializedName("ChartVersion")
    @Expose
    private String ChartVersion;

    /**
    * 制品仓库URL地址
    */
    @SerializedName("ChartRepoURL")
    @Expose
    private String ChartRepoURL;

    /**
    * 制品访问用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 制品访问密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 制品命名空间
    */
    @SerializedName("ChartNamespace")
    @Expose
    private String ChartNamespace;

    /**
    * 集群类型，支持传 tke, eks, tkeedge, exernal(注册集群）
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
     * Get 自定义的应用名称 
     * @return Name 自定义的应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义的应用名称
     * @param Name 自定义的应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用命名空间 
     * @return Namespace 应用命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 应用命名空间
     * @param Namespace 应用命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 制品名称或从第三方repo 安装chart时，制品压缩包下载地址, 不支持重定向类型chart 地址，结尾为*.tgz 
     * @return Chart 制品名称或从第三方repo 安装chart时，制品压缩包下载地址, 不支持重定向类型chart 地址，结尾为*.tgz
     */
    public String getChart() {
        return this.Chart;
    }

    /**
     * Set 制品名称或从第三方repo 安装chart时，制品压缩包下载地址, 不支持重定向类型chart 地址，结尾为*.tgz
     * @param Chart 制品名称或从第三方repo 安装chart时，制品压缩包下载地址, 不支持重定向类型chart 地址，结尾为*.tgz
     */
    public void setChart(String Chart) {
        this.Chart = Chart;
    }

    /**
     * Get 自定义参数，覆盖chart 中values.yaml 中的参数 
     * @return Values 自定义参数，覆盖chart 中values.yaml 中的参数
     */
    public ReleaseValues getValues() {
        return this.Values;
    }

    /**
     * Set 自定义参数，覆盖chart 中values.yaml 中的参数
     * @param Values 自定义参数，覆盖chart 中values.yaml 中的参数
     */
    public void setValues(ReleaseValues Values) {
        this.Values = Values;
    }

    /**
     * Get 制品来源，范围：tke-market 或 other 
     * @return ChartFrom 制品来源，范围：tke-market 或 other
     */
    public String getChartFrom() {
        return this.ChartFrom;
    }

    /**
     * Set 制品来源，范围：tke-market 或 other
     * @param ChartFrom 制品来源，范围：tke-market 或 other
     */
    public void setChartFrom(String ChartFrom) {
        this.ChartFrom = ChartFrom;
    }

    /**
     * Get 制品版本( 从第三安装时，不传这个参数） 
     * @return ChartVersion 制品版本( 从第三安装时，不传这个参数）
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set 制品版本( 从第三安装时，不传这个参数）
     * @param ChartVersion 制品版本( 从第三安装时，不传这个参数）
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    /**
     * Get 制品仓库URL地址 
     * @return ChartRepoURL 制品仓库URL地址
     */
    public String getChartRepoURL() {
        return this.ChartRepoURL;
    }

    /**
     * Set 制品仓库URL地址
     * @param ChartRepoURL 制品仓库URL地址
     */
    public void setChartRepoURL(String ChartRepoURL) {
        this.ChartRepoURL = ChartRepoURL;
    }

    /**
     * Get 制品访问用户名 
     * @return Username 制品访问用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 制品访问用户名
     * @param Username 制品访问用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 制品访问密码 
     * @return Password 制品访问密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 制品访问密码
     * @param Password 制品访问密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 制品命名空间 
     * @return ChartNamespace 制品命名空间
     */
    public String getChartNamespace() {
        return this.ChartNamespace;
    }

    /**
     * Set 制品命名空间
     * @param ChartNamespace 制品命名空间
     */
    public void setChartNamespace(String ChartNamespace) {
        this.ChartNamespace = ChartNamespace;
    }

    /**
     * Get 集群类型，支持传 tke, eks, tkeedge, exernal(注册集群） 
     * @return ClusterType 集群类型，支持传 tke, eks, tkeedge, exernal(注册集群）
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，支持传 tke, eks, tkeedge, exernal(注册集群）
     * @param ClusterType 集群类型，支持传 tke, eks, tkeedge, exernal(注册集群）
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public UpgradeClusterReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeClusterReleaseRequest(UpgradeClusterReleaseRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Chart != null) {
            this.Chart = new String(source.Chart);
        }
        if (source.Values != null) {
            this.Values = new ReleaseValues(source.Values);
        }
        if (source.ChartFrom != null) {
            this.ChartFrom = new String(source.ChartFrom);
        }
        if (source.ChartVersion != null) {
            this.ChartVersion = new String(source.ChartVersion);
        }
        if (source.ChartRepoURL != null) {
            this.ChartRepoURL = new String(source.ChartRepoURL);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ChartNamespace != null) {
            this.ChartNamespace = new String(source.ChartNamespace);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Chart", this.Chart);
        this.setParamObj(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ChartFrom", this.ChartFrom);
        this.setParamSimple(map, prefix + "ChartVersion", this.ChartVersion);
        this.setParamSimple(map, prefix + "ChartRepoURL", this.ChartRepoURL);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ChartNamespace", this.ChartNamespace);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

