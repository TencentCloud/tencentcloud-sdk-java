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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAclRequest extends AbstractModel{

    /**
    * 实例id信息
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Acl操作方式，(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS)
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * 权限类型，(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)，当前ckakfa支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
    * 默认为\*，表示任何host都可以访问，当前ckafka不支持host为\*，但是后面开源kafka的产品化会直接支持
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 用户列表，默认为*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
     * Get 实例id信息 
     * @return InstanceId 实例id信息
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id信息
     * @param InstanceId 实例id信息
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用 
     * @return ResourceType Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
     * @param ResourceType Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称 
     * @return ResourceName 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     * @param ResourceName 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Acl操作方式，(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS) 
     * @return Operation Acl操作方式，(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS)
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set Acl操作方式，(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS)
     * @param Operation Acl操作方式，(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS)
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 权限类型，(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)，当前ckakfa支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用 
     * @return PermissionType 权限类型，(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)，当前ckakfa支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set 权限类型，(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)，当前ckakfa支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
     * @param PermissionType 权限类型，(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)，当前ckakfa支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get 默认为\*，表示任何host都可以访问，当前ckafka不支持host为\*，但是后面开源kafka的产品化会直接支持 
     * @return Host 默认为\*，表示任何host都可以访问，当前ckafka不支持host为\*，但是后面开源kafka的产品化会直接支持
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 默认为\*，表示任何host都可以访问，当前ckafka不支持host为\*，但是后面开源kafka的产品化会直接支持
     * @param Host 默认为\*，表示任何host都可以访问，当前ckafka不支持host为\*，但是后面开源kafka的产品化会直接支持
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 用户列表，默认为*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户 
     * @return Principal 用户列表，默认为*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set 用户列表，默认为*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
     * @param Principal 用户列表，默认为*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Principal", this.Principal);

    }
}

