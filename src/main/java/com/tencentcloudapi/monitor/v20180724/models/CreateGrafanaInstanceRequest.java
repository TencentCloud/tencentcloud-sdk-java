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

public class CreateGrafanaInstanceRequest extends AbstractModel {

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>VPC ID (私有网络 ID)</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID 数组(VPC ID下的子网 ID，只取第一个)。<br>注意：并不是所有可用区都可用（可通过 monitor:DescribePrometheusZones 接口获取可用区状态，选择 ZoneState 和ZoneResourceState 都为1的可用区）</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>是否启用外网</p>
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * <p>Grafana 初始密码(国际站用户必填，国内站用户可不填，不填时会生成随机密码并给主账号发送通知)</p>
    */
    @SerializedName("GrafanaInitPassword")
    @Expose
    private String GrafanaInitPassword;

    /**
    * <p>标签</p>
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * <p>自定义版本，可用版本从 DescribeGrafanaVersions 接口获取</p>
    */
    @SerializedName("DockerImage")
    @Expose
    private String DockerImage;

    /**
    * <p>是否自动选择代金券，默认为 false</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>VPC ID (私有网络 ID)</p> 
     * @return VpcId <p>VPC ID (私有网络 ID)</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID (私有网络 ID)</p>
     * @param VpcId <p>VPC ID (私有网络 ID)</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID 数组(VPC ID下的子网 ID，只取第一个)。<br>注意：并不是所有可用区都可用（可通过 monitor:DescribePrometheusZones 接口获取可用区状态，选择 ZoneState 和ZoneResourceState 都为1的可用区）</p> 
     * @return SubnetIds <p>子网 ID 数组(VPC ID下的子网 ID，只取第一个)。<br>注意：并不是所有可用区都可用（可通过 monitor:DescribePrometheusZones 接口获取可用区状态，选择 ZoneState 和ZoneResourceState 都为1的可用区）</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网 ID 数组(VPC ID下的子网 ID，只取第一个)。<br>注意：并不是所有可用区都可用（可通过 monitor:DescribePrometheusZones 接口获取可用区状态，选择 ZoneState 和ZoneResourceState 都为1的可用区）</p>
     * @param SubnetIds <p>子网 ID 数组(VPC ID下的子网 ID，只取第一个)。<br>注意：并不是所有可用区都可用（可通过 monitor:DescribePrometheusZones 接口获取可用区状态，选择 ZoneState 和ZoneResourceState 都为1的可用区）</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>是否启用外网</p> 
     * @return EnableInternet <p>是否启用外网</p>
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set <p>是否启用外网</p>
     * @param EnableInternet <p>是否启用外网</p>
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get <p>Grafana 初始密码(国际站用户必填，国内站用户可不填，不填时会生成随机密码并给主账号发送通知)</p> 
     * @return GrafanaInitPassword <p>Grafana 初始密码(国际站用户必填，国内站用户可不填，不填时会生成随机密码并给主账号发送通知)</p>
     */
    public String getGrafanaInitPassword() {
        return this.GrafanaInitPassword;
    }

    /**
     * Set <p>Grafana 初始密码(国际站用户必填，国内站用户可不填，不填时会生成随机密码并给主账号发送通知)</p>
     * @param GrafanaInitPassword <p>Grafana 初始密码(国际站用户必填，国内站用户可不填，不填时会生成随机密码并给主账号发送通知)</p>
     */
    public void setGrafanaInitPassword(String GrafanaInitPassword) {
        this.GrafanaInitPassword = GrafanaInitPassword;
    }

    /**
     * Get <p>标签</p> 
     * @return TagSpecification <p>标签</p>
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>标签</p>
     * @param TagSpecification <p>标签</p>
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get <p>自定义版本，可用版本从 DescribeGrafanaVersions 接口获取</p> 
     * @return DockerImage <p>自定义版本，可用版本从 DescribeGrafanaVersions 接口获取</p>
     */
    public String getDockerImage() {
        return this.DockerImage;
    }

    /**
     * Set <p>自定义版本，可用版本从 DescribeGrafanaVersions 接口获取</p>
     * @param DockerImage <p>自定义版本，可用版本从 DescribeGrafanaVersions 接口获取</p>
     */
    public void setDockerImage(String DockerImage) {
        this.DockerImage = DockerImage;
    }

    /**
     * Get <p>是否自动选择代金券，默认为 false</p> 
     * @return AutoVoucher <p>是否自动选择代金券，默认为 false</p>
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券，默认为 false</p>
     * @param AutoVoucher <p>是否自动选择代金券，默认为 false</p>
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public CreateGrafanaInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGrafanaInstanceRequest(CreateGrafanaInstanceRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.EnableInternet != null) {
            this.EnableInternet = new Boolean(source.EnableInternet);
        }
        if (source.GrafanaInitPassword != null) {
            this.GrafanaInitPassword = new String(source.GrafanaInitPassword);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.DockerImage != null) {
            this.DockerImage = new String(source.DockerImage);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "EnableInternet", this.EnableInternet);
        this.setParamSimple(map, prefix + "GrafanaInitPassword", this.GrafanaInitPassword);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "DockerImage", this.DockerImage);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

