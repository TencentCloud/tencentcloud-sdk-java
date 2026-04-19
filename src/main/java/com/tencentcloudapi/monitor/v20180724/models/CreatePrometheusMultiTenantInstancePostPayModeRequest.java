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

public class CreatePrometheusMultiTenantInstancePostPayModeRequest extends AbstractModel {

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>VPC ID(可通过 vpc:DescribeVpcs 接口获取，与实例同地域)</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID(可通过 vpc:DescribeSubnets 接口获取)</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>数据存储时间（单位天），限制值为15, 30, 45, 90, 180, 365, 730之一</p>
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * <p>可用区(与子网同可用区)</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例的标签</p>
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * <p>需要关联的 Grafana 实例</p>
    */
    @SerializedName("GrafanaInstanceId")
    @Expose
    private String GrafanaInstanceId;

    /**
    * <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
    */
    @SerializedName("InstanceAttributes")
    @Expose
    private PrometheusRuleKV [] InstanceAttributes;

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
     * Get <p>VPC ID(可通过 vpc:DescribeVpcs 接口获取，与实例同地域)</p> 
     * @return VpcId <p>VPC ID(可通过 vpc:DescribeVpcs 接口获取，与实例同地域)</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID(可通过 vpc:DescribeVpcs 接口获取，与实例同地域)</p>
     * @param VpcId <p>VPC ID(可通过 vpc:DescribeVpcs 接口获取，与实例同地域)</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID(可通过 vpc:DescribeSubnets 接口获取)</p> 
     * @return SubnetId <p>子网 ID(可通过 vpc:DescribeSubnets 接口获取)</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID(可通过 vpc:DescribeSubnets 接口获取)</p>
     * @param SubnetId <p>子网 ID(可通过 vpc:DescribeSubnets 接口获取)</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>数据存储时间（单位天），限制值为15, 30, 45, 90, 180, 365, 730之一</p> 
     * @return DataRetentionTime <p>数据存储时间（单位天），限制值为15, 30, 45, 90, 180, 365, 730之一</p>
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set <p>数据存储时间（单位天），限制值为15, 30, 45, 90, 180, 365, 730之一</p>
     * @param DataRetentionTime <p>数据存储时间（单位天），限制值为15, 30, 45, 90, 180, 365, 730之一</p>
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get <p>可用区(与子网同可用区)</p> 
     * @return Zone <p>可用区(与子网同可用区)</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区(与子网同可用区)</p>
     * @param Zone <p>可用区(与子网同可用区)</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例的标签</p> 
     * @return TagSpecification <p>实例的标签</p>
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>实例的标签</p>
     * @param TagSpecification <p>实例的标签</p>
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get <p>需要关联的 Grafana 实例</p> 
     * @return GrafanaInstanceId <p>需要关联的 Grafana 实例</p>
     */
    public String getGrafanaInstanceId() {
        return this.GrafanaInstanceId;
    }

    /**
     * Set <p>需要关联的 Grafana 实例</p>
     * @param GrafanaInstanceId <p>需要关联的 Grafana 实例</p>
     */
    public void setGrafanaInstanceId(String GrafanaInstanceId) {
        this.GrafanaInstanceId = GrafanaInstanceId;
    }

    /**
     * Get <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p> 
     * @return InstanceAttributes <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
     */
    public PrometheusRuleKV [] getInstanceAttributes() {
        return this.InstanceAttributes;
    }

    /**
     * Set <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
     * @param InstanceAttributes <p>标识prom实例特殊属性</p><p>归档存储时长(天):<br>key: LongTermStorageRetentionTime<br>value: 60-730</p>
     */
    public void setInstanceAttributes(PrometheusRuleKV [] InstanceAttributes) {
        this.InstanceAttributes = InstanceAttributes;
    }

    public CreatePrometheusMultiTenantInstancePostPayModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrometheusMultiTenantInstancePostPayModeRequest(CreatePrometheusMultiTenantInstancePostPayModeRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.GrafanaInstanceId != null) {
            this.GrafanaInstanceId = new String(source.GrafanaInstanceId);
        }
        if (source.InstanceAttributes != null) {
            this.InstanceAttributes = new PrometheusRuleKV[source.InstanceAttributes.length];
            for (int i = 0; i < source.InstanceAttributes.length; i++) {
                this.InstanceAttributes[i] = new PrometheusRuleKV(source.InstanceAttributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "GrafanaInstanceId", this.GrafanaInstanceId);
        this.setParamArrayObj(map, prefix + "InstanceAttributes.", this.InstanceAttributes);

    }
}

