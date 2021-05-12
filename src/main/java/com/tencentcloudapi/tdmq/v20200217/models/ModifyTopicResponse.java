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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTopicResponse extends AbstractModel{

    /**
    * 分区数
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 备注，128字符以内。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分区数 
     * @return Partitions 分区数
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区数
     * @param Partitions 分区数
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 备注，128字符以内。 
     * @return Remark 备注，128字符以内。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，128字符以内。
     * @param Remark 备注，128字符以内。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyTopicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicResponse(ModifyTopicResponse source) {
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

