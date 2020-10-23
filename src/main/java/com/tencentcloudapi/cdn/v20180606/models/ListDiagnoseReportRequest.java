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

public class ListDiagnoseReportRequest extends AbstractModel{

    /**
    * 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
    */
    @SerializedName("KeyWords")
    @Expose
    private String KeyWords;

    /**
     * Get 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。 
     * @return KeyWords 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
     */
    public String getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
     * @param KeyWords 用于搜索诊断URL的关键字，不填时返回用户所有的诊断任务。
     */
    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWords", this.KeyWords);

    }
}

