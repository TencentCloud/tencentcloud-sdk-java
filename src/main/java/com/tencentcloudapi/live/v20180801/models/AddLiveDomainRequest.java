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

public class AddLiveDomainRequest  extends AbstractModel{

    /**
    * 域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 域名类型，
0：推流域名，
1：播放域名。
    */
    @SerializedName("DomainType")
    @Expose
    private Integer DomainType;

    /**
    * 拉流域名类型：
1：国内，
2：全球，
3：境外。
默认值：1。
    */
    @SerializedName("PlayType")
    @Expose
    private Integer PlayType;

    /**
    * 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Integer IsDelayLive;

    /**
     * 获取域名名称。
     * @return DomainName 域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置域名名称。
     * @param DomainName 域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取域名类型，
0：推流域名，
1：播放域名。
     * @return DomainType 域名类型，
0：推流域名，
1：播放域名。
     */
    public Integer getDomainType() {
        return this.DomainType;
    }

    /**
     * 设置域名类型，
0：推流域名，
1：播放域名。
     * @param DomainType 域名类型，
0：推流域名，
1：播放域名。
     */
    public void setDomainType(Integer DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * 获取拉流域名类型：
1：国内，
2：全球，
3：境外。
默认值：1。
     * @return PlayType 拉流域名类型：
1：国内，
2：全球，
3：境外。
默认值：1。
     */
    public Integer getPlayType() {
        return this.PlayType;
    }

    /**
     * 设置拉流域名类型：
1：国内，
2：全球，
3：境外。
默认值：1。
     * @param PlayType 拉流域名类型：
1：国内，
2：全球，
3：境外。
默认值：1。
     */
    public void setPlayType(Integer PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * 获取是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     * @return IsDelayLive 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     */
    public Integer getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * 设置是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     * @param IsDelayLive 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     */
    public void setIsDelayLive(Integer IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);

    }
}

