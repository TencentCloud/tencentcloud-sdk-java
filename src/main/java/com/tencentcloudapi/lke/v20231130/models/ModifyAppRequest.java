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

public class ModifyAppRequest extends AbstractModel {

    /**
    * 应用ID, 获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 应用类型；"knowledge_qa" 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用基础配置
    */
    @SerializedName("BaseConfig")
    @Expose
    private BaseConfig BaseConfig;

    /**
    * 应用配置
    */
    @SerializedName("AppConfig")
    @Expose
    private AppConfig AppConfig;

    /**
    * 登录用户子账号(集成商模式必填)	
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get 应用ID, 获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。 
     * @return AppBizId 应用ID, 获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID, 获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
     * @param AppBizId 应用ID, 获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 应用类型；"knowledge_qa" 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式） 
     * @return AppType 应用类型；"knowledge_qa" 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；"knowledge_qa" 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
     * @param AppType 应用类型；"knowledge_qa" 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 应用基础配置 
     * @return BaseConfig 应用基础配置
     */
    public BaseConfig getBaseConfig() {
        return this.BaseConfig;
    }

    /**
     * Set 应用基础配置
     * @param BaseConfig 应用基础配置
     */
    public void setBaseConfig(BaseConfig BaseConfig) {
        this.BaseConfig = BaseConfig;
    }

    /**
     * Get 应用配置 
     * @return AppConfig 应用配置
     */
    public AppConfig getAppConfig() {
        return this.AppConfig;
    }

    /**
     * Set 应用配置
     * @param AppConfig 应用配置
     */
    public void setAppConfig(AppConfig AppConfig) {
        this.AppConfig = AppConfig;
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

    public ModifyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppRequest(ModifyAppRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.BaseConfig != null) {
            this.BaseConfig = new BaseConfig(source.BaseConfig);
        }
        if (source.AppConfig != null) {
            this.AppConfig = new AppConfig(source.AppConfig);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamObj(map, prefix + "BaseConfig.", this.BaseConfig);
        this.setParamObj(map, prefix + "AppConfig.", this.AppConfig);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

