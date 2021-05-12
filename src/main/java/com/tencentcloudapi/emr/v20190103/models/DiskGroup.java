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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskGroup extends AbstractModel{

    /**
    * 磁盘规格。
    */
    @SerializedName("Spec")
    @Expose
    private DiskSpec Spec;

    /**
    * 同类型磁盘数量。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 磁盘规格。 
     * @return Spec 磁盘规格。
     */
    public DiskSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set 磁盘规格。
     * @param Spec 磁盘规格。
     */
    public void setSpec(DiskSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 同类型磁盘数量。 
     * @return Count 同类型磁盘数量。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 同类型磁盘数量。
     * @param Count 同类型磁盘数量。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DiskGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskGroup(DiskGroup source) {
        if (source.Spec != null) {
            this.Spec = new DiskSpec(source.Spec);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

