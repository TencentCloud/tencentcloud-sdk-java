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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkApplicationInfo extends AbstractModel {

    /**
    * 网络应用Id
    */
    @SerializedName("NetworkAppId")
    @Expose
    private String NetworkAppId;

    /**
    * 网络应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域code
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 主账号id
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 子账号id
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * 创建时间，秒级时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间，秒级时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 网络应用Id 
     * @return NetworkAppId 网络应用Id
     */
    public String getNetworkAppId() {
        return this.NetworkAppId;
    }

    /**
     * Set 网络应用Id
     * @param NetworkAppId 网络应用Id
     */
    public void setNetworkAppId(String NetworkAppId) {
        this.NetworkAppId = NetworkAppId;
    }

    /**
     * Get 网络应用名称 
     * @return Name 网络应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网络应用名称
     * @param Name 网络应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地域code 
     * @return Region 地域code
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域code
     * @param Region 地域code
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志集id 
     * @return LogsetId 日志集id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
     * @param LogsetId 日志集id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 主账号id 
     * @return Uin 主账号id
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号id
     * @param Uin 主账号id
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号id 
     * @return SubUin 子账号id
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号id
     * @param SubUin 子账号id
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 创建时间，秒级时间戳 
     * @return CreateTime 创建时间，秒级时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，秒级时间戳
     * @param CreateTime 创建时间，秒级时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，秒级时间戳 
     * @return UpdateTime 更新时间，秒级时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，秒级时间戳
     * @param UpdateTime 更新时间，秒级时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public NetworkApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkApplicationInfo(NetworkApplicationInfo source) {
        if (source.NetworkAppId != null) {
            this.NetworkAppId = new String(source.NetworkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAppId", this.NetworkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

