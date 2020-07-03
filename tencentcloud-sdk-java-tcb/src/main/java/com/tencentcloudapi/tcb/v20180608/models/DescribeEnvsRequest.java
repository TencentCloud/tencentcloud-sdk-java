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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvsRequest extends AbstractModel{

    /**
    * 环境ID，如果传了这个参数则只返回该环境的相关信息
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 指定Channels字段为可见渠道列表或不可见渠道列表
如只想获取渠道A的环境 就填写IsVisible= true,Channels = ["A"], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = ["A"]
    */
    @SerializedName("IsVisible")
    @Expose
    private Boolean IsVisible;

    /**
    * 渠道列表，代表可见或不可见渠道由IsVisible参数指定
    */
    @SerializedName("Channels")
    @Expose
    private String [] Channels;

    /**
     * Get 环境ID，如果传了这个参数则只返回该环境的相关信息 
     * @return EnvId 环境ID，如果传了这个参数则只返回该环境的相关信息
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID，如果传了这个参数则只返回该环境的相关信息
     * @param EnvId 环境ID，如果传了这个参数则只返回该环境的相关信息
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 指定Channels字段为可见渠道列表或不可见渠道列表
如只想获取渠道A的环境 就填写IsVisible= true,Channels = ["A"], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = ["A"] 
     * @return IsVisible 指定Channels字段为可见渠道列表或不可见渠道列表
如只想获取渠道A的环境 就填写IsVisible= true,Channels = ["A"], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = ["A"]
     */
    public Boolean getIsVisible() {
        return this.IsVisible;
    }

    /**
     * Set 指定Channels字段为可见渠道列表或不可见渠道列表
如只想获取渠道A的环境 就填写IsVisible= true,Channels = ["A"], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = ["A"]
     * @param IsVisible 指定Channels字段为可见渠道列表或不可见渠道列表
如只想获取渠道A的环境 就填写IsVisible= true,Channels = ["A"], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = ["A"]
     */
    public void setIsVisible(Boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    /**
     * Get 渠道列表，代表可见或不可见渠道由IsVisible参数指定 
     * @return Channels 渠道列表，代表可见或不可见渠道由IsVisible参数指定
     */
    public String [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 渠道列表，代表可见或不可见渠道由IsVisible参数指定
     * @param Channels 渠道列表，代表可见或不可见渠道由IsVisible参数指定
     */
    public void setChannels(String [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "IsVisible", this.IsVisible);
        this.setParamArraySimple(map, prefix + "Channels.", this.Channels);

    }
}

