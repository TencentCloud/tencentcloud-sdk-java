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

public class CreateAclRequest extends AbstractModel {

    /**
    * ckafka集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * Acl操作方式，(2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTENT_WRITE)
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * 权限类型，(2:DENY，3:ALLOW)，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
    * 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 默认为*，表示任何host都可以访问。支持填写IP或网段，支持“;”分隔。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入时需要加 User: 前缀,如用户A则传入User:A。
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
    * 资源名称列表,Json字符串格式。ResourceName和resourceNameList只能指定其中一个。
    */
    @SerializedName("ResourceNameList")
    @Expose
    private String ResourceNameList;

    /**
     * Get ckafka集群实例Id 
     * @return InstanceId ckafka集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id
     * @param InstanceId ckafka集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER) 
     * @return ResourceType Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)
     * @param ResourceType Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Acl操作方式，(2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTENT_WRITE) 
     * @return Operation Acl操作方式，(2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTENT_WRITE)
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set Acl操作方式，(2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTENT_WRITE)
     * @param Operation Acl操作方式，(2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTENT_WRITE)
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 权限类型，(2:DENY，3:ALLOW)，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用 
     * @return PermissionType 权限类型，(2:DENY，3:ALLOW)，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set 权限类型，(2:DENY，3:ALLOW)，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
     * @param PermissionType 权限类型，(2:DENY，3:ALLOW)，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。 
     * @return ResourceName 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。
     * @param ResourceName 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 默认为*，表示任何host都可以访问。支持填写IP或网段，支持“;”分隔。 
     * @return Host 默认为*，表示任何host都可以访问。支持填写IP或网段，支持“;”分隔。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 默认为*，表示任何host都可以访问。支持填写IP或网段，支持“;”分隔。
     * @param Host 默认为*，表示任何host都可以访问。支持填写IP或网段，支持“;”分隔。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入时需要加 User: 前缀,如用户A则传入User:A。 
     * @return Principal 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入时需要加 User: 前缀,如用户A则传入User:A。
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入时需要加 User: 前缀,如用户A则传入User:A。
     * @param Principal 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入时需要加 User: 前缀,如用户A则传入User:A。
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    /**
     * Get 资源名称列表,Json字符串格式。ResourceName和resourceNameList只能指定其中一个。 
     * @return ResourceNameList 资源名称列表,Json字符串格式。ResourceName和resourceNameList只能指定其中一个。
     */
    public String getResourceNameList() {
        return this.ResourceNameList;
    }

    /**
     * Set 资源名称列表,Json字符串格式。ResourceName和resourceNameList只能指定其中一个。
     * @param ResourceNameList 资源名称列表,Json字符串格式。ResourceName和resourceNameList只能指定其中一个。
     */
    public void setResourceNameList(String ResourceNameList) {
        this.ResourceNameList = ResourceNameList;
    }

    public CreateAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAclRequest(CreateAclRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Operation != null) {
            this.Operation = new Long(source.Operation);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new Long(source.PermissionType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Principal != null) {
            this.Principal = new String(source.Principal);
        }
        if (source.ResourceNameList != null) {
            this.ResourceNameList = new String(source.ResourceNameList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Principal", this.Principal);
        this.setParamSimple(map, prefix + "ResourceNameList", this.ResourceNameList);

    }
}

