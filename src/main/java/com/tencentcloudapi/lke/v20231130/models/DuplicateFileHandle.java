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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DuplicateFileHandle extends AbstractModel {

    /**
    * 重复文档判断方式，1：按文档内容，即cos_hash字段判断是否重复
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * 重复文档处理方式，1：返回报错，2：跳过，返回重复的文档业务ID
    */
    @SerializedName("HandleType")
    @Expose
    private Long HandleType;

    /**
     * Get 重复文档判断方式，1：按文档内容，即cos_hash字段判断是否重复 
     * @return CheckType 重复文档判断方式，1：按文档内容，即cos_hash字段判断是否重复
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 重复文档判断方式，1：按文档内容，即cos_hash字段判断是否重复
     * @param CheckType 重复文档判断方式，1：按文档内容，即cos_hash字段判断是否重复
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 重复文档处理方式，1：返回报错，2：跳过，返回重复的文档业务ID 
     * @return HandleType 重复文档处理方式，1：返回报错，2：跳过，返回重复的文档业务ID
     */
    public Long getHandleType() {
        return this.HandleType;
    }

    /**
     * Set 重复文档处理方式，1：返回报错，2：跳过，返回重复的文档业务ID
     * @param HandleType 重复文档处理方式，1：返回报错，2：跳过，返回重复的文档业务ID
     */
    public void setHandleType(Long HandleType) {
        this.HandleType = HandleType;
    }

    public DuplicateFileHandle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplicateFileHandle(DuplicateFileHandle source) {
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.HandleType != null) {
            this.HandleType = new Long(source.HandleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "HandleType", this.HandleType);

    }
}

