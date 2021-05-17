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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Detail extends AbstractModel{

    /**
    * 企业四要素核验结果状态码
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 企业四要素核验结果描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 企业四要素核验结果状态码 
     * @return Result 企业四要素核验结果状态码
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 企业四要素核验结果状态码
     * @param Result 企业四要素核验结果状态码
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 企业四要素核验结果描述 
     * @return Desc 企业四要素核验结果描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 企业四要素核验结果描述
     * @param Desc 企业四要素核验结果描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Detail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Detail(Detail source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

