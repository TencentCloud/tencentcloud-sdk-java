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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeekCommandInput extends AbstractModel {

    /**
    * 播放位置，单位：毫秒。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
     * Get 播放位置，单位：毫秒。 
     * @return Position 播放位置，单位：毫秒。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 播放位置，单位：毫秒。
     * @param Position 播放位置，单位：毫秒。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    public SeekCommandInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeekCommandInput(SeekCommandInput source) {
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Position", this.Position);

    }
}

