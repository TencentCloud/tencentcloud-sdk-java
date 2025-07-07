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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSharedCNAMERequest extends AbstractModel {

    /**
    * 加速域名所属站点 ID。	
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 绑定类型，取值有：
<li>bind：绑定；</li>
<li>unbind：解绑。</li>
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * 接入域名与共享 CNAME 的绑定关系。
    */
    @SerializedName("BindSharedCNAMEMaps")
    @Expose
    private BindSharedCNAMEMap [] BindSharedCNAMEMaps;

    /**
     * Get 加速域名所属站点 ID。	 
     * @return ZoneId 加速域名所属站点 ID。	
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 加速域名所属站点 ID。	
     * @param ZoneId 加速域名所属站点 ID。	
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 绑定类型，取值有：
<li>bind：绑定；</li>
<li>unbind：解绑。</li> 
     * @return BindType 绑定类型，取值有：
<li>bind：绑定；</li>
<li>unbind：解绑。</li>
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型，取值有：
<li>bind：绑定；</li>
<li>unbind：解绑。</li>
     * @param BindType 绑定类型，取值有：
<li>bind：绑定；</li>
<li>unbind：解绑。</li>
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 接入域名与共享 CNAME 的绑定关系。 
     * @return BindSharedCNAMEMaps 接入域名与共享 CNAME 的绑定关系。
     */
    public BindSharedCNAMEMap [] getBindSharedCNAMEMaps() {
        return this.BindSharedCNAMEMaps;
    }

    /**
     * Set 接入域名与共享 CNAME 的绑定关系。
     * @param BindSharedCNAMEMaps 接入域名与共享 CNAME 的绑定关系。
     */
    public void setBindSharedCNAMEMaps(BindSharedCNAMEMap [] BindSharedCNAMEMaps) {
        this.BindSharedCNAMEMaps = BindSharedCNAMEMaps;
    }

    public BindSharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSharedCNAMERequest(BindSharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.BindSharedCNAMEMaps != null) {
            this.BindSharedCNAMEMaps = new BindSharedCNAMEMap[source.BindSharedCNAMEMaps.length];
            for (int i = 0; i < source.BindSharedCNAMEMaps.length; i++) {
                this.BindSharedCNAMEMaps[i] = new BindSharedCNAMEMap(source.BindSharedCNAMEMaps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamArrayObj(map, prefix + "BindSharedCNAMEMaps.", this.BindSharedCNAMEMaps);

    }
}

