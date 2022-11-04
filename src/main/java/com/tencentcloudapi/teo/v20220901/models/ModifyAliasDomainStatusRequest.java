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

public class ModifyAliasDomainStatusRequest extends AbstractModel{

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 别称域名状态，取值有：
<li> false：开启别称域名；</li>
<li> true：关闭别称域名。</li>
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * 待修改状态的别称域名名称。如果为空，则不执行修改状态操作。
    */
    @SerializedName("AliasNames")
    @Expose
    private String [] AliasNames;

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
     * Get 别称域名状态，取值有：
<li> false：开启别称域名；</li>
<li> true：关闭别称域名。</li> 
     * @return Paused 别称域名状态，取值有：
<li> false：开启别称域名；</li>
<li> true：关闭别称域名。</li>
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set 别称域名状态，取值有：
<li> false：开启别称域名；</li>
<li> true：关闭别称域名。</li>
     * @param Paused 别称域名状态，取值有：
<li> false：开启别称域名；</li>
<li> true：关闭别称域名。</li>
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get 待修改状态的别称域名名称。如果为空，则不执行修改状态操作。 
     * @return AliasNames 待修改状态的别称域名名称。如果为空，则不执行修改状态操作。
     */
    public String [] getAliasNames() {
        return this.AliasNames;
    }

    /**
     * Set 待修改状态的别称域名名称。如果为空，则不执行修改状态操作。
     * @param AliasNames 待修改状态的别称域名名称。如果为空，则不执行修改状态操作。
     */
    public void setAliasNames(String [] AliasNames) {
        this.AliasNames = AliasNames;
    }

    public ModifyAliasDomainStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAliasDomainStatusRequest(ModifyAliasDomainStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.AliasNames != null) {
            this.AliasNames = new String[source.AliasNames.length];
            for (int i = 0; i < source.AliasNames.length; i++) {
                this.AliasNames[i] = new String(source.AliasNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamArraySimple(map, prefix + "AliasNames.", this.AliasNames);

    }
}

