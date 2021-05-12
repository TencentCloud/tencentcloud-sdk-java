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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewriteLocationMap extends AbstractModel{

    /**
    * 源转发规则ID
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * 重定向至的目标转发规则ID
    */
    @SerializedName("TargetLocationId")
    @Expose
    private String TargetLocationId;

    /**
    * 重定向状态码，可取值301,302,307
    */
    @SerializedName("RewriteCode")
    @Expose
    private Long RewriteCode;

    /**
    * 重定向是否携带匹配的url，配置RewriteCode时必填
    */
    @SerializedName("TakeUrl")
    @Expose
    private Boolean TakeUrl;

    /**
    * 源转发的域名，必须是SourceLocationId对应的域名，配置RewriteCode时必填
    */
    @SerializedName("SourceDomain")
    @Expose
    private String SourceDomain;

    /**
     * Get 源转发规则ID 
     * @return SourceLocationId 源转发规则ID
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set 源转发规则ID
     * @param SourceLocationId 源转发规则ID
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get 重定向至的目标转发规则ID 
     * @return TargetLocationId 重定向至的目标转发规则ID
     */
    public String getTargetLocationId() {
        return this.TargetLocationId;
    }

    /**
     * Set 重定向至的目标转发规则ID
     * @param TargetLocationId 重定向至的目标转发规则ID
     */
    public void setTargetLocationId(String TargetLocationId) {
        this.TargetLocationId = TargetLocationId;
    }

    /**
     * Get 重定向状态码，可取值301,302,307 
     * @return RewriteCode 重定向状态码，可取值301,302,307
     */
    public Long getRewriteCode() {
        return this.RewriteCode;
    }

    /**
     * Set 重定向状态码，可取值301,302,307
     * @param RewriteCode 重定向状态码，可取值301,302,307
     */
    public void setRewriteCode(Long RewriteCode) {
        this.RewriteCode = RewriteCode;
    }

    /**
     * Get 重定向是否携带匹配的url，配置RewriteCode时必填 
     * @return TakeUrl 重定向是否携带匹配的url，配置RewriteCode时必填
     */
    public Boolean getTakeUrl() {
        return this.TakeUrl;
    }

    /**
     * Set 重定向是否携带匹配的url，配置RewriteCode时必填
     * @param TakeUrl 重定向是否携带匹配的url，配置RewriteCode时必填
     */
    public void setTakeUrl(Boolean TakeUrl) {
        this.TakeUrl = TakeUrl;
    }

    /**
     * Get 源转发的域名，必须是SourceLocationId对应的域名，配置RewriteCode时必填 
     * @return SourceDomain 源转发的域名，必须是SourceLocationId对应的域名，配置RewriteCode时必填
     */
    public String getSourceDomain() {
        return this.SourceDomain;
    }

    /**
     * Set 源转发的域名，必须是SourceLocationId对应的域名，配置RewriteCode时必填
     * @param SourceDomain 源转发的域名，必须是SourceLocationId对应的域名，配置RewriteCode时必填
     */
    public void setSourceDomain(String SourceDomain) {
        this.SourceDomain = SourceDomain;
    }

    public RewriteLocationMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteLocationMap(RewriteLocationMap source) {
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.TargetLocationId != null) {
            this.TargetLocationId = new String(source.TargetLocationId);
        }
        if (source.RewriteCode != null) {
            this.RewriteCode = new Long(source.RewriteCode);
        }
        if (source.TakeUrl != null) {
            this.TakeUrl = new Boolean(source.TakeUrl);
        }
        if (source.SourceDomain != null) {
            this.SourceDomain = new String(source.SourceDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "TargetLocationId", this.TargetLocationId);
        this.setParamSimple(map, prefix + "RewriteCode", this.RewriteCode);
        this.setParamSimple(map, prefix + "TakeUrl", this.TakeUrl);
        this.setParamSimple(map, prefix + "SourceDomain", this.SourceDomain);

    }
}

