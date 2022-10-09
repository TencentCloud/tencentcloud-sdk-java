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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAliasDomainRequest extends AbstractModel{

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 别称域名 ID。
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 目标域名名称。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 证书配置，取值有：
<li> none：不配置；</li>
<li> hosting：SSL托管证书；</li>
<li> apply：申请免费证书。</li>
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 选择托管证书时填入相应证书 ID。
    */
    @SerializedName("CertId")
    @Expose
    private String [] CertId;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 别称域名 ID。 
     * @return AliasId 别称域名 ID。
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 别称域名 ID。
     * @param AliasId 别称域名 ID。
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 目标域名名称。 
     * @return TargetName 目标域名名称。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 目标域名名称。
     * @param TargetName 目标域名名称。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 证书配置，取值有：
<li> none：不配置；</li>
<li> hosting：SSL托管证书；</li>
<li> apply：申请免费证书。</li> 
     * @return CertType 证书配置，取值有：
<li> none：不配置；</li>
<li> hosting：SSL托管证书；</li>
<li> apply：申请免费证书。</li>
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书配置，取值有：
<li> none：不配置；</li>
<li> hosting：SSL托管证书；</li>
<li> apply：申请免费证书。</li>
     * @param CertType 证书配置，取值有：
<li> none：不配置；</li>
<li> hosting：SSL托管证书；</li>
<li> apply：申请免费证书。</li>
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 选择托管证书时填入相应证书 ID。 
     * @return CertId 选择托管证书时填入相应证书 ID。
     */
    public String [] getCertId() {
        return this.CertId;
    }

    /**
     * Set 选择托管证书时填入相应证书 ID。
     * @param CertId 选择托管证书时填入相应证书 ID。
     */
    public void setCertId(String [] CertId) {
        this.CertId = CertId;
    }

    public ModifyAliasDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAliasDomainRequest(ModifyAliasDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.CertId != null) {
            this.CertId = new String[source.CertId.length];
            for (int i = 0; i < source.CertId.length; i++) {
                this.CertId[i] = new String(source.CertId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamArraySimple(map, prefix + "CertId.", this.CertId);

    }
}

