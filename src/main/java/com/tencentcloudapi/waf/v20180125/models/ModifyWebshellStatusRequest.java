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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebshellStatusRequest extends AbstractModel {

    /**
    * 域名webshell状态
    */
    @SerializedName("Webshell")
    @Expose
    private WebshellStatus Webshell;

    /**
     * Get 域名webshell状态 
     * @return Webshell 域名webshell状态
     */
    public WebshellStatus getWebshell() {
        return this.Webshell;
    }

    /**
     * Set 域名webshell状态
     * @param Webshell 域名webshell状态
     */
    public void setWebshell(WebshellStatus Webshell) {
        this.Webshell = Webshell;
    }

    public ModifyWebshellStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebshellStatusRequest(ModifyWebshellStatusRequest source) {
        if (source.Webshell != null) {
            this.Webshell = new WebshellStatus(source.Webshell);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Webshell.", this.Webshell);

    }
}

