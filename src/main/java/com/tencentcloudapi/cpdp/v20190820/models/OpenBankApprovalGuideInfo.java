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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankApprovalGuideInfo extends AbstractModel{

    /**
    * PC网银指引
    */
    @SerializedName("PcGuideUrl")
    @Expose
    private String PcGuideUrl;

    /**
    * 手机网银指引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MobileGuideUrl")
    @Expose
    private String MobileGuideUrl;

    /**
     * Get PC网银指引 
     * @return PcGuideUrl PC网银指引
     */
    public String getPcGuideUrl() {
        return this.PcGuideUrl;
    }

    /**
     * Set PC网银指引
     * @param PcGuideUrl PC网银指引
     */
    public void setPcGuideUrl(String PcGuideUrl) {
        this.PcGuideUrl = PcGuideUrl;
    }

    /**
     * Get 手机网银指引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MobileGuideUrl 手机网银指引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMobileGuideUrl() {
        return this.MobileGuideUrl;
    }

    /**
     * Set 手机网银指引
注意：此字段可能返回 null，表示取不到有效值。
     * @param MobileGuideUrl 手机网银指引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobileGuideUrl(String MobileGuideUrl) {
        this.MobileGuideUrl = MobileGuideUrl;
    }

    public OpenBankApprovalGuideInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankApprovalGuideInfo(OpenBankApprovalGuideInfo source) {
        if (source.PcGuideUrl != null) {
            this.PcGuideUrl = new String(source.PcGuideUrl);
        }
        if (source.MobileGuideUrl != null) {
            this.MobileGuideUrl = new String(source.MobileGuideUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PcGuideUrl", this.PcGuideUrl);
        this.setParamSimple(map, prefix + "MobileGuideUrl", this.MobileGuideUrl);

    }
}

