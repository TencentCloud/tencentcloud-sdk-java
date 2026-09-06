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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralOutputOption extends AbstractModel {

    /**
    * <p>输出类型。默认url</p><p>枚举值：</p><ul><li>url： 临时链接，有效期24小时</li><li>cos： 指定cos桶和路径</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>自定义cos信息</p>
    */
    @SerializedName("CosInfo")
    @Expose
    private CloneViralCosInfo CosInfo;

    /**
     * Get <p>输出类型。默认url</p><p>枚举值：</p><ul><li>url： 临时链接，有效期24小时</li><li>cos： 指定cos桶和路径</li></ul> 
     * @return Type <p>输出类型。默认url</p><p>枚举值：</p><ul><li>url： 临时链接，有效期24小时</li><li>cos： 指定cos桶和路径</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输出类型。默认url</p><p>枚举值：</p><ul><li>url： 临时链接，有效期24小时</li><li>cos： 指定cos桶和路径</li></ul>
     * @param Type <p>输出类型。默认url</p><p>枚举值：</p><ul><li>url： 临时链接，有效期24小时</li><li>cos： 指定cos桶和路径</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>自定义cos信息</p> 
     * @return CosInfo <p>自定义cos信息</p>
     */
    public CloneViralCosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set <p>自定义cos信息</p>
     * @param CosInfo <p>自定义cos信息</p>
     */
    public void setCosInfo(CloneViralCosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    public CloneViralOutputOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralOutputOption(CloneViralOutputOption source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new CloneViralCosInfo(source.CosInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);

    }
}

