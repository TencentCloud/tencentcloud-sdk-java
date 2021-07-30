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

public class DescribePrometheusInstanceResponse extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 私有网络id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * cos桶名称
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * 数据查询地址
    */
    @SerializedName("QueryAddress")
    @Expose
    private String QueryAddress;

    /**
    * 实例中grafana相关的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grafana")
    @Expose
    private PrometheusGrafanaInfo Grafana;

    /**
    * 用户自定义alertmanager
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertManagerUrl")
    @Expose
    private String AlertManagerUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 私有网络id 
     * @return VpcId 私有网络id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络id
     * @param VpcId 私有网络id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get cos桶名称 
     * @return COSBucket cos桶名称
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set cos桶名称
     * @param COSBucket cos桶名称
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get 数据查询地址 
     * @return QueryAddress 数据查询地址
     */
    public String getQueryAddress() {
        return this.QueryAddress;
    }

    /**
     * Set 数据查询地址
     * @param QueryAddress 数据查询地址
     */
    public void setQueryAddress(String QueryAddress) {
        this.QueryAddress = QueryAddress;
    }

    /**
     * Get 实例中grafana相关的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grafana 实例中grafana相关的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusGrafanaInfo getGrafana() {
        return this.Grafana;
    }

    /**
     * Set 实例中grafana相关的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grafana 实例中grafana相关的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafana(PrometheusGrafanaInfo Grafana) {
        this.Grafana = Grafana;
    }

    /**
     * Get 用户自定义alertmanager
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertManagerUrl 用户自定义alertmanager
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertManagerUrl() {
        return this.AlertManagerUrl;
    }

    /**
     * Set 用户自定义alertmanager
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertManagerUrl 用户自定义alertmanager
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertManagerUrl(String AlertManagerUrl) {
        this.AlertManagerUrl = AlertManagerUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePrometheusInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceResponse(DescribePrometheusInstanceResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
        if (source.QueryAddress != null) {
            this.QueryAddress = new String(source.QueryAddress);
        }
        if (source.Grafana != null) {
            this.Grafana = new PrometheusGrafanaInfo(source.Grafana);
        }
        if (source.AlertManagerUrl != null) {
            this.AlertManagerUrl = new String(source.AlertManagerUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "QueryAddress", this.QueryAddress);
        this.setParamObj(map, prefix + "Grafana.", this.Grafana);
        this.setParamSimple(map, prefix + "AlertManagerUrl", this.AlertManagerUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

