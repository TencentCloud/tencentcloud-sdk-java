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

public class FieldWriteConfig extends AbstractModel {

    /**
    * 1:开启 0:不开启
    */
    @SerializedName("EnableHeaders")
    @Expose
    private Long EnableHeaders;

    /**
    * 1:开启 0:不开启
    */
    @SerializedName("EnableBody")
    @Expose
    private Long EnableBody;

    /**
    * 1:开启 0:不开启
    */
    @SerializedName("EnableBot")
    @Expose
    private Long EnableBot;

    /**
     * Get 1:开启 0:不开启 
     * @return EnableHeaders 1:开启 0:不开启
     */
    public Long getEnableHeaders() {
        return this.EnableHeaders;
    }

    /**
     * Set 1:开启 0:不开启
     * @param EnableHeaders 1:开启 0:不开启
     */
    public void setEnableHeaders(Long EnableHeaders) {
        this.EnableHeaders = EnableHeaders;
    }

    /**
     * Get 1:开启 0:不开启 
     * @return EnableBody 1:开启 0:不开启
     */
    public Long getEnableBody() {
        return this.EnableBody;
    }

    /**
     * Set 1:开启 0:不开启
     * @param EnableBody 1:开启 0:不开启
     */
    public void setEnableBody(Long EnableBody) {
        this.EnableBody = EnableBody;
    }

    /**
     * Get 1:开启 0:不开启 
     * @return EnableBot 1:开启 0:不开启
     */
    public Long getEnableBot() {
        return this.EnableBot;
    }

    /**
     * Set 1:开启 0:不开启
     * @param EnableBot 1:开启 0:不开启
     */
    public void setEnableBot(Long EnableBot) {
        this.EnableBot = EnableBot;
    }

    public FieldWriteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldWriteConfig(FieldWriteConfig source) {
        if (source.EnableHeaders != null) {
            this.EnableHeaders = new Long(source.EnableHeaders);
        }
        if (source.EnableBody != null) {
            this.EnableBody = new Long(source.EnableBody);
        }
        if (source.EnableBot != null) {
            this.EnableBot = new Long(source.EnableBot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableHeaders", this.EnableHeaders);
        this.setParamSimple(map, prefix + "EnableBody", this.EnableBody);
        this.setParamSimple(map, prefix + "EnableBot", this.EnableBot);

    }
}

