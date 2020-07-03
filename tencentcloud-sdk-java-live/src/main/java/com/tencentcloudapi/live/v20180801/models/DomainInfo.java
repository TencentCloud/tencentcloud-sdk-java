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

public class DomainInfo extends AbstractModel{

    /**
    * 直播域名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 域名类型:
0: 推流。
1: 播放。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 域名状态:
0: 停用。
1: 启用。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 添加时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否有 CName 到固定规则域名:
0: 否。
1: 是。
    */
    @SerializedName("BCName")
    @Expose
    private Long BCName;

    /**
    * cname 对应的域名。
    */
    @SerializedName("TargetDomain")
    @Expose
    private String TargetDomain;

    /**
    * 播放区域，只在 Type=1 时该参数有意义。
1: 国内。
2: 全球。
3: 海外。
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
    * 是否慢直播:
0: 普通直播。
1: 慢直播。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * 当前客户使用的 cname 信息。
    */
    @SerializedName("CurrentCName")
    @Expose
    private String CurrentCName;

    /**
    * 失效参数，可忽略。
    */
    @SerializedName("RentTag")
    @Expose
    private Long RentTag;

    /**
    * 失效参数，可忽略。
    */
    @SerializedName("RentExpireTime")
    @Expose
    private String RentExpireTime;

    /**
    * 0: 标准直播。
1: 小程序直播。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMiniProgramLive")
    @Expose
    private Long IsMiniProgramLive;

    /**
     * Get 直播域名。 
     * @return Name 直播域名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 直播域名。
     * @param Name 直播域名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 域名类型:
0: 推流。
1: 播放。 
     * @return Type 域名类型:
0: 推流。
1: 播放。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 域名类型:
0: 推流。
1: 播放。
     * @param Type 域名类型:
0: 推流。
1: 播放。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 域名状态:
0: 停用。
1: 启用。 
     * @return Status 域名状态:
0: 停用。
1: 启用。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态:
0: 停用。
1: 启用。
     * @param Status 域名状态:
0: 停用。
1: 启用。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 添加时间。 
     * @return CreateTime 添加时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 添加时间。
     * @param CreateTime 添加时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否有 CName 到固定规则域名:
0: 否。
1: 是。 
     * @return BCName 是否有 CName 到固定规则域名:
0: 否。
1: 是。
     */
    public Long getBCName() {
        return this.BCName;
    }

    /**
     * Set 是否有 CName 到固定规则域名:
0: 否。
1: 是。
     * @param BCName 是否有 CName 到固定规则域名:
0: 否。
1: 是。
     */
    public void setBCName(Long BCName) {
        this.BCName = BCName;
    }

    /**
     * Get cname 对应的域名。 
     * @return TargetDomain cname 对应的域名。
     */
    public String getTargetDomain() {
        return this.TargetDomain;
    }

    /**
     * Set cname 对应的域名。
     * @param TargetDomain cname 对应的域名。
     */
    public void setTargetDomain(String TargetDomain) {
        this.TargetDomain = TargetDomain;
    }

    /**
     * Get 播放区域，只在 Type=1 时该参数有意义。
1: 国内。
2: 全球。
3: 海外。 
     * @return PlayType 播放区域，只在 Type=1 时该参数有意义。
1: 国内。
2: 全球。
3: 海外。
     */
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set 播放区域，只在 Type=1 时该参数有意义。
1: 国内。
2: 全球。
3: 海外。
     * @param PlayType 播放区域，只在 Type=1 时该参数有意义。
1: 国内。
2: 全球。
3: 海外。
     */
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * Get 是否慢直播:
0: 普通直播。
1: 慢直播。 
     * @return IsDelayLive 是否慢直播:
0: 普通直播。
1: 慢直播。
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 是否慢直播:
0: 普通直播。
1: 慢直播。
     * @param IsDelayLive 是否慢直播:
0: 普通直播。
1: 慢直播。
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get 当前客户使用的 cname 信息。 
     * @return CurrentCName 当前客户使用的 cname 信息。
     */
    public String getCurrentCName() {
        return this.CurrentCName;
    }

    /**
     * Set 当前客户使用的 cname 信息。
     * @param CurrentCName 当前客户使用的 cname 信息。
     */
    public void setCurrentCName(String CurrentCName) {
        this.CurrentCName = CurrentCName;
    }

    /**
     * Get 失效参数，可忽略。 
     * @return RentTag 失效参数，可忽略。
     */
    public Long getRentTag() {
        return this.RentTag;
    }

    /**
     * Set 失效参数，可忽略。
     * @param RentTag 失效参数，可忽略。
     */
    public void setRentTag(Long RentTag) {
        this.RentTag = RentTag;
    }

    /**
     * Get 失效参数，可忽略。 
     * @return RentExpireTime 失效参数，可忽略。
     */
    public String getRentExpireTime() {
        return this.RentExpireTime;
    }

    /**
     * Set 失效参数，可忽略。
     * @param RentExpireTime 失效参数，可忽略。
     */
    public void setRentExpireTime(String RentExpireTime) {
        this.RentExpireTime = RentExpireTime;
    }

    /**
     * Get 0: 标准直播。
1: 小程序直播。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMiniProgramLive 0: 标准直播。
1: 小程序直播。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsMiniProgramLive() {
        return this.IsMiniProgramLive;
    }

    /**
     * Set 0: 标准直播。
1: 小程序直播。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMiniProgramLive 0: 标准直播。
1: 小程序直播。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMiniProgramLive(Long IsMiniProgramLive) {
        this.IsMiniProgramLive = IsMiniProgramLive;
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

