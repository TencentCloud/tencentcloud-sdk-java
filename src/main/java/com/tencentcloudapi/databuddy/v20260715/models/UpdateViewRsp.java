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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateViewRsp extends AbstractModel {

    /**
    * 更新后的视图信息
    */
    @SerializedName("View")
    @Expose
    private ViewInfo View;

    /**
     * Get 更新后的视图信息 
     * @return View 更新后的视图信息
     */
    public ViewInfo getView() {
        return this.View;
    }

    /**
     * Set 更新后的视图信息
     * @param View 更新后的视图信息
     */
    public void setView(ViewInfo View) {
        this.View = View;
    }

    public UpdateViewRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateViewRsp(UpdateViewRsp source) {
        if (source.View != null) {
            this.View = new ViewInfo(source.View);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "View.", this.View);

    }
}

