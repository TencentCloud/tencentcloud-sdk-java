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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OAuth extends AbstractModel {

    /**
    * 开启或关闭鉴权。
True: 开启;
False: 关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OAuthEnable")
    @Expose
    private Boolean OAuthEnable;

    /**
    * IAP全部故障后，拒绝请求还是放行。BYPASS:通过,
REJECT: 拒绝
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OAuthFailureStatus")
    @Expose
    private String OAuthFailureStatus;

    /**
     * Get 开启或关闭鉴权。
True: 开启;
False: 关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OAuthEnable 开启或关闭鉴权。
True: 开启;
False: 关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOAuthEnable() {
        return this.OAuthEnable;
    }

    /**
     * Set 开启或关闭鉴权。
True: 开启;
False: 关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param OAuthEnable 开启或关闭鉴权。
True: 开启;
False: 关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOAuthEnable(Boolean OAuthEnable) {
        this.OAuthEnable = OAuthEnable;
    }

    /**
     * Get IAP全部故障后，拒绝请求还是放行。BYPASS:通过,
REJECT: 拒绝
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OAuthFailureStatus IAP全部故障后，拒绝请求还是放行。BYPASS:通过,
REJECT: 拒绝
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOAuthFailureStatus() {
        return this.OAuthFailureStatus;
    }

    /**
     * Set IAP全部故障后，拒绝请求还是放行。BYPASS:通过,
REJECT: 拒绝
注意：此字段可能返回 null，表示取不到有效值。
     * @param OAuthFailureStatus IAP全部故障后，拒绝请求还是放行。BYPASS:通过,
REJECT: 拒绝
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOAuthFailureStatus(String OAuthFailureStatus) {
        this.OAuthFailureStatus = OAuthFailureStatus;
    }

    public OAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OAuth(OAuth source) {
        if (source.OAuthEnable != null) {
            this.OAuthEnable = new Boolean(source.OAuthEnable);
        }
        if (source.OAuthFailureStatus != null) {
            this.OAuthFailureStatus = new String(source.OAuthFailureStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OAuthEnable", this.OAuthEnable);
        this.setParamSimple(map, prefix + "OAuthFailureStatus", this.OAuthFailureStatus);

    }
}

