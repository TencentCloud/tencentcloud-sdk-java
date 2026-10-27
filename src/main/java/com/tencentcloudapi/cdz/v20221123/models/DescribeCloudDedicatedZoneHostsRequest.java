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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudDedicatedZoneHostsRequest extends AbstractModel {

    /**
    * <p>专属可用区ID</p>
    */
    @SerializedName("CloudDedicatedZoneID")
    @Expose
    private String CloudDedicatedZoneID;

    /**
    * <p>一个或多个Host面的CVM实例信息。最大支持查询100台Host。</p>
    */
    @SerializedName("HostUuids")
    @Expose
    private String [] HostUuids;

    /**
    * <p>查询一个实例或者多个实例所在的Host上面的CVM实例信息。最大支持查询100台实例。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>专属可用区ID</p> 
     * @return CloudDedicatedZoneID <p>专属可用区ID</p>
     */
    public String getCloudDedicatedZoneID() {
        return this.CloudDedicatedZoneID;
    }

    /**
     * Set <p>专属可用区ID</p>
     * @param CloudDedicatedZoneID <p>专属可用区ID</p>
     */
    public void setCloudDedicatedZoneID(String CloudDedicatedZoneID) {
        this.CloudDedicatedZoneID = CloudDedicatedZoneID;
    }

    /**
     * Get <p>一个或多个Host面的CVM实例信息。最大支持查询100台Host。</p> 
     * @return HostUuids <p>一个或多个Host面的CVM实例信息。最大支持查询100台Host。</p>
     */
    public String [] getHostUuids() {
        return this.HostUuids;
    }

    /**
     * Set <p>一个或多个Host面的CVM实例信息。最大支持查询100台Host。</p>
     * @param HostUuids <p>一个或多个Host面的CVM实例信息。最大支持查询100台Host。</p>
     */
    public void setHostUuids(String [] HostUuids) {
        this.HostUuids = HostUuids;
    }

    /**
     * Get <p>查询一个实例或者多个实例所在的Host上面的CVM实例信息。最大支持查询100台实例。</p> 
     * @return InstanceIds <p>查询一个实例或者多个实例所在的Host上面的CVM实例信息。最大支持查询100台实例。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>查询一个实例或者多个实例所在的Host上面的CVM实例信息。最大支持查询100台实例。</p>
     * @param InstanceIds <p>查询一个实例或者多个实例所在的Host上面的CVM实例信息。最大支持查询100台实例。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p> 
     * @return Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
     * @param Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。该参数仅与CloudDedicatedZoneID有关，传递了HostUuids和InstanceIds则会失效。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCloudDedicatedZoneHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudDedicatedZoneHostsRequest(DescribeCloudDedicatedZoneHostsRequest source) {
        if (source.CloudDedicatedZoneID != null) {
            this.CloudDedicatedZoneID = new String(source.CloudDedicatedZoneID);
        }
        if (source.HostUuids != null) {
            this.HostUuids = new String[source.HostUuids.length];
            for (int i = 0; i < source.HostUuids.length; i++) {
                this.HostUuids[i] = new String(source.HostUuids[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudDedicatedZoneID", this.CloudDedicatedZoneID);
        this.setParamArraySimple(map, prefix + "HostUuids.", this.HostUuids);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

