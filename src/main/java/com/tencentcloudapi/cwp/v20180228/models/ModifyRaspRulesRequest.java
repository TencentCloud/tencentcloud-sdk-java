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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRaspRulesRequest extends AbstractModel {

    /**
    * 规则ID(新增时请留空，编辑时候必传)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 漏洞id数组
    */
    @SerializedName("VulVulsIDs")
    @Expose
    private Long [] VulVulsIDs;

    /**
    * 自定义请求范围加白正则表达式，选择全部请求范围时候为空，否则不能为空，base64编码
    */
    @SerializedName("URLRegexp")
    @Expose
    private String URLRegexp;

    /**
    * 加白方式，0：自定义请求范围加白。1：全部请求加白
    */
    @SerializedName("WhiteType")
    @Expose
    private Long WhiteType;

    /**
     * Get 规则ID(新增时请留空，编辑时候必传) 
     * @return Id 规则ID(新增时请留空，编辑时候必传)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID(新增时请留空，编辑时候必传)
     * @param Id 规则ID(新增时请留空，编辑时候必传)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 漏洞id数组 
     * @return VulVulsIDs 漏洞id数组
     */
    public Long [] getVulVulsIDs() {
        return this.VulVulsIDs;
    }

    /**
     * Set 漏洞id数组
     * @param VulVulsIDs 漏洞id数组
     */
    public void setVulVulsIDs(Long [] VulVulsIDs) {
        this.VulVulsIDs = VulVulsIDs;
    }

    /**
     * Get 自定义请求范围加白正则表达式，选择全部请求范围时候为空，否则不能为空，base64编码 
     * @return URLRegexp 自定义请求范围加白正则表达式，选择全部请求范围时候为空，否则不能为空，base64编码
     */
    public String getURLRegexp() {
        return this.URLRegexp;
    }

    /**
     * Set 自定义请求范围加白正则表达式，选择全部请求范围时候为空，否则不能为空，base64编码
     * @param URLRegexp 自定义请求范围加白正则表达式，选择全部请求范围时候为空，否则不能为空，base64编码
     */
    public void setURLRegexp(String URLRegexp) {
        this.URLRegexp = URLRegexp;
    }

    /**
     * Get 加白方式，0：自定义请求范围加白。1：全部请求加白 
     * @return WhiteType 加白方式，0：自定义请求范围加白。1：全部请求加白
     */
    public Long getWhiteType() {
        return this.WhiteType;
    }

    /**
     * Set 加白方式，0：自定义请求范围加白。1：全部请求加白
     * @param WhiteType 加白方式，0：自定义请求范围加白。1：全部请求加白
     */
    public void setWhiteType(Long WhiteType) {
        this.WhiteType = WhiteType;
    }

    public ModifyRaspRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRaspRulesRequest(ModifyRaspRulesRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.VulVulsIDs != null) {
            this.VulVulsIDs = new Long[source.VulVulsIDs.length];
            for (int i = 0; i < source.VulVulsIDs.length; i++) {
                this.VulVulsIDs[i] = new Long(source.VulVulsIDs[i]);
            }
        }
        if (source.URLRegexp != null) {
            this.URLRegexp = new String(source.URLRegexp);
        }
        if (source.WhiteType != null) {
            this.WhiteType = new Long(source.WhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "VulVulsIDs.", this.VulVulsIDs);
        this.setParamSimple(map, prefix + "URLRegexp", this.URLRegexp);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);

    }
}

