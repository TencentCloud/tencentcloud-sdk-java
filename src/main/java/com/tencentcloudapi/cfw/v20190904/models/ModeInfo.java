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

public class ModeInfo extends AbstractModel {

    /**
    * 0-观察模式, 1-拦截模式, 2-严格模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
     * Get 0-观察模式, 1-拦截模式, 2-严格模式 
     * @return Mode 0-观察模式, 1-拦截模式, 2-严格模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0-观察模式, 1-拦截模式, 2-严格模式
     * @param Mode 0-观察模式, 1-拦截模式, 2-严格模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    public ModeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModeInfo(ModeInfo source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

