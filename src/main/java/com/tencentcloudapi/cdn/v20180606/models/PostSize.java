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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostSize extends AbstractModel{

    /**
    * 是调整POST请求限制，平台默认为32MB。
关闭：off，
开启：on。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 最大限制，取值在1MB和200MB之间。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get 是调整POST请求限制，平台默认为32MB。
关闭：off，
开启：on。 
     * @return Switch 是调整POST请求限制，平台默认为32MB。
关闭：off，
开启：on。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是调整POST请求限制，平台默认为32MB。
关闭：off，
开启：on。
     * @param Switch 是调整POST请求限制，平台默认为32MB。
关闭：off，
开启：on。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 最大限制，取值在1MB和200MB之间。 
     * @return MaxSize 最大限制，取值在1MB和200MB之间。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 最大限制，取值在1MB和200MB之间。
     * @param MaxSize 最大限制，取值在1MB和200MB之间。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public PostSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostSize(PostSize source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

