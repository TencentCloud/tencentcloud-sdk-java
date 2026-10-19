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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewResourceQuotaRequest extends AbstractModel {

    /**
    * <p>返回视图范围</p><p>默认值：不传该参数时，默认返回完整的资源与配额详情数据</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
     * Get <p>返回视图范围</p><p>默认值：不传该参数时，默认返回完整的资源与配额详情数据</p> 
     * @return Scene <p>返回视图范围</p><p>默认值：不传该参数时，默认返回完整的资源与配额详情数据</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>返回视图范围</p><p>默认值：不传该参数时，默认返回完整的资源与配额详情数据</p>
     * @param Scene <p>返回视图范围</p><p>默认值：不传该参数时，默认返回完整的资源与配额详情数据</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    public DescribeOverviewResourceQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewResourceQuotaRequest(DescribeOverviewResourceQuotaRequest source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

