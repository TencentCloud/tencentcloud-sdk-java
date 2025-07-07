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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecItem extends AbstractModel {

    /**
    * 规格信息标识。格式如：mongo.HIO10G.128g。由节点类型、规格类型、内存规格三部分组成。
- 节点类型，如下所示。
  - mongo：Mongod 节点。
 - mongos：Mongos 节点。
 - cfgstr：Configserver 节点。
- 规格类型，如下所示。
 - HIO10G：通用高HIO万兆型。
 - HCD：云盘版类型。
- 内存规格，如下所示：
 - 支持4、8、16、32、64、128、240、512。
 - 单位g：表示GB。128g则表示128GB。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * 售卖规格有效标志，取值范围如下：
- 0：停止售卖，
- 1：开放售卖。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 计算资源规格，CPU核数。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存规格，单位为：MB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 默认磁盘规格，单位为：MB。
    */
    @SerializedName("DefaultStorage")
    @Expose
    private Long DefaultStorage;

    /**
    * 最大磁盘规格，单位为：MB。
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 最小磁盘规格，单位为：MB。
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * 指每秒最大请求次数，单位为：次/秒。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 规格所支持的最大连接数限制。
    */
    @SerializedName("Conns")
    @Expose
    private Long Conns;

    /**
    * 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersionCode")
    @Expose
    private String MongoVersionCode;

    /**
    * 实例版本对应的数字版本。
    */
    @SerializedName("MongoVersionValue")
    @Expose
    private Long MongoVersionValue;

    /**
    * 实例版本信息。支持：3.6、4.2、4.4、5.0、6.0。

    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 存储引擎。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 集群类型，取值如下：
- 1：分片集群。
- 0：副本集集群。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 每个副本集最小节点数。
    */
    @SerializedName("MinNodeNum")
    @Expose
    private Long MinNodeNum;

    /**
    * 每个副本集最大节点数。
    */
    @SerializedName("MaxNodeNum")
    @Expose
    private Long MaxNodeNum;

    /**
    * 最小分片数。
    */
    @SerializedName("MinReplicateSetNum")
    @Expose
    private Long MinReplicateSetNum;

    /**
    * 最大分片数。
    */
    @SerializedName("MaxReplicateSetNum")
    @Expose
    private Long MaxReplicateSetNum;

    /**
    * 每个分片最小节点数。
    */
    @SerializedName("MinReplicateSetNodeNum")
    @Expose
    private Long MinReplicateSetNodeNum;

    /**
    * 每个分片最大节点数。
    */
    @SerializedName("MaxReplicateSetNodeNum")
    @Expose
    private Long MaxReplicateSetNodeNum;

    /**
    * 集群的规格类型，取值范围如下：
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get 规格信息标识。格式如：mongo.HIO10G.128g。由节点类型、规格类型、内存规格三部分组成。
- 节点类型，如下所示。
  - mongo：Mongod 节点。
 - mongos：Mongos 节点。
 - cfgstr：Configserver 节点。
- 规格类型，如下所示。
 - HIO10G：通用高HIO万兆型。
 - HCD：云盘版类型。
- 内存规格，如下所示：
 - 支持4、8、16、32、64、128、240、512。
 - 单位g：表示GB。128g则表示128GB。 
     * @return SpecCode 规格信息标识。格式如：mongo.HIO10G.128g。由节点类型、规格类型、内存规格三部分组成。
- 节点类型，如下所示。
  - mongo：Mongod 节点。
 - mongos：Mongos 节点。
 - cfgstr：Configserver 节点。
- 规格类型，如下所示。
 - HIO10G：通用高HIO万兆型。
 - HCD：云盘版类型。
- 内存规格，如下所示：
 - 支持4、8、16、32、64、128、240、512。
 - 单位g：表示GB。128g则表示128GB。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 规格信息标识。格式如：mongo.HIO10G.128g。由节点类型、规格类型、内存规格三部分组成。
- 节点类型，如下所示。
  - mongo：Mongod 节点。
 - mongos：Mongos 节点。
 - cfgstr：Configserver 节点。
- 规格类型，如下所示。
 - HIO10G：通用高HIO万兆型。
 - HCD：云盘版类型。
- 内存规格，如下所示：
 - 支持4、8、16、32、64、128、240、512。
 - 单位g：表示GB。128g则表示128GB。
     * @param SpecCode 规格信息标识。格式如：mongo.HIO10G.128g。由节点类型、规格类型、内存规格三部分组成。
- 节点类型，如下所示。
  - mongo：Mongod 节点。
 - mongos：Mongos 节点。
 - cfgstr：Configserver 节点。
- 规格类型，如下所示。
 - HIO10G：通用高HIO万兆型。
 - HCD：云盘版类型。
- 内存规格，如下所示：
 - 支持4、8、16、32、64、128、240、512。
 - 单位g：表示GB。128g则表示128GB。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get 售卖规格有效标志，取值范围如下：
- 0：停止售卖，
- 1：开放售卖。 
     * @return Status 售卖规格有效标志，取值范围如下：
- 0：停止售卖，
- 1：开放售卖。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 售卖规格有效标志，取值范围如下：
- 0：停止售卖，
- 1：开放售卖。
     * @param Status 售卖规格有效标志，取值范围如下：
- 0：停止售卖，
- 1：开放售卖。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 计算资源规格，CPU核数。 
     * @return Cpu 计算资源规格，CPU核数。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 计算资源规格，CPU核数。
     * @param Cpu 计算资源规格，CPU核数。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存规格，单位为：MB。 
     * @return Memory 内存规格，单位为：MB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存规格，单位为：MB。
     * @param Memory 内存规格，单位为：MB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 默认磁盘规格，单位为：MB。 
     * @return DefaultStorage 默认磁盘规格，单位为：MB。
     */
    public Long getDefaultStorage() {
        return this.DefaultStorage;
    }

    /**
     * Set 默认磁盘规格，单位为：MB。
     * @param DefaultStorage 默认磁盘规格，单位为：MB。
     */
    public void setDefaultStorage(Long DefaultStorage) {
        this.DefaultStorage = DefaultStorage;
    }

    /**
     * Get 最大磁盘规格，单位为：MB。 
     * @return MaxStorage 最大磁盘规格，单位为：MB。
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 最大磁盘规格，单位为：MB。
     * @param MaxStorage 最大磁盘规格，单位为：MB。
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 最小磁盘规格，单位为：MB。 
     * @return MinStorage 最小磁盘规格，单位为：MB。
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set 最小磁盘规格，单位为：MB。
     * @param MinStorage 最小磁盘规格，单位为：MB。
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get 指每秒最大请求次数，单位为：次/秒。 
     * @return Qps 指每秒最大请求次数，单位为：次/秒。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 指每秒最大请求次数，单位为：次/秒。
     * @param Qps 指每秒最大请求次数，单位为：次/秒。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 规格所支持的最大连接数限制。 
     * @return Conns 规格所支持的最大连接数限制。
     */
    public Long getConns() {
        return this.Conns;
    }

    /**
     * Set 规格所支持的最大连接数限制。
     * @param Conns 规格所支持的最大连接数限制。
     */
    public void setConns(Long Conns) {
        this.Conns = Conns;
    }

    /**
     * Get 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。 
     * @return MongoVersionCode 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     */
    public String getMongoVersionCode() {
        return this.MongoVersionCode;
    }

    /**
     * Set 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     * @param MongoVersionCode 实例存储引擎版本信息。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersionCode(String MongoVersionCode) {
        this.MongoVersionCode = MongoVersionCode;
    }

    /**
     * Get 实例版本对应的数字版本。 
     * @return MongoVersionValue 实例版本对应的数字版本。
     */
    public Long getMongoVersionValue() {
        return this.MongoVersionValue;
    }

    /**
     * Set 实例版本对应的数字版本。
     * @param MongoVersionValue 实例版本对应的数字版本。
     */
    public void setMongoVersionValue(Long MongoVersionValue) {
        this.MongoVersionValue = MongoVersionValue;
    }

    /**
     * Get 实例版本信息。支持：3.6、4.2、4.4、5.0、6.0。
 
     * @return Version 实例版本信息。支持：3.6、4.2、4.4、5.0、6.0。

     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 实例版本信息。支持：3.6、4.2、4.4、5.0、6.0。

     * @param Version 实例版本信息。支持：3.6、4.2、4.4、5.0、6.0。

     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 存储引擎。 
     * @return EngineName 存储引擎。
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 存储引擎。
     * @param EngineName 存储引擎。
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 集群类型，取值如下：
- 1：分片集群。
- 0：副本集集群。 
     * @return ClusterType 集群类型，取值如下：
- 1：分片集群。
- 0：副本集集群。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，取值如下：
- 1：分片集群。
- 0：副本集集群。
     * @param ClusterType 集群类型，取值如下：
- 1：分片集群。
- 0：副本集集群。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 每个副本集最小节点数。 
     * @return MinNodeNum 每个副本集最小节点数。
     */
    public Long getMinNodeNum() {
        return this.MinNodeNum;
    }

    /**
     * Set 每个副本集最小节点数。
     * @param MinNodeNum 每个副本集最小节点数。
     */
    public void setMinNodeNum(Long MinNodeNum) {
        this.MinNodeNum = MinNodeNum;
    }

    /**
     * Get 每个副本集最大节点数。 
     * @return MaxNodeNum 每个副本集最大节点数。
     */
    public Long getMaxNodeNum() {
        return this.MaxNodeNum;
    }

    /**
     * Set 每个副本集最大节点数。
     * @param MaxNodeNum 每个副本集最大节点数。
     */
    public void setMaxNodeNum(Long MaxNodeNum) {
        this.MaxNodeNum = MaxNodeNum;
    }

    /**
     * Get 最小分片数。 
     * @return MinReplicateSetNum 最小分片数。
     */
    public Long getMinReplicateSetNum() {
        return this.MinReplicateSetNum;
    }

    /**
     * Set 最小分片数。
     * @param MinReplicateSetNum 最小分片数。
     */
    public void setMinReplicateSetNum(Long MinReplicateSetNum) {
        this.MinReplicateSetNum = MinReplicateSetNum;
    }

    /**
     * Get 最大分片数。 
     * @return MaxReplicateSetNum 最大分片数。
     */
    public Long getMaxReplicateSetNum() {
        return this.MaxReplicateSetNum;
    }

    /**
     * Set 最大分片数。
     * @param MaxReplicateSetNum 最大分片数。
     */
    public void setMaxReplicateSetNum(Long MaxReplicateSetNum) {
        this.MaxReplicateSetNum = MaxReplicateSetNum;
    }

    /**
     * Get 每个分片最小节点数。 
     * @return MinReplicateSetNodeNum 每个分片最小节点数。
     */
    public Long getMinReplicateSetNodeNum() {
        return this.MinReplicateSetNodeNum;
    }

    /**
     * Set 每个分片最小节点数。
     * @param MinReplicateSetNodeNum 每个分片最小节点数。
     */
    public void setMinReplicateSetNodeNum(Long MinReplicateSetNodeNum) {
        this.MinReplicateSetNodeNum = MinReplicateSetNodeNum;
    }

    /**
     * Get 每个分片最大节点数。 
     * @return MaxReplicateSetNodeNum 每个分片最大节点数。
     */
    public Long getMaxReplicateSetNodeNum() {
        return this.MaxReplicateSetNodeNum;
    }

    /**
     * Set 每个分片最大节点数。
     * @param MaxReplicateSetNodeNum 每个分片最大节点数。
     */
    public void setMaxReplicateSetNodeNum(Long MaxReplicateSetNodeNum) {
        this.MaxReplicateSetNodeNum = MaxReplicateSetNodeNum;
    }

    /**
     * Get 集群的规格类型，取值范围如下：
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。 
     * @return MachineType 集群的规格类型，取值范围如下：
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 集群的规格类型，取值范围如下：
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
     * @param MachineType 集群的规格类型，取值范围如下：
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public SpecItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecItem(SpecItem source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DefaultStorage != null) {
            this.DefaultStorage = new Long(source.DefaultStorage);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Conns != null) {
            this.Conns = new Long(source.Conns);
        }
        if (source.MongoVersionCode != null) {
            this.MongoVersionCode = new String(source.MongoVersionCode);
        }
        if (source.MongoVersionValue != null) {
            this.MongoVersionValue = new Long(source.MongoVersionValue);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.MinNodeNum != null) {
            this.MinNodeNum = new Long(source.MinNodeNum);
        }
        if (source.MaxNodeNum != null) {
            this.MaxNodeNum = new Long(source.MaxNodeNum);
        }
        if (source.MinReplicateSetNum != null) {
            this.MinReplicateSetNum = new Long(source.MinReplicateSetNum);
        }
        if (source.MaxReplicateSetNum != null) {
            this.MaxReplicateSetNum = new Long(source.MaxReplicateSetNum);
        }
        if (source.MinReplicateSetNodeNum != null) {
            this.MinReplicateSetNodeNum = new Long(source.MinReplicateSetNodeNum);
        }
        if (source.MaxReplicateSetNodeNum != null) {
            this.MaxReplicateSetNodeNum = new Long(source.MaxReplicateSetNodeNum);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DefaultStorage", this.DefaultStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Conns", this.Conns);
        this.setParamSimple(map, prefix + "MongoVersionCode", this.MongoVersionCode);
        this.setParamSimple(map, prefix + "MongoVersionValue", this.MongoVersionValue);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "MinNodeNum", this.MinNodeNum);
        this.setParamSimple(map, prefix + "MaxNodeNum", this.MaxNodeNum);
        this.setParamSimple(map, prefix + "MinReplicateSetNum", this.MinReplicateSetNum);
        this.setParamSimple(map, prefix + "MaxReplicateSetNum", this.MaxReplicateSetNum);
        this.setParamSimple(map, prefix + "MinReplicateSetNodeNum", this.MinReplicateSetNodeNum);
        this.setParamSimple(map, prefix + "MaxReplicateSetNodeNum", this.MaxReplicateSetNodeNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

