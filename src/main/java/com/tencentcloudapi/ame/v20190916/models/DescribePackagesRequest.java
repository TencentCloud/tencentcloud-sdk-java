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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackagesRequest extends AbstractModel{

    /**
    * 默认0，Offset=Offset+Length
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 默认20
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
     * Get 默认0，Offset=Offset+Length 
     * @return Offset 默认0，Offset=Offset+Length
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 默认0，Offset=Offset+Length
     * @param Offset 默认0，Offset=Offset+Length
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 默认20 
     * @return Length 默认20
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 默认20
     * @param Length 默认20
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    public DescribePackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackagesRequest(DescribePackagesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

