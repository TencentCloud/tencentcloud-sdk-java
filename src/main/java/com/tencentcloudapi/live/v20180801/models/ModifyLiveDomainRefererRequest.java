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

public class ModifyLiveDomainRefererRequest extends AbstractModel{

    /**
    * 播放域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否开启当前域名的 Referer 黑白名单鉴权。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 名单类型，0：黑名单，1：白名单。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否允许空 Referer，0：不允许，1：允许。
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Long AllowEmpty;

    /**
    * Referer 名单列表，以;分隔。
    */
    @SerializedName("Rules")
    @Expose
    private String Rules;

    /**
     * Get 播放域名。 
     * @return DomainName 播放域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 播放域名。
     * @param DomainName 播放域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否开启当前域名的 Referer 黑白名单鉴权。 
     * @return Enable 是否开启当前域名的 Referer 黑白名单鉴权。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启当前域名的 Referer 黑白名单鉴权。
     * @param Enable 是否开启当前域名的 Referer 黑白名单鉴权。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 名单类型，0：黑名单，1：白名单。 
     * @return Type 名单类型，0：黑名单，1：白名单。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 名单类型，0：黑名单，1：白名单。
     * @param Type 名单类型，0：黑名单，1：白名单。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否允许空 Referer，0：不允许，1：允许。 
     * @return AllowEmpty 是否允许空 Referer，0：不允许，1：允许。
     */
    public Long getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set 是否允许空 Referer，0：不允许，1：允许。
     * @param AllowEmpty 是否允许空 Referer，0：不允许，1：允许。
     */
    public void setAllowEmpty(Long AllowEmpty) {
        this.AllowEmpty = AllowEmpty;
    }

    /**
     * Get Referer 名单列表，以;分隔。 
     * @return Rules Referer 名单列表，以;分隔。
     */
    public String getRules() {
        return this.Rules;
    }

    /**
     * Set Referer 名单列表，以;分隔。
     * @param Rules Referer 名单列表，以;分隔。
     */
    public void setRules(String Rules) {
        this.Rules = Rules;
    }

    public ModifyLiveDomainRefererRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainRefererRequest(ModifyLiveDomainRefererRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AllowEmpty != null) {
            this.AllowEmpty = new Long(source.AllowEmpty);
        }
        if (source.Rules != null) {
            this.Rules = new String(source.Rules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AllowEmpty", this.AllowEmpty);
        this.setParamSimple(map, prefix + "Rules", this.Rules);

    }
}

