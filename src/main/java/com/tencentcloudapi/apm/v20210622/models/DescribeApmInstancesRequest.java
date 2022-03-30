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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmInstancesRequest extends AbstractModel{

    /**
    * Tag列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 搜索实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 过滤实例ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 是否查询官方demo实例
    */
    @SerializedName("DemoInstanceFlag")
    @Expose
    private Long DemoInstanceFlag;

    /**
     * Get Tag列表 
     * @return Tags Tag列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag列表
     * @param Tags Tag列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 搜索实例名 
     * @return InstanceName 搜索实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 搜索实例名
     * @param InstanceName 搜索实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 过滤实例ID 
     * @return InstanceIds 过滤实例ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 过滤实例ID
     * @param InstanceIds 过滤实例ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 是否查询官方demo实例 
     * @return DemoInstanceFlag 是否查询官方demo实例
     */
    public Long getDemoInstanceFlag() {
        return this.DemoInstanceFlag;
    }

    /**
     * Set 是否查询官方demo实例
     * @param DemoInstanceFlag 是否查询官方demo实例
     */
    public void setDemoInstanceFlag(Long DemoInstanceFlag) {
        this.DemoInstanceFlag = DemoInstanceFlag;
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
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DemoInstanceFlag != null) {
            this.DemoInstanceFlag = new Long(source.DemoInstanceFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DemoInstanceFlag", this.DemoInstanceFlag);

    }
}

