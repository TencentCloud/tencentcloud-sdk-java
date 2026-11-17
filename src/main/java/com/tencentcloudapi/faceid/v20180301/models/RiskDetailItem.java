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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetailItem extends AbstractModel {

    /**
    * <p>风险项类型</p><p>枚举值：</p><ul><li>IpLocationMismatch： 上报坐标所在国家/地区与 IP 归属国家/地区不一致</li><li>AbnormalLocationChange： 同一人员短时间内发生物理上不可能的位移    </li><li>BlacklistHit： 命中客户自建人脸黑名单</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>风险项类型</p><p>枚举值：</p><ul><li>IpLocationMismatch： 上报坐标所在国家/地区与 IP 归属国家/地区不一致</li><li>AbnormalLocationChange： 同一人员短时间内发生物理上不可能的位移    </li><li>BlacklistHit： 命中客户自建人脸黑名单</li></ul> 
     * @return Type <p>风险项类型</p><p>枚举值：</p><ul><li>IpLocationMismatch： 上报坐标所在国家/地区与 IP 归属国家/地区不一致</li><li>AbnormalLocationChange： 同一人员短时间内发生物理上不可能的位移    </li><li>BlacklistHit： 命中客户自建人脸黑名单</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>风险项类型</p><p>枚举值：</p><ul><li>IpLocationMismatch： 上报坐标所在国家/地区与 IP 归属国家/地区不一致</li><li>AbnormalLocationChange： 同一人员短时间内发生物理上不可能的位移    </li><li>BlacklistHit： 命中客户自建人脸黑名单</li></ul>
     * @param Type <p>风险项类型</p><p>枚举值：</p><ul><li>IpLocationMismatch： 上报坐标所在国家/地区与 IP 归属国家/地区不一致</li><li>AbnormalLocationChange： 同一人员短时间内发生物理上不可能的位移    </li><li>BlacklistHit： 命中客户自建人脸黑名单</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RiskDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetailItem(RiskDetailItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

