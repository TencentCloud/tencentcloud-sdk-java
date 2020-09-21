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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseCodeRepoDetail extends AbstractModel{

    /**
    * repo的名字
    */
    @SerializedName("Name")
    @Expose
    private CloudBaseCodeRepoName Name;

    /**
    * repo的url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get repo的名字 
     * @return Name repo的名字
     */
    public CloudBaseCodeRepoName getName() {
        return this.Name;
    }

    /**
     * Set repo的名字
     * @param Name repo的名字
     */
    public void setName(CloudBaseCodeRepoName Name) {
        this.Name = Name;
    }

    /**
     * Get repo的url 
     * @return Url repo的url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set repo的url
     * @param Url repo的url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

