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

public class UploadLogRequest extends AbstractModel{

    /**
    * 主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 根据 hashkey 写入相应范围的主题分区
    */
    @SerializedName("HashKey")
    @Expose
    private String HashKey;

    /**
    * 压缩方法
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get 主题id 
     * @return TopicId 主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题id
     * @param TopicId 主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 根据 hashkey 写入相应范围的主题分区 
     * @return HashKey 根据 hashkey 写入相应范围的主题分区
     */
    public String getHashKey() {
        return this.HashKey;
    }

    /**
     * Set 根据 hashkey 写入相应范围的主题分区
     * @param HashKey 根据 hashkey 写入相应范围的主题分区
     */
    public void setHashKey(String HashKey) {
        this.HashKey = HashKey;
    }

    /**
     * Get 压缩方法 
     * @return CompressType 压缩方法
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set 压缩方法
     * @param CompressType 压缩方法
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    public UploadLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadLogRequest(UploadLogRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.HashKey != null) {
            this.HashKey = new String(source.HashKey);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "HashKey", this.HashKey);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

