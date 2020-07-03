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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmStreamingsInfoForUpdate extends AbstractModel{

    /**
    * 保护类型为 SimpleAES 的转自适应码流模板 ID。
    */
    @SerializedName("SimpleAesDefinition")
    @Expose
    private Long SimpleAesDefinition;

    /**
     * Get 保护类型为 SimpleAES 的转自适应码流模板 ID。 
     * @return SimpleAesDefinition 保护类型为 SimpleAES 的转自适应码流模板 ID。
     */
    public Long getSimpleAesDefinition() {
        return this.SimpleAesDefinition;
    }

    /**
     * Set 保护类型为 SimpleAES 的转自适应码流模板 ID。
     * @param SimpleAesDefinition 保护类型为 SimpleAES 的转自适应码流模板 ID。
     */
    public void setSimpleAesDefinition(Long SimpleAesDefinition) {
        this.SimpleAesDefinition = SimpleAesDefinition;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SimpleAesDefinition", this.SimpleAesDefinition);

    }
}

