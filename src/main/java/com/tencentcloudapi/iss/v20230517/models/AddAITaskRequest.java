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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddAITaskRequest extends AbstractModel{

    /**
    * AI 任务名称。仅支持中文、英文、数字、_、-，长度不超过32个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 通道 ID 列表。不能添加存在于其他 AI 任务的通道，限制1000个通道。
    */
    @SerializedName("ChannelList")
    @Expose
    private String [] ChannelList;

    /**
    * AI 配置列表
    */
    @SerializedName("Templates")
    @Expose
    private AITemplates [] Templates;

    /**
    * AI 任务描述。仅支持中文、英文、数字、_、-，长度不超过128个字符
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * AI 结果回调地址。类似 "http://ip:port/xxx或者https://domain/xxx
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 是否立即开启 AI 任务。"true"代表立即开启 AI 任务，"false"代表暂不开启 AI 任务，默认为 false。
    */
    @SerializedName("IsStartTheTask")
    @Expose
    private Boolean IsStartTheTask;

    /**
     * Get AI 任务名称。仅支持中文、英文、数字、_、-，长度不超过32个字符 
     * @return Name AI 任务名称。仅支持中文、英文、数字、_、-，长度不超过32个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set AI 任务名称。仅支持中文、英文、数字、_、-，长度不超过32个字符
     * @param Name AI 任务名称。仅支持中文、英文、数字、_、-，长度不超过32个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 通道 ID 列表。不能添加存在于其他 AI 任务的通道，限制1000个通道。 
     * @return ChannelList 通道 ID 列表。不能添加存在于其他 AI 任务的通道，限制1000个通道。
     */
    public String [] getChannelList() {
        return this.ChannelList;
    }

    /**
     * Set 通道 ID 列表。不能添加存在于其他 AI 任务的通道，限制1000个通道。
     * @param ChannelList 通道 ID 列表。不能添加存在于其他 AI 任务的通道，限制1000个通道。
     */
    public void setChannelList(String [] ChannelList) {
        this.ChannelList = ChannelList;
    }

    /**
     * Get AI 配置列表 
     * @return Templates AI 配置列表
     */
    public AITemplates [] getTemplates() {
        return this.Templates;
    }

    /**
     * Set AI 配置列表
     * @param Templates AI 配置列表
     */
    public void setTemplates(AITemplates [] Templates) {
        this.Templates = Templates;
    }

    /**
     * Get AI 任务描述。仅支持中文、英文、数字、_、-，长度不超过128个字符 
     * @return Desc AI 任务描述。仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set AI 任务描述。仅支持中文、英文、数字、_、-，长度不超过128个字符
     * @param Desc AI 任务描述。仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get AI 结果回调地址。类似 "http://ip:port/xxx或者https://domain/xxx 
     * @return CallbackUrl AI 结果回调地址。类似 "http://ip:port/xxx或者https://domain/xxx
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set AI 结果回调地址。类似 "http://ip:port/xxx或者https://domain/xxx
     * @param CallbackUrl AI 结果回调地址。类似 "http://ip:port/xxx或者https://domain/xxx
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 是否立即开启 AI 任务。"true"代表立即开启 AI 任务，"false"代表暂不开启 AI 任务，默认为 false。 
     * @return IsStartTheTask 是否立即开启 AI 任务。"true"代表立即开启 AI 任务，"false"代表暂不开启 AI 任务，默认为 false。
     */
    public Boolean getIsStartTheTask() {
        return this.IsStartTheTask;
    }

    /**
     * Set 是否立即开启 AI 任务。"true"代表立即开启 AI 任务，"false"代表暂不开启 AI 任务，默认为 false。
     * @param IsStartTheTask 是否立即开启 AI 任务。"true"代表立即开启 AI 任务，"false"代表暂不开启 AI 任务，默认为 false。
     */
    public void setIsStartTheTask(Boolean IsStartTheTask) {
        this.IsStartTheTask = IsStartTheTask;
    }

    public AddAITaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAITaskRequest(AddAITaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChannelList != null) {
            this.ChannelList = new String[source.ChannelList.length];
            for (int i = 0; i < source.ChannelList.length; i++) {
                this.ChannelList[i] = new String(source.ChannelList[i]);
            }
        }
        if (source.Templates != null) {
            this.Templates = new AITemplates[source.Templates.length];
            for (int i = 0; i < source.Templates.length; i++) {
                this.Templates[i] = new AITemplates(source.Templates[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.IsStartTheTask != null) {
            this.IsStartTheTask = new Boolean(source.IsStartTheTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ChannelList.", this.ChannelList);
        this.setParamArrayObj(map, prefix + "Templates.", this.Templates);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "IsStartTheTask", this.IsStartTheTask);

    }
}

