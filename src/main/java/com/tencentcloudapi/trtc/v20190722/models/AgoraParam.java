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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgoraParam extends AbstractModel {

    /**
    * <p>声网提供的应用标识</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>声网提供的频道名</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>声网录制的频道模式， 可选值如下：（默认值为0） 0: 通信（默认）,即常见的 1 对 1 单聊或群聊， 频道内任何用户可以自由说话； 1: 直播，有两种用户角色: 主播和观众。</p><p>枚举值：</p><ul><li>0:： 通信（默认）</li><li>1： 直播</li></ul>
    */
    @SerializedName("ChannelProfile")
    @Expose
    private Long ChannelProfile;

    /**
    * <p>绑定频道生成的临时Token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>用户ID</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * <p>信任用户的列表</p>
    */
    @SerializedName("TrustedUserIdList")
    @Expose
    private Long [] TrustedUserIdList;

    /**
    * <p>非信任用户的列表</p>
    */
    @SerializedName("UntrustedUserIdList")
    @Expose
    private Long [] UntrustedUserIdList;

    /**
     * Get <p>声网提供的应用标识</p> 
     * @return AppId <p>声网提供的应用标识</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>声网提供的应用标识</p>
     * @param AppId <p>声网提供的应用标识</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>声网提供的频道名</p> 
     * @return Channel <p>声网提供的频道名</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>声网提供的频道名</p>
     * @param Channel <p>声网提供的频道名</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>声网录制的频道模式， 可选值如下：（默认值为0） 0: 通信（默认）,即常见的 1 对 1 单聊或群聊， 频道内任何用户可以自由说话； 1: 直播，有两种用户角色: 主播和观众。</p><p>枚举值：</p><ul><li>0:： 通信（默认）</li><li>1： 直播</li></ul> 
     * @return ChannelProfile <p>声网录制的频道模式， 可选值如下：（默认值为0） 0: 通信（默认）,即常见的 1 对 1 单聊或群聊， 频道内任何用户可以自由说话； 1: 直播，有两种用户角色: 主播和观众。</p><p>枚举值：</p><ul><li>0:： 通信（默认）</li><li>1： 直播</li></ul>
     */
    public Long getChannelProfile() {
        return this.ChannelProfile;
    }

    /**
     * Set <p>声网录制的频道模式， 可选值如下：（默认值为0） 0: 通信（默认）,即常见的 1 对 1 单聊或群聊， 频道内任何用户可以自由说话； 1: 直播，有两种用户角色: 主播和观众。</p><p>枚举值：</p><ul><li>0:： 通信（默认）</li><li>1： 直播</li></ul>
     * @param ChannelProfile <p>声网录制的频道模式， 可选值如下：（默认值为0） 0: 通信（默认）,即常见的 1 对 1 单聊或群聊， 频道内任何用户可以自由说话； 1: 直播，有两种用户角色: 主播和观众。</p><p>枚举值：</p><ul><li>0:： 通信（默认）</li><li>1： 直播</li></ul>
     */
    public void setChannelProfile(Long ChannelProfile) {
        this.ChannelProfile = ChannelProfile;
    }

    /**
     * Get <p>绑定频道生成的临时Token</p> 
     * @return Token <p>绑定频道生成的临时Token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>绑定频道生成的临时Token</p>
     * @param Token <p>绑定频道生成的临时Token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>用户ID</p> 
     * @return Uid <p>用户ID</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>用户ID</p>
     * @param Uid <p>用户ID</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>信任用户的列表</p> 
     * @return TrustedUserIdList <p>信任用户的列表</p>
     */
    public Long [] getTrustedUserIdList() {
        return this.TrustedUserIdList;
    }

    /**
     * Set <p>信任用户的列表</p>
     * @param TrustedUserIdList <p>信任用户的列表</p>
     */
    public void setTrustedUserIdList(Long [] TrustedUserIdList) {
        this.TrustedUserIdList = TrustedUserIdList;
    }

    /**
     * Get <p>非信任用户的列表</p> 
     * @return UntrustedUserIdList <p>非信任用户的列表</p>
     */
    public Long [] getUntrustedUserIdList() {
        return this.UntrustedUserIdList;
    }

    /**
     * Set <p>非信任用户的列表</p>
     * @param UntrustedUserIdList <p>非信任用户的列表</p>
     */
    public void setUntrustedUserIdList(Long [] UntrustedUserIdList) {
        this.UntrustedUserIdList = UntrustedUserIdList;
    }

    public AgoraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgoraParam(AgoraParam source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.ChannelProfile != null) {
            this.ChannelProfile = new Long(source.ChannelProfile);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.TrustedUserIdList != null) {
            this.TrustedUserIdList = new Long[source.TrustedUserIdList.length];
            for (int i = 0; i < source.TrustedUserIdList.length; i++) {
                this.TrustedUserIdList[i] = new Long(source.TrustedUserIdList[i]);
            }
        }
        if (source.UntrustedUserIdList != null) {
            this.UntrustedUserIdList = new Long[source.UntrustedUserIdList.length];
            for (int i = 0; i < source.UntrustedUserIdList.length; i++) {
                this.UntrustedUserIdList[i] = new Long(source.UntrustedUserIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "ChannelProfile", this.ChannelProfile);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamArraySimple(map, prefix + "TrustedUserIdList.", this.TrustedUserIdList);
        this.setParamArraySimple(map, prefix + "UntrustedUserIdList.", this.UntrustedUserIdList);

    }
}

