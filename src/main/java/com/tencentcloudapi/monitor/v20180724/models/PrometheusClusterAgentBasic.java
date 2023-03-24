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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusClusterAgentBasic extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否开启公网CLB
    */
    @SerializedName("EnableExternal")
    @Expose
    private Boolean EnableExternal;

    /**
    * 集群内部署组件的pod配置
    */
    @SerializedName("InClusterPodConfig")
    @Expose
    private PrometheusClusterAgentPodConfig InClusterPodConfig;

    /**
    * 该集群采集的所有指标都会带上这些labels
    */
    @SerializedName("ExternalLabels")
    @Expose
    private Label [] ExternalLabels;

    /**
    * 是否安装默认采集配置
    */
    @SerializedName("NotInstallBasicScrape")
    @Expose
    private Boolean NotInstallBasicScrape;

    /**
    * 是否采集指标，true代表drop所有指标，false代表采集默认指标
    */
    @SerializedName("NotScrape")
    @Expose
    private Boolean NotScrape;

    /**
    * 是否开启默认预聚合规则
    */
    @SerializedName("OpenDefaultRecord")
    @Expose
    private Boolean OpenDefaultRecord;

    /**
     * Get 集群ID 
     * @return Region 集群ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 集群ID
     * @param Region 集群ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

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
     * Get 是否开启公网CLB 
     * @return EnableExternal 是否开启公网CLB
     */
    public Boolean getEnableExternal() {
        return this.EnableExternal;
    }

    /**
     * Set 是否开启公网CLB
     * @param EnableExternal 是否开启公网CLB
     */
    public void setEnableExternal(Boolean EnableExternal) {
        this.EnableExternal = EnableExternal;
    }

    /**
     * Get 集群内部署组件的pod配置 
     * @return InClusterPodConfig 集群内部署组件的pod配置
     */
    public PrometheusClusterAgentPodConfig getInClusterPodConfig() {
        return this.InClusterPodConfig;
    }

    /**
     * Set 集群内部署组件的pod配置
     * @param InClusterPodConfig 集群内部署组件的pod配置
     */
    public void setInClusterPodConfig(PrometheusClusterAgentPodConfig InClusterPodConfig) {
        this.InClusterPodConfig = InClusterPodConfig;
    }

    /**
     * Get 该集群采集的所有指标都会带上这些labels 
     * @return ExternalLabels 该集群采集的所有指标都会带上这些labels
     */
    public Label [] getExternalLabels() {
        return this.ExternalLabels;
    }

    /**
     * Set 该集群采集的所有指标都会带上这些labels
     * @param ExternalLabels 该集群采集的所有指标都会带上这些labels
     */
    public void setExternalLabels(Label [] ExternalLabels) {
        this.ExternalLabels = ExternalLabels;
    }

    /**
     * Get 是否安装默认采集配置 
     * @return NotInstallBasicScrape 是否安装默认采集配置
     */
    public Boolean getNotInstallBasicScrape() {
        return this.NotInstallBasicScrape;
    }

    /**
     * Set 是否安装默认采集配置
     * @param NotInstallBasicScrape 是否安装默认采集配置
     */
    public void setNotInstallBasicScrape(Boolean NotInstallBasicScrape) {
        this.NotInstallBasicScrape = NotInstallBasicScrape;
    }

    /**
     * Get 是否采集指标，true代表drop所有指标，false代表采集默认指标 
     * @return NotScrape 是否采集指标，true代表drop所有指标，false代表采集默认指标
     */
    public Boolean getNotScrape() {
        return this.NotScrape;
    }

    /**
     * Set 是否采集指标，true代表drop所有指标，false代表采集默认指标
     * @param NotScrape 是否采集指标，true代表drop所有指标，false代表采集默认指标
     */
    public void setNotScrape(Boolean NotScrape) {
        this.NotScrape = NotScrape;
    }

    /**
     * Get 是否开启默认预聚合规则 
     * @return OpenDefaultRecord 是否开启默认预聚合规则
     */
    public Boolean getOpenDefaultRecord() {
        return this.OpenDefaultRecord;
    }

    /**
     * Set 是否开启默认预聚合规则
     * @param OpenDefaultRecord 是否开启默认预聚合规则
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
        this.setParamSimple(map, prefix + "OpenDefaultRecord", this.OpenDefaultRecord);

    }
}

