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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCLSPushTargetRequest extends AbstractModel {

    /**
    * 域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 点播应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 要设置的中国大陆地区的日志推送目标。
    */
    @SerializedName("ChineseMainlandCLSTargetInfo")
    @Expose
    private AreaCLSTargetInfo ChineseMainlandCLSTargetInfo;

    /**
    * 要设置的中国大陆以外地区的日志推送目标。
    */
    @SerializedName("OutsideChineseMainlandCLSTargetInfo")
    @Expose
    private AreaCLSTargetInfo OutsideChineseMainlandCLSTargetInfo;

    /**
     * Get 域名。 
     * @return Domain 域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
     * @param Domain 域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 点播应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播应用 ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 要设置的中国大陆地区的日志推送目标。 
     * @return ChineseMainlandCLSTargetInfo 要设置的中国大陆地区的日志推送目标。
     */
    public AreaCLSTargetInfo getChineseMainlandCLSTargetInfo() {
        return this.ChineseMainlandCLSTargetInfo;
    }

    /**
     * Set 要设置的中国大陆地区的日志推送目标。
     * @param ChineseMainlandCLSTargetInfo 要设置的中国大陆地区的日志推送目标。
     */
    public void setChineseMainlandCLSTargetInfo(AreaCLSTargetInfo ChineseMainlandCLSTargetInfo) {
        this.ChineseMainlandCLSTargetInfo = ChineseMainlandCLSTargetInfo;
    }

    /**
     * Get 要设置的中国大陆以外地区的日志推送目标。 
     * @return OutsideChineseMainlandCLSTargetInfo 要设置的中国大陆以外地区的日志推送目标。
     */
    public AreaCLSTargetInfo getOutsideChineseMainlandCLSTargetInfo() {
        return this.OutsideChineseMainlandCLSTargetInfo;
    }

    /**
     * Set 要设置的中国大陆以外地区的日志推送目标。
     * @param OutsideChineseMainlandCLSTargetInfo 要设置的中国大陆以外地区的日志推送目标。
     */
    public void setOutsideChineseMainlandCLSTargetInfo(AreaCLSTargetInfo OutsideChineseMainlandCLSTargetInfo) {
        this.OutsideChineseMainlandCLSTargetInfo = OutsideChineseMainlandCLSTargetInfo;
    }

    public SetCLSPushTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCLSPushTargetRequest(SetCLSPushTargetRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ChineseMainlandCLSTargetInfo != null) {
            this.ChineseMainlandCLSTargetInfo = new AreaCLSTargetInfo(source.ChineseMainlandCLSTargetInfo);
        }
        if (source.OutsideChineseMainlandCLSTargetInfo != null) {
            this.OutsideChineseMainlandCLSTargetInfo = new AreaCLSTargetInfo(source.OutsideChineseMainlandCLSTargetInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "ChineseMainlandCLSTargetInfo.", this.ChineseMainlandCLSTargetInfo);
        this.setParamObj(map, prefix + "OutsideChineseMainlandCLSTargetInfo.", this.OutsideChineseMainlandCLSTargetInfo);

    }
}

