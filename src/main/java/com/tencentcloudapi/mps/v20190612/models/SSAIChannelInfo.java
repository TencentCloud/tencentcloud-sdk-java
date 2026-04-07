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
    * 频道ID，全局唯一标识。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 频道名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 广告源信息。
    */
    @SerializedName("ContentSource")
    @Expose
    private String ContentSource;

    /**
    * 播放地址。
    */
    @SerializedName("PlaybackPrefix")
    @Expose
    private String PlaybackPrefix;

    /**
    * 广告插入SSAI配置信息。
    */
    @SerializedName("SSAIInfo")
    @Expose
    private SSAIConf SSAIInfo;

    /**
    * 地域信息。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用于clickthrough地址
    */
    @SerializedName("SessionInitPrefix")
    @Expose
    private String SessionInitPrefix;

    /**
     * Get 频道ID，全局唯一标识。 
     * @return ID 频道ID，全局唯一标识。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 频道ID，全局唯一标识。
     * @param ID 频道ID，全局唯一标识。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 频道名称。 
     * @return Name 频道名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 频道名称。
     * @param Name 频道名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 广告源信息。 
     * @return ContentSource 广告源信息。
     */
    public String getContentSource() {
        return this.ContentSource;
    }

    /**
     * Set 广告源信息。
     * @param ContentSource 广告源信息。
     */
    public void setContentSource(String ContentSource) {
        this.ContentSource = ContentSource;
    }

    /**
     * Get 播放地址。 
     * @return PlaybackPrefix 播放地址。
     */
    public String getPlaybackPrefix() {
        return this.PlaybackPrefix;
    }

    /**
     * Set 播放地址。
     * @param PlaybackPrefix 播放地址。
     */
    public void setPlaybackPrefix(String PlaybackPrefix) {
        this.PlaybackPrefix = PlaybackPrefix;
    }

    /**
     * Get 广告插入SSAI配置信息。 
     * @return SSAIInfo 广告插入SSAI配置信息。
     */
    public SSAIConf getSSAIInfo() {
        return this.SSAIInfo;
    }

    /**
     * Set 广告插入SSAI配置信息。
     * @param SSAIInfo 广告插入SSAI配置信息。
     */
    public void setSSAIInfo(SSAIConf SSAIInfo) {
        this.SSAIInfo = SSAIInfo;
    }

    /**
     * Get 地域信息。 
     * @return Region 地域信息。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息。
     * @param Region 地域信息。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用于clickthrough地址 
     * @return SessionInitPrefix 用于clickthrough地址
     */
    public String getSessionInitPrefix() {
        return this.SessionInitPrefix;
    }

    /**
     * Set 用于clickthrough地址
     * @param SessionInitPrefix 用于clickthrough地址
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
        this.setParamObj(map, prefix + "SSAIInfo.", this.SSAIInfo);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SessionInitPrefix", this.SessionInitPrefix);

    }
}

