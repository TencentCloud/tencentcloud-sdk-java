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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmInstancesRequest extends AbstractModel {

    /**
    * Tag 列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 按业务系统名过滤，支持模糊检索
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 按业务系统 ID 过滤，支持模糊检索
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 按业务系统 ID 过滤
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）
    */
    @SerializedName("DemoInstanceFlag")
    @Expose
    private Long DemoInstanceFlag;

    /**
    * 是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）
    */
    @SerializedName("AllRegionsFlag")
    @Expose
    private Long AllRegionsFlag;

    /**
     * Get Tag 列表 
     * @return Tags Tag 列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag 列表
     * @param Tags Tag 列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 按业务系统名过滤，支持模糊检索 
     * @return InstanceName 按业务系统名过滤，支持模糊检索
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 按业务系统名过滤，支持模糊检索
     * @param InstanceName 按业务系统名过滤，支持模糊检索
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 按业务系统 ID 过滤，支持模糊检索 
     * @return InstanceId 按业务系统 ID 过滤，支持模糊检索
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 按业务系统 ID 过滤，支持模糊检索
     * @param InstanceId 按业务系统 ID 过滤，支持模糊检索
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 按业务系统 ID 过滤 
     * @return InstanceIds 按业务系统 ID 过滤
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 按业务系统 ID 过滤
     * @param InstanceIds 按业务系统 ID 过滤
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0） 
     * @return DemoInstanceFlag 是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）
     */
    public Long getDemoInstanceFlag() {
        return this.DemoInstanceFlag;
    }

    /**
     * Set 是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）
     * @param DemoInstanceFlag 是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）
     */
    public void setDemoInstanceFlag(Long DemoInstanceFlag) {
        this.DemoInstanceFlag = DemoInstanceFlag;
    }

    /**
     * Get 是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0） 
     * @return AllRegionsFlag 是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）
     */
    public Long getAllRegionsFlag() {
        return this.AllRegionsFlag;
    }

    /**
     * Set 是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）
     * @param AllRegionsFlag 是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）
     */
    public void setAllRegionsFlag(Long AllRegionsFlag) {
        this.AllRegionsFlag = AllRegionsFlag;
    }

    public DescribeApmInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmInstancesRequest(DescribeApmInstancesRequest source) {
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DemoInstanceFlag != null) {
            this.DemoInstanceFlag = new Long(source.DemoInstanceFlag);
        }
        if (source.AllRegionsFlag != null) {
            this.AllRegionsFlag = new Long(source.AllRegionsFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DemoInstanceFlag", this.DemoInstanceFlag);
        this.setParamSimple(map, prefix + "AllRegionsFlag", this.AllRegionsFlag);

    }
}

