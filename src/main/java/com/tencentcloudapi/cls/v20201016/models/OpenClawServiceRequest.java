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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenClawServiceRequest extends AbstractModel {

    /**
    * <p>标签类型</p><p>枚举值：</p><ul><li>OpenClaw： OpenClaw类型</li><li>ClawPro： ClawPro类型</li></ul>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get <p>标签类型</p><p>枚举值：</p><ul><li>OpenClaw： OpenClaw类型</li><li>ClawPro： ClawPro类型</li></ul> 
     * @return Tag <p>标签类型</p><p>枚举值：</p><ul><li>OpenClaw： OpenClaw类型</li><li>ClawPro： ClawPro类型</li></ul>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签类型</p><p>枚举值：</p><ul><li>OpenClaw： OpenClaw类型</li><li>ClawPro： ClawPro类型</li></ul>
     * @param Tag <p>标签类型</p><p>枚举值：</p><ul><li>OpenClaw： OpenClaw类型</li><li>ClawPro： ClawPro类型</li></ul>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public OpenClawServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenClawServiceRequest(OpenClawServiceRequest source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

