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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyCasterRequest extends AbstractModel {

    /**
    * 源导播台的ID
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 复制产生的新导播台名称
    */
    @SerializedName("CasterName")
    @Expose
    private String CasterName;

    /**
    * 复制产生的导播台推送到云直播的流id
注意：该流id不能与云直播中的流id重复
    */
    @SerializedName("OutputStreamId")
    @Expose
    private String OutputStreamId;

    /**
     * Get 源导播台的ID 
     * @return CasterId 源导播台的ID
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 源导播台的ID
     * @param CasterId 源导播台的ID
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 复制产生的新导播台名称 
     * @return CasterName 复制产生的新导播台名称
     */
    public String getCasterName() {
        return this.CasterName;
    }

    /**
     * Set 复制产生的新导播台名称
     * @param CasterName 复制产生的新导播台名称
     */
    public void setCasterName(String CasterName) {
        this.CasterName = CasterName;
    }

    /**
     * Get 复制产生的导播台推送到云直播的流id
注意：该流id不能与云直播中的流id重复 
     * @return OutputStreamId 复制产生的导播台推送到云直播的流id
注意：该流id不能与云直播中的流id重复
     */
    public String getOutputStreamId() {
        return this.OutputStreamId;
    }

    /**
     * Set 复制产生的导播台推送到云直播的流id
注意：该流id不能与云直播中的流id重复
     * @param OutputStreamId 复制产生的导播台推送到云直播的流id
注意：该流id不能与云直播中的流id重复
     */
    public void setOutputStreamId(String OutputStreamId) {
        this.OutputStreamId = OutputStreamId;
    }

    public CopyCasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyCasterRequest(CopyCasterRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.CasterName != null) {
            this.CasterName = new String(source.CasterName);
        }
        if (source.OutputStreamId != null) {
            this.OutputStreamId = new String(source.OutputStreamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "CasterName", this.CasterName);
        this.setParamSimple(map, prefix + "OutputStreamId", this.OutputStreamId);

    }
}

