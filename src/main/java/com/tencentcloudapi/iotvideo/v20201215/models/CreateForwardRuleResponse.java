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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateForwardRuleResponse extends AbstractModel{

    /**
    * 腾讯云账号
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 队列名
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 消息类型
    */
    @SerializedName("MsgType")
    @Expose
    private Long MsgType;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色ID
    */
    @SerializedName("RoleID")
    @Expose
    private Long RoleID;

    /**
    * 队列区
    */
    @SerializedName("QueueRegion")
    @Expose
    private String QueueRegion;

    /**
    * 消息队列的类型。 0：CMQ，1：CKafaka
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
    * 实例id， 目前只有Ckafaka会用到
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称，目前只有Ckafaka会用到
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 腾讯云账号 
     * @return Endpoint 腾讯云账号
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 腾讯云账号
     * @param Endpoint 腾讯云账号
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 队列名 
     * @return QueueName 队列名
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名
     * @param QueueName 队列名
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 消息类型 
     * @return MsgType 消息类型
     */
    public Long getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型
     * @param MsgType 消息类型
     */
    public void setMsgType(Long MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色ID 
     * @return RoleID 角色ID
     */
    public Long getRoleID() {
        return this.RoleID;
    }

    /**
     * Set 角色ID
     * @param RoleID 角色ID
     */
    public void setRoleID(Long RoleID) {
        this.RoleID = RoleID;
    }

    /**
     * Get 队列区 
     * @return QueueRegion 队列区
     */
    public String getQueueRegion() {
        return this.QueueRegion;
    }

    /**
     * Set 队列区
     * @param QueueRegion 队列区
     */
    public void setQueueRegion(String QueueRegion) {
        this.QueueRegion = QueueRegion;
    }

    /**
     * Get 消息队列的类型。 0：CMQ，1：CKafaka 
     * @return QueueType 消息队列的类型。 0：CMQ，1：CKafaka
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 消息队列的类型。 0：CMQ，1：CKafaka
     * @param QueueType 消息队列的类型。 0：CMQ，1：CKafaka
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 实例id， 目前只有Ckafaka会用到 
     * @return InstanceId 实例id， 目前只有Ckafaka会用到
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id， 目前只有Ckafaka会用到
     * @param InstanceId 实例id， 目前只有Ckafaka会用到
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称，目前只有Ckafaka会用到 
     * @return InstanceName 实例名称，目前只有Ckafaka会用到
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，目前只有Ckafaka会用到
     * @param InstanceName 实例名称，目前只有Ckafaka会用到
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 错误消息 
     * @return ErrMsg 错误消息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误消息
     * @param ErrMsg 错误消息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateForwardRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateForwardRuleResponse(CreateForwardRuleResponse source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.MsgType != null) {
            this.MsgType = new Long(source.MsgType);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleID != null) {
            this.RoleID = new Long(source.RoleID);
        }
        if (source.QueueRegion != null) {
            this.QueueRegion = new String(source.QueueRegion);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleID", this.RoleID);
        this.setParamSimple(map, prefix + "QueueRegion", this.QueueRegion);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

