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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SequenceFlow extends AbstractModel {

    /**
    * 发布序列步骤标签
    */
    @SerializedName("Tags")
    @Expose
    private SequenceTag [] Tags;

    /**
    * 等待时间（秒）
    */
    @SerializedName("SoakTime")
    @Expose
    private Long SoakTime;

    /**
     * Get 发布序列步骤标签 
     * @return Tags 发布序列步骤标签
     */
    public SequenceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 发布序列步骤标签
     * @param Tags 发布序列步骤标签
     */
    public void setTags(SequenceTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 等待时间（秒） 
     * @return SoakTime 等待时间（秒）
     */
    public Long getSoakTime() {
        return this.SoakTime;
    }

    /**
     * Set 等待时间（秒）
     * @param SoakTime 等待时间（秒）
     */
    public void setSoakTime(Long SoakTime) {
        this.SoakTime = SoakTime;
    }

    public SequenceFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SequenceFlow(SequenceFlow source) {
        if (source.Tags != null) {
            this.Tags = new SequenceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new SequenceTag(source.Tags[i]);
            }
        }
        if (source.SoakTime != null) {
            this.SoakTime = new Long(source.SoakTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SoakTime", this.SoakTime);

    }
}

