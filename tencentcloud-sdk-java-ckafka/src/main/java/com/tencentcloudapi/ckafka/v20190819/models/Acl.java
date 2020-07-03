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

public class Acl extends AbstractModel{

    /**
    * Acl资源类型，（0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID）当前只有TOPIC，
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源名称，和resourceType相关如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
    * 默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Acl操作方式(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTEN_WRITE)
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * 权限类型(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
     * Get Acl资源类型，（0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID）当前只有TOPIC， 
     * @return ResourceType Acl资源类型，（0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID）当前只有TOPIC，
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型，（0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID）当前只有TOPIC，
     * @param ResourceType Acl资源类型，（0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID）当前只有TOPIC，
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称，和resourceType相关如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称 
     * @return ResourceName 资源名称，和resourceType相关如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，和resourceType相关如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     * @param ResourceName 资源名称，和resourceType相关如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Principal 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param Principal 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    /**
     * Get 默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Acl操作方式(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTEN_WRITE) 
     * @return Operation Acl操作方式(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTEN_WRITE)
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set Acl操作方式(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTEN_WRITE)
     * @param Operation Acl操作方式(0:UNKNOWN，1:ANY，2:ALL，3:READ，4:WRITE，5:CREATE，6:DELETE，7:ALTER，8:DESCRIBE，9:CLUSTER_ACTION，10:DESCRIBE_CONFIGS，11:ALTER_CONFIGS，12:IDEMPOTEN_WRITE)
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 权限类型(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW) 
     * @return PermissionType 权限类型(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set 权限类型(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)
     * @param PermissionType 权限类型(0:UNKNOWN，1:ANY，2:DENY，3:ALLOW)
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Principal", this.Principal);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);

    }
}

