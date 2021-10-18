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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDiagnoseUrlRequest extends AbstractModel{

    /**
    * 需诊断的url，形如：http://www.test.com/test.txt。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 请求源带协议头，形如：https://console.cloud.tencent.com
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
     * Get 需诊断的url，形如：http://www.test.com/test.txt。 
     * @return Url 需诊断的url，形如：http://www.test.com/test.txt。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 需诊断的url，形如：http://www.test.com/test.txt。
     * @param Url 需诊断的url，形如：http://www.test.com/test.txt。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 请求源带协议头，形如：https://console.cloud.tencent.com 
     * @return Origin 请求源带协议头，形如：https://console.cloud.tencent.com
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 请求源带协议头，形如：https://console.cloud.tencent.com
     * @param Origin 请求源带协议头，形如：https://console.cloud.tencent.com
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public CreateDiagnoseUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDiagnoseUrlRequest(CreateDiagnoseUrlRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Origin", this.Origin);

    }
}

