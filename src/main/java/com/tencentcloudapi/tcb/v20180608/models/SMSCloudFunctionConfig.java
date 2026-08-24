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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SMSCloudFunctionConfig extends AbstractModel {

    /**
    * <p>发送验证码的云函数名，当前仅支持 SendVerificationCode。</p><p>函数入参：</p><ul><li>Mobile：字符串（手机号，连续 E.164 格式，如 +8613800000000）</li><li>VerificationCode：字符串（验证码，如 123456）</li></ul><p>函数返回值：</p><ul><li>ErrorCode：int（0 表示成功，非 0 表示失败）</li><li>ErrorMessage：字符串（ErrorCode 非 0 时返回错误信息）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
     * Get <p>发送验证码的云函数名，当前仅支持 SendVerificationCode。</p><p>函数入参：</p><ul><li>Mobile：字符串（手机号，连续 E.164 格式，如 +8613800000000）</li><li>VerificationCode：字符串（验证码，如 123456）</li></ul><p>函数返回值：</p><ul><li>ErrorCode：int（0 表示成功，非 0 表示失败）</li><li>ErrorMessage：字符串（ErrorCode 非 0 时返回错误信息）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunctionName <p>发送验证码的云函数名，当前仅支持 SendVerificationCode。</p><p>函数入参：</p><ul><li>Mobile：字符串（手机号，连续 E.164 格式，如 +8613800000000）</li><li>VerificationCode：字符串（验证码，如 123456）</li></ul><p>函数返回值：</p><ul><li>ErrorCode：int（0 表示成功，非 0 表示失败）</li><li>ErrorMessage：字符串（ErrorCode 非 0 时返回错误信息）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>发送验证码的云函数名，当前仅支持 SendVerificationCode。</p><p>函数入参：</p><ul><li>Mobile：字符串（手机号，连续 E.164 格式，如 +8613800000000）</li><li>VerificationCode：字符串（验证码，如 123456）</li></ul><p>函数返回值：</p><ul><li>ErrorCode：int（0 表示成功，非 0 表示失败）</li><li>ErrorMessage：字符串（ErrorCode 非 0 时返回错误信息）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunctionName <p>发送验证码的云函数名，当前仅支持 SendVerificationCode。</p><p>函数入参：</p><ul><li>Mobile：字符串（手机号，连续 E.164 格式，如 +8613800000000）</li><li>VerificationCode：字符串（验证码，如 123456）</li></ul><p>函数返回值：</p><ul><li>ErrorCode：int（0 表示成功，非 0 表示失败）</li><li>ErrorMessage：字符串（ErrorCode 非 0 时返回错误信息）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    public SMSCloudFunctionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SMSCloudFunctionConfig(SMSCloudFunctionConfig source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);

    }
}

