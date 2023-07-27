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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmbedWebUrlRequest extends AbstractModel{

    /**
    * 操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * WEB嵌入资源类型。
<br/>CREATE_SEAL: 创建印章
<br/>PREVIEW_SEAL_LIST：预览印章列表
<br/>PREVIEW_SEAL_DETAIL：预览印章详情
<br/>EXTEND_SERVICE：拓展服务

    */
    @SerializedName("EmbedType")
    @Expose
    private String EmbedType;

    /**
    * WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 抄送方信息
    */
    @SerializedName("Reviewer")
    @Expose
    private ReviewerInfo Reviewer;

    /**
     * Get 操作者信息 
     * @return Operator 操作者信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者信息
     * @param Operator 操作者信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get WEB嵌入资源类型。
<br/>CREATE_SEAL: 创建印章
<br/>PREVIEW_SEAL_LIST：预览印章列表
<br/>PREVIEW_SEAL_DETAIL：预览印章详情
<br/>EXTEND_SERVICE：拓展服务
 
     * @return EmbedType WEB嵌入资源类型。
<br/>CREATE_SEAL: 创建印章
<br/>PREVIEW_SEAL_LIST：预览印章列表
<br/>PREVIEW_SEAL_DETAIL：预览印章详情
<br/>EXTEND_SERVICE：拓展服务

     */
    public String getEmbedType() {
        return this.EmbedType;
    }

    /**
     * Set WEB嵌入资源类型。
<br/>CREATE_SEAL: 创建印章
<br/>PREVIEW_SEAL_LIST：预览印章列表
<br/>PREVIEW_SEAL_DETAIL：预览印章详情
<br/>EXTEND_SERVICE：拓展服务

     * @param EmbedType WEB嵌入资源类型。
<br/>CREATE_SEAL: 创建印章
<br/>PREVIEW_SEAL_LIST：预览印章列表
<br/>PREVIEW_SEAL_DETAIL：预览印章详情
<br/>EXTEND_SERVICE：拓展服务

     */
    public void setEmbedType(String EmbedType) {
        this.EmbedType = EmbedType;
    }

    /**
     * Get WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id 
     * @return BusinessId WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
     * @param BusinessId WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 抄送方信息 
     * @return Reviewer 抄送方信息
     */
    public ReviewerInfo getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set 抄送方信息
     * @param Reviewer 抄送方信息
     */
    public void setReviewer(ReviewerInfo Reviewer) {
        this.Reviewer = Reviewer;
    }

    public CreateEmbedWebUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmbedWebUrlRequest(CreateEmbedWebUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.EmbedType != null) {
            this.EmbedType = new String(source.EmbedType);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new ReviewerInfo(source.Reviewer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "EmbedType", this.EmbedType);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Reviewer.", this.Reviewer);

    }
}

