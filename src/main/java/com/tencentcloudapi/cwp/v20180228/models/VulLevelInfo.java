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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulLevelInfo extends AbstractModel{

    /**
    * // 危害等级：1-低危；2-中危；3-高危；4-严重
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * 数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get // 危害等级：1-低危；2-中危；3-高危；4-严重 
     * @return VulLevel // 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set // 危害等级：1-低危；2-中危；3-高危；4-严重
     * @param VulLevel // 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get 数量 
     * @return Count 数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
     * @param Count 数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public VulLevelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulLevelInfo(VulLevelInfo source) {
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

