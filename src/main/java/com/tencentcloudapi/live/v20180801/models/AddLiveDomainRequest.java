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

public class AddLiveDomainRequest extends AbstractModel{

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
    private Long DomainType;

    /**
    * 拉流域名类型：
1：国内，
2：全球，
3：境外。
默认值：1。
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
    * 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * 是否是小程序直播：
0： 标准直播，
1 ：小程序直播 。
默认值： 0。
    */
    @SerializedName("IsMiniProgramLive")
    @Expose
    private Long IsMiniProgramLive;

    /**
    * 域名归属校验类型。
可取值（与 AuthenticateDomainOwner 接口的 VerifyType 参数一致。）：
dnsCheck ：立即验证配置 dns 的解析记录是否与待验证内容一致，成功则保存记录。
fileCheck ：立即验证 web 文件是否与待验证内容一致，成功则保存记录。
dbCheck :  检查是否已经验证成功过。
若不传默认为 dbCheck 。
    */
    @SerializedName("VerifyOwnerType")
    @Expose
    private String VerifyOwnerType;

    /**
     * Get 域名名称。 
     * @return DomainName 域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名名称。
     * @param DomainName 域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 域名类型，
0：推流域名，
1：播放域名。 
     * @return DomainType 域名类型，
0：推流域名，
1：播放域名。
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set 域名类型，
0：推流域名，
1：播放域名。
     * @param DomainType 域名类型，
0：推流域名，
1：播放域名。
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get 拉流域名类型：
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
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set 拉流域名类型：
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
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * Get 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。 
     * @return IsDelayLive 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     * @param IsDelayLive 是否是慢直播：
0： 普通直播，
1 ：慢直播 。
默认值： 0。
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get 是否是小程序直播：
0： 标准直播，
1 ：小程序直播 。
默认值： 0。 
     * @return IsMiniProgramLive 是否是小程序直播：
0： 标准直播，
1 ：小程序直播 。
默认值： 0。
     */
    public Long getIsMiniProgramLive() {
        return this.IsMiniProgramLive;
    }

    /**
     * Set 是否是小程序直播：
0： 标准直播，
1 ：小程序直播 。
默认值： 0。
     * @param IsMiniProgramLive 是否是小程序直播：
0： 标准直播，
1 ：小程序直播 。
默认值： 0。
     */
    public void setIsMiniProgramLive(Long IsMiniProgramLive) {
        this.IsMiniProgramLive = IsMiniProgramLive;
    }

    /**
     * Get 域名归属校验类型。
可取值（与 AuthenticateDomainOwner 接口的 VerifyType 参数一致。）：
dnsCheck ：立即验证配置 dns 的解析记录是否与待验证内容一致，成功则保存记录。
fileCheck ：立即验证 web 文件是否与待验证内容一致，成功则保存记录。
dbCheck :  检查是否已经验证成功过。
若不传默认为 dbCheck 。 
     * @return VerifyOwnerType 域名归属校验类型。
可取值（与 AuthenticateDomainOwner 接口的 VerifyType 参数一致。）：
dnsCheck ：立即验证配置 dns 的解析记录是否与待验证内容一致，成功则保存记录。
fileCheck ：立即验证 web 文件是否与待验证内容一致，成功则保存记录。
dbCheck :  检查是否已经验证成功过。
若不传默认为 dbCheck 。
     */
    public String getVerifyOwnerType() {
        return this.VerifyOwnerType;
    }

    /**
     * Set 域名归属校验类型。
可取值（与 AuthenticateDomainOwner 接口的 VerifyType 参数一致。）：
dnsCheck ：立即验证配置 dns 的解析记录是否与待验证内容一致，成功则保存记录。
fileCheck ：立即验证 web 文件是否与待验证内容一致，成功则保存记录。
dbCheck :  检查是否已经验证成功过。
若不传默认为 dbCheck 。
     * @param VerifyOwnerType 域名归属校验类型。
可取值（与 AuthenticateDomainOwner 接口的 VerifyType 参数一致。）：
dnsCheck ：立即验证配置 dns 的解析记录是否与待验证内容一致，成功则保存记录。
fileCheck ：立即验证 web 文件是否与待验证内容一致，成功则保存记录。
dbCheck :  检查是否已经验证成功过。
若不传默认为 dbCheck 。
     */
    public void setVerifyOwnerType(String VerifyOwnerType) {
        this.VerifyOwnerType = VerifyOwnerType;
    }

    public AddLiveDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLiveDomainRequest(AddLiveDomainRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.PlayType != null) {
            this.PlayType = new Long(source.PlayType);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.IsMiniProgramLive != null) {
            this.IsMiniProgramLive = new Long(source.IsMiniProgramLive);
        }
        if (source.VerifyOwnerType != null) {
            this.VerifyOwnerType = new String(source.VerifyOwnerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamSimple(map, prefix + "IsMiniProgramLive", this.IsMiniProgramLive);
        this.setParamSimple(map, prefix + "VerifyOwnerType", this.VerifyOwnerType);

    }
}

