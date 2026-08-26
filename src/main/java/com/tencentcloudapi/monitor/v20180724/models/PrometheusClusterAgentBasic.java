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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusClusterAgentBasic extends AbstractModel {

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群 和外部集群</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>是否开启公网 CLB</p>
    */
    @SerializedName("EnableExternal")
    @Expose
    private Boolean EnableExternal;

    /**
    * <p>集群内部署组件的pod 配置</p>
    */
    @SerializedName("InClusterPodConfig")
    @Expose
    private PrometheusClusterAgentPodConfig InClusterPodConfig;

    /**
    * <p>该集群采集的所有指标都会带上这些labels</p>
    */
    @SerializedName("ExternalLabels")
    @Expose
    private Label [] ExternalLabels;

    /**
    * <p>是否安装默认采集 exporter 和采集配置</p>
    */
    @SerializedName("NotInstallBasicScrape")
    @Expose
    private Boolean NotInstallBasicScrape;

    /**
    * <p>是否安装采集配置，true 只安装采集 exporter 不会安装采集配置，false 会同时安装采集配置</p>
    */
    @SerializedName("NotScrape")
    @Expose
    private Boolean NotScrape;

    /**
    * <p>是否丢弃所有指标，true 代表丢弃所有指标，false 代表采集默认指标</p>
    */
    @SerializedName("DropAll")
    @Expose
    private Boolean DropAll;

    /**
    * <p>是否采集全部指标</p><p>枚举值：</p><ul><li>false： 不采集</li><li>true： 采集</li></ul><p>默认值：false</p>
    */
    @SerializedName("CollectAll")
    @Expose
    private Boolean CollectAll;

    /**
    * <p>是否开启默认预聚合规则</p>
    */
    @SerializedName("OpenDefaultRecord")
    @Expose
    private Boolean OpenDefaultRecord;

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群 和外部集群</p> 
     * @return ClusterType <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群 和外部集群</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群 和外部集群</p>
     * @param ClusterType <p>集群类型。可填入tke、eks、tkeedge、tdcc、external，分别代表标准集群、弹性集群、边缘集群、注册集群 和外部集群</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>是否开启公网 CLB</p> 
     * @return EnableExternal <p>是否开启公网 CLB</p>
     */
    public Boolean getEnableExternal() {
        return this.EnableExternal;
    }

    /**
     * Set <p>是否开启公网 CLB</p>
     * @param EnableExternal <p>是否开启公网 CLB</p>
     */
    public void setEnableExternal(Boolean EnableExternal) {
        this.EnableExternal = EnableExternal;
    }

    /**
     * Get <p>集群内部署组件的pod 配置</p> 
     * @return InClusterPodConfig <p>集群内部署组件的pod 配置</p>
     */
    public PrometheusClusterAgentPodConfig getInClusterPodConfig() {
        return this.InClusterPodConfig;
    }

    /**
     * Set <p>集群内部署组件的pod 配置</p>
     * @param InClusterPodConfig <p>集群内部署组件的pod 配置</p>
     */
    public void setInClusterPodConfig(PrometheusClusterAgentPodConfig InClusterPodConfig) {
        this.InClusterPodConfig = InClusterPodConfig;
    }

    /**
     * Get <p>该集群采集的所有指标都会带上这些labels</p> 
     * @return ExternalLabels <p>该集群采集的所有指标都会带上这些labels</p>
     */
    public Label [] getExternalLabels() {
        return this.ExternalLabels;
    }

    /**
     * Set <p>该集群采集的所有指标都会带上这些labels</p>
     * @param ExternalLabels <p>该集群采集的所有指标都会带上这些labels</p>
     */
    public void setExternalLabels(Label [] ExternalLabels) {
        this.ExternalLabels = ExternalLabels;
    }

    /**
     * Get <p>是否安装默认采集 exporter 和采集配置</p> 
     * @return NotInstallBasicScrape <p>是否安装默认采集 exporter 和采集配置</p>
     */
    public Boolean getNotInstallBasicScrape() {
        return this.NotInstallBasicScrape;
    }

    /**
     * Set <p>是否安装默认采集 exporter 和采集配置</p>
     * @param NotInstallBasicScrape <p>是否安装默认采集 exporter 和采集配置</p>
     */
    public void setNotInstallBasicScrape(Boolean NotInstallBasicScrape) {
        this.NotInstallBasicScrape = NotInstallBasicScrape;
    }

    /**
     * Get <p>是否安装采集配置，true 只安装采集 exporter 不会安装采集配置，false 会同时安装采集配置</p> 
     * @return NotScrape <p>是否安装采集配置，true 只安装采集 exporter 不会安装采集配置，false 会同时安装采集配置</p>
     */
    public Boolean getNotScrape() {
        return this.NotScrape;
    }

    /**
     * Set <p>是否安装采集配置，true 只安装采集 exporter 不会安装采集配置，false 会同时安装采集配置</p>
     * @param NotScrape <p>是否安装采集配置，true 只安装采集 exporter 不会安装采集配置，false 会同时安装采集配置</p>
     */
    public void setNotScrape(Boolean NotScrape) {
        this.NotScrape = NotScrape;
    }

    /**
     * Get <p>是否丢弃所有指标，true 代表丢弃所有指标，false 代表采集默认指标</p> 
     * @return DropAll <p>是否丢弃所有指标，true 代表丢弃所有指标，false 代表采集默认指标</p>
     */
    public Boolean getDropAll() {
        return this.DropAll;
    }

    /**
     * Set <p>是否丢弃所有指标，true 代表丢弃所有指标，false 代表采集默认指标</p>
     * @param DropAll <p>是否丢弃所有指标，true 代表丢弃所有指标，false 代表采集默认指标</p>
     */
    public void setDropAll(Boolean DropAll) {
        this.DropAll = DropAll;
    }

    /**
     * Get <p>是否采集全部指标</p><p>枚举值：</p><ul><li>false： 不采集</li><li>true： 采集</li></ul><p>默认值：false</p> 
     * @return CollectAll <p>是否采集全部指标</p><p>枚举值：</p><ul><li>false： 不采集</li><li>true： 采集</li></ul><p>默认值：false</p>
     */
    public Boolean getCollectAll() {
        return this.CollectAll;
    }

    /**
     * Set <p>是否采集全部指标</p><p>枚举值：</p><ul><li>false： 不采集</li><li>true： 采集</li></ul><p>默认值：false</p>
     * @param CollectAll <p>是否采集全部指标</p><p>枚举值：</p><ul><li>false： 不采集</li><li>true： 采集</li></ul><p>默认值：false</p>
     */
    public void setCollectAll(Boolean CollectAll) {
        this.CollectAll = CollectAll;
    }

    /**
     * Get <p>是否开启默认预聚合规则</p> 
     * @return OpenDefaultRecord <p>是否开启默认预聚合规则</p>
     */
    public Boolean getOpenDefaultRecord() {
        return this.OpenDefaultRecord;
    }

    /**
     * Set <p>是否开启默认预聚合规则</p>
     * @param OpenDefaultRecord <p>是否开启默认预聚合规则</p>
     */
    public void setOpenDefaultRecord(Boolean OpenDefaultRecord) {
        this.OpenDefaultRecord = OpenDefaultRecord;
    }

    public PrometheusClusterAgentBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusClusterAgentBasic(PrometheusClusterAgentBasic source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnableExternal != null) {
            this.EnableExternal = new Boolean(source.EnableExternal);
        }
        if (source.InClusterPodConfig != null) {
            this.InClusterPodConfig = new PrometheusClusterAgentPodConfig(source.InClusterPodConfig);
        }
        if (source.ExternalLabels != null) {
            this.ExternalLabels = new Label[source.ExternalLabels.length];
            for (int i = 0; i < source.ExternalLabels.length; i++) {
                this.ExternalLabels[i] = new Label(source.ExternalLabels[i]);
            }
        }
        if (source.NotInstallBasicScrape != null) {
            this.NotInstallBasicScrape = new Boolean(source.NotInstallBasicScrape);
        }
        if (source.NotScrape != null) {
            this.NotScrape = new Boolean(source.NotScrape);
        }
        if (source.DropAll != null) {
            this.DropAll = new Boolean(source.DropAll);
        }
        if (source.CollectAll != null) {
            this.CollectAll = new Boolean(source.CollectAll);
        }
        if (source.OpenDefaultRecord != null) {
            this.OpenDefaultRecord = new Boolean(source.OpenDefaultRecord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnableExternal", this.EnableExternal);
        this.setParamObj(map, prefix + "InClusterPodConfig.", this.InClusterPodConfig);
        this.setParamArrayObj(map, prefix + "ExternalLabels.", this.ExternalLabels);
        this.setParamSimple(map, prefix + "NotInstallBasicScrape", this.NotInstallBasicScrape);
        this.setParamSimple(map, prefix + "NotScrape", this.NotScrape);
        this.setParamSimple(map, prefix + "DropAll", this.DropAll);
        this.setParamSimple(map, prefix + "CollectAll", this.CollectAll);
        this.setParamSimple(map, prefix + "OpenDefaultRecord", this.OpenDefaultRecord);

    }
}

