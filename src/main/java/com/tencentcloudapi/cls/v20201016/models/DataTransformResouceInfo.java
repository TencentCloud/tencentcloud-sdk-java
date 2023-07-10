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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTransformResouceInfo extends AbstractModel{

    /**
    * 目标主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 目标主题id 
     * @return TopicId 目标主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 目标主题id
     * @param TopicId 目标主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 别名 
     * @return Alias 别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 别名
     * @param Alias 别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public DataTransformResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformResouceInfo(DataTransformResouceInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

