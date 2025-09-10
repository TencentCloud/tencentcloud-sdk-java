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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateAclRequest extends AbstractModel {

    /**
    * ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Acl资源类型，(2:TOPIC）
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源列表数组，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取。
    */
    @SerializedName("ResourceNames")
    @Expose
    private String [] ResourceNames;

    /**
    * 设置的ACL规则列表，可通过[DescribeAclRule](https://cloud.tencent.com/document/product/597/89217)接口获取。
    */
    @SerializedName("RuleList")
    @Expose
    private AclRuleInfo [] RuleList;

    /**
     * Get ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Acl资源类型，(2:TOPIC） 
     * @return ResourceType Acl资源类型，(2:TOPIC）
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型，(2:TOPIC）
     * @param ResourceType Acl资源类型，(2:TOPIC）
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源列表数组，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取。 
     * @return ResourceNames 资源列表数组，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取。
     */
    public String [] getResourceNames() {
        return this.ResourceNames;
    }

    /**
     * Set 资源列表数组，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取。
     * @param ResourceNames 资源列表数组，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取。
     */
    public void setResourceNames(String [] ResourceNames) {
        this.ResourceNames = ResourceNames;
    }

    /**
     * Get 设置的ACL规则列表，可通过[DescribeAclRule](https://cloud.tencent.com/document/product/597/89217)接口获取。 
     * @return RuleList 设置的ACL规则列表，可通过[DescribeAclRule](https://cloud.tencent.com/document/product/597/89217)接口获取。
     */
    public AclRuleInfo [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 设置的ACL规则列表，可通过[DescribeAclRule](https://cloud.tencent.com/document/product/597/89217)接口获取。
     * @param RuleList 设置的ACL规则列表，可通过[DescribeAclRule](https://cloud.tencent.com/document/product/597/89217)接口获取。
     */
    public void setRuleList(AclRuleInfo [] RuleList) {
        this.RuleList = RuleList;
    }

    public BatchCreateAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateAclRequest(BatchCreateAclRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceNames != null) {
            this.ResourceNames = new String[source.ResourceNames.length];
            for (int i = 0; i < source.ResourceNames.length; i++) {
                this.ResourceNames[i] = new String(source.ResourceNames[i]);
            }
        }
        if (source.RuleList != null) {
            this.RuleList = new AclRuleInfo[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new AclRuleInfo(source.RuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ResourceNames.", this.ResourceNames);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);

    }
}

