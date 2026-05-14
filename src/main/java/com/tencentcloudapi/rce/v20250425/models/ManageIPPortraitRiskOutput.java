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
package com.tencentcloudapi.rce.v20250425.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageIPPortraitRiskOutput extends AbstractModel {

    /**
    * <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>6000：系统内部错误</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>返回消息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>结果</p>
    */
    @SerializedName("Value")
    @Expose
    private ManageIPPortraitRiskValueOutput Value;

    /**
     * Get <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>6000：系统内部错误</p> 
     * @return Code <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>6000：系统内部错误</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>6000：系统内部错误</p>
     * @param Code <p>错误码，0 表示成功，非0表示失败错误码。<br>0：成功<br>1002：参数错误<br>6000：系统内部错误</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>返回消息</p> 
     * @return Message <p>返回消息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>返回消息</p>
     * @param Message <p>返回消息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>结果</p> 
     * @return Value <p>结果</p>
     */
    public ManageIPPortraitRiskValueOutput getValue() {
        return this.Value;
    }

    /**
     * Set <p>结果</p>
     * @param Value <p>结果</p>
     */
    public void setValue(ManageIPPortraitRiskValueOutput Value) {
        this.Value = Value;
    }

    public ManageIPPortraitRiskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageIPPortraitRiskOutput(ManageIPPortraitRiskOutput source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Value != null) {
            this.Value = new ManageIPPortraitRiskValueOutput(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

