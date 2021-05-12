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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaTicketDataResponse extends AbstractModel{

    /**
    * 成功返回 0 其它失败
    */
    @SerializedName("CaptchaCode")
    @Expose
    private Long CaptchaCode;

    /**
    * 返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaptchaMsg")
    @Expose
    private String CaptchaMsg;

    /**
    * 验证码票据信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private CaptchaTicketDataRes Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功返回 0 其它失败 
     * @return CaptchaCode 成功返回 0 其它失败
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set 成功返回 0 其它失败
     * @param CaptchaCode 成功返回 0 其它失败
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * Get 返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaptchaMsg 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaptchaMsg 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * Get 验证码票据信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 验证码票据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CaptchaTicketDataRes getData() {
        return this.Data;
    }

    /**
     * Set 验证码票据信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 验证码票据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(CaptchaTicketDataRes Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCaptchaTicketDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaTicketDataResponse(DescribeCaptchaTicketDataResponse source) {
        if (source.CaptchaCode != null) {
            this.CaptchaCode = new Long(source.CaptchaCode);
        }
        if (source.CaptchaMsg != null) {
            this.CaptchaMsg = new String(source.CaptchaMsg);
        }
        if (source.Data != null) {
            this.Data = new CaptchaTicketDataRes(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaCode", this.CaptchaCode);
        this.setParamSimple(map, prefix + "CaptchaMsg", this.CaptchaMsg);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

