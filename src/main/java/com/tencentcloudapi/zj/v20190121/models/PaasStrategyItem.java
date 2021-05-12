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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaasStrategyItem extends AbstractModel{

    /**
    * 短信模板id或超级短信样例id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 素材类型 0-普短 1-超短
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
     * Get 短信模板id或超级短信样例id 
     * @return Id 短信模板id或超级短信样例id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 短信模板id或超级短信样例id
     * @param Id 短信模板id或超级短信样例id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 素材类型 0-普短 1-超短 
     * @return ContentType 素材类型 0-普短 1-超短
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 素材类型 0-普短 1-超短
     * @param ContentType 素材类型 0-普短 1-超短
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    public PaasStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaasStrategyItem(PaasStrategyItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

