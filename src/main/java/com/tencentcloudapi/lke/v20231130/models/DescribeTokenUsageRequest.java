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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenUsageRequest extends AbstractModel {

    /**
    * 腾讯云主账号
    */
    @SerializedName("UinAccount")
    @Expose
    private String [] UinAccount;

    /**
    * 登录用户主账号(集成商模式必填)
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 登录用户子账号(集成商模式必填)
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * 知识引擎子业务类型:  FileParse(文档解析)、Embedding、Rewrite(多轮改写)、 Concurrency(并发)、KnowledgeSummary(知识总结)   KnowledgeQA(知识问答)、KnowledgeCapacity(知识库容量)、SearchEngine(搜索引擎)
    */
    @SerializedName("SubBizType")
    @Expose
    private String SubBizType;

    /**
    * 模型标识
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 开始时间戳, 单位为秒(默认值0)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间戳, 单位为秒(默认值0， 必须大于开始时间戳)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 应用id列表
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
    * 筛选子场景(文档解析场景使用)
    */
    @SerializedName("SubScenes")
    @Expose
    private String [] SubScenes;

    /**
    * 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
     * Get 腾讯云主账号 
     * @return UinAccount 腾讯云主账号
     */
    public String [] getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set 腾讯云主账号
     * @param UinAccount 腾讯云主账号
     */
    public void setUinAccount(String [] UinAccount) {
        this.UinAccount = UinAccount;
    }

    /**
     * Get 登录用户主账号(集成商模式必填) 
     * @return LoginUin 登录用户主账号(集成商模式必填)
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 登录用户主账号(集成商模式必填)
     * @param LoginUin 登录用户主账号(集成商模式必填)
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
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
     * Get 知识引擎子业务类型:  FileParse(文档解析)、Embedding、Rewrite(多轮改写)、 Concurrency(并发)、KnowledgeSummary(知识总结)   KnowledgeQA(知识问答)、KnowledgeCapacity(知识库容量)、SearchEngine(搜索引擎) 
     * @return SubBizType 知识引擎子业务类型:  FileParse(文档解析)、Embedding、Rewrite(多轮改写)、 Concurrency(并发)、KnowledgeSummary(知识总结)   KnowledgeQA(知识问答)、KnowledgeCapacity(知识库容量)、SearchEngine(搜索引擎)
     */
    public String getSubBizType() {
        return this.SubBizType;
    }

    /**
     * Set 知识引擎子业务类型:  FileParse(文档解析)、Embedding、Rewrite(多轮改写)、 Concurrency(并发)、KnowledgeSummary(知识总结)   KnowledgeQA(知识问答)、KnowledgeCapacity(知识库容量)、SearchEngine(搜索引擎)
     * @param SubBizType 知识引擎子业务类型:  FileParse(文档解析)、Embedding、Rewrite(多轮改写)、 Concurrency(并发)、KnowledgeSummary(知识总结)   KnowledgeQA(知识问答)、KnowledgeCapacity(知识库容量)、SearchEngine(搜索引擎)
     */
    public void setSubBizType(String SubBizType) {
        this.SubBizType = SubBizType;
    }

    /**
     * Get 模型标识 
     * @return ModelName 模型标识
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型标识
     * @param ModelName 模型标识
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 开始时间戳, 单位为秒(默认值0) 
     * @return StartTime 开始时间戳, 单位为秒(默认值0)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳, 单位为秒(默认值0)
     * @param StartTime 开始时间戳, 单位为秒(默认值0)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳, 单位为秒(默认值0， 必须大于开始时间戳) 
     * @return EndTime 结束时间戳, 单位为秒(默认值0， 必须大于开始时间戳)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳, 单位为秒(默认值0， 必须大于开始时间戳)
     * @param EndTime 结束时间戳, 单位为秒(默认值0， 必须大于开始时间戳)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用id列表 
     * @return AppBizIds 应用id列表
     */
    public String [] getAppBizIds() {
        return this.AppBizIds;
    }

    /**
     * Set 应用id列表
     * @param AppBizIds 应用id列表
     */
    public void setAppBizIds(String [] AppBizIds) {
        this.AppBizIds = AppBizIds;
    }

    /**
     * Get 筛选子场景(文档解析场景使用) 
     * @return SubScenes 筛选子场景(文档解析场景使用)
     */
    public String [] getSubScenes() {
        return this.SubScenes;
    }

    /**
     * Set 筛选子场景(文档解析场景使用)
     * @param SubScenes 筛选子场景(文档解析场景使用)
     */
    public void setSubScenes(String [] SubScenes) {
        this.SubScenes = SubScenes;
    }

    /**
     * Get 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库) 
     * @return AppType 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
     * @param AppType 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    public DescribeTokenUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenUsageRequest(DescribeTokenUsageRequest source) {
        if (source.UinAccount != null) {
            this.UinAccount = new String[source.UinAccount.length];
            for (int i = 0; i < source.UinAccount.length; i++) {
                this.UinAccount[i] = new String(source.UinAccount[i]);
            }
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.SubBizType != null) {
            this.SubBizType = new String(source.SubBizType);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
        if (source.SubScenes != null) {
            this.SubScenes = new String[source.SubScenes.length];
            for (int i = 0; i < source.SubScenes.length; i++) {
                this.SubScenes[i] = new String(source.SubScenes[i]);
            }
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UinAccount.", this.UinAccount);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "SubBizType", this.SubBizType);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);
        this.setParamArraySimple(map, prefix + "SubScenes.", this.SubScenes);
        this.setParamSimple(map, prefix + "AppType", this.AppType);

    }
}

