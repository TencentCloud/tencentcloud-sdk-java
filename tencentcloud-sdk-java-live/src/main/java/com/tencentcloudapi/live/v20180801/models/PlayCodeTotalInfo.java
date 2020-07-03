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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayCodeTotalInfo extends AbstractModel{

    /**
    * HTTP code，可选值包括:
400，403，404，500，502，503，504。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 总次数。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get HTTP code，可选值包括:
400，403，404，500，502，503，504。 
     * @return Code HTTP code，可选值包括:
400，403，404，500，502，503，504。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set HTTP code，可选值包括:
400，403，404，500，502，503，504。
     * @param Code HTTP code，可选值包括:
400，403，404，500，502，503，504。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 总次数。 
     * @return Num 总次数。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 总次数。
     * @param Num 总次数。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

