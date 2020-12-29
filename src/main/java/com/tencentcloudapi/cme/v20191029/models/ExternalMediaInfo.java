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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalMediaInfo extends AbstractModel{

    /**
    * 媒资绑定模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 媒资绑定媒体路径或文件 ID。
    */
    @SerializedName("MediaKey")
    @Expose
    private String MediaKey;

    /**
     * Get 媒资绑定模板 ID。 
     * @return Definition 媒资绑定模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 媒资绑定模板 ID。
     * @param Definition 媒资绑定模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 媒资绑定媒体路径或文件 ID。 
     * @return MediaKey 媒资绑定媒体路径或文件 ID。
     */
    public String getMediaKey() {
        return this.MediaKey;
    }

    /**
     * Set 媒资绑定媒体路径或文件 ID。
     * @param MediaKey 媒资绑定媒体路径或文件 ID。
     */
    public void setMediaKey(String MediaKey) {
        this.MediaKey = MediaKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "MediaKey", this.MediaKey);

    }
}

