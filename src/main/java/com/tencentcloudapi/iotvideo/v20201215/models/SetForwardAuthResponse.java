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

public class SetForwardAuthResponse extends AbstractModel{

    /**
    * 腾讯云账号
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 角色名
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
    * 消息队列类型  0.CMQ 1.CKafka
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

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
     * Get 角色名 
     * @return RoleName 角色名
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名
     * @param RoleName 角色名
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
     * Get 消息队列类型  0.CMQ 1.CKafka 
     * @return QueueType 消息队列类型  0.CMQ 1.CKafka
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 消息队列类型  0.CMQ 1.CKafka
     * @param QueueType 消息队列类型  0.CMQ 1.CKafka
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
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

    public SetForwardAuthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetForwardAuthResponse(SetForwardAuthResponse source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
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
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleID", this.RoleID);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

