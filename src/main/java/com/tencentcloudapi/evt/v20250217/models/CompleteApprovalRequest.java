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
package com.tencentcloudapi.evt.v20250217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompleteApprovalRequest extends AbstractModel {

    /**
    * <p>审批单号</p>
    */
    @SerializedName("ApprovalId")
    @Expose
    private String ApprovalId;

    /**
    * <p>审批节点</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>审批结果，1通过2拒绝</p>
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * <p>审批意见</p>
    */
    @SerializedName("Opinion")
    @Expose
    private String Opinion;

    /**
    * <p>审批人的身份认证Token，通过自定义角色体系回调接口分发</p><p>token信息</p>
    */
    @SerializedName("UserToken")
    @Expose
    private String UserToken;

    /**
     * Get <p>审批单号</p> 
     * @return ApprovalId <p>审批单号</p>
     */
    public String getApprovalId() {
        return this.ApprovalId;
    }

    /**
     * Set <p>审批单号</p>
     * @param ApprovalId <p>审批单号</p>
     */
    public void setApprovalId(String ApprovalId) {
        this.ApprovalId = ApprovalId;
    }

    /**
     * Get <p>审批节点</p> 
     * @return NodeId <p>审批节点</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>审批节点</p>
     * @param NodeId <p>审批节点</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>审批结果，1通过2拒绝</p> 
     * @return Result <p>审批结果，1通过2拒绝</p>
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set <p>审批结果，1通过2拒绝</p>
     * @param Result <p>审批结果，1通过2拒绝</p>
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get <p>审批意见</p> 
     * @return Opinion <p>审批意见</p>
     */
    public String getOpinion() {
        return this.Opinion;
    }

    /**
     * Set <p>审批意见</p>
     * @param Opinion <p>审批意见</p>
     */
    public void setOpinion(String Opinion) {
        this.Opinion = Opinion;
    }

    /**
     * Get <p>审批人的身份认证Token，通过自定义角色体系回调接口分发</p><p>token信息</p> 
     * @return UserToken <p>审批人的身份认证Token，通过自定义角色体系回调接口分发</p><p>token信息</p>
     */
    public String getUserToken() {
        return this.UserToken;
    }

    /**
     * Set <p>审批人的身份认证Token，通过自定义角色体系回调接口分发</p><p>token信息</p>
     * @param UserToken <p>审批人的身份认证Token，通过自定义角色体系回调接口分发</p><p>token信息</p>
     */
    public void setUserToken(String UserToken) {
        this.UserToken = UserToken;
    }

    public CompleteApprovalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompleteApprovalRequest(CompleteApprovalRequest source) {
        if (source.ApprovalId != null) {
            this.ApprovalId = new String(source.ApprovalId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Opinion != null) {
            this.Opinion = new String(source.Opinion);
        }
        if (source.UserToken != null) {
            this.UserToken = new String(source.UserToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalId", this.ApprovalId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Opinion", this.Opinion);
        this.setParamSimple(map, prefix + "UserToken", this.UserToken);

    }
}

