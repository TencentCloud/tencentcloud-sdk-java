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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppGreetingConfig extends AbstractModel {

    /**
    * <p>欢迎语内容</p>
    */
    @SerializedName("Greeting")
    @Expose
    private String Greeting;

    /**
    * <p>开场问题列表</p>
    */
    @SerializedName("OpeningQuestionList")
    @Expose
    private String [] OpeningQuestionList;

    /**
     * Get <p>欢迎语内容</p> 
     * @return Greeting <p>欢迎语内容</p>
     */
    public String getGreeting() {
        return this.Greeting;
    }

    /**
     * Set <p>欢迎语内容</p>
     * @param Greeting <p>欢迎语内容</p>
     */
    public void setGreeting(String Greeting) {
        this.Greeting = Greeting;
    }

    /**
     * Get <p>开场问题列表</p> 
     * @return OpeningQuestionList <p>开场问题列表</p>
     */
    public String [] getOpeningQuestionList() {
        return this.OpeningQuestionList;
    }

    /**
     * Set <p>开场问题列表</p>
     * @param OpeningQuestionList <p>开场问题列表</p>
     */
    public void setOpeningQuestionList(String [] OpeningQuestionList) {
        this.OpeningQuestionList = OpeningQuestionList;
    }

    public AppGreetingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppGreetingConfig(AppGreetingConfig source) {
        if (source.Greeting != null) {
            this.Greeting = new String(source.Greeting);
        }
        if (source.OpeningQuestionList != null) {
            this.OpeningQuestionList = new String[source.OpeningQuestionList.length];
            for (int i = 0; i < source.OpeningQuestionList.length; i++) {
                this.OpeningQuestionList[i] = new String(source.OpeningQuestionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Greeting", this.Greeting);
        this.setParamArraySimple(map, prefix + "OpeningQuestionList.", this.OpeningQuestionList);

    }
}

