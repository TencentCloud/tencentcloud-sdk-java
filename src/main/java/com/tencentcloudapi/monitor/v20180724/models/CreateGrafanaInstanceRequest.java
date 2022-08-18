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

public class CreateGrafanaInstanceRequest extends AbstractModel{

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID 数组
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Grafana 初始密码
    */
    @SerializedName("GrafanaInitPassword")
    @Expose
    private String GrafanaInitPassword;

    /**
    * 是否启用外网
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * 标签
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID 数组 
     * @return SubnetIds 子网 ID 数组
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网 ID 数组
     * @param SubnetIds 子网 ID 数组
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Grafana 初始密码 
     * @return GrafanaInitPassword Grafana 初始密码
     */
    public String getGrafanaInitPassword() {
        return this.GrafanaInitPassword;
    }

    /**
     * Set Grafana 初始密码
     * @param GrafanaInitPassword Grafana 初始密码
     */
    public void setGrafanaInitPassword(String GrafanaInitPassword) {
        this.GrafanaInitPassword = GrafanaInitPassword;
    }

    /**
     * Get 是否启用外网 
     * @return EnableInternet 是否启用外网
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set 是否启用外网
     * @param EnableInternet 是否启用外网
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get 标签 
     * @return TagSpecification 标签
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签
     * @param TagSpecification 标签
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
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
        if (source.GrafanaInitPassword != null) {
            this.GrafanaInitPassword = new String(source.GrafanaInitPassword);
        }
        if (source.EnableInternet != null) {
            this.EnableInternet = new Boolean(source.EnableInternet);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "GrafanaInitPassword", this.GrafanaInitPassword);
        this.setParamSimple(map, prefix + "EnableInternet", this.EnableInternet);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

