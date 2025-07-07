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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputManageMarketingRisk extends AbstractModel {

    /**
    * 错误码，0 表示成功，非0表示失败错误码。
0：成功
1：错误
1002：参数错误
4300：未开通服务
4301：后端未创建对应产品
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * UTF-8编码，出错消息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 业务详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private OutputManageMarketingRiskValue Value;

    /**
    * 控制台显示的req_id。
    */
    @SerializedName("UUid")
    @Expose
    private String UUid;

    /**
     * Get 错误码，0 表示成功，非0表示失败错误码。
0：成功
1：错误
1002：参数错误
4300：未开通服务
4301：后端未创建对应产品 
     * @return Code 错误码，0 表示成功，非0表示失败错误码。
0：成功
1：错误
1002：参数错误
4300：未开通服务
4301：后端未创建对应产品
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码，0 表示成功，非0表示失败错误码。
0：成功
1：错误
1002：参数错误
4300：未开通服务
4301：后端未创建对应产品
     * @param Code 错误码，0 表示成功，非0表示失败错误码。
0：成功
1：错误
1002：参数错误
4300：未开通服务
4301：后端未创建对应产品
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get UTF-8编码，出错消息。 
     * @return Message UTF-8编码，出错消息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set UTF-8编码，出错消息。
     * @param Message UTF-8编码，出错消息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 业务详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 业务详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputManageMarketingRiskValue getValue() {
        return this.Value;
    }

    /**
     * Set 业务详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 业务详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(OutputManageMarketingRiskValue Value) {
        this.Value = Value;
    }

    /**
     * Get 控制台显示的req_id。 
     * @return UUid 控制台显示的req_id。
     */
    public String getUUid() {
        return this.UUid;
    }

    /**
     * Set 控制台显示的req_id。
     * @param UUid 控制台显示的req_id。
     */
    public void setUUid(String UUid) {
        this.UUid = UUid;
    }

    public OutputManageMarketingRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputManageMarketingRisk(OutputManageMarketingRisk source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Value != null) {
            this.Value = new OutputManageMarketingRiskValue(source.Value);
        }
        if (source.UUid != null) {
            this.UUid = new String(source.UUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "UUid", this.UUid);

    }
}

