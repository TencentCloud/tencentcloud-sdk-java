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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel{

    /**
    * 集群唯一ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群类型，如TGW，STGW，VPCGW
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群标签，只有STGW集群有标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * 集群所在可用区，如ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群网络类型，如Public，Private
    */
    @SerializedName("Network")
    @Expose
    private String Network;

    /**
    * 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * 最大入带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxInFlow")
    @Expose
    private Long MaxInFlow;

    /**
    * 最大入包量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxInPkg")
    @Expose
    private Long MaxInPkg;

    /**
    * 最大出带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxOutFlow")
    @Expose
    private Long MaxOutFlow;

    /**
    * 最大出包量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxOutPkg")
    @Expose
    private Long MaxOutPkg;

    /**
    * 最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxNewConn")
    @Expose
    private Long MaxNewConn;

    /**
    * http最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTPMaxNewConn")
    @Expose
    private Long HTTPMaxNewConn;

    /**
    * https最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTPSMaxNewConn")
    @Expose
    private Long HTTPSMaxNewConn;

    /**
    * http QPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTPQps")
    @Expose
    private Long HTTPQps;

    /**
    * https QPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTPSQps")
    @Expose
    private Long HTTPSQps;

    /**
    * 集群内资源总数目
    */
    @SerializedName("ResourceCount")
    @Expose
    private Long ResourceCount;

    /**
    * 集群内空闲资源数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdleResourceCount")
    @Expose
    private Long IdleResourceCount;

    /**
    * 集群内转发机的数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalanceDirectorCount")
    @Expose
    private Long LoadBalanceDirectorCount;

    /**
    * 集群的Isp属性，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 集群所在的可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClustersZone")
    @Expose
    private ClustersZone ClustersZone;

    /**
    * 集群版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClustersVersion")
    @Expose
    private String ClustersVersion;

    /**
     * Get 集群唯一ID 
     * @return ClusterId 集群唯一ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群唯一ID
     * @param ClusterId 集群唯一ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群类型，如TGW，STGW，VPCGW 
     * @return ClusterType 集群类型，如TGW，STGW，VPCGW
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，如TGW，STGW，VPCGW
     * @param ClusterType 集群类型，如TGW，STGW，VPCGW
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群标签，只有STGW集群有标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterTag 集群标签，只有STGW集群有标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set 集群标签，只有STGW集群有标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterTag 集群标签，只有STGW集群有标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get 集群所在可用区，如ap-guangzhou-1 
     * @return Zone 集群所在可用区，如ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 集群所在可用区，如ap-guangzhou-1
     * @param Zone 集群所在可用区，如ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群网络类型，如Public，Private 
     * @return Network 集群网络类型，如Public，Private
     */
    public String getNetwork() {
        return this.Network;
    }

    /**
     * Set 集群网络类型，如Public，Private
     * @param Network 集群网络类型，如Public，Private
     */
    public void setNetwork(String Network) {
        this.Network = Network;
    }

    /**
     * Get 最大连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConn 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConn 最大连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get 最大入带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxInFlow 最大入带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxInFlow() {
        return this.MaxInFlow;
    }

    /**
     * Set 最大入带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxInFlow 最大入带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxInFlow(Long MaxInFlow) {
        this.MaxInFlow = MaxInFlow;
    }

    /**
     * Get 最大入包量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxInPkg 最大入包量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxInPkg() {
        return this.MaxInPkg;
    }

    /**
     * Set 最大入包量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxInPkg 最大入包量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxInPkg(Long MaxInPkg) {
        this.MaxInPkg = MaxInPkg;
    }

    /**
     * Get 最大出带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxOutFlow 最大出带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxOutFlow() {
        return this.MaxOutFlow;
    }

    /**
     * Set 最大出带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxOutFlow 最大出带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxOutFlow(Long MaxOutFlow) {
        this.MaxOutFlow = MaxOutFlow;
    }

    /**
     * Get 最大出包量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxOutPkg 最大出包量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxOutPkg() {
        return this.MaxOutPkg;
    }

    /**
     * Set 最大出包量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxOutPkg 最大出包量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxOutPkg(Long MaxOutPkg) {
        this.MaxOutPkg = MaxOutPkg;
    }

    /**
     * Get 最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxNewConn 最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxNewConn() {
        return this.MaxNewConn;
    }

    /**
     * Set 最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxNewConn 最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxNewConn(Long MaxNewConn) {
        this.MaxNewConn = MaxNewConn;
    }

    /**
     * Get http最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTPMaxNewConn http最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHTTPMaxNewConn() {
        return this.HTTPMaxNewConn;
    }

    /**
     * Set http最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTPMaxNewConn http最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTPMaxNewConn(Long HTTPMaxNewConn) {
        this.HTTPMaxNewConn = HTTPMaxNewConn;
    }

    /**
     * Get https最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTPSMaxNewConn https最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHTTPSMaxNewConn() {
        return this.HTTPSMaxNewConn;
    }

    /**
     * Set https最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTPSMaxNewConn https最大新建连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTPSMaxNewConn(Long HTTPSMaxNewConn) {
        this.HTTPSMaxNewConn = HTTPSMaxNewConn;
    }

    /**
     * Get http QPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTPQps http QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHTTPQps() {
        return this.HTTPQps;
    }

    /**
     * Set http QPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTPQps http QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTPQps(Long HTTPQps) {
        this.HTTPQps = HTTPQps;
    }

    /**
     * Get https QPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTPSQps https QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHTTPSQps() {
        return this.HTTPSQps;
    }

    /**
     * Set https QPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTPSQps https QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTPSQps(Long HTTPSQps) {
        this.HTTPSQps = HTTPSQps;
    }

    /**
     * Get 集群内资源总数目 
     * @return ResourceCount 集群内资源总数目
     */
    public Long getResourceCount() {
        return this.ResourceCount;
    }

    /**
     * Set 集群内资源总数目
     * @param ResourceCount 集群内资源总数目
     */
    public void setResourceCount(Long ResourceCount) {
        this.ResourceCount = ResourceCount;
    }

    /**
     * Get 集群内空闲资源数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdleResourceCount 集群内空闲资源数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdleResourceCount() {
        return this.IdleResourceCount;
    }

    /**
     * Set 集群内空闲资源数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdleResourceCount 集群内空闲资源数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdleResourceCount(Long IdleResourceCount) {
        this.IdleResourceCount = IdleResourceCount;
    }

    /**
     * Get 集群内转发机的数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalanceDirectorCount 集群内转发机的数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoadBalanceDirectorCount() {
        return this.LoadBalanceDirectorCount;
    }

    /**
     * Set 集群内转发机的数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalanceDirectorCount 集群内转发机的数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalanceDirectorCount(Long LoadBalanceDirectorCount) {
        this.LoadBalanceDirectorCount = LoadBalanceDirectorCount;
    }

    /**
     * Get 集群的Isp属性，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Isp 集群的Isp属性，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 集群的Isp属性，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Isp 集群的Isp属性，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 集群所在的可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClustersZone 集群所在的可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClustersZone getClustersZone() {
        return this.ClustersZone;
    }

    /**
     * Set 集群所在的可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClustersZone 集群所在的可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClustersZone(ClustersZone ClustersZone) {
        this.ClustersZone = ClustersZone;
    }

    /**
     * Get 集群版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClustersVersion 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClustersVersion() {
        return this.ClustersVersion;
    }

    /**
     * Set 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClustersVersion 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClustersVersion(String ClustersVersion) {
        this.ClustersVersion = ClustersVersion;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Network != null) {
            this.Network = new String(source.Network);
        }
        if (source.MaxConn != null) {
            this.MaxConn = new Long(source.MaxConn);
        }
        if (source.MaxInFlow != null) {
            this.MaxInFlow = new Long(source.MaxInFlow);
        }
        if (source.MaxInPkg != null) {
            this.MaxInPkg = new Long(source.MaxInPkg);
        }
        if (source.MaxOutFlow != null) {
            this.MaxOutFlow = new Long(source.MaxOutFlow);
        }
        if (source.MaxOutPkg != null) {
            this.MaxOutPkg = new Long(source.MaxOutPkg);
        }
        if (source.MaxNewConn != null) {
            this.MaxNewConn = new Long(source.MaxNewConn);
        }
        if (source.HTTPMaxNewConn != null) {
            this.HTTPMaxNewConn = new Long(source.HTTPMaxNewConn);
        }
        if (source.HTTPSMaxNewConn != null) {
            this.HTTPSMaxNewConn = new Long(source.HTTPSMaxNewConn);
        }
        if (source.HTTPQps != null) {
            this.HTTPQps = new Long(source.HTTPQps);
        }
        if (source.HTTPSQps != null) {
            this.HTTPSQps = new Long(source.HTTPSQps);
        }
        if (source.ResourceCount != null) {
            this.ResourceCount = new Long(source.ResourceCount);
        }
        if (source.IdleResourceCount != null) {
            this.IdleResourceCount = new Long(source.IdleResourceCount);
        }
        if (source.LoadBalanceDirectorCount != null) {
            this.LoadBalanceDirectorCount = new Long(source.LoadBalanceDirectorCount);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.ClustersZone != null) {
            this.ClustersZone = new ClustersZone(source.ClustersZone);
        }
        if (source.ClustersVersion != null) {
            this.ClustersVersion = new String(source.ClustersVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxInFlow", this.MaxInFlow);
        this.setParamSimple(map, prefix + "MaxInPkg", this.MaxInPkg);
        this.setParamSimple(map, prefix + "MaxOutFlow", this.MaxOutFlow);
        this.setParamSimple(map, prefix + "MaxOutPkg", this.MaxOutPkg);
        this.setParamSimple(map, prefix + "MaxNewConn", this.MaxNewConn);
        this.setParamSimple(map, prefix + "HTTPMaxNewConn", this.HTTPMaxNewConn);
        this.setParamSimple(map, prefix + "HTTPSMaxNewConn", this.HTTPSMaxNewConn);
        this.setParamSimple(map, prefix + "HTTPQps", this.HTTPQps);
        this.setParamSimple(map, prefix + "HTTPSQps", this.HTTPSQps);
        this.setParamSimple(map, prefix + "ResourceCount", this.ResourceCount);
        this.setParamSimple(map, prefix + "IdleResourceCount", this.IdleResourceCount);
        this.setParamSimple(map, prefix + "LoadBalanceDirectorCount", this.LoadBalanceDirectorCount);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamObj(map, prefix + "ClustersZone.", this.ClustersZone);
        this.setParamSimple(map, prefix + "ClustersVersion", this.ClustersVersion);

    }
}

