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
    * <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>4300：未开通服务<br>4301：后端未创建对应产品<br>6000：系统内部错误</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>UTF-8编码，出错消息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>业务详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private OutputManageMarketingRiskValue Value;

    /**
    * <p>控制台显示的req_id。</p>
    */
    @SerializedName("UUid")
    @Expose
    private String UUid;

    /**
     * Get <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>4300：未开通服务<br>4301：后端未创建对应产品<br>6000：系统内部错误</p> 
     * @return Code <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>4300：未开通服务<br>4301：后端未创建对应产品<br>6000：系统内部错误</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>4300：未开通服务<br>4301：后端未创建对应产品<br>6000：系统内部错误</p>
     * @param Code <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>4300：未开通服务<br>4301：后端未创建对应产品<br>6000：系统内部错误</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>UTF-8编码，出错消息。</p> 
     * @return Message <p>UTF-8编码，出错消息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>UTF-8编码，出错消息。</p>
     * @param Message <p>UTF-8编码，出错消息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>业务详情。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>业务详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputManageMarketingRiskValue getValue() {
        return this.Value;
    }

    /**
     * Set <p>业务详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>业务详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(OutputManageMarketingRiskValue Value) {
        this.Value = Value;
    }

    /**
     * Get <p>控制台显示的req_id。</p> 
     * @return UUid <p>控制台显示的req_id。</p>
     */
    public String getUUid() {
        return this.UUid;
    }

    /**
     * Set <p>控制台显示的req_id。</p>
     * @param UUid <p>控制台显示的req_id。</p>
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

