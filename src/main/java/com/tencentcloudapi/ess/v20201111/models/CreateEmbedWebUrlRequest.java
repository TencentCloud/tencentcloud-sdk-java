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
<br/>CREATE_SEAL: 生成创建印章的嵌入页面
<br/>CREATE_TEMPLATE：生成创建模板的嵌入页面
<br/>MODIFY_TEMPLATE：生成编辑模板的嵌入页面
<br/>PREVIEW_TEMPLATE：生成预览模板的嵌入页面
<br/>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
<br/>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
<br/>EXTEND_SERVICE：生成拓展服务的嵌入页面
<br/>PREVIEW_FLOW：生成预览合同的嵌入页面
<br/>PREVIEW_FLOW_DETAIL：生成查看合同详情的嵌入页面

    */
    @SerializedName("EmbedType")
    @Expose
    private String EmbedType;

    /**
    * WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
<br/>MODIFY_TEMPLATE，PREVIEW_TEMPLATE，必填，取值为模板id
<br/>PREVIEW_FLOW，PREVIEW_FLOW_DETAIL，必填，取值为合同id
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
    * 个性化参数
    */
    @SerializedName("Option")
    @Expose
    private EmbedUrlOption Option;

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
<br/>CREATE_SEAL: 生成创建印章的嵌入页面
<br/>CREATE_TEMPLATE：生成创建模板的嵌入页面
<br/>MODIFY_TEMPLATE：生成编辑模板的嵌入页面
<br/>PREVIEW_TEMPLATE：生成预览模板的嵌入页面
<br/>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
<br/>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
<br/>EXTEND_SERVICE：生成拓展服务的嵌入页面
<br/>PREVIEW_FLOW：生成预览合同的嵌入页面
<br/>PREVIEW_FLOW_DETAIL：生成查看合同详情的嵌入页面
 
     * @return EmbedType WEB嵌入资源类型。
<br/>CREATE_SEAL: 生成创建印章的嵌入页面
<br/>CREATE_TEMPLATE：生成创建模板的嵌入页面
<br/>MODIFY_TEMPLATE：生成编辑模板的嵌入页面
<br/>PREVIEW_TEMPLATE：生成预览模板的嵌入页面
<br/>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
<br/>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
<br/>EXTEND_SERVICE：生成拓展服务的嵌入页面
<br/>PREVIEW_FLOW：生成预览合同的嵌入页面
<br/>PREVIEW_FLOW_DETAIL：生成查看合同详情的嵌入页面

     */
    public String getEmbedType() {
        return this.EmbedType;
    }

    /**
     * Set WEB嵌入资源类型。
<br/>CREATE_SEAL: 生成创建印章的嵌入页面
<br/>CREATE_TEMPLATE：生成创建模板的嵌入页面
<br/>MODIFY_TEMPLATE：生成编辑模板的嵌入页面
<br/>PREVIEW_TEMPLATE：生成预览模板的嵌入页面
<br/>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
<br/>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
<br/>EXTEND_SERVICE：生成拓展服务的嵌入页面
<br/>PREVIEW_FLOW：生成预览合同的嵌入页面
<br/>PREVIEW_FLOW_DETAIL：生成查看合同详情的嵌入页面

     * @param EmbedType WEB嵌入资源类型。
<br/>CREATE_SEAL: 生成创建印章的嵌入页面
<br/>CREATE_TEMPLATE：生成创建模板的嵌入页面
<br/>MODIFY_TEMPLATE：生成编辑模板的嵌入页面
<br/>PREVIEW_TEMPLATE：生成预览模板的嵌入页面
<br/>PREVIEW_SEAL_LIST：生成预览印章列表的嵌入页面
<br/>PREVIEW_SEAL_DETAIL：生成预览印章详情的嵌入页面
<br/>EXTEND_SERVICE：生成拓展服务的嵌入页面
<br/>PREVIEW_FLOW：生成预览合同的嵌入页面
<br/>PREVIEW_FLOW_DETAIL：生成查看合同详情的嵌入页面

     */
    public void setEmbedType(String EmbedType) {
        this.EmbedType = EmbedType;
    }

    /**
     * Get WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
<br/>MODIFY_TEMPLATE，PREVIEW_TEMPLATE，必填，取值为模板id
<br/>PREVIEW_FLOW，PREVIEW_FLOW_DETAIL，必填，取值为合同id 
     * @return BusinessId WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
<br/>MODIFY_TEMPLATE，PREVIEW_TEMPLATE，必填，取值为模板id
<br/>PREVIEW_FLOW，PREVIEW_FLOW_DETAIL，必填，取值为合同id
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
<br/>MODIFY_TEMPLATE，PREVIEW_TEMPLATE，必填，取值为模板id
<br/>PREVIEW_FLOW，PREVIEW_FLOW_DETAIL，必填，取值为合同id
     * @param BusinessId WEB嵌入的业务资源ID
<br/>PREVIEW_SEAL_DETAIL，必填，取值为印章id
<br/>MODIFY_TEMPLATE，PREVIEW_TEMPLATE，必填，取值为模板id
<br/>PREVIEW_FLOW，PREVIEW_FLOW_DETAIL，必填，取值为合同id
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

    /**
     * Get 个性化参数 
     * @return Option 个性化参数
     */
    public EmbedUrlOption getOption() {
        return this.Option;
    }

    /**
     * Set 个性化参数
     * @param Option 个性化参数
     */
    public void setOption(EmbedUrlOption Option) {
        this.Option = Option;
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
        if (source.Option != null) {
            this.Option = new EmbedUrlOption(source.Option);
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
        this.setParamObj(map, prefix + "Option.", this.Option);

    }
}

