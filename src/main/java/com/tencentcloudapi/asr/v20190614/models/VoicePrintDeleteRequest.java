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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintDeleteRequest extends AbstractModel {

    /**
    * 说话人id，说话人唯一标识
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 说话人分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 删除模式: 
0.默认值，删除该条声纹
1.从分组中删除该条声纹，声纹本身不删除
2.从声纹库中删除分组，仅删除分组信息，不会真正删除分组中的声纹
    */
    @SerializedName("DelMod")
    @Expose
    private Long DelMod;

    /**
     * Get 说话人id，说话人唯一标识 
     * @return VoicePrintId 说话人id，说话人唯一标识
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 说话人id，说话人唯一标识
     * @param VoicePrintId 说话人id，说话人唯一标识
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 说话人分组ID,仅支持大小写字母和下划线的组合，不超过128个字符 
     * @return GroupId 说话人分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 说话人分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
     * @param GroupId 说话人分组ID,仅支持大小写字母和下划线的组合，不超过128个字符
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 删除模式: 
0.默认值，删除该条声纹
1.从分组中删除该条声纹，声纹本身不删除
2.从声纹库中删除分组，仅删除分组信息，不会真正删除分组中的声纹 
     * @return DelMod 删除模式: 
0.默认值，删除该条声纹
1.从分组中删除该条声纹，声纹本身不删除
2.从声纹库中删除分组，仅删除分组信息，不会真正删除分组中的声纹
     */
    public Long getDelMod() {
        return this.DelMod;
    }

    /**
     * Set 删除模式: 
0.默认值，删除该条声纹
1.从分组中删除该条声纹，声纹本身不删除
2.从声纹库中删除分组，仅删除分组信息，不会真正删除分组中的声纹
     * @param DelMod 删除模式: 
0.默认值，删除该条声纹
1.从分组中删除该条声纹，声纹本身不删除
2.从声纹库中删除分组，仅删除分组信息，不会真正删除分组中的声纹
     */
    public void setDelMod(Long DelMod) {
        this.DelMod = DelMod;
    }

    public VoicePrintDeleteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintDeleteRequest(VoicePrintDeleteRequest source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DelMod != null) {
            this.DelMod = new Long(source.DelMod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DelMod", this.DelMod);

    }
}

