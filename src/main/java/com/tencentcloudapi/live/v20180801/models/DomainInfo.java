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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainInfo extends AbstractModel {

    /**
    * <p>直播域名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>域名类型:<br>0: 推流。<br>1: 播放。</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>域名状态:<br>0: 停用。<br>1: 启用。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>添加时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>是否有 CName 到固定规则域名:<br>0: 否。<br>1: 是。</p>
    */
    @SerializedName("BCName")
    @Expose
    private Long BCName;

    /**
    * <p>cname 对应的域名。</p>
    */
    @SerializedName("TargetDomain")
    @Expose
    private String TargetDomain;

    /**
    * <p>播放区域，只在 Type=1 时该参数有意义。<br>1: 国内。<br>2: 全球。<br>3: 海外。</p>
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
    * <p>是否慢直播:<br>0: 普通直播。<br>1: 慢直播。</p>
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * <p>当前客户使用的 cname 信息。</p>
    */
    @SerializedName("CurrentCName")
    @Expose
    private String CurrentCName;

    /**
    * <p>失效参数，可忽略。</p>
    */
    @SerializedName("RentTag")
    @Expose
    private Long RentTag;

    /**
    * <p>失效参数，可忽略。<br>注：此字段为北京时间（UTC+8时区）。</p>
    */
    @SerializedName("RentExpireTime")
    @Expose
    private String RentExpireTime;

    /**
    * <p>0: 标准直播。<br>1: 小程序直播。</p>
    */
    @SerializedName("IsMiniProgramLive")
    @Expose
    private Long IsMiniProgramLive;

    /**
     * Get <p>直播域名。</p> 
     * @return Name <p>直播域名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>直播域名。</p>
     * @param Name <p>直播域名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>域名类型:<br>0: 推流。<br>1: 播放。</p> 
     * @return Type <p>域名类型:<br>0: 推流。<br>1: 播放。</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>域名类型:<br>0: 推流。<br>1: 播放。</p>
     * @param Type <p>域名类型:<br>0: 推流。<br>1: 播放。</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>域名状态:<br>0: 停用。<br>1: 启用。</p> 
     * @return Status <p>域名状态:<br>0: 停用。<br>1: 启用。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>域名状态:<br>0: 停用。<br>1: 启用。</p>
     * @param Status <p>域名状态:<br>0: 停用。<br>1: 启用。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>添加时间。<br>注：此字段为北京时间（UTC+8时区）。</p> 
     * @return CreateTime <p>添加时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>添加时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
     * @param CreateTime <p>添加时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>是否有 CName 到固定规则域名:<br>0: 否。<br>1: 是。</p> 
     * @return BCName <p>是否有 CName 到固定规则域名:<br>0: 否。<br>1: 是。</p>
     */
    public Long getBCName() {
        return this.BCName;
    }

    /**
     * Set <p>是否有 CName 到固定规则域名:<br>0: 否。<br>1: 是。</p>
     * @param BCName <p>是否有 CName 到固定规则域名:<br>0: 否。<br>1: 是。</p>
     */
    public void setBCName(Long BCName) {
        this.BCName = BCName;
    }

    /**
     * Get <p>cname 对应的域名。</p> 
     * @return TargetDomain <p>cname 对应的域名。</p>
     */
    public String getTargetDomain() {
        return this.TargetDomain;
    }

    /**
     * Set <p>cname 对应的域名。</p>
     * @param TargetDomain <p>cname 对应的域名。</p>
     */
    public void setTargetDomain(String TargetDomain) {
        this.TargetDomain = TargetDomain;
    }

    /**
     * Get <p>播放区域，只在 Type=1 时该参数有意义。<br>1: 国内。<br>2: 全球。<br>3: 海外。</p> 
     * @return PlayType <p>播放区域，只在 Type=1 时该参数有意义。<br>1: 国内。<br>2: 全球。<br>3: 海外。</p>
     */
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set <p>播放区域，只在 Type=1 时该参数有意义。<br>1: 国内。<br>2: 全球。<br>3: 海外。</p>
     * @param PlayType <p>播放区域，只在 Type=1 时该参数有意义。<br>1: 国内。<br>2: 全球。<br>3: 海外。</p>
     */
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * Get <p>是否慢直播:<br>0: 普通直播。<br>1: 慢直播。</p> 
     * @return IsDelayLive <p>是否慢直播:<br>0: 普通直播。<br>1: 慢直播。</p>
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set <p>是否慢直播:<br>0: 普通直播。<br>1: 慢直播。</p>
     * @param IsDelayLive <p>是否慢直播:<br>0: 普通直播。<br>1: 慢直播。</p>
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get <p>当前客户使用的 cname 信息。</p> 
     * @return CurrentCName <p>当前客户使用的 cname 信息。</p>
     */
    public String getCurrentCName() {
        return this.CurrentCName;
    }

    /**
     * Set <p>当前客户使用的 cname 信息。</p>
     * @param CurrentCName <p>当前客户使用的 cname 信息。</p>
     */
    public void setCurrentCName(String CurrentCName) {
        this.CurrentCName = CurrentCName;
    }

    /**
     * Get <p>失效参数，可忽略。</p> 
     * @return RentTag <p>失效参数，可忽略。</p>
     */
    public Long getRentTag() {
        return this.RentTag;
    }

    /**
     * Set <p>失效参数，可忽略。</p>
     * @param RentTag <p>失效参数，可忽略。</p>
     */
    public void setRentTag(Long RentTag) {
        this.RentTag = RentTag;
    }

    /**
     * Get <p>失效参数，可忽略。<br>注：此字段为北京时间（UTC+8时区）。</p> 
     * @return RentExpireTime <p>失效参数，可忽略。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public String getRentExpireTime() {
        return this.RentExpireTime;
    }

    /**
     * Set <p>失效参数，可忽略。<br>注：此字段为北京时间（UTC+8时区）。</p>
     * @param RentExpireTime <p>失效参数，可忽略。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public void setRentExpireTime(String RentExpireTime) {
        this.RentExpireTime = RentExpireTime;
    }

    /**
     * Get <p>0: 标准直播。<br>1: 小程序直播。</p> 
     * @return IsMiniProgramLive <p>0: 标准直播。<br>1: 小程序直播。</p>
     */
    public Long getIsMiniProgramLive() {
        return this.IsMiniProgramLive;
    }

    /**
     * Set <p>0: 标准直播。<br>1: 小程序直播。</p>
     * @param IsMiniProgramLive <p>0: 标准直播。<br>1: 小程序直播。</p>
     */
    public void setIsMiniProgramLive(Long IsMiniProgramLive) {
        this.IsMiniProgramLive = IsMiniProgramLive;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BCName != null) {
            this.BCName = new Long(source.BCName);
        }
        if (source.TargetDomain != null) {
            this.TargetDomain = new String(source.TargetDomain);
        }
        if (source.PlayType != null) {
            this.PlayType = new Long(source.PlayType);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.CurrentCName != null) {
            this.CurrentCName = new String(source.CurrentCName);
        }
        if (source.RentTag != null) {
            this.RentTag = new Long(source.RentTag);
        }
        if (source.RentExpireTime != null) {
            this.RentExpireTime = new String(source.RentExpireTime);
        }
        if (source.IsMiniProgramLive != null) {
            this.IsMiniProgramLive = new Long(source.IsMiniProgramLive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BCName", this.BCName);
        this.setParamSimple(map, prefix + "TargetDomain", this.TargetDomain);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamSimple(map, prefix + "CurrentCName", this.CurrentCName);
        this.setParamSimple(map, prefix + "RentTag", this.RentTag);
        this.setParamSimple(map, prefix + "RentExpireTime", this.RentExpireTime);
        this.setParamSimple(map, prefix + "IsMiniProgramLive", this.IsMiniProgramLive);

    }
}

