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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintCountRequest extends AbstractModel {

    /**
    * 分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 统计模式
0: 统计所有声纹数量
1: 统计指定分组下的声纹数量
    */
    @SerializedName("CountMod")
    @Expose
    private Long CountMod;

    /**
     * Get 分组ID,仅支持大小写字母和下划线的组合，不超过128个字符 
     * @return GroupId 分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
     * @param GroupId 分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 统计模式
0: 统计所有声纹数量
1: 统计指定分组下的声纹数量 
     * @return CountMod 统计模式
0: 统计所有声纹数量
1: 统计指定分组下的声纹数量
     */
    public Long getCountMod() {
        return this.CountMod;
    }

    /**
     * Set 统计模式
0: 统计所有声纹数量
1: 统计指定分组下的声纹数量
     * @param CountMod 统计模式
0: 统计所有声纹数量
1: 统计指定分组下的声纹数量
     */
    public void setCountMod(Long CountMod) {
        this.CountMod = CountMod;
    }

    public VoicePrintCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintCountRequest(VoicePrintCountRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.CountMod != null) {
            this.CountMod = new Long(source.CountMod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "CountMod", this.CountMod);

    }
}

