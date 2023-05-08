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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverUrlInfo extends AbstractModel{

    /**
    * 签署链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignUrl")
    @Expose
    private String SignUrl;

    /**
    * 签署人类型 1-个人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 签署人手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 签署长链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongUrl")
    @Expose
    private String LongUrl;

    /**
     * Get 签署链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignUrl 签署链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignUrl() {
        return this.SignUrl;
    }

    /**
     * Set 签署链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignUrl 签署链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignUrl(String SignUrl) {
        this.SignUrl = SignUrl;
    }

    /**
     * Get 签署人类型 1-个人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverType 签署人类型 1-个人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型 1-个人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverType 签署人类型 1-个人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverName 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverName 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 签署人手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverMobile 签署人手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 签署人手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverMobile 签署人手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 签署长链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongUrl 签署长链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongUrl() {
        return this.LongUrl;
    }

    /**
     * Set 签署长链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongUrl 签署长链接。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongUrl(String LongUrl) {
        this.LongUrl = LongUrl;
    }

    public FlowApproverUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverUrlInfo(FlowApproverUrlInfo source) {
        if (source.SignUrl != null) {
            this.SignUrl = new String(source.SignUrl);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new Long(source.ApproverType);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.LongUrl != null) {
            this.LongUrl = new String(source.LongUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignUrl", this.SignUrl);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "LongUrl", this.LongUrl);

    }
}

