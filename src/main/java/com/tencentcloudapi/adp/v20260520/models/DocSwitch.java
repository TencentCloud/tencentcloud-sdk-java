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

public class DocSwitch extends AbstractModel {

    /**
    * <p>是否可下载</p>
    */
    @SerializedName("DownloadEnabled")
    @Expose
    private Boolean DownloadEnabled;

    /**
    * <p>是否在参考来源中展示</p>
    */
    @SerializedName("ReferEnabled")
    @Expose
    private Boolean ReferEnabled;

    /**
     * Get <p>是否可下载</p> 
     * @return DownloadEnabled <p>是否可下载</p>
     */
    public Boolean getDownloadEnabled() {
        return this.DownloadEnabled;
    }

    /**
     * Set <p>是否可下载</p>
     * @param DownloadEnabled <p>是否可下载</p>
     */
    public void setDownloadEnabled(Boolean DownloadEnabled) {
        this.DownloadEnabled = DownloadEnabled;
    }

    /**
     * Get <p>是否在参考来源中展示</p> 
     * @return ReferEnabled <p>是否在参考来源中展示</p>
     */
    public Boolean getReferEnabled() {
        return this.ReferEnabled;
    }

    /**
     * Set <p>是否在参考来源中展示</p>
     * @param ReferEnabled <p>是否在参考来源中展示</p>
     */
    public void setReferEnabled(Boolean ReferEnabled) {
        this.ReferEnabled = ReferEnabled;
    }

    public DocSwitch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocSwitch(DocSwitch source) {
        if (source.DownloadEnabled != null) {
            this.DownloadEnabled = new Boolean(source.DownloadEnabled);
        }
        if (source.ReferEnabled != null) {
            this.ReferEnabled = new Boolean(source.ReferEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadEnabled", this.DownloadEnabled);
        this.setParamSimple(map, prefix + "ReferEnabled", this.ReferEnabled);

    }
}

