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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterItem extends AbstractModel {

    /**
    * 筛选内容。
例如筛选审核状态可以使用"AuditStatus"
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * 筛选条件。
例如对于筛选内容"AuditStatus"，可使用筛选条件:
"ContentFailed":"内容审核失败",
"PictureFailed":"图片审核失败",
"ContentAndPictureFailed":"图片和内容审核失败",
    */
    @SerializedName("FilterValue")
    @Expose
    private String [] FilterValue;

    /**
     * Get 筛选内容。
例如筛选审核状态可以使用"AuditStatus" 
     * @return FilterKey 筛选内容。
例如筛选审核状态可以使用"AuditStatus"
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set 筛选内容。
例如筛选审核状态可以使用"AuditStatus"
     * @param FilterKey 筛选内容。
例如筛选审核状态可以使用"AuditStatus"
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get 筛选条件。
例如对于筛选内容"AuditStatus"，可使用筛选条件:
"ContentFailed":"内容审核失败",
"PictureFailed":"图片审核失败",
"ContentAndPictureFailed":"图片和内容审核失败", 
     * @return FilterValue 筛选条件。
例如对于筛选内容"AuditStatus"，可使用筛选条件:
"ContentFailed":"内容审核失败",
"PictureFailed":"图片审核失败",
"ContentAndPictureFailed":"图片和内容审核失败",
     */
    public String [] getFilterValue() {
        return this.FilterValue;
    }

    /**
     * Set 筛选条件。
例如对于筛选内容"AuditStatus"，可使用筛选条件:
"ContentFailed":"内容审核失败",
"PictureFailed":"图片审核失败",
"ContentAndPictureFailed":"图片和内容审核失败",
     * @param FilterValue 筛选条件。
例如对于筛选内容"AuditStatus"，可使用筛选条件:
"ContentFailed":"内容审核失败",
"PictureFailed":"图片审核失败",
"ContentAndPictureFailed":"图片和内容审核失败",
     */
    public void setFilterValue(String [] FilterValue) {
        this.FilterValue = FilterValue;
    }

    public FilterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterItem(FilterItem source) {
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.FilterValue != null) {
            this.FilterValue = new String[source.FilterValue.length];
            for (int i = 0; i < source.FilterValue.length; i++) {
                this.FilterValue[i] = new String(source.FilterValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamArraySimple(map, prefix + "FilterValue.", this.FilterValue);

    }
}

