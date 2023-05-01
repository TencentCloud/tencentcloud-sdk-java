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

public class QueryFlexWechatAuthResultRequest extends AbstractModel{

    /**
    * 商户核身单号
    */
    @SerializedName("AuthNo")
    @Expose
    private String AuthNo;

    /**
    * 环境类型
test 测试
release 生产
sandbox 沙箱
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 商户核身单号 
     * @return AuthNo 商户核身单号
     */
    public String getAuthNo() {
        return this.AuthNo;
    }

    /**
     * Set 商户核身单号
     * @param AuthNo 商户核身单号
     */
    public void setAuthNo(String AuthNo) {
        this.AuthNo = AuthNo;
    }

    /**
     * Get 环境类型
test 测试
release 生产
sandbox 沙箱 
     * @return Environment 环境类型
test 测试
release 生产
sandbox 沙箱
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
test 测试
release 生产
sandbox 沙箱
     * @param Environment 环境类型
test 测试
release 生产
sandbox 沙箱
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryFlexWechatAuthResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexWechatAuthResultRequest(QueryFlexWechatAuthResultRequest source) {
        if (source.AuthNo != null) {
            this.AuthNo = new String(source.AuthNo);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthNo", this.AuthNo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

