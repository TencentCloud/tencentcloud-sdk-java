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

public class SummaryListSwitch extends AbstractModel {

    /**
    * <p>是否显示元数据</p>
    */
    @SerializedName("ShowMetadataEnabled")
    @Expose
    private Boolean ShowMetadataEnabled;

    /**
     * Get <p>是否显示元数据</p> 
     * @return ShowMetadataEnabled <p>是否显示元数据</p>
     */
    public Boolean getShowMetadataEnabled() {
        return this.ShowMetadataEnabled;
    }

    /**
     * Set <p>是否显示元数据</p>
     * @param ShowMetadataEnabled <p>是否显示元数据</p>
     */
    public void setShowMetadataEnabled(Boolean ShowMetadataEnabled) {
        this.ShowMetadataEnabled = ShowMetadataEnabled;
    }

    public SummaryListSwitch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryListSwitch(SummaryListSwitch source) {
        if (source.ShowMetadataEnabled != null) {
            this.ShowMetadataEnabled = new Boolean(source.ShowMetadataEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowMetadataEnabled", this.ShowMetadataEnabled);

    }
}

