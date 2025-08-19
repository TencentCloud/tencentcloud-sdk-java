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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAppRequest extends AbstractModel {

    /**
    * 应用类型；knowledge_qa - 知识问答管理 
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 每页数目，整型
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码，整型
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 关键词：应用/修改人
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 登录用户子账号(集成商模式必填)	
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * 智能体类型 dialogue：对话智能体，wechat：公众号智能体
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * 应用状态 1:未上线 2：运行中
    */
    @SerializedName("AppStatus")
    @Expose
    private String AppStatus;

    /**
     * Get 应用类型；knowledge_qa - 知识问答管理  
     * @return AppType 应用类型；knowledge_qa - 知识问答管理 
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；knowledge_qa - 知识问答管理 
     * @param AppType 应用类型；knowledge_qa - 知识问答管理 
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 每页数目，整型 
     * @return PageSize 每页数目，整型
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，整型
     * @param PageSize 每页数目，整型
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码，整型 
     * @return PageNumber 页码，整型
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，整型
     * @param PageNumber 页码，整型
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 关键词：应用/修改人 
     * @return Keyword 关键词：应用/修改人
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词：应用/修改人
     * @param Keyword 关键词：应用/修改人
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 登录用户子账号(集成商模式必填)	 
     * @return LoginSubAccountUin 登录用户子账号(集成商模式必填)	
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 登录用户子账号(集成商模式必填)	
     * @param LoginSubAccountUin 登录用户子账号(集成商模式必填)	
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get 智能体类型 dialogue：对话智能体，wechat：公众号智能体 
     * @return AgentType 智能体类型 dialogue：对话智能体，wechat：公众号智能体
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 智能体类型 dialogue：对话智能体，wechat：公众号智能体
     * @param AgentType 智能体类型 dialogue：对话智能体，wechat：公众号智能体
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 应用状态 1:未上线 2：运行中 
     * @return AppStatus 应用状态 1:未上线 2：运行中
     */
    public String getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态 1:未上线 2：运行中
     * @param AppStatus 应用状态 1:未上线 2：运行中
     */
    public void setAppStatus(String AppStatus) {
        this.AppStatus = AppStatus;
    }

    public ListAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAppRequest(ListAppRequest source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new String(source.AppStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);

    }
}

