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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManifestInfo extends AbstractModel {

    /**
    * <p>单位秒。</p>
    */
    @SerializedName("Windows")
    @Expose
    private Long Windows;

    /**
    * <p>打到output广告标签的格式，可选Date Range、Enhanced SCTE-35和Standard SCTE-35。</p>
    */
    @SerializedName("AdMarkupType")
    @Expose
    private String AdMarkupType;

    /**
     * Get <p>单位秒。</p> 
     * @return Windows <p>单位秒。</p>
     */
    public Long getWindows() {
        return this.Windows;
    }

    /**
     * Set <p>单位秒。</p>
     * @param Windows <p>单位秒。</p>
     */
    public void setWindows(Long Windows) {
        this.Windows = Windows;
    }

    /**
     * Get <p>打到output广告标签的格式，可选Date Range、Enhanced SCTE-35和Standard SCTE-35。</p> 
     * @return AdMarkupType <p>打到output广告标签的格式，可选Date Range、Enhanced SCTE-35和Standard SCTE-35。</p>
     */
    public String getAdMarkupType() {
        return this.AdMarkupType;
    }

    /**
     * Set <p>打到output广告标签的格式，可选Date Range、Enhanced SCTE-35和Standard SCTE-35。</p>
     * @param AdMarkupType <p>打到output广告标签的格式，可选Date Range、Enhanced SCTE-35和Standard SCTE-35。</p>
     */
    public void setAdMarkupType(String AdMarkupType) {
        this.AdMarkupType = AdMarkupType;
    }

    public ManifestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManifestInfo(ManifestInfo source) {
        if (source.Windows != null) {
            this.Windows = new Long(source.Windows);
        }
        if (source.AdMarkupType != null) {
            this.AdMarkupType = new String(source.AdMarkupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Windows", this.Windows);
        this.setParamSimple(map, prefix + "AdMarkupType", this.AdMarkupType);

    }
}

