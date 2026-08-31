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

public class ViewImage extends AbstractModel {

    /**
    * <p>视角类型</p><p>枚举值：</p><ul><li>front： 正视图 （必填）</li><li>back： 背视图</li><li>left： 左视图</li><li>right： 右视图</li><li>top： 顶视图</li><li>bottom： 底视图</li><li>left_front： 左前 45°</li><li>right_front： 右前 45°</li></ul><p>MultiViewImages 数组长度 ≥ 2 ; 必须包含 front 视角;  同一 ViewType 不允许重复; 每项必须提供 ViewImageUrl</p>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>图片 URL（http / https）</p>
    */
    @SerializedName("ViewImageUrl")
    @Expose
    private String ViewImageUrl;

    /**
     * Get <p>视角类型</p><p>枚举值：</p><ul><li>front： 正视图 （必填）</li><li>back： 背视图</li><li>left： 左视图</li><li>right： 右视图</li><li>top： 顶视图</li><li>bottom： 底视图</li><li>left_front： 左前 45°</li><li>right_front： 右前 45°</li></ul><p>MultiViewImages 数组长度 ≥ 2 ; 必须包含 front 视角;  同一 ViewType 不允许重复; 每项必须提供 ViewImageUrl</p> 
     * @return ViewType <p>视角类型</p><p>枚举值：</p><ul><li>front： 正视图 （必填）</li><li>back： 背视图</li><li>left： 左视图</li><li>right： 右视图</li><li>top： 顶视图</li><li>bottom： 底视图</li><li>left_front： 左前 45°</li><li>right_front： 右前 45°</li></ul><p>MultiViewImages 数组长度 ≥ 2 ; 必须包含 front 视角;  同一 ViewType 不允许重复; 每项必须提供 ViewImageUrl</p>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>视角类型</p><p>枚举值：</p><ul><li>front： 正视图 （必填）</li><li>back： 背视图</li><li>left： 左视图</li><li>right： 右视图</li><li>top： 顶视图</li><li>bottom： 底视图</li><li>left_front： 左前 45°</li><li>right_front： 右前 45°</li></ul><p>MultiViewImages 数组长度 ≥ 2 ; 必须包含 front 视角;  同一 ViewType 不允许重复; 每项必须提供 ViewImageUrl</p>
     * @param ViewType <p>视角类型</p><p>枚举值：</p><ul><li>front： 正视图 （必填）</li><li>back： 背视图</li><li>left： 左视图</li><li>right： 右视图</li><li>top： 顶视图</li><li>bottom： 底视图</li><li>left_front： 左前 45°</li><li>right_front： 右前 45°</li></ul><p>MultiViewImages 数组长度 ≥ 2 ; 必须包含 front 视角;  同一 ViewType 不允许重复; 每项必须提供 ViewImageUrl</p>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>图片 URL（http / https）</p> 
     * @return ViewImageUrl <p>图片 URL（http / https）</p>
     */
    public String getViewImageUrl() {
        return this.ViewImageUrl;
    }

    /**
     * Set <p>图片 URL（http / https）</p>
     * @param ViewImageUrl <p>图片 URL（http / https）</p>
     */
    public void setViewImageUrl(String ViewImageUrl) {
        this.ViewImageUrl = ViewImageUrl;
    }

    public ViewImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewImage(ViewImage source) {
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.ViewImageUrl != null) {
            this.ViewImageUrl = new String(source.ViewImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "ViewImageUrl", this.ViewImageUrl);

    }
}

