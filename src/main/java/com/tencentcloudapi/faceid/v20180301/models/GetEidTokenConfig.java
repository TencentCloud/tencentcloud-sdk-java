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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEidTokenConfig extends AbstractModel{

    /**
    * 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
     * Get 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名 
     * @return InputType 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
     * @param InputType 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    public GetEidTokenConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEidTokenConfig(GetEidTokenConfig source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);

    }
}

