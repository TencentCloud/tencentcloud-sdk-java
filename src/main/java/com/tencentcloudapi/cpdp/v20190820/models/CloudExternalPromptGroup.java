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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudExternalPromptGroup extends AbstractModel{

    /**
    * 渠道名。
为米大师定义的枚举值：
wechat 微信渠道
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道扩展促销信息列表，由各个渠道自行定义。
ChannelName为wechat时，组成为 <Wechat-ExternalPromptInfo>
    */
    @SerializedName("ExternalPromptInfoList")
    @Expose
    private CloudExternalPromptInfo [] ExternalPromptInfoList;

    /**
     * Get 渠道名。
为米大师定义的枚举值：
wechat 微信渠道 
     * @return ChannelName 渠道名。
为米大师定义的枚举值：
wechat 微信渠道
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名。
为米大师定义的枚举值：
wechat 微信渠道
     * @param ChannelName 渠道名。
为米大师定义的枚举值：
wechat 微信渠道
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道扩展促销信息列表，由各个渠道自行定义。
ChannelName为wechat时，组成为 <Wechat-ExternalPromptInfo> 
     * @return ExternalPromptInfoList 渠道扩展促销信息列表，由各个渠道自行定义。
ChannelName为wechat时，组成为 <Wechat-ExternalPromptInfo>
     */
    public CloudExternalPromptInfo [] getExternalPromptInfoList() {
        return this.ExternalPromptInfoList;
    }

    /**
     * Set 渠道扩展促销信息列表，由各个渠道自行定义。
ChannelName为wechat时，组成为 <Wechat-ExternalPromptInfo>
     * @param ExternalPromptInfoList 渠道扩展促销信息列表，由各个渠道自行定义。
ChannelName为wechat时，组成为 <Wechat-ExternalPromptInfo>
     */
    public void setExternalPromptInfoList(CloudExternalPromptInfo [] ExternalPromptInfoList) {
        this.ExternalPromptInfoList = ExternalPromptInfoList;
    }

    public CloudExternalPromptGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudExternalPromptGroup(CloudExternalPromptGroup source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ExternalPromptInfoList != null) {
            this.ExternalPromptInfoList = new CloudExternalPromptInfo[source.ExternalPromptInfoList.length];
            for (int i = 0; i < source.ExternalPromptInfoList.length; i++) {
                this.ExternalPromptInfoList[i] = new CloudExternalPromptInfo(source.ExternalPromptInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArrayObj(map, prefix + "ExternalPromptInfoList.", this.ExternalPromptInfoList);

    }
}

