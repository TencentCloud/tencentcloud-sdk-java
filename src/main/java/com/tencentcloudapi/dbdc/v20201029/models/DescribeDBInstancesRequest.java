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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * 独享集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 独享集群主机Id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 分页返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例类型,0:mariadb, 1:tdsql
    */
    @SerializedName("ShardType")
    @Expose
    private Long [] ShardType;

    /**
     * Get 独享集群实例Id 
     * @return InstanceId 独享集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享集群实例Id
     * @param InstanceId 独享集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 独享集群主机Id 
     * @return HostId 独享集群主机Id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 独享集群主机Id
     * @param HostId 独享集群主机Id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 分页返回数量 
     * @return Limit 分页返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回数量
     * @param Limit 分页返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例类型,0:mariadb, 1:tdsql 
     * @return ShardType 实例类型,0:mariadb, 1:tdsql
     */
    public Long [] getShardType() {
        return this.ShardType;
    }

    /**
     * Set 实例类型,0:mariadb, 1:tdsql
     * @param ShardType 实例类型,0:mariadb, 1:tdsql
     */
    public void setShardType(Long [] ShardType) {
        this.ShardType = ShardType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ShardType != null) {
            this.ShardType = new Long[source.ShardType.length];
            for (int i = 0; i < source.ShardType.length; i++) {
                this.ShardType[i] = new Long(source.ShardType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ShardType.", this.ShardType);

    }
}

