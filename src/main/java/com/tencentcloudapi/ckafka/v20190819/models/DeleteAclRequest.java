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

public class DeleteAclRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * <p>资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>Acl操作方式</p><p>枚举值：</p><ul><li>2： ALL</li><li>3： READ</li><li>4： WRITE</li><li>5： CREATE</li><li>6： DELETE</li><li>7： ALTER</li><li>8： DESCRIBE</li><li>9： CLUSTER_ACTION</li><li>10： DESCRIBE_CONFIGS</li><li>11： ALTER_CONFIGS</li><li>12： IDEMPOTENT_WRITE</li></ul><p>合法取值与 ResourceType 相关，传入组合以外的值将返回参数错误。本参数必须与 PermissionType 同时传入</p><ul><li>ResourceType=2（TOPIC）：2、3、4、5、6、7、8、10、11</li><li>ResourceType=3（GROUP）：2、3、6、8</li><li>ResourceType=4（CLUSTER）：2、5、7、8、9、10、11、12</li></ul>
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * <p>权限类型，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用</p><p>枚举值：</p><ul><li>2： DENY</li><li>3： ALLOW</li></ul><p>本参数必须与 Operation 同时传入</p>
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
    * <p>默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持</p><p>删除时与 Principal、Operation、PermissionType 一起参与精确匹配</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户</p><p>删除时不校验该用户是否仍存在，允许清理已删除用户的残留策略；该参数与 Host、Operation、PermissionType 一起参与精确匹配</p>
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
     * Get <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p> 
     * @return InstanceId <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     * @param InstanceId <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)</p> 
     * @return ResourceType <p>Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)</p>
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)</p>
     * @param ResourceType <p>Acl资源类型，(2:TOPIC，3:GROUP，4:CLUSTER)</p>
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。</p> 
     * @return ResourceName <p>资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。</p>
     * @param ResourceName <p>资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称，当resourceType为CLUSTER时，该字段可为空。</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>Acl操作方式</p><p>枚举值：</p><ul><li>2： ALL</li><li>3： READ</li><li>4： WRITE</li><li>5： CREATE</li><li>6： DELETE</li><li>7： ALTER</li><li>8： DESCRIBE</li><li>9： CLUSTER_ACTION</li><li>10： DESCRIBE_CONFIGS</li><li>11： ALTER_CONFIGS</li><li>12： IDEMPOTENT_WRITE</li></ul><p>合法取值与 ResourceType 相关，传入组合以外的值将返回参数错误。本参数必须与 PermissionType 同时传入</p><ul><li>ResourceType=2（TOPIC）：2、3、4、5、6、7、8、10、11</li><li>ResourceType=3（GROUP）：2、3、6、8</li><li>ResourceType=4（CLUSTER）：2、5、7、8、9、10、11、12</li></ul> 
     * @return Operation <p>Acl操作方式</p><p>枚举值：</p><ul><li>2： ALL</li><li>3： READ</li><li>4： WRITE</li><li>5： CREATE</li><li>6： DELETE</li><li>7： ALTER</li><li>8： DESCRIBE</li><li>9： CLUSTER_ACTION</li><li>10： DESCRIBE_CONFIGS</li><li>11： ALTER_CONFIGS</li><li>12： IDEMPOTENT_WRITE</li></ul><p>合法取值与 ResourceType 相关，传入组合以外的值将返回参数错误。本参数必须与 PermissionType 同时传入</p><ul><li>ResourceType=2（TOPIC）：2、3、4、5、6、7、8、10、11</li><li>ResourceType=3（GROUP）：2、3、6、8</li><li>ResourceType=4（CLUSTER）：2、5、7、8、9、10、11、12</li></ul>
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Acl操作方式</p><p>枚举值：</p><ul><li>2： ALL</li><li>3： READ</li><li>4： WRITE</li><li>5： CREATE</li><li>6： DELETE</li><li>7： ALTER</li><li>8： DESCRIBE</li><li>9： CLUSTER_ACTION</li><li>10： DESCRIBE_CONFIGS</li><li>11： ALTER_CONFIGS</li><li>12： IDEMPOTENT_WRITE</li></ul><p>合法取值与 ResourceType 相关，传入组合以外的值将返回参数错误。本参数必须与 PermissionType 同时传入</p><ul><li>ResourceType=2（TOPIC）：2、3、4、5、6、7、8、10、11</li><li>ResourceType=3（GROUP）：2、3、6、8</li><li>ResourceType=4（CLUSTER）：2、5、7、8、9、10、11、12</li></ul>
     * @param Operation <p>Acl操作方式</p><p>枚举值：</p><ul><li>2： ALL</li><li>3： READ</li><li>4： WRITE</li><li>5： CREATE</li><li>6： DELETE</li><li>7： ALTER</li><li>8： DESCRIBE</li><li>9： CLUSTER_ACTION</li><li>10： DESCRIBE_CONFIGS</li><li>11： ALTER_CONFIGS</li><li>12： IDEMPOTENT_WRITE</li></ul><p>合法取值与 ResourceType 相关，传入组合以外的值将返回参数错误。本参数必须与 PermissionType 同时传入</p><ul><li>ResourceType=2（TOPIC）：2、3、4、5、6、7、8、10、11</li><li>ResourceType=3（GROUP）：2、3、6、8</li><li>ResourceType=4（CLUSTER）：2、5、7、8、9、10、11、12</li></ul>
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>权限类型，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用</p><p>枚举值：</p><ul><li>2： DENY</li><li>3： ALLOW</li></ul><p>本参数必须与 Operation 同时传入</p> 
     * @return PermissionType <p>权限类型，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用</p><p>枚举值：</p><ul><li>2： DENY</li><li>3： ALLOW</li></ul><p>本参数必须与 Operation 同时传入</p>
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set <p>权限类型，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用</p><p>枚举值：</p><ul><li>2： DENY</li><li>3： ALLOW</li></ul><p>本参数必须与 Operation 同时传入</p>
     * @param PermissionType <p>权限类型，当前ckafka支持ALLOW(相当于白名单)，其它用于后续兼容开源kafka的acl时使用</p><p>枚举值：</p><ul><li>2： DENY</li><li>3： ALLOW</li></ul><p>本参数必须与 Operation 同时传入</p>
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get <p>默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持</p><p>删除时与 Principal、Operation、PermissionType 一起参与精确匹配</p> 
     * @return Host <p>默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持</p><p>删除时与 Principal、Operation、PermissionType 一起参与精确匹配</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持</p><p>删除时与 Principal、Operation、PermissionType 一起参与精确匹配</p>
     * @param Host <p>默认为*，表示任何host都可以访问，当前ckafka不支持host为*，但是后面开源kafka的产品化会直接支持</p><p>删除时与 Principal、Operation、PermissionType 一起参与精确匹配</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户</p><p>删除时不校验该用户是否仍存在，允许清理已删除用户的残留策略；该参数与 Host、Operation、PermissionType 一起参与精确匹配</p> 
     * @return Principal <p>用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户</p><p>删除时不校验该用户是否仍存在，允许清理已删除用户的残留策略；该参数与 Host、Operation、PermissionType 一起参与精确匹配</p>
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set <p>用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户</p><p>删除时不校验该用户是否仍存在，允许清理已删除用户的残留策略；该参数与 Host、Operation、PermissionType 一起参与精确匹配</p>
     * @param Principal <p>用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户</p><p>删除时不校验该用户是否仍存在，允许清理已删除用户的残留策略；该参数与 Host、Operation、PermissionType 一起参与精确匹配</p>
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public DeleteAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAclRequest(DeleteAclRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Operation != null) {
            this.Operation = new Long(source.Operation);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new Long(source.PermissionType);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Principal != null) {
            this.Principal = new String(source.Principal);
        }
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

