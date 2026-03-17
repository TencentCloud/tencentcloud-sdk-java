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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudRunEnvsRequest extends AbstractModel {

    /**
    * <p>环境ID，如果传了这个参数则只返回该环境的相关信息</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>指定Channels字段为可见渠道列表或不可见渠道列表<br>如只想获取渠道A的环境 就填写IsVisible= true,Channels = [&quot;A&quot;], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = [&quot;A&quot;]</p>
    */
    @SerializedName("IsVisible")
    @Expose
    private Boolean IsVisible;

    /**
    * <p>渠道列表，代表可见或不可见渠道由IsVisible参数指定</p>
    */
    @SerializedName("Channels")
    @Expose
    private String [] Channels;

    /**
     * Get <p>环境ID，如果传了这个参数则只返回该环境的相关信息</p> 
     * @return EnvId <p>环境ID，如果传了这个参数则只返回该环境的相关信息</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID，如果传了这个参数则只返回该环境的相关信息</p>
     * @param EnvId <p>环境ID，如果传了这个参数则只返回该环境的相关信息</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>指定Channels字段为可见渠道列表或不可见渠道列表<br>如只想获取渠道A的环境 就填写IsVisible= true,Channels = [&quot;A&quot;], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = [&quot;A&quot;]</p> 
     * @return IsVisible <p>指定Channels字段为可见渠道列表或不可见渠道列表<br>如只想获取渠道A的环境 就填写IsVisible= true,Channels = [&quot;A&quot;], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = [&quot;A&quot;]</p>
     */
    public Boolean getIsVisible() {
        return this.IsVisible;
    }

    /**
     * Set <p>指定Channels字段为可见渠道列表或不可见渠道列表<br>如只想获取渠道A的环境 就填写IsVisible= true,Channels = [&quot;A&quot;], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = [&quot;A&quot;]</p>
     * @param IsVisible <p>指定Channels字段为可见渠道列表或不可见渠道列表<br>如只想获取渠道A的环境 就填写IsVisible= true,Channels = [&quot;A&quot;], 过滤渠道A拉取其他渠道环境时填写IsVisible= false,Channels = [&quot;A&quot;]</p>
     */
    public void setIsVisible(Boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    /**
     * Get <p>渠道列表，代表可见或不可见渠道由IsVisible参数指定</p> 
     * @return Channels <p>渠道列表，代表可见或不可见渠道由IsVisible参数指定</p>
     */
    public String [] getChannels() {
        return this.Channels;
    }

    /**
     * Set <p>渠道列表，代表可见或不可见渠道由IsVisible参数指定</p>
     * @param Channels <p>渠道列表，代表可见或不可见渠道由IsVisible参数指定</p>
     */
    public void setChannels(String [] Channels) {
        this.Channels = Channels;
    }

    public DescribeCloudRunEnvsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudRunEnvsRequest(DescribeCloudRunEnvsRequest source) {
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

