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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneVideoOutputInfo extends AbstractModel {

    /**
    * <p>输出信息。</p>
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * <p>输出类型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>输出信息。</p> 
     * @return Info <p>输出信息。</p>
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set <p>输出信息。</p>
     * @param Info <p>输出信息。</p>
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get <p>输出类型。</p> 
     * @return Type <p>输出类型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输出类型。</p>
     * @param Type <p>输出类型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SceneVideoOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneVideoOutputInfo(SceneVideoOutputInfo source) {
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

