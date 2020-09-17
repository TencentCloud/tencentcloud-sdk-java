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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MuxInfo extends AbstractModel{

    /**
    * 删除流，可选项：video,audio。
    */
    @SerializedName("DeleteStream")
    @Expose
    private String DeleteStream;

    /**
     * Get 删除流，可选项：video,audio。 
     * @return DeleteStream 删除流，可选项：video,audio。
     */
    public String getDeleteStream() {
        return this.DeleteStream;
    }

    /**
     * Set 删除流，可选项：video,audio。
     * @param DeleteStream 删除流，可选项：video,audio。
     */
    public void setDeleteStream(String DeleteStream) {
        this.DeleteStream = DeleteStream;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteStream", this.DeleteStream);

    }
}

