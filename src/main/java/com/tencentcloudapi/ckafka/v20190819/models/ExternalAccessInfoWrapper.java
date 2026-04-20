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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalAccessInfoWrapper extends AbstractModel {

    /**
    * <p>IP白名单放通规则数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>IP白名单</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private IpWhitelistDTO [] IpWhitelist;

    /**
     * Get <p>IP白名单放通规则数</p> 
     * @return TotalCount <p>IP白名单放通规则数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>IP白名单放通规则数</p>
     * @param TotalCount <p>IP白名单放通规则数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>IP白名单</p> 
     * @return IpWhitelist <p>IP白名单</p>
     */
    public IpWhitelistDTO [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP白名单</p>
     * @param IpWhitelist <p>IP白名单</p>
     */
    public void setIpWhitelist(IpWhitelistDTO [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    public ExternalAccessInfoWrapper() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalAccessInfoWrapper(ExternalAccessInfoWrapper source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new IpWhitelistDTO[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new IpWhitelistDTO(source.IpWhitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "IpWhitelist.", this.IpWhitelist);

    }
}

