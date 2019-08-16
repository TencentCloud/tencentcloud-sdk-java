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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainInfo  extends AbstractModel{

    /**
    * 直播域名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 域名类型。0-推流，1-播放
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 域名状态。0-停用，1-启用
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 添加时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否有CName到固定规则域名。0-否，1-是
    */
    @SerializedName("BCName")
    @Expose
    private Integer BCName;

    /**
    * cname对应的域名
    */
    @SerializedName("TargetDomain")
    @Expose
    private String TargetDomain;

    /**
    * 播放区域，只在Type=1时该参数有意义。
1-国内，2-全球，3-海外。
    */
    @SerializedName("PlayType")
    @Expose
    private Integer PlayType;

    /**
    * 0：普通直播，
1：慢直播。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Integer IsDelayLive;

    /**
    * 当前客户使用的cname信息
    */
    @SerializedName("CurrentCName")
    @Expose
    private String CurrentCName;

    /**
     * 获取直播域名
     * @return Name 直播域名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置直播域名
     * @param Name 直播域名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取域名类型。0-推流，1-播放
     * @return Type 域名类型。0-推流，1-播放
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置域名类型。0-推流，1-播放
     * @param Type 域名类型。0-推流，1-播放
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取域名状态。0-停用，1-启用
     * @return Status 域名状态。0-停用，1-启用
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置域名状态。0-停用，1-启用
     * @param Status 域名状态。0-停用，1-启用
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取添加时间
     * @return CreateTime 添加时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置添加时间
     * @param CreateTime 添加时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取是否有CName到固定规则域名。0-否，1-是
     * @return BCName 是否有CName到固定规则域名。0-否，1-是
     */
    public Integer getBCName() {
        return this.BCName;
    }

    /**
     * 设置是否有CName到固定规则域名。0-否，1-是
     * @param BCName 是否有CName到固定规则域名。0-否，1-是
     */
    public void setBCName(Integer BCName) {
        this.BCName = BCName;
    }

    /**
     * 获取cname对应的域名
     * @return TargetDomain cname对应的域名
     */
    public String getTargetDomain() {
        return this.TargetDomain;
    }

    /**
     * 设置cname对应的域名
     * @param TargetDomain cname对应的域名
     */
    public void setTargetDomain(String TargetDomain) {
        this.TargetDomain = TargetDomain;
    }

    /**
     * 获取播放区域，只在Type=1时该参数有意义。
1-国内，2-全球，3-海外。
     * @return PlayType 播放区域，只在Type=1时该参数有意义。
1-国内，2-全球，3-海外。
     */
    public Integer getPlayType() {
        return this.PlayType;
    }

    /**
     * 设置播放区域，只在Type=1时该参数有意义。
1-国内，2-全球，3-海外。
     * @param PlayType 播放区域，只在Type=1时该参数有意义。
1-国内，2-全球，3-海外。
     */
    public void setPlayType(Integer PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * 获取0：普通直播，
1：慢直播。
     * @return IsDelayLive 0：普通直播，
1：慢直播。
     */
    public Integer getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * 设置0：普通直播，
1：慢直播。
     * @param IsDelayLive 0：普通直播，
1：慢直播。
     */
    public void setIsDelayLive(Integer IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * 获取当前客户使用的cname信息
     * @return CurrentCName 当前客户使用的cname信息
     */
    public String getCurrentCName() {
        return this.CurrentCName;
    }

    /**
     * 设置当前客户使用的cname信息
     * @param CurrentCName 当前客户使用的cname信息
     */
    public void setCurrentCName(String CurrentCName) {
        this.CurrentCName = CurrentCName;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

