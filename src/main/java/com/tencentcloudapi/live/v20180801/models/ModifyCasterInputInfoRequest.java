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

public class ModifyCasterInputInfoRequest extends AbstractModel {

    /**
    * <p>导播台ID。</p>
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * <p>修改的导播台输入源信息</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private CasterInputInfo InputInfo;

    /**
     * Get <p>导播台ID。</p> 
     * @return CasterId <p>导播台ID。</p>
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set <p>导播台ID。</p>
     * @param CasterId <p>导播台ID。</p>
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get <p>修改的导播台输入源信息</p> 
     * @return InputInfo <p>修改的导播台输入源信息</p>
     */
    public CasterInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>修改的导播台输入源信息</p>
     * @param InputInfo <p>修改的导播台输入源信息</p>
     */
    public void setInputInfo(CasterInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    public ModifyCasterInputInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCasterInputInfoRequest(ModifyCasterInputInfoRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new CasterInputInfo(source.InputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);

    }
}

