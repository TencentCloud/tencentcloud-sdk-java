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

public class DocExternalLink extends AbstractModel {

    /**
    * <p>外部链接地址</p>
    */
    @SerializedName("ExternalUrl")
    @Expose
    private String ExternalUrl;

    /**
    * <p>是否替换原文展示</p>
    */
    @SerializedName("ReplaceOriginEnabled")
    @Expose
    private Boolean ReplaceOriginEnabled;

    /**
     * Get <p>外部链接地址</p> 
     * @return ExternalUrl <p>外部链接地址</p>
     */
    public String getExternalUrl() {
        return this.ExternalUrl;
    }

    /**
     * Set <p>外部链接地址</p>
     * @param ExternalUrl <p>外部链接地址</p>
     */
    public void setExternalUrl(String ExternalUrl) {
        this.ExternalUrl = ExternalUrl;
    }

    /**
     * Get <p>是否替换原文展示</p> 
     * @return ReplaceOriginEnabled <p>是否替换原文展示</p>
     */
    public Boolean getReplaceOriginEnabled() {
        return this.ReplaceOriginEnabled;
    }

    /**
     * Set <p>是否替换原文展示</p>
     * @param ReplaceOriginEnabled <p>是否替换原文展示</p>
     */
    public void setReplaceOriginEnabled(Boolean ReplaceOriginEnabled) {
        this.ReplaceOriginEnabled = ReplaceOriginEnabled;
    }

    public DocExternalLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocExternalLink(DocExternalLink source) {
        if (source.ExternalUrl != null) {
            this.ExternalUrl = new String(source.ExternalUrl);
        }
        if (source.ReplaceOriginEnabled != null) {
            this.ReplaceOriginEnabled = new Boolean(source.ReplaceOriginEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalUrl", this.ExternalUrl);
        this.setParamSimple(map, prefix + "ReplaceOriginEnabled", this.ReplaceOriginEnabled);

    }
}

