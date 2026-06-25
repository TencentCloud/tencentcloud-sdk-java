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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FallBackItem extends AbstractModel {

    /**
    * <p>默认回退模型列表</p>
    */
    @SerializedName("DefaultFallBackModels")
    @Expose
    private String [] DefaultFallBackModels;

    /**
     * Get <p>默认回退模型列表</p> 
     * @return DefaultFallBackModels <p>默认回退模型列表</p>
     */
    public String [] getDefaultFallBackModels() {
        return this.DefaultFallBackModels;
    }

    /**
     * Set <p>默认回退模型列表</p>
     * @param DefaultFallBackModels <p>默认回退模型列表</p>
     */
    public void setDefaultFallBackModels(String [] DefaultFallBackModels) {
        this.DefaultFallBackModels = DefaultFallBackModels;
    }

    public FallBackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FallBackItem(FallBackItem source) {
        if (source.DefaultFallBackModels != null) {
            this.DefaultFallBackModels = new String[source.DefaultFallBackModels.length];
            for (int i = 0; i < source.DefaultFallBackModels.length; i++) {
                this.DefaultFallBackModels[i] = new String(source.DefaultFallBackModels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DefaultFallBackModels.", this.DefaultFallBackModels);

    }
}

