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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvsRequest extends AbstractModel {

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
    * 分页参数，单页限制个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get 分页参数，单页限制个数 
     * @return Limit 分页参数，单页限制个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，单页限制个数
     * @param Limit 分页参数，单页限制个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，偏移量 
     * @return Offset 分页参数，偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，偏移量
     * @param Offset 分页参数，偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeEnvsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvsRequest(DescribeEnvsRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.IsVisible != null) {
            this.IsVisible = new Boolean(source.IsVisible);
        }
        if (source.Channels != null) {
            this.Channels = new String[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new String(source.Channels[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "IsVisible", this.IsVisible);
        this.setParamArraySimple(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

