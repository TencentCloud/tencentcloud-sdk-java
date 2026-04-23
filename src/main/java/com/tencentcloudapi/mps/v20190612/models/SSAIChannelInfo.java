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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSAIChannelInfo extends AbstractModel {

    /**
    * <p>频道ID，全局唯一标识。</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>频道名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>广告源信息。</p>
    */
    @SerializedName("ContentSource")
    @Expose
    private String ContentSource;

    /**
    * <p>播放地址。兼容旧版本参数，推荐使用HlsPlaybackPrefix或DashPlaybackPrefix</p>
    */
    @SerializedName("PlaybackPrefix")
    @Expose
    private String PlaybackPrefix;

    /**
    * <p>hls播放地址</p>
    */
    @SerializedName("HlsPlaybackPrefix")
    @Expose
    private String HlsPlaybackPrefix;

    /**
    * <p>dash播放地址</p>
    */
    @SerializedName("DashPlaybackPrefix")
    @Expose
    private String DashPlaybackPrefix;

    /**
    * <p>广告插入SSAI配置信息。</p>
    */
    @SerializedName("SSAIInfo")
    @Expose
    private SSAIConf SSAIInfo;

    /**
    * <p>地域信息。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>用于clickthrough地址</p>
    */
    @SerializedName("SessionInitPrefix")
    @Expose
    private String SessionInitPrefix;

    /**
     * Get <p>频道ID，全局唯一标识。</p> 
     * @return ID <p>频道ID，全局唯一标识。</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>频道ID，全局唯一标识。</p>
     * @param ID <p>频道ID，全局唯一标识。</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>频道名称。</p> 
     * @return Name <p>频道名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>频道名称。</p>
     * @param Name <p>频道名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>广告源信息。</p> 
     * @return ContentSource <p>广告源信息。</p>
     */
    public String getContentSource() {
        return this.ContentSource;
    }

    /**
     * Set <p>广告源信息。</p>
     * @param ContentSource <p>广告源信息。</p>
     */
    public void setContentSource(String ContentSource) {
        this.ContentSource = ContentSource;
    }

    /**
     * Get <p>播放地址。兼容旧版本参数，推荐使用HlsPlaybackPrefix或DashPlaybackPrefix</p> 
     * @return PlaybackPrefix <p>播放地址。兼容旧版本参数，推荐使用HlsPlaybackPrefix或DashPlaybackPrefix</p>
     */
    public String getPlaybackPrefix() {
        return this.PlaybackPrefix;
    }

    /**
     * Set <p>播放地址。兼容旧版本参数，推荐使用HlsPlaybackPrefix或DashPlaybackPrefix</p>
     * @param PlaybackPrefix <p>播放地址。兼容旧版本参数，推荐使用HlsPlaybackPrefix或DashPlaybackPrefix</p>
     */
    public void setPlaybackPrefix(String PlaybackPrefix) {
        this.PlaybackPrefix = PlaybackPrefix;
    }

    /**
     * Get <p>hls播放地址</p> 
     * @return HlsPlaybackPrefix <p>hls播放地址</p>
     */
    public String getHlsPlaybackPrefix() {
        return this.HlsPlaybackPrefix;
    }

    /**
     * Set <p>hls播放地址</p>
     * @param HlsPlaybackPrefix <p>hls播放地址</p>
     */
    public void setHlsPlaybackPrefix(String HlsPlaybackPrefix) {
        this.HlsPlaybackPrefix = HlsPlaybackPrefix;
    }

    /**
     * Get <p>dash播放地址</p> 
     * @return DashPlaybackPrefix <p>dash播放地址</p>
     */
    public String getDashPlaybackPrefix() {
        return this.DashPlaybackPrefix;
    }

    /**
     * Set <p>dash播放地址</p>
     * @param DashPlaybackPrefix <p>dash播放地址</p>
     */
    public void setDashPlaybackPrefix(String DashPlaybackPrefix) {
        this.DashPlaybackPrefix = DashPlaybackPrefix;
    }

    /**
     * Get <p>广告插入SSAI配置信息。</p> 
     * @return SSAIInfo <p>广告插入SSAI配置信息。</p>
     */
    public SSAIConf getSSAIInfo() {
        return this.SSAIInfo;
    }

    /**
     * Set <p>广告插入SSAI配置信息。</p>
     * @param SSAIInfo <p>广告插入SSAI配置信息。</p>
     */
    public void setSSAIInfo(SSAIConf SSAIInfo) {
        this.SSAIInfo = SSAIInfo;
    }

    /**
     * Get <p>地域信息。</p> 
     * @return Region <p>地域信息。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域信息。</p>
     * @param Region <p>地域信息。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>用于clickthrough地址</p> 
     * @return SessionInitPrefix <p>用于clickthrough地址</p>
     */
    public String getSessionInitPrefix() {
        return this.SessionInitPrefix;
    }

    /**
     * Set <p>用于clickthrough地址</p>
     * @param SessionInitPrefix <p>用于clickthrough地址</p>
     */
    public void setSessionInitPrefix(String SessionInitPrefix) {
        this.SessionInitPrefix = SessionInitPrefix;
    }

    public SSAIChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSAIChannelInfo(SSAIChannelInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentSource != null) {
            this.ContentSource = new String(source.ContentSource);
        }
        if (source.PlaybackPrefix != null) {
            this.PlaybackPrefix = new String(source.PlaybackPrefix);
        }
        if (source.HlsPlaybackPrefix != null) {
            this.HlsPlaybackPrefix = new String(source.HlsPlaybackPrefix);
        }
        if (source.DashPlaybackPrefix != null) {
            this.DashPlaybackPrefix = new String(source.DashPlaybackPrefix);
        }
        if (source.SSAIInfo != null) {
            this.SSAIInfo = new SSAIConf(source.SSAIInfo);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SessionInitPrefix != null) {
            this.SessionInitPrefix = new String(source.SessionInitPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentSource", this.ContentSource);
        this.setParamSimple(map, prefix + "PlaybackPrefix", this.PlaybackPrefix);
        this.setParamSimple(map, prefix + "HlsPlaybackPrefix", this.HlsPlaybackPrefix);
        this.setParamSimple(map, prefix + "DashPlaybackPrefix", this.DashPlaybackPrefix);
        this.setParamObj(map, prefix + "SSAIInfo.", this.SSAIInfo);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SessionInitPrefix", this.SessionInitPrefix);

    }
}

