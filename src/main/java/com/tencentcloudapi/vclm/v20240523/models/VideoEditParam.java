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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEditParam extends AbstractModel {

    /**
    * 魔法词，针对特定场景生效。不同场景传不同的值。默认不传。
- 换人场景：1
    */
    @SerializedName("Magic")
    @Expose
    private String Magic;

    /**
     * Get 魔法词，针对特定场景生效。不同场景传不同的值。默认不传。
- 换人场景：1 
     * @return Magic 魔法词，针对特定场景生效。不同场景传不同的值。默认不传。
- 换人场景：1
     */
    public String getMagic() {
        return this.Magic;
    }

    /**
     * Set 魔法词，针对特定场景生效。不同场景传不同的值。默认不传。
- 换人场景：1
     * @param Magic 魔法词，针对特定场景生效。不同场景传不同的值。默认不传。
- 换人场景：1
     */
    public void setMagic(String Magic) {
        this.Magic = Magic;
    }

    public VideoEditParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEditParam(VideoEditParam source) {
        if (source.Magic != null) {
            this.Magic = new String(source.Magic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Magic", this.Magic);

    }
}

