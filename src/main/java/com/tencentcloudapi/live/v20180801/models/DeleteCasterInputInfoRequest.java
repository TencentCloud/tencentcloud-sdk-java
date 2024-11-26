/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DeleteCasterInputInfoRequest extends AbstractModel {

    /**
    * 导播台ID
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 导播台输入Index。
范围[0,20]
注：该Index对应的输入源需存在。
    */
    @SerializedName("InputIndex")
    @Expose
    private Long InputIndex;

    /**
     * Get 导播台ID 
     * @return CasterId 导播台ID
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 导播台ID
     * @param CasterId 导播台ID
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 导播台输入Index。
范围[0,20]
注：该Index对应的输入源需存在。 
     * @return InputIndex 导播台输入Index。
范围[0,20]
注：该Index对应的输入源需存在。
     */
    public Long getInputIndex() {
        return this.InputIndex;
    }

    /**
     * Set 导播台输入Index。
范围[0,20]
注：该Index对应的输入源需存在。
     * @param InputIndex 导播台输入Index。
范围[0,20]
注：该Index对应的输入源需存在。
     */
    public void setInputIndex(Long InputIndex) {
        this.InputIndex = InputIndex;
    }

    public DeleteCasterInputInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCasterInputInfoRequest(DeleteCasterInputInfoRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.InputIndex != null) {
            this.InputIndex = new Long(source.InputIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "InputIndex", this.InputIndex);

    }
}

