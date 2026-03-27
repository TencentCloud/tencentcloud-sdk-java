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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRocketMQInstanceSpecRequest extends AbstractModel {

    /**
    * <p>专享实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例规格，<br>rocket-vip-basic-1 基础型<br>rocket-vip-basic-2 标准型<br>rocket-vip-basic-3 高阶Ⅰ型<br>rocket-vip-basic-4 高阶Ⅱ型</p>
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * <p>节点数量</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>存储空间，GB为单位</p>
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * <p>部署可用区列表</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
     * Get <p>专享实例ID</p> 
     * @return InstanceId <p>专享实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>专享实例ID</p>
     * @param InstanceId <p>专享实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例规格，<br>rocket-vip-basic-1 基础型<br>rocket-vip-basic-2 标准型<br>rocket-vip-basic-3 高阶Ⅰ型<br>rocket-vip-basic-4 高阶Ⅱ型</p> 
     * @return Specification <p>实例规格，<br>rocket-vip-basic-1 基础型<br>rocket-vip-basic-2 标准型<br>rocket-vip-basic-3 高阶Ⅰ型<br>rocket-vip-basic-4 高阶Ⅱ型</p>
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set <p>实例规格，<br>rocket-vip-basic-1 基础型<br>rocket-vip-basic-2 标准型<br>rocket-vip-basic-3 高阶Ⅰ型<br>rocket-vip-basic-4 高阶Ⅱ型</p>
     * @param Specification <p>实例规格，<br>rocket-vip-basic-1 基础型<br>rocket-vip-basic-2 标准型<br>rocket-vip-basic-3 高阶Ⅰ型<br>rocket-vip-basic-4 高阶Ⅱ型</p>
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get <p>节点数量</p> 
     * @return NodeCount <p>节点数量</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>节点数量</p>
     * @param NodeCount <p>节点数量</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>存储空间，GB为单位</p> 
     * @return StorageSize <p>存储空间，GB为单位</p>
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set <p>存储空间，GB为单位</p>
     * @param StorageSize <p>存储空间，GB为单位</p>
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get <p>部署可用区列表</p> 
     * @return ZoneIds <p>部署可用区列表</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>部署可用区列表</p>
     * @param ZoneIds <p>部署可用区列表</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public ModifyRocketMQInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQInstanceSpecRequest(ModifyRocketMQInstanceSpecRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

